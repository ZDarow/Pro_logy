package L2;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1088a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.t f1089b;

    public h(android.support.v4.media.session.t tVar) {
        this.f1089b = tVar;
    }

    public final void a() {
        if (this.f1088a.getAndSet(true)) {
            return;
        }
        android.support.v4.media.session.t tVar = this.f1089b;
        if (((AtomicReference) tVar.f3735n).get() != this) {
            return;
        }
        android.support.v4.media.session.t tVar2 = (android.support.v4.media.session.t) tVar.f3736o;
        ((f) tVar2.f3734m).c((String) tVar2.f3735n, null);
    }

    public final void b(String str, String str2, HashMap hashMap) {
        if (this.f1088a.get()) {
            return;
        }
        android.support.v4.media.session.t tVar = this.f1089b;
        if (((AtomicReference) tVar.f3735n).get() != this) {
            return;
        }
        android.support.v4.media.session.t tVar2 = (android.support.v4.media.session.t) tVar.f3736o;
        ((f) tVar2.f3734m).c((String) tVar2.f3735n, ((v) tVar2.f3736o).f(str, str2, hashMap));
    }

    public final void c(Object obj) {
        if (this.f1088a.get()) {
            return;
        }
        android.support.v4.media.session.t tVar = this.f1089b;
        if (((AtomicReference) tVar.f3735n).get() != this) {
            return;
        }
        android.support.v4.media.session.t tVar2 = (android.support.v4.media.session.t) tVar.f3736o;
        ((f) tVar2.f3734m).c((String) tVar2.f3735n, ((v) tVar2.f3736o).b(obj));
    }
}
