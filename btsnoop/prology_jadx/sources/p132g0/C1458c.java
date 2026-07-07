package p132g0;

/* renamed from: g0.c */
/* loaded from: classes.dex */
public final class C1458c implements p132g0.InterfaceC1465j {

    /* renamed from: d */
    public static final int[] f5841d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    public p046L1.C0363g f5842b;

    /* renamed from: c */
    public boolean f5843c;

    /* renamed from: a */
    public static void m3264a(int i4, java.util.ArrayList arrayList) {
        if (p101a.AbstractC0936a.m1769G(i4, 0, 7, f5841d) == -1 || arrayList.contains(java.lang.Integer.valueOf(i4))) {
            return;
        }
        arrayList.add(java.lang.Integer.valueOf(i4));
    }

    /* renamed from: b */
    public final p076T.C0702p m3265b(p076T.C0702p c0702p) {
        if (!this.f5843c || !this.f5842b.mo600o(c0702p)) {
            return c0702p;
        }
        p076T.C0701o m1295a = c0702p.m1295a();
        m1295a.f2370l = p076T.AbstractC0665H.m1201l("application/x-media3-cues");
        m1295a.f2355F = this.f5842b.mo592e(c0702p);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(c0702p.f2408m);
        java.lang.String str = c0702p.f2405j;
        sb.append(str != null ? " ".concat(str) : "");
        m1295a.f2367i = sb.toString();
        m1295a.f2375q = Long.MAX_VALUE;
        return new p076T.C0702p(m1295a);
    }
}
