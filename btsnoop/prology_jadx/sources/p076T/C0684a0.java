package p076T;

/* renamed from: T.a0 */
/* loaded from: classes.dex */
public final class C0684a0 {

    /* renamed from: b */
    public static final p076T.C0684a0 f2303b;

    /* renamed from: a */
    public final p129f2.AbstractC1393I f2304a;

    static {
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        f2303b = new p076T.C0684a0(p129f2.C1415c0.f5744p);
        p086W.AbstractC0805y.m1587H(0);
    }

    public C0684a0(p129f2.AbstractC1393I abstractC1393I) {
        this.f2304a = p129f2.AbstractC1393I.m3162j(abstractC1393I);
    }

    /* renamed from: a */
    public final p129f2.AbstractC1393I m1263a() {
        return this.f2304a;
    }

    /* renamed from: b */
    public final boolean m1264b(int i4) {
        int i5 = 0;
        while (true) {
            p129f2.AbstractC1393I abstractC1393I = this.f2304a;
            if (i5 >= abstractC1393I.size()) {
                return false;
            }
            p076T.C0682Z c0682z = (p076T.C0682Z) abstractC1393I.get(i5);
            boolean[] zArr = c0682z.f2296e;
            int length = zArr.length;
            boolean z4 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (zArr[i6]) {
                    z4 = true;
                    break;
                }
                i6++;
            }
            if (z4 && c0682z.f2293b.f2251c == i4) {
                return true;
            }
            i5++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0684a0.class != obj.getClass()) {
            return false;
        }
        return this.f2304a.equals(((p076T.C0684a0) obj).f2304a);
    }

    public final int hashCode() {
        return this.f2304a.hashCode();
    }
}
