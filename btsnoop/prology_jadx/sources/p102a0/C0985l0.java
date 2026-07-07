package p102a0;

/* renamed from: a0.l0 */
/* loaded from: classes.dex */
public final class C0985l0 {

    /* renamed from: c */
    public static final p102a0.C0985l0 f3661c = new p102a0.C0985l0(0, false);

    /* renamed from: a */
    public final int f3662a;

    /* renamed from: b */
    public final boolean f3663b;

    public C0985l0(int i4, boolean z4) {
        this.f3662a = i4;
        this.f3663b = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p102a0.C0985l0.class != obj.getClass()) {
            return false;
        }
        p102a0.C0985l0 c0985l0 = (p102a0.C0985l0) obj;
        return this.f3662a == c0985l0.f3662a && this.f3663b == c0985l0.f3663b;
    }

    public final int hashCode() {
        return (this.f3662a << 1) + (this.f3663b ? 1 : 0);
    }
}
