package p048M;

/* renamed from: M.a */
/* loaded from: classes.dex */
public final class C0394a extends p154k3.AbstractC1804i implements p149j3.InterfaceC1737l {

    /* renamed from: m */
    public static final p048M.C0394a f1141m = new p154k3.AbstractC1804i(1);

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final java.lang.Object mo661b(java.lang.Object obj) {
        java.lang.String valueOf;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        p154k3.AbstractC1803h.m3779e(entry, "entry");
        java.lang.Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            p154k3.AbstractC1803h.m3779e(bArr, "<this>");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.CharSequence) "[");
            int i4 = 0;
            for (byte b4 : bArr) {
                i4++;
                if (i4 > 1) {
                    sb.append((java.lang.CharSequence) ", ");
                }
                sb.append((java.lang.CharSequence) java.lang.String.valueOf((int) b4));
            }
            sb.append((java.lang.CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = java.lang.String.valueOf(entry.getValue());
        }
        return "  " + ((p048M.C0397d) entry.getKey()).f1147a + " = " + valueOf;
    }
}
