package f2;

import java.util.Objects;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class c0 extends I {

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f5550p = new c0(0, new Object[0]);

    /* renamed from: n, reason: collision with root package name */
    public final transient Object[] f5551n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f5552o;

    public c0(int i4, Object[] objArr) {
        this.f5551n = objArr;
        this.f5552o = i4;
    }

    @Override // f2.I, f2.AbstractC0276D
    public final int b(int i4, Object[] objArr) {
        Object[] objArr2 = this.f5551n;
        int i5 = this.f5552o;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // f2.AbstractC0276D
    public final Object[] c() {
        return this.f5551n;
    }

    @Override // f2.AbstractC0276D
    public final int d() {
        return this.f5552o;
    }

    @Override // f2.AbstractC0276D
    public final int e() {
        return 0;
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0462a.l(i4, this.f5552o);
        Object obj = this.f5551n[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5552o;
    }
}
