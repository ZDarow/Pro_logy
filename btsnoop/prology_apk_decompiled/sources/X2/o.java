package X2;

import q0.F;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2961n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2962o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2963p;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f2959l = i4;
        this.f2960m = obj;
        this.f2961n = obj2;
        this.f2963p = obj3;
        this.f2962o = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2959l) {
            case 0:
                j jVar = (j) this.f2961n;
                String str = (String) this.f2963p;
                K2.k kVar = (K2.k) this.f2962o;
                r rVar = ((g) this.f2960m).f2933m;
                try {
                    jVar.c(str.getBytes());
                    rVar.f2980x.runOnUiThread(new p(kVar, 1));
                    return;
                } catch (Exception e4) {
                    rVar.f2980x.runOnUiThread(new l(kVar, e4, 2));
                    return;
                }
            case 1:
                j jVar2 = (j) this.f2961n;
                byte[] bArr = (byte[]) this.f2963p;
                K2.k kVar2 = (K2.k) this.f2962o;
                r rVar2 = ((g) this.f2960m).f2933m;
                try {
                    jVar2.c(bArr);
                    rVar2.f2980x.runOnUiThread(new p(kVar2, 0));
                    return;
                } catch (Exception e5) {
                    rVar2.f2980x.runOnUiThread(new l(kVar2, e5, 1));
                    return;
                }
            default:
                int i4 = ((f0.e) this.f2960m).f5454a;
                this.f2961n.x(i4, (F) this.f2963p, (n0.g) this.f2962o);
                return;
        }
    }
}
