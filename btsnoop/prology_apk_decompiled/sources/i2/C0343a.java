package i2;

import java.io.Serializable;
import p1.AbstractC0462a;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343a implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f6200n = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f6201l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6202m;

    static {
        new C0343a(new int[0]);
    }

    public C0343a(int[] iArr) {
        int length = iArr.length;
        this.f6201l = iArr;
        this.f6202m = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0343a)) {
            return false;
        }
        C0343a c0343a = (C0343a) obj;
        int i4 = c0343a.f6202m;
        int i5 = this.f6202m;
        if (i5 != i4) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            AbstractC0462a.l(i6, i5);
            int i7 = this.f6201l[i6];
            AbstractC0462a.l(i6, c0343a.f6202m);
            if (i7 != c0343a.f6201l[i6]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f6202m; i5++) {
            i4 = (i4 * 31) + this.f6201l[i5];
        }
        return i4;
    }

    public final String toString() {
        int i4 = this.f6202m;
        if (i4 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i4 * 5);
        sb.append('[');
        int[] iArr = this.f6201l;
        sb.append(iArr[0]);
        for (int i5 = 1; i5 < i4; i5++) {
            sb.append(", ");
            sb.append(iArr[i5]);
        }
        sb.append(']');
        return sb.toString();
    }
}
