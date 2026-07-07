package e0;

import a.AbstractC0110a;
import java.util.Arrays;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5025a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5028d;

    public C0250b(int i4, int i5, String str, String str2) {
        this.f5025a = str;
        this.f5026b = str2;
        this.f5027c = i4;
        this.f5028d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0250b)) {
            return false;
        }
        C0250b c0250b = (C0250b) obj;
        return this.f5027c == c0250b.f5027c && this.f5028d == c0250b.f5028d && AbstractC0110a.v(this.f5025a, c0250b.f5025a) && AbstractC0110a.v(this.f5026b, c0250b.f5026b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5025a, this.f5026b, Integer.valueOf(this.f5027c), Integer.valueOf(this.f5028d)});
    }
}
