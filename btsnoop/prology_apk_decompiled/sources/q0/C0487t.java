package q0;

import T.C0094o;
import T.C0095p;
import T.C0097s;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: q0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487t implements InterfaceC0468E {

    /* renamed from: a, reason: collision with root package name */
    public final N1.r f7915a;

    /* renamed from: b, reason: collision with root package name */
    public B1.d f7916b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7917c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7918d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7919e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7920f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7922h;

    public C0487t(Context context) {
        this(new B1.d(context), new y0.m());
    }

    public static InterfaceC0468E d(Class cls, B1.d dVar) {
        try {
            return (InterfaceC0468E) cls.getConstructor(Y.g.class).newInstance(dVar);
        } catch (Exception e4) {
            throw new IllegalStateException(e4);
        }
    }

    @Override // q0.InterfaceC0468E
    public final void a(L1.g gVar) {
        N1.r rVar = this.f7915a;
        rVar.f1312f = gVar;
        y0.m mVar = (y0.m) rVar.f1308b;
        synchronized (mVar) {
            mVar.f9100q = gVar;
        }
        Iterator it = ((HashMap) rVar.f1310d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0468E) it.next()).a(gVar);
        }
    }

    @Override // q0.InterfaceC0468E
    public final void b(boolean z4) {
        this.f7922h = z4;
        N1.r rVar = this.f7915a;
        rVar.f1307a = z4;
        y0.m mVar = (y0.m) rVar.f1308b;
        synchronized (mVar) {
            mVar.f9099p = z4;
        }
        Iterator it = ((HashMap) rVar.f1310d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0468E) it.next()).b(z4);
        }
    }

    @Override // q0.InterfaceC0468E
    public final AbstractC0469a c(T.B b4) {
        b4.f2067b.getClass();
        String scheme = b4.f2067b.f2364a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(b4.f2067b.f2365b, "application/x-image-uri")) {
            long j4 = b4.f2067b.f2369f;
            int i4 = W.y.f2709a;
            throw null;
        }
        C0103y c0103y = b4.f2067b;
        int G3 = W.y.G(c0103y.f2365b, c0103y.f2364a);
        if (b4.f2067b.f2369f != -9223372036854775807L) {
            y0.m mVar = (y0.m) this.f7915a.f1308b;
            synchronized (mVar) {
                mVar.f9101r = 1;
            }
        }
        try {
            N1.r rVar = this.f7915a;
            HashMap hashMap = (HashMap) rVar.f1310d;
            InterfaceC0468E interfaceC0468E = (InterfaceC0468E) hashMap.get(Integer.valueOf(G3));
            if (interfaceC0468E == null) {
                interfaceC0468E = (InterfaceC0468E) rVar.b(G3).get();
                interfaceC0468E.a((L1.g) rVar.f1312f);
                interfaceC0468E.b(rVar.f1307a);
                hashMap.put(Integer.valueOf(G3), interfaceC0468E);
            }
            C0101w a4 = b4.f2068c.a();
            C0102x c0102x = b4.f2068c;
            if (c0102x.f2359a == -9223372036854775807L) {
                a4.f2354a = this.f7917c;
            }
            if (c0102x.f2362d == -3.4028235E38f) {
                a4.f2357d = this.f7920f;
            }
            if (c0102x.f2363e == -3.4028235E38f) {
                a4.f2358e = this.f7921g;
            }
            if (c0102x.f2360b == -9223372036854775807L) {
                a4.f2355b = this.f7918d;
            }
            if (c0102x.f2361c == -9223372036854775807L) {
                a4.f2356c = this.f7919e;
            }
            C0102x c0102x2 = new C0102x(a4);
            if (!c0102x2.equals(b4.f2068c)) {
                C0097s a5 = b4.a();
                a5.f2350k = c0102x2.a();
                b4 = a5.a();
            }
            AbstractC0469a c4 = interfaceC0468E.c(b4);
            f2.I i5 = b4.f2067b.f2367d;
            if (!i5.isEmpty()) {
                AbstractC0469a[] abstractC0469aArr = new AbstractC0469a[i5.size() + 1];
                abstractC0469aArr[0] = c4;
                if (i5.size() > 0) {
                    if (!this.f7922h) {
                        this.f7916b.getClass();
                        T.A a6 = (T.A) i5.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        f2.G g4 = f2.I.f5510m;
                        f2.c0 c0Var = f2.c0.f5550p;
                        Collections.emptyList();
                        f2.c0 c0Var2 = f2.c0.f5550p;
                        C0104z c0104z = C0104z.f2370a;
                        Uri uri = Uri.EMPTY;
                        a6.getClass();
                        throw null;
                    }
                    C0094o c0094o = new C0094o();
                    ((T.A) i5.get(0)).getClass();
                    ArrayList arrayList = T.H.f2120a;
                    c0094o.f2290l = null;
                    ((T.A) i5.get(0)).getClass();
                    c0094o.f2282d = null;
                    ((T.A) i5.get(0)).getClass();
                    c0094o.f2283e = 0;
                    ((T.A) i5.get(0)).getClass();
                    c0094o.f2284f = 0;
                    ((T.A) i5.get(0)).getClass();
                    c0094o.f2280b = null;
                    ((T.A) i5.get(0)).getClass();
                    c0094o.f2279a = null;
                    new C0095p(c0094o);
                    ((T.A) i5.get(0)).getClass();
                    throw null;
                }
                c4 = new M(abstractC0469aArr);
            }
            AbstractC0469a abstractC0469a = c4;
            long j5 = b4.f2070e.f2353a;
            if (j5 != Long.MIN_VALUE) {
                abstractC0469a = new C0475g(abstractC0469a, 0L, j5, true);
            }
            b4.f2067b.getClass();
            b4.f2067b.getClass();
            return abstractC0469a;
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public C0487t(B1.d dVar, y0.m mVar) {
        this.f7916b = dVar;
        N1.r rVar = new N1.r(mVar, new L1.g(15, false));
        this.f7915a = rVar;
        if (dVar != ((B1.d) rVar.f1311e)) {
            rVar.f1311e = dVar;
            ((HashMap) rVar.f1309c).clear();
            ((HashMap) rVar.f1310d).clear();
        }
        this.f7917c = -9223372036854775807L;
        this.f7918d = -9223372036854775807L;
        this.f7919e = -9223372036854775807L;
        this.f7920f = -3.4028235E38f;
        this.f7921g = -3.4028235E38f;
        this.f7922h = true;
    }
}
