package G0;

import y0.C0617A;
import y0.t;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public final class d extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, z zVar, z zVar2) {
        super(zVar);
        this.f677c = cVar;
        this.f676b = zVar2;
    }

    @Override // y0.t, y0.z
    public final y f(long j4) {
        y f4 = this.f676b.f(j4);
        C0617A c0617a = f4.f9141a;
        long j5 = c0617a.f8991a;
        long j6 = this.f677c.f674m;
        C0617A c0617a2 = new C0617A(j5, c0617a.f8992b + j6);
        C0617A c0617a3 = f4.f9142b;
        return new y(c0617a2, new C0617A(c0617a3.f8991a, c0617a3.f8992b + j6));
    }
}
