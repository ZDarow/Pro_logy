package p009B2;

/* renamed from: B2.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C0067x implements p215y0.InterfaceC2395g, p119d2.InterfaceC1282a, p119d2.InterfaceC1283b, p047L2.InterfaceC0373c, p124e2.InterfaceC1357e, p086W.InterfaceC0783c, p089W2.InterfaceC0823c, p086W.InterfaceC0788h, p146j0.InterfaceC1695A {

    /* renamed from: l */
    public final /* synthetic */ int f218l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f219m;

    public /* synthetic */ C0067x(int i4, java.lang.Object obj) {
        this.f218l = i4;
        this.f219m = obj;
    }

    @Override // p215y0.InterfaceC2395g
    /* renamed from: a */
    public long mo284a(long j4) {
        return p086W.AbstractC0805y.m1616k((j4 * r0.f9470e) / 1000000, 0L, ((p215y0.C2407s) this.f219m).f9475j - 1);
    }

    @Override // p086W.InterfaceC0783c
    public void accept(java.lang.Object obj) {
        p083V0.C0763a c0763a = (p083V0.C0763a) obj;
        switch (this.f218l) {
            case 10:
                p083V0.C0770h c0770h = (p083V0.C0770h) this.f219m;
                c0770h.getClass();
                p083V0.C0769g c0769g = new p083V0.C0769g(c0763a.f2688b, p025F1.C0215g.m583t(c0763a.f2687a, c0763a.f2689c));
                c0770h.f2702c.add(c0769g);
                long j4 = c0770h.f2709j;
                if (j4 == -9223372036854775807L || c0763a.f2688b >= j4) {
                    c0770h.m1401a(c0769g);
                    return;
                }
                return;
            default:
                ((p129f2.C1390F) this.f219m).m3145a(c0763a);
                return;
        }
    }

    @Override // p124e2.InterfaceC1357e
    public java.lang.Object apply(java.lang.Object obj) {
        p073S0.C0643u c0643u = (p073S0.C0643u) obj;
        ((p073S0.C0636n) this.f219m).getClass();
        return c0643u;
    }

    @Override // p086W.InterfaceC0788h
    /* renamed from: b */
    public void mo285b(java.lang.Object obj) {
        switch (this.f218l) {
            case 14:
                ((p076T.InterfaceC0670M) obj).mo1215i((p076T.C0662E) this.f219m);
                return;
            case 15:
                ((p076T.InterfaceC0670M) obj).mo1216j((p076T.C0691e) this.f219m);
                return;
            case 16:
                ((p076T.InterfaceC0670M) obj).mo1217k((p082V.C0758c) this.f219m);
                return;
            case 17:
                ((p076T.InterfaceC0670M) obj).mo1215i(((p102a0.SurfaceHolderCallbackC0941E) this.f219m).f3316a.f3332L);
                return;
            case 18:
                ((p076T.InterfaceC0670M) obj).mo1228v((p076T.C0664G) this.f219m);
                return;
            case 19:
                ((p076T.InterfaceC0670M) obj).mo1229w((java.util.List) this.f219m);
                return;
            case 20:
            default:
                ((p107b0.C1175j) obj).getClass();
                return;
            case 21:
                p107b0.C1175j c1175j = (p107b0.C1175j) obj;
                int i4 = c1175j.f4546x;
                p102a0.C0972f c0972f = (p102a0.C0972f) this.f219m;
                c1175j.f4546x = i4 + c0972f.f3572g;
                c1175j.f4547y += c0972f.f3570e;
                return;
            case 22:
                ((p107b0.C1175j) obj).f4536n = (p076T.AbstractC0667J) this.f219m;
                return;
            case 23:
                p107b0.C1175j c1175j2 = (p107b0.C1175j) obj;
                c1175j2.getClass();
                c1175j2.f4544v = ((p166n0.C1891g) this.f219m).f7706l;
                return;
        }
    }

    @Override // p146j0.InterfaceC1695A
    /* renamed from: c */
    public int mo286c(java.lang.Object obj) {
        p146j0.C1709m c1709m = (p146j0.C1709m) obj;
        c1709m.getClass();
        p076T.C0702p c0702p = (p076T.C0702p) this.f219m;
        java.lang.String str = c0702p.f2408m;
        java.lang.String str2 = c1709m.f7094b;
        return ((str2.equals(str) || str2.equals(p146j0.AbstractC1696B.m3644b(c0702p))) && c1709m.m3663c(c0702p, false)) ? 1 : 0;
    }

    @Override // p089W2.InterfaceC0823c
    /* renamed from: d */
    public boolean mo287d(android.view.View view) {
        int i4 = 0;
        while (true) {
            java.lang.Class[] clsArr = (java.lang.Class[]) this.f219m;
            if (i4 >= clsArr.length) {
                return false;
            }
            if (clsArr[i4].isInstance(view)) {
                return true;
            }
            i4++;
        }
    }

    @Override // p047L2.InterfaceC0373c
    /* renamed from: e */
    public void mo106e(java.lang.Object obj) {
        boolean z4 = false;
        if (obj != null) {
            try {
                z4 = ((org.json.JSONObject) obj).getBoolean("handled");
            } catch (org.json.JSONException e4) {
                android.util.Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        ((p009B2.C0033D) ((p009B2.C0067x) this.f219m).f219m).m120c(z4);
    }

    @Override // p119d2.InterfaceC1282a
    /* renamed from: f */
    public void mo107f(p119d2.C1290i c1290i) {
        boolean m3025b = c1290i.m3025b();
        p009B2.C0061r c0061r = (p009B2.C0061r) this.f219m;
        if (!m3025b) {
            ((p043K2.C0335k) c0061r.f188m).mo741a(p009B2.AbstractC0051h.m147f(3), p009B2.AbstractC0051h.m146e(3), null);
        }
        p104a2.C1006d c1006d = (p104a2.C1006d) c1290i.m3024a();
        if (c1006d == null) {
            ((p043K2.C0335k) c0061r.f188m).mo741a(p009B2.AbstractC0051h.m147f(3), p009B2.AbstractC0051h.m146e(3), null);
        } else {
            p104a2.C1008f c1008f = c1006d.f3730a.f3732m;
            ((p043K2.C0335k) c0061r.f188m).mo742b(java.lang.Boolean.valueOf((c1008f != null && c1008f.f3733l) || (c1008f != null && c1008f.f3734m)));
        }
    }

    @Override // p119d2.InterfaceC1283b
    /* renamed from: g */
    public void mo288g(java.lang.Exception exc) {
        android.util.Log.e("Geolocator", "Error trying to get last the last known GPS location");
        ((p017D1.C0173f) this.f219m).mo530c(2);
    }

    public /* synthetic */ C0067x(p107b0.C1166a c1166a, java.lang.Object obj, int i4) {
        this.f218l = i4;
        this.f219m = obj;
    }

    public /* synthetic */ C0067x(p107b0.C1166a c1166a, java.lang.Object obj, long j4) {
        this.f218l = 24;
        this.f219m = obj;
    }

    public /* synthetic */ C0067x(p107b0.C1166a c1166a, p179q0.C2019x c2019x, p166n0.C1891g c1891g, java.io.IOException iOException, boolean z4) {
        this.f218l = 23;
        this.f219m = c1891g;
    }
}
