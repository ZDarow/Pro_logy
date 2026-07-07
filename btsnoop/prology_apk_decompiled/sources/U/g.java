package U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public int f2499b;

    /* renamed from: c, reason: collision with root package name */
    public float f2500c;

    /* renamed from: d, reason: collision with root package name */
    public float f2501d;

    /* renamed from: e, reason: collision with root package name */
    public b f2502e;

    /* renamed from: f, reason: collision with root package name */
    public b f2503f;

    /* renamed from: g, reason: collision with root package name */
    public b f2504g;

    /* renamed from: h, reason: collision with root package name */
    public b f2505h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2506i;

    /* renamed from: j, reason: collision with root package name */
    public f f2507j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f2508k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f2509l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f2510m;

    /* renamed from: n, reason: collision with root package name */
    public long f2511n;

    /* renamed from: o, reason: collision with root package name */
    public long f2512o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2513p;

    @Override // U.d
    public final boolean a() {
        return this.f2503f.f2466a != -1 && (Math.abs(this.f2500c - 1.0f) >= 1.0E-4f || Math.abs(this.f2501d - 1.0f) >= 1.0E-4f || this.f2503f.f2466a != this.f2502e.f2466a);
    }

    @Override // U.d
    public final void b() {
        this.f2500c = 1.0f;
        this.f2501d = 1.0f;
        b bVar = b.f2465e;
        this.f2502e = bVar;
        this.f2503f = bVar;
        this.f2504g = bVar;
        this.f2505h = bVar;
        ByteBuffer byteBuffer = d.f2470a;
        this.f2508k = byteBuffer;
        this.f2509l = byteBuffer.asShortBuffer();
        this.f2510m = byteBuffer;
        this.f2499b = -1;
        this.f2506i = false;
        this.f2507j = null;
        this.f2511n = 0L;
        this.f2512o = 0L;
        this.f2513p = false;
    }

    @Override // U.d
    public final ByteBuffer c() {
        f fVar = this.f2507j;
        if (fVar != null) {
            int i4 = fVar.f2490m;
            int i5 = fVar.f2479b;
            int i6 = i4 * i5 * 2;
            if (i6 > 0) {
                if (this.f2508k.capacity() < i6) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
                    this.f2508k = order;
                    this.f2509l = order.asShortBuffer();
                } else {
                    this.f2508k.clear();
                    this.f2509l.clear();
                }
                ShortBuffer shortBuffer = this.f2509l;
                int min = Math.min(shortBuffer.remaining() / i5, fVar.f2490m);
                int i7 = min * i5;
                shortBuffer.put(fVar.f2489l, 0, i7);
                int i8 = fVar.f2490m - min;
                fVar.f2490m = i8;
                short[] sArr = fVar.f2489l;
                System.arraycopy(sArr, i7, sArr, 0, i8 * i5);
                this.f2512o += i6;
                this.f2508k.limit(i6);
                this.f2510m = this.f2508k;
            }
        }
        ByteBuffer byteBuffer = this.f2510m;
        this.f2510m = d.f2470a;
        return byteBuffer;
    }

    @Override // U.d
    public final void d() {
        f fVar = this.f2507j;
        if (fVar != null) {
            int i4 = fVar.f2488k;
            float f4 = fVar.f2480c;
            float f5 = fVar.f2481d;
            int i5 = fVar.f2490m + ((int) ((((i4 / (f4 / f5)) + fVar.f2492o) / (fVar.f2482e * f5)) + 0.5f));
            short[] sArr = fVar.f2487j;
            int i6 = fVar.f2485h * 2;
            fVar.f2487j = fVar.c(sArr, i4, i6 + i4);
            int i7 = 0;
            while (true) {
                int i8 = fVar.f2479b;
                if (i7 >= i6 * i8) {
                    break;
                }
                fVar.f2487j[(i8 * i4) + i7] = 0;
                i7++;
            }
            fVar.f2488k = i6 + fVar.f2488k;
            fVar.f();
            if (fVar.f2490m > i5) {
                fVar.f2490m = i5;
            }
            fVar.f2488k = 0;
            fVar.f2495r = 0;
            fVar.f2492o = 0;
        }
        this.f2513p = true;
    }

    @Override // U.d
    public final boolean e() {
        f fVar;
        return this.f2513p && ((fVar = this.f2507j) == null || (fVar.f2490m * fVar.f2479b) * 2 == 0);
    }

    @Override // U.d
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f fVar = this.f2507j;
            fVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f2511n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i4 = fVar.f2479b;
            int i5 = remaining2 / i4;
            short[] c4 = fVar.c(fVar.f2487j, fVar.f2488k, i5);
            fVar.f2487j = c4;
            asShortBuffer.get(c4, fVar.f2488k * i4, ((i5 * i4) * 2) / 2);
            fVar.f2488k += i5;
            fVar.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // U.d
    public final void flush() {
        if (a()) {
            b bVar = this.f2502e;
            this.f2504g = bVar;
            b bVar2 = this.f2503f;
            this.f2505h = bVar2;
            if (this.f2506i) {
                this.f2507j = new f(bVar.f2466a, bVar.f2467b, this.f2500c, this.f2501d, bVar2.f2466a);
            } else {
                f fVar = this.f2507j;
                if (fVar != null) {
                    fVar.f2488k = 0;
                    fVar.f2490m = 0;
                    fVar.f2492o = 0;
                    fVar.f2493p = 0;
                    fVar.f2494q = 0;
                    fVar.f2495r = 0;
                    fVar.s = 0;
                    fVar.f2496t = 0;
                    fVar.f2497u = 0;
                    fVar.f2498v = 0;
                }
            }
        }
        this.f2510m = d.f2470a;
        this.f2511n = 0L;
        this.f2512o = 0L;
        this.f2513p = false;
    }

    @Override // U.d
    public final b g(b bVar) {
        if (bVar.f2468c != 2) {
            throw new c(bVar);
        }
        int i4 = this.f2499b;
        if (i4 == -1) {
            i4 = bVar.f2466a;
        }
        this.f2502e = bVar;
        b bVar2 = new b(i4, bVar.f2467b, 2);
        this.f2503f = bVar2;
        this.f2506i = true;
        return bVar2;
    }
}
