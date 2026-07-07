package T;

import B2.AbstractC0007h;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: y, reason: collision with root package name */
    public static final E f2095y = new E(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2096a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2097b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f2098c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f2099d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f2100e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2101f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f2102g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f2103h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f2104i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f2105j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f2106k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f2107l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f2108m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f2109n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f2110o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f2111p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f2112q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f2113r;
    public final CharSequence s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f2114t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f2115u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f2116v;
    public final CharSequence w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f2117x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T.D] */
    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
        AbstractC0007h.n(5, 6, 8, 9, 10);
        AbstractC0007h.n(11, 12, 13, 14, 15);
        AbstractC0007h.n(16, 17, 18, 19, 20);
        AbstractC0007h.n(21, 22, 23, 24, 25);
        AbstractC0007h.n(26, 27, 28, 29, 30);
        W.y.H(31);
        W.y.H(32);
        W.y.H(33);
        W.y.H(1000);
    }

    public E(D d4) {
        Boolean bool = d4.f2084k;
        Integer num = d4.f2083j;
        Integer num2 = d4.w;
        int i4 = 1;
        int i5 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
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
                num = Integer.valueOf(i5);
            }
        } else if (num != null) {
            boolean z4 = num.intValue() != -1;
            bool = Boolean.valueOf(z4);
            if (z4 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i5 = 21;
                        break;
                    case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                        i5 = 22;
                        break;
                    case L.k.LONG_FIELD_NUMBER /* 4 */:
                        i5 = 23;
                        break;
                    case L.k.STRING_FIELD_NUMBER /* 5 */:
                        i5 = 24;
                        break;
                    case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        i5 = 25;
                        break;
                    default:
                        i5 = 20;
                        break;
                }
                num2 = Integer.valueOf(i5);
            }
        }
        this.f2096a = d4.f2074a;
        this.f2097b = d4.f2075b;
        this.f2098c = d4.f2076c;
        this.f2099d = d4.f2077d;
        this.f2100e = d4.f2078e;
        this.f2101f = d4.f2079f;
        this.f2102g = d4.f2080g;
        this.f2103h = d4.f2081h;
        this.f2104i = d4.f2082i;
        this.f2105j = num;
        this.f2106k = bool;
        Integer num3 = d4.f2085l;
        this.f2107l = num3;
        this.f2108m = num3;
        this.f2109n = d4.f2086m;
        this.f2110o = d4.f2087n;
        this.f2111p = d4.f2088o;
        this.f2112q = d4.f2089p;
        this.f2113r = d4.f2090q;
        this.s = d4.f2091r;
        this.f2114t = d4.s;
        this.f2115u = d4.f2092t;
        this.f2116v = d4.f2093u;
        this.w = d4.f2094v;
        this.f2117x = num2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T.D] */
    public final D a() {
        ?? obj = new Object();
        obj.f2074a = this.f2096a;
        obj.f2075b = this.f2097b;
        obj.f2076c = this.f2098c;
        obj.f2077d = this.f2099d;
        obj.f2078e = this.f2100e;
        obj.f2079f = this.f2101f;
        obj.f2080g = this.f2102g;
        obj.f2081h = this.f2103h;
        obj.f2082i = this.f2104i;
        obj.f2083j = this.f2105j;
        obj.f2084k = this.f2106k;
        obj.f2085l = this.f2108m;
        obj.f2086m = this.f2109n;
        obj.f2087n = this.f2110o;
        obj.f2088o = this.f2111p;
        obj.f2089p = this.f2112q;
        obj.f2090q = this.f2113r;
        obj.f2091r = this.s;
        obj.s = this.f2114t;
        obj.f2092t = this.f2115u;
        obj.f2093u = this.f2116v;
        obj.f2094v = this.w;
        obj.w = this.f2117x;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e4 = (E) obj;
        return W.y.a(this.f2096a, e4.f2096a) && W.y.a(this.f2097b, e4.f2097b) && W.y.a(this.f2098c, e4.f2098c) && W.y.a(this.f2099d, e4.f2099d) && W.y.a(null, null) && W.y.a(null, null) && W.y.a(this.f2100e, e4.f2100e) && W.y.a(null, null) && W.y.a(null, null) && W.y.a(null, null) && Arrays.equals(this.f2101f, e4.f2101f) && W.y.a(this.f2102g, e4.f2102g) && W.y.a(null, null) && W.y.a(this.f2103h, e4.f2103h) && W.y.a(this.f2104i, e4.f2104i) && W.y.a(this.f2105j, e4.f2105j) && W.y.a(this.f2106k, e4.f2106k) && W.y.a(null, null) && W.y.a(this.f2108m, e4.f2108m) && W.y.a(this.f2109n, e4.f2109n) && W.y.a(this.f2110o, e4.f2110o) && W.y.a(this.f2111p, e4.f2111p) && W.y.a(this.f2112q, e4.f2112q) && W.y.a(this.f2113r, e4.f2113r) && W.y.a(this.s, e4.s) && W.y.a(this.f2114t, e4.f2114t) && W.y.a(this.f2115u, e4.f2115u) && W.y.a(null, null) && W.y.a(null, null) && W.y.a(this.f2116v, e4.f2116v) && W.y.a(null, null) && W.y.a(this.w, e4.w) && W.y.a(this.f2117x, e4.f2117x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2096a, this.f2097b, this.f2098c, this.f2099d, null, null, this.f2100e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f2101f)), this.f2102g, null, this.f2103h, this.f2104i, this.f2105j, this.f2106k, null, this.f2108m, this.f2109n, this.f2110o, this.f2111p, this.f2112q, this.f2113r, this.s, this.f2114t, this.f2115u, null, null, this.f2116v, null, this.w, this.f2117x, true});
    }
}
