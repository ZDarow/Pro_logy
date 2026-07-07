package p094Y;

/* renamed from: Y.c */
/* loaded from: classes.dex */
public abstract class AbstractC0865c implements p094Y.InterfaceC0870h {

    /* renamed from: l */
    public final boolean f3106l;

    /* renamed from: m */
    public final java.util.ArrayList f3107m = new java.util.ArrayList(1);

    /* renamed from: n */
    public int f3108n;

    /* renamed from: o */
    public p094Y.C0874l f3109o;

    public AbstractC0865c(boolean z4) {
        this.f3106l = z4;
    }

    /* renamed from: a */
    public final void m1690a(int i4) {
        p094Y.C0874l c0874l = this.f3109o;
        int i5 = p086W.AbstractC0805y.f2801a;
        for (int i6 = 0; i6 < this.f3108n; i6++) {
            p094Y.InterfaceC0860C interfaceC0860C = (p094Y.InterfaceC0860C) this.f3107m.get(i6);
            boolean z4 = this.f3106l;
            p197u0.C2220g c2220g = (p197u0.C2220g) interfaceC0860C;
            synchronized (c2220g) {
                p129f2.C1415c0 c1415c0 = p197u0.C2220g.f8847n;
                if (z4 && (c0874l.f3142h & 8) != 8) {
                    c2220g.f8861h += i4;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1691c() {
        p094Y.C0874l c0874l = this.f3109o;
        int i4 = p086W.AbstractC0805y.f2801a;
        for (int i5 = 0; i5 < this.f3108n; i5++) {
            p094Y.InterfaceC0860C interfaceC0860C = (p094Y.InterfaceC0860C) this.f3107m.get(i5);
            boolean z4 = this.f3106l;
            p197u0.C2220g c2220g = (p197u0.C2220g) interfaceC0860C;
            synchronized (c2220g) {
                try {
                    p129f2.C1415c0 c1415c0 = p197u0.C2220g.f8847n;
                    if (z4 && (c0874l.f3142h & 8) != 8) {
                        p086W.AbstractC0781a.m1421j(c2220g.f8859f > 0);
                        c2220g.f8856c.getClass();
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        int i6 = (int) (elapsedRealtime - c2220g.f8860g);
                        c2220g.f8862i += i6;
                        long j4 = c2220g.f8863j;
                        long j5 = c2220g.f8861h;
                        c2220g.f8863j = j4 + j5;
                        if (i6 > 0) {
                            c2220g.f8858e.m4435a((((float) j5) * 8000.0f) / i6, (int) java.lang.Math.sqrt(j5));
                            if (c2220g.f8862i < 2000) {
                                if (c2220g.f8863j >= 524288) {
                                }
                                c2220g.m4427c(i6, c2220g.f8861h, c2220g.f8864k);
                                c2220g.f8860g = elapsedRealtime;
                                c2220g.f8861h = 0L;
                            }
                            c2220g.f8864k = c2220g.f8858e.m4436b();
                            c2220g.m4427c(i6, c2220g.f8861h, c2220g.f8864k);
                            c2220g.f8860g = elapsedRealtime;
                            c2220g.f8861h = 0L;
                        }
                        c2220g.f8859f--;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        this.f3109o = null;
    }

    /* renamed from: f */
    public final void m1692f() {
        for (int i4 = 0; i4 < this.f3108n; i4++) {
            ((p094Y.InterfaceC0860C) this.f3107m.get(i4)).getClass();
        }
    }

    /* renamed from: i */
    public final void m1693i(p094Y.C0874l c0874l) {
        this.f3109o = c0874l;
        for (int i4 = 0; i4 < this.f3108n; i4++) {
            p094Y.InterfaceC0860C interfaceC0860C = (p094Y.InterfaceC0860C) this.f3107m.get(i4);
            boolean z4 = this.f3106l;
            p197u0.C2220g c2220g = (p197u0.C2220g) interfaceC0860C;
            synchronized (c2220g) {
                try {
                    p129f2.C1415c0 c1415c0 = p197u0.C2220g.f8847n;
                    if (z4 && (c0874l.f3142h & 8) != 8) {
                        if (c2220g.f8859f == 0) {
                            c2220g.f8856c.getClass();
                            c2220g.f8860g = android.os.SystemClock.elapsedRealtime();
                        }
                        c2220g.f8859f++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: j */
    public final void mo1688j(p094Y.InterfaceC0860C interfaceC0860C) {
        interfaceC0860C.getClass();
        java.util.ArrayList arrayList = this.f3107m;
        if (arrayList.contains(interfaceC0860C)) {
            return;
        }
        arrayList.add(interfaceC0860C);
        this.f3108n++;
    }
}
