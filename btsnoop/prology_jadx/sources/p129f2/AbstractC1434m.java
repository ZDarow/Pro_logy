package p129f2;

/* renamed from: f2.m */
/* loaded from: classes.dex */
public abstract class AbstractC1434m implements java.util.Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return p101a.AbstractC0936a.m1814v(getKey(), entry.getKey()) && p101a.AbstractC0936a.m1814v(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
