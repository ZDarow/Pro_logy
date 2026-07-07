package j0;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f6917a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6918b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6919c;

    public x(String str, boolean z4, boolean z5) {
        this.f6917a = str;
        this.f6918b = z4;
        this.f6919c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != x.class) {
            return false;
        }
        x xVar = (x) obj;
        return TextUtils.equals(this.f6917a, xVar.f6917a) && this.f6918b == xVar.f6918b && this.f6919c == xVar.f6919c;
    }

    public final int hashCode() {
        return ((((this.f6917a.hashCode() + 31) * 31) + (this.f6918b ? 1231 : 1237)) * 31) + (this.f6919c ? 1231 : 1237);
    }
}
