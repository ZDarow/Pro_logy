package q0;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0469a {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7808l = new ArrayList(1);

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f7809m = new HashSet(1);

    /* renamed from: n, reason: collision with root package name */
    public final f0.e f7810n;

    /* renamed from: o, reason: collision with root package name */
    public final f0.e f7811o;

    /* renamed from: p, reason: collision with root package name */
    public Looper f7812p;

    /* renamed from: q, reason: collision with root package name */
    public T.U f7813q;

    /* renamed from: r, reason: collision with root package name */
    public b0.l f7814r;

    public AbstractC0469a() {
        int i4 = 0;
        F f4 = null;
        this.f7810n = new f0.e(new CopyOnWriteArrayList(), i4, f4);
        this.f7811o = new f0.e(new CopyOnWriteArrayList(), i4, f4);
    }

    public final f0.e a(F f4) {
        return new f0.e(this.f7810n.f5456c, 0, f4);
    }

    public abstract InterfaceC0467D b(F f4, u0.e eVar, long j4);

    public final void c(G g4) {
        HashSet hashSet = this.f7809m;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(g4);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public void d() {
    }

    public final void e(G g4) {
        this.f7812p.getClass();
        HashSet hashSet = this.f7809m;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(g4);
        if (isEmpty) {
            f();
        }
    }

    public void f() {
    }

    public T.U g() {
        return null;
    }

    public abstract T.B h();

    public boolean i() {
        return !(this instanceof r);
    }

    public abstract void j();

    public final void l(G g4, Y.C c4, b0.l lVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f7812p;
        W.a.e(looper == null || looper == myLooper);
        this.f7814r = lVar;
        T.U u4 = this.f7813q;
        this.f7808l.add(g4);
        if (this.f7812p == null) {
            this.f7812p = myLooper;
            this.f7809m.add(g4);
            m(c4);
        } else if (u4 != null) {
            e(g4);
            g4.a(this, u4);
        }
    }

    public abstract void m(Y.C c4);

    public final void n(T.U u4) {
        this.f7813q = u4;
        Iterator it = this.f7808l.iterator();
        while (it.hasNext()) {
            ((G) it.next()).a(this, u4);
        }
    }

    public abstract void o(InterfaceC0467D interfaceC0467D);

    public final void p(G g4) {
        ArrayList arrayList = this.f7808l;
        arrayList.remove(g4);
        if (!arrayList.isEmpty()) {
            c(g4);
            return;
        }
        this.f7812p = null;
        this.f7813q = null;
        this.f7814r = null;
        this.f7809m.clear();
        r();
    }

    public abstract void r();

    public final void s(f0.f fVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7811o.f5456c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f0.d dVar = (f0.d) it.next();
            if (dVar.f5453a == fVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void t(J j4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7810n.f5456c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            if (i4.f7679b == j4) {
                copyOnWriteArrayList.remove(i4);
            }
        }
    }

    public void u(T.B b4) {
    }
}
