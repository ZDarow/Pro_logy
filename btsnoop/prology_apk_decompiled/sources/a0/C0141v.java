package a0;

/* renamed from: a0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0141v implements W.h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f3586m;

    public /* synthetic */ C0141v(int i4, boolean z4) {
        this.f3585l = i4;
        this.f3586m = z4;
    }

    @Override // W.h
    public final void b(Object obj) {
        T.M m4 = (T.M) obj;
        switch (this.f3585l) {
            case 0:
                m4.u(this.f3586m);
                return;
            case 1:
                m4.o(this.f3586m);
                return;
            default:
                m4.u(this.f3586m);
                return;
        }
    }
}
