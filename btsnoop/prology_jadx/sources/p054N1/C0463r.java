package p054N1;

/* renamed from: N1.r */
/* loaded from: classes.dex */
public final class C0463r implements p058O1.InterfaceC0498b {

    /* renamed from: a */
    public boolean f1351a;

    /* renamed from: b */
    public final java.lang.Object f1352b;

    /* renamed from: c */
    public final java.lang.Object f1353c;

    /* renamed from: d */
    public java.lang.Object f1354d;

    /* renamed from: e */
    public java.lang.Object f1355e;

    /* renamed from: f */
    public java.lang.Object f1356f;

    public C0463r(p054N1.C0449d c0449d, p050M1.InterfaceC0419c interfaceC0419c, p054N1.C0447b c0447b) {
        this.f1356f = c0449d;
        this.f1354d = null;
        this.f1355e = null;
        this.f1351a = false;
        this.f1352b = interfaceC0419c;
        this.f1353c = c0447b;
    }

    @Override // p058O1.InterfaceC0498b
    /* renamed from: a */
    public void mo977a(p046L1.C0357a c0357a) {
        ((p054N1.C0449d) this.f1356f).f1321x.post(new p054N1.RunnableC0462q(0, this, c0357a));
    }

    /* renamed from: b */
    public p124e2.InterfaceC1362j m978b(int i4) {
        p124e2.InterfaceC1362j interfaceC1362j;
        p124e2.InterfaceC1362j interfaceC1362j2;
        java.util.HashMap hashMap = (java.util.HashMap) this.f1353c;
        p124e2.InterfaceC1362j interfaceC1362j3 = (p124e2.InterfaceC1362j) hashMap.get(java.lang.Integer.valueOf(i4));
        if (interfaceC1362j3 != null) {
            return interfaceC1362j3;
        }
        final p008B1.C0026d c0026d = (p008B1.C0026d) this.f1355e;
        c0026d.getClass();
        if (i4 == 0) {
            final java.lang.Class asSubclass = androidx.media3.exoplayer.dash.DashMediaSource$Factory.class.asSubclass(p179q0.InterfaceC1963E.class);
            final int i5 = 0;
            interfaceC1362j = new p124e2.InterfaceC1362j() { // from class: q0.s
                @Override // p124e2.InterfaceC1362j
                public final java.lang.Object get() {
                    switch (i5) {
                        case 0:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass, c0026d);
                        case 1:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass, c0026d);
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass, c0026d);
                        default:
                            return new p179q0.C1978U(c0026d, (p215y0.C2401m) ((p054N1.C0463r) asSubclass).f1352b);
                    }
                }
            };
        } else if (i4 == 1) {
            final java.lang.Class asSubclass2 = androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory.class.asSubclass(p179q0.InterfaceC1963E.class);
            final int i6 = 1;
            interfaceC1362j = new p124e2.InterfaceC1362j() { // from class: q0.s
                @Override // p124e2.InterfaceC1362j
                public final java.lang.Object get() {
                    switch (i6) {
                        case 0:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass2, c0026d);
                        case 1:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass2, c0026d);
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass2, c0026d);
                        default:
                            return new p179q0.C1978U(c0026d, (p215y0.C2401m) ((p054N1.C0463r) asSubclass2).f1352b);
                    }
                }
            };
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    interfaceC1362j2 = new p102a0.C0988n(3, androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory.class.asSubclass(p179q0.InterfaceC1963E.class));
                } else {
                    if (i4 != 4) {
                        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Unrecognized contentType: ", i4));
                    }
                    final int i7 = 3;
                    interfaceC1362j2 = new p124e2.InterfaceC1362j() { // from class: q0.s
                        @Override // p124e2.InterfaceC1362j
                        public final java.lang.Object get() {
                            switch (i7) {
                                case 0:
                                    return p179q0.C2015t.m4068d((java.lang.Class) this, c0026d);
                                case 1:
                                    return p179q0.C2015t.m4068d((java.lang.Class) this, c0026d);
                                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                    return p179q0.C2015t.m4068d((java.lang.Class) this, c0026d);
                                default:
                                    return new p179q0.C1978U(c0026d, (p215y0.C2401m) ((p054N1.C0463r) this).f1352b);
                            }
                        }
                    };
                }
                hashMap.put(java.lang.Integer.valueOf(i4), interfaceC1362j2);
                return interfaceC1362j2;
            }
            final java.lang.Class asSubclass3 = androidx.media3.exoplayer.hls.HlsMediaSource$Factory.class.asSubclass(p179q0.InterfaceC1963E.class);
            final int i8 = 2;
            interfaceC1362j = new p124e2.InterfaceC1362j() { // from class: q0.s
                @Override // p124e2.InterfaceC1362j
                public final java.lang.Object get() {
                    switch (i8) {
                        case 0:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass3, c0026d);
                        case 1:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass3, c0026d);
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            return p179q0.C2015t.m4068d((java.lang.Class) asSubclass3, c0026d);
                        default:
                            return new p179q0.C1978U(c0026d, (p215y0.C2401m) ((p054N1.C0463r) asSubclass3).f1352b);
                    }
                }
            };
        }
        interfaceC1362j2 = interfaceC1362j;
        hashMap.put(java.lang.Integer.valueOf(i4), interfaceC1362j2);
        return interfaceC1362j2;
    }

    /* renamed from: c */
    public void m979c(p046L1.C0357a c0357a) {
        p054N1.C0460o c0460o = (p054N1.C0460o) ((p054N1.C0449d) this.f1356f).f1318u.get((p054N1.C0447b) this.f1353c);
        if (c0460o != null) {
            c0460o.m972m(c0357a);
        }
    }

    public C0463r(android.content.Context context, p206w0.C2320p c2320p) {
        this.f1352b = context.getApplicationContext();
        this.f1353c = c2320p;
        this.f1356f = p086W.C0800t.f2792a;
    }

    public C0463r(android.content.Context context) {
        this.f1352b = context;
        this.f1353c = p112c0.C1223e.f4767c;
        this.f1355e = p112c0.C1212K.f4722a;
    }

    public C0463r(p215y0.C2401m c2401m, p046L1.C0363g c0363g) {
        this.f1352b = c2401m;
        this.f1356f = c0363g;
        this.f1353c = new java.util.HashMap();
        this.f1354d = new java.util.HashMap();
        this.f1351a = true;
    }
}
