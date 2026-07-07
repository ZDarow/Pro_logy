package e0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f5070a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5072c;

    /* renamed from: d, reason: collision with root package name */
    public int f5073d;

    public j(long j4, long j5, String str) {
        this.f5072c = str == null ? "" : str;
        this.f5070a = j4;
        this.f5071b = j5;
    }

    public final j a(j jVar, String str) {
        long j4;
        String x3 = W.a.x(str, this.f5072c);
        if (jVar == null || !x3.equals(W.a.x(str, jVar.f5072c))) {
            return null;
        }
        long j5 = this.f5071b;
        long j6 = jVar.f5071b;
        if (j5 != -1) {
            long j7 = this.f5070a;
            j4 = j5;
            if (j7 + j5 == jVar.f5070a) {
                return new j(j7, j6 == -1 ? -1L : j4 + j6, x3);
            }
        } else {
            j4 = j5;
        }
        if (j6 != -1) {
            long j8 = jVar.f5070a;
            if (j8 + j6 == this.f5070a) {
                return new j(j8, j4 == -1 ? -1L : j6 + j4, x3);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f5070a == jVar.f5070a && this.f5071b == jVar.f5071b && this.f5072c.equals(jVar.f5072c);
    }

    public final int hashCode() {
        if (this.f5073d == 0) {
            this.f5073d = this.f5072c.hashCode() + ((((527 + ((int) this.f5070a)) * 31) + ((int) this.f5071b)) * 31);
        }
        return this.f5073d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f5072c + ", start=" + this.f5070a + ", length=" + this.f5071b + ")";
    }
}
