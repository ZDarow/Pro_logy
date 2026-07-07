package R2;

import android.content.Context;
import android.util.Log;
import c3.EnumC0225a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r3.AbstractC0534v;

/* loaded from: classes.dex */
public final class K implements H2.b, InterfaceC0071g {

    /* renamed from: l, reason: collision with root package name */
    public Context f1788l;

    /* renamed from: m, reason: collision with root package name */
    public android.support.v4.media.session.t f1789m;

    /* renamed from: n, reason: collision with root package name */
    public final F1.g f1790n = new Object();

    public static final Object a(K k4, String str, String str2, d3.g gVar) {
        k4.getClass();
        M.d dVar = new M.d(str);
        Context context = k4.f1788l;
        if (context != null) {
            Object b4 = L.a(context).b(new M.f(new C0075k(dVar, str2, null), null), gVar);
            return b4 == EnumC0225a.f4710l ? b4 : Z2.g.f3186a;
        }
        k3.h.i("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c6 -> B:11:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(R2.K r11, java.util.List r12, d3.b r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.K.c(R2.K, java.util.List, d3.b):java.lang.Object");
    }

    @Override // R2.InterfaceC0071g
    public final void D(String str, boolean z4, C0072h c0072h) {
        AbstractC0534v.j(new C(str, this, z4, null));
    }

    @Override // R2.InterfaceC0071g
    public final Map F(List list, C0072h c0072h) {
        return (Map) AbstractC0534v.j(new C0076l(this, list, null));
    }

    @Override // R2.InterfaceC0071g
    public final void G(String str, double d4, C0072h c0072h) {
        AbstractC0534v.j(new F(str, this, d4, null));
    }

    @Override // R2.InterfaceC0071g
    public final void J(String str, List list, C0072h c0072h) {
        AbstractC0534v.j(new D(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f1790n.s(list)), null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k3.p] */
    @Override // R2.InterfaceC0071g
    public final Double K(String str, C0072h c0072h) {
        ?? obj = new Object();
        AbstractC0534v.j(new s(str, this, obj, null));
        return (Double) obj.f7104l;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k3.p] */
    @Override // R2.InterfaceC0071g
    public final Long L(String str, C0072h c0072h) {
        ?? obj = new Object();
        AbstractC0534v.j(new u(str, this, obj, null));
        return (Long) obj.f7104l;
    }

    @Override // R2.InterfaceC0071g
    public final O N(String str, C0072h c0072h) {
        String n4 = n(str, c0072h);
        if (n4 == null) {
            return null;
        }
        if (q3.i.p0(n4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new O(n4, M.f1795o);
        }
        return q3.i.p0(n4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new O(null, M.f1794n) : new O(null, M.f1796p);
    }

    @Override // R2.InterfaceC0071g
    public final void O(String str, String str2, C0072h c0072h) {
        AbstractC0534v.j(new J(this, str, str2, null));
    }

    @Override // R2.InterfaceC0071g
    public final List P(List list, C0072h c0072h) {
        return a3.d.h0(((Map) AbstractC0534v.j(new v(this, list, null))).keySet());
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        k3.h.e(aVar, "binding");
        L2.f fVar = (L2.f) aVar.f709m;
        k3.h.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0071g.f1812b.getClass();
        C0070f.b(fVar, null, "data_store");
        android.support.v4.media.session.t tVar = this.f1789m;
        if (tVar != null) {
            C0070f.b((L2.f) tVar.f3734m, null, "shared_preferences");
        }
        this.f1789m = null;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        k3.h.e(aVar, "binding");
        L2.f fVar = (L2.f) aVar.f709m;
        k3.h.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) aVar.f708l;
        k3.h.d(context, "getApplicationContext(...)");
        this.f1788l = context;
        try {
            InterfaceC0071g.f1812b.getClass();
            C0070f.b(fVar, this, "data_store");
            this.f1789m = new android.support.v4.media.session.t(fVar, context, this.f1790n);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
        new C0065a().d(aVar);
    }

    @Override // R2.InterfaceC0071g
    public final void h(List list, C0072h c0072h) {
        AbstractC0534v.j(new C0074j(this, list, null));
    }

    @Override // R2.InterfaceC0071g
    public final void i(String str, String str2, C0072h c0072h) {
        AbstractC0534v.j(new G(this, str, str2, null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k3.p] */
    @Override // R2.InterfaceC0071g
    public final Boolean m(String str, C0072h c0072h) {
        ?? obj = new Object();
        AbstractC0534v.j(new p(str, this, obj, null));
        return (Boolean) obj.f7104l;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k3.p] */
    @Override // R2.InterfaceC0071g
    public final String n(String str, C0072h c0072h) {
        ?? obj = new Object();
        AbstractC0534v.j(new y(str, this, obj, null));
        return (String) obj.f7104l;
    }

    @Override // R2.InterfaceC0071g
    public final void p(String str, long j4, C0072h c0072h) {
        AbstractC0534v.j(new I(str, this, j4, null));
    }

    @Override // R2.InterfaceC0071g
    public final ArrayList x(String str, C0072h c0072h) {
        List list;
        String n4 = n(str, c0072h);
        ArrayList arrayList = null;
        if (n4 != null && !q3.i.p0(n4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && q3.i.p0(n4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) L.c(n4, this.f1790n)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
