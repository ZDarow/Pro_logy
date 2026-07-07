package Q;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public w f1577a;

    public u(int i4, int i5, String str) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f1577a = new w(i4, i5, str);
            return;
        }
        w wVar = new w(i4, i5, str);
        A.a.s(i4, i5, str);
        this.f1577a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.f1577a.equals(((u) obj).f1577a);
    }

    public final int hashCode() {
        return this.f1577a.hashCode();
    }
}
