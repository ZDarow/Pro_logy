package p152k1;

/* renamed from: k1.b */
/* loaded from: classes.dex */
public final class C1763b extends p152k1.AbstractC1778q {

    /* renamed from: e */
    public java.util.ArrayList f7228e;

    /* renamed from: f */
    public java.util.ArrayList f7229f;

    /* renamed from: g */
    public java.util.ArrayList f7230g;

    /* renamed from: h */
    public java.util.ArrayList f7231h;

    /* renamed from: i */
    public java.util.ArrayList f7232i;

    /* renamed from: j */
    public java.util.ArrayList f7233j;

    /* renamed from: k */
    public java.util.ArrayList f7234k;

    /* renamed from: l */
    public java.util.ArrayList f7235l;

    /* renamed from: m */
    public java.util.ArrayList f7236m;

    /* renamed from: n */
    public java.util.ArrayList f7237n;

    /* renamed from: o */
    public java.util.ArrayList f7238o;

    /* renamed from: c */
    public static void m3720c(java.util.ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new java.lang.ClassCastException();
    }

    @Override // p152k1.AbstractC1778q
    /* renamed from: a */
    public final void mo3721a() {
        java.util.ArrayList arrayList = this.f7230g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            p009B2.AbstractC0051h.m159r(arrayList.get(size));
            throw null;
        }
        java.util.ArrayList arrayList2 = this.f7228e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new java.lang.ClassCastException();
            }
            if (this.f7287a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f7229f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new java.lang.ClassCastException();
        }
        java.util.ArrayList arrayList4 = this.f7231h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            p009B2.AbstractC0051h.m159r(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (mo3722b()) {
            java.util.ArrayList arrayList5 = this.f7233j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                java.util.ArrayList arrayList6 = (java.util.ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    p009B2.AbstractC0051h.m159r(arrayList6.get(size6));
                    throw null;
                }
            }
            java.util.ArrayList arrayList7 = this.f7232i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                java.util.ArrayList arrayList8 = (java.util.ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new java.lang.ClassCastException();
                }
            }
            java.util.ArrayList arrayList9 = this.f7234k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                java.util.ArrayList arrayList10 = (java.util.ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    p009B2.AbstractC0051h.m159r(arrayList10.get(size10));
                    throw null;
                }
            }
            m3720c(this.f7237n);
            m3720c(this.f7236m);
            m3720c(this.f7235l);
            m3720c(this.f7238o);
            java.util.ArrayList arrayList11 = this.f7288b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new java.lang.ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p152k1.AbstractC1778q
    /* renamed from: b */
    public final boolean mo3722b() {
        return (this.f7229f.isEmpty() && this.f7231h.isEmpty() && this.f7230g.isEmpty() && this.f7228e.isEmpty() && this.f7236m.isEmpty() && this.f7237n.isEmpty() && this.f7235l.isEmpty() && this.f7238o.isEmpty() && this.f7233j.isEmpty() && this.f7232i.isEmpty() && this.f7234k.isEmpty()) ? false : true;
    }
}
