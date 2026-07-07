package p129f2;

/* renamed from: f2.c0 */
/* loaded from: classes.dex */
public final class C1415c0 extends p129f2.AbstractC1393I {

    /* renamed from: p */
    public static final p129f2.C1415c0 f5744p = new p129f2.C1415c0(0, new java.lang.Object[0]);

    /* renamed from: n */
    public final transient java.lang.Object[] f5745n;

    /* renamed from: o */
    public final transient int f5746o;

    public C1415c0(int i4, java.lang.Object[] objArr) {
        this.f5745n = objArr;
        this.f5746o = i4;
    }

    @Override // p129f2.AbstractC1393I, p129f2.AbstractC1388D
    /* renamed from: b */
    public final int mo3151b(int i4, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.f5745n;
        int i5 = this.f5746o;
        java.lang.System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: c */
    public final java.lang.Object[] mo3152c() {
        return this.f5745n;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: d */
    public final int mo3153d() {
        return this.f5746o;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: e */
    public final int mo3154e() {
        return 0;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        p176p1.AbstractC1949a.m3935l(i4, this.f5746o);
        java.lang.Object obj = this.f5745n[i4];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5746o;
    }
}
