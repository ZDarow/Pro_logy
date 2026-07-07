package q0;

import I.C0044m;
import T.C0098t;
import T.C0099u;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import a0.AbstractC0121a;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class r extends AbstractC0478j {

    /* renamed from: G, reason: collision with root package name */
    public static final T.B f7901G;

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f7902A;

    /* renamed from: B, reason: collision with root package name */
    public final HashSet f7903B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f7904C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7905D;

    /* renamed from: E, reason: collision with root package name */
    public HashSet f7906E;

    /* renamed from: F, reason: collision with root package name */
    public d0 f7907F;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f7908v;
    public final HashSet w;

    /* renamed from: x, reason: collision with root package name */
    public Handler f7909x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f7910y;

    /* renamed from: z, reason: collision with root package name */
    public final IdentityHashMap f7911z;

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    static {
        C0098t c0098t = new C0098t();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        List emptyList = Collections.emptyList();
        f2.c0 c0Var2 = f2.c0.f5550p;
        C0101w c0101w = new C0101w();
        C0104z c0104z = C0104z.f2370a;
        Uri uri = Uri.EMPTY;
        f7901G = new T.B("", new C0099u(c0098t), uri != null ? new C0103y(uri, null, null, emptyList, c0Var2, null, -9223372036854775807L) : null, new C0102x(c0101w), T.E.f2095y, c0104z);
    }

    public r(boolean z4, d0 d0Var, AbstractC0469a... abstractC0469aArr) {
        for (AbstractC0469a abstractC0469a : abstractC0469aArr) {
            abstractC0469a.getClass();
        }
        this.f7907F = d0Var.f7826b.length > 0 ? d0Var.a() : d0Var;
        this.f7911z = new IdentityHashMap();
        this.f7902A = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f7908v = arrayList;
        this.f7910y = new ArrayList();
        this.f7906E = new HashSet();
        this.w = new HashSet();
        this.f7903B = new HashSet();
        this.f7904C = z4;
        List asList = Arrays.asList(abstractC0469aArr);
        synchronized (this) {
            D(arrayList.size(), asList, null, null);
        }
    }

    public final synchronized void B(int i4, ArrayList arrayList, Handler handler, X2.p pVar) {
        D(i4, arrayList, handler, pVar);
    }

    public final void C(int i4, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0484p c0484p = (C0484p) it.next();
            int i5 = i4 + 1;
            ArrayList arrayList = this.f7910y;
            if (i4 > 0) {
                C0484p c0484p2 = (C0484p) arrayList.get(i4 - 1);
                int o2 = c0484p2.f7892a.f7667z.f7923b.o() + c0484p2.f7896e;
                c0484p.f7895d = i4;
                c0484p.f7896e = o2;
                c0484p.f7897f = false;
                c0484p.f7894c.clear();
            } else {
                c0484p.f7895d = i4;
                c0484p.f7896e = 0;
                c0484p.f7897f = false;
                c0484p.f7894c.clear();
            }
            E(i4, 1, c0484p.f7892a.f7667z.f7923b.o());
            arrayList.add(i4, c0484p);
            this.f7902A.put(c0484p.f7893b, c0484p);
            A(c0484p, c0484p.f7892a);
            if (this.f7809m.isEmpty() || !this.f7911z.isEmpty()) {
                C0477i c0477i = (C0477i) this.s.get(c0484p);
                c0477i.getClass();
                c0477i.f7864a.c(c0477i.f7865b);
            } else {
                this.f7903B.add(c0484p);
            }
            i4 = i5;
        }
    }

    public final void D(int i4, List list, Handler handler, X2.p pVar) {
        W.a.e((handler == null) == (pVar == null));
        Handler handler2 = this.f7909x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0469a) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0484p((AbstractC0469a) it2.next(), this.f7904C));
        }
        this.f7908v.addAll(i4, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(1, new C0485q(i4, arrayList, F(handler, pVar))).sendToTarget();
        } else {
            if (pVar == null || handler == null) {
                return;
            }
            handler.post(pVar);
        }
    }

    public final void E(int i4, int i5, int i6) {
        while (true) {
            ArrayList arrayList = this.f7910y;
            if (i4 >= arrayList.size()) {
                return;
            }
            C0484p c0484p = (C0484p) arrayList.get(i4);
            c0484p.f7895d += i5;
            c0484p.f7896e += i6;
            i4++;
        }
    }

    public final C0483o F(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0483o c0483o = new C0483o(handler, runnable);
        this.w.add(c0483o);
        return c0483o;
    }

    public final void G() {
        Iterator it = this.f7903B.iterator();
        while (it.hasNext()) {
            C0484p c0484p = (C0484p) it.next();
            if (c0484p.f7894c.isEmpty()) {
                C0477i c0477i = (C0477i) this.s.get(c0484p);
                c0477i.getClass();
                c0477i.f7864a.c(c0477i.f7865b);
                it.remove();
            }
        }
    }

    public final synchronized void H(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C0483o c0483o = (C0483o) it.next();
                c0483o.f7890a.post(c0483o.f7891b);
            }
            this.w.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void I(int i4, int i5, Handler handler, X2.p pVar) {
        W.a.e(handler != null);
        Handler handler2 = this.f7909x;
        ArrayList arrayList = this.f7908v;
        arrayList.add(i5, (C0484p) arrayList.remove(i4));
        if (handler2 != null) {
            handler2.obtainMessage(3, new C0485q(i4, Integer.valueOf(i5), F(handler, pVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(pVar);
        }
    }

    public final synchronized void J(int i4, int i5, Handler handler, X2.p pVar) {
        W.a.e(handler != null);
        Handler handler2 = this.f7909x;
        W.y.R(this.f7908v, i4, i5);
        if (handler2 != null) {
            handler2.obtainMessage(2, new C0485q(i4, Integer.valueOf(i5), F(handler, pVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(pVar);
        }
    }

    public final void K(C0483o c0483o) {
        if (!this.f7905D) {
            Handler handler = this.f7909x;
            handler.getClass();
            handler.obtainMessage(5).sendToTarget();
            this.f7905D = true;
        }
        if (c0483o != null) {
            this.f7906E.add(c0483o);
        }
    }

    public final void L(d0 d0Var) {
        int size;
        Handler handler = this.f7909x;
        if (handler == null) {
            if (d0Var.f7826b.length > 0) {
                d0Var = d0Var.a();
            }
            this.f7907F = d0Var;
        } else {
            synchronized (this) {
                size = this.f7908v.size();
            }
            if (d0Var.f7826b.length != size) {
                d0Var = d0Var.a().b(0, size);
            }
            handler.obtainMessage(4, new C0485q(0, d0Var, null)).sendToTarget();
        }
    }

    public final synchronized void M(d0 d0Var) {
        L(d0Var);
    }

    public final void N() {
        this.f7905D = false;
        HashSet hashSet = this.f7906E;
        this.f7906E = new HashSet();
        n(new C0481m(this.f7910y, this.f7907F));
        Handler handler = this.f7909x;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        int i4 = AbstractC0121a.f3383d;
        Pair pair = (Pair) f4.f7668a;
        Object obj = pair.first;
        F a4 = f4.a(pair.second);
        C0484p c0484p = (C0484p) this.f7902A.get(obj);
        if (c0484p == null) {
            c0484p = new C0484p(new AbstractC0469a(), this.f7904C);
            c0484p.f7897f = true;
            A(c0484p, c0484p.f7892a);
        }
        this.f7903B.add(c0484p);
        C0477i c0477i = (C0477i) this.s.get(c0484p);
        c0477i.getClass();
        c0477i.f7864a.e(c0477i.f7865b);
        c0484p.f7894c.add(a4);
        C0492y b4 = c0484p.f7892a.b(a4, eVar, j4);
        this.f7911z.put(b4, c0484p);
        G();
        return b4;
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void d() {
        super.d();
        this.f7903B.clear();
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void f() {
    }

    @Override // q0.AbstractC0469a
    public final synchronized T.U g() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C0481m(this.f7908v, this.f7907F.f7826b.length != this.f7908v.size() ? this.f7907F.a().b(0, this.f7908v.size()) : this.f7907F);
    }

    @Override // q0.AbstractC0469a
    public final T.B h() {
        return f7901G;
    }

    @Override // q0.AbstractC0469a
    public final synchronized void m(Y.C c4) {
        try {
            this.f7870u = c4;
            this.f7869t = W.y.n(null);
            this.f7909x = new Handler(new W.f(1, this));
            if (this.f7908v.isEmpty()) {
                N();
            } else {
                this.f7907F = this.f7907F.b(0, this.f7908v.size());
                C(0, this.f7908v);
                K(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        IdentityHashMap identityHashMap = this.f7911z;
        C0484p c0484p = (C0484p) identityHashMap.remove(interfaceC0467D);
        c0484p.getClass();
        c0484p.f7892a.o(interfaceC0467D);
        ArrayList arrayList = c0484p.f7894c;
        arrayList.remove(((C0492y) interfaceC0467D).f7931l);
        if (!identityHashMap.isEmpty()) {
            G();
        }
        if (c0484p.f7897f && arrayList.isEmpty()) {
            this.f7903B.remove(c0484p);
            C0477i c0477i = (C0477i) this.s.remove(c0484p);
            c0477i.getClass();
            C0476h c0476h = c0477i.f7865b;
            AbstractC0469a abstractC0469a = c0477i.f7864a;
            abstractC0469a.p(c0476h);
            C0044m c0044m = c0477i.f7866c;
            abstractC0469a.t(c0044m);
            abstractC0469a.s(c0044m);
        }
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final synchronized void r() {
        try {
            super.r();
            this.f7910y.clear();
            this.f7903B.clear();
            this.f7902A.clear();
            this.f7907F = this.f7907F.a();
            Handler handler = this.f7909x;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f7909x = null;
            }
            this.f7905D = false;
            this.f7906E.clear();
            H(this.w);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q0.AbstractC0478j
    public final F v(Object obj, F f4) {
        C0484p c0484p = (C0484p) obj;
        for (int i4 = 0; i4 < c0484p.f7894c.size(); i4++) {
            if (((F) c0484p.f7894c.get(i4)).f7671d == f4.f7671d) {
                Object obj2 = c0484p.f7893b;
                int i5 = AbstractC0121a.f3383d;
                return f4.a(Pair.create(obj2, f4.f7668a));
            }
        }
        return null;
    }

    @Override // q0.AbstractC0478j
    public final int y(int i4, Object obj) {
        return i4 + ((C0484p) obj).f7896e;
    }

    @Override // q0.AbstractC0478j
    public final void z(Object obj, AbstractC0469a abstractC0469a, T.U u4) {
        C0484p c0484p = (C0484p) obj;
        int i4 = c0484p.f7895d + 1;
        ArrayList arrayList = this.f7910y;
        if (i4 < arrayList.size()) {
            int o2 = u4.o() - (((C0484p) arrayList.get(c0484p.f7895d + 1)).f7896e - c0484p.f7896e);
            if (o2 != 0) {
                E(c0484p.f7895d + 1, 0, o2);
            }
        }
        K(null);
    }
}
