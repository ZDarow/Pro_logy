package s0;

import L1.g;
import T.C0095p;
import T.H;
import V0.e;
import V0.i;
import Y.x;
import Z.f;
import a0.AbstractC0125e;
import a0.C0118H;
import a0.SurfaceHolderCallbackC0115E;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f2.I;
import f2.Y;
import f2.c0;
import java.util.Objects;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542d extends AbstractC0125e implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public final g f8195C;

    /* renamed from: D, reason: collision with root package name */
    public final f f8196D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0539a f8197E;

    /* renamed from: F, reason: collision with root package name */
    public final Y f8198F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8199G;

    /* renamed from: H, reason: collision with root package name */
    public int f8200H;

    /* renamed from: I, reason: collision with root package name */
    public e f8201I;
    public i J;

    /* renamed from: K, reason: collision with root package name */
    public V0.c f8202K;

    /* renamed from: L, reason: collision with root package name */
    public V0.c f8203L;

    /* renamed from: M, reason: collision with root package name */
    public int f8204M;

    /* renamed from: N, reason: collision with root package name */
    public final Handler f8205N;

    /* renamed from: O, reason: collision with root package name */
    public final SurfaceHolderCallbackC0115E f8206O;

    /* renamed from: P, reason: collision with root package name */
    public final x f8207P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f8208Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f8209R;

    /* renamed from: S, reason: collision with root package name */
    public C0095p f8210S;

    /* renamed from: T, reason: collision with root package name */
    public long f8211T;

    /* renamed from: U, reason: collision with root package name */
    public long f8212U;

    /* renamed from: V, reason: collision with root package name */
    public long f8213V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0542d(SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E, Looper looper) {
        super(3);
        Y y4 = InterfaceC0541c.f8194g;
        this.f8206O = surfaceHolderCallbackC0115E;
        this.f8205N = looper == null ? null : new Handler(looper, this);
        this.f8198F = y4;
        this.f8195C = new g(14, false);
        this.f8196D = new f(1);
        this.f8207P = new x((char) 0, 4);
        this.f8213V = -9223372036854775807L;
        this.f8211T = -9223372036854775807L;
        this.f8212U = -9223372036854775807L;
    }

    @Override // a0.AbstractC0125e
    public final int D(C0095p c0095p) {
        if (!Objects.equals(c0095p.f2325m, "application/x-media3-cues")) {
            Y y4 = this.f8198F;
            y4.getClass();
            if (!((g) y4.f5535m).o(c0095p)) {
                String str = c0095p.f2325m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return H.j(str) ? AbstractC0125e.f(1, 0, 0, 0) : AbstractC0125e.f(0, 0, 0, 0);
                }
            }
        }
        return AbstractC0125e.f(c0095p.J == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        W.a.i("Legacy decoding is disabled, can't handle " + this.f8210S.f2325m + " samples (expected application/x-media3-cues).", Objects.equals(this.f8210S.f2325m, "application/cea-608") || Objects.equals(this.f8210S.f2325m, "application/x-mp4-cea-608") || Objects.equals(this.f8210S.f2325m, "application/cea-708"));
    }

    public final long G() {
        if (this.f8204M == -1) {
            return Long.MAX_VALUE;
        }
        this.f8202K.getClass();
        if (this.f8204M >= this.f8202K.Q()) {
            return Long.MAX_VALUE;
        }
        return this.f8202K.B(this.f8204M);
    }

    public final long H(long j4) {
        W.a.j(j4 != -9223372036854775807L);
        W.a.j(this.f8211T != -9223372036854775807L);
        return j4 - this.f8211T;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r7 = this;
            r0 = 1
            r7.f8199G = r0
            T.p r1 = r7.f8210S
            r1.getClass()
            f2.Y r2 = r7.f8198F
            r2.getClass()
            java.lang.String r3 = r1.f2325m
            if (r3 == 0) goto L4d
            int r4 = r1.f2308F
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            W0.g r0 = new W0.g
            java.util.List r1 = r1.f2328p
            r0.<init>(r4, r1)
            goto L6e
        L47:
            W0.c r0 = new W0.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f5535m
            L1.g r0 = (L1.g) r0
            boolean r2 = r0.o(r1)
            if (r2 == 0) goto L76
            V0.l r0 = r0.d(r1)
            i0.b r1 = new i0.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f8201I = r0
            long r1 = r7.w
            r0.e(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = B2.AbstractC0007h.l(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C0542d.I():void");
    }

    public final void J(V.c cVar) {
        I i4 = cVar.f2580a;
        SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = this.f8206O;
        surfaceHolderCallbackC0115E.f3204a.f3251l.e(27, new B2.x(19, i4));
        C0118H c0118h = surfaceHolderCallbackC0115E.f3204a;
        c0118h.getClass();
        c0118h.f3251l.e(27, new B2.x(16, cVar));
    }

    public final void K() {
        this.J = null;
        this.f8204M = -1;
        V0.c cVar = this.f8202K;
        if (cVar != null) {
            cVar.f();
            this.f8202K = null;
        }
        V0.c cVar2 = this.f8203L;
        if (cVar2 != null) {
            cVar2.f();
            this.f8203L = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        J((V.c) message.obj);
        return true;
    }

    @Override // a0.AbstractC0125e
    public final String l() {
        return "TextRenderer";
    }

    @Override // a0.AbstractC0125e
    public final boolean n() {
        return this.f8209R;
    }

    @Override // a0.AbstractC0125e
    public final boolean p() {
        return true;
    }

    @Override // a0.AbstractC0125e
    public final void q() {
        this.f8210S = null;
        this.f8213V = -9223372036854775807L;
        c0 c0Var = c0.f5550p;
        H(this.f8212U);
        V.c cVar = new V.c(c0Var);
        Handler handler = this.f8205N;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.f8211T = -9223372036854775807L;
        this.f8212U = -9223372036854775807L;
        if (this.f8201I != null) {
            K();
            e eVar = this.f8201I;
            eVar.getClass();
            eVar.release();
            this.f8201I = null;
            this.f8200H = 0;
        }
    }

    @Override // a0.AbstractC0125e
    public final void s(long j4, boolean z4) {
        this.f8212U = j4;
        InterfaceC0539a interfaceC0539a = this.f8197E;
        if (interfaceC0539a != null) {
            interfaceC0539a.clear();
        }
        c0 c0Var = c0.f5550p;
        H(this.f8212U);
        V.c cVar = new V.c(c0Var);
        Handler handler = this.f8205N;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            J(cVar);
        }
        this.f8208Q = false;
        this.f8209R = false;
        this.f8213V = -9223372036854775807L;
        C0095p c0095p = this.f8210S;
        if (c0095p == null || Objects.equals(c0095p.f2325m, "application/x-media3-cues")) {
            return;
        }
        if (this.f8200H == 0) {
            K();
            e eVar = this.f8201I;
            eVar.getClass();
            eVar.flush();
            eVar.e(this.w);
            return;
        }
        K();
        e eVar2 = this.f8201I;
        eVar2.getClass();
        eVar2.release();
        this.f8201I = null;
        this.f8200H = 0;
        I();
    }

    @Override // a0.AbstractC0125e
    public final void x(C0095p[] c0095pArr, long j4, long j5) {
        this.f8211T = j5;
        C0095p c0095p = c0095pArr[0];
        this.f8210S = c0095p;
        if (Objects.equals(c0095p.f2325m, "application/x-media3-cues")) {
            this.f8197E = this.f8210S.f2309G == 1 ? new C0540b() : new O.g(2);
            return;
        }
        F();
        if (this.f8201I != null) {
            this.f8200H = 1;
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023f A[EXC_TOP_SPLITTER, LOOP:2: B:100:0x023f->B:122:0x02ad, LOOP_START, PHI: r15
      0x023f: PHI (r15v2 Y.x) = (r15v1 Y.x), (r15v3 Y.x) binds: [B:99:0x023b, B:122:0x02ad] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    @Override // a0.AbstractC0125e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C0542d.z(long, long):void");
    }
}
