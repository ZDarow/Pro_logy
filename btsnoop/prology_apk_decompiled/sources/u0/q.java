package u0;

import W.y;
import Y.B;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import q0.C0491x;

/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: l, reason: collision with root package name */
    public final long f8545l;

    /* renamed from: m, reason: collision with root package name */
    public final Y.l f8546m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8547n;

    /* renamed from: o, reason: collision with root package name */
    public final B f8548o;

    /* renamed from: p, reason: collision with root package name */
    public final p f8549p;

    /* renamed from: q, reason: collision with root package name */
    public volatile Object f8550q;

    public q(Y.h hVar, Uri uri, int i4, p pVar) {
        Map emptyMap = Collections.emptyMap();
        W.a.l(uri, "The uri must be set.");
        Y.l lVar = new Y.l(uri, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f8548o = new B(hVar);
        this.f8546m = lVar;
        this.f8547n = i4;
        this.f8549p = pVar;
        this.f8545l = C0491x.f7929b.getAndIncrement();
    }

    @Override // u0.k
    public final void b() {
        this.f8548o.f2989m = 0L;
        Y.j jVar = new Y.j(this.f8548o, this.f8546m);
        try {
            jVar.a();
            Uri o2 = this.f8548o.f2988l.o();
            o2.getClass();
            this.f8550q = this.f8549p.p(o2, jVar);
        } finally {
            y.h(jVar);
        }
    }

    @Override // u0.k
    public final void c() {
    }
}
