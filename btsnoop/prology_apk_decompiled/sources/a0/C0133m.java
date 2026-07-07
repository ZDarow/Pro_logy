package a0;

import B2.AbstractC0007h;
import T.C0095p;
import android.os.Bundle;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133m extends T.J {

    /* renamed from: n, reason: collision with root package name */
    public final int f3542n;

    /* renamed from: o, reason: collision with root package name */
    public final String f3543o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3544p;

    /* renamed from: q, reason: collision with root package name */
    public final C0095p f3545q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3546r;
    public final q0.F s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3547t;

    static {
        AbstractC0007h.n(1001, 1002, 1003, 1004, 1005);
        W.y.H(1006);
    }

    public C0133m(int i4, Exception exc, int i5) {
        this(i4, exc, i5, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133m(String str, Throwable th, int i4, int i5, String str2, int i6, C0095p c0095p, int i7, q0.F f4, long j4, boolean z4) {
        super(str, th, i4, j4);
        Bundle bundle = Bundle.EMPTY;
        W.a.e(!z4 || i5 == 1);
        W.a.e(th != null || i5 == 3);
        this.f3542n = i5;
        this.f3543o = str2;
        this.f3544p = i6;
        this.f3545q = c0095p;
        this.f3546r = i7;
        this.s = f4;
        this.f3547t = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0133m(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, T.C0095p r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto L14
            java.lang.String r0 = "Unexpected runtime error"
        Ld:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L14:
            java.lang.String r0 = "Remote error"
            goto Ld
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = W.y.f2709a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L84
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L84:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0133m.<init>(int, java.lang.Exception, int, java.lang.String, int, T.p, int, boolean):void");
    }
}
