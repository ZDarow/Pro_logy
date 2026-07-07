package p179q0;

/* renamed from: q0.M */
/* loaded from: classes.dex */
public final class C1971M extends p179q0.AbstractC2002j {

    /* renamed from: C */
    public static final p076T.C0659B f7983C;

    /* renamed from: A */
    public long[][] f7984A;

    /* renamed from: B */
    public androidx.datastore.preferences.protobuf.C1113k f7985B;

    /* renamed from: v */
    public final p179q0.AbstractC1984a[] f7986v;

    /* renamed from: w */
    public final p076T.AbstractC0677U[] f7987w;

    /* renamed from: x */
    public final java.util.ArrayList f7988x;

    /* renamed from: y */
    public final p046L1.C0363g f7989y;

    /* renamed from: z */
    public int f7990z;

    /* JADX WARN: Type inference failed for: r4v0, types: [T.u, T.v] */
    static {
        p076T.C0706t c0706t = new p076T.C0706t();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        java.util.Collections.emptyList();
        p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
        p076T.C0709w c0709w = new p076T.C0709w();
        f7983C = new p076T.C0659B("MergingMediaSource", new p076T.C0707u(c0706t), null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, p076T.C0712z.f2455a);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, f2.r] */
    public C1971M(p179q0.AbstractC1984a... abstractC1984aArr) {
        p046L1.C0363g c0363g = new p046L1.C0363g(29, false);
        this.f7986v = abstractC1984aArr;
        this.f7989y = c0363g;
        this.f7988x = new java.util.ArrayList(java.util.Arrays.asList(abstractC1984aArr));
        this.f7990z = -1;
        this.f7987w = new p076T.AbstractC0677U[abstractC1984aArr.length];
        this.f7984A = new long[0];
        new java.util.HashMap();
        p129f2.AbstractC1444r.m3226e("expectedKeys", 8);
        new java.lang.Object().m3244a().m3200u();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p179q0.AbstractC1984a[] abstractC1984aArr = this.f7986v;
        int length = abstractC1984aArr.length;
        p179q0.InterfaceC1962D[] interfaceC1962DArr = new p179q0.InterfaceC1962D[length];
        p076T.AbstractC0677U[] abstractC0677UArr = this.f7987w;
        int mo1231b = abstractC0677UArr[0].mo1231b(c1964f.f7960a);
        for (int i4 = 0; i4 < length; i4++) {
            interfaceC1962DArr[i4] = abstractC1984aArr[i4].mo2975b(c1964f.m3967a(abstractC0677UArr[i4].mo1234l(mo1231b)), c2218e, j4 - this.f7984A[mo1231b][i4]);
        }
        return new p179q0.C1970L(this.f7989y, this.f7984A[mo1231b], interfaceC1962DArr);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final p076T.C0659B mo2976h() {
        p179q0.AbstractC1984a[] abstractC1984aArr = this.f7986v;
        return abstractC1984aArr.length > 0 ? abstractC1984aArr[0].mo2976h() : f7983C;
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
        androidx.datastore.preferences.protobuf.C1113k c1113k = this.f7985B;
        if (c1113k != null) {
            throw c1113k;
        }
        super.mo2977j();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        this.f8177u = interfaceC0860C;
        this.f8176t = p086W.AbstractC0805y.m1619n(null);
        int i4 = 0;
        while (true) {
            p179q0.AbstractC1984a[] abstractC1984aArr = this.f7986v;
            if (i4 >= abstractC1984aArr.length) {
                return;
            }
            m4049A(java.lang.Integer.valueOf(i4), abstractC1984aArr[i4]);
            i4++;
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p179q0.C1970L c1970l = (p179q0.C1970L) interfaceC1962D;
        int i4 = 0;
        while (true) {
            p179q0.AbstractC1984a[] abstractC1984aArr = this.f7986v;
            if (i4 >= abstractC1984aArr.length) {
                return;
            }
            p179q0.AbstractC1984a abstractC1984a = abstractC1984aArr[i4];
            p179q0.InterfaceC1962D interfaceC1962D2 = c1970l.f7974l[i4];
            if (interfaceC1962D2 instanceof p179q0.C2003j0) {
                interfaceC1962D2 = ((p179q0.C2003j0) interfaceC1962D2).f8178l;
            }
            abstractC1984a.mo2979o(interfaceC1962D2);
            i4++;
        }
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        super.mo2980r();
        java.util.Arrays.fill(this.f7987w, (java.lang.Object) null);
        this.f7990z = -1;
        this.f7985B = null;
        java.util.ArrayList arrayList = this.f7988x;
        arrayList.clear();
        java.util.Collections.addAll(arrayList, this.f7986v);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final void mo2981u(p076T.C0659B c0659b) {
        this.f7986v[0].mo2981u(c0659b);
    }

    @Override // p179q0.AbstractC2002j
    /* renamed from: v */
    public final p179q0.C1964F mo3986v(java.lang.Object obj, p179q0.C1964F c1964f) {
        if (((java.lang.Integer) obj).intValue() == 0) {
            return c1964f;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    @Override // p179q0.AbstractC2002j
    /* renamed from: z */
    public final void mo3987z(java.lang.Object obj, p179q0.AbstractC1984a abstractC1984a, p076T.AbstractC0677U abstractC0677U) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f7985B != null) {
            return;
        }
        if (this.f7990z == -1) {
            this.f7990z = abstractC0677U.mo1233h();
        } else if (abstractC0677U.mo1233h() != this.f7990z) {
            this.f7985B = new java.io.IOException();
            return;
        }
        int length = this.f7984A.length;
        p076T.AbstractC0677U[] abstractC0677UArr = this.f7987w;
        if (length == 0) {
            this.f7984A = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, this.f7990z, abstractC0677UArr.length);
        }
        java.util.ArrayList arrayList = this.f7988x;
        arrayList.remove(abstractC1984a);
        abstractC0677UArr[num.intValue()] = abstractC0677U;
        if (arrayList.isEmpty()) {
            m4039n(abstractC0677UArr[0]);
        }
    }
}
