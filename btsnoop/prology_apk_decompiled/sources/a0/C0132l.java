package a0;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import k0.C0377b;
import s0.C0542d;
import x0.C0611a;

/* renamed from: a0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3537a;

    /* renamed from: b, reason: collision with root package name */
    public final U1.b f3538b;

    public C0132l(Context context) {
        this.f3537a = context;
        this.f3538b = new U1.b(context);
    }

    public final AbstractC0125e[] a(Handler handler, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E2, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E3, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E4) {
        ArrayList arrayList = new ArrayList();
        U1.b bVar = this.f3538b;
        Context context = this.f3537a;
        arrayList.add(new w0.m(context, bVar, handler, surfaceHolderCallbackC0115E));
        N1.r rVar = new N1.r(context);
        W.a.j(!rVar.f1307a);
        rVar.f1307a = true;
        if (((android.support.v4.media.session.t) rVar.f1310d) == null) {
            rVar.f1310d = new android.support.v4.media.session.t(new U.d[0]);
        }
        if (((Y.x) rVar.f1312f) == null) {
            rVar.f1312f = new Y.x(8, context);
        }
        arrayList.add(new c0.M(this.f3537a, bVar, handler, surfaceHolderCallbackC0115E2, new c0.J(rVar)));
        arrayList.add(new C0542d(surfaceHolderCallbackC0115E3, handler.getLooper()));
        arrayList.add(new C0377b(surfaceHolderCallbackC0115E4, handler.getLooper()));
        arrayList.add(new C0611a());
        arrayList.add(new i0.h(i0.c.f6142e));
        return (AbstractC0125e[]) arrayList.toArray(new AbstractC0125e[0]);
    }
}
