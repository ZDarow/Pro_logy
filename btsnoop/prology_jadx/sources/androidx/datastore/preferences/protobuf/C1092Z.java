package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.Z */
/* loaded from: classes.dex */
public final class C1092Z implements java.util.Iterator {

    /* renamed from: l */
    public int f4204l = -1;

    /* renamed from: m */
    public boolean f4205m;

    /* renamed from: n */
    public java.util.Iterator f4206n;

    /* renamed from: o */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.C1090X f4207o;

    public C1092Z(androidx.datastore.preferences.protobuf.C1090X c1090x) {
        this.f4207o = c1090x;
    }

    /* renamed from: a */
    public final java.util.Iterator m2483a() {
        if (this.f4206n == null) {
            this.f4206n = this.f4207o.f4197m.entrySet().iterator();
        }
        return this.f4206n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f4204l + 1;
        androidx.datastore.preferences.protobuf.C1090X c1090x = this.f4207o;
        if (i4 >= c1090x.f4196l.size()) {
            return !c1090x.f4197m.isEmpty() && m2483a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        this.f4205m = true;
        int i4 = this.f4204l + 1;
        this.f4204l = i4;
        androidx.datastore.preferences.protobuf.C1090X c1090x = this.f4207o;
        return i4 < c1090x.f4196l.size() ? (java.util.Map.Entry) c1090x.f4196l.get(this.f4204l) : (java.util.Map.Entry) m2483a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4205m) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f4205m = false;
        int i4 = androidx.datastore.preferences.protobuf.C1090X.f4195q;
        androidx.datastore.preferences.protobuf.C1090X c1090x = this.f4207o;
        c1090x.m2477b();
        if (this.f4204l >= c1090x.f4196l.size()) {
            m2483a().remove();
            return;
        }
        int i5 = this.f4204l;
        this.f4204l = i5 - 1;
        c1090x.m2482h(i5);
    }
}
