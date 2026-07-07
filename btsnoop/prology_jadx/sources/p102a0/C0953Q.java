package p102a0;

/* renamed from: a0.Q */
/* loaded from: classes.dex */
public final class C0953Q {

    /* renamed from: a */
    public final long f3450a;

    /* renamed from: b */
    public final float f3451b;

    /* renamed from: c */
    public final long f3452c;

    public C0953Q(p102a0.C0952P c0952p) {
        this.f3450a = c0952p.f3447a;
        this.f3451b = c0952p.f3448b;
        this.f3452c = c0952p.f3449c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p102a0.C0953Q)) {
            return false;
        }
        p102a0.C0953Q c0953q = (p102a0.C0953Q) obj;
        return this.f3450a == c0953q.f3450a && this.f3451b == c0953q.f3451b && this.f3452c == c0953q.f3452c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f3450a), java.lang.Float.valueOf(this.f3451b), java.lang.Long.valueOf(this.f3452c)});
    }
}
