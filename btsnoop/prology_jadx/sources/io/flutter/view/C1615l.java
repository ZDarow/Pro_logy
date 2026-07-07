package io.flutter.view;

/* renamed from: io.flutter.view.l */
/* loaded from: classes.dex */
public final class C1615l {

    /* renamed from: a */
    public final android.view.View f6787a;

    /* renamed from: b */
    public final int f6788b;

    public C1615l(android.view.View view, int i4) {
        this.f6787a = view;
        this.f6788b = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.flutter.view.C1615l)) {
            return false;
        }
        io.flutter.view.C1615l c1615l = (io.flutter.view.C1615l) obj;
        return this.f6788b == c1615l.f6788b && this.f6787a.equals(c1615l.f6787a);
    }

    public final int hashCode() {
        return ((this.f6787a.hashCode() + 31) * 31) + this.f6788b;
    }
}
