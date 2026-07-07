package p122e0;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public final class C1302c implements p156l0.InterfaceC1821a {

    /* renamed from: a */
    public final long f5217a;

    /* renamed from: b */
    public final long f5218b;

    /* renamed from: c */
    public final long f5219c;

    /* renamed from: d */
    public final boolean f5220d;

    /* renamed from: e */
    public final long f5221e;

    /* renamed from: f */
    public final long f5222f;

    /* renamed from: g */
    public final long f5223g;

    /* renamed from: h */
    public final long f5224h;

    /* renamed from: i */
    public final p025F1.C0209a f5225i;

    /* renamed from: j */
    public final p076T.C0709w f5226j;

    /* renamed from: k */
    public final android.net.Uri f5227k;

    /* renamed from: l */
    public final p122e0.C1308i f5228l;

    /* renamed from: m */
    public final java.util.List f5229m;

    public C1302c(long j4, long j5, long j6, boolean z4, long j7, long j8, long j9, long j10, p122e0.C1308i c1308i, p025F1.C0209a c0209a, p076T.C0709w c0709w, android.net.Uri uri, java.util.ArrayList arrayList) {
        this.f5217a = j4;
        this.f5218b = j5;
        this.f5219c = j6;
        this.f5220d = z4;
        this.f5221e = j7;
        this.f5222f = j8;
        this.f5223g = j9;
        this.f5224h = j10;
        this.f5228l = c1308i;
        this.f5225i = c0209a;
        this.f5227k = uri;
        this.f5226j = c0709w;
        this.f5229m = arrayList;
    }

    @Override // p156l0.InterfaceC1821a
    /* renamed from: a */
    public final java.lang.Object mo3040a(java.util.List list) {
        java.util.ArrayList arrayList;
        long j4;
        java.util.ArrayList arrayList2;
        java.util.LinkedList linkedList = new java.util.LinkedList(list);
        java.util.Collections.sort(linkedList);
        linkedList.add(new p076T.C0673P());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        long j5 = 0;
        int i4 = 0;
        while (i4 < this.f5229m.size()) {
            if (((p076T.C0673P) linkedList.peek()).f2220l != i4) {
                long m3042c = m3042c(i4);
                if (m3042c != -9223372036854775807L) {
                    j5 += m3042c;
                }
                arrayList2 = arrayList3;
            } else {
                p122e0.C1307h m3041b = m3041b(i4);
                java.util.List list2 = m3041b.f5251c;
                p076T.C0673P c0673p = (p076T.C0673P) linkedList.poll();
                int i5 = c0673p.f2220l;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                while (true) {
                    int i6 = c0673p.f2221m;
                    p122e0.C1300a c1300a = (p122e0.C1300a) list2.get(i6);
                    java.util.List list3 = c1300a.f5209c;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    do {
                        arrayList5.add((p122e0.AbstractC1312m) list3.get(c0673p.f2222n));
                        c0673p = (p076T.C0673P) linkedList.poll();
                        if (c0673p.f2220l != i5) {
                            break;
                        }
                    } while (c0673p.f2221m == i6);
                    arrayList = arrayList3;
                    j4 = j5;
                    arrayList4.add(new p122e0.C1300a(c1300a.f5207a, c1300a.f5208b, arrayList5, c1300a.f5210d, c1300a.f5211e, c1300a.f5212f));
                    if (c0673p.f2220l != i5) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j5 = j4;
                }
                linkedList.addFirst(c0673p);
                arrayList2 = arrayList;
                arrayList2.add(new p122e0.C1307h(m3041b.f5249a, m3041b.f5250b - j4, arrayList4, m3041b.f5252d));
                j5 = j4;
            }
            i4++;
            arrayList3 = arrayList2;
        }
        java.util.ArrayList arrayList6 = arrayList3;
        long j6 = j5;
        long j7 = this.f5218b;
        return new p122e0.C1302c(this.f5217a, j7 != -9223372036854775807L ? j7 - j6 : -9223372036854775807L, this.f5219c, this.f5220d, this.f5221e, this.f5222f, this.f5223g, this.f5224h, this.f5228l, this.f5225i, this.f5226j, this.f5227k, arrayList6);
    }

    /* renamed from: b */
    public final p122e0.C1307h m3041b(int i4) {
        return (p122e0.C1307h) this.f5229m.get(i4);
    }

    /* renamed from: c */
    public final long m3042c(int i4) {
        long j4;
        long j5;
        java.util.List list = this.f5229m;
        if (i4 == list.size() - 1) {
            j4 = this.f5218b;
            if (j4 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j5 = ((p122e0.C1307h) list.get(i4)).f5250b;
        } else {
            j4 = ((p122e0.C1307h) list.get(i4 + 1)).f5250b;
            j5 = ((p122e0.C1307h) list.get(i4)).f5250b;
        }
        return j4 - j5;
    }

    /* renamed from: d */
    public final long m3043d(int i4) {
        return p086W.AbstractC0805y.m1592M(m3042c(i4));
    }
}
