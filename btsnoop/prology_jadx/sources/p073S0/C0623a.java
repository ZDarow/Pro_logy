package p073S0;

/* renamed from: S0.a */
/* loaded from: classes.dex */
public final class C0623a extends p073S0.AbstractC0625c {

    /* renamed from: n */
    public final long f1952n;

    /* renamed from: o */
    public final java.util.ArrayList f1953o;

    /* renamed from: p */
    public final java.util.ArrayList f1954p;

    public C0623a(long j4, int i4) {
        super(i4);
        this.f1952n = j4;
        this.f1953o = new java.util.ArrayList();
        this.f1954p = new java.util.ArrayList();
    }

    /* renamed from: e */
    public final p073S0.C0623a m1133e(int i4) {
        java.util.ArrayList arrayList = this.f1954p;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p073S0.C0623a c0623a = (p073S0.C0623a) arrayList.get(i5);
            if (c0623a.f1957m == i4) {
                return c0623a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final p073S0.C0624b m1134f(int i4) {
        java.util.ArrayList arrayList = this.f1953o;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p073S0.C0624b c0624b = (p073S0.C0624b) arrayList.get(i5);
            if (c0624b.f1957m == i4) {
                return c0624b;
            }
        }
        return null;
    }

    @Override // p073S0.AbstractC0625c
    public final java.lang.String toString() {
        return p073S0.AbstractC0625c.m1135b(this.f1957m) + " leaves: " + java.util.Arrays.toString(this.f1953o.toArray()) + " containers: " + java.util.Arrays.toString(this.f1954p.toArray());
    }
}
