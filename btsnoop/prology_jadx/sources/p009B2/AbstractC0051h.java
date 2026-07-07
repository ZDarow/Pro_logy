package p009B2;

/* renamed from: B2.h */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0051h {
    public static int[] _values() {
        return p044L.AbstractC0352j.m782c(6);
    }

    /* renamed from: a */
    public static int m142a(int i4) {
        for (int i5 : p044L.AbstractC0352j.m782c(4)) {
            if (m148g(i5) == i4) {
                return i5;
            }
        }
        throw new java.lang.IllegalArgumentException(m152k("Invalid rotation degrees specified: ", i4));
    }

    /* renamed from: b */
    public static int m143b(java.lang.String str) {
        java.lang.String str2;
        for (int i4 : p044L.AbstractC0352j.m782c(2)) {
            if (i4 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i4 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i4;
            }
        }
        throw new java.lang.NoSuchFieldException(m153l("No such Brightness: ", str));
    }

    /* renamed from: c */
    public static int m144c(java.lang.String str) {
        for (int i4 : p044L.AbstractC0352j.m782c(5)) {
            java.lang.String str2 = null;
            if (i4 != 1) {
                if (i4 == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i4 == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i4 == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i4 != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i4;
            }
        }
        throw new java.lang.NoSuchFieldException(m153l("No such HapticFeedbackType: ", str));
    }

    /* renamed from: d */
    public static int m145d(java.lang.String str) {
        java.lang.String str2;
        for (int i4 : p044L.AbstractC0352j.m782c(3)) {
            if (i4 == 1) {
                str2 = "SystemSoundType.click";
            } else if (i4 == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i4 != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i4;
            }
        }
        throw new java.lang.NoSuchFieldException(m153l("No such SoundType: ", str));
    }

    /* renamed from: e */
    public static final java.lang.String m146e(int i4) {
        int m781b = p044L.AbstractC0352j.m781b(i4);
        if (m781b == 0) {
            return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
        }
        if (m781b == 1) {
            return "An unexpected error occurred while trying to acquire the device's position.";
        }
        if (m781b == 2) {
            return "Location services are disabled. To receive location updates the location services should be enabled.";
        }
        if (m781b == 3) {
            return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
        }
        if (m781b == 4) {
            return "User denied permissions to access the device's location.";
        }
        if (m781b == 5) {
            return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    /* renamed from: f */
    public static final java.lang.String m147f(int i4) {
        int m781b = p044L.AbstractC0352j.m781b(i4);
        if (m781b == 0) {
            return "ACTIVITY_MISSING";
        }
        if (m781b == 1) {
            return "ERROR_WHILE_ACQUIRING_POSITION";
        }
        if (m781b == 2) {
            return "LOCATION_SERVICES_DISABLED";
        }
        if (m781b == 3) {
            return "PERMISSION_DEFINITIONS_NOT_FOUND";
        }
        if (m781b == 4) {
            return "PERMISSION_DENIED";
        }
        if (m781b == 5) {
            return "PERMISSION_REQUEST_IN_PROGRESS";
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public static /* synthetic */ int m148g(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 90;
        }
        if (i4 == 3) {
            return 180;
        }
        if (i4 == 4) {
            return 270;
        }
        throw null;
    }

    /* renamed from: h */
    public static /* synthetic */ int m149h(int i4) {
        switch (i4) {
            case 1:
                return 1;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return 8;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    /* renamed from: i */
    public static java.lang.String m150i(int i4, int i5, java.lang.String str, java.lang.String str2) {
        return str + i4 + str2 + i5;
    }

    /* renamed from: j */
    public static java.lang.String m151j(int i4, java.lang.String str, java.lang.String str2) {
        return str + i4 + str2;
    }

    /* renamed from: k */
    public static java.lang.String m152k(java.lang.String str, int i4) {
        return str + i4;
    }

    /* renamed from: l */
    public static java.lang.String m153l(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    /* renamed from: m */
    public static java.lang.String m154m(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: n */
    public static void m155n(int i4, int i5, int i6, int i7, int i8) {
        p086W.AbstractC0805y.m1587H(i4);
        p086W.AbstractC0805y.m1587H(i5);
        p086W.AbstractC0805y.m1587H(i6);
        p086W.AbstractC0805y.m1587H(i7);
        p086W.AbstractC0805y.m1587H(i8);
    }

    /* renamed from: o */
    public static void m156o(int i4, java.lang.String str, java.lang.String str2) {
        p086W.AbstractC0781a.m1410A(str2, str + i4);
    }

    /* renamed from: p */
    public static void m157p(int i4, java.util.HashMap hashMap, java.lang.String str, int i5, java.lang.String str2) {
        hashMap.put(str, java.lang.Integer.valueOf(i4));
        hashMap.put(str2, java.lang.Integer.valueOf(i5));
    }

    /* renamed from: q */
    public static void m158q(p076T.C0701o c0701o, p215y0.InterfaceC2387F interfaceC2387F) {
        interfaceC2387F.mo1407c(new p076T.C0702p(c0701o));
    }

    /* renamed from: r */
    public static /* synthetic */ void m159r(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.ClassCastException();
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m160s(java.lang.String str, int i4) {
        if (i4 == 0) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = p154k3.AbstractC1803h.class.getName();
            int i5 = 0;
            while (!stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            while (stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i5];
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            p154k3.AbstractC1803h.m3781g(nullPointerException, p154k3.AbstractC1803h.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: t */
    public static void m161t(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p086W.AbstractC0781a.m1410A(str3, str + str2);
    }
}
