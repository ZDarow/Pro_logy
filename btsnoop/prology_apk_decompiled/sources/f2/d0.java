package f2;

import java.util.AbstractMap;
import java.util.Objects;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class d0 extends I {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f5557n;

    public d0(e0 e0Var) {
        this.f5557n = e0Var;
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        e0 e0Var = this.f5557n;
        AbstractC0462a.l(i4, e0Var.f5562q);
        int i5 = i4 * 2;
        Object[] objArr = e0Var.f5561p;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5557n.f5562q;
    }
}
