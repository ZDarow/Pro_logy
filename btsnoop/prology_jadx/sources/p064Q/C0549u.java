package p064Q;

/* renamed from: Q.u */
/* loaded from: classes.dex */
public final class C0549u {

    /* renamed from: a */
    public p064Q.C0551w f1629a;

    public C0549u(int i4, int i5, java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.f1629a = new p064Q.C0551w(i4, i5, str);
            return;
        }
        p064Q.C0551w c0551w = new p064Q.C0551w(i4, i5, str);
        p001A.AbstractC0000a.m22s(i4, i5, str);
        this.f1629a = c0551w;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p064Q.C0549u)) {
            return false;
        }
        return this.f1629a.equals(((p064Q.C0549u) obj).f1629a);
    }

    public final int hashCode() {
        return this.f1629a.hashCode();
    }
}
