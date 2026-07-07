package p179q0;

/* renamed from: q0.L */
/* loaded from: classes.dex */
public final class C1970L implements p179q0.InterfaceC1962D, p179q0.InterfaceC1961C {

    /* renamed from: l */
    public final p179q0.InterfaceC1962D[] f7974l;

    /* renamed from: m */
    public final java.util.IdentityHashMap f7975m;

    /* renamed from: n */
    public final p046L1.C0363g f7976n;

    /* renamed from: o */
    public final java.util.ArrayList f7977o = new java.util.ArrayList();

    /* renamed from: p */
    public final java.util.HashMap f7978p = new java.util.HashMap();

    /* renamed from: q */
    public p179q0.InterfaceC1961C f7979q;

    /* renamed from: r */
    public p179q0.C2005k0 f7980r;

    /* renamed from: s */
    public p179q0.InterfaceC1962D[] f7981s;

    /* renamed from: t */
    public p179q0.C2006l f7982t;

    public C1970L(p046L1.C0363g c0363g, long[] jArr, p179q0.InterfaceC1962D... interfaceC1962DArr) {
        this.f7976n = c0363g;
        this.f7974l = interfaceC1962DArr;
        c0363g.getClass();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        this.f7982t = new p179q0.C2006l(c1415c0, c1415c0);
        this.f7975m = new java.util.IdentityHashMap();
        this.f7981s = new p179q0.InterfaceC1962D[0];
        for (int i4 = 0; i4 < interfaceC1962DArr.length; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                this.f7974l[i4] = new p179q0.C2003j0(interfaceC1962DArr[i4], j4);
            }
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        p179q0.InterfaceC1962D[] interfaceC1962DArr = this.f7981s;
        return (interfaceC1962DArr.length > 0 ? interfaceC1962DArr[0] : this.f7974l[0]).mo2953b(j4, c0987m0);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f7982t.mo2954c();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        p179q0.C2005k0 c2005k0 = this.f7980r;
        c2005k0.getClass();
        return c2005k0;
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        p179q0.InterfaceC1961C interfaceC1961C = this.f7979q;
        interfaceC1961C.getClass();
        interfaceC1961C.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f7979q = interfaceC1961C;
        java.util.ArrayList arrayList = this.f7977o;
        p179q0.InterfaceC1962D[] interfaceC1962DArr = this.f7974l;
        java.util.Collections.addAll(arrayList, interfaceC1962DArr);
        for (p179q0.InterfaceC1962D interfaceC1962D : interfaceC1962DArr) {
            interfaceC1962D.mo2957g(this, j4);
        }
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        return this.f7982t.mo2958h();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        java.util.ArrayList arrayList = this.f7977o;
        if (arrayList.isEmpty()) {
            return this.f7982t.mo2959i(c0953q);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p179q0.InterfaceC1962D) arrayList.get(i4)).mo2959i(c0953q);
        }
        return false;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        for (p179q0.InterfaceC1962D interfaceC1962D : this.f7974l) {
            interfaceC1962D.mo2960j();
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        long mo2961l = this.f7981s[0].mo2961l(j4);
        int i4 = 1;
        while (true) {
            p179q0.InterfaceC1962D[] interfaceC1962DArr = this.f7981s;
            if (i4 >= interfaceC1962DArr.length) {
                return mo2961l;
            }
            if (interfaceC1962DArr[i4].mo2961l(mo2961l) != mo2961l) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
            i4++;
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        for (p179q0.InterfaceC1962D interfaceC1962D : this.f7981s) {
            interfaceC1962D.mo2962m(j4);
        }
    }

    @Override // p179q0.InterfaceC1961C
    /* renamed from: o */
    public final void mo1920o(p179q0.InterfaceC1962D interfaceC1962D) {
        java.util.ArrayList arrayList = this.f7977o;
        arrayList.remove(interfaceC1962D);
        if (arrayList.isEmpty()) {
            p179q0.InterfaceC1962D[] interfaceC1962DArr = this.f7974l;
            int i4 = 0;
            for (p179q0.InterfaceC1962D interfaceC1962D2 : interfaceC1962DArr) {
                i4 += interfaceC1962D2.mo2956e().f8184a;
            }
            p076T.C0678V[] c0678vArr = new p076T.C0678V[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < interfaceC1962DArr.length; i6++) {
                p179q0.C2005k0 mo2956e = interfaceC1962DArr[i6].mo2956e();
                int i7 = mo2956e.f8184a;
                int i8 = 0;
                while (i8 < i7) {
                    p076T.C0678V m4053a = mo2956e.m4053a(i8);
                    int i9 = m4053a.f2249a;
                    p076T.C0702p[] c0702pArr = new p076T.C0702p[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        p076T.C0702p c0702p = m4053a.f2252d[i10];
                        p076T.C0701o m1295a = c0702p.m1295a();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(i6);
                        sb.append(":");
                        java.lang.String str = c0702p.f2396a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        m1295a.f2359a = sb.toString();
                        c0702pArr[i10] = new p076T.C0702p(m1295a);
                    }
                    p076T.C0678V c0678v = new p076T.C0678V(i6 + ":" + m4053a.f2250b, c0702pArr);
                    this.f7978p.put(c0678v, m4053a);
                    c0678vArr[i5] = c0678v;
                    i8++;
                    i5++;
                }
            }
            this.f7980r = new p179q0.C2005k0(c0678vArr);
            p179q0.InterfaceC1961C interfaceC1961C = this.f7979q;
            interfaceC1961C.getClass();
            interfaceC1961C.mo1920o(this);
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        java.util.IdentityHashMap identityHashMap;
        java.util.ArrayList arrayList;
        int[] iArr = new int[interfaceC2181sArr.length];
        int[] iArr2 = new int[interfaceC2181sArr.length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int length = interfaceC2181sArr.length;
            identityHashMap = this.f7975m;
            if (i5 >= length) {
                break;
            }
            p179q0.InterfaceC1985a0 interfaceC1985a0 = interfaceC1985a0Arr[i5];
            java.lang.Integer num = interfaceC1985a0 == null ? null : (java.lang.Integer) identityHashMap.get(interfaceC1985a0);
            iArr[i5] = num == null ? -1 : num.intValue();
            p193t0.InterfaceC2181s interfaceC2181s = interfaceC2181sArr[i5];
            if (interfaceC2181s != null) {
                java.lang.String str = interfaceC2181s.mo3970b().f2250b;
                iArr2[i5] = java.lang.Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i5] = -1;
            }
            i5++;
        }
        identityHashMap.clear();
        int length2 = interfaceC2181sArr.length;
        p179q0.InterfaceC1985a0[] interfaceC1985a0Arr2 = new p179q0.InterfaceC1985a0[length2];
        p179q0.InterfaceC1985a0[] interfaceC1985a0Arr3 = new p179q0.InterfaceC1985a0[interfaceC2181sArr.length];
        p193t0.InterfaceC2181s[] interfaceC2181sArr2 = new p193t0.InterfaceC2181s[interfaceC2181sArr.length];
        p179q0.InterfaceC1962D[] interfaceC1962DArr = this.f7974l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(interfaceC1962DArr.length);
        long j5 = j4;
        int i6 = 0;
        while (i6 < interfaceC1962DArr.length) {
            int i7 = i4;
            while (i7 < interfaceC2181sArr.length) {
                interfaceC1985a0Arr3[i7] = iArr[i7] == i6 ? interfaceC1985a0Arr[i7] : null;
                if (iArr2[i7] == i6) {
                    p193t0.InterfaceC2181s interfaceC2181s2 = interfaceC2181sArr[i7];
                    interfaceC2181s2.getClass();
                    arrayList = arrayList2;
                    p076T.C0678V c0678v = (p076T.C0678V) this.f7978p.get(interfaceC2181s2.mo3970b());
                    c0678v.getClass();
                    interfaceC2181sArr2[i7] = new p179q0.C1969K(interfaceC2181s2, c0678v);
                } else {
                    arrayList = arrayList2;
                    interfaceC2181sArr2[i7] = null;
                }
                i7++;
                arrayList2 = arrayList;
            }
            java.util.ArrayList arrayList3 = arrayList2;
            int i8 = i6;
            p179q0.InterfaceC1962D[] interfaceC1962DArr2 = interfaceC1962DArr;
            p193t0.InterfaceC2181s[] interfaceC2181sArr3 = interfaceC2181sArr2;
            long mo2963p = interfaceC1962DArr[i6].mo2963p(interfaceC2181sArr2, zArr, interfaceC1985a0Arr3, zArr2, j5);
            if (i8 == 0) {
                j5 = mo2963p;
            } else if (mo2963p != j5) {
                throw new java.lang.IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i9 = 0; i9 < interfaceC2181sArr.length; i9++) {
                if (iArr2[i9] == i8) {
                    p179q0.InterfaceC1985a0 interfaceC1985a02 = interfaceC1985a0Arr3[i9];
                    interfaceC1985a02.getClass();
                    interfaceC1985a0Arr2[i9] = interfaceC1985a0Arr3[i9];
                    identityHashMap.put(interfaceC1985a02, java.lang.Integer.valueOf(i8));
                    z4 = true;
                } else if (iArr[i9] == i8) {
                    p086W.AbstractC0781a.m1421j(interfaceC1985a0Arr3[i9] == null);
                }
            }
            if (z4) {
                arrayList3.add(interfaceC1962DArr2[i8]);
            }
            i6 = i8 + 1;
            arrayList2 = arrayList3;
            interfaceC1962DArr = interfaceC1962DArr2;
            interfaceC2181sArr2 = interfaceC2181sArr3;
            i4 = 0;
        }
        int i10 = i4;
        java.util.ArrayList arrayList4 = arrayList2;
        java.lang.System.arraycopy(interfaceC1985a0Arr2, i10, interfaceC1985a0Arr, i10, length2);
        this.f7981s = (p179q0.InterfaceC1962D[]) arrayList4.toArray(new p179q0.InterfaceC1962D[i10]);
        java.util.AbstractList m3243w = p129f2.AbstractC1444r.m3243w(arrayList4, new p107b0.C1169d(17));
        this.f7976n.getClass();
        this.f7982t = new p179q0.C2006l(arrayList4, m3243w);
        return j5;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return this.f7982t.mo2964r();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        long j4 = -9223372036854775807L;
        for (p179q0.InterfaceC1962D interfaceC1962D : this.f7981s) {
            long mo2965u = interfaceC1962D.mo2965u();
            if (mo2965u != -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    for (p179q0.InterfaceC1962D interfaceC1962D2 : this.f7981s) {
                        if (interfaceC1962D2 == interfaceC1962D) {
                            break;
                        }
                        if (interfaceC1962D2.mo2961l(mo2965u) != mo2965u) {
                            throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j4 = mo2965u;
                } else if (mo2965u != j4) {
                    throw new java.lang.IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j4 != -9223372036854775807L && interfaceC1962D.mo2961l(j4) != j4) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        this.f7982t.mo2966w(j4);
    }
}
