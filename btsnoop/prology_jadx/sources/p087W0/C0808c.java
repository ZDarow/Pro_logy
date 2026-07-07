package p087W0;

/* renamed from: W0.c */
/* loaded from: classes.dex */
public final class C0808c extends p087W0.AbstractC0814i {

    /* renamed from: i */
    public final int f2837i;

    /* renamed from: j */
    public final int f2838j;

    /* renamed from: k */
    public final int f2839k;

    /* renamed from: o */
    public java.util.List f2843o;

    /* renamed from: p */
    public java.util.List f2844p;

    /* renamed from: q */
    public int f2845q;

    /* renamed from: r */
    public int f2846r;

    /* renamed from: s */
    public boolean f2847s;

    /* renamed from: t */
    public boolean f2848t;

    /* renamed from: u */
    public byte f2849u;

    /* renamed from: v */
    public byte f2850v;

    /* renamed from: x */
    public boolean f2852x;

    /* renamed from: y */
    public long f2853y;

    /* renamed from: z */
    public static final int[] f2835z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A */
    public static final int[] f2828A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B */
    public static final int[] f2829B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C */
    public static final int[] f2830C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D */
    public static final int[] f2831D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E */
    public static final int[] f2832E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F */
    public static final int[] f2833F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G */
    public static final boolean[] f2834G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h */
    public final p086W.C0798r f2836h = new p086W.C0798r();

    /* renamed from: m */
    public final java.util.ArrayList f2841m = new java.util.ArrayList();

    /* renamed from: n */
    public p087W0.C0807b f2842n = new p087W0.C0807b(0, 4);

    /* renamed from: w */
    public int f2851w = 0;

    /* renamed from: l */
    public final long f2840l = 16000000;

    public C0808c(java.lang.String str, int i4) {
        this.f2837i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i4 == 1) {
            this.f2839k = 0;
            this.f2838j = 0;
        } else if (i4 == 2) {
            this.f2839k = 1;
            this.f2838j = 0;
        } else if (i4 == 3) {
            this.f2839k = 0;
            this.f2838j = 1;
        } else if (i4 != 4) {
            p086W.AbstractC0781a.m1410A("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f2839k = 0;
            this.f2838j = 0;
        } else {
            this.f2839k = 1;
            this.f2838j = 1;
        }
        m1644l(0);
        m1643k();
        this.f2852x = true;
        this.f2853y = -9223372036854775807L;
    }

    @Override // p087W0.AbstractC0814i
    /* renamed from: f */
    public final p043K2.C0339o mo1638f() {
        java.util.List list = this.f2843o;
        this.f2844p = list;
        list.getClass();
        return new p043K2.C0339o(16, list);
    }

    @Override // p087W0.AbstractC0814i, p098Z.InterfaceC0918c
    public final void flush() {
        super.flush();
        this.f2843o = null;
        this.f2844p = null;
        m1644l(0);
        this.f2846r = 4;
        this.f2842n.f2827h = 4;
        m1643k();
        this.f2847s = false;
        this.f2848t = false;
        this.f2849u = (byte) 0;
        this.f2850v = (byte) 0;
        this.f2851w = 0;
        this.f2852x = true;
        this.f2853y = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // p087W0.AbstractC0814i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1639g(p087W0.C0813h r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p087W0.C0808c.mo1639g(W0.h):void");
    }

    @Override // p087W0.AbstractC0814i, p098Z.InterfaceC0918c
    /* renamed from: h */
    public final p083V0.C0765c mo1637b() {
        p083V0.C0765c c0765c;
        p083V0.C0765c mo1637b = super.mo1637b();
        if (mo1637b != null) {
            return mo1637b;
        }
        long j4 = this.f2840l;
        if (j4 == -9223372036854775807L) {
            return null;
        }
        long j5 = this.f2853y;
        if (j5 == -9223372036854775807L || this.f2904e - j5 < j4 || (c0765c = (p083V0.C0765c) this.f2901b.pollFirst()) == null) {
            return null;
        }
        this.f2843o = java.util.Collections.emptyList();
        this.f2853y = -9223372036854775807L;
        p043K2.C0339o mo1638f = mo1638f();
        long j6 = this.f2904e;
        c0765c.f3256n = j6;
        c0765c.f2694p = mo1638f;
        c0765c.f2695q = j6;
        return c0765c;
    }

    @Override // p087W0.AbstractC0814i
    /* renamed from: i */
    public final boolean mo1641i() {
        return this.f2843o != this.f2844p;
    }

    /* renamed from: j */
    public final java.util.ArrayList m1642j() {
        java.util.ArrayList arrayList = this.f2841m;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        int i4 = 2;
        for (int i5 = 0; i5 < size; i5++) {
            p082V.C0757b m1634c = ((p087W0.C0807b) arrayList.get(i5)).m1634c(Integer.MIN_VALUE);
            arrayList2.add(m1634c);
            if (m1634c != null) {
                i4 = java.lang.Math.min(i4, m1634c.f2661i);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            p082V.C0757b c0757b = (p082V.C0757b) arrayList2.get(i6);
            if (c0757b != null) {
                if (c0757b.f2661i != i4) {
                    c0757b = ((p087W0.C0807b) arrayList.get(i6)).m1634c(i4);
                    c0757b.getClass();
                }
                arrayList3.add(c0757b);
            }
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m1643k() {
        p087W0.C0807b c0807b = this.f2842n;
        c0807b.f2826g = this.f2845q;
        c0807b.f2820a.clear();
        c0807b.f2821b.clear();
        c0807b.f2822c.setLength(0);
        c0807b.f2823d = 15;
        c0807b.f2824e = 0;
        c0807b.f2825f = 0;
        java.util.ArrayList arrayList = this.f2841m;
        arrayList.clear();
        arrayList.add(this.f2842n);
    }

    /* renamed from: l */
    public final void m1644l(int i4) {
        int i5 = this.f2845q;
        if (i5 == i4) {
            return;
        }
        this.f2845q = i4;
        if (i4 != 3) {
            m1643k();
            if (i5 == 3 || i4 == 1 || i4 == 0) {
                this.f2843o = java.util.Collections.emptyList();
                return;
            }
            return;
        }
        int i6 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f2841m;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((p087W0.C0807b) arrayList.get(i6)).f2826g = i4;
            i6++;
        }
    }

    @Override // p087W0.AbstractC0814i, p098Z.InterfaceC0918c
    public final void release() {
    }
}
