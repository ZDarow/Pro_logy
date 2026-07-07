package p086W;

/* renamed from: W.a */
/* loaded from: classes.dex */
public abstract class AbstractC0781a {

    /* renamed from: a */
    public static final byte[] f2732a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final java.lang.String[] f2733b = {"", "A", "B", "C"};

    /* renamed from: c */
    public static final java.lang.Object f2734c = new java.lang.Object();

    /* renamed from: A */
    public static void m1410A(java.lang.String str, java.lang.String str2) {
        synchronized (f2734c) {
            android.util.Log.w(str, m1412a(str2, null));
        }
    }

    /* renamed from: B */
    public static void m1411B(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (f2734c) {
            android.util.Log.w(str, m1412a(str2, th));
        }
    }

    /* renamed from: a */
    public static java.lang.String m1412a(java.lang.String str, java.lang.Throwable th) {
        java.lang.String replace;
        if (th != null) {
            synchronized (f2734c) {
                java.lang.Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof java.net.UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (android.text.TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static java.lang.String m1413b(int i4, int i5, int i6) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6));
    }

    /* renamed from: c */
    public static java.lang.String m1414c(int i4, boolean z4, int i5, int i6, int[] iArr, int i7) {
        java.lang.Object[] objArr = {f2733b[i4], java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), java.lang.Character.valueOf(z4 ? 'H' : 'L'), java.lang.Integer.valueOf(i7)};
        int i8 = p086W.AbstractC0805y.f2801a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.format(java.util.Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i9 = 0; i9 < length; i9++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i9])));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m1415d(java.lang.String str, boolean z4) {
        if (!z4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(str));
        }
    }

    /* renamed from: e */
    public static void m1416e(boolean z4) {
        if (!z4) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m1417f(java.lang.String str, boolean z4) {
        if (!z4) {
            throw new java.lang.Exception(str);
        }
    }

    /* renamed from: g */
    public static void m1418g(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    /* renamed from: h */
    public static void m1419h(java.lang.Object obj) {
        obj.getClass();
    }

    /* renamed from: i */
    public static void m1420i(java.lang.String str, boolean z4) {
        if (!z4) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(str));
        }
    }

    /* renamed from: j */
    public static void m1421j(boolean z4) {
        if (!z4) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* renamed from: k */
    public static void m1422k(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* renamed from: l */
    public static void m1423l(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    /* renamed from: m */
    public static void m1424m(java.lang.String str, java.lang.String str2) {
        synchronized (f2734c) {
            android.util.Log.d(str, m1412a(str2, null));
        }
    }

    /* renamed from: n */
    public static void m1425n(java.lang.String str, java.lang.String str2) {
        synchronized (f2734c) {
            android.util.Log.e(str, m1412a(str2, null));
        }
    }

    /* renamed from: o */
    public static void m1426o(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (f2734c) {
            android.util.Log.e(str, m1412a(str2, th));
        }
    }

    /* renamed from: p */
    public static java.lang.String m1427p(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if (xmlPullParser.getAttributeName(i4).equals(str)) {
                return xmlPullParser.getAttributeValue(i4);
            }
        }
        return null;
    }

    /* renamed from: q */
    public static int[] m1428q(java.lang.String str) {
        int i4;
        int[] iArr = new int[4];
        if (android.text.TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i5 = indexOf4 + 2;
        if (i5 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i5) == '/') {
            i4 = str.indexOf(47, indexOf4 + 3);
            if (i4 == -1 || i4 > indexOf2) {
                i4 = indexOf2;
            }
        } else {
            i4 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i4;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: r */
    public static void m1429r(java.lang.String str, java.lang.String str2) {
        synchronized (f2734c) {
            android.util.Log.i(str, m1412a(str2, null));
        }
    }

    /* renamed from: s */
    public static boolean m1430s(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* renamed from: t */
    public static boolean m1431t(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: u */
    public static boolean m1432u(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return m1431t(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: v */
    public static void m1433v(android.media.MediaFormat mediaFormat, java.lang.String str, int i4) {
        if (i4 != -1) {
            mediaFormat.setInteger(str, i4);
        }
    }

    /* renamed from: w */
    public static java.lang.String m1434w(java.lang.StringBuilder sb, int i4, int i5) {
        int i6;
        int i7;
        if (i4 >= i5) {
            return sb.toString();
        }
        if (sb.charAt(i4) == '/') {
            i4++;
        }
        int i8 = i4;
        int i9 = i8;
        while (i8 <= i5) {
            if (i8 == i5) {
                i6 = i8;
            } else if (sb.charAt(i8) == '/') {
                i6 = i8 + 1;
            } else {
                i8++;
            }
            int i10 = i9 + 1;
            if (i8 == i10 && sb.charAt(i9) == '.') {
                sb.delete(i9, i6);
                i5 -= i6 - i9;
            } else {
                if (i8 == i9 + 2 && sb.charAt(i9) == '.' && sb.charAt(i10) == '.') {
                    i7 = sb.lastIndexOf("/", i9 - 2) + 1;
                    int i11 = i7 > i4 ? i7 : i4;
                    sb.delete(i11, i6);
                    i5 -= i6 - i11;
                } else {
                    i7 = i8 + 1;
                }
                i9 = i7;
            }
            i8 = i9;
        }
        return sb.toString();
    }

    /* renamed from: x */
    public static java.lang.String m1435x(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] m1428q = m1428q(str2);
        if (m1428q[0] != -1) {
            sb.append(str2);
            m1434w(sb, m1428q[1], m1428q[2]);
            return sb.toString();
        }
        int[] m1428q2 = m1428q(str);
        if (m1428q[3] == 0) {
            sb.append((java.lang.CharSequence) str, 0, m1428q2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (m1428q[2] == 0) {
            sb.append((java.lang.CharSequence) str, 0, m1428q2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i4 = m1428q[1];
        if (i4 != 0) {
            int i5 = m1428q2[0] + 1;
            sb.append((java.lang.CharSequence) str, 0, i5);
            sb.append(str2);
            return m1434w(sb, m1428q[1] + i5, i5 + m1428q[2]);
        }
        if (str2.charAt(i4) == '/') {
            sb.append((java.lang.CharSequence) str, 0, m1428q2[1]);
            sb.append(str2);
            int i6 = m1428q2[1];
            return m1434w(sb, i6, m1428q[2] + i6);
        }
        int i7 = m1428q2[0] + 2;
        int i8 = m1428q2[1];
        if (i7 >= i8 || i8 != m1428q2[2]) {
            int lastIndexOf = str.lastIndexOf(47, m1428q2[2] - 1);
            int i9 = lastIndexOf == -1 ? m1428q2[1] : lastIndexOf + 1;
            sb.append((java.lang.CharSequence) str, 0, i9);
            sb.append(str2);
            return m1434w(sb, m1428q2[1], i9 + m1428q[2]);
        }
        sb.append((java.lang.CharSequence) str, 0, i8);
        sb.append('/');
        sb.append(str2);
        int i10 = m1428q2[1];
        return m1434w(sb, i10, m1428q[2] + i10 + 1);
    }

    /* renamed from: y */
    public static android.net.Uri m1436y(java.lang.String str, java.lang.String str2) {
        return android.net.Uri.parse(m1435x(str, str2));
    }

    /* renamed from: z */
    public static void m1437z(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            mediaFormat.setByteBuffer(p009B2.AbstractC0051h.m152k("csd-", i4), java.nio.ByteBuffer.wrap((byte[]) list.get(i4)));
        }
    }
}
