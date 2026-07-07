package p179q0;

/* renamed from: q0.k0 */
/* loaded from: classes.dex */
public final class C2005k0 {

    /* renamed from: d */
    public static final p179q0.C2005k0 f8183d = new p179q0.C2005k0(new p076T.C0678V[0]);

    /* renamed from: a */
    public final int f8184a;

    /* renamed from: b */
    public final p129f2.C1415c0 f8185b;

    /* renamed from: c */
    public int f8186c;

    static {
        p086W.AbstractC0805y.m1587H(0);
    }

    public C2005k0(p076T.C0678V... c0678vArr) {
        this.f8185b = p129f2.AbstractC1393I.m3163k(c0678vArr);
        this.f8184a = c0678vArr.length;
        int i4 = 0;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f8185b;
            if (i4 >= c1415c0.size()) {
                return;
            }
            int i5 = i4 + 1;
            for (int i6 = i5; i6 < c1415c0.size(); i6++) {
                if (((p076T.C0678V) c1415c0.get(i4)).equals(c1415c0.get(i6))) {
                    p086W.AbstractC0781a.m1426o("TrackGroupArray", "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i4 = i5;
        }
    }

    /* renamed from: a */
    public final p076T.C0678V m4053a(int i4) {
        return (p076T.C0678V) this.f8185b.get(i4);
    }

    /* renamed from: b */
    public final int m4054b(p076T.C0678V c0678v) {
        int indexOf = this.f8185b.indexOf(c0678v);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p179q0.C2005k0.class != obj.getClass()) {
            return false;
        }
        p179q0.C2005k0 c2005k0 = (p179q0.C2005k0) obj;
        return this.f8184a == c2005k0.f8184a && this.f8185b.equals(c2005k0.f8185b);
    }

    public final int hashCode() {
        if (this.f8186c == 0) {
            this.f8186c = this.f8185b.hashCode();
        }
        return this.f8186c;
    }
}
