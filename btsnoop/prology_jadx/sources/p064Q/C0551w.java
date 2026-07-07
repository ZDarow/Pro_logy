package p064Q;

/* renamed from: Q.w */
/* loaded from: classes.dex */
public class C0551w {

    /* renamed from: a */
    public final java.lang.String f1630a;

    /* renamed from: b */
    public final int f1631b;

    /* renamed from: c */
    public final int f1632c;

    public C0551w(int i4, int i5, java.lang.String str) {
        this.f1630a = str;
        this.f1631b = i4;
        this.f1632c = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p064Q.C0551w)) {
            return false;
        }
        p064Q.C0551w c0551w = (p064Q.C0551w) obj;
        int i4 = this.f1632c;
        java.lang.String str = this.f1630a;
        int i5 = this.f1631b;
        return (i5 < 0 || c0551w.f1631b < 0) ? android.text.TextUtils.equals(str, c0551w.f1630a) && i4 == c0551w.f1632c : android.text.TextUtils.equals(str, c0551w.f1630a) && i5 == c0551w.f1631b && i4 == c0551w.f1632c;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f1630a, java.lang.Integer.valueOf(this.f1632c));
    }
}
