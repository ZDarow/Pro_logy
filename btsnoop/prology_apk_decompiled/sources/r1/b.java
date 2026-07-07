package r1;

import B2.AbstractC0007h;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8073d;

    public b(Rect rect) {
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        this.f8070a = i4;
        this.f8071b = i5;
        this.f8072c = i6;
        this.f8073d = i7;
        if (i4 > i6) {
            throw new IllegalArgumentException(AbstractC0007h.i(i4, i6, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i5 > i7) {
            throw new IllegalArgumentException(AbstractC0007h.i(i5, i7, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f8073d - this.f8071b;
    }

    public final int b() {
        return this.f8072c - this.f8070a;
    }

    public final Rect c() {
        return new Rect(this.f8070a, this.f8071b, this.f8072c, this.f8073d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k3.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f8070a == bVar.f8070a && this.f8071b == bVar.f8071b && this.f8072c == bVar.f8072c && this.f8073d == bVar.f8073d;
    }

    public final int hashCode() {
        return (((((this.f8070a * 31) + this.f8071b) * 31) + this.f8072c) * 31) + this.f8073d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f8070a + ',' + this.f8071b + ',' + this.f8072c + ',' + this.f8073d + "] }";
    }
}
