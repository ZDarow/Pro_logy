package U;

import W.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2465e = new b(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2467b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2468c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2469d;

    public b(int i4, int i5, int i6) {
        this.f2466a = i4;
        this.f2467b = i5;
        this.f2468c = i6;
        this.f2469d = y.I(i6) ? y.B(i6, i5) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2466a == bVar.f2466a && this.f2467b == bVar.f2467b && this.f2468c == bVar.f2468c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2466a), Integer.valueOf(this.f2467b), Integer.valueOf(this.f2468c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f2466a + ", channelCount=" + this.f2467b + ", encoding=" + this.f2468c + ']';
    }
}
