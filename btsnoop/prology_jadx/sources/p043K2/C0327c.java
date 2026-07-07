package p043K2;

/* renamed from: K2.c */
/* loaded from: classes.dex */
public final class C0327c {

    /* renamed from: a */
    public int f990a;

    /* renamed from: b */
    public int f991b;

    /* renamed from: c */
    public boolean f992c;

    /* renamed from: d */
    public final java.lang.Object f993d;

    public C0327c(p018D2.C0176b c0176b) {
        p035I.C0291m c0291m = new p035I.C0291m(c0176b, "flutter/lifecycle", p047L2.C0393w.f1140b, null);
        this.f990a = 0;
        this.f991b = 0;
        this.f992c = true;
        this.f993d = c0291m;
    }

    /* renamed from: b */
    public static int m720b(int i4, int i5) {
        int min;
        int i6 = i4 - i5;
        return (java.lang.Math.abs(i6) <= 1000 || (min = (java.lang.Math.min(i4, i5) - java.lang.Math.max(i4, i5)) + 65535) >= 1000) ? i6 : i4 < i5 ? min : -min;
    }

    /* renamed from: a */
    public synchronized void m721a(p161m0.C1853j c1853j) {
        this.f990a = c1853j.f7508a.f7504c;
        ((java.util.TreeSet) this.f993d).add(c1853j);
    }

    /* renamed from: c */
    public synchronized p161m0.C1852i m722c(long j4) {
        if (((java.util.TreeSet) this.f993d).isEmpty()) {
            return null;
        }
        p161m0.C1853j c1853j = (p161m0.C1853j) ((java.util.TreeSet) this.f993d).first();
        int i4 = c1853j.f7508a.f7504c;
        if (i4 != p161m0.C1852i.m3811a(this.f991b) && j4 < c1853j.f7509b) {
            return null;
        }
        ((java.util.TreeSet) this.f993d).pollFirst();
        this.f991b = i4;
        return c1853j.f7508a;
    }

    /* renamed from: d */
    public synchronized void m723d() {
        ((java.util.TreeSet) this.f993d).clear();
        this.f992c = false;
        this.f991b = -1;
        this.f990a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m724e(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f990a
            if (r0 != r5) goto L9
            boolean r1 = r4.f992c
            if (r6 != r1) goto L9
            return
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f992c = r6
            return
        L10:
            int r0 = p044L.AbstractC0352j.m781b(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = r3
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f990a = r5
            r4.f992c = r6
            int r5 = r4.f991b
            if (r0 != r5) goto L33
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AppLifecycleState."
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L57
            r6 = 2
            if (r0 == r6) goto L54
            r6 = 3
            if (r0 == r6) goto L51
            r6 = 4
            if (r0 == r6) goto L4e
            r6 = 5
            if (r0 != r6) goto L4c
            java.lang.String r6 = "PAUSED"
            goto L59
        L4c:
            r5 = 0
            throw r5
        L4e:
            java.lang.String r6 = "HIDDEN"
            goto L59
        L51:
            java.lang.String r6 = "INACTIVE"
            goto L59
        L54:
            java.lang.String r6 = "RESUMED"
            goto L59
        L57:
            java.lang.String r6 = "DETACHED"
        L59:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f993d
            I.m r6 = (p035I.C0291m) r6
            r1 = 0
            r6.m700q(r5, r1)
            r4.f991b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p043K2.C0327c.m724e(int, boolean):void");
    }

    public C0327c() {
        this.f993d = new java.util.TreeSet(new p087W0.C0809d(4));
        m723d();
    }
}
