package N1;

import java.util.Arrays;

/* renamed from: N1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1254a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.d f1255b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.b f1256c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1257d;

    public C0058b(B1.d dVar, M1.b bVar, String str) {
        this.f1255b = dVar;
        this.f1256c = bVar;
        this.f1257d = str;
        this.f1254a = Arrays.hashCode(new Object[]{dVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0058b)) {
            return false;
        }
        C0058b c0058b = (C0058b) obj;
        return O1.s.f(this.f1255b, c0058b.f1255b) && O1.s.f(this.f1256c, c0058b.f1256c) && O1.s.f(this.f1257d, c0058b.f1257d);
    }

    public final int hashCode() {
        return this.f1254a;
    }
}
