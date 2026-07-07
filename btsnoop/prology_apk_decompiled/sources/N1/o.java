package N1;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import b2.C0185a;
import c2.C0219a;
import com.google.android.gms.common.api.Status;
import d2.C0241d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import n.C0443f;

/* loaded from: classes.dex */
public final class o implements M1.g, M1.h {

    /* renamed from: d, reason: collision with root package name */
    public final M1.c f1290d;

    /* renamed from: e, reason: collision with root package name */
    public final C0058b f1291e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.d f1292f;

    /* renamed from: i, reason: collision with root package name */
    public final int f1295i;

    /* renamed from: j, reason: collision with root package name */
    public final A f1296j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1297k;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0060d f1301o;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f1289c = new LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f1293g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1294h = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1298l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public L1.a f1299m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f1300n = 0;

    public o(C0060d c0060d, M1.f fVar) {
        this.f1301o = c0060d;
        Looper looper = c0060d.f1277x.getLooper();
        android.support.v4.media.session.t a4 = fVar.a();
        C2.d dVar = new C2.d((C0443f) a4.f3734m, (String) a4.f3735n, (String) a4.f3736o);
        AbstractC0110a abstractC0110a = (AbstractC0110a) fVar.f1164c.f96m;
        O1.s.d(abstractC0110a);
        M1.c e4 = abstractC0110a.e(fVar.f1162a, looper, dVar, fVar.f1165d, this, this);
        String str = fVar.f1163b;
        if (str != null && (e4 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) e4).f4744C = str;
        }
        if (str != null && (e4 instanceof i)) {
            AbstractC0007h.r(e4);
            throw null;
        }
        this.f1290d = e4;
        this.f1291e = fVar.f1166e;
        this.f1292f = new B1.d(21);
        this.f1295i = fVar.f1167f;
        if (!e4.j()) {
            this.f1296j = null;
            return;
        }
        Context context = c0060d.f1271p;
        W1.f fVar2 = c0060d.f1277x;
        android.support.v4.media.session.t a5 = fVar.a();
        this.f1296j = new A(context, fVar2, new C2.d((C0443f) a5.f3734m, (String) a5.f3735n, (String) a5.f3736o));
    }

    @Override // M1.g
    public final void K(int i4) {
        Looper myLooper = Looper.myLooper();
        C0060d c0060d = this.f1301o;
        if (myLooper == c0060d.f1277x.getLooper()) {
            f(i4);
        } else {
            c0060d.f1277x.post(new n(this, i4));
        }
    }

    @Override // M1.g
    public final void V() {
        Looper myLooper = Looper.myLooper();
        C0060d c0060d = this.f1301o;
        if (myLooper == c0060d.f1277x.getLooper()) {
            e();
        } else {
            c0060d.f1277x.post(new F.b(1, this));
        }
    }

    public final void a(L1.a aVar) {
        HashSet hashSet = this.f1293g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (O1.s.f(aVar, L1.a.f1053p)) {
                this.f1290d.d();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        O1.s.b(this.f1301o.f1277x);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z4) {
        O1.s.b(this.f1301o.f1277x);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f1289c.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (!z4 || uVar.f1315a == 2) {
                if (status != null) {
                    uVar.c(status);
                } else {
                    uVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f1289c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            u uVar = (u) arrayList.get(i4);
            if (!this.f1290d.c()) {
                return;
            }
            if (h(uVar)) {
                linkedList.remove(uVar);
            }
        }
    }

    public final void e() {
        M1.c cVar = this.f1290d;
        C0060d c0060d = this.f1301o;
        O1.s.b(c0060d.f1277x);
        this.f1299m = null;
        a(L1.a.f1053p);
        if (this.f1297k) {
            W1.f fVar = c0060d.f1277x;
            C0058b c0058b = this.f1291e;
            fVar.removeMessages(11, c0058b);
            c0060d.f1277x.removeMessages(9, c0058b);
            this.f1297k = false;
        }
        Iterator it = this.f1294h.values().iterator();
        while (it.hasNext()) {
            B1.d dVar = ((y) it.next()).f1328a;
            try {
                ((Y.x) ((W.p) dVar.f97n).f2683b).J(cVar, new C0241d());
            } catch (DeadObjectException unused) {
                K(3);
                cVar.i("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        g();
    }

    public final void f(int i4) {
        C0060d c0060d = this.f1301o;
        O1.s.b(c0060d.f1277x);
        this.f1299m = null;
        this.f1297k = true;
        String e4 = this.f1290d.e();
        B1.d dVar = this.f1292f;
        dVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (e4 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(e4);
        }
        dVar.o(true, new Status(20, sb.toString(), null, null));
        W1.f fVar = c0060d.f1277x;
        C0058b c0058b = this.f1291e;
        fVar.sendMessageDelayed(Message.obtain(fVar, 9, c0058b), 5000L);
        W1.f fVar2 = c0060d.f1277x;
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 11, c0058b), 120000L);
        ((SparseIntArray) c0060d.f1273r.f96m).clear();
        Iterator it = this.f1294h.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).getClass();
        }
    }

    @Override // M1.h
    public final void f0(L1.a aVar) {
        l(aVar, null);
    }

    public final void g() {
        C0060d c0060d = this.f1301o;
        W1.f fVar = c0060d.f1277x;
        C0058b c0058b = this.f1291e;
        fVar.removeMessages(12, c0058b);
        W1.f fVar2 = c0060d.f1277x;
        fVar2.sendMessageDelayed(fVar2.obtainMessage(12, c0058b), c0060d.f1267l);
    }

    public final boolean h(u uVar) {
        L1.c cVar;
        if (uVar == null) {
            M1.c cVar2 = this.f1290d;
            uVar.f(this.f1292f, cVar2.j());
            try {
                uVar.e(this);
            } catch (DeadObjectException unused) {
                K(1);
                cVar2.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        L1.c[] b4 = uVar.b(this);
        if (b4 != null && b4.length != 0) {
            L1.c[] b5 = this.f1290d.b();
            if (b5 == null) {
                b5 = new L1.c[0];
            }
            n.j jVar = new n.j(b5.length);
            for (L1.c cVar3 : b5) {
                jVar.put(cVar3.f1061l, Long.valueOf(cVar3.d()));
            }
            int length = b4.length;
            for (int i4 = 0; i4 < length; i4++) {
                cVar = b4[i4];
                Long l4 = (Long) jVar.get(cVar.f1061l);
                if (l4 == null || l4.longValue() < cVar.d()) {
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            M1.c cVar4 = this.f1290d;
            uVar.f(this.f1292f, cVar4.j());
            try {
                uVar.e(this);
            } catch (DeadObjectException unused2) {
                K(1);
                cVar4.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f1290d.getClass().getName() + " could not execute call because it requires feature (" + cVar.f1061l + ", " + cVar.d() + ").");
        if (!this.f1301o.f1278y || !uVar.a(this)) {
            uVar.d(new M1.k(cVar));
            return true;
        }
        p pVar = new p(this.f1291e, cVar);
        int indexOf = this.f1298l.indexOf(pVar);
        if (indexOf >= 0) {
            p pVar2 = (p) this.f1298l.get(indexOf);
            this.f1301o.f1277x.removeMessages(15, pVar2);
            W1.f fVar = this.f1301o.f1277x;
            fVar.sendMessageDelayed(Message.obtain(fVar, 15, pVar2), 5000L);
        } else {
            this.f1298l.add(pVar);
            W1.f fVar2 = this.f1301o.f1277x;
            fVar2.sendMessageDelayed(Message.obtain(fVar2, 15, pVar), 5000L);
            W1.f fVar3 = this.f1301o.f1277x;
            fVar3.sendMessageDelayed(Message.obtain(fVar3, 16, pVar), 120000L);
            L1.a aVar = new L1.a(2, null);
            if (!i(aVar)) {
                this.f1301o.b(aVar, this.f1295i);
            }
        }
        return false;
    }

    public final boolean i(L1.a aVar) {
        synchronized (C0060d.f1264B) {
            this.f1301o.getClass();
        }
        return false;
    }

    public final void j() {
        C0060d c0060d = this.f1301o;
        O1.s.b(c0060d.f1277x);
        M1.c cVar = this.f1290d;
        if (cVar.c() || cVar.a()) {
            return;
        }
        try {
            B1.d dVar = c0060d.f1273r;
            Context context = c0060d.f1271p;
            dVar.getClass();
            O1.s.d(context);
            int m4 = cVar.m();
            SparseIntArray sparseIntArray = (SparseIntArray) dVar.f96m;
            int i4 = sparseIntArray.get(m4, -1);
            if (i4 == -1) {
                i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= sparseIntArray.size()) {
                        i4 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i5);
                    if (keyAt > m4 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i4 == -1) {
                    i4 = ((L1.d) dVar.f97n).b(context, m4);
                }
                sparseIntArray.put(m4, i4);
            }
            if (i4 != 0) {
                L1.a aVar = new L1.a(i4, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                l(aVar, null);
                return;
            }
            r rVar = new r(c0060d, cVar, this.f1291e);
            if (cVar.j()) {
                A a4 = this.f1296j;
                O1.s.d(a4);
                C0219a c0219a = a4.f1245i;
                if (c0219a != null) {
                    c0219a.h();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(a4));
                C2.d dVar2 = a4.f1244h;
                dVar2.f372f = valueOf;
                W1.f fVar = a4.f1241e;
                a4.f1245i = (C0219a) a4.f1242f.e(a4.f1240d, fVar.getLooper(), dVar2, (C0185a) dVar2.f371e, a4, a4);
                a4.f1246j = rVar;
                Set set = a4.f1243g;
                if (set == null || set.isEmpty()) {
                    fVar.post(new F.b(3, a4));
                } else {
                    C0219a c0219a2 = a4.f1245i;
                    c0219a2.getClass();
                    c0219a2.k(new O1.h(c0219a2));
                }
            }
            try {
                cVar.k(rVar);
            } catch (SecurityException e4) {
                l(new L1.a(10), e4);
            }
        } catch (IllegalStateException e5) {
            l(new L1.a(10), e5);
        }
    }

    public final void k(u uVar) {
        O1.s.b(this.f1301o.f1277x);
        boolean c4 = this.f1290d.c();
        LinkedList linkedList = this.f1289c;
        if (c4) {
            if (h(uVar)) {
                g();
                return;
            } else {
                linkedList.add(uVar);
                return;
            }
        }
        linkedList.add(uVar);
        L1.a aVar = this.f1299m;
        if (aVar == null || aVar.f1055m == 0 || aVar.f1056n == null) {
            j();
        } else {
            l(aVar, null);
        }
    }

    public final void l(L1.a aVar, RuntimeException runtimeException) {
        C0219a c0219a;
        O1.s.b(this.f1301o.f1277x);
        A a4 = this.f1296j;
        if (a4 != null && (c0219a = a4.f1245i) != null) {
            c0219a.h();
        }
        O1.s.b(this.f1301o.f1277x);
        this.f1299m = null;
        ((SparseIntArray) this.f1301o.f1273r.f96m).clear();
        a(aVar);
        if ((this.f1290d instanceof Q1.d) && aVar.f1055m != 24) {
            C0060d c0060d = this.f1301o;
            c0060d.f1268m = true;
            W1.f fVar = c0060d.f1277x;
            fVar.sendMessageDelayed(fVar.obtainMessage(19), 300000L);
        }
        if (aVar.f1055m == 4) {
            b(C0060d.f1263A);
            return;
        }
        if (this.f1289c.isEmpty()) {
            this.f1299m = aVar;
            return;
        }
        if (runtimeException != null) {
            O1.s.b(this.f1301o.f1277x);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f1301o.f1278y) {
            b(C0060d.c(this.f1291e, aVar));
            return;
        }
        c(C0060d.c(this.f1291e, aVar), null, true);
        if (this.f1289c.isEmpty() || i(aVar) || this.f1301o.b(aVar, this.f1295i)) {
            return;
        }
        if (aVar.f1055m == 18) {
            this.f1297k = true;
        }
        if (!this.f1297k) {
            b(C0060d.c(this.f1291e, aVar));
            return;
        }
        C0060d c0060d2 = this.f1301o;
        C0058b c0058b = this.f1291e;
        W1.f fVar2 = c0060d2.f1277x;
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 9, c0058b), 5000L);
    }

    public final void m(L1.a aVar) {
        O1.s.b(this.f1301o.f1277x);
        M1.c cVar = this.f1290d;
        cVar.i("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        l(aVar, null);
    }

    public final void n() {
        O1.s.b(this.f1301o.f1277x);
        Status status = C0060d.f1266z;
        b(status);
        this.f1292f.o(false, status);
        for (g gVar : (g[]) this.f1294h.keySet().toArray(new g[0])) {
            k(new B(gVar, new C0241d()));
        }
        a(new L1.a(4));
        M1.c cVar = this.f1290d;
        if (cVar.c()) {
            cVar.l(new K2.o(3, this));
        }
    }
}
