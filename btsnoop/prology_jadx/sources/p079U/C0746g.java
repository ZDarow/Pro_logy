package p079U;

/* renamed from: U.g */
/* loaded from: classes.dex */
public final class C0746g implements p079U.InterfaceC0743d {

    /* renamed from: b */
    public int f2587b;

    /* renamed from: c */
    public float f2588c;

    /* renamed from: d */
    public float f2589d;

    /* renamed from: e */
    public p079U.C0741b f2590e;

    /* renamed from: f */
    public p079U.C0741b f2591f;

    /* renamed from: g */
    public p079U.C0741b f2592g;

    /* renamed from: h */
    public p079U.C0741b f2593h;

    /* renamed from: i */
    public boolean f2594i;

    /* renamed from: j */
    public p079U.C0745f f2595j;

    /* renamed from: k */
    public java.nio.ByteBuffer f2596k;

    /* renamed from: l */
    public java.nio.ShortBuffer f2597l;

    /* renamed from: m */
    public java.nio.ByteBuffer f2598m;

    /* renamed from: n */
    public long f2599n;

    /* renamed from: o */
    public long f2600o;

    /* renamed from: p */
    public boolean f2601p;

    @Override // p079U.InterfaceC0743d
    /* renamed from: a */
    public final boolean mo1337a() {
        return this.f2591f.f2553a != -1 && (java.lang.Math.abs(this.f2588c - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.f2589d - 1.0f) >= 1.0E-4f || this.f2591f.f2553a != this.f2590e.f2553a);
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: b */
    public final void mo1338b() {
        this.f2588c = 1.0f;
        this.f2589d = 1.0f;
        p079U.C0741b c0741b = p079U.C0741b.f2552e;
        this.f2590e = c0741b;
        this.f2591f = c0741b;
        this.f2592g = c0741b;
        this.f2593h = c0741b;
        java.nio.ByteBuffer byteBuffer = p079U.InterfaceC0743d.f2557a;
        this.f2596k = byteBuffer;
        this.f2597l = byteBuffer.asShortBuffer();
        this.f2598m = byteBuffer;
        this.f2587b = -1;
        this.f2594i = false;
        this.f2595j = null;
        this.f2599n = 0L;
        this.f2600o = 0L;
        this.f2601p = false;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: c */
    public final java.nio.ByteBuffer mo1339c() {
        p079U.C0745f c0745f = this.f2595j;
        if (c0745f != null) {
            int i4 = c0745f.f2577m;
            int i5 = c0745f.f2566b;
            int i6 = i4 * i5 * 2;
            if (i6 > 0) {
                if (this.f2596k.capacity() < i6) {
                    java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(i6).order(java.nio.ByteOrder.nativeOrder());
                    this.f2596k = order;
                    this.f2597l = order.asShortBuffer();
                } else {
                    this.f2596k.clear();
                    this.f2597l.clear();
                }
                java.nio.ShortBuffer shortBuffer = this.f2597l;
                int min = java.lang.Math.min(shortBuffer.remaining() / i5, c0745f.f2577m);
                int i7 = min * i5;
                shortBuffer.put(c0745f.f2576l, 0, i7);
                int i8 = c0745f.f2577m - min;
                c0745f.f2577m = i8;
                short[] sArr = c0745f.f2576l;
                java.lang.System.arraycopy(sArr, i7, sArr, 0, i8 * i5);
                this.f2600o += i6;
                this.f2596k.limit(i6);
                this.f2598m = this.f2596k;
            }
        }
        java.nio.ByteBuffer byteBuffer = this.f2598m;
        this.f2598m = p079U.InterfaceC0743d.f2557a;
        return byteBuffer;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: d */
    public final void mo1340d() {
        p079U.C0745f c0745f = this.f2595j;
        if (c0745f != null) {
            int i4 = c0745f.f2575k;
            float f4 = c0745f.f2567c;
            float f5 = c0745f.f2568d;
            int i5 = c0745f.f2577m + ((int) ((((i4 / (f4 / f5)) + c0745f.f2579o) / (c0745f.f2569e * f5)) + 0.5f));
            short[] sArr = c0745f.f2574j;
            int i6 = c0745f.f2572h * 2;
            c0745f.f2574j = c0745f.m1352c(sArr, i4, i6 + i4);
            int i7 = 0;
            while (true) {
                int i8 = c0745f.f2566b;
                if (i7 >= i6 * i8) {
                    break;
                }
                c0745f.f2574j[(i8 * i4) + i7] = 0;
                i7++;
            }
            c0745f.f2575k = i6 + c0745f.f2575k;
            c0745f.m1354f();
            if (c0745f.f2577m > i5) {
                c0745f.f2577m = i5;
            }
            c0745f.f2575k = 0;
            c0745f.f2582r = 0;
            c0745f.f2579o = 0;
        }
        this.f2601p = true;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: e */
    public final boolean mo1341e() {
        p079U.C0745f c0745f;
        return this.f2601p && ((c0745f = this.f2595j) == null || (c0745f.f2577m * c0745f.f2566b) * 2 == 0);
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: f */
    public final void mo1342f(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            p079U.C0745f c0745f = this.f2595j;
            c0745f.getClass();
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f2599n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i4 = c0745f.f2566b;
            int i5 = remaining2 / i4;
            short[] m1352c = c0745f.m1352c(c0745f.f2574j, c0745f.f2575k, i5);
            c0745f.f2574j = m1352c;
            asShortBuffer.get(m1352c, c0745f.f2575k * i4, ((i5 * i4) * 2) / 2);
            c0745f.f2575k += i5;
            c0745f.m1354f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p079U.InterfaceC0743d
    public final void flush() {
        if (mo1337a()) {
            p079U.C0741b c0741b = this.f2590e;
            this.f2592g = c0741b;
            p079U.C0741b c0741b2 = this.f2591f;
            this.f2593h = c0741b2;
            if (this.f2594i) {
                this.f2595j = new p079U.C0745f(c0741b.f2553a, c0741b.f2554b, this.f2588c, this.f2589d, c0741b2.f2553a);
            } else {
                p079U.C0745f c0745f = this.f2595j;
                if (c0745f != null) {
                    c0745f.f2575k = 0;
                    c0745f.f2577m = 0;
                    c0745f.f2579o = 0;
                    c0745f.f2580p = 0;
                    c0745f.f2581q = 0;
                    c0745f.f2582r = 0;
                    c0745f.f2583s = 0;
                    c0745f.f2584t = 0;
                    c0745f.f2585u = 0;
                    c0745f.f2586v = 0;
                }
            }
        }
        this.f2598m = p079U.InterfaceC0743d.f2557a;
        this.f2599n = 0L;
        this.f2600o = 0L;
        this.f2601p = false;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: g */
    public final p079U.C0741b mo1343g(p079U.C0741b c0741b) {
        if (c0741b.f2555c != 2) {
            throw new p079U.C0742c(c0741b);
        }
        int i4 = this.f2587b;
        if (i4 == -1) {
            i4 = c0741b.f2553a;
        }
        this.f2590e = c0741b;
        p079U.C0741b c0741b2 = new p079U.C0741b(i4, c0741b.f2554b, 2);
        this.f2591f = c0741b2;
        this.f2594i = true;
        return c0741b2;
    }
}
