package p129f2;

/* renamed from: f2.t */
/* loaded from: classes.dex */
public final class C1447t extends java.util.AbstractSet {

    /* renamed from: l */
    public final /* synthetic */ int f5809l;

    /* renamed from: m */
    public final /* synthetic */ p129f2.C1449v f5810m;

    public /* synthetic */ C1447t(p129f2.C1449v c1449v, int i4) {
        this.f5809l = i4;
        this.f5810m = c1449v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5809l) {
            case 0:
                this.f5810m.clear();
                return;
            default:
                this.f5810m.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        switch (this.f5809l) {
            case 0:
                p129f2.C1449v c1449v = this.f5810m;
                java.util.Map m3248c = c1449v.m3248c();
                if (m3248c != null) {
                    return m3248c.entrySet().contains(obj);
                }
                if (obj instanceof java.util.Map.Entry) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    int m3250e = c1449v.m3250e(entry.getKey());
                    if (m3250e != -1 && p101a.AbstractC0936a.m1814v(c1449v.m3256k()[m3250e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f5810m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.f5809l) {
            case 0:
                p129f2.C1449v c1449v = this.f5810m;
                java.util.Map m3248c = c1449v.m3248c();
                return m3248c != null ? m3248c.entrySet().iterator() : new p129f2.C1446s(c1449v, 1);
            default:
                p129f2.C1449v c1449v2 = this.f5810m;
                java.util.Map m3248c2 = c1449v2.m3248c();
                return m3248c2 != null ? m3248c2.keySet().iterator() : new p129f2.C1446s(c1449v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        switch (this.f5809l) {
            case 0:
                p129f2.C1449v c1449v = this.f5810m;
                java.util.Map m3248c = c1449v.m3248c();
                if (m3248c != null) {
                    return m3248c.entrySet().remove(obj);
                }
                if (obj instanceof java.util.Map.Entry) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    if (!c1449v.m3252g()) {
                        int m3249d = c1449v.m3249d();
                        java.lang.Object key = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        java.lang.Object obj2 = c1449v.f5815l;
                        java.util.Objects.requireNonNull(obj2);
                        int m3237q = p129f2.AbstractC1444r.m3237q(key, value, m3249d, obj2, c1449v.m3254i(), c1449v.m3255j(), c1449v.m3256k());
                        if (m3237q != -1) {
                            c1449v.m3251f(m3237q, m3249d);
                            c1449v.f5820q--;
                            c1449v.f5819p += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                p129f2.C1449v c1449v2 = this.f5810m;
                java.util.Map m3248c2 = c1449v2.m3248c();
                return m3248c2 != null ? m3248c2.keySet().remove(obj) : c1449v2.m3253h(obj) != p129f2.C1449v.f5814u;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5809l) {
            case 0:
                return this.f5810m.size();
            default:
                return this.f5810m.size();
        }
    }
}
