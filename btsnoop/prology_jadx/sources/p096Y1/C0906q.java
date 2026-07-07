package p096Y1;

/* renamed from: Y1.q */
/* loaded from: classes.dex */
public final class C0906q extends p096Y1.AbstractC0907r {

    /* renamed from: n */
    public final transient int f3229n;

    /* renamed from: o */
    public final transient int f3230o;

    /* renamed from: p */
    public final /* synthetic */ p096Y1.AbstractC0907r f3231p;

    public C0906q(p096Y1.AbstractC0907r abstractC0907r, int i4, int i5) {
        this.f3231p = abstractC0907r;
        this.f3229n = i4;
        this.f3230o = i5;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: a */
    public final java.lang.Object[] mo1742a() {
        return this.f3231p.mo1742a();
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: b */
    public final int mo1743b() {
        return this.f3231p.mo1743b() + this.f3229n;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: c */
    public final int mo1744c() {
        return this.f3231p.mo1743b() + this.f3229n + this.f3230o;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: d */
    public final boolean mo1745d() {
        return true;
    }

    @Override // p096Y1.AbstractC0907r, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final p096Y1.AbstractC0907r subList(int i4, int i5) {
        p176p1.AbstractC1949a.m3927b0(i4, i5, this.f3230o);
        int i6 = this.f3229n;
        return this.f3231p.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        p176p1.AbstractC1949a.m3923Z(i4, this.f3230o);
        return this.f3231p.get(i4 + this.f3229n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3230o;
    }
}
