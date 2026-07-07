package t2;

import I.C0044m;
import L2.f;
import android.content.Context;
import android.support.v4.media.session.t;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0572c implements H2.b {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f8424l;

    /* renamed from: m, reason: collision with root package name */
    public t f8425m;

    @Override // H2.b
    public final void b(H2.a aVar) {
        this.f8425m.a0();
        this.f8425m = null;
        this.f8424l.s(null);
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        Context context = (Context) aVar.f708l;
        f fVar = (f) aVar.f709m;
        this.f8425m = new t(context, fVar);
        C0044m c0044m = new C0044m(fVar, "com.ryanheise.just_audio.methods");
        this.f8424l = c0044m;
        c0044m.s(this.f8425m);
        ((C2.c) aVar.f711o).f365v.add(new C2.a(1, this));
    }
}
