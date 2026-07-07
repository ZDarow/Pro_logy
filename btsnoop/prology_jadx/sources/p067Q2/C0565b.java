package p067Q2;

/* renamed from: Q2.b */
/* loaded from: classes.dex */
public final class C0565b extends p047L2.C0391u {

    /* renamed from: d */
    public static final p067Q2.C0565b f1767d = new java.lang.Object();

    @Override // p047L2.C0391u
    /* renamed from: f */
    public final java.lang.Object mo850f(byte b4, java.nio.ByteBuffer byteBuffer) {
        if (b4 != -127) {
            return super.mo850f(b4, byteBuffer);
        }
        java.lang.Object m849e = m849e(byteBuffer);
        if (m849e == null) {
            return null;
        }
        return p067Q2.EnumC0566c.values()[((java.lang.Long) m849e).intValue()];
    }

    @Override // p047L2.C0391u
    /* renamed from: k */
    public final void mo851k(p047L2.C0390t c0390t, java.lang.Object obj) {
        if (!(obj instanceof p067Q2.EnumC0566c)) {
            super.mo851k(c0390t, obj);
        } else {
            c0390t.write(129);
            mo851k(c0390t, obj == null ? null : java.lang.Integer.valueOf(((p067Q2.EnumC0566c) obj).f1769l));
        }
    }
}
