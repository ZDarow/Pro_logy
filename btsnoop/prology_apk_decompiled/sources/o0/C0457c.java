package o0;

import T.B;
import T.C0103y;
import W.y;
import Y.C;
import Y.g;
import Y.h;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b0.l;
import f0.e;
import java.util.ArrayList;
import java.util.regex.Matcher;
import q0.AbstractC0469a;
import q0.C0491x;
import q0.F;
import q0.InterfaceC0466C;
import q0.InterfaceC0467D;
import q0.h0;
import r0.C0506h;
import t0.C0560b;
import u0.i;
import u0.k;
import u0.n;
import u0.o;
import u0.p;
import u0.q;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457c extends AbstractC0469a implements i {

    /* renamed from: A, reason: collision with root package name */
    public final e f7555A;

    /* renamed from: B, reason: collision with root package name */
    public final p f7556B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f7557C;

    /* renamed from: D, reason: collision with root package name */
    public h f7558D;

    /* renamed from: E, reason: collision with root package name */
    public n f7559E;

    /* renamed from: F, reason: collision with root package name */
    public o f7560F;

    /* renamed from: G, reason: collision with root package name */
    public C f7561G;

    /* renamed from: H, reason: collision with root package name */
    public long f7562H;

    /* renamed from: I, reason: collision with root package name */
    public p0.c f7563I;
    public Handler J;

    /* renamed from: K, reason: collision with root package name */
    public B f7564K;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f7565t;

    /* renamed from: u, reason: collision with root package name */
    public final g f7566u;

    /* renamed from: v, reason: collision with root package name */
    public final Y1.a f7567v;
    public final L1.g w;

    /* renamed from: x, reason: collision with root package name */
    public final f0.i f7568x;

    /* renamed from: y, reason: collision with root package name */
    public final C0560b f7569y;

    /* renamed from: z, reason: collision with root package name */
    public final long f7570z;

    static {
        T.C.a("media3.exoplayer.smoothstreaming");
    }

    public C0457c(B b4, g gVar, p pVar, Y1.a aVar, L1.g gVar2, f0.i iVar, C0560b c0560b, long j4) {
        this.f7564K = b4;
        C0103y c0103y = b4.f2067b;
        c0103y.getClass();
        this.f7563I = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = c0103y.f2364a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = y.f2718j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f7565t = uri2;
        this.f7566u = gVar;
        this.f7556B = pVar;
        this.f7567v = aVar;
        this.w = gVar2;
        this.f7568x = iVar;
        this.f7569y = c0560b;
        this.f7570z = j4;
        this.f7555A = a(null);
        this.s = false;
        this.f7557C = new ArrayList();
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        e a4 = a(f4);
        e eVar2 = new e(this.f7811o.f5456c, 0, f4);
        p0.c cVar = this.f7563I;
        C c4 = this.f7561G;
        o oVar = this.f7560F;
        C0456b c0456b = new C0456b(cVar, this.f7567v, c4, this.w, this.f7568x, eVar2, this.f7569y, a4, oVar, eVar);
        this.f7557C.add(c0456b);
        return c0456b;
    }

    @Override // q0.AbstractC0469a
    public final synchronized B h() {
        return this.f7564K;
    }

    @Override // q0.AbstractC0469a
    public final void j() {
        this.f7560F.a();
    }

    @Override // u0.i
    public final void k(k kVar, long j4, long j5) {
        q qVar = (q) kVar;
        long j6 = qVar.f8545l;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f7569y.getClass();
        this.f7555A.e(c0491x, qVar.f8547n);
        this.f7563I = (p0.c) qVar.f8550q;
        this.f7562H = j4 - j5;
        v();
        if (this.f7563I.f7613d) {
            this.J.postDelayed(new F2.c(9, this), Math.max(0L, (this.f7562H + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [u0.o, java.lang.Object] */
    @Override // q0.AbstractC0469a
    public final void m(C c4) {
        this.f7561G = c4;
        Looper myLooper = Looper.myLooper();
        l lVar = this.f7814r;
        W.a.k(lVar);
        f0.i iVar = this.f7568x;
        iVar.b(myLooper, lVar);
        iVar.c();
        if (this.s) {
            this.f7560F = new Object();
            v();
            return;
        }
        this.f7558D = this.f7566u.a();
        n nVar = new n("SsMediaSource");
        this.f7559E = nVar;
        this.f7560F = nVar;
        this.J = y.n(null);
        w();
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        C0456b c0456b = (C0456b) interfaceC0467D;
        for (C0506h c0506h : c0456b.f7553x) {
            c0506h.B(null);
        }
        c0456b.f7552v = null;
        this.f7557C.remove(interfaceC0467D);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.C0271e q(u0.k r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            r5 = 0
            u0.q r4 = (u0.q) r4
            q0.x r6 = new q0.x
            long r0 = r4.f8545l
            Y.B r0 = r4.f8548o
            android.net.Uri r0 = r0.f2990n
            r6.<init>(r7)
            t0.b r7 = r3.f7569y
            r7.getClass()
            boolean r7 = r9 instanceof T.I
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof Y.t
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof u0.m
            if (r7 != 0) goto L4c
            int r7 = Y.i.f3014m
            r7 = r9
        L2b:
            if (r7 == 0) goto L40
            boolean r8 = r7 instanceof Y.i
            if (r8 == 0) goto L3b
            r8 = r7
            Y.i r8 = (Y.i) r8
            int r8 = r8.f3015l
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L3b
            goto L4c
        L3b:
            java.lang.Throwable r7 = r7.getCause()
            goto L2b
        L40:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L4d
        L4c:
            r7 = r0
        L4d:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L54
            f1.e r5 = u0.n.f8541q
            goto L5a
        L54:
            f1.e r10 = new f1.e
            r10.<init>(r5, r7, r5)
            r5 = r10
        L5a:
            boolean r7 = r5.a()
            r7 = r7 ^ 1
            f0.e r8 = r3.f7555A
            int r4 = r4.f8547n
            r8.i(r6, r4, r9, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0457c.q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // q0.AbstractC0469a
    public final void r() {
        this.f7563I = this.s ? this.f7563I : null;
        this.f7558D = null;
        this.f7562H = 0L;
        n nVar = this.f7559E;
        if (nVar != null) {
            nVar.e(null);
            this.f7559E = null;
        }
        Handler handler = this.J;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.J = null;
        }
        this.f7568x.release();
    }

    @Override // q0.AbstractC0469a
    public final synchronized void u(B b4) {
        this.f7564K = b4;
    }

    public final void v() {
        h0 h0Var;
        C0506h[] c0506hArr;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f7557C;
            if (i4 >= arrayList.size()) {
                break;
            }
            C0456b c0456b = (C0456b) arrayList.get(i4);
            p0.c cVar = this.f7563I;
            c0456b.w = cVar;
            C0506h[] c0506hArr2 = c0456b.f7553x;
            int length = c0506hArr2.length;
            int i5 = 0;
            while (i5 < length) {
                C0455a c0455a = (C0455a) c0506hArr2[i5].f8045p;
                p0.b[] bVarArr = c0455a.f7540f.f7615f;
                int i6 = c0455a.f7536b;
                p0.b bVar = bVarArr[i6];
                int i7 = bVar.f7604k;
                p0.b bVar2 = cVar.f7615f[i6];
                if (i7 == 0 || bVar2.f7604k == 0) {
                    c0506hArr = c0506hArr2;
                    c0455a.f7541g += i7;
                } else {
                    int i8 = i7 - 1;
                    long[] jArr = bVar.f7608o;
                    long b4 = bVar.b(i8) + jArr[i8];
                    c0506hArr = c0506hArr2;
                    long j4 = bVar2.f7608o[0];
                    if (b4 <= j4) {
                        c0455a.f7541g += i7;
                    } else {
                        c0455a.f7541g = y.f(jArr, j4, true) + c0455a.f7541g;
                    }
                }
                c0455a.f7540f = cVar;
                i5++;
                c0506hArr2 = c0506hArr;
            }
            InterfaceC0466C interfaceC0466C = c0456b.f7552v;
            interfaceC0466C.getClass();
            interfaceC0466C.f(c0456b);
            i4++;
        }
        long j5 = Long.MIN_VALUE;
        long j6 = Long.MAX_VALUE;
        for (p0.b bVar3 : this.f7563I.f7615f) {
            if (bVar3.f7604k > 0) {
                long[] jArr2 = bVar3.f7608o;
                j6 = Math.min(j6, jArr2[0]);
                int i9 = bVar3.f7604k - 1;
                j5 = Math.max(j5, bVar3.b(i9) + jArr2[i9]);
            }
        }
        if (j6 == Long.MAX_VALUE) {
            long j7 = this.f7563I.f7613d ? -9223372036854775807L : 0L;
            p0.c cVar2 = this.f7563I;
            boolean z4 = cVar2.f7613d;
            h0Var = new h0(j7, 0L, 0L, 0L, true, z4, z4, cVar2, h());
        } else {
            p0.c cVar3 = this.f7563I;
            if (cVar3.f7613d) {
                long j8 = cVar3.f7617h;
                if (j8 != -9223372036854775807L && j8 > 0) {
                    j6 = Math.max(j6, j5 - j8);
                }
                long j9 = j6;
                long j10 = j5 - j9;
                long M3 = j10 - y.M(this.f7570z);
                if (M3 < 5000000) {
                    M3 = Math.min(5000000L, j10 / 2);
                }
                h0Var = new h0(-9223372036854775807L, j10, j9, M3, true, true, true, this.f7563I, h());
            } else {
                long j11 = cVar3.f7616g;
                long j12 = j11 != -9223372036854775807L ? j11 : j5 - j6;
                h0Var = new h0(-9223372036854775807L, -9223372036854775807L, j6 + j12, j12, j6, 0L, true, false, false, this.f7563I, h(), null);
            }
        }
        n(h0Var);
    }

    public final void w() {
        if (this.f7559E.c()) {
            return;
        }
        q qVar = new q(this.f7558D, this.f7565t, 4, this.f7556B);
        n nVar = this.f7559E;
        C0560b c0560b = this.f7569y;
        int i4 = qVar.f8547n;
        this.f7555A.k(new C0491x(qVar.f8545l, qVar.f8546m, nVar.f(qVar, this, c0560b.e(i4))), i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // u0.i
    public final void x(k kVar, long j4, long j5, boolean z4) {
        q qVar = (q) kVar;
        long j6 = qVar.f8545l;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f7569y.getClass();
        this.f7555A.c(c0491x, qVar.f8547n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
