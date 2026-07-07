package u;

import android.graphics.Insets;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0574b f8471e = new C0574b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f8472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8475d;

    public C0574b(int i4, int i5, int i6, int i7) {
        this.f8472a = i4;
        this.f8473b = i5;
        this.f8474c = i6;
        this.f8475d = i7;
    }

    public static C0574b a(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f8471e : new C0574b(i4, i5, i6, i7);
    }

    public static C0574b b(Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return a(i4, i5, i6, i7);
    }

    public final Insets c() {
        return r.d.a(this.f8472a, this.f8473b, this.f8474c, this.f8475d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0574b.class != obj.getClass()) {
            return false;
        }
        C0574b c0574b = (C0574b) obj;
        return this.f8475d == c0574b.f8475d && this.f8472a == c0574b.f8472a && this.f8474c == c0574b.f8474c && this.f8473b == c0574b.f8473b;
    }

    public final int hashCode() {
        return (((((this.f8472a * 31) + this.f8473b) * 31) + this.f8474c) * 31) + this.f8475d;
    }

    public final String toString() {
        return "Insets{left=" + this.f8472a + ", top=" + this.f8473b + ", right=" + this.f8474c + ", bottom=" + this.f8475d + '}';
    }
}
