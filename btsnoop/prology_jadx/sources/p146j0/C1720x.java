package p146j0;

/* renamed from: j0.x */
/* loaded from: classes.dex */
public final class C1720x {

    /* renamed from: a */
    public final java.lang.String f7179a;

    /* renamed from: b */
    public final boolean f7180b;

    /* renamed from: c */
    public final boolean f7181c;

    public C1720x(java.lang.String str, boolean z4, boolean z5) {
        this.f7179a = str;
        this.f7180b = z4;
        this.f7181c = z5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != p146j0.C1720x.class) {
            return false;
        }
        p146j0.C1720x c1720x = (p146j0.C1720x) obj;
        return android.text.TextUtils.equals(this.f7179a, c1720x.f7179a) && this.f7180b == c1720x.f7180b && this.f7181c == c1720x.f7181c;
    }

    public final int hashCode() {
        return ((((this.f7179a.hashCode() + 31) * 31) + (this.f7180b ? 1231 : 1237)) * 31) + (this.f7181c ? 1231 : 1237);
    }
}
