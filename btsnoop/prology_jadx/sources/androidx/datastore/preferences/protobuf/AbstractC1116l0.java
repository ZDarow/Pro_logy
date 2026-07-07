package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC1116l0 {

    /* renamed from: a */
    public static final p080U1.AbstractC0748a f4263a;

    static {
        f4263a = (androidx.datastore.preferences.protobuf.AbstractC1110i0.f4250e && androidx.datastore.preferences.protobuf.AbstractC1110i0.f4249d && !androidx.datastore.preferences.protobuf.AbstractC1097c.m2487a()) ? new androidx.datastore.preferences.protobuf.C1112j0(1) : new androidx.datastore.preferences.protobuf.C1112j0(0);
    }

    /* renamed from: a */
    public static int m2625a(java.lang.String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i5) < 65536) {
                                throw new androidx.datastore.preferences.protobuf.C1114k0(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i4;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }
}
