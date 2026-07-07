package T;

import android.text.TextUtils;

/* renamed from: T.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087h {

    /* renamed from: a, reason: collision with root package name */
    public int f2245a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2246b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2247c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2248d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f2249e = -1;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, T.h] */
    public static C0087h c(String str) {
        char c4;
        W.a.e(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < split.length; i8++) {
            String I3 = U1.a.I(split[i8].trim());
            I3.getClass();
            switch (I3.hashCode()) {
                case 100571:
                    if (I3.equals("end")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (I3.equals("text")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (I3.equals("start")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (I3.equals("style")) {
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
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    i4 = i8;
                    break;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i7 = i8;
                    break;
            }
        }
        if (i4 == -1 || i5 == -1 || i6 == -1) {
            return null;
        }
        int length = split.length;
        ?? obj = new Object();
        obj.f2245a = i4;
        obj.f2246b = i5;
        obj.f2247c = i7;
        obj.f2248d = i6;
        obj.f2249e = length;
        return obj;
    }

    public boolean a() {
        int i4 = this.f2245a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f2248d;
            int i7 = this.f2246b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f2248d;
            int i9 = this.f2247c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f2249e;
            int i11 = this.f2246b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f2249e;
            int i13 = this.f2247c;
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

    public C0088i b() {
        return new C0088i(this.f2245a, this.f2246b, this.f2247c, this.f2248d, this.f2249e, null);
    }

    public void d(int i4) {
        this.f2249e = i4;
    }

    public void e(int i4) {
        this.f2246b = i4;
    }

    public void f(int i4) {
        this.f2245a = i4;
    }

    public void g(int i4) {
        this.f2247c = i4;
    }

    public void h(int i4) {
        this.f2248d = i4;
    }
}
