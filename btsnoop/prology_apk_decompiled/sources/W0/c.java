package W0;

import K2.o;
import W.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: i, reason: collision with root package name */
    public final int f2745i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2746j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2747k;

    /* renamed from: o, reason: collision with root package name */
    public List f2751o;

    /* renamed from: p, reason: collision with root package name */
    public List f2752p;

    /* renamed from: q, reason: collision with root package name */
    public int f2753q;

    /* renamed from: r, reason: collision with root package name */
    public int f2754r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2755t;

    /* renamed from: u, reason: collision with root package name */
    public byte f2756u;

    /* renamed from: v, reason: collision with root package name */
    public byte f2757v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2758x;

    /* renamed from: y, reason: collision with root package name */
    public long f2759y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2743z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f2736A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f2737B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2738C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2739D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f2740E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f2741F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f2742G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final r f2744h = new r();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2749m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public b f2750n = new b(0, 4);
    public int w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f2748l = 16000000;

    public c(String str, int i4) {
        this.f2745i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i4 == 1) {
            this.f2747k = 0;
            this.f2746j = 0;
        } else if (i4 == 2) {
            this.f2747k = 1;
            this.f2746j = 0;
        } else if (i4 == 3) {
            this.f2747k = 0;
            this.f2746j = 1;
        } else if (i4 != 4) {
            W.a.A("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f2747k = 0;
            this.f2746j = 0;
        } else {
            this.f2747k = 1;
            this.f2746j = 1;
        }
        l(0);
        k();
        this.f2758x = true;
        this.f2759y = -9223372036854775807L;
    }

    @Override // W0.i
    public final o f() {
        List list = this.f2751o;
        this.f2752p = list;
        list.getClass();
        return new o(16, list);
    }

    @Override // W0.i, Z.c
    public final void flush() {
        super.flush();
        this.f2751o = null;
        this.f2752p = null;
        l(0);
        this.f2754r = 4;
        this.f2750n.f2735h = 4;
        k();
        this.s = false;
        this.f2755t = false;
        this.f2756u = (byte) 0;
        this.f2757v = (byte) 0;
        this.w = 0;
        this.f2758x = true;
        this.f2759y = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // W0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(W0.h r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.c.g(W0.h):void");
    }

    @Override // W0.i, Z.c
    /* renamed from: h */
    public final V0.c b() {
        V0.c cVar;
        V0.c b4 = super.b();
        if (b4 != null) {
            return b4;
        }
        long j4 = this.f2748l;
        if (j4 == -9223372036854775807L) {
            return null;
        }
        long j5 = this.f2759y;
        if (j5 == -9223372036854775807L || this.f2808e - j5 < j4 || (cVar = (V0.c) this.f2805b.pollFirst()) == null) {
            return null;
        }
        this.f2751o = Collections.emptyList();
        this.f2759y = -9223372036854775807L;
        o f4 = f();
        long j6 = this.f2808e;
        cVar.f3144n = j6;
        cVar.f2603p = f4;
        cVar.f2604q = j6;
        return cVar;
    }

    @Override // W0.i
    public final boolean i() {
        return this.f2751o != this.f2752p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f2749m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i4 = 2;
        for (int i5 = 0; i5 < size; i5++) {
            V.b c4 = ((b) arrayList.get(i5)).c(Integer.MIN_VALUE);
            arrayList2.add(c4);
            if (c4 != null) {
                i4 = Math.min(i4, c4.f2570i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            V.b bVar = (V.b) arrayList2.get(i6);
            if (bVar != null) {
                if (bVar.f2570i != i4) {
                    bVar = ((b) arrayList.get(i6)).c(i4);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f2750n;
        bVar.f2734g = this.f2753q;
        bVar.f2728a.clear();
        bVar.f2729b.clear();
        bVar.f2730c.setLength(0);
        bVar.f2731d = 15;
        bVar.f2732e = 0;
        bVar.f2733f = 0;
        ArrayList arrayList = this.f2749m;
        arrayList.clear();
        arrayList.add(this.f2750n);
    }

    public final void l(int i4) {
        int i5 = this.f2753q;
        if (i5 == i4) {
            return;
        }
        this.f2753q = i4;
        if (i4 != 3) {
            k();
            if (i5 == 3 || i4 == 1 || i4 == 0) {
                this.f2751o = Collections.emptyList();
                return;
            }
            return;
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f2749m;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i6)).f2734g = i4;
            i6++;
        }
    }

    @Override // W0.i, Z.c
    public final void release() {
    }
}
