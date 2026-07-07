package Q;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n.C0438a;
import n.C0439b;
import z.C0632e;
import z.CallableC0631d;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1526l;

    /* renamed from: m, reason: collision with root package name */
    public Object f1527m;

    /* renamed from: n, reason: collision with root package name */
    public Object f1528n;

    /* renamed from: o, reason: collision with root package name */
    public Object f1529o;

    public /* synthetic */ h() {
        this.f1526l = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i4;
        int i5;
        switch (this.f1526l) {
            case 0:
                k kVar = (k) this.f1529o;
                Iterator it = ((C0439b) ((t) kVar.f1533d).f1574p.keySet()).iterator();
                while (true) {
                    C0438a c0438a = (C0438a) it;
                    if (!c0438a.hasNext()) {
                        return;
                    }
                    IBinder iBinder = (IBinder) c0438a.next();
                    t tVar = (t) kVar.f1533d;
                    f fVar = (f) tVar.f1574p.get(iBinder);
                    HashMap hashMap = fVar.f1521e;
                    String str = (String) this.f1527m;
                    List<B.b> list = (List) hashMap.get(str);
                    if (list != null) {
                        for (B.b bVar : list) {
                            Bundle bundle = (Bundle) bVar.f83b;
                            Bundle bundle2 = (Bundle) this.f1528n;
                            int i6 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
                            int i7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                            int i8 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i9 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            int i10 = Integer.MAX_VALUE;
                            int i11 = 0;
                            if (i6 == -1 || i8 == -1) {
                                i4 = Integer.MAX_VALUE;
                                i5 = 0;
                            } else {
                                i5 = i6 * i8;
                                i4 = (i8 + i5) - 1;
                            }
                            if (i7 != -1 && i9 != -1) {
                                i11 = i9 * i7;
                                i10 = (i9 + i11) - 1;
                            }
                            if (i4 >= i11 && i10 >= i5) {
                                tVar.e(str, fVar, (Bundle) bVar.f83b, bundle2);
                            }
                        }
                    }
                }
                break;
            case 1:
                synchronized (v2.m.f8703q) {
                    v2.m.a((v2.m) this.f1529o, (v2.f) this.f1527m);
                }
                ((K2.k) this.f1528n).b(null);
                return;
            default:
                try {
                    obj = ((CallableC0631d) this.f1527m).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f1529o).post(new N1.q((C0632e) this.f1528n, obj, 11, false));
                return;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i4) {
        this.f1526l = i4;
        this.f1529o = obj;
        this.f1527m = obj2;
        this.f1528n = obj3;
    }
}
