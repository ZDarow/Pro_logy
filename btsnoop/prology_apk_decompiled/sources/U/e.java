package U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public b f2471b;

    /* renamed from: c, reason: collision with root package name */
    public b f2472c;

    /* renamed from: d, reason: collision with root package name */
    public b f2473d;

    /* renamed from: e, reason: collision with root package name */
    public b f2474e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f2475f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f2476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2477h;

    public e() {
        ByteBuffer byteBuffer = d.f2470a;
        this.f2475f = byteBuffer;
        this.f2476g = byteBuffer;
        b bVar = b.f2465e;
        this.f2473d = bVar;
        this.f2474e = bVar;
        this.f2471b = bVar;
        this.f2472c = bVar;
    }

    @Override // U.d
    public boolean a() {
        return this.f2474e != b.f2465e;
    }

    @Override // U.d
    public final void b() {
        flush();
        this.f2475f = d.f2470a;
        b bVar = b.f2465e;
        this.f2473d = bVar;
        this.f2474e = bVar;
        this.f2471b = bVar;
        this.f2472c = bVar;
        k();
    }

    @Override // U.d
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f2476g;
        this.f2476g = d.f2470a;
        return byteBuffer;
    }

    @Override // U.d
    public final void d() {
        this.f2477h = true;
        j();
    }

    @Override // U.d
    public boolean e() {
        return this.f2477h && this.f2476g == d.f2470a;
    }

    @Override // U.d
    public final void flush() {
        this.f2476g = d.f2470a;
        this.f2477h = false;
        this.f2471b = this.f2473d;
        this.f2472c = this.f2474e;
        i();
    }

    @Override // U.d
    public final b g(b bVar) {
        this.f2473d = bVar;
        this.f2474e = h(bVar);
        return a() ? this.f2474e : b.f2465e;
    }

    public abstract b h(b bVar);

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i4) {
        if (this.f2475f.capacity() < i4) {
            this.f2475f = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        } else {
            this.f2475f.clear();
        }
        ByteBuffer byteBuffer = this.f2475f;
        this.f2476g = byteBuffer;
        return byteBuffer;
    }
}
