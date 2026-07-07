package p000;

/* renamed from: f */
/* loaded from: classes.dex */
public final class C1366f extends p047L2.C0391u {
    @Override // p047L2.C0391u
    /* renamed from: f */
    public final java.lang.Object mo850f(byte b4, java.nio.ByteBuffer byteBuffer) {
        p154k3.AbstractC1803h.m3779e(byteBuffer, "buffer");
        if (b4 == -127) {
            java.lang.Object m849e = m849e(byteBuffer);
            java.util.List list = m849e instanceof java.util.List ? (java.util.List) m849e : null;
            if (list != null) {
                return new p000.C1162b((java.lang.Boolean) list.get(0));
            }
            return null;
        }
        if (b4 != -126) {
            return super.mo850f(b4, byteBuffer);
        }
        java.lang.Object m849e2 = m849e(byteBuffer);
        java.util.List list2 = m849e2 instanceof java.util.List ? (java.util.List) m849e2 : null;
        if (list2 != null) {
            return new p000.C0935a((java.lang.Boolean) list2.get(0));
        }
        return null;
    }

    @Override // p047L2.C0391u
    /* renamed from: k */
    public final void mo851k(p047L2.C0390t c0390t, java.lang.Object obj) {
        if (obj instanceof p000.C1162b) {
            c0390t.write(129);
            mo851k(c0390t, p176p1.AbstractC1949a.m3904E(((p000.C1162b) obj).f4478a));
        } else if (!(obj instanceof p000.C0935a)) {
            super.mo851k(c0390t, obj);
        } else {
            c0390t.write(130);
            mo851k(c0390t, p176p1.AbstractC1949a.m3904E(((p000.C0935a) obj).f3299a));
        }
    }
}
