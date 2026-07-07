package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Y implements Map.Entry, Comparable {

    /* renamed from: l, reason: collision with root package name */
    public final Comparable f4053l;

    /* renamed from: m, reason: collision with root package name */
    public Object f4054m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X f4055n;

    public Y(X x3, Comparable comparable, Object obj) {
        this.f4055n = x3;
        this.f4053l = comparable;
        this.f4054m = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4053l.compareTo(((Y) obj).f4053l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4053l;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4054m;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4053l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4054m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4053l;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4054m;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4055n.b();
        Object obj2 = this.f4054m;
        this.f4054m = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4053l + "=" + this.f4054m;
    }
}
