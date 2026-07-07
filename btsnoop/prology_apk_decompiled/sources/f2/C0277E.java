package f2;

import java.io.Serializable;

/* renamed from: f2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277E extends AbstractC0291m implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final Object f5502l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5503m;

    public C0277E(Object obj, Object obj2) {
        this.f5502l = obj;
        this.f5503m = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5502l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5503m;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
