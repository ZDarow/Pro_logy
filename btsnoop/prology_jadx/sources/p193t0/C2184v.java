package p193t0;

/* renamed from: t0.v */
/* loaded from: classes.dex */
public final class C2184v {

    /* renamed from: a */
    public final int f8720a;

    /* renamed from: b */
    public final p102a0.C0985l0[] f8721b;

    /* renamed from: c */
    public final p193t0.InterfaceC2181s[] f8722c;

    /* renamed from: d */
    public final p076T.C0684a0 f8723d;

    /* renamed from: e */
    public final p145j.C1673n f8724e;

    public C2184v(p102a0.C0985l0[] c0985l0Arr, p193t0.InterfaceC2181s[] interfaceC2181sArr, p076T.C0684a0 c0684a0, p145j.C1673n c1673n) {
        p086W.AbstractC0781a.m1416e(c0985l0Arr.length == interfaceC2181sArr.length);
        this.f8721b = c0985l0Arr;
        this.f8722c = (p193t0.InterfaceC2181s[]) interfaceC2181sArr.clone();
        this.f8723d = c0684a0;
        this.f8724e = c1673n;
        this.f8720a = c0985l0Arr.length;
    }

    /* renamed from: a */
    public final boolean m4305a(p193t0.C2184v c2184v, int i4) {
        return c2184v != null && p086W.AbstractC0805y.m1606a(this.f8721b[i4], c2184v.f8721b[i4]) && p086W.AbstractC0805y.m1606a(this.f8722c[i4], c2184v.f8722c[i4]);
    }

    /* renamed from: b */
    public final boolean m4306b(int i4) {
        return this.f8721b[i4] != null;
    }
}
