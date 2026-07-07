package u1;

import C.O;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final r1.b f8589a;

    /* renamed from: b, reason: collision with root package name */
    public final O f8590b;

    public k(r1.b bVar, O o2) {
        k3.h.e(o2, "_windowInsetsCompat");
        this.f8589a = bVar;
        this.f8590b = o2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k3.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return k3.h.a(this.f8589a, kVar.f8589a) && k3.h.a(this.f8590b, kVar.f8590b);
    }

    public final int hashCode() {
        return this.f8590b.hashCode() + (this.f8589a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f8589a + ", windowInsetsCompat=" + this.f8590b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, O o2) {
        this(new r1.b(rect), o2);
        k3.h.e(o2, "insets");
    }
}
