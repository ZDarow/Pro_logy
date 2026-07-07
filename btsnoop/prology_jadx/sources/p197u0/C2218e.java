package p197u0;

/* renamed from: u0.e */
/* loaded from: classes.dex */
public final class C2218e {

    /* renamed from: c */
    public int f8842c;

    /* renamed from: d */
    public int f8843d;

    /* renamed from: a */
    public final boolean f8840a = true;

    /* renamed from: b */
    public final int f8841b = 65536;

    /* renamed from: e */
    public int f8844e = 0;

    /* renamed from: f */
    public p197u0.C2214a[] f8845f = new p197u0.C2214a[100];

    /* renamed from: a */
    public final synchronized void m4422a(int i4) {
        boolean z4 = i4 < this.f8842c;
        this.f8842c = i4;
        if (z4) {
            m4423b();
        }
    }

    /* renamed from: b */
    public final synchronized void m4423b() {
        int max = java.lang.Math.max(0, p086W.AbstractC0805y.m1612g(this.f8842c, this.f8841b) - this.f8843d);
        int i4 = this.f8844e;
        if (max >= i4) {
            return;
        }
        java.util.Arrays.fill(this.f8845f, max, i4, (java.lang.Object) null);
        this.f8844e = max;
    }
}
