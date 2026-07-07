package p071R2;

/* renamed from: R2.b */
/* loaded from: classes.dex */
public final class C0596b extends p047L2.C0391u {

    /* renamed from: e */
    public static final p071R2.C0596b f1869e = new p071R2.C0596b(0);

    /* renamed from: d */
    public final /* synthetic */ int f1870d;

    public /* synthetic */ C0596b(int i4) {
        this.f1870d = i4;
    }

    @Override // p047L2.C0391u
    /* renamed from: f */
    public java.lang.Object mo850f(byte b4, java.nio.ByteBuffer byteBuffer) {
        switch (this.f1870d) {
            case 1:
                p154k3.AbstractC1803h.m3779e(byteBuffer, "buffer");
                if (b4 == -127) {
                    java.lang.Long l4 = (java.lang.Long) m849e(byteBuffer);
                    if (l4 == null) {
                        return null;
                    }
                    int longValue = (int) l4.longValue();
                    p071R2.EnumC0592M.f1859m.getClass();
                    for (p071R2.EnumC0592M enumC0592M : p071R2.EnumC0592M.values()) {
                        if (enumC0592M.f1864l == longValue) {
                            return enumC0592M;
                        }
                    }
                    return null;
                }
                if (b4 == -126) {
                    java.lang.Object m849e = m849e(byteBuffer);
                    java.util.List list = m849e instanceof java.util.List ? (java.util.List) m849e : null;
                    if (list == null) {
                        return null;
                    }
                    java.lang.String str = (java.lang.String) list.get(0);
                    java.lang.Object obj = list.get(1);
                    p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new p071R2.C0602h(str, ((java.lang.Boolean) obj).booleanValue());
                }
                if (b4 != -125) {
                    return super.mo850f(b4, byteBuffer);
                }
                java.lang.Object m849e2 = m849e(byteBuffer);
                java.util.List list2 = m849e2 instanceof java.util.List ? (java.util.List) m849e2 : null;
                if (list2 == null) {
                    return null;
                }
                java.lang.String str2 = (java.lang.String) list2.get(0);
                java.lang.Object obj2 = list2.get(1);
                p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new p071R2.C0594O(str2, (p071R2.EnumC0592M) obj2);
            default:
                return super.mo850f(b4, byteBuffer);
        }
    }

    @Override // p047L2.C0391u
    /* renamed from: k */
    public void mo851k(p047L2.C0390t c0390t, java.lang.Object obj) {
        switch (this.f1870d) {
            case 1:
                if (obj instanceof p071R2.EnumC0592M) {
                    c0390t.write(129);
                    mo851k(c0390t, java.lang.Integer.valueOf(((p071R2.EnumC0592M) obj).f1864l));
                    return;
                }
                if (obj instanceof p071R2.C0602h) {
                    c0390t.write(130);
                    p071R2.C0602h c0602h = (p071R2.C0602h) obj;
                    mo851k(c0390t, p105a3.AbstractC1022e.m2056d0(c0602h.f1879a, java.lang.Boolean.valueOf(c0602h.f1880b)));
                    return;
                }
                if (!(obj instanceof p071R2.C0594O)) {
                    super.mo851k(c0390t, obj);
                    return;
                }
                c0390t.write(131);
                p071R2.C0594O c0594o = (p071R2.C0594O) obj;
                mo851k(c0390t, p105a3.AbstractC1022e.m2056d0(c0594o.f1865a, c0594o.f1866b));
                return;
            default:
                super.mo851k(c0390t, obj);
                return;
        }
    }
}
