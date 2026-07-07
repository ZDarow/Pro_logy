package p019D3;

/* renamed from: D3.a */
/* loaded from: classes.dex */
public final class C0187a implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o {

    /* renamed from: l */
    public p035I.C0291m f513l;

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        p154k3.AbstractC1803h.m3779e(c0384n, "call");
        java.lang.String str = c0384n.f1133a;
        if (p154k3.AbstractC1803h.m3775a(str, "encode")) {
            java.nio.ByteBuffer encode = java.nio.charset.Charset.forName((java.lang.String) c0384n.m839a("charset")).encode((java.lang.String) c0384n.m839a("data"));
            byte[] bArr = new byte[encode.remaining()];
            encode.get(bArr);
            c0335k.mo742b(bArr);
            return;
        }
        if (p154k3.AbstractC1803h.m3775a(str, "decode")) {
            c0335k.mo742b(java.nio.charset.Charset.forName((java.lang.String) c0384n.m839a("charset")).decode(java.nio.ByteBuffer.wrap((byte[]) c0384n.m839a("data"))).toString());
            return;
        }
        if (!p154k3.AbstractC1803h.m3775a(str, "availableCharsets")) {
            if (!p154k3.AbstractC1803h.m3775a(str, "check")) {
                c0335k.mo743c();
                return;
            }
            try {
                c0335k.mo742b(java.lang.Boolean.valueOf(java.nio.charset.Charset.forName((java.lang.String) c0384n.m839a("charset")) != null));
                return;
            } catch (java.lang.Exception unused) {
                c0335k.mo742b(java.lang.Boolean.FALSE);
                return;
            }
        }
        java.util.Set<java.lang.String> keySet = java.nio.charset.Charset.availableCharsets().keySet();
        p154k3.AbstractC1803h.m3778d(keySet, "<get-keys>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        c0335k.mo742b(p105a3.AbstractC1021d.m2053h0(arrayList));
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p035I.C0291m c0291m = this.f513l;
        if (c0291m != null) {
            c0291m.m702s(null);
        } else {
            p154k3.AbstractC1803h.m3783i("channel");
            throw null;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "flutterPluginBinding");
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "charset_converter");
        this.f513l = c0291m;
        c0291m.m702s(this);
    }
}
