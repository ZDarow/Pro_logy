package f2;

import java.util.Objects;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class g0 extends I {

    /* renamed from: n, reason: collision with root package name */
    public final transient Object[] f5567n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f5568o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f5569p;

    public g0(Object[] objArr, int i4, int i5) {
        this.f5567n = objArr;
        this.f5568o = i4;
        this.f5569p = i5;
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0462a.l(i4, this.f5569p);
        Object obj = this.f5567n[(i4 * 2) + this.f5568o];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5569p;
    }
}
