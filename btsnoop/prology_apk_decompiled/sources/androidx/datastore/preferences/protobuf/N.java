package androidx.datastore.preferences.protobuf;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public final class N implements V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0169v f4029a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f4030b;

    /* renamed from: c, reason: collision with root package name */
    public final C0163o f4031c;

    public N(d0 d0Var, C0163o c0163o, AbstractC0169v abstractC0169v) {
        this.f4030b = d0Var;
        c0163o.getClass();
        this.f4031c = c0163o;
        this.f4029a = abstractC0169v;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean a(Object obj) {
        this.f4031c.getClass();
        AbstractC0007h.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, Object obj2) {
        W.A(this.f4030b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void c(Object obj, W.l lVar, C0162n c0162n) {
        this.f4030b.getClass();
        d0.a(obj);
        this.f4031c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj, E e4) {
        this.f4031c.getClass();
        AbstractC0007h.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int e(AbstractC0169v abstractC0169v) {
        this.f4030b.getClass();
        return abstractC0169v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int f(AbstractC0169v abstractC0169v) {
        this.f4030b.getClass();
        c0 c0Var = abstractC0169v.unknownFields;
        int i4 = c0Var.f4069d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < c0Var.f4066a; i6++) {
            int i7 = c0Var.f4067b[i6] >>> 3;
            i5 += C0160l.W(3, (C0155g) c0Var.f4068c[i6]) + C0160l.m0(2, i7) + (C0160l.l0(1) * 2);
        }
        c0Var.f4069d = i5;
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0169v g() {
        AbstractC0169v abstractC0169v = this.f4029a;
        return abstractC0169v != null ? abstractC0169v.k() : ((AbstractC0167t) abstractC0169v.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void h(Object obj) {
        this.f4030b.getClass();
        d0.b(obj);
        this.f4031c.getClass();
        AbstractC0007h.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean i(AbstractC0169v abstractC0169v, Object obj) {
        this.f4030b.getClass();
        return abstractC0169v.unknownFields.equals(((AbstractC0169v) obj).unknownFields);
    }
}
