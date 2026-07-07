package Y1;

import a0.RunnableC0122b;
import android.content.Context;
import android.os.Parcel;
import androidx.lifecycle.e;
import androidx.lifecycle.k;
import d2.C0241d;
import d2.C0246i;
import d2.InterfaceC0245h;
import j.l0;
import java.util.ArrayDeque;
import k3.h;
import l1.C0403a;

/* loaded from: classes.dex */
public final class a implements N1.j {

    /* renamed from: l, reason: collision with root package name */
    public boolean f3078l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3079m;

    /* renamed from: n, reason: collision with root package name */
    public Object f3080n;

    @Override // N1.j
    public void J(Object obj, Object obj2) {
        N1.g gVar;
        boolean z4;
        L1.c cVar;
        i iVar = (i) obj;
        C0241d c0241d = (C0241d) obj2;
        synchronized (this) {
            gVar = ((N1.h) this.f3079m).f1283c;
            z4 = this.f3078l;
            N1.h hVar = (N1.h) this.f3079m;
            cVar = null;
            hVar.f1282b = null;
            hVar.f1283c = null;
        }
        if (gVar == null) {
            c0241d.a(Boolean.FALSE);
            return;
        }
        synchronized (iVar.f3091K) {
            try {
                h hVar2 = (h) iVar.f3091K.remove(gVar);
                if (hVar2 == null) {
                    c0241d.a(Boolean.FALSE);
                    return;
                }
                N1.h d4 = hVar2.f3090d.d();
                d4.f1282b = null;
                d4.f1283c = null;
                if (z4) {
                    L1.c[] b4 = iVar.b();
                    if (b4 != null) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= b4.length) {
                                break;
                            }
                            L1.c cVar2 = b4[i4];
                            if ("location_updates_with_callback".equals(cVar2.f1061l)) {
                                cVar = cVar2;
                                break;
                            }
                            i4++;
                        }
                        if (cVar != null && cVar.d() >= 1) {
                            x xVar = (x) iVar.q();
                            int identityHashCode = System.identityHashCode(hVar2);
                            StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                            sb.append("ILocationCallback@");
                            sb.append(identityHashCode);
                            k kVar = new k(2, null, hVar2, null, sb.toString());
                            f fVar = new f(Boolean.TRUE, c0241d);
                            Parcel K3 = xVar.K();
                            c.b(K3, kVar);
                            K3.writeStrongBinder(fVar);
                            xVar.V(K3, 89);
                        }
                    }
                    x xVar2 = (x) iVar.q();
                    m mVar = new m(2, null, null, hVar2, null, new g(c0241d), null);
                    Parcel K4 = xVar2.K();
                    c.b(K4, mVar);
                    xVar2.V(K4, 59);
                } else {
                    c0241d.a(Boolean.TRUE);
                }
            } finally {
            }
        }
    }

    public void a(double d4, double d5) {
        boolean z4 = this.f3078l;
        double[] dArr = (double[]) this.f3079m;
        double d6 = 1.0d;
        if (!z4) {
            d6 = 1.0d / (((dArr[7] * d5) + (dArr[3] * d4)) + dArr[15]);
        }
        double d7 = ((dArr[4] * d5) + (dArr[0] * d4) + dArr[12]) * d6;
        double d8 = ((dArr[5] * d5) + (dArr[1] * d4) + dArr[13]) * d6;
        double[] dArr2 = (double[]) this.f3080n;
        if (d7 < dArr2[0]) {
            dArr2[0] = d7;
        } else if (d7 > dArr2[1]) {
            dArr2[1] = d7;
        }
        if (d8 < dArr2[2]) {
            dArr2[2] = d8;
        } else if (d8 > dArr2[3]) {
            dArr2[3] = d8;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.lifecycle.k] */
    public void b() {
        ?? r02 = this.f3079m;
        androidx.lifecycle.m b4 = r02.b();
        if (b4.f4164c != androidx.lifecycle.f.f4154m) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        b4.a(new C0403a(0, r02));
        final l0 l0Var = (l0) this.f3080n;
        l0Var.getClass();
        if (l0Var.f6708a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        b4.a(new androidx.lifecycle.j() { // from class: l1.b
            @Override // androidx.lifecycle.j
            public final void a(k kVar, e eVar) {
                h.e(l0.this, "this$0");
            }
        });
        l0Var.f6708a = true;
        this.f3078l = true;
    }

    public void c() {
        if (this.f3078l) {
            ((Context) this.f3079m).unregisterReceiver((RunnableC0122b) this.f3080n);
            this.f3078l = false;
        }
    }

    public synchronized N1.h d() {
        return (N1.h) this.f3079m;
    }

    public void e(InterfaceC0245h interfaceC0245h) {
        synchronized (this.f3079m) {
            try {
                if (((ArrayDeque) this.f3080n) == null) {
                    this.f3080n = new ArrayDeque();
                }
                ((ArrayDeque) this.f3080n).add(interfaceC0245h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(C0246i c0246i) {
        InterfaceC0245h interfaceC0245h;
        synchronized (this.f3079m) {
            if (((ArrayDeque) this.f3080n) != null && !this.f3078l) {
                this.f3078l = true;
                while (true) {
                    synchronized (this.f3079m) {
                        try {
                            interfaceC0245h = (InterfaceC0245h) ((ArrayDeque) this.f3080n).poll();
                            if (interfaceC0245h == null) {
                                this.f3078l = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC0245h.a(c0246i);
                }
            }
        }
    }
}
