package p129f2;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public final class C1410a implements java.util.Iterator {

    /* renamed from: l */
    public final java.util.Iterator f5733l;

    /* renamed from: m */
    public java.lang.Object f5734m = null;

    /* renamed from: n */
    public java.util.Collection f5735n = null;

    /* renamed from: o */
    public java.util.Iterator f5736o = p129f2.EnumC1399O.f5716l;

    /* renamed from: p */
    public final /* synthetic */ p129f2.C1409Z f5737p;

    public C1410a(p129f2.C1409Z c1409z) {
        this.f5737p = c1409z;
        this.f5733l = c1409z.f5730o.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5733l.hasNext() || this.f5736o.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f5736o.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f5733l.next();
            this.f5734m = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.f5735n = collection;
            this.f5736o = collection.iterator();
        }
        return this.f5736o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5736o.remove();
        java.util.Collection collection = this.f5735n;
        java.util.Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f5733l.remove();
        }
        p129f2.C1409Z c1409z = this.f5737p;
        c1409z.f5731p--;
    }
}
