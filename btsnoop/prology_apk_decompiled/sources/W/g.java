package W;

import i1.C0341a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2656l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2657m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2658n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2659o;

    public /* synthetic */ g(Object obj, int i4, Object obj2, int i5) {
        this.f2656l = i5;
        this.f2658n = obj;
        this.f2657m = i4;
        this.f2659o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2656l) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f2658n).iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (!jVar.f2663d) {
                        int i4 = this.f2657m;
                        if (i4 != -1) {
                            jVar.f2661b.a(i4);
                        }
                        jVar.f2662c = true;
                        ((h) this.f2659o).b(jVar.f2660a);
                    }
                }
                return;
            default:
                ((C0341a) this.f2658n).f6169b.i(this.f2657m, (Serializable) this.f2659o);
                return;
        }
    }
}
