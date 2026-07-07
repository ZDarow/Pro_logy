package W;

import B2.AbstractC0007h;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2640a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2641b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2642c = new Object();

    public static void A(String str, String str2) {
        synchronized (f2642c) {
            Log.w(str, a(str2, null));
        }
    }

    public static void B(String str, String str2, Throwable th) {
        synchronized (f2642c) {
            Log.w(str, a(str2, th));
        }
    }

    public static String a(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f2642c) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
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
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
    }

    public static String b(int i4, int i5, int i6) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static String c(int i4, boolean z4, int i5, int i6, int[] iArr, int i7) {
        Object[] objArr = {f2641b[i4], Integer.valueOf(i5), Integer.valueOf(i6), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i7)};
        int i8 = y.f2709a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i9 = 0; i9 < length; i9++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i9])));
        }
        return sb.toString();
    }

    public static void d(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void e(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(String str, boolean z4) {
        if (!z4) {
            throw new Exception(str);
        }
    }

    public static void g(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static void i(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void j(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void m(String str, String str2) {
        synchronized (f2642c) {
            Log.d(str, a(str2, null));
        }
    }

    public static void n(String str, String str2) {
        synchronized (f2642c) {
            Log.e(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th) {
        synchronized (f2642c) {
            Log.e(str, a(str2, th));
        }
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if (xmlPullParser.getAttributeName(i4).equals(str)) {
                return xmlPullParser.getAttributeValue(i4);
            }
        }
        return null;
    }

    public static int[] q(String str) {
        int i4;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
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

    public static void r(String str, String str2) {
        synchronized (f2642c) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean t(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        return t(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static void v(MediaFormat mediaFormat, String str, int i4) {
        if (i4 != -1) {
            mediaFormat.setInteger(str, i4);
        }
    }

    public static String w(StringBuilder sb, int i4, int i5) {
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

    public static String x(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] q4 = q(str2);
        if (q4[0] != -1) {
            sb.append(str2);
            w(sb, q4[1], q4[2]);
            return sb.toString();
        }
        int[] q5 = q(str);
        if (q4[3] == 0) {
            sb.append((CharSequence) str, 0, q5[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (q4[2] == 0) {
            sb.append((CharSequence) str, 0, q5[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i4 = q4[1];
        if (i4 != 0) {
            int i5 = q5[0] + 1;
            sb.append((CharSequence) str, 0, i5);
            sb.append(str2);
            return w(sb, q4[1] + i5, i5 + q4[2]);
        }
        if (str2.charAt(i4) == '/') {
            sb.append((CharSequence) str, 0, q5[1]);
            sb.append(str2);
            int i6 = q5[1];
            return w(sb, i6, q4[2] + i6);
        }
        int i7 = q5[0] + 2;
        int i8 = q5[1];
        if (i7 >= i8 || i8 != q5[2]) {
            int lastIndexOf = str.lastIndexOf(47, q5[2] - 1);
            int i9 = lastIndexOf == -1 ? q5[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i9);
            sb.append(str2);
            return w(sb, q5[1], i9 + q4[2]);
        }
        sb.append((CharSequence) str, 0, i8);
        sb.append('/');
        sb.append(str2);
        int i10 = q5[1];
        return w(sb, i10, q4[2] + i10 + 1);
    }

    public static Uri y(String str, String str2) {
        return Uri.parse(x(str, str2));
    }

    public static void z(MediaFormat mediaFormat, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            mediaFormat.setByteBuffer(AbstractC0007h.k("csd-", i4), ByteBuffer.wrap((byte[]) list.get(i4)));
        }
    }
}
