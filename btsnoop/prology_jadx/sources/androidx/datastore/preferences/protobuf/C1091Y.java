package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.Y */
/* loaded from: classes.dex */
public final class C1091Y implements java.util.Map.Entry, java.lang.Comparable {

    /* renamed from: l */
    public final java.lang.Comparable f4201l;

    /* renamed from: m */
    public java.lang.Object f4202m;

    /* renamed from: n */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.C1090X f4203n;

    public C1091Y(androidx.datastore.preferences.protobuf.C1090X c1090x, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f4203n = c1090x;
        this.f4201l = comparable;
        this.f4202m = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f4201l.compareTo(((androidx.datastore.preferences.protobuf.C1091Y) obj).f4201l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Comparable comparable = this.f4201l;
        if (comparable == null ? key == null : comparable.equals(key)) {
            java.lang.Object obj2 = this.f4202m;
            java.lang.Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f4201l;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f4202m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f4201l;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f4202m;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.f4203n.m2477b();
        java.lang.Object obj2 = this.f4202m;
        this.f4202m = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return this.f4201l + "=" + this.f4202m;
    }
}
