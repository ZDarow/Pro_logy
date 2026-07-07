package z;

import java.util.List;
import java.util.Objects;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628a {

    /* renamed from: a, reason: collision with root package name */
    public String f9186a;

    /* renamed from: b, reason: collision with root package name */
    public String f9187b;

    /* renamed from: c, reason: collision with root package name */
    public List f9188c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0628a)) {
            return false;
        }
        C0628a c0628a = (C0628a) obj;
        return Objects.equals(this.f9186a, c0628a.f9186a) && Objects.equals(this.f9187b, c0628a.f9187b) && Objects.equals(this.f9188c, c0628a.f9188c);
    }

    public final int hashCode() {
        return Objects.hash(this.f9186a, this.f9187b, this.f9188c);
    }
}
