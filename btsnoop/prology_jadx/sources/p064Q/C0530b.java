package p064Q;

/* renamed from: Q.b */
/* loaded from: classes.dex */
public final class C0530b {

    /* renamed from: g */
    public static final androidx.media.AudioAttributesCompat f1554g;

    /* renamed from: a */
    public final int f1555a;

    /* renamed from: b */
    public final p186r2.C2068b f1556b;

    /* renamed from: c */
    public final android.os.Handler f1557c;

    /* renamed from: d */
    public final androidx.media.AudioAttributesCompat f1558d;

    /* renamed from: e */
    public final boolean f1559e;

    /* renamed from: f */
    public final android.media.AudioFocusRequest f1560f;

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    static {
        int i4 = androidx.media.AudioAttributesCompat.f4343b;
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        builder.setUsage(1);
        f1554g = new androidx.media.AudioAttributesCompat(new androidx.media.AudioAttributesImplApi21(builder.build()));
    }

    public C0530b(int i4, p186r2.C2068b c2068b, android.os.Handler handler, androidx.media.AudioAttributesCompat audioAttributesCompat, boolean z4) {
        this.f1555a = i4;
        this.f1557c = handler;
        this.f1558d = audioAttributesCompat;
        this.f1559e = z4;
        this.f1556b = c2068b;
        this.f1560f = p064Q.AbstractC0529a.m1034a(i4, audioAttributesCompat != null ? (android.media.AudioAttributes) audioAttributesCompat.f4344a.mo2670a() : null, z4, c2068b, handler);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p064Q.C0530b)) {
            return false;
        }
        p064Q.C0530b c0530b = (p064Q.C0530b) obj;
        return this.f1555a == c0530b.f1555a && this.f1559e == c0530b.f1559e && equals(c0530b.f1556b) && this.f1557c.equals(c0530b.f1557c) && java.util.Objects.equals(this.f1558d, c0530b.f1558d);
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f1555a), this.f1556b, this.f1557c, this.f1558d, java.lang.Boolean.valueOf(this.f1559e));
    }
}
