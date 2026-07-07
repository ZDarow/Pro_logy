package N1;

import android.os.Looper;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final l f1281a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1282b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f1283c;

    public h(Looper looper, Object obj, String str) {
        this.f1281a = new l(looper);
        O1.s.e(obj, "Listener must not be null");
        this.f1282b = obj;
        O1.s.c(str);
        this.f1283c = new g(obj, str);
    }

    public final void a(K2.o oVar) {
        this.f1281a.execute(new q(this, oVar, 1, false));
    }
}
