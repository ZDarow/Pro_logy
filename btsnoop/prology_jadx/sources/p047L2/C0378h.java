package p047L2;

/* renamed from: L2.h */
/* loaded from: classes.dex */
public final class C0378h implements p047L2.InterfaceC0377g {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicBoolean f1127a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b */
    public final /* synthetic */ android.support.v4.media.session.C1061t f1128b;

    public C0378h(android.support.v4.media.session.C1061t c1061t) {
        this.f1128b = c1061t;
    }

    /* renamed from: a */
    public final void m828a() {
        if (this.f1127a.getAndSet(true)) {
            return;
        }
        android.support.v4.media.session.C1061t c1061t = this.f1128b;
        if (((java.util.concurrent.atomic.AtomicReference) c1061t.f3862n).get() != this) {
            return;
        }
        android.support.v4.media.session.C1061t c1061t2 = (android.support.v4.media.session.C1061t) c1061t.f3863o;
        ((p047L2.InterfaceC0376f) c1061t2.f3861m).mo269c((java.lang.String) c1061t2.f3862n, null);
    }

    /* renamed from: b */
    public final void m829b(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap) {
        if (this.f1127a.get()) {
            return;
        }
        android.support.v4.media.session.C1061t c1061t = this.f1128b;
        if (((java.util.concurrent.atomic.AtomicReference) c1061t.f3862n).get() != this) {
            return;
        }
        android.support.v4.media.session.C1061t c1061t2 = (android.support.v4.media.session.C1061t) c1061t.f3863o;
        ((p047L2.InterfaceC0376f) c1061t2.f3861m).mo269c((java.lang.String) c1061t2.f3862n, ((p047L2.C0392v) c1061t2.f3863o).mo838f(str, str2, hashMap));
    }

    /* renamed from: c */
    public final void m830c(java.lang.Object obj) {
        if (this.f1127a.get()) {
            return;
        }
        android.support.v4.media.session.C1061t c1061t = this.f1128b;
        if (((java.util.concurrent.atomic.AtomicReference) c1061t.f3862n).get() != this) {
            return;
        }
        android.support.v4.media.session.C1061t c1061t2 = (android.support.v4.media.session.C1061t) c1061t.f3863o;
        ((p047L2.InterfaceC0376f) c1061t2.f3861m).mo269c((java.lang.String) c1061t2.f3862n, ((p047L2.C0392v) c1061t2.f3863o).mo834b(obj));
    }
}
