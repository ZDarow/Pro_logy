package a0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import q0.AbstractC0469a;
import q0.C0465B;
import q0.C0492y;
import q0.InterfaceC0467D;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.l f3434a;

    /* renamed from: e, reason: collision with root package name */
    public final N f3438e;

    /* renamed from: h, reason: collision with root package name */
    public final b0.e f3441h;

    /* renamed from: i, reason: collision with root package name */
    public final W.v f3442i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3444k;

    /* renamed from: l, reason: collision with root package name */
    public Y.C f3445l;

    /* renamed from: j, reason: collision with root package name */
    public q0.d0 f3443j = new q0.d0();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f3436c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3437d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3435b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3439f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f3440g = new HashSet();

    public e0(N n4, b0.e eVar, W.v vVar, b0.l lVar) {
        this.f3434a = lVar;
        this.f3438e = n4;
        this.f3441h = eVar;
        this.f3442i = vVar;
    }

    public final T.U a(int i4, ArrayList arrayList, q0.d0 d0Var) {
        if (!arrayList.isEmpty()) {
            this.f3443j = d0Var;
            for (int i5 = i4; i5 < arrayList.size() + i4; i5++) {
                d0 d0Var2 = (d0) arrayList.get(i5 - i4);
                ArrayList arrayList2 = this.f3435b;
                if (i5 > 0) {
                    d0 d0Var3 = (d0) arrayList2.get(i5 - 1);
                    d0Var2.f3417d = d0Var3.f3414a.f7667z.f7923b.o() + d0Var3.f3417d;
                    d0Var2.f3418e = false;
                    d0Var2.f3416c.clear();
                } else {
                    d0Var2.f3417d = 0;
                    d0Var2.f3418e = false;
                    d0Var2.f3416c.clear();
                }
                int o2 = d0Var2.f3414a.f7667z.f7923b.o();
                for (int i6 = i5; i6 < arrayList2.size(); i6++) {
                    ((d0) arrayList2.get(i6)).f3417d += o2;
                }
                arrayList2.add(i5, d0Var2);
                this.f3437d.put(d0Var2.f3415b, d0Var2);
                if (this.f3444k) {
                    e(d0Var2);
                    if (this.f3436c.isEmpty()) {
                        this.f3440g.add(d0Var2);
                    } else {
                        c0 c0Var = (c0) this.f3439f.get(d0Var2);
                        if (c0Var != null) {
                            c0Var.f3403a.c(c0Var.f3404b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final T.U b() {
        ArrayList arrayList = this.f3435b;
        if (arrayList.isEmpty()) {
            return T.U.f2168a;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            d0 d0Var = (d0) arrayList.get(i5);
            d0Var.f3417d = i4;
            i4 += d0Var.f3414a.f7667z.f7923b.o();
        }
        return new k0(arrayList, this.f3443j);
    }

    public final void c() {
        Iterator it = this.f3440g.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            if (d0Var.f3416c.isEmpty()) {
                c0 c0Var = (c0) this.f3439f.get(d0Var);
                if (c0Var != null) {
                    c0Var.f3403a.c(c0Var.f3404b);
                }
                it.remove();
            }
        }
    }

    public final void d(d0 d0Var) {
        if (d0Var.f3418e && d0Var.f3416c.isEmpty()) {
            c0 c0Var = (c0) this.f3439f.remove(d0Var);
            c0Var.getClass();
            Y y4 = c0Var.f3404b;
            AbstractC0469a abstractC0469a = c0Var.f3403a;
            abstractC0469a.p(y4);
            Y.x xVar = c0Var.f3405c;
            abstractC0469a.t(xVar);
            abstractC0469a.s(xVar);
            this.f3440g.remove(d0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a0.Y, q0.G] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, f0.d] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, q0.I] */
    public final void e(d0 d0Var) {
        C0465B c0465b = d0Var.f3414a;
        ?? r12 = new q0.G() { // from class: a0.Y
            @Override // q0.G
            public final void a(AbstractC0469a abstractC0469a, T.U u4) {
                W.v vVar = e0.this.f3438e.s;
                vVar.d(2);
                vVar.e(22);
            }
        };
        Y.x xVar = new Y.x(this, d0Var, 5, false);
        this.f3439f.put(d0Var, new c0(c0465b, r12, xVar));
        int i4 = W.y.f2709a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0465b.getClass();
        f0.e eVar = c0465b.f7810n;
        eVar.getClass();
        ?? obj = new Object();
        obj.f7678a = handler;
        obj.f7679b = xVar;
        eVar.f5456c.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        f0.e eVar2 = c0465b.f7811o;
        eVar2.getClass();
        ?? obj2 = new Object();
        obj2.f5453a = xVar;
        eVar2.f5456c.add(obj2);
        c0465b.l(r12, this.f3445l, this.f3434a);
    }

    public final void f(InterfaceC0467D interfaceC0467D) {
        IdentityHashMap identityHashMap = this.f3436c;
        d0 d0Var = (d0) identityHashMap.remove(interfaceC0467D);
        d0Var.getClass();
        d0Var.f3414a.o(interfaceC0467D);
        d0Var.f3416c.remove(((C0492y) interfaceC0467D).f7931l);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(d0Var);
    }

    public final void g(int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            ArrayList arrayList = this.f3435b;
            d0 d0Var = (d0) arrayList.remove(i6);
            this.f3437d.remove(d0Var.f3415b);
            int i7 = -d0Var.f3414a.f7667z.f7923b.o();
            for (int i8 = i6; i8 < arrayList.size(); i8++) {
                ((d0) arrayList.get(i8)).f3417d += i7;
            }
            d0Var.f3418e = true;
            if (this.f3444k) {
                d(d0Var);
            }
        }
    }
}
