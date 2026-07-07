package B3;

import a.AbstractC0110a;
import java.io.IOException;
import java.util.LinkedHashMap;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class u extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final l f272e;

    /* renamed from: b, reason: collision with root package name */
    public final l f273b;

    /* renamed from: c, reason: collision with root package name */
    public final i f274c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f275d;

    static {
        String str = l.f250m;
        f272e = F1.g.u("/", false);
    }

    public u(l lVar, i iVar, LinkedHashMap linkedHashMap) {
        k3.h.e(iVar, "fileSystem");
        this.f273b = lVar;
        this.f274c = iVar;
        this.f275d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k3.p] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k3.p] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k3.p] */
    @Override // B3.f
    public final e b(l lVar) {
        p pVar;
        k3.h.e(lVar, "path");
        l lVar2 = f272e;
        lVar2.getClass();
        C3.e eVar = (C3.e) this.f275d.get(C3.b.b(lVar2, lVar, true));
        Throwable th = null;
        if (eVar == null) {
            return null;
        }
        boolean z4 = eVar.f392b;
        e eVar2 = new e(!z4, z4, z4 ? null : Long.valueOf(eVar.f393c), null, eVar.f394d, null);
        long j4 = eVar.f395e;
        if (j4 == -1) {
            return eVar2;
        }
        h e4 = this.f274c.e(this.f273b);
        try {
            pVar = AbstractC0462a.f(e4.e(j4));
            try {
                e4.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                e4.close();
            } catch (Throwable th4) {
                AbstractC0110a.c(th3, th4);
            }
            pVar = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        k3.h.b(pVar);
        ?? obj = new Object();
        obj.f7104l = eVar2.f239e;
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        int a4 = pVar.a();
        if (a4 != 67324752) {
            throw new IOException("bad zip: expected " + C3.a.b(67324752) + " but was " + C3.a.b(a4));
        }
        pVar.g(2L);
        short c4 = pVar.c();
        int i4 = c4 & 65535;
        if ((c4 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + C3.a.b(i4));
        }
        pVar.g(18L);
        int c5 = pVar.c() & 65535;
        pVar.g(pVar.c() & 65535);
        C3.a.d(pVar, c5, new C3.h(pVar, obj, obj2, obj3));
        e eVar3 = new e(eVar2.f235a, eVar2.f236b, eVar2.f237c, (Long) obj3.f7104l, (Long) obj.f7104l, (Long) obj2.f7104l);
        k3.h.b(eVar3);
        return eVar3;
    }
}
