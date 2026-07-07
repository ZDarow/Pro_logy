package p076T;

/* renamed from: T.h */
/* loaded from: classes.dex */
public final class C0694h {

    /* renamed from: a */
    public int f2325a = -1;

    /* renamed from: b */
    public int f2326b = -1;

    /* renamed from: c */
    public int f2327c = -1;

    /* renamed from: d */
    public int f2328d = -1;

    /* renamed from: e */
    public int f2329e = -1;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, T.h] */
    /* renamed from: c */
    public static p076T.C0694h m1270c(java.lang.String str) {
        char c4;
        p086W.AbstractC0781a.m1416e(str.startsWith("Format:"));
        java.lang.String[] split = android.text.TextUtils.split(str.substring(7), ",");
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < split.length; i8++) {
            java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(split[i8].trim());
            m1361I.getClass();
            switch (m1361I.hashCode()) {
                case 100571:
                    if (m1361I.equals("end")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (m1361I.equals("text")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (m1361I.equals("start")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (m1361I.equals("style")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            c4 = 65535;
            switch (c4) {
                case 0:
                    i5 = i8;
                    break;
                case 1:
                    i6 = i8;
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    i4 = i8;
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    i7 = i8;
                    break;
            }
        }
        if (i4 == -1 || i5 == -1 || i6 == -1) {
            return null;
        }
        int length = split.length;
        ?? obj = new java.lang.Object();
        obj.f2325a = i4;
        obj.f2326b = i5;
        obj.f2327c = i7;
        obj.f2328d = i6;
        obj.f2329e = length;
        return obj;
    }

    /* renamed from: a */
    public boolean m1271a() {
        int i4 = this.f2325a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f2328d;
            int i7 = this.f2326b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f2328d;
            int i9 = this.f2327c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f2329e;
            int i11 = this.f2326b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f2329e;
            int i13 = this.f2327c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public p076T.C0695i m1272b() {
        return new p076T.C0695i(this.f2325a, this.f2326b, this.f2327c, this.f2328d, this.f2329e, null);
    }

    /* renamed from: d */
    public void m1273d(int i4) {
        this.f2329e = i4;
    }

    /* renamed from: e */
    public void m1274e(int i4) {
        this.f2326b = i4;
    }

    /* renamed from: f */
    public void m1275f(int i4) {
        this.f2325a = i4;
    }

    /* renamed from: g */
    public void m1276g(int i4) {
        this.f2327c = i4;
    }

    /* renamed from: h */
    public void m1277h(int i4) {
        this.f2328d = i4;
    }
}
