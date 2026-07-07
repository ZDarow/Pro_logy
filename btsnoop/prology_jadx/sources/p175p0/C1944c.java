package p175p0;

/* renamed from: p0.c */
/* loaded from: classes.dex */
public final class C1944c implements p156l0.InterfaceC1821a {

    /* renamed from: a */
    public final int f7901a;

    /* renamed from: b */
    public final int f7902b;

    /* renamed from: c */
    public final int f7903c;

    /* renamed from: d */
    public final boolean f7904d;

    /* renamed from: e */
    public final p175p0.C1942a f7905e;

    /* renamed from: f */
    public final p175p0.C1943b[] f7906f;

    /* renamed from: g */
    public final long f7907g;

    /* renamed from: h */
    public final long f7908h;

    public C1944c(int i4, int i5, long j4, long j5, int i6, boolean z4, p175p0.C1942a c1942a, p175p0.C1943b[] c1943bArr) {
        this.f7901a = i4;
        this.f7902b = i5;
        this.f7907g = j4;
        this.f7908h = j5;
        this.f7903c = i6;
        this.f7904d = z4;
        this.f7905e = c1942a;
        this.f7906f = c1943bArr;
    }

    @Override // p156l0.InterfaceC1821a
    /* renamed from: a */
    public final java.lang.Object mo3040a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        p175p0.C1943b c1943b = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            p076T.C0673P c0673p = (p076T.C0673P) arrayList.get(i4);
            p175p0.C1943b c1943b2 = this.f7906f[c0673p.f2221m];
            if (c1943b2 != c1943b && c1943b != null) {
                arrayList2.add(c1943b.m3897a((p076T.C0702p[]) arrayList3.toArray(new p076T.C0702p[0])));
                arrayList3.clear();
            }
            arrayList3.add(c1943b2.f7894j[c0673p.f2222n]);
            i4++;
            c1943b = c1943b2;
        }
        if (c1943b != null) {
            arrayList2.add(c1943b.m3897a((p076T.C0702p[]) arrayList3.toArray(new p076T.C0702p[0])));
        }
        return new p175p0.C1944c(this.f7901a, this.f7902b, this.f7907g, this.f7908h, this.f7903c, this.f7904d, this.f7905e, (p175p0.C1943b[]) arrayList2.toArray(new p175p0.C1943b[0]));
    }
}
