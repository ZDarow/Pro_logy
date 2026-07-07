package p047L2;

/* renamed from: L2.k */
/* loaded from: classes.dex */
public final class C0381k implements p047L2.InterfaceC0383m {

    /* renamed from: a */
    public static final p047L2.C0381k f1131a = new java.lang.Object();

    @Override // p047L2.InterfaceC0383m
    /* renamed from: a */
    public final java.lang.Object mo831a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            p047L2.C0393w.f1140b.getClass();
            org.json.JSONTokener jSONTokener = new org.json.JSONTokener(p047L2.C0393w.m852c(byteBuffer));
            java.lang.Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new java.lang.IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (org.json.JSONException e4) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // p047L2.InterfaceC0383m
    /* renamed from: b */
    public final java.nio.ByteBuffer mo832b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.Object m1365M = p080U1.AbstractC0748a.m1365M(obj);
        if (m1365M instanceof java.lang.String) {
            p047L2.C0393w c0393w = p047L2.C0393w.f1140b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) m1365M);
            c0393w.getClass();
            return p047L2.C0393w.m853d(quote);
        }
        p047L2.C0393w c0393w2 = p047L2.C0393w.f1140b;
        java.lang.String obj2 = m1365M.toString();
        c0393w2.getClass();
        return p047L2.C0393w.m853d(obj2);
    }
}
