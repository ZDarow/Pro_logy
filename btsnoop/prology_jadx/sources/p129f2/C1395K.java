package p129f2;

/* renamed from: f2.K */
/* loaded from: classes.dex */
public final class C1395K {

    /* renamed from: a */
    public final java.lang.Object f5706a;

    /* renamed from: b */
    public final java.lang.Object f5707b;

    /* renamed from: c */
    public final java.lang.Object f5708c;

    public C1395K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f5706a = obj;
        this.f5707b = obj2;
        this.f5708c = obj3;
    }

    /* renamed from: a */
    public final java.lang.IllegalArgumentException m3174a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiple entries with same key: ");
        java.lang.Object obj = this.f5706a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f5707b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f5708c);
        return new java.lang.IllegalArgumentException(sb.toString());
    }
}
