package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class C1148l {

    /* renamed from: a */
    public androidx.lifecycle.EnumC1142f f4309a;

    /* renamed from: b */
    public androidx.lifecycle.InterfaceC1146j f4310b;

    /* renamed from: a */
    public final void m2656a(androidx.lifecycle.InterfaceC1147k interfaceC1147k, androidx.lifecycle.EnumC1141e enumC1141e) {
        androidx.lifecycle.EnumC1142f m2654a = enumC1141e.m2654a();
        androidx.lifecycle.EnumC1142f enumC1142f = this.f4309a;
        p154k3.AbstractC1803h.m3779e(enumC1142f, "state1");
        if (m2654a.compareTo(enumC1142f) < 0) {
            enumC1142f = m2654a;
        }
        this.f4309a = enumC1142f;
        this.f4310b.mo2655a(interfaceC1147k, enumC1141e);
        this.f4309a = m2654a;
    }
}
