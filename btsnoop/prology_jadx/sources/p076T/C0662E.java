package p076T;

/* renamed from: T.E */
/* loaded from: classes.dex */
public final class C0662E {

    /* renamed from: y */
    public static final p076T.C0662E f2173y = new p076T.C0662E(new java.lang.Object());

    /* renamed from: a */
    public final java.lang.CharSequence f2174a;

    /* renamed from: b */
    public final java.lang.CharSequence f2175b;

    /* renamed from: c */
    public final java.lang.CharSequence f2176c;

    /* renamed from: d */
    public final java.lang.CharSequence f2177d;

    /* renamed from: e */
    public final java.lang.CharSequence f2178e;

    /* renamed from: f */
    public final byte[] f2179f;

    /* renamed from: g */
    public final java.lang.Integer f2180g;

    /* renamed from: h */
    public final java.lang.Integer f2181h;

    /* renamed from: i */
    public final java.lang.Integer f2182i;

    /* renamed from: j */
    public final java.lang.Integer f2183j;

    /* renamed from: k */
    public final java.lang.Boolean f2184k;

    /* renamed from: l */
    public final java.lang.Integer f2185l;

    /* renamed from: m */
    public final java.lang.Integer f2186m;

    /* renamed from: n */
    public final java.lang.Integer f2187n;

    /* renamed from: o */
    public final java.lang.Integer f2188o;

    /* renamed from: p */
    public final java.lang.Integer f2189p;

    /* renamed from: q */
    public final java.lang.Integer f2190q;

    /* renamed from: r */
    public final java.lang.Integer f2191r;

    /* renamed from: s */
    public final java.lang.CharSequence f2192s;

    /* renamed from: t */
    public final java.lang.CharSequence f2193t;

    /* renamed from: u */
    public final java.lang.CharSequence f2194u;

    /* renamed from: v */
    public final java.lang.CharSequence f2195v;

    /* renamed from: w */
    public final java.lang.CharSequence f2196w;

    /* renamed from: x */
    public final java.lang.Integer f2197x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T.D] */
    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
        p009B2.AbstractC0051h.m155n(5, 6, 8, 9, 10);
        p009B2.AbstractC0051h.m155n(11, 12, 13, 14, 15);
        p009B2.AbstractC0051h.m155n(16, 17, 18, 19, 20);
        p009B2.AbstractC0051h.m155n(21, 22, 23, 24, 25);
        p009B2.AbstractC0051h.m155n(26, 27, 28, 29, 30);
        p086W.AbstractC0805y.m1587H(31);
        p086W.AbstractC0805y.m1587H(32);
        p086W.AbstractC0805y.m1587H(33);
        p086W.AbstractC0805y.m1587H(1000);
    }

    public C0662E(p076T.C0661D c0661d) {
        java.lang.Boolean bool = c0661d.f2160k;
        java.lang.Integer num = c0661d.f2159j;
        java.lang.Integer num2 = c0661d.f2172w;
        int i4 = 1;
        int i5 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i4 = 0;
                            break;
                        case 21:
                            i4 = 2;
                            break;
                        case 22:
                            i4 = 3;
                            break;
                        case 23:
                            i4 = 4;
                            break;
                        case 24:
                            i4 = 5;
                            break;
                        case 25:
                            i4 = 6;
                            break;
                    }
                    i5 = i4;
                }
                num = java.lang.Integer.valueOf(i5);
            }
        } else if (num != null) {
            boolean z4 = num.intValue() != -1;
            bool = java.lang.Boolean.valueOf(z4);
            if (z4 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        i5 = 21;
                        break;
                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                        i5 = 22;
                        break;
                    case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                        i5 = 23;
                        break;
                    case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                        i5 = 24;
                        break;
                    case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 25;
                        break;
                    default:
                        i5 = 20;
                        break;
                }
                num2 = java.lang.Integer.valueOf(i5);
            }
        }
        this.f2174a = c0661d.f2150a;
        this.f2175b = c0661d.f2151b;
        this.f2176c = c0661d.f2152c;
        this.f2177d = c0661d.f2153d;
        this.f2178e = c0661d.f2154e;
        this.f2179f = c0661d.f2155f;
        this.f2180g = c0661d.f2156g;
        this.f2181h = c0661d.f2157h;
        this.f2182i = c0661d.f2158i;
        this.f2183j = num;
        this.f2184k = bool;
        java.lang.Integer num3 = c0661d.f2161l;
        this.f2185l = num3;
        this.f2186m = num3;
        this.f2187n = c0661d.f2162m;
        this.f2188o = c0661d.f2163n;
        this.f2189p = c0661d.f2164o;
        this.f2190q = c0661d.f2165p;
        this.f2191r = c0661d.f2166q;
        this.f2192s = c0661d.f2167r;
        this.f2193t = c0661d.f2168s;
        this.f2194u = c0661d.f2169t;
        this.f2195v = c0661d.f2170u;
        this.f2196w = c0661d.f2171v;
        this.f2197x = num2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T.D] */
    /* renamed from: a */
    public final p076T.C0661D m1185a() {
        ?? obj = new java.lang.Object();
        obj.f2150a = this.f2174a;
        obj.f2151b = this.f2175b;
        obj.f2152c = this.f2176c;
        obj.f2153d = this.f2177d;
        obj.f2154e = this.f2178e;
        obj.f2155f = this.f2179f;
        obj.f2156g = this.f2180g;
        obj.f2157h = this.f2181h;
        obj.f2158i = this.f2182i;
        obj.f2159j = this.f2183j;
        obj.f2160k = this.f2184k;
        obj.f2161l = this.f2186m;
        obj.f2162m = this.f2187n;
        obj.f2163n = this.f2188o;
        obj.f2164o = this.f2189p;
        obj.f2165p = this.f2190q;
        obj.f2166q = this.f2191r;
        obj.f2167r = this.f2192s;
        obj.f2168s = this.f2193t;
        obj.f2169t = this.f2194u;
        obj.f2170u = this.f2195v;
        obj.f2171v = this.f2196w;
        obj.f2172w = this.f2197x;
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0662E.class != obj.getClass()) {
            return false;
        }
        p076T.C0662E c0662e = (p076T.C0662E) obj;
        return p086W.AbstractC0805y.m1606a(this.f2174a, c0662e.f2174a) && p086W.AbstractC0805y.m1606a(this.f2175b, c0662e.f2175b) && p086W.AbstractC0805y.m1606a(this.f2176c, c0662e.f2176c) && p086W.AbstractC0805y.m1606a(this.f2177d, c0662e.f2177d) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(this.f2178e, c0662e.f2178e) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(null, null) && java.util.Arrays.equals(this.f2179f, c0662e.f2179f) && p086W.AbstractC0805y.m1606a(this.f2180g, c0662e.f2180g) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(this.f2181h, c0662e.f2181h) && p086W.AbstractC0805y.m1606a(this.f2182i, c0662e.f2182i) && p086W.AbstractC0805y.m1606a(this.f2183j, c0662e.f2183j) && p086W.AbstractC0805y.m1606a(this.f2184k, c0662e.f2184k) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(this.f2186m, c0662e.f2186m) && p086W.AbstractC0805y.m1606a(this.f2187n, c0662e.f2187n) && p086W.AbstractC0805y.m1606a(this.f2188o, c0662e.f2188o) && p086W.AbstractC0805y.m1606a(this.f2189p, c0662e.f2189p) && p086W.AbstractC0805y.m1606a(this.f2190q, c0662e.f2190q) && p086W.AbstractC0805y.m1606a(this.f2191r, c0662e.f2191r) && p086W.AbstractC0805y.m1606a(this.f2192s, c0662e.f2192s) && p086W.AbstractC0805y.m1606a(this.f2193t, c0662e.f2193t) && p086W.AbstractC0805y.m1606a(this.f2194u, c0662e.f2194u) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(this.f2195v, c0662e.f2195v) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(this.f2196w, c0662e.f2196w) && p086W.AbstractC0805y.m1606a(this.f2197x, c0662e.f2197x);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f2174a, this.f2175b, this.f2176c, this.f2177d, null, null, this.f2178e, null, null, null, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.f2179f)), this.f2180g, null, this.f2181h, this.f2182i, this.f2183j, this.f2184k, null, this.f2186m, this.f2187n, this.f2188o, this.f2189p, this.f2190q, this.f2191r, this.f2192s, this.f2193t, this.f2194u, null, null, this.f2195v, null, this.f2196w, this.f2197x, true});
    }
}
