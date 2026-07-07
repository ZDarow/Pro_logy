package p102a0;

/* renamed from: a0.m */
/* loaded from: classes.dex */
public final class C0986m extends p076T.AbstractC0667J {

    /* renamed from: n */
    public final int f3664n;

    /* renamed from: o */
    public final java.lang.String f3665o;

    /* renamed from: p */
    public final int f3666p;

    /* renamed from: q */
    public final p076T.C0702p f3667q;

    /* renamed from: r */
    public final int f3668r;

    /* renamed from: s */
    public final p179q0.C1964F f3669s;

    /* renamed from: t */
    public final boolean f3670t;

    static {
        p009B2.AbstractC0051h.m155n(1001, 1002, 1003, 1004, 1005);
        p086W.AbstractC0805y.m1587H(1006);
    }

    public C0986m(int i4, java.lang.Exception exc, int i5) {
        this(i4, exc, i5, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0986m(java.lang.String str, java.lang.Throwable th, int i4, int i5, java.lang.String str2, int i6, p076T.C0702p c0702p, int i7, p179q0.C1964F c1964f, long j4, boolean z4) {
        super(str, th, i4, j4);
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        p086W.AbstractC0781a.m1416e(!z4 || i5 == 1);
        p086W.AbstractC0781a.m1416e(th != null || i5 == 3);
        this.f3664n = i5;
        this.f3665o = str2;
        this.f3666p = i6;
        this.f3667q = c0702p;
        this.f3668r = i7;
        this.f3669s = c1964f;
        this.f3670t = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0986m(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, p076T.C0702p r19, int r20, boolean r21) {
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
            int r3 = p086W.AbstractC0805y.f2801a
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
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0986m.<init>(int, java.lang.Exception, int, java.lang.String, int, T.p, int, boolean):void");
    }
}
