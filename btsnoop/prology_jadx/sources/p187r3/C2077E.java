package p187r3;

/* renamed from: r3.E */
/* loaded from: classes.dex */
public final class C2077E implements p187r3.InterfaceC2084L {

    /* renamed from: l */
    public final boolean f8428l;

    public C2077E(boolean z4) {
        this.f8428l = z4;
    }

    @Override // p187r3.InterfaceC2084L
    /* renamed from: a */
    public final boolean mo4157a() {
        return this.f8428l;
    }

    @Override // p187r3.InterfaceC2084L
    /* renamed from: g */
    public final p187r3.C2099a0 mo4158g() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty{");
        sb.append(this.f8428l ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
