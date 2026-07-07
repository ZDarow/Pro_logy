package Q;

import B2.AbstractC0007h;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import c.C0200d;
import f2.Y;
import i.C0324e;
import i.MenuC0328i;
import i.MenuItemC0329j;
import i.ViewOnKeyListenerC0325f;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v2.AbstractC0589a;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1555o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1556p;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f1552l = i4;
        this.f1555o = obj;
        this.f1553m = obj2;
        this.f1554n = obj3;
        this.f1556p = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1552l) {
            case 0:
                IBinder binder = ((Messenger) ((K2.o) this.f1553m).f1009m).getBinder();
                K2.o oVar = (K2.o) this.f1555o;
                f fVar = (f) ((t) oVar.f1009m).f1574p.get(binder);
                String str = (String) this.f1554n;
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    return;
                }
                ((t) oVar.f1009m).getClass();
                HashMap hashMap = fVar.f1521e;
                IBinder iBinder = (IBinder) this.f1556p;
                boolean z4 = false;
                if (iBinder != null) {
                    List list = (List) hashMap.get(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (iBinder == ((B.b) it.next()).f82a) {
                                it.remove();
                                z4 = true;
                            }
                        }
                        if (list.size() == 0) {
                            hashMap.remove(str);
                        }
                    }
                } else if (hashMap.remove(str) != null) {
                    z4 = true;
                }
                if (z4) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                return;
            case 1:
                IBinder binder2 = ((Messenger) ((K2.o) this.f1553m).f1009m).getBinder();
                K2.o oVar2 = (K2.o) this.f1555o;
                f fVar2 = (f) ((t) oVar2.f1009m).f1574p.get(binder2);
                String str2 = (String) this.f1554n;
                if (fVar2 == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str2);
                    return;
                } else {
                    t tVar = (t) oVar2.f1009m;
                    tVar.getClass();
                    e eVar = new e(str2, (C0200d) this.f1556p, 0);
                    tVar.d(str2, eVar);
                    if (!eVar.b()) {
                        throw new IllegalStateException(AbstractC0007h.l("onLoadItem must call detach() or sendResult() before returning for id=", str2));
                    }
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0324e c0324e = (C0324e) this.f1553m;
                if (c0324e != null) {
                    Y y4 = (Y) this.f1555o;
                    ((ViewOnKeyListenerC0325f) y4.f5535m).f6029K = true;
                    c0324e.f6018b.c(false);
                    ((ViewOnKeyListenerC0325f) y4.f5535m).f6029K = false;
                }
                MenuItemC0329j menuItemC0329j = (MenuItemC0329j) this.f1554n;
                if (menuItemC0329j.isEnabled() && menuItemC0329j.hasSubMenu()) {
                    ((MenuC0328i) this.f1556p).p(menuItemC0329j, null, 4);
                    return;
                }
                return;
            default:
                synchronized (v2.m.f8703q) {
                    v2.f fVar3 = (v2.f) this.f1553m;
                    if (fVar3 != null) {
                        v2.m.a((v2.m) this.f1555o, fVar3);
                    }
                    try {
                        if (AbstractC0589a.b(v2.m.f8704r)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f1554n));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f1554n));
                    } catch (Exception e4) {
                        Log.e("Sqflite", "error " + e4 + " while closing database " + v2.m.f8707v);
                    }
                }
                ((K2.k) this.f1556p).b(null);
                return;
        }
    }
}
