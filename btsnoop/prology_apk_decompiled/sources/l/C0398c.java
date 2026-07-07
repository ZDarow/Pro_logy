package l;

import java.util.Map;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398c implements Map.Entry {

    /* renamed from: l, reason: collision with root package name */
    public final Object f7110l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7111m;

    /* renamed from: n, reason: collision with root package name */
    public C0398c f7112n;

    /* renamed from: o, reason: collision with root package name */
    public C0398c f7113o;

    public C0398c(Object obj, Object obj2) {
        this.f7110l = obj;
        this.f7111m = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0398c)) {
            return false;
        }
        C0398c c0398c = (C0398c) obj;
        return this.f7110l.equals(c0398c.f7110l) && this.f7111m.equals(c0398c.f7111m);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7110l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7111m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7110l.hashCode() ^ this.f7111m.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7110l + "=" + this.f7111m;
    }
}
