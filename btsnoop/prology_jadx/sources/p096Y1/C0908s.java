package p096Y1;

/* renamed from: Y1.s */
/* loaded from: classes.dex */
public final class C0908s extends p096Y1.AbstractC0907r {

    /* renamed from: p */
    public static final p096Y1.C0908s f3233p = new p096Y1.C0908s(0, new java.lang.Object[0]);

    /* renamed from: n */
    public final transient java.lang.Object[] f3234n;

    /* renamed from: o */
    public final transient int f3235o;

    public C0908s(int i4, java.lang.Object[] objArr) {
        this.f3234n = objArr;
        this.f3235o = i4;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: a */
    public final java.lang.Object[] mo1742a() {
        return this.f3234n;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: b */
    public final int mo1743b() {
        return 0;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: c */
    public final int mo1744c() {
        return this.f3235o;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: d */
    public final boolean mo1745d() {
        return false;
    }

    @Override // p096Y1.AbstractC0907r, p096Y1.AbstractC0904o
    /* renamed from: e */
    public final int mo1746e(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.f3234n;
        int i4 = this.f3235o;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        p176p1.AbstractC1949a.m3923Z(i4, this.f3235o);
        java.lang.Object obj = this.f3234n[i4];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3235o;
    }
}
