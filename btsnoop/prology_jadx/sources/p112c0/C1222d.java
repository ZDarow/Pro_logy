package p112c0;

/* renamed from: c0.d */
/* loaded from: classes.dex */
public final class C1222d {

    /* renamed from: d */
    public static final p112c0.C1222d f4763d;

    /* renamed from: a */
    public final int f4764a;

    /* renamed from: b */
    public final int f4765b;

    /* renamed from: c */
    public final p129f2.AbstractC1397M f4766c;

    /* JADX WARN: Type inference failed for: r1v1, types: [f2.L, f2.C] */
    static {
        p112c0.C1222d c1222d;
        if (p086W.AbstractC0805y.f2801a >= 33) {
            ?? abstractC1387C = new p129f2.AbstractC1387C(4);
            for (int i4 = 1; i4 <= 10; i4++) {
                abstractC1387C.m3145a(java.lang.Integer.valueOf(p086W.AbstractC0805y.m1624s(i4)));
            }
            c1222d = new p112c0.C1222d(2, abstractC1387C.m3175g());
        } else {
            c1222d = new p112c0.C1222d(2, 10);
        }
        f4763d = c1222d;
    }

    public C1222d(int i4, java.util.Set set) {
        this.f4764a = i4;
        p129f2.AbstractC1397M m3178j = p129f2.AbstractC1397M.m3178j(set);
        this.f4766c = m3178j;
        p129f2.AbstractC1445r0 it = m3178j.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = java.lang.Math.max(i5, java.lang.Integer.bitCount(((java.lang.Integer) it.next()).intValue()));
        }
        this.f4765b = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p112c0.C1222d)) {
            return false;
        }
        p112c0.C1222d c1222d = (p112c0.C1222d) obj;
        return this.f4764a == c1222d.f4764a && this.f4765b == c1222d.f4765b && p086W.AbstractC0805y.m1606a(this.f4766c, c1222d.f4766c);
    }

    public final int hashCode() {
        int i4 = ((this.f4764a * 31) + this.f4765b) * 31;
        p129f2.AbstractC1397M abstractC1397M = this.f4766c;
        return i4 + (abstractC1397M == null ? 0 : abstractC1397M.hashCode());
    }

    public final java.lang.String toString() {
        return "AudioProfile[format=" + this.f4764a + ", maxChannelCount=" + this.f4765b + ", channelMasks=" + this.f4766c + "]";
    }

    public C1222d(int i4, int i5) {
        this.f4764a = i4;
        this.f4765b = i5;
        this.f4766c = null;
    }
}
