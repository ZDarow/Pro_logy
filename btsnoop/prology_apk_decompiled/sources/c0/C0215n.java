package c0;

import T.d0;
import a0.C0126f;
import a0.SurfaceHolderCallbackC0115E;
import android.os.Handler;

/* renamed from: c0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215n {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4631a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceHolderCallbackC0115E f4632b;

    public /* synthetic */ C0215n(Handler handler, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E) {
        this.f4631a = handler;
        this.f4632b = surfaceHolderCallbackC0115E;
    }

    public void a(C0126f c0126f) {
        synchronized (c0126f) {
        }
        Handler handler = this.f4631a;
        if (handler != null) {
            handler.post(new W.m(4, this, c0126f));
        }
    }

    public void b(d0 d0Var) {
        Handler handler = this.f4631a;
        if (handler != null) {
            handler.post(new W.m(15, this, d0Var));
        }
    }
}
