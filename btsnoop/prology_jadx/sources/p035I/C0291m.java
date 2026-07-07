package p035I;

/* renamed from: I.m */
/* loaded from: classes.dex */
public final class C0291m implements p083V0.InterfaceC0774l, p179q0.InterfaceC1968J, p127f0.InterfaceC1373f, p208w2.InterfaceC2337c {

    /* renamed from: l */
    public java.lang.Object f876l;

    /* renamed from: m */
    public java.lang.Object f877m;

    /* renamed from: n */
    public java.lang.Object f878n;

    /* renamed from: o */
    public java.lang.Object f879o;

    public /* synthetic */ C0291m(p047L2.InterfaceC0376f interfaceC0376f, java.lang.String str, java.lang.Object obj, p025F1.C0215g c0215g) {
        this.f876l = interfaceC0376f;
        this.f877m = str;
        this.f878n = obj;
        this.f879o = c0215g;
    }

    /* renamed from: n */
    public static void m682n(long j4, java.util.HashMap hashMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (((java.lang.Long) entry.getValue()).longValue() <= j4) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hashMap.remove(arrayList.get(i4));
        }
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: D */
    public void mo683D(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        if (m696l(i4, c1964f)) {
            ((p127f0.C1372e) this.f877m).m3123g(c2019x, m697m(c1891g, c1964f));
        }
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: H */
    public void mo684H(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        if (m696l(i4, c1964f)) {
            ((p127f0.C1372e) this.f877m).m3120d(c2019x, m697m(c1891g, c1964f));
        }
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: L */
    public void mo685L(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g, java.io.IOException iOException, boolean z4) {
        if (m696l(i4, c1964f)) {
            ((p127f0.C1372e) this.f877m).m3126j(c2019x, m697m(c1891g, c1964f), iOException, z4);
        }
    }

    @Override // p208w2.InterfaceC2337c
    /* renamed from: a */
    public void mo686a(java.lang.String str, java.util.HashMap hashMap) {
        this.f877m = "sqlite_error";
        this.f878n = str;
        this.f879o = hashMap;
    }

    @Override // p208w2.InterfaceC2337c
    /* renamed from: c */
    public void mo687c(java.io.Serializable serializable) {
        this.f876l = serializable;
    }

    /* renamed from: d */
    public java.util.ArrayList m688d(java.util.List list) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashMap hashMap = (java.util.HashMap) this.f876l;
        m682n(elapsedRealtime, hashMap);
        java.util.HashMap hashMap2 = (java.util.HashMap) this.f877m;
        m682n(elapsedRealtime, hashMap2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            p122e0.C1301b c1301b = (p122e0.C1301b) list.get(i4);
            if (!hashMap.containsKey(c1301b.f5214b) && !hashMap2.containsKey(java.lang.Integer.valueOf(c1301b.f5215c))) {
                arrayList.add(c1301b);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public android.text.SpannableString m689e() {
        if (((java.lang.String) this.f876l) == null) {
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString((java.lang.String) this.f876l);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f877m;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.AbstractC1613j abstractC1613j = (io.flutter.view.AbstractC1613j) it.next();
                int m781b = p044L.AbstractC0352j.m781b(abstractC1613j.f6780c);
                if (m781b == 0) {
                    spannableString.setSpan(new android.text.style.TtsSpan.Builder("android.type.verbatim").build(), abstractC1613j.f6778a, abstractC1613j.f6779b, 0);
                } else if (m781b == 1) {
                    spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag(((io.flutter.view.C1611h) abstractC1613j).f6777d)), abstractC1613j.f6778a, abstractC1613j.f6779b, 0);
                }
            }
        }
        java.lang.String str = (java.lang.String) this.f879o;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new android.text.style.URLSpan((java.lang.String) this.f879o), 0, ((java.lang.String) this.f876l).length(), 0);
        }
        java.lang.String str2 = (java.lang.String) this.f878n;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag((java.lang.String) this.f878n)), 0, ((java.lang.String) this.f876l).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m690f(p120d3.AbstractC1292b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p035I.C0287i
            if (r0 == 0) goto L13
            r0 = r7
            I.i r0 = (p035I.C0287i) r0
            int r1 = r0.f854r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f854r = r1
            goto L18
        L13:
            I.i r0 = new I.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f852p
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f854r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            I.m r0 = r0.f851o
            p176p1.AbstractC1949a.m3913P(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            I.m r0 = r0.f851o
            p176p1.AbstractC1949a.m3913P(r7)
            goto L74
        L3a:
            p176p1.AbstractC1949a.m3913P(r7)
            java.lang.Object r7 = r6.f878n
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f879o
            I.Q r2 = (p035I.C0265Q) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            I.a0 r7 = r2.m669h()
            I.l r4 = new I.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f851o = r6
            r0.f854r = r3
            java.lang.Object r7 = r7.m674b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            I.c r7 = (p035I.C0278c) r7
            goto L76
        L67:
            r0.f851o = r6
            r0.f854r = r4
            r7 = 0
            java.lang.Object r7 = p035I.C0265Q.m666g(r2, r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            I.c r7 = (p035I.C0278c) r7
        L76:
            java.lang.Object r0 = r0.f879o
            I.Q r0 = (p035I.C0265Q) r0
            B2.r r0 = r0.f798s
            r0.m275n(r7)
            Z2.g r7 = p100Z2.C0934g.f3298a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0291m.m690f(d3.b):java.lang.Object");
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: g */
    public void mo691g(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        if (m696l(i4, c1964f)) {
            ((p127f0.C1372e) this.f877m).m3128l(c2019x, m697m(c1891g, c1964f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r8.m1536F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r9.reset();
        r6.m1535E(r8.f2786a, r8.f2788c);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo692h(byte[] r34, int r35, int r36, p083V0.C0773k r37, p086W.InterfaceC0783c r38) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0291m.mo692h(byte[], int, int, V0.k, W.c):void");
    }

    /* renamed from: i */
    public java.io.File m693i(android.content.Context context) {
        ((p025F1.C0215g) this.f877m).getClass();
        return new java.io.File(context.getDir("lib", 0), java.lang.System.mapLibraryName("flutter"));
    }

    /* renamed from: j */
    public void m694j(java.lang.String str, java.lang.Object obj, p047L2.InterfaceC0386p interfaceC0386p) {
        ((p047L2.InterfaceC0376f) this.f876l).mo267a((java.lang.String) this.f877m, ((p047L2.InterfaceC0387q) this.f878n).mo833a(new p047L2.C0384n(obj, str)), interfaceC0386p == null ? null : new p047L2.C0371a(1, this, interfaceC0386p));
    }

    /* renamed from: k */
    public void m695k(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, str, objArr);
        if (((p011C.C0111c) this.f879o) != null) {
            io.flutter.embedding.engine.FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* renamed from: l */
    public boolean m696l(int i4, p179q0.C1964F c1964f) {
        p179q0.C1964F c1964f2;
        p179q0.AbstractC2002j abstractC2002j = (p179q0.AbstractC2002j) this.f879o;
        java.lang.Object obj = this.f876l;
        if (c1964f != null) {
            c1964f2 = abstractC2002j.mo3986v(obj, c1964f);
            if (c1964f2 == null) {
                return false;
            }
        } else {
            c1964f2 = null;
        }
        int mo4051y = abstractC2002j.mo4051y(i4, obj);
        p127f0.C1372e c1372e = (p127f0.C1372e) this.f877m;
        if (c1372e.f5648a != mo4051y || !p086W.AbstractC0805y.m1606a(c1372e.f5649b, c1964f2)) {
            this.f877m = new p127f0.C1372e(abstractC2002j.f8113n.f5650c, mo4051y, c1964f2);
        }
        p127f0.C1372e c1372e2 = (p127f0.C1372e) this.f878n;
        if (c1372e2.f5648a == mo4051y && p086W.AbstractC0805y.m1606a(c1372e2.f5649b, c1964f2)) {
            return true;
        }
        this.f878n = new p127f0.C1372e(abstractC2002j.f8114o.f5650c, mo4051y, c1964f2);
        return true;
    }

    /* renamed from: m */
    public p166n0.C1891g m697m(p166n0.C1891g c1891g, p179q0.C1964F c1964f) {
        p179q0.AbstractC2002j abstractC2002j = (p179q0.AbstractC2002j) this.f879o;
        java.lang.Object obj = this.f876l;
        long j4 = c1891g.f7709o;
        long mo4050w = abstractC2002j.mo4050w(j4, obj);
        long j5 = c1891g.f7710p;
        long mo4050w2 = abstractC2002j.mo4050w(j5, obj);
        if (mo4050w == j4 && mo4050w2 == j5) {
            return c1891g;
        }
        return new p166n0.C1891g(c1891g.f7706l, c1891g.f7707m, (p076T.C0702p) c1891g.f7711q, c1891g.f7708n, c1891g.f7712r, mo4050w, mo4050w2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [z3.a] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m698o(p120d3.AbstractC1292b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p035I.C0269V
            if (r0 == 0) goto L13
            r0 = r8
            I.V r0 = (p035I.C0269V) r0
            int r1 = r0.f813s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f813s = r1
            goto L18
        L13:
            I.V r0 = new I.V
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f811q
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f813s
            Z2.g r3 = p100Z2.C0934g.f3298a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            z3.a r1 = r0.f810p
            I.m r0 = r0.f809o
            p176p1.AbstractC1949a.m3913P(r8)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            z3.a r2 = r0.f810p
            I.m r5 = r0.f809o
            p176p1.AbstractC1949a.m3913P(r8)
            r8 = r2
            goto L66
        L44:
            p176p1.AbstractC1949a.m3913P(r8)
            java.lang.Object r8 = r7.f877m
            r3.l r8 = (p187r3.C2120l) r8
            java.lang.Object r8 = r8.m4187E()
            boolean r8 = r8 instanceof p187r3.InterfaceC2084L
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f809o = r7
            java.lang.Object r8 = r7.f876l
            z3.d r8 = (p222z3.C2445d) r8
            r0.f810p = r8
            r0.f813s = r5
            java.lang.Object r2 = r8.m4681c(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f877m     // Catch: java.lang.Throwable -> L97
            r3.l r2 = (p187r3.C2120l) r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.m4187E()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2 instanceof p187r3.InterfaceC2084L     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L78
            z3.d r8 = (p222z3.C2445d) r8
            r8.m4683e(r6)
            return r3
        L78:
            r0.f809o = r5     // Catch: java.lang.Throwable -> L97
            r0.f810p = r8     // Catch: java.lang.Throwable -> L97
            r0.f813s = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.m690f(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L85
            return r1
        L85:
            r1 = r8
            r0 = r5
        L87:
            java.lang.Object r8 = r0.f877m     // Catch: java.lang.Throwable -> L31
            r3.l r8 = (p187r3.C2120l) r8     // Catch: java.lang.Throwable -> L31
            r8.m4193K(r3)     // Catch: java.lang.Throwable -> L31
            z3.d r1 = (p222z3.C2445d) r1
            r1.m4683e(r6)
            return r3
        L94:
            r1 = r8
            r8 = r0
            goto L99
        L97:
            r0 = move-exception
            goto L94
        L99:
            z3.d r1 = (p222z3.C2445d) r1
            r1.m4683e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0291m.m698o(d3.b):java.lang.Object");
    }

    /* renamed from: p */
    public p122e0.C1301b m699p(java.util.List list) {
        java.util.ArrayList m688d = m688d(list);
        if (m688d.size() < 2) {
            return (p122e0.C1301b) p129f2.AbstractC1444r.m3231k(m688d, null);
        }
        java.util.Collections.sort(m688d, new p087W0.C0809d(1));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = 0;
        int i5 = ((p122e0.C1301b) m688d.get(0)).f5215c;
        int i6 = 0;
        while (true) {
            if (i6 >= m688d.size()) {
                break;
            }
            p122e0.C1301b c1301b = (p122e0.C1301b) m688d.get(i6);
            if (i5 == c1301b.f5215c) {
                arrayList.add(new android.util.Pair(c1301b.f5214b, java.lang.Integer.valueOf(c1301b.f5216d)));
                i6++;
            } else if (arrayList.size() == 1) {
                return (p122e0.C1301b) m688d.get(0);
            }
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f878n;
        p122e0.C1301b c1301b2 = (p122e0.C1301b) hashMap.get(arrayList);
        if (c1301b2 == null) {
            java.util.List subList = m688d.subList(0, arrayList.size());
            int i7 = 0;
            for (int i8 = 0; i8 < subList.size(); i8++) {
                i7 += ((p122e0.C1301b) subList.get(i8)).f5216d;
            }
            int nextInt = ((java.util.Random) this.f879o).nextInt(i7);
            int i9 = 0;
            while (true) {
                if (i4 >= subList.size()) {
                    c1301b2 = (p122e0.C1301b) p129f2.AbstractC1444r.m3232l(subList);
                    break;
                }
                p122e0.C1301b c1301b3 = (p122e0.C1301b) subList.get(i4);
                i9 += c1301b3.f5216d;
                if (nextInt < i9) {
                    c1301b2 = c1301b3;
                    break;
                }
                i4++;
            }
            hashMap.put(arrayList, c1301b2);
        }
        return c1301b2;
    }

    /* renamed from: q */
    public void m700q(java.io.Serializable serializable, p047L2.InterfaceC0373c interfaceC0373c) {
        ((p047L2.InterfaceC0376f) this.f876l).mo267a((java.lang.String) this.f877m, ((p047L2.InterfaceC0383m) this.f878n).mo832b(serializable), interfaceC0373c == null ? null : new p047L2.C0371a(0, this, interfaceC0373c));
    }

    /* renamed from: r */
    public void m701r(p047L2.InterfaceC0372b interfaceC0372b) {
        java.lang.String str = (java.lang.String) this.f877m;
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) this.f876l;
        p025F1.C0215g c0215g = (p025F1.C0215g) this.f879o;
        if (c0215g != null) {
            interfaceC0376f.mo271f(str, interfaceC0372b != null ? new p008B1.C0026d(17, this, interfaceC0372b) : null, c0215g);
        } else {
            interfaceC0376f.mo272g(str, interfaceC0372b != null ? new p008B1.C0026d(17, this, interfaceC0372b) : null);
        }
    }

    /* renamed from: s */
    public void m702s(p047L2.InterfaceC0385o interfaceC0385o) {
        java.lang.String str = (java.lang.String) this.f877m;
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) this.f876l;
        p025F1.C0215g c0215g = (p025F1.C0215g) this.f879o;
        if (c0215g != null) {
            interfaceC0376f.mo271f(str, interfaceC0385o != null ? new p008B1.C0026d(18, this, interfaceC0385o) : null, c0215g);
        } else {
            interfaceC0376f.mo272g(str, interfaceC0385o != null ? new p008B1.C0026d(18, this, interfaceC0385o) : null);
        }
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public int mo703w() {
        return 2;
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: x */
    public void mo704x(int i4, p179q0.C1964F c1964f, p166n0.C1891g c1891g) {
        if (m696l(i4, c1964f)) {
            ((p127f0.C1372e) this.f877m).m3129m(m697m(c1891g, c1964f));
        }
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: z */
    public void mo705z(int i4, p179q0.C1964F c1964f, p166n0.C1891g c1891g) {
        if (m696l(i4, c1964f)) {
            ((p127f0.C1372e) this.f877m).m3118b(m697m(c1891g, c1964f));
        }
    }

    public C0291m(int i4) {
        switch (i4) {
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f876l = new p086W.C0798r();
                this.f877m = new p086W.C0798r();
                this.f878n = new p095Y0.C0889a();
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.Random random = new java.util.Random();
                this.f878n = new java.util.HashMap();
                this.f879o = random;
                this.f876l = new java.util.HashMap();
                this.f877m = new java.util.HashMap();
                return;
            default:
                java.lang.Object obj = new java.lang.Object();
                p046L1.C0363g c0363g = new p046L1.C0363g(5, false);
                this.f876l = new java.util.HashSet();
                this.f877m = obj;
                this.f878n = c0363g;
                return;
        }
    }

    public C0291m(p047L2.InterfaceC0376f interfaceC0376f, java.lang.String str) {
        this(interfaceC0376f, str, p047L2.C0392v.f1138a, null);
    }
}
