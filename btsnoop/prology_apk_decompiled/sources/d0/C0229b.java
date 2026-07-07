package d0;

import B2.AbstractC0007h;
import B2.D;
import I.C0044m;
import T.C0094o;
import T.C0095p;
import T.H;
import T.V;
import W.y;
import Y.C;
import a.AbstractC0110a;
import a0.Q;
import a0.m0;
import android.util.Pair;
import android.util.SparseArray;
import e0.C0249a;
import e0.C0251c;
import e0.C0254f;
import f2.G;
import f2.I;
import f2.c0;
import f2.r;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.C0480l;
import q0.C0488u;
import q0.InterfaceC0466C;
import q0.InterfaceC0467D;
import q0.Z;
import q0.a0;
import q0.b0;
import q0.k0;
import r0.C0505g;
import r0.C0506h;
import t0.C0560b;
import t0.s;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229b implements InterfaceC0467D, b0 {

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f4812I = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern J = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A, reason: collision with root package name */
    public final f0.e f4813A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0466C f4814B;

    /* renamed from: E, reason: collision with root package name */
    public C0480l f4817E;

    /* renamed from: F, reason: collision with root package name */
    public C0251c f4818F;

    /* renamed from: G, reason: collision with root package name */
    public int f4819G;

    /* renamed from: H, reason: collision with root package name */
    public List f4820H;

    /* renamed from: l, reason: collision with root package name */
    public final int f4821l;

    /* renamed from: m, reason: collision with root package name */
    public final P2.a f4822m;

    /* renamed from: n, reason: collision with root package name */
    public final C f4823n;

    /* renamed from: o, reason: collision with root package name */
    public final f0.i f4824o;

    /* renamed from: p, reason: collision with root package name */
    public final C0560b f4825p;

    /* renamed from: q, reason: collision with root package name */
    public final C0044m f4826q;

    /* renamed from: r, reason: collision with root package name */
    public final long f4827r;
    public final u0.o s;

    /* renamed from: t, reason: collision with root package name */
    public final u0.e f4828t;

    /* renamed from: u, reason: collision with root package name */
    public final k0 f4829u;

    /* renamed from: v, reason: collision with root package name */
    public final C0228a[] f4830v;
    public final L1.g w;

    /* renamed from: x, reason: collision with root package name */
    public final o f4831x;

    /* renamed from: z, reason: collision with root package name */
    public final f0.e f4833z;

    /* renamed from: C, reason: collision with root package name */
    public C0506h[] f4815C = new C0506h[0];

    /* renamed from: D, reason: collision with root package name */
    public l[] f4816D = new l[0];

    /* renamed from: y, reason: collision with root package name */
    public final IdentityHashMap f4832y = new IdentityHashMap();

    public C0229b(int i4, C0251c c0251c, C0044m c0044m, int i5, P2.a aVar, C c4, f0.i iVar, f0.e eVar, C0560b c0560b, f0.e eVar2, long j4, u0.o oVar, u0.e eVar3, L1.g gVar, d dVar, b0.l lVar) {
        int i6;
        int i7;
        int i8;
        C0095p[] c0095pArr;
        C0095p[] n4;
        C0254f a4;
        Integer num;
        f0.i iVar2 = iVar;
        this.f4821l = i4;
        this.f4818F = c0251c;
        this.f4826q = c0044m;
        this.f4819G = i5;
        this.f4822m = aVar;
        this.f4823n = c4;
        this.f4824o = iVar2;
        this.f4813A = eVar;
        this.f4825p = c0560b;
        this.f4833z = eVar2;
        this.f4827r = j4;
        this.s = oVar;
        this.f4828t = eVar3;
        this.w = gVar;
        this.f4831x = new o(c0251c, dVar, eVar3);
        int i9 = 0;
        gVar.getClass();
        G g4 = I.f5510m;
        c0 c0Var = c0.f5550p;
        this.f4817E = new C0480l(c0Var, c0Var);
        e0.h b4 = c0251c.b(i5);
        List list = b4.f5064d;
        this.f4820H = list;
        List list2 = b4.f5063c;
        int size = list2.size();
        HashMap hashMap = new HashMap(r.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            hashMap.put(Long.valueOf(((C0249a) list2.get(i10)).f5019a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        int i11 = 0;
        while (i11 < size) {
            C0249a c0249a = (C0249a) list2.get(i11);
            C0254f a5 = a("http://dashif.org/guidelines/trickmode", c0249a.f5023e);
            List list3 = c0249a.f5024f;
            a5 = a5 == null ? a("http://dashif.org/guidelines/trickmode", list3) : a5;
            int intValue = (a5 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(a5.f5055b)))) == null) ? i11 : num.intValue();
            if (intValue == i11 && (a4 = a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i12 = y.f2709a;
                String[] split = a4.f5055b.split(",", -1);
                int length = split.length;
                for (int i13 = i9; i13 < length; i13++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i13])));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i11) {
                List list4 = (List) sparseArray.get(i11);
                List list5 = (List) sparseArray.get(intValue);
                list5.addAll(list4);
                sparseArray.put(i11, list5);
                arrayList.remove(list4);
            }
            i11++;
            i9 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] X3 = AbstractC0110a.X((Collection) arrayList.get(i14));
            iArr[i14] = X3;
            Arrays.sort(X3);
        }
        boolean[] zArr = new boolean[size2];
        C0095p[][] c0095pArr2 = new C0095p[size2];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr2 = iArr[i15];
            int length2 = iArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    break;
                }
                List list6 = ((C0249a) list2.get(iArr2[i17])).f5021c;
                int[] iArr3 = iArr2;
                for (int i18 = 0; i18 < list6.size(); i18++) {
                    if (!((e0.m) list6.get(i18)).f5080o.isEmpty()) {
                        zArr[i15] = true;
                        i16++;
                        break;
                    }
                }
                i17++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i15];
            int length3 = iArr4.length;
            int i19 = 0;
            while (i19 < length3) {
                int i20 = iArr4[i19];
                C0249a c0249a2 = (C0249a) list2.get(i20);
                List list7 = ((C0249a) list2.get(i20)).f5022d;
                int[] iArr5 = iArr4;
                int i21 = length3;
                int i22 = 0;
                while (i22 < list7.size()) {
                    C0254f c0254f = (C0254f) list7.get(i22);
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c0254f.f5054a)) {
                        C0094o c0094o = new C0094o();
                        c0094o.f2290l = H.l("application/cea-608");
                        c0094o.f2279a = c0249a2.f5019a + ":cea608";
                        n4 = n(c0254f, f4812I, new C0095p(c0094o));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c0254f.f5054a)) {
                        C0094o c0094o2 = new C0094o();
                        c0094o2.f2290l = H.l("application/cea-708");
                        c0094o2.f2279a = c0249a2.f5019a + ":cea708";
                        n4 = n(c0254f, J, new C0095p(c0094o2));
                    } else {
                        i22++;
                        list7 = list8;
                    }
                    c0095pArr = n4;
                    i8 = 1;
                }
                i19++;
                iArr4 = iArr5;
                length3 = i21;
            }
            i8 = 1;
            c0095pArr = new C0095p[0];
            c0095pArr2[i15] = c0095pArr;
            if (c0095pArr.length != 0) {
                i16 += i8;
            }
            i15 += i8;
        }
        int size3 = list.size() + i16 + size2;
        V[] vArr = new V[size3];
        C0228a[] c0228aArr = new C0228a[size3];
        int i23 = 0;
        int i24 = 0;
        while (i23 < size2) {
            int[] iArr6 = iArr[i23];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i25 = size2;
            int i26 = 0;
            while (i26 < length4) {
                arrayList3.addAll(((C0249a) list2.get(iArr6[i26])).f5021c);
                i26++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            C0095p[] c0095pArr3 = new C0095p[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size4;
                C0095p c0095p = ((e0.m) arrayList3.get(i27)).f5077l;
                ArrayList arrayList4 = arrayList3;
                C0094o a6 = c0095p.a();
                a6.f2278I = iVar2.d(c0095p);
                c0095pArr3[i27] = new C0095p(a6);
                i27++;
                size4 = i28;
                arrayList3 = arrayList4;
            }
            C0249a c0249a3 = (C0249a) list2.get(iArr6[0]);
            long j5 = c0249a3.f5019a;
            String l4 = j5 != -1 ? Long.toString(j5) : AbstractC0007h.k("unset:", i23);
            int i29 = i24 + 1;
            if (zArr[i23]) {
                i6 = i29;
                i29 = i24 + 2;
            } else {
                i6 = -1;
            }
            if (c0095pArr2[i23].length != 0) {
                i7 = i29;
                i29++;
            } else {
                i7 = -1;
            }
            k(aVar, c0095pArr3);
            List list9 = list2;
            vArr[i24] = new V(l4, c0095pArr3);
            G g5 = I.f5510m;
            c0 c0Var2 = c0.f5550p;
            c0228aArr[i24] = new C0228a(c0249a3.f5020b, 0, iArr6, i24, i6, i7, -1, c0Var2);
            int i30 = i6;
            int i31 = -1;
            if (i30 != -1) {
                String str = l4 + ":emsg";
                C0094o c0094o3 = new C0094o();
                c0094o3.f2279a = str;
                c0094o3.f2290l = H.l("application/x-emsg");
                vArr[i30] = new V(str, new C0095p(c0094o3));
                c0228aArr[i30] = new C0228a(5, 1, iArr6, i24, -1, -1, -1, c0Var2);
                i31 = -1;
            }
            if (i7 != i31) {
                c0228aArr[i7] = new C0228a(3, 1, iArr6, i24, -1, -1, -1, I.k(c0095pArr2[i23]));
                k(aVar, c0095pArr2[i23]);
                vArr[i7] = new V(l4 + ":cc", c0095pArr2[i23]);
            }
            i23++;
            size2 = i25;
            iVar2 = iVar;
            iArr = iArr7;
            i24 = i29;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            e0.g gVar2 = (e0.g) list.get(i32);
            C0094o c0094o4 = new C0094o();
            c0094o4.f2279a = gVar2.a();
            c0094o4.f2290l = H.l("application/x-emsg");
            vArr[i24] = new V(gVar2.a() + ":" + i32, new C0095p(c0094o4));
            G g6 = I.f5510m;
            c0228aArr[i24] = new C0228a(5, 2, new int[0], -1, -1, -1, i32, c0.f5550p);
            i32++;
            i24++;
        }
        Pair create = Pair.create(new k0(vArr), c0228aArr);
        this.f4829u = (k0) create.first;
        this.f4830v = (C0228a[]) create.second;
    }

    public static C0254f a(String str, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0254f c0254f = (C0254f) list.get(i4);
            if (str.equals(c0254f.f5054a)) {
                return c0254f;
            }
        }
        return null;
    }

    public static void k(P2.a aVar, C0095p[] c0095pArr) {
        for (int i4 = 0; i4 < c0095pArr.length; i4++) {
            C0095p c0095p = c0095pArr[i4];
            D d4 = (D) aVar.f1502n;
            if (d4.f115a && ((L1.g) d4.f116b).o(c0095p)) {
                C0094o a4 = c0095p.a();
                a4.f2290l = H.l("application/x-media3-cues");
                a4.f2275F = ((L1.g) d4.f116b).e(c0095p);
                StringBuilder sb = new StringBuilder();
                sb.append(c0095p.f2325m);
                String str = c0095p.f2322j;
                sb.append(str != null ? " ".concat(str) : "");
                a4.f2287i = sb.toString();
                a4.f2295q = Long.MAX_VALUE;
                c0095p = new C0095p(a4);
            }
            c0095pArr[i4] = c0095p;
        }
    }

    public static C0095p[] n(C0254f c0254f, Pattern pattern, C0095p c0095p) {
        String str = c0254f.f5055b;
        if (str == null) {
            return new C0095p[]{c0095p};
        }
        int i4 = y.f2709a;
        String[] split = str.split(";", -1);
        C0095p[] c0095pArr = new C0095p[split.length];
        for (int i5 = 0; i5 < split.length; i5++) {
            Matcher matcher = pattern.matcher(split[i5]);
            if (!matcher.matches()) {
                return new C0095p[]{c0095p};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C0094o a4 = c0095p.a();
            a4.f2279a = c0095p.f2313a + ":" + parseInt;
            a4.f2274E = parseInt;
            a4.f2282d = matcher.group(2);
            c0095pArr[i5] = new C0095p(a4);
        }
        return c0095pArr;
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        for (C0506h c0506h : this.f4815C) {
            if (c0506h.f8041l == 2) {
                return c0506h.f8045p.b(j4, m0Var);
            }
        }
        return j4;
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f4817E.c();
    }

    public final int d(int[] iArr, int i4) {
        int i5 = iArr[i4];
        if (i5 == -1) {
            return -1;
        }
        C0228a[] c0228aArr = this.f4830v;
        int i6 = c0228aArr[i5].f4808e;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (i8 == i6 && c0228aArr[i8].f4806c == 0) {
                return i7;
            }
        }
        return -1;
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        return this.f4829u;
    }

    @Override // q0.b0
    public final void f(q0.c0 c0Var) {
        this.f4814B.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f4814B = interfaceC0466C;
        interfaceC0466C.o(this);
    }

    @Override // q0.c0
    public final long h() {
        return this.f4817E.h();
    }

    @Override // q0.c0
    public final boolean i(Q q4) {
        return this.f4817E.i(q4);
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        this.s.a();
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        for (C0506h c0506h : this.f4815C) {
            c0506h.C(j4);
        }
        for (l lVar : this.f4816D) {
            int b4 = y.b(lVar.f4905n, j4, true);
            lVar.f4909r = b4;
            lVar.s = (lVar.f4906o && b4 == lVar.f4905n.length) ? j4 : -9223372036854775807L;
        }
        return j4;
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        for (C0506h c0506h : this.f4815C) {
            c0506h.m(j4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q0.InterfaceC0467D
    public final long p(s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        int i4;
        boolean z4;
        int[] iArr;
        int i5;
        int i6;
        int[] iArr2;
        Object[] objArr;
        int i7;
        V v4;
        int i8;
        n nVar;
        boolean z5;
        s[] sVarArr2 = sVarArr;
        Object[] objArr2 = a0VarArr;
        int[] iArr3 = new int[sVarArr2.length];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i4 = -1;
            if (i10 >= sVarArr2.length) {
                break;
            }
            s sVar = sVarArr2[i10];
            if (sVar != null) {
                iArr3[i10] = this.f4829u.b(sVar.b());
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        for (int i11 = 0; i11 < sVarArr2.length; i11++) {
            if (sVarArr2[i11] == null || !zArr[i11]) {
                Object obj = objArr2[i11];
                if (obj instanceof C0506h) {
                    ((C0506h) obj).B(this);
                } else if (obj instanceof C0505g) {
                    ((C0505g) obj).c();
                }
                objArr2[i11] = null;
            }
        }
        int i12 = 0;
        while (true) {
            z4 = true;
            if (i12 >= sVarArr2.length) {
                break;
            }
            Object obj2 = objArr2[i12];
            if ((obj2 instanceof C0488u) || (obj2 instanceof C0505g)) {
                int d4 = d(iArr3, i12);
                if (d4 == -1) {
                    z5 = objArr2[i12] instanceof C0488u;
                } else {
                    Object obj3 = objArr2[i12];
                    z5 = (obj3 instanceof C0505g) && ((C0505g) obj3).f8028l == objArr2[d4];
                }
                if (!z5) {
                    Object obj4 = objArr2[i12];
                    if (obj4 instanceof C0505g) {
                        ((C0505g) obj4).c();
                    }
                    objArr2[i12] = null;
                }
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < sVarArr2.length) {
            s sVar2 = sVarArr2[i13];
            if (sVar2 == null) {
                i5 = i13;
                i6 = i9;
                iArr2 = iArr3;
                objArr = objArr2;
            } else {
                Object obj5 = objArr2[i13];
                if (obj5 == null) {
                    zArr2[i13] = z4;
                    C0228a c0228a = this.f4830v[iArr3[i13]];
                    int i14 = c0228a.f4806c;
                    if (i14 == 0) {
                        int i15 = c0228a.f4809f;
                        boolean z6 = i15 != i4 ? z4 ? 1 : 0 : i9;
                        if (z6 != 0) {
                            v4 = this.f4829u.a(i15);
                            i7 = z4 ? 1 : 0;
                        } else {
                            i7 = i9;
                            v4 = null;
                        }
                        int i16 = c0228a.f4810g;
                        c0 m4 = i16 != i4 ? this.f4830v[i16].f4811h : I.m();
                        int size = m4.size() + i7;
                        C0095p[] c0095pArr = new C0095p[size];
                        int[] iArr4 = new int[size];
                        if (z6 != 0) {
                            c0095pArr[i9] = v4.a(i9);
                            iArr4[i9] = 5;
                            i8 = z4 ? 1 : 0;
                        } else {
                            i8 = i9;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (i9 < m4.size()) {
                            C0095p c0095p = (C0095p) m4.get(i9);
                            c0095pArr[i8] = c0095p;
                            iArr4[i8] = 3;
                            arrayList.add(c0095p);
                            i8++;
                            i9++;
                        }
                        if (!this.f4818F.f5032d || z6 == 0) {
                            nVar = null;
                        } else {
                            o oVar = this.f4831x;
                            nVar = new n(oVar, oVar.f4917l);
                        }
                        P2.a aVar = this.f4822m;
                        u0.o oVar2 = this.s;
                        C0251c c0251c = this.f4818F;
                        i5 = i13;
                        C0044m c0044m = this.f4826q;
                        int[] iArr5 = iArr3;
                        int i17 = this.f4819G;
                        int[] iArr6 = c0228a.f4804a;
                        int i18 = c0228a.f4805b;
                        long j5 = this.f4827r;
                        C c4 = this.f4823n;
                        Y.h a4 = ((Y.g) aVar.f1501m).a();
                        if (c4 != null) {
                            a4.j(c4);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr5;
                        C0506h c0506h = new C0506h(c0228a.f4805b, iArr4, c0095pArr, new k((D) aVar.f1502n, oVar2, c0251c, c0044m, i17, iArr6, sVar2, i18, a4, j5, aVar.f1500l, z6, arrayList, nVar), this, this.f4828t, j4, this.f4824o, this.f4813A, this.f4825p, this.f4833z);
                        synchronized (this) {
                            this.f4832y.put(c0506h, nVar2);
                        }
                        objArr = a0VarArr;
                        objArr[i5] = c0506h;
                    } else {
                        i5 = i13;
                        iArr2 = iArr3;
                        objArr = objArr2;
                        if (i14 == 2) {
                            i6 = 0;
                            objArr[i5] = new l((e0.g) this.f4820H.get(c0228a.f4807d), sVar2.b().a(0), this.f4818F.f5032d);
                        }
                    }
                    i6 = 0;
                } else {
                    i5 = i13;
                    i6 = i9;
                    iArr2 = iArr3;
                    objArr = objArr2;
                    if (obj5 instanceof C0506h) {
                        ((k) ((C0506h) obj5).f8045p).f4898j = sVar2;
                    }
                }
            }
            i13 = i5 + 1;
            sVarArr2 = sVarArr;
            objArr2 = objArr;
            i9 = i6;
            iArr3 = iArr2;
            i4 = -1;
            z4 = true;
        }
        int i19 = i9;
        int[] iArr7 = iArr3;
        Object[] objArr3 = objArr2;
        while (i9 < sVarArr.length) {
            if (objArr3[i9] != null || sVarArr[i9] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C0228a c0228a2 = this.f4830v[iArr[i9]];
                if (c0228a2.f4806c == 1) {
                    int d5 = d(iArr, i9);
                    if (d5 == -1) {
                        objArr3[i9] = new Object();
                    } else {
                        C0506h c0506h2 = (C0506h) objArr3[d5];
                        int i20 = c0228a2.f4805b;
                        int i21 = 0;
                        while (true) {
                            Z[] zArr3 = c0506h2.f8052y;
                            if (i21 >= zArr3.length) {
                                throw new IllegalStateException();
                            }
                            if (c0506h2.f8042m[i21] == i20) {
                                boolean[] zArr4 = c0506h2.f8044o;
                                W.a.j(!zArr4[i21]);
                                zArr4[i21] = true;
                                zArr3[i21].B(j4, true);
                                objArr3[i9] = new C0505g(c0506h2, c0506h2, zArr3[i21], i21);
                                break;
                            }
                            i21++;
                        }
                    }
                }
            }
            i9++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = objArr3.length;
        for (int i22 = i19; i22 < length; i22++) {
            Object obj6 = objArr3[i22];
            if (obj6 instanceof C0506h) {
                arrayList2.add((C0506h) obj6);
            } else if (obj6 instanceof l) {
                arrayList3.add((l) obj6);
            }
        }
        C0506h[] c0506hArr = new C0506h[arrayList2.size()];
        this.f4815C = c0506hArr;
        arrayList2.toArray(c0506hArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.f4816D = lVarArr;
        arrayList3.toArray(lVarArr);
        L1.g gVar = this.w;
        AbstractList w = r.w(arrayList2, new b0.d(5));
        gVar.getClass();
        this.f4817E = new C0480l(arrayList2, w);
        return j4;
    }

    @Override // q0.c0
    public final long r() {
        return this.f4817E.r();
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void w(long j4) {
        this.f4817E.w(j4);
    }
}
