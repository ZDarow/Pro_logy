package p008B1;

/* renamed from: B1.f */
/* loaded from: classes.dex */
public final class C0028f implements p008B1.InterfaceC0023a {

    /* renamed from: a */
    public final /* synthetic */ int f102a;

    /* renamed from: b */
    public final /* synthetic */ p043K2.C0335k f103b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.String f104c;

    public /* synthetic */ C0028f(p043K2.C0335k c0335k, java.lang.String str, int i4) {
        this.f102a = i4;
        this.f103b = c0335k;
        this.f104c = str;
    }

    @Override // p008B1.InterfaceC0023a
    public final void onError(java.lang.String str) {
        switch (this.f102a) {
            case 0:
                if (str == null) {
                    str = "Unknown error occurred";
                }
                this.f103b.mo741a("IO_ERROR", str, null);
                return;
            default:
                if (str == null) {
                    str = "Unknown error occurred";
                }
                this.f103b.mo741a("IO_ERROR", str, null);
                return;
        }
    }

    @Override // p008B1.InterfaceC0023a
    public final void onGeocode(java.util.List list) {
        switch (this.f102a) {
            case 0:
                p043K2.C0335k c0335k = this.f103b;
                if (list == null || list.size() <= 0) {
                    c0335k.mo741a("NOT_FOUND", p009B2.AbstractC0051h.m154m(new java.lang.StringBuilder("No coordinates found for '"), this.f104c, "'"), null);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    android.location.Address address = (android.location.Address) it.next();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("latitude", java.lang.Double.valueOf(address.getLatitude()));
                    hashMap.put("longitude", java.lang.Double.valueOf(address.getLongitude()));
                    hashMap.put("timestamp", java.lang.Long.valueOf(java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC")).getTimeInMillis()));
                    arrayList.add(hashMap);
                }
                c0335k.mo742b(arrayList);
                return;
            default:
                p043K2.C0335k c0335k2 = this.f103b;
                if (list == null || list.size() <= 0) {
                    c0335k2.mo741a("NOT_FOUND", p009B2.AbstractC0051h.m154m(new java.lang.StringBuilder("No coordinates found for '"), this.f104c, "'"), null);
                    return;
                } else {
                    c0335k2.mo742b(p101a.AbstractC0936a.m1785W(list));
                    return;
                }
        }
    }
}
