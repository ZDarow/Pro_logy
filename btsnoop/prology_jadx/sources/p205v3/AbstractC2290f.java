package p205v3;

/* renamed from: v3.f */
/* loaded from: classes.dex */
public abstract class AbstractC2290f implements p205v3.InterfaceC2294j {

    /* renamed from: l */
    public final p110b3.InterfaceC1195i f9076l;

    /* renamed from: m */
    public final int f9077m;

    /* renamed from: n */
    public final int f9078n;

    public AbstractC2290f(p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        this.f9076l = interfaceC1195i;
        this.f9077m = i4;
        this.f9078n = i5;
    }

    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    public java.lang.Object mo266C(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1190d interfaceC1190d) {
        p205v3.C2288d c2288d = new p205v3.C2288d(interfaceC2251e, this, null);
        p209w3.C2358t c2358t = new p209w3.C2358t(interfaceC1190d, interfaceC1190d.mo2835f());
        java.lang.Object m4421e = p196u.AbstractC2213h.m4421e(c2358t, c2358t, c2288d);
        return m4421e == p115c3.EnumC1252a.f4880l ? m4421e : p100Z2.C0934g.f3298a;
    }

    /* renamed from: a */
    public abstract java.lang.Object mo4445a(p195t3.InterfaceC2202o interfaceC2202o, p110b3.InterfaceC1190d interfaceC1190d);

    /* renamed from: b */
    public abstract p205v3.AbstractC2290f mo4446b(p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5);

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        p110b3.C1196j c1196j = p110b3.C1196j.f4623l;
        p110b3.InterfaceC1195i interfaceC1195i = this.f9076l;
        if (interfaceC1195i != c1196j) {
            arrayList.add("context=" + interfaceC1195i);
        }
        int i4 = this.f9077m;
        if (i4 != -3) {
            arrayList.add("capacity=" + i4);
        }
        int i5 = this.f9078n;
        if (i5 != 1) {
            arrayList.add("onBufferOverflow=".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + p105a3.AbstractC1021d.m2051f0(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // p205v3.InterfaceC2294j
    /* renamed from: y */
    public final p200u3.InterfaceC2250d mo4450y(p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        p110b3.InterfaceC1195i interfaceC1195i2 = this.f9076l;
        p110b3.InterfaceC1195i mo676c = interfaceC1195i.mo676c(interfaceC1195i2);
        int i6 = this.f9078n;
        int i7 = this.f9077m;
        if (i5 == 1) {
            if (i7 != -3) {
                if (i4 != -3) {
                    if (i7 != -2) {
                        if (i4 != -2) {
                            i4 += i7;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i7;
            }
            i5 = i6;
        }
        return (p154k3.AbstractC1803h.m3775a(mo676c, interfaceC1195i2) && i4 == i7 && i5 == i6) ? this : mo4446b(mo676c, i4, i5);
    }
}
