package androidx.lifecycle;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public f f4160a;

    /* renamed from: b, reason: collision with root package name */
    public j f4161b;

    public final void a(k kVar, e eVar) {
        f a4 = eVar.a();
        f fVar = this.f4160a;
        k3.h.e(fVar, "state1");
        if (a4.compareTo(fVar) < 0) {
            fVar = a4;
        }
        this.f4160a = fVar;
        this.f4161b.a(kVar, eVar);
        this.f4160a = a4;
    }
}
