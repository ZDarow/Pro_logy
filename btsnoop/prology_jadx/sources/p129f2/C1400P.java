package p129f2;

/* renamed from: f2.P */
/* loaded from: classes.dex */
public final class C1400P extends p129f2.AbstractC1445r0 {

    /* renamed from: m */
    public static final java.lang.Object f5718m = new java.lang.Object();

    /* renamed from: l */
    public java.lang.Object f5719l;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5719l != f5718m;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj = this.f5719l;
        java.lang.Object obj2 = f5718m;
        if (obj == obj2) {
            throw new java.util.NoSuchElementException();
        }
        this.f5719l = obj2;
        return obj;
    }
}
