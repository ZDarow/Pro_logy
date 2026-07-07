package a0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final long f3332a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3333b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3334c;

    public Q(P p2) {
        this.f3332a = p2.f3329a;
        this.f3333b = p2.f3330b;
        this.f3334c = p2.f3331c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q4 = (Q) obj;
        return this.f3332a == q4.f3332a && this.f3333b == q4.f3333b && this.f3334c == q4.f3334c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3332a), Float.valueOf(this.f3333b), Long.valueOf(this.f3334c)});
    }
}
