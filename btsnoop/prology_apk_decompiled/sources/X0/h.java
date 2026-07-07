package X0;

import V0.k;
import V0.l;
import W.q;
import W.r;
import W.y;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import f2.G;
import f2.I;
import f2.c0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements l {
    public static final byte[] s = {0, 7, 8, 15};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f2904t = {0, 119, -120, -1};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f2905u = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: l, reason: collision with root package name */
    public final Paint f2906l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f2907m;

    /* renamed from: n, reason: collision with root package name */
    public final Canvas f2908n;

    /* renamed from: o, reason: collision with root package name */
    public final b f2909o;

    /* renamed from: p, reason: collision with root package name */
    public final a f2910p;

    /* renamed from: q, reason: collision with root package name */
    public final g f2911q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f2912r;

    public h(List list) {
        r rVar = new r((byte[]) list.get(0));
        int A4 = rVar.A();
        int A5 = rVar.A();
        Paint paint = new Paint();
        this.f2906l = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2907m = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2908n = new Canvas();
        this.f2909o = new b(719, 575, 0, 719, 0, 575);
        this.f2910p = new a(0, new int[]{0, -1, -16777216, -8421505}, c(), d());
        this.f2911q = new g(A4, A5);
    }

    public static byte[] a(int i4, int i5, q qVar) {
        byte[] bArr = new byte[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = (byte) qVar.i(i5);
        }
        return bArr;
    }

    public static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i4 = 1; i4 < 16; i4++) {
            if (i4 < 8) {
                iArr[i4] = e(255, (i4 & 1) != 0 ? 255 : 0, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i4] = e(255, (i4 & 1) != 0 ? 127 : 0, (i4 & 2) != 0 ? 127 : 0, (i4 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (i4 < 8) {
                iArr[i4] = e(63, (i4 & 1) != 0 ? 255 : 0, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) == 0 ? 0 : 255);
            } else {
                int i5 = i4 & 136;
                if (i5 == 0) {
                    iArr[i4] = e(255, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i5 == 8) {
                    iArr[i4] = e(127, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i5 == 128) {
                    iArr[i4] = e(255, ((i4 & 1) != 0 ? 43 : 0) + 127 + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + 127 + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + 127 + ((i4 & 64) == 0 ? 0 : 85));
                } else if (i5 == 136) {
                    iArr[i4] = e(255, ((i4 & 1) != 0 ? 43 : 0) + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + ((i4 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int e(int i4, int i5, int i6, int i7) {
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[LOOP:3: B:89:0x0172->B:100:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.h.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a g(q qVar, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 8;
        int i11 = qVar.i(8);
        qVar.t(8);
        int i12 = 2;
        int i13 = i4 - 2;
        int i14 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] c4 = c();
        int[] d4 = d();
        while (i13 > 0) {
            int i15 = qVar.i(i10);
            int i16 = qVar.i(i10);
            int[] iArr2 = (i16 & 128) != 0 ? iArr : (i16 & 64) != 0 ? c4 : d4;
            if ((i16 & 1) != 0) {
                i8 = qVar.i(i10);
                i9 = qVar.i(i10);
                i5 = qVar.i(i10);
                i7 = qVar.i(i10);
                i6 = i13 - 6;
            } else {
                int i17 = qVar.i(6) << i12;
                int i18 = qVar.i(4) << 4;
                i5 = qVar.i(4) << 4;
                i6 = i13 - 4;
                i7 = qVar.i(i12) << 6;
                i8 = i17;
                i9 = i18;
            }
            if (i8 == 0) {
                i9 = i14;
                i5 = i9;
                i7 = 255;
            }
            double d5 = i8;
            double d6 = i9 - 128;
            double d7 = i5 - 128;
            iArr2[i15] = e((byte) (255 - (i7 & 255)), y.j((int) ((1.402d * d6) + d5), 0, 255), y.j((int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d)), 0, 255), y.j((int) ((d7 * 1.772d) + d5), 0, 255));
            i13 = i6;
            i14 = 0;
            i11 = i11;
            d4 = d4;
            i10 = 8;
            i12 = 2;
        }
        return new a(i11, iArr, c4, d4);
    }

    public static c i(q qVar) {
        byte[] bArr;
        int i4 = qVar.i(16);
        qVar.t(4);
        int i5 = qVar.i(2);
        boolean h4 = qVar.h();
        qVar.t(1);
        byte[] bArr2 = y.f2714f;
        if (i5 == 1) {
            qVar.t(qVar.i(8) * 16);
        } else if (i5 == 0) {
            int i6 = qVar.i(16);
            int i7 = qVar.i(16);
            if (i6 > 0) {
                bArr2 = new byte[i6];
                qVar.l(bArr2, i6);
            }
            if (i7 > 0) {
                bArr = new byte[i7];
                qVar.l(bArr, i7);
                return new c(i4, h4, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i4, h4, bArr2, bArr);
    }

    @Override // V0.l
    public final void b() {
        g gVar = this.f2911q;
        gVar.f2897c.clear();
        gVar.f2898d.clear();
        gVar.f2899e.clear();
        gVar.f2900f.clear();
        gVar.f2901g.clear();
        gVar.f2902h = null;
        gVar.f2903i = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0053. Please report as an issue. */
    @Override // V0.l
    public final void h(byte[] bArr, int i4, int i5, k kVar, W.c cVar) {
        g gVar;
        V0.a aVar;
        int i6;
        char c4;
        int i7;
        b bVar;
        ArrayList arrayList;
        int i8;
        g gVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar;
        e eVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        q qVar = new q(bArr, i4 + i5);
        qVar.q(i4);
        while (true) {
            int b4 = qVar.b();
            gVar = this.f2911q;
            if (b4 >= 48 && qVar.i(i18) == 15) {
                int i19 = qVar.i(i18);
                int i20 = 16;
                int i21 = qVar.i(16);
                int i22 = qVar.i(16);
                int f4 = qVar.f() + i22;
                if (i22 * 8 > qVar.b()) {
                    W.a.A("DvbParser", "Data field length exceeds limit");
                    qVar.t(qVar.b());
                } else {
                    switch (i19) {
                        case 16:
                            if (i21 == gVar.f2895a) {
                                S0.h hVar = gVar.f2903i;
                                qVar.i(i18);
                                int i23 = qVar.i(4);
                                int i24 = qVar.i(2);
                                qVar.t(2);
                                int i25 = i22 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i25 > 0) {
                                    int i26 = qVar.i(i18);
                                    qVar.t(i18);
                                    i25 -= 6;
                                    sparseArray.put(i26, new d(qVar.i(16), qVar.i(16)));
                                    i18 = 8;
                                }
                                S0.h hVar2 = new S0.h(i23, i24, sparseArray);
                                if (i24 == 0) {
                                    if (hVar != null && hVar.f1904a != i23) {
                                        gVar.f2903i = hVar2;
                                        break;
                                    }
                                } else {
                                    gVar.f2903i = hVar2;
                                    gVar.f2897c.clear();
                                    gVar.f2898d.clear();
                                    gVar.f2899e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            S0.h hVar3 = gVar.f2903i;
                            if (i21 == gVar.f2895a && hVar3 != null) {
                                int i27 = qVar.i(i18);
                                qVar.t(4);
                                boolean h4 = qVar.h();
                                qVar.t(3);
                                int i28 = qVar.i(16);
                                int i29 = qVar.i(16);
                                qVar.i(3);
                                int i30 = qVar.i(3);
                                qVar.t(2);
                                int i31 = qVar.i(i18);
                                int i32 = qVar.i(i18);
                                int i33 = qVar.i(4);
                                int i34 = qVar.i(2);
                                qVar.t(2);
                                int i35 = i22 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i35 > 0) {
                                    int i36 = qVar.i(i20);
                                    int i37 = qVar.i(2);
                                    qVar.i(2);
                                    int i38 = qVar.i(12);
                                    qVar.t(4);
                                    int i39 = qVar.i(12);
                                    int i40 = i35 - 6;
                                    if (i37 == 1 || i37 == 2) {
                                        qVar.i(i18);
                                        qVar.i(i18);
                                        i35 -= 8;
                                    } else {
                                        i35 = i40;
                                    }
                                    sparseArray2.put(i36, new f(i38, i39));
                                    i20 = 16;
                                }
                                e eVar3 = new e(i27, h4, i28, i29, i30, i31, i32, i33, i34, sparseArray2);
                                SparseArray sparseArray3 = gVar.f2897c;
                                if (hVar3.f1905b == 0 && (eVar2 = (e) sparseArray3.get(i27)) != null) {
                                    int i41 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar2.f2892j;
                                        if (i41 < sparseArray4.size()) {
                                            eVar3.f2892j.put(sparseArray4.keyAt(i41), (f) sparseArray4.valueAt(i41));
                                            i41++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar3.f2883a, eVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i21 != gVar.f2895a) {
                                if (i21 == gVar.f2896b) {
                                    a g4 = g(qVar, i22);
                                    gVar.f2900f.put(g4.f2867a, g4);
                                    break;
                                }
                            } else {
                                a g5 = g(qVar, i22);
                                gVar.f2898d.put(g5.f2867a, g5);
                                break;
                            }
                            break;
                        case 19:
                            if (i21 != gVar.f2895a) {
                                if (i21 == gVar.f2896b) {
                                    c i42 = i(qVar);
                                    gVar.f2901g.put(i42.f2877a, i42);
                                    break;
                                }
                            } else {
                                c i43 = i(qVar);
                                gVar.f2899e.put(i43.f2877a, i43);
                                break;
                            }
                            break;
                        case 20:
                            if (i21 == gVar.f2895a) {
                                qVar.t(4);
                                boolean h5 = qVar.h();
                                qVar.t(3);
                                int i44 = qVar.i(16);
                                int i45 = qVar.i(16);
                                if (h5) {
                                    int i46 = qVar.i(16);
                                    int i47 = qVar.i(16);
                                    int i48 = qVar.i(16);
                                    i14 = i47;
                                    i15 = qVar.i(16);
                                    i17 = i48;
                                    i16 = i46;
                                } else {
                                    i14 = i44;
                                    i15 = i45;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                gVar.f2902h = new b(i44, i45, i16, i14, i17, i15);
                                break;
                            }
                            break;
                    }
                    qVar.u(f4 - qVar.f());
                }
                i18 = 8;
            }
        }
        S0.h hVar4 = gVar.f2903i;
        if (hVar4 == null) {
            G g6 = I.f5510m;
            aVar = new V0.a(c0.f5550p, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar2 = gVar.f2902h;
            if (bVar2 == null) {
                bVar2 = this.f2909o;
            }
            Bitmap bitmap = this.f2912r;
            Canvas canvas = this.f2908n;
            if (bitmap == null || bVar2.f2871a + 1 != bitmap.getWidth() || bVar2.f2872b + 1 != this.f2912r.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f2871a + 1, bVar2.f2872b + 1, Bitmap.Config.ARGB_8888);
                this.f2912r = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i49 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) hVar4.f1906c;
                if (i49 < sparseArray5.size()) {
                    canvas.save();
                    d dVar = (d) sparseArray5.valueAt(i49);
                    e eVar4 = (e) gVar.f2897c.get(sparseArray5.keyAt(i49));
                    int i50 = dVar.f2881a + bVar2.f2873c;
                    int i51 = dVar.f2882b + bVar2.f2875e;
                    int min = Math.min(eVar4.f2885c + i50, bVar2.f2874d);
                    int i52 = eVar4.f2886d;
                    int i53 = i51 + i52;
                    canvas.clipRect(i50, i51, min, Math.min(i53, bVar2.f2876f));
                    SparseArray sparseArray6 = gVar.f2898d;
                    int i54 = eVar4.f2888f;
                    a aVar2 = (a) sparseArray6.get(i54);
                    if (aVar2 == null && (aVar2 = (a) gVar.f2900f.get(i54)) == null) {
                        aVar2 = this.f2910p;
                    }
                    int i55 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar4.f2892j;
                        if (i55 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i55);
                            f fVar = (f) sparseArray7.valueAt(i55);
                            S0.h hVar5 = hVar4;
                            c cVar2 = (c) gVar.f2899e.get(keyAt);
                            if (cVar2 == null) {
                                cVar2 = (c) gVar.f2901g.get(keyAt);
                            }
                            if (cVar2 != null) {
                                Paint paint = cVar2.f2878b ? null : this.f2906l;
                                gVar2 = gVar;
                                int i56 = fVar.f2893a + i50;
                                int i57 = fVar.f2894b + i51;
                                i8 = i49;
                                int i58 = eVar4.f2887e;
                                int i59 = i55;
                                int[] iArr = i58 == 3 ? aVar2.f2870d : i58 == 2 ? aVar2.f2869c : aVar2.f2868b;
                                i9 = i59;
                                arrayList = arrayList2;
                                bVar = bVar2;
                                i11 = i52;
                                i10 = i53;
                                i13 = i50;
                                i12 = i51;
                                eVar = eVar4;
                                Paint paint2 = paint;
                                f(cVar2.f2879c, iArr, i58, i56, i57, paint2, canvas);
                                f(cVar2.f2880d, iArr, i58, i56, i57 + 1, paint2, canvas);
                            } else {
                                bVar = bVar2;
                                arrayList = arrayList2;
                                i8 = i49;
                                gVar2 = gVar;
                                i9 = i55;
                                i10 = i53;
                                i11 = i52;
                                i12 = i51;
                                i13 = i50;
                                eVar = eVar4;
                            }
                            i55 = i9 + 1;
                            eVar4 = eVar;
                            i50 = i13;
                            hVar4 = hVar5;
                            gVar = gVar2;
                            i49 = i8;
                            bVar2 = bVar;
                            i52 = i11;
                            i53 = i10;
                            i51 = i12;
                            arrayList2 = arrayList;
                        } else {
                            S0.h hVar6 = hVar4;
                            b bVar3 = bVar2;
                            ArrayList arrayList3 = arrayList2;
                            int i60 = i49;
                            g gVar3 = gVar;
                            int i61 = i53;
                            int i62 = i52;
                            int i63 = i51;
                            int i64 = i50;
                            e eVar5 = eVar4;
                            boolean z4 = eVar5.f2884b;
                            int i65 = eVar5.f2885c;
                            if (z4) {
                                int i66 = eVar5.f2887e;
                                if (i66 == 3) {
                                    i7 = aVar2.f2870d[eVar5.f2889g];
                                    c4 = 2;
                                } else {
                                    c4 = 2;
                                    i7 = i66 == 2 ? aVar2.f2869c[eVar5.f2890h] : aVar2.f2868b[eVar5.f2891i];
                                }
                                Paint paint3 = this.f2907m;
                                paint3.setColor(i7);
                                i6 = i63;
                                canvas.drawRect(i64, i6, i64 + i65, i61, paint3);
                            } else {
                                i6 = i63;
                                c4 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(this.f2912r, i64, i6, i65, i62);
                            float f5 = bVar3.f2871a;
                            float f6 = bVar3.f2872b;
                            arrayList3.add(new V.b(null, null, null, createBitmap2, i6 / f6, 0, 0, i64 / f5, 0, Integer.MIN_VALUE, -3.4028235E38f, i65 / f5, i62 / f6, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            gVar = gVar3;
                            i49 = i60 + 1;
                            hVar4 = hVar6;
                            arrayList2 = arrayList3;
                            bVar2 = bVar3;
                        }
                    }
                } else {
                    aVar = new V0.a(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        cVar.accept(aVar);
    }

    @Override // V0.l
    public final int w() {
        return 2;
    }
}
