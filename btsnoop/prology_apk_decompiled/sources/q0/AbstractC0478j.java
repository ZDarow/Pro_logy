package q0;

import I.C0044m;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: q0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0478j extends AbstractC0469a {
    public final HashMap s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public Handler f7869t;

    /* renamed from: u, reason: collision with root package name */
    public Y.C f7870u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f0.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.G, q0.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, q0.I] */
    public final void A(final Object obj, AbstractC0469a abstractC0469a) {
        HashMap hashMap = this.s;
        W.a.e(!hashMap.containsKey(obj));
        ?? r12 = new G() { // from class: q0.h
            @Override // q0.G
            public final void a(AbstractC0469a abstractC0469a2, T.U u4) {
                AbstractC0478j.this.z(obj, abstractC0469a2, u4);
            }
        };
        ?? obj2 = new Object();
        obj2.f850o = this;
        obj2.f848m = a(null);
        obj2.f849n = new f0.e(this.f7811o.f5456c, 0, null);
        obj2.f847l = obj;
        hashMap.put(obj, new C0477i(abstractC0469a, r12, obj2));
        Handler handler = this.f7869t;
        handler.getClass();
        abstractC0469a.getClass();
        f0.e eVar = abstractC0469a.f7810n;
        eVar.getClass();
        ?? obj3 = new Object();
        obj3.f7678a = handler;
        obj3.f7679b = obj2;
        eVar.f5456c.add(obj3);
        this.f7869t.getClass();
        f0.e eVar2 = abstractC0469a.f7811o;
        eVar2.getClass();
        ?? obj4 = new Object();
        obj4.f5453a = obj2;
        eVar2.f5456c.add(obj4);
        Y.C c4 = this.f7870u;
        b0.l lVar = this.f7814r;
        W.a.k(lVar);
        abstractC0469a.l(r12, c4, lVar);
        if (this.f7809m.isEmpty()) {
            abstractC0469a.c(r12);
        }
    }

    @Override // q0.AbstractC0469a
    public void d() {
        for (C0477i c0477i : this.s.values()) {
            c0477i.f7864a.c(c0477i.f7865b);
        }
    }

    @Override // q0.AbstractC0469a
    public void f() {
        for (C0477i c0477i : this.s.values()) {
            c0477i.f7864a.e(c0477i.f7865b);
        }
    }

    @Override // q0.AbstractC0469a
    public void j() {
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            ((C0477i) it.next()).f7864a.j();
        }
    }

    @Override // q0.AbstractC0469a
    public void r() {
        HashMap hashMap = this.s;
        for (C0477i c0477i : hashMap.values()) {
            c0477i.f7864a.p(c0477i.f7865b);
            C0044m c0044m = c0477i.f7866c;
            AbstractC0469a abstractC0469a = c0477i.f7864a;
            abstractC0469a.t(c0044m);
            abstractC0469a.s(c0044m);
        }
        hashMap.clear();
    }

    public abstract F v(Object obj, F f4);

    public long w(long j4, Object obj) {
        return j4;
    }

    public int y(int i4, Object obj) {
        return i4;
    }

    public abstract void z(Object obj, AbstractC0469a abstractC0469a, T.U u4);
}
