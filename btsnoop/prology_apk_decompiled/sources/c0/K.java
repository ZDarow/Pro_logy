package c0;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f4558a = new Object();

    public static int a(int i4) {
        if (i4 == 20) {
            return 63750;
        }
        if (i4 == 30) {
            return 2250000;
        }
        switch (i4) {
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return 80000;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 768000;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 192000;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i4) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
