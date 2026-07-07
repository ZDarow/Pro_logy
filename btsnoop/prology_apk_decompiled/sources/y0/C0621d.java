package y0;

import T.I;
import java.util.ArrayList;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9047e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9048f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9049g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9050h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9051i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9052j;

    /* renamed from: k, reason: collision with root package name */
    public final float f9053k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9054l;

    public C0621d(ArrayList arrayList, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f4, String str) {
        this.f9043a = arrayList;
        this.f9044b = i4;
        this.f9045c = i5;
        this.f9046d = i6;
        this.f9047e = i7;
        this.f9048f = i8;
        this.f9049g = i9;
        this.f9050h = i10;
        this.f9051i = i11;
        this.f9052j = i12;
        this.f9053k = f4;
        this.f9054l = str;
    }

    public static C0621d a(W.r rVar) {
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f4;
        String str;
        int i11;
        try {
            rVar.H(4);
            int u4 = (rVar.u() & 3) + 1;
            if (u4 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int u5 = rVar.u() & 31;
            int i12 = 0;
            while (true) {
                bArr = W.a.f2640a;
                if (i12 >= u5) {
                    break;
                }
                int A4 = rVar.A();
                int i13 = rVar.f2695b;
                rVar.H(A4);
                byte[] bArr2 = rVar.f2694a;
                byte[] bArr3 = new byte[A4 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, A4);
                arrayList.add(bArr3);
                i12++;
            }
            int u6 = rVar.u();
            for (int i14 = 0; i14 < u6; i14++) {
                int A5 = rVar.A();
                int i15 = rVar.f2695b;
                rVar.H(A5);
                byte[] bArr4 = rVar.f2694a;
                byte[] bArr5 = new byte[A5 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, A5);
                arrayList.add(bArr5);
            }
            if (u5 > 0) {
                X.f d4 = X.g.d((byte[]) arrayList.get(0), u4, ((byte[]) arrayList.get(0)).length);
                int i16 = d4.f2849e;
                int i17 = d4.f2850f;
                int i18 = d4.f2852h + 8;
                int i19 = d4.f2853i + 8;
                int i20 = d4.f2860p;
                int i21 = d4.f2861q;
                int i22 = d4.f2862r;
                int i23 = d4.s;
                float f5 = d4.f2851g;
                str = W.a.b(d4.f2845a, d4.f2846b, d4.f2847c);
                i9 = i21;
                i10 = i22;
                i11 = i23;
                f4 = f5;
                i5 = i17;
                i6 = i18;
                i7 = i19;
                i8 = i20;
                i4 = i16;
            } else {
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                f4 = 1.0f;
                str = null;
                i11 = 16;
            }
            return new C0621d(arrayList, u4, i4, i5, i6, i7, i8, i9, i10, i11, f4, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw I.a(e4, "Error parsing AVC config");
        }
    }
}
