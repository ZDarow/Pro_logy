package Q;

import B2.AbstractC0007h;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import c.C0200d;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s2.C0551h;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K2.o f1563m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f1564n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f1565o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1566p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K2.o f1567q;

    public /* synthetic */ r(K2.o oVar, K2.o oVar2, String str, Bundle bundle, C0200d c0200d, int i4) {
        this.f1562l = i4;
        this.f1567q = oVar;
        this.f1563m = oVar2;
        this.f1564n = str;
        this.f1565o = bundle;
        this.f1566p = c0200d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1562l) {
            case 0:
                IBinder binder = ((Messenger) this.f1563m.f1009m).getBinder();
                K2.o oVar = this.f1567q;
                f fVar = (f) ((t) oVar.f1009m).f1574p.get(binder);
                String str = this.f1564n;
                if (fVar == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                    return;
                }
                ((t) oVar.f1009m).getClass();
                e eVar = new e(str, (C0200d) this.f1566p, 1);
                if (AudioService.f4783L == null) {
                    eVar.e(new ArrayList());
                } else {
                    if (s2.k.f8253t != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("query", str);
                        hashMap.put("extras", s2.k.k(this.f1565o));
                        s2.k.f8253t.a("search", hashMap, new C0551h(eVar, 2));
                    }
                    eVar.a();
                }
                if (!eVar.b()) {
                    throw new IllegalStateException(AbstractC0007h.l("onSearch must call detach() or sendResult() before returning for query=", str));
                }
                return;
            case 1:
                IBinder binder2 = ((Messenger) this.f1563m.f1009m).getBinder();
                K2.o oVar2 = this.f1567q;
                if (((f) ((t) oVar2.f1009m).f1574p.get(binder2)) != null) {
                    ((t) oVar2.f1009m).getClass();
                    ((C0200d) this.f1566p).e(-1, null);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f1564n + ", extras=" + this.f1565o);
                return;
            default:
                IBinder binder3 = ((Messenger) this.f1563m.f1009m).getBinder();
                K2.o oVar3 = this.f1567q;
                f fVar2 = (f) ((t) oVar3.f1009m).f1574p.get(binder3);
                String str2 = this.f1564n;
                if (fVar2 == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str2);
                    return;
                }
                t tVar = (t) oVar3.f1009m;
                tVar.getClass();
                HashMap hashMap2 = fVar2.f1521e;
                List list = (List) hashMap2.get(str2);
                if (list == null) {
                    list = new ArrayList();
                }
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    IBinder iBinder = (IBinder) this.f1566p;
                    Bundle bundle = this.f1565o;
                    if (!hasNext) {
                        list.add(new B.b(iBinder, bundle));
                        hashMap2.put(str2, list);
                        tVar.e(str2, fVar2, bundle, null);
                        return;
                    }
                    B.b bVar = (B.b) it.next();
                    if (iBinder == bVar.f82a) {
                        Bundle bundle2 = (Bundle) bVar.f83b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    public r(K2.o oVar, K2.o oVar2, String str, IBinder iBinder, Bundle bundle) {
        this.f1562l = 2;
        this.f1567q = oVar;
        this.f1563m = oVar2;
        this.f1564n = str;
        this.f1566p = iBinder;
        this.f1565o = bundle;
    }
}
