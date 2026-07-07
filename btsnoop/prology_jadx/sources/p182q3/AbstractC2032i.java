package p182q3;

/* renamed from: q3.i */
/* loaded from: classes.dex */
public abstract class AbstractC2032i extends p182q3.AbstractC2031h {
    /* renamed from: g0 */
    public static boolean m4073g0(java.lang.String str, java.lang.String str2) {
        return m4076j0(2, str, str2, false) >= 0;
    }

    /* renamed from: h0 */
    public static final int m4074h0(java.lang.CharSequence charSequence) {
        p154k3.AbstractC1803h.m3779e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: i0 */
    public static final int m4075i0(int i4, java.lang.String str, java.lang.String str2, boolean z4) {
        int i5;
        char upperCase;
        char upperCase2;
        p154k3.AbstractC1803h.m3779e(str2, "string");
        if (!z4) {
            return str.indexOf(str2, i4);
        }
        int length = str.length();
        if (i4 < 0) {
            i4 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        p169n3.C1923a c1923a = new p169n3.C1923a(i4, length, 1);
        int i6 = c1923a.f7814n;
        int i7 = c1923a.f7813m;
        int i8 = c1923a.f7812l;
        if (str != null && str2 != null) {
            if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
                while (!m4080n0(0, i8, str2.length(), str2, str, z4)) {
                    if (i8 != i7) {
                        i8 += i6;
                    }
                }
                return i8;
            }
            return -1;
        }
        if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
            loop1: while (true) {
                int length3 = str2.length();
                p154k3.AbstractC1803h.m3779e(str, "other");
                if (i8 >= 0 && str2.length() - length3 >= 0 && i8 <= str.length() - length3) {
                    for (0; i5 < length3; i5 + 1) {
                        char charAt = str2.charAt(i5);
                        char charAt2 = str.charAt(i8 + i5);
                        i5 = (charAt == charAt2 || (z4 && ((upperCase = java.lang.Character.toUpperCase(charAt)) == (upperCase2 = java.lang.Character.toUpperCase(charAt2)) || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2)))) ? i5 + 1 : 0;
                    }
                    break loop1;
                }
                if (i8 == i7) {
                    break;
                }
                i8 += i6;
            }
        }
        return -1;
    }

    /* renamed from: j0 */
    public static /* synthetic */ int m4076j0(int i4, java.lang.String str, java.lang.String str2, boolean z4) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return m4075i0(0, str, str2, z4);
    }

    /* renamed from: k0 */
    public static int m4077k0(java.lang.String str, char c4, boolean z4, int i4) {
        char upperCase;
        char upperCase2;
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        if (!z4) {
            return str.indexOf(c4, 0);
        }
        char[] cArr = {c4};
        if (!z4) {
            return str.indexOf(cArr[0], 0);
        }
        int m4074h0 = m4074h0(str);
        if (m4074h0 >= 0) {
            int i5 = 0;
            while (true) {
                char charAt = str.charAt(i5);
                char c5 = cArr[0];
                if (c5 != charAt && (!z4 || ((upperCase = java.lang.Character.toUpperCase(c5)) != (upperCase2 = java.lang.Character.toUpperCase(charAt)) && java.lang.Character.toLowerCase(upperCase) != java.lang.Character.toLowerCase(upperCase2)))) {
                    if (i5 == m4074h0) {
                        break;
                    }
                    i5++;
                }
            }
            return i5;
        }
        return -1;
    }

    /* renamed from: l0 */
    public static boolean m4078l0(java.lang.CharSequence charSequence) {
        p154k3.AbstractC1803h.m3779e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!java.lang.Character.isWhitespace(charAt) && !java.lang.Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m0 */
    public static int m4079m0(java.lang.String str, java.lang.String str2) {
        int m4074h0 = m4074h0(str);
        p154k3.AbstractC1803h.m3779e(str, "<this>");
        return str.lastIndexOf(str2, m4074h0);
    }

    /* renamed from: n0 */
    public static final boolean m4080n0(int i4, int i5, int i6, java.lang.String str, java.lang.String str2, boolean z4) {
        p154k3.AbstractC1803h.m3779e(str, "<this>");
        p154k3.AbstractC1803h.m3779e(str2, "other");
        return !z4 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z4, i4, str2, i5, i6);
    }

    /* renamed from: o0 */
    public static java.lang.String m4081o0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int m4075i0 = m4075i0(0, str, str2, false);
        if (m4075i0 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((java.lang.CharSequence) str, i5, m4075i0);
            sb.append(str3);
            i5 = m4075i0 + length;
            if (m4075i0 >= str.length()) {
                break;
            }
            m4075i0 = m4075i0(m4075i0 + i4, str, str2, false);
        } while (m4075i0 > 0);
        sb.append((java.lang.CharSequence) str, i5, str.length());
        java.lang.String sb2 = sb.toString();
        p154k3.AbstractC1803h.m3778d(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: p0 */
    public static boolean m4082p0(java.lang.String str, java.lang.String str2) {
        p154k3.AbstractC1803h.m3779e(str, "<this>");
        p154k3.AbstractC1803h.m3779e(str2, "prefix");
        return str.startsWith(str2);
    }

    /* renamed from: q0 */
    public static java.lang.String m4083q0(java.lang.String str, java.lang.String str2) {
        p154k3.AbstractC1803h.m3779e(str2, "delimiter");
        int m4076j0 = m4076j0(6, str, str2, false);
        if (m4076j0 == -1) {
            return str;
        }
        java.lang.String substring = str.substring(str2.length() + m4076j0, str.length());
        p154k3.AbstractC1803h.m3778d(substring, "substring(...)");
        return substring;
    }
}
