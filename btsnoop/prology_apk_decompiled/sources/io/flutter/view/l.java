package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final View f6540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6541b;

    public l(View view, int i4) {
        this.f6540a = view;
        this.f6541b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6541b == lVar.f6541b && this.f6540a.equals(lVar.f6540a);
    }

    public final int hashCode() {
        return ((this.f6540a.hashCode() + 31) * 31) + this.f6541b;
    }
}
