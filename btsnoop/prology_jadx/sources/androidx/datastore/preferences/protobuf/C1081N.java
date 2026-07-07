package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.N */
/* loaded from: classes.dex */
public final class C1081N implements androidx.datastore.preferences.protobuf.InterfaceC1088V {

    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v f4177a;

    /* renamed from: b */
    public final androidx.datastore.preferences.protobuf.C1100d0 f4178b;

    /* renamed from: c */
    public final androidx.datastore.preferences.protobuf.C1121o f4179c;

    public C1081N(androidx.datastore.preferences.protobuf.C1100d0 c1100d0, androidx.datastore.preferences.protobuf.C1121o c1121o, androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v) {
        this.f4178b = c1100d0;
        c1121o.getClass();
        this.f4179c = c1121o;
        this.f4177a = abstractC1132v;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: a */
    public final boolean mo2400a(java.lang.Object obj) {
        this.f4179c.getClass();
        p009B2.AbstractC0051h.m159r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: b */
    public final void mo2401b(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.AbstractC1089W.m2429A(this.f4178b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: c */
    public final void mo2402c(java.lang.Object obj, p086W.C0792l c0792l, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        this.f4178b.getClass();
        androidx.datastore.preferences.protobuf.C1100d0.m2492a(obj);
        this.f4179c.getClass();
        obj.getClass();
        throw new java.lang.ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: d */
    public final void mo2403d(java.lang.Object obj, androidx.datastore.preferences.protobuf.C1072E c1072e) {
        this.f4179c.getClass();
        p009B2.AbstractC0051h.m159r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: e */
    public final int mo2404e(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v) {
        this.f4178b.getClass();
        return abstractC1132v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: f */
    public final int mo2405f(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v) {
        this.f4178b.getClass();
        androidx.datastore.preferences.protobuf.C1098c0 c1098c0 = abstractC1132v.unknownFields;
        int i4 = c1098c0.f4217d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < c1098c0.f4214a; i6++) {
            int i7 = c1098c0.f4215b[i6] >>> 3;
            i5 += androidx.datastore.preferences.protobuf.C1115l.m2580W(3, (androidx.datastore.preferences.protobuf.C1105g) c1098c0.f4216c[i6]) + androidx.datastore.preferences.protobuf.C1115l.m2596m0(2, i7) + (androidx.datastore.preferences.protobuf.C1115l.m2595l0(1) * 2);
        }
        c1098c0.f4217d = i5;
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: g */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g() {
        androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = this.f4177a;
        return abstractC1132v != null ? abstractC1132v.m2641k() : ((androidx.datastore.preferences.protobuf.AbstractC1130t) abstractC1132v.mo774e(5)).m2631b();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: h */
    public final void mo2407h(java.lang.Object obj) {
        this.f4178b.getClass();
        androidx.datastore.preferences.protobuf.C1100d0.m2493b(obj);
        this.f4179c.getClass();
        p009B2.AbstractC0051h.m159r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: i */
    public final boolean mo2408i(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v, java.lang.Object obj) {
        this.f4178b.getClass();
        return abstractC1132v.unknownFields.equals(((androidx.datastore.preferences.protobuf.AbstractC1132v) obj).unknownFields);
    }
}
