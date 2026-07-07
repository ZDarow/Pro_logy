package B2;

import T.C0094o;
import T.C0095p;
import java.util.HashMap;

/* renamed from: B2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0007h {
    public static int[] _values() {
        return L.j.c(6);
    }

    public static int a(int i4) {
        for (int i5 : L.j.c(4)) {
            if (g(i5) == i4) {
                return i5;
            }
        }
        throw new IllegalArgumentException(k("Invalid rotation degrees specified: ", i4));
    }

    public static int b(String str) {
        String str2;
        for (int i4 : L.j.c(2)) {
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
        throw new NoSuchFieldException(l("No such Brightness: ", str));
    }

    public static int c(String str) {
        for (int i4 : L.j.c(5)) {
            String str2 = null;
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
        throw new NoSuchFieldException(l("No such HapticFeedbackType: ", str));
    }

    public static int d(String str) {
        String str2;
        for (int i4 : L.j.c(3)) {
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
        throw new NoSuchFieldException(l("No such SoundType: ", str));
    }

    public static final String e(int i4) {
        int b4 = L.j.b(i4);
        if (b4 == 0) {
            return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
        }
        if (b4 == 1) {
            return "An unexpected error occurred while trying to acquire the device's position.";
        }
        if (b4 == 2) {
            return "Location services are disabled. To receive location updates the location services should be enabled.";
        }
        if (b4 == 3) {
            return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
        }
        if (b4 == 4) {
            return "User denied permissions to access the device's location.";
        }
        if (b4 == 5) {
            return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
        }
        throw new IndexOutOfBoundsException();
    }

    public static final String f(int i4) {
        int b4 = L.j.b(i4);
        if (b4 == 0) {
            return "ACTIVITY_MISSING";
        }
        if (b4 == 1) {
            return "ERROR_WHILE_ACQUIRING_POSITION";
        }
        if (b4 == 2) {
            return "LOCATION_SERVICES_DISABLED";
        }
        if (b4 == 3) {
            return "PERMISSION_DEFINITIONS_NOT_FOUND";
        }
        if (b4 == 4) {
            return "PERMISSION_DENIED";
        }
        if (b4 == 5) {
            return "PERMISSION_REQUEST_IN_PROGRESS";
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ int g(int i4) {
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

    public static /* synthetic */ int h(int i4) {
        switch (i4) {
            case 1:
                return 1;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return 8;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
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

    public static String i(int i4, int i5, String str, String str2) {
        return str + i4 + str2 + i5;
    }

    public static String j(int i4, String str, String str2) {
        return str + i4 + str2;
    }

    public static String k(String str, int i4) {
        return str + i4;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void n(int i4, int i5, int i6, int i7, int i8) {
        W.y.H(i4);
        W.y.H(i5);
        W.y.H(i6);
        W.y.H(i7);
        W.y.H(i8);
    }

    public static void o(int i4, String str, String str2) {
        W.a.A(str2, str + i4);
    }

    public static void p(int i4, HashMap hashMap, String str, int i5, String str2) {
        hashMap.put(str, Integer.valueOf(i4));
        hashMap.put(str2, Integer.valueOf(i5));
    }

    public static void q(C0094o c0094o, y0.F f4) {
        f4.c(new C0095p(c0094o));
    }

    public static /* synthetic */ void r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void s(String str, int i4) {
        if (i4 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = k3.h.class.getName();
            int i5 = 0;
            while (!stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            while (stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            k3.h.g(nullPointerException, k3.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void t(String str, String str2, String str3) {
        W.a.A(str3, str + str2);
    }
}
