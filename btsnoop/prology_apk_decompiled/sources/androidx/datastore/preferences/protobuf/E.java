package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0166s f4003b = new C0166s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4004a;

    public E(C0160l c0160l) {
        AbstractC0171x.a(c0160l, "output");
        this.f4004a = c0160l;
        c0160l.f4110g = this;
    }

    public void a(int i4, boolean z4) {
        ((C0160l) this.f4004a).u0(i4, z4);
    }

    public void b(int i4, C0155g c0155g) {
        ((C0160l) this.f4004a).v0(i4, c0155g);
    }

    public void c(int i4, double d4) {
        C0160l c0160l = (C0160l) this.f4004a;
        c0160l.getClass();
        c0160l.z0(Double.doubleToRawLongBits(d4), i4);
    }

    public void d(int i4, int i5) {
        ((C0160l) this.f4004a).B0(i4, i5);
    }

    public void e(int i4, int i5) {
        ((C0160l) this.f4004a).x0(i4, i5);
    }

    public void f(long j4, int i4) {
        ((C0160l) this.f4004a).z0(j4, i4);
    }

    public void g(float f4, int i4) {
        C0160l c0160l = (C0160l) this.f4004a;
        c0160l.getClass();
        c0160l.x0(i4, Float.floatToRawIntBits(f4));
    }

    public void h(int i4, Object obj, V v4) {
        C0160l c0160l = (C0160l) this.f4004a;
        c0160l.F0(i4, 3);
        v4.d((AbstractC0149a) obj, c0160l.f4110g);
        c0160l.F0(i4, 4);
    }

    public void i(int i4, int i5) {
        ((C0160l) this.f4004a).B0(i4, i5);
    }

    public void j(long j4, int i4) {
        ((C0160l) this.f4004a).I0(j4, i4);
    }

    public void k(int i4, Object obj, V v4) {
        C0160l c0160l = (C0160l) this.f4004a;
        AbstractC0149a abstractC0149a = (AbstractC0149a) obj;
        c0160l.F0(i4, 2);
        c0160l.H0(abstractC0149a.a(v4));
        v4.d(abstractC0149a, c0160l.f4110g);
    }

    public void l(int i4, int i5) {
        ((C0160l) this.f4004a).x0(i4, i5);
    }

    public void m(long j4, int i4) {
        ((C0160l) this.f4004a).z0(j4, i4);
    }

    public void n(int i4, int i5) {
        ((C0160l) this.f4004a).G0(i4, (i5 >> 31) ^ (i5 << 1));
    }

    public void o(long j4, int i4) {
        ((C0160l) this.f4004a).I0((j4 >> 63) ^ (j4 << 1), i4);
    }

    public void p(int i4, int i5) {
        ((C0160l) this.f4004a).G0(i4, i5);
    }

    public void q(long j4, int i4) {
        ((C0160l) this.f4004a).I0(j4, i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.datastore.preferences.protobuf.D] */
    public E() {
        S s = S.f4034c;
        Object obj = f4003b;
        try {
            obj = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        K[] kArr = {C0166s.f4144b, obj};
        ?? obj2 = new Object();
        obj2.f4002a = kArr;
        Charset charset = AbstractC0171x.f4148a;
        this.f4004a = obj2;
    }
}
