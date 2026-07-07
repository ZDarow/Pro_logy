package f2;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5512a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5513b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5514c;

    public K(Object obj, Object obj2, Object obj3) {
        this.f5512a = obj;
        this.f5513b = obj2;
        this.f5514c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f5512a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f5513b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f5514c);
        return new IllegalArgumentException(sb.toString());
    }
}
