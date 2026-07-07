package a0;

import b0.C0177a;

/* renamed from: a0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0144y implements W.h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3590l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3591m;

    public /* synthetic */ C0144y(int i4) {
        this.f3591m = i4;
    }

    @Override // W.h
    public final void b(Object obj) {
        switch (this.f3590l) {
            case 0:
                ((T.M) obj).b(this.f3591m);
                return;
            default:
                b0.j jVar = (b0.j) obj;
                jVar.getClass();
                int i4 = this.f3591m;
                if (i4 == 1) {
                    jVar.f4385u = true;
                }
                jVar.f4376k = i4;
                return;
        }
    }

    public /* synthetic */ C0144y(C0177a c0177a, int i4, T.N n4, T.N n5) {
        this.f3591m = i4;
    }
}
