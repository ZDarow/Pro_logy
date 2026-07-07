package p078T2;

/* renamed from: T2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0724a implements p076T.InterfaceC0670M {

    /* renamed from: l */
    public boolean f2512l = false;

    /* renamed from: m */
    public boolean f2513m = false;

    /* renamed from: n */
    public final p102a0.InterfaceC0994s f2514n;

    /* renamed from: o */
    public final p078T2.C0736m f2515o;

    public AbstractC0724a(p102a0.InterfaceC0994s interfaceC0994s, p078T2.C0736m c0736m) {
        this.f2514n = interfaceC0994s;
        this.f2515o = c0736m;
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: E */
    public final void mo1208E(boolean z4) {
        p078T2.C0736m c0736m = this.f2515o;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "isPlayingStateUpdate");
        hashMap.put("isPlaying", java.lang.Boolean.valueOf(z4));
        c0736m.f2541l.m1321b(hashMap);
    }

    /* renamed from: a */
    public abstract void mo1318a();

    @Override // p076T.InterfaceC0670M
    /* renamed from: f */
    public final void mo1213f(int i4) {
        p078T2.C0736m c0736m = this.f2515o;
        if (i4 == 2) {
            m1319g(true);
            c0736m.m1324a(((p102a0.C0944H) this.f2514n).m1850m());
        } else if (i4 != 3) {
            if (i4 == 4) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("event", "completed");
                c0736m.f2541l.m1321b(hashMap);
            }
        } else if (!this.f2513m) {
            this.f2513m = true;
            mo1318a();
        }
        if (i4 != 2) {
            m1319g(false);
        }
    }

    /* renamed from: g */
    public final void m1319g(boolean z4) {
        if (this.f2512l == z4) {
            return;
        }
        this.f2512l = z4;
        p078T2.C0734k c0734k = this.f2515o.f2541l;
        if (z4) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "bufferingStart");
            c0734k.m1321b(hashMap);
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingEnd");
            c0734k.m1321b(hashMap2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, T2.j] */
    @Override // p076T.InterfaceC0670M
    /* renamed from: t */
    public final void mo1226t(p076T.AbstractC0667J abstractC0667J) {
        m1319g(false);
        if (abstractC0667J.f2204l == 1002) {
            p076T.InterfaceC0672O interfaceC0672O = this.f2514n;
            p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) interfaceC0672O;
            abstractC0193e.getClass();
            abstractC0193e.mo558k(((p102a0.C0944H) abstractC0193e).m1854q(), -9223372036854775807L, false);
            ((p102a0.C0944H) interfaceC0672O).m1831D();
            return;
        }
        p078T2.C0734k c0734k = this.f2515o.f2541l;
        c0734k.getClass();
        ?? obj = new java.lang.Object();
        obj.f2532a = "VideoError";
        obj.f2533b = "Video player had error " + abstractC0667J;
        obj.f2534c = null;
        if (!c0734k.f2537c) {
            c0734k.f2536b.add(obj);
        }
        c0734k.m1320a();
    }
}
