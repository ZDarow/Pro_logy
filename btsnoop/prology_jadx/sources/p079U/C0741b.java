package p079U;

/* renamed from: U.b */
/* loaded from: classes.dex */
public final class C0741b {

    /* renamed from: e */
    public static final p079U.C0741b f2552e = new p079U.C0741b(-1, -1, -1);

    /* renamed from: a */
    public final int f2553a;

    /* renamed from: b */
    public final int f2554b;

    /* renamed from: c */
    public final int f2555c;

    /* renamed from: d */
    public final int f2556d;

    public C0741b(int i4, int i5, int i6) {
        this.f2553a = i4;
        this.f2554b = i5;
        this.f2555c = i6;
        this.f2556d = p086W.AbstractC0805y.m1588I(i6) ? p086W.AbstractC0805y.m1581B(i6, i5) : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p079U.C0741b)) {
            return false;
        }
        p079U.C0741b c0741b = (p079U.C0741b) obj;
        return this.f2553a == c0741b.f2553a && this.f2554b == c0741b.f2554b && this.f2555c == c0741b.f2555c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f2553a), java.lang.Integer.valueOf(this.f2554b), java.lang.Integer.valueOf(this.f2555c)});
    }

    public final java.lang.String toString() {
        return "AudioFormat[sampleRate=" + this.f2553a + ", channelCount=" + this.f2554b + ", encoding=" + this.f2555c + ']';
    }
}
