package p006B;

/* renamed from: B.d */
/* loaded from: classes.dex */
public abstract class AbstractC0021d {

    /* renamed from: a */
    public static final java.lang.Object f89a = new java.lang.Object();

    /* renamed from: b */
    public static char[] f90b = new char[24];

    /* renamed from: a */
    public static void m61a(java.lang.String str, long j4) {
        if (j4 < 0) {
            java.util.Locale locale = java.util.Locale.US;
            throw new java.lang.IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        }
        if (j4 <= Long.MAX_VALUE) {
            return;
        }
        java.util.Locale locale2 = java.util.Locale.US;
        throw new java.lang.IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
    }

    /* renamed from: b */
    public static void m62b(long j4, java.lang.StringBuilder sb) {
        synchronized (f89a) {
            sb.append(f90b, 0, m63c(j4));
        }
    }

    /* renamed from: c */
    public static int m63c(long j4) {
        char c4;
        int i4;
        int i5;
        int i6;
        int i7;
        if (f90b.length < 0) {
            f90b = new char[0];
        }
        char[] cArr = f90b;
        if (j4 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j4 > 0) {
            c4 = '+';
        } else {
            j4 = -j4;
            c4 = '-';
        }
        int i8 = (int) (j4 % 1000);
        int floor = (int) java.lang.Math.floor(j4 / 1000);
        if (floor > 86400) {
            i4 = floor / 86400;
            floor -= 86400 * i4;
        } else {
            i4 = 0;
        }
        if (floor > 3600) {
            i5 = floor / 3600;
            floor -= i5 * 3600;
        } else {
            i5 = 0;
        }
        if (floor > 60) {
            int i9 = floor / 60;
            i6 = floor - (i9 * 60);
            i7 = i9;
        } else {
            i6 = floor;
            i7 = 0;
        }
        cArr[0] = c4;
        int m64d = m64d(cArr, i4, 'd', 1, false, 0);
        int m64d2 = m64d(cArr, i5, 'h', m64d, m64d != 1, 0);
        int m64d3 = m64d(cArr, i7, 'm', m64d2, m64d2 != 1, 0);
        int m64d4 = m64d(cArr, i8, 'm', m64d(cArr, i6, 's', m64d3, m64d3 != 1, 0), true, 0);
        cArr[m64d4] = 's';
        return m64d4 + 1;
    }

    /* renamed from: d */
    public static int m64d(char[] cArr, int i4, char c4, int i5, boolean z4, int i6) {
        int i7;
        if (!z4 && i4 <= 0) {
            return i5;
        }
        if ((!z4 || i6 < 3) && i4 <= 99) {
            i7 = i5;
        } else {
            int i8 = i4 / 100;
            cArr[i5] = (char) (i8 + 48);
            i7 = i5 + 1;
            i4 -= i8 * 100;
        }
        if ((z4 && i6 >= 2) || i4 > 9 || i5 != i7) {
            int i9 = i4 / 10;
            cArr[i7] = (char) (i9 + 48);
            i7++;
            i4 -= i9 * 10;
        }
        cArr[i7] = (char) (i4 + 48);
        cArr[i7 + 1] = c4;
        return i7 + 2;
    }
}
