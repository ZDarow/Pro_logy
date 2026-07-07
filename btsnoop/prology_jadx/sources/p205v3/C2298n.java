package p205v3;

/* renamed from: v3.n */
/* loaded from: classes.dex */
public final class C2298n extends p120d3.AbstractC1292b implements p200u3.InterfaceC2251e {

    /* renamed from: o */
    public final p200u3.InterfaceC2251e f9088o;

    /* renamed from: p */
    public final p110b3.InterfaceC1195i f9089p;

    /* renamed from: q */
    public final int f9090q;

    /* renamed from: r */
    public p110b3.InterfaceC1195i f9091r;

    /* renamed from: s */
    public p110b3.InterfaceC1190d f9092s;

    public C2298n(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1195i interfaceC1195i) {
        super(p205v3.C2295k.f9085l, p110b3.C1196j.f4623l);
        this.f9088o = interfaceC2251e;
        this.f9089p = interfaceC1195i;
        this.f9090q = ((java.lang.Number) interfaceC1195i.mo679k(0, p205v3.C2297m.f9087m)).intValue();
    }

    @Override // p200u3.InterfaceC2251e
    /* renamed from: a */
    public final java.lang.Object mo707a(java.lang.Object obj, p110b3.InterfaceC1190d interfaceC1190d) {
        try {
            java.lang.Object m4485p = m4485p(interfaceC1190d, obj);
            return m4485p == p115c3.EnumC1252a.f4880l ? m4485p : p100Z2.C0934g.f3298a;
        } catch (java.lang.Throwable th) {
            this.f9091r = new p205v3.C2293i(interfaceC1190d.mo2835f(), th);
            throw th;
        }
    }

    @Override // p120d3.AbstractC1292b, p120d3.InterfaceC1293c
    /* renamed from: d */
    public final p120d3.InterfaceC1293c mo3030d() {
        p110b3.InterfaceC1190d interfaceC1190d = this.f9092s;
        if (interfaceC1190d instanceof p120d3.InterfaceC1293c) {
            return (p120d3.InterfaceC1293c) interfaceC1190d;
        }
        return null;
    }

    @Override // p120d3.AbstractC1292b, p110b3.InterfaceC1190d
    /* renamed from: f */
    public final p110b3.InterfaceC1195i mo2835f() {
        p110b3.InterfaceC1195i interfaceC1195i = this.f9091r;
        return interfaceC1195i == null ? p110b3.C1196j.f4623l : interfaceC1195i;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: j */
    public final java.lang.StackTraceElement mo3031j() {
        return null;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        java.lang.Throwable m1761a = p100Z2.AbstractC0931d.m1761a(obj);
        if (m1761a != null) {
            this.f9091r = new p205v3.C2293i(mo2835f(), m1761a);
        }
        p110b3.InterfaceC1190d interfaceC1190d = this.f9092s;
        if (interfaceC1190d != null) {
            interfaceC1190d.mo2836i(obj);
        }
        return p115c3.EnumC1252a.f4880l;
    }

    /* renamed from: p */
    public final java.lang.Object m4485p(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        java.util.List list;
        java.lang.Comparable comparable;
        java.lang.String str;
        p110b3.InterfaceC1195i mo2835f = interfaceC1190d.mo2835f();
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) mo2835f.mo678j(p187r3.C2129t.f8496m);
        if (interfaceC2088P != null && !interfaceC2088P.mo4169a()) {
            throw ((p187r3.C2097Z) interfaceC2088P).m4185A();
        }
        p110b3.InterfaceC1195i interfaceC1195i = this.f9091r;
        if (interfaceC1195i != mo2835f) {
            int i4 = 0;
            if (interfaceC1195i instanceof p205v3.C2293i) {
                java.lang.String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p205v3.C2293i) interfaceC1195i).f9083l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                p154k3.AbstractC1803h.m3779e(str2, "<this>");
                p182q3.C2025b c2025b = new p182q3.C2025b(str2);
                if (c2025b.hasNext()) {
                    java.lang.Object next = c2025b.next();
                    if (c2025b.hasNext()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(next);
                        while (c2025b.hasNext()) {
                            arrayList.add(c2025b.next());
                        }
                        list = arrayList;
                    } else {
                        list = p176p1.AbstractC1949a.m3904E(next);
                    }
                } else {
                    list = p105a3.C1029l.f3755l;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!p182q3.AbstractC2032i.m4078l0((java.lang.String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    int length = str3.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            i5 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i5);
                        if (!java.lang.Character.isWhitespace(charAt) && !java.lang.Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 == -1) {
                        i5 = str3.length();
                    }
                    arrayList3.add(java.lang.Integer.valueOf(i5));
                }
                java.util.Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (java.lang.Comparable) it2.next();
                    while (it2.hasNext()) {
                        java.lang.Comparable comparable2 = (java.lang.Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                java.lang.Integer num = (java.lang.Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size = list.size() - 1;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        throw new java.lang.ArithmeticException("Index overflow has happened.");
                    }
                    java.lang.String str4 = (java.lang.String) obj3;
                    if ((i4 == 0 || i4 == size) && p182q3.AbstractC2032i.m4078l0(str4)) {
                        str = null;
                    } else {
                        p154k3.AbstractC1803h.m3779e(str4, "<this>");
                        if (intValue < 0) {
                            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        p154k3.AbstractC1803h.m3778d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i4 = i6;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
                p105a3.AbstractC1021d.m2050e0(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (((java.lang.Number) mo2835f.mo679k(0, new p205v3.C2301q(this))).intValue() != this.f9090q) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f9089p + ",\n\t\tbut emission happened in " + mo2835f + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f9091r = mo2835f;
        }
        this.f9092s = interfaceC1190d;
        p205v3.C2299o c2299o = p205v3.AbstractC2300p.f9094a;
        p200u3.InterfaceC2251e interfaceC2251e = this.f9088o;
        p154k3.AbstractC1803h.m3777c(interfaceC2251e, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        c2299o.getClass();
        java.lang.Object mo707a = interfaceC2251e.mo707a(obj, this);
        if (!p154k3.AbstractC1803h.m3775a(mo707a, p115c3.EnumC1252a.f4880l)) {
            this.f9092s = null;
        }
        return mo707a;
    }
}
