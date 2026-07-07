package q3;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static boolean g0(String str, String str2) {
        return j0(2, str, str2, false) >= 0;
    }

    public static final int h0(CharSequence charSequence) {
        k3.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int i0(int i4, String str, String str2, boolean z4) {
        int i5;
        char upperCase;
        char upperCase2;
        k3.h.e(str2, "string");
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
        n3.a aVar = new n3.a(i4, length, 1);
        int i6 = aVar.f7528n;
        int i7 = aVar.f7527m;
        int i8 = aVar.f7526l;
        if (str != null && str2 != null) {
            if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
                while (!n0(0, i8, str2.length(), str2, str, z4)) {
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
                k3.h.e(str, "other");
                if (i8 >= 0 && str2.length() - length3 >= 0 && i8 <= str.length() - length3) {
                    for (0; i5 < length3; i5 + 1) {
                        char charAt = str2.charAt(i5);
                        char charAt2 = str.charAt(i8 + i5);
                        i5 = (charAt == charAt2 || (z4 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i5 + 1 : 0;
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

    public static /* synthetic */ int j0(int i4, String str, String str2, boolean z4) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return i0(0, str, str2, z4);
    }

    public static int k0(String str, char c4, boolean z4, int i4) {
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
        int h02 = h0(str);
        if (h02 >= 0) {
            int i5 = 0;
            while (true) {
                char charAt = str.charAt(i5);
                char c5 = cArr[0];
                if (c5 != charAt && (!z4 || ((upperCase = Character.toUpperCase(c5)) != (upperCase2 = Character.toUpperCase(charAt)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                    if (i5 == h02) {
                        break;
                    }
                    i5++;
                }
            }
            return i5;
        }
        return -1;
    }

    public static boolean l0(CharSequence charSequence) {
        k3.h.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static int m0(String str, String str2) {
        int h02 = h0(str);
        k3.h.e(str, "<this>");
        return str.lastIndexOf(str2, h02);
    }

    public static final boolean n0(int i4, int i5, int i6, String str, String str2, boolean z4) {
        k3.h.e(str, "<this>");
        k3.h.e(str2, "other");
        return !z4 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z4, i4, str2, i5, i6);
    }

    public static String o0(String str, String str2, String str3) {
        int i02 = i0(0, str, str2, false);
        if (i02 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, i02);
            sb.append(str3);
            i5 = i02 + length;
            if (i02 >= str.length()) {
                break;
            }
            i02 = i0(i02 + i4, str, str2, false);
        } while (i02 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        k3.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean p0(String str, String str2) {
        k3.h.e(str, "<this>");
        k3.h.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static String q0(String str, String str2) {
        k3.h.e(str2, "delimiter");
        int j02 = j0(6, str, str2, false);
        if (j02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + j02, str.length());
        k3.h.d(substring, "substring(...)");
        return substring;
    }
}
