package u1;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583c {

    /* renamed from: a, reason: collision with root package name */
    public final r1.b f8572a;

    /* renamed from: b, reason: collision with root package name */
    public final C0582b f8573b;

    /* renamed from: c, reason: collision with root package name */
    public final C0582b f8574c;

    public C0583c(r1.b bVar, C0582b c0582b, C0582b c0582b2) {
        this.f8572a = bVar;
        this.f8573b = c0582b;
        this.f8574c = c0582b2;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f8070a != 0 && bVar.f8071b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0583c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k3.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0583c c0583c = (C0583c) obj;
        return k3.h.a(this.f8572a, c0583c.f8572a) && k3.h.a(this.f8573b, c0583c.f8573b) && k3.h.a(this.f8574c, c0583c.f8574c);
    }

    public final int hashCode() {
        return this.f8574c.hashCode() + ((this.f8573b.hashCode() + (this.f8572a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0583c.class.getSimpleName() + " { " + this.f8572a + ", type=" + this.f8573b + ", state=" + this.f8574c + " }";
    }
}
