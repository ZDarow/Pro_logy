package Y1;

import java.util.Objects;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class s extends r {

    /* renamed from: p, reason: collision with root package name */
    public static final s f3122p = new s(0, new Object[0]);

    /* renamed from: n, reason: collision with root package name */
    public final transient Object[] f3123n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f3124o;

    public s(int i4, Object[] objArr) {
        this.f3123n = objArr;
        this.f3124o = i4;
    }

    @Override // Y1.o
    public final Object[] a() {
        return this.f3123n;
    }

    @Override // Y1.o
    public final int b() {
        return 0;
    }

    @Override // Y1.o
    public final int c() {
        return this.f3124o;
    }

    @Override // Y1.o
    public final boolean d() {
        return false;
    }

    @Override // Y1.r, Y1.o
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f3123n;
        int i4 = this.f3124o;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0462a.Z(i4, this.f3124o);
        Object obj = this.f3123n[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3124o;
    }
}
