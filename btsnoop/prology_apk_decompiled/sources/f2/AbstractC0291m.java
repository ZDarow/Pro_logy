package f2;

import a.AbstractC0110a;
import java.util.Map;

/* renamed from: f2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0291m implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC0110a.v(getKey(), entry.getKey()) && AbstractC0110a.v(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
