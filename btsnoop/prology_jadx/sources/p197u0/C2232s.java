package p197u0;

/* renamed from: u0.s */
/* loaded from: classes.dex */
public final class C2232s {

    /* renamed from: h */
    public static final p087W0.C0809d f8896h = new p087W0.C0809d(13);

    /* renamed from: i */
    public static final p087W0.C0809d f8897i = new p087W0.C0809d(14);

    /* renamed from: a */
    public final int f8898a;

    /* renamed from: e */
    public int f8902e;

    /* renamed from: f */
    public int f8903f;

    /* renamed from: g */
    public int f8904g;

    /* renamed from: c */
    public final p197u0.C2231r[] f8900c = new p197u0.C2231r[5];

    /* renamed from: b */
    public final java.util.ArrayList f8899b = new java.util.ArrayList();

    /* renamed from: d */
    public int f8901d = -1;

    public C2232s(int i4) {
        this.f8898a = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m4435a(float f4, int i4) {
        p197u0.C2231r c2231r;
        int i5 = this.f8901d;
        java.util.ArrayList arrayList = this.f8899b;
        if (i5 != 1) {
            java.util.Collections.sort(arrayList, f8896h);
            this.f8901d = 1;
        }
        int i6 = this.f8904g;
        p197u0.C2231r[] c2231rArr = this.f8900c;
        if (i6 > 0) {
            int i7 = i6 - 1;
            this.f8904g = i7;
            c2231r = c2231rArr[i7];
        } else {
            c2231r = new java.lang.Object();
        }
        int i8 = this.f8902e;
        this.f8902e = i8 + 1;
        c2231r.f8893a = i8;
        c2231r.f8894b = i4;
        c2231r.f8895c = f4;
        arrayList.add(c2231r);
        this.f8903f += i4;
        while (true) {
            int i9 = this.f8903f;
            int i10 = this.f8898a;
            if (i9 <= i10) {
                return;
            }
            int i11 = i9 - i10;
            p197u0.C2231r c2231r2 = (p197u0.C2231r) arrayList.get(0);
            int i12 = c2231r2.f8894b;
            if (i12 <= i11) {
                this.f8903f -= i12;
                arrayList.remove(0);
                int i13 = this.f8904g;
                if (i13 < 5) {
                    this.f8904g = i13 + 1;
                    c2231rArr[i13] = c2231r2;
                }
            } else {
                c2231r2.f8894b = i12 - i11;
                this.f8903f -= i11;
            }
        }
    }

    /* renamed from: b */
    public final float m4436b() {
        int i4 = this.f8901d;
        java.util.ArrayList arrayList = this.f8899b;
        if (i4 != 0) {
            java.util.Collections.sort(arrayList, f8897i);
            this.f8901d = 0;
        }
        float f4 = 0.5f * this.f8903f;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            p197u0.C2231r c2231r = (p197u0.C2231r) arrayList.get(i6);
            i5 += c2231r.f8894b;
            if (i5 >= f4) {
                return c2231r.f8895c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p197u0.C2231r) arrayList.get(arrayList.size() - 1)).f8895c;
    }
}
