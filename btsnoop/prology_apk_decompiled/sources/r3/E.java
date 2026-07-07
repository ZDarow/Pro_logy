package r3;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8113l;

    public E(boolean z4) {
        this.f8113l = z4;
    }

    @Override // r3.L
    public final boolean a() {
        return this.f8113l;
    }

    @Override // r3.L
    public final a0 g() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f8113l ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
