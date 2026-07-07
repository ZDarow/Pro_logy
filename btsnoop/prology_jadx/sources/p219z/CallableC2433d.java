package p219z;

/* renamed from: z.d */
/* loaded from: classes.dex */
public final class CallableC2433d implements java.util.concurrent.Callable {

    /* renamed from: a */
    public final /* synthetic */ int f9560a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.String f9561b;

    /* renamed from: c */
    public final /* synthetic */ android.content.Context f9562c;

    /* renamed from: d */
    public final /* synthetic */ int f9563d;

    /* renamed from: e */
    public final /* synthetic */ java.lang.Object f9564e;

    public /* synthetic */ CallableC2433d(java.lang.String str, android.content.Context context, java.lang.Object obj, int i4, int i5) {
        this.f9560a = i5;
        this.f9561b = str;
        this.f9562c = context;
        this.f9564e = obj;
        this.f9563d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f9560a) {
            case 0:
                java.lang.Object[] objArr = {(p219z.C2432c) this.f9564e};
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                java.lang.Object obj = objArr[0];
                java.util.Objects.requireNonNull(obj);
                arrayList.add(obj);
                return p219z.AbstractC2436g.m4677b(this.f9561b, this.f9562c, java.util.Collections.unmodifiableList(arrayList), this.f9563d);
            default:
                try {
                    return p219z.AbstractC2436g.m4677b(this.f9561b, this.f9562c, (java.util.List) this.f9564e, this.f9563d);
                } catch (java.lang.Throwable unused) {
                    return new p219z.C2435f(-3);
                }
        }
    }
}
