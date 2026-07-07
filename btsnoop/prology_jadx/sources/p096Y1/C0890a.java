package p096Y1;

/* renamed from: Y1.a */
/* loaded from: classes.dex */
public final class C0890a implements p054N1.InterfaceC0455j {

    /* renamed from: l */
    public boolean f3188l;

    /* renamed from: m */
    public java.lang.Object f3189m;

    /* renamed from: n */
    public java.lang.Object f3190n;

    @Override // p054N1.InterfaceC0455j
    /* renamed from: J */
    public void mo751J(java.lang.Object obj, java.lang.Object obj2) {
        p054N1.C0452g c0452g;
        boolean z4;
        p046L1.C0359c c0359c;
        p096Y1.C0898i c0898i = (p096Y1.C0898i) obj;
        p119d2.C1285d c1285d = (p119d2.C1285d) obj2;
        synchronized (this) {
            c0452g = ((p054N1.C0453h) this.f3189m).f1327c;
            z4 = this.f3188l;
            p054N1.C0453h c0453h = (p054N1.C0453h) this.f3189m;
            c0359c = null;
            c0453h.f1326b = null;
            c0453h.f1327c = null;
        }
        if (c0452g == null) {
            c1285d.m3021a(java.lang.Boolean.FALSE);
            return;
        }
        synchronized (c0898i.f3202K) {
            try {
                p096Y1.BinderC0897h binderC0897h = (p096Y1.BinderC0897h) c0898i.f3202K.remove(c0452g);
                if (binderC0897h == null) {
                    c1285d.m3021a(java.lang.Boolean.FALSE);
                    return;
                }
                p054N1.C0453h m1730d = binderC0897h.f3200d.m1730d();
                m1730d.f1326b = null;
                m1730d.f1327c = null;
                if (z4) {
                    p046L1.C0359c[] mo885b = c0898i.mo885b();
                    if (mo885b != null) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= mo885b.length) {
                                break;
                            }
                            p046L1.C0359c c0359c2 = mo885b[i4];
                            if ("location_updates_with_callback".equals(c0359c2.f1100l)) {
                                c0359c = c0359c2;
                                break;
                            }
                            i4++;
                        }
                        if (c0359c != null && c0359c.m804d() >= 1) {
                            p096Y1.C0913x c0913x = (p096Y1.C0913x) c0898i.m2935q();
                            int identityHashCode = java.lang.System.identityHashCode(binderC0897h);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(identityHashCode).length() + 18);
                            sb.append("ILocationCallback@");
                            sb.append(identityHashCode);
                            p096Y1.C0900k c0900k = new p096Y1.C0900k(2, null, binderC0897h, null, sb.toString());
                            p096Y1.BinderC0895f binderC0895f = new p096Y1.BinderC0895f(java.lang.Boolean.TRUE, c1285d);
                            android.os.Parcel m1657K = c0913x.m1657K();
                            p096Y1.AbstractC0892c.m1735b(m1657K, c0900k);
                            m1657K.writeStrongBinder(binderC0895f);
                            c0913x.m1658V(m1657K, 89);
                        }
                    }
                    p096Y1.C0913x c0913x2 = (p096Y1.C0913x) c0898i.m2935q();
                    p096Y1.C0902m c0902m = new p096Y1.C0902m(2, null, null, binderC0897h, null, new p096Y1.BinderC0896g(c1285d), null);
                    android.os.Parcel m1657K2 = c0913x2.m1657K();
                    p096Y1.AbstractC0892c.m1735b(m1657K2, c0902m);
                    c0913x2.m1658V(m1657K2, 59);
                } else {
                    c1285d.m3021a(java.lang.Boolean.TRUE);
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public void m1727a(double d4, double d5) {
        boolean z4 = this.f3188l;
        double[] dArr = (double[]) this.f3189m;
        double d6 = 1.0d;
        if (!z4) {
            d6 = 1.0d / (((dArr[7] * d5) + (dArr[3] * d4)) + dArr[15]);
        }
        double d7 = ((dArr[4] * d5) + (dArr[0] * d4) + dArr[12]) * d6;
        double d8 = ((dArr[5] * d5) + (dArr[1] * d4) + dArr[13]) * d6;
        double[] dArr2 = (double[]) this.f3190n;
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
    /* renamed from: b */
    public void m1728b() {
        ?? r02 = this.f3189m;
        androidx.lifecycle.C1149m mo127b = r02.mo127b();
        if (mo127b.f4313c != androidx.lifecycle.EnumC1142f.f4303m) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo127b.m2657a(new p157l1.C1822a(0, r02));
        final p145j.C1670l0 c1670l0 = (p145j.C1670l0) this.f3190n;
        c1670l0.getClass();
        if (c1670l0.f6966a) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.");
        }
        mo127b.m2657a(new androidx.lifecycle.InterfaceC1146j() { // from class: l1.b
            @Override // androidx.lifecycle.InterfaceC1146j
            /* renamed from: a */
            public final void mo2655a(androidx.lifecycle.InterfaceC1147k interfaceC1147k, androidx.lifecycle.EnumC1141e enumC1141e) {
                p154k3.AbstractC1803h.m3779e(p145j.C1670l0.this, "this$0");
            }
        });
        c1670l0.f6966a = true;
        this.f3188l = true;
    }

    /* renamed from: c */
    public void m1729c() {
        if (this.f3188l) {
            ((android.content.Context) this.f3189m).unregisterReceiver((p102a0.RunnableC0964b) this.f3190n);
            this.f3188l = false;
        }
    }

    /* renamed from: d */
    public synchronized p054N1.C0453h m1730d() {
        return (p054N1.C0453h) this.f3189m;
    }

    /* renamed from: e */
    public void m1731e(p119d2.InterfaceC1289h interfaceC1289h) {
        synchronized (this.f3189m) {
            try {
                if (((java.util.ArrayDeque) this.f3190n) == null) {
                    this.f3190n = new java.util.ArrayDeque();
                }
                ((java.util.ArrayDeque) this.f3190n).add(interfaceC1289h);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void m1732f(p119d2.C1290i c1290i) {
        p119d2.InterfaceC1289h interfaceC1289h;
        synchronized (this.f3189m) {
            if (((java.util.ArrayDeque) this.f3190n) != null && !this.f3188l) {
                this.f3188l = true;
                while (true) {
                    synchronized (this.f3189m) {
                        try {
                            interfaceC1289h = (p119d2.InterfaceC1289h) ((java.util.ArrayDeque) this.f3190n).poll();
                            if (interfaceC1289h == null) {
                                this.f3188l = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC1289h.mo3023a(c1290i);
                }
            }
        }
    }
}
