package p011C;

/* renamed from: C.f */
/* loaded from: classes.dex */
public final class C0114f {

    /* renamed from: a */
    public final android.view.DisplayCutout f319a;

    public C0114f(android.view.DisplayCutout displayCutout) {
        this.f319a = displayCutout;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p011C.C0114f.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f319a, ((p011C.C0114f) obj).f319a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f319a.hashCode();
        return hashCode;
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.f319a + "}";
    }
}
