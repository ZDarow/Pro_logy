package p136h0;

/* renamed from: h0.l */
/* loaded from: classes.dex */
public final class C1495l extends p136h0.AbstractC1496m {

    /* renamed from: l */
    public static final p136h0.C1495l f6140l = new p136h0.C1495l("", java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), null, java.util.Collections.emptyList(), false, java.util.Collections.emptyMap(), java.util.Collections.emptyList());

    /* renamed from: d */
    public final java.util.List f6141d;

    /* renamed from: e */
    public final java.util.List f6142e;

    /* renamed from: f */
    public final java.util.List f6143f;

    /* renamed from: g */
    public final java.util.List f6144g;

    /* renamed from: h */
    public final p076T.C0702p f6145h;

    /* renamed from: i */
    public final java.util.List f6146i;

    /* renamed from: j */
    public final java.util.Map f6147j;

    /* renamed from: k */
    public final java.util.List f6148k;

    public C1495l(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, p076T.C0702p c0702p, java.util.List list7, boolean z4, java.util.Map map, java.util.List list8) {
        super(str, list, z4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < list2.size(); i4++) {
            android.net.Uri uri = ((p136h0.C1494k) list2.get(i4)).f6134a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m3320b(list3, arrayList);
        m3320b(list4, arrayList);
        m3320b(list5, arrayList);
        m3320b(list6, arrayList);
        this.f6141d = java.util.Collections.unmodifiableList(arrayList);
        this.f6142e = java.util.Collections.unmodifiableList(list2);
        java.util.Collections.unmodifiableList(list3);
        this.f6143f = java.util.Collections.unmodifiableList(list4);
        this.f6144g = java.util.Collections.unmodifiableList(list5);
        java.util.Collections.unmodifiableList(list6);
        this.f6145h = c0702p;
        this.f6146i = list7 != null ? java.util.Collections.unmodifiableList(list7) : null;
        this.f6147j = java.util.Collections.unmodifiableMap(map);
        this.f6148k = java.util.Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m3320b(java.util.List list, java.util.ArrayList arrayList) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            android.net.Uri uri = ((p136h0.C1493j) list.get(i4)).f6131a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* renamed from: c */
    public static java.util.ArrayList m3321c(java.util.List list, int i4, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            java.lang.Object obj = list.get(i5);
            int i6 = 0;
            while (true) {
                if (i6 < list2.size()) {
                    p076T.C0673P c0673p = (p076T.C0673P) list2.get(i6);
                    if (c0673p.f2221m == i4 && c0673p.f2222n == i5) {
                        arrayList.add(obj);
                        break;
                    }
                    i6++;
                }
            }
        }
        return arrayList;
    }

    @Override // p156l0.InterfaceC1821a
    /* renamed from: a */
    public final java.lang.Object mo3040a(java.util.List list) {
        return new p136h0.C1495l(this.f6149a, this.f6150b, m3321c(this.f6142e, 0, list), java.util.Collections.emptyList(), m3321c(this.f6143f, 1, list), m3321c(this.f6144g, 2, list), java.util.Collections.emptyList(), this.f6145h, this.f6146i, this.f6151c, this.f6147j, this.f6148k);
    }
}
