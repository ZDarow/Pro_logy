package m0;

import T.C0095p;
import T.V;
import a0.Q;
import a0.m0;
import android.net.Uri;
import android.os.Handler;
import androidx.datastore.preferences.protobuf.C0159k;
import f2.C0278F;
import f2.I;
import f2.Y;
import f2.c0;
import f2.h0;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import q0.InterfaceC0466C;
import q0.InterfaceC0467D;
import q0.Z;
import q0.a0;
import q0.k0;

/* loaded from: classes.dex */
public final class r implements InterfaceC0467D {

    /* renamed from: A */
    public boolean f7276A;

    /* renamed from: B */
    public boolean f7277B;

    /* renamed from: C */
    public boolean f7278C;

    /* renamed from: D */
    public boolean f7279D;

    /* renamed from: E */
    public boolean f7280E;

    /* renamed from: F */
    public int f7281F;

    /* renamed from: G */
    public boolean f7282G;

    /* renamed from: l */
    public final u0.e f7283l;

    /* renamed from: m */
    public final Handler f7284m = W.y.n(null);

    /* renamed from: n */
    public final Y f7285n;

    /* renamed from: o */
    public final C0432m f7286o;

    /* renamed from: p */
    public final ArrayList f7287p;

    /* renamed from: q */
    public final ArrayList f7288q;

    /* renamed from: r */
    public final Y f7289r;
    public final L1.g s;

    /* renamed from: t */
    public InterfaceC0466C f7290t;

    /* renamed from: u */
    public c0 f7291u;

    /* renamed from: v */
    public IOException f7292v;
    public C0159k w;

    /* renamed from: x */
    public long f7293x;

    /* renamed from: y */
    public long f7294y;

    /* renamed from: z */
    public long f7295z;

    public r(u0.e eVar, L1.g gVar, Uri uri, Y y4, String str, SocketFactory socketFactory) {
        this.f7283l = eVar;
        this.s = gVar;
        this.f7289r = y4;
        Y y5 = new Y(16, this);
        this.f7285n = y5;
        this.f7286o = new C0432m(y5, y5, str, uri, socketFactory);
        this.f7287p = new ArrayList();
        this.f7288q = new ArrayList();
        this.f7294y = -9223372036854775807L;
        this.f7293x = -9223372036854775807L;
        this.f7295z = -9223372036854775807L;
    }

    public static /* synthetic */ long a(r rVar) {
        return rVar.f7294y;
    }

    public static /* synthetic */ void d(r rVar) {
        rVar.f7294y = -9223372036854775807L;
    }

    public static /* synthetic */ long f(r rVar) {
        return rVar.f7295z;
    }

    public static /* synthetic */ void k(r rVar) {
        rVar.f7295z = -9223372036854775807L;
    }

    public static /* synthetic */ ArrayList n(r rVar) {
        return rVar.f7288q;
    }

    public static /* synthetic */ Y o(r rVar) {
        return rVar.f7289r;
    }

    public static boolean q(r rVar) {
        return rVar.f7294y != -9223372036854775807L;
    }

    public static /* synthetic */ long s(r rVar) {
        return rVar.f7293x;
    }

    public static /* synthetic */ void t(r rVar) {
        rVar.f7293x = -9223372036854775807L;
    }

    public static void v(r rVar) {
        rVar.f7276A = true;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = rVar.f7287p;
            if (i4 >= arrayList.size()) {
                return;
            }
            rVar.f7276A = ((q) arrayList.get(i4)).f7273d & rVar.f7276A;
            i4++;
        }
    }

    public static void x(r rVar) {
        if (rVar.f7278C || rVar.f7279D) {
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = rVar.f7287p;
            if (i4 >= arrayList.size()) {
                rVar.f7279D = true;
                I j4 = I.j(arrayList);
                C0278F c0278f = new C0278F();
                for (int i5 = 0; i5 < j4.size(); i5++) {
                    Z z4 = ((q) j4.get(i5)).f7272c;
                    String num = Integer.toString(i5);
                    C0095p q4 = z4.q();
                    W.a.h(q4);
                    c0278f.c(new V(num, q4));
                }
                rVar.f7291u = c0278f.g();
                InterfaceC0466C interfaceC0466C = rVar.f7290t;
                W.a.h(interfaceC0466C);
                interfaceC0466C.o(rVar);
                return;
            }
            if (((q) arrayList.get(i4)).f7272c.q() == null) {
                return;
            } else {
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m0.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    public static void y(r rVar) {
        rVar.f7282G = true;
        C0432m c0432m = rVar.f7286o;
        c0432m.getClass();
        try {
            c0432m.close();
            y yVar = new y(new Y.x(c0432m));
            c0432m.f7257t = yVar;
            yVar.a(c0432m.g(c0432m.s));
            c0432m.f7259v = null;
            c0432m.f7247B = false;
            c0432m.f7261y = null;
        } catch (IOException e4) {
            c0432m.f7251m.B(new IOException(e4));
        }
        rVar.s.getClass();
        ?? obj = new Object();
        ArrayList arrayList = rVar.f7287p;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = rVar.f7288q;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            q qVar = (q) arrayList.get(i4);
            if (qVar.f7273d) {
                arrayList2.add(qVar);
            } else {
                p pVar = qVar.f7270a;
                q qVar2 = new q(rVar, pVar.f7266a, i4, obj);
                arrayList2.add(qVar2);
                qVar2.b();
                if (arrayList3.contains(pVar)) {
                    arrayList4.add(qVar2.f7270a);
                }
            }
        }
        I j4 = I.j(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i5 = 0; i5 < j4.size(); i5++) {
            ((q) j4.get(i5)).a();
        }
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        return j4;
    }

    @Override // q0.c0
    public final boolean c() {
        int i4;
        return !this.f7276A && ((i4 = this.f7286o.f7262z) == 2 || i4 == 1);
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        W.a.j(this.f7279D);
        c0 c0Var = this.f7291u;
        c0Var.getClass();
        return new k0((V[]) c0Var.toArray(new V[0]));
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        C0432m c0432m = this.f7286o;
        this.f7290t = interfaceC0466C;
        try {
            c0432m.getClass();
            try {
                c0432m.f7257t.a(c0432m.g(c0432m.s));
                Uri uri = c0432m.s;
                String str = c0432m.f7259v;
                P2.a aVar = c0432m.f7256r;
                aVar.l(aVar.h(4, str, h0.f5570r, uri));
            } catch (IOException e4) {
                W.y.h(c0432m.f7257t);
                throw e4;
            }
        } catch (IOException e5) {
            this.f7292v = e5;
            W.y.h(c0432m);
        }
    }

    @Override // q0.c0
    public final long h() {
        if (!this.f7276A) {
            ArrayList arrayList = this.f7287p;
            if (!arrayList.isEmpty()) {
                long j4 = this.f7293x;
                if (j4 != -9223372036854775807L) {
                    return j4;
                }
                boolean z4 = true;
                long j5 = Long.MAX_VALUE;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    q qVar = (q) arrayList.get(i4);
                    if (!qVar.f7273d) {
                        j5 = Math.min(j5, qVar.f7272c.l());
                        z4 = false;
                    }
                }
                if (z4 || j5 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q0.c0
    public final boolean i(Q q4) {
        return c();
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        IOException iOException = this.f7292v;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        if (h() == 0 && !this.f7282G) {
            this.f7295z = j4;
            return j4;
        }
        m(j4);
        this.f7293x = j4;
        if (this.f7294y != -9223372036854775807L) {
            C0432m c0432m = this.f7286o;
            int i4 = c0432m.f7262z;
            if (i4 == 1) {
                return j4;
            }
            if (i4 != 2) {
                throw new IllegalStateException();
            }
            this.f7294y = j4;
            c0432m.h(j4);
            return j4;
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f7287p;
            if (i5 >= arrayList.size()) {
                return j4;
            }
            if (!((q) arrayList.get(i5)).f7272c.B(j4, false)) {
                this.f7294y = j4;
                if (this.f7276A) {
                    for (int i6 = 0; i6 < this.f7287p.size(); i6++) {
                        q qVar = (q) this.f7287p.get(i6);
                        W.a.j(qVar.f7273d);
                        qVar.f7273d = false;
                        v(qVar.f7275f);
                        qVar.b();
                    }
                    if (this.f7282G) {
                        this.f7286o.i(W.y.Z(j4));
                    } else {
                        this.f7286o.h(j4);
                    }
                } else {
                    this.f7286o.h(j4);
                }
                for (int i7 = 0; i7 < this.f7287p.size(); i7++) {
                    q qVar2 = (q) this.f7287p.get(i7);
                    if (!qVar2.f7273d) {
                        C0426g c0426g = qVar2.f7270a.f7267b.s;
                        c0426g.getClass();
                        synchronized (c0426g.f7213e) {
                            c0426g.f7219k = true;
                        }
                        qVar2.f7272c.z(false);
                        qVar2.f7272c.f7802t = j4;
                    }
                }
                return j4;
            }
            i5++;
        }
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        if (this.f7294y != -9223372036854775807L) {
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f7287p;
            if (i4 >= arrayList.size()) {
                return;
            }
            q qVar = (q) arrayList.get(i4);
            if (!qVar.f7273d) {
                qVar.f7272c.f(j4, true);
            }
            i4++;
        }
    }

    @Override // q0.InterfaceC0467D
    public final long p(t0.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        ArrayList arrayList;
        for (int i4 = 0; i4 < sVarArr.length; i4++) {
            if (a0VarArr[i4] != null && (sVarArr[i4] == null || !zArr[i4])) {
                a0VarArr[i4] = null;
            }
        }
        ArrayList arrayList2 = this.f7288q;
        arrayList2.clear();
        int i5 = 0;
        while (true) {
            int length = sVarArr.length;
            arrayList = this.f7287p;
            if (i5 >= length) {
                break;
            }
            t0.s sVar = sVarArr[i5];
            if (sVar != null) {
                V b4 = sVar.b();
                c0 c0Var = this.f7291u;
                c0Var.getClass();
                int indexOf = c0Var.indexOf(b4);
                q qVar = (q) arrayList.get(indexOf);
                qVar.getClass();
                arrayList2.add(qVar.f7270a);
                if (this.f7291u.contains(b4) && a0VarArr[i5] == null) {
                    a0VarArr[i5] = new B.c(indexOf, this);
                    zArr2[i5] = true;
                }
            }
            i5++;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            q qVar2 = (q) arrayList.get(i6);
            if (!arrayList2.contains(qVar2.f7270a)) {
                qVar2.a();
            }
        }
        this.f7280E = true;
        if (j4 != 0) {
            this.f7293x = j4;
            this.f7294y = j4;
            this.f7295z = j4;
        }
        z();
        return j4;
    }

    @Override // q0.c0
    public final long r() {
        return h();
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        if (!this.f7277B) {
            return -9223372036854775807L;
        }
        this.f7277B = false;
        return 0L;
    }

    @Override // q0.c0
    public final void w(long j4) {
    }

    public final void z() {
        ArrayList arrayList;
        boolean z4 = true;
        int i4 = 0;
        while (true) {
            arrayList = this.f7288q;
            if (i4 >= arrayList.size()) {
                break;
            }
            z4 &= ((p) arrayList.get(i4)).f7268c != null;
            i4++;
        }
        if (z4 && this.f7280E) {
            C0432m c0432m = this.f7286o;
            c0432m.f7254p.addAll(arrayList);
            c0432m.f();
        }
    }
}
