package B;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f86a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f87b = new char[24];

    public static void a(String str, long j4) {
        if (j4 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        }
        if (j4 <= Long.MAX_VALUE) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
    }

    public static void b(long j4, StringBuilder sb) {
        synchronized (f86a) {
            sb.append(f87b, 0, c(j4));
        }
    }

    public static int c(long j4) {
        char c4;
        int i4;
        int i5;
        int i6;
        int i7;
        if (f87b.length < 0) {
            f87b = new char[0];
        }
        char[] cArr = f87b;
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
        int floor = (int) Math.floor(j4 / 1000);
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
        int d4 = d(cArr, i4, 'd', 1, false, 0);
        int d5 = d(cArr, i5, 'h', d4, d4 != 1, 0);
        int d6 = d(cArr, i7, 'm', d5, d5 != 1, 0);
        int d7 = d(cArr, i8, 'm', d(cArr, i6, 's', d6, d6 != 1, 0), true, 0);
        cArr[d7] = 's';
        return d7 + 1;
    }

    public static int d(char[] cArr, int i4, char c4, int i5, boolean z4, int i6) {
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
