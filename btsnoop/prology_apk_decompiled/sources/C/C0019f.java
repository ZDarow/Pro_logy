package C;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019f {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f313a;

    public C0019f(DisplayCutout displayCutout) {
        this.f313a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0019f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f313a, ((C0019f) obj).f313a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f313a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f313a + "}";
    }
}
