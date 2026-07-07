package I;

import C.C0016c;
import T.C0095p;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import e0.C0250b;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import q0.AbstractC0478j;
import q0.C0491x;
import w2.InterfaceC0608c;

/* renamed from: I.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044m implements V0.l, q0.J, f0.f, InterfaceC0608c {

    /* renamed from: l, reason: collision with root package name */
    public Object f847l;

    /* renamed from: m, reason: collision with root package name */
    public Object f848m;

    /* renamed from: n, reason: collision with root package name */
    public Object f849n;

    /* renamed from: o, reason: collision with root package name */
    public Object f850o;

    public /* synthetic */ C0044m(L2.f fVar, String str, Object obj, F1.g gVar) {
        this.f847l = fVar;
        this.f848m = str;
        this.f849n = obj;
        this.f850o = gVar;
    }

    public static void n(long j4, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j4) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hashMap.remove(arrayList.get(i4));
        }
    }

    @Override // q0.J
    public void D(int i4, q0.F f4, C0491x c0491x, n0.g gVar) {
        if (l(i4, f4)) {
            ((f0.e) this.f848m).g(c0491x, m(gVar, f4));
        }
    }

    @Override // q0.J
    public void H(int i4, q0.F f4, C0491x c0491x, n0.g gVar) {
        if (l(i4, f4)) {
            ((f0.e) this.f848m).d(c0491x, m(gVar, f4));
        }
    }

    @Override // q0.J
    public void L(int i4, q0.F f4, C0491x c0491x, n0.g gVar, IOException iOException, boolean z4) {
        if (l(i4, f4)) {
            ((f0.e) this.f848m).j(c0491x, m(gVar, f4), iOException, z4);
        }
    }

    @Override // w2.InterfaceC0608c
    public void a(String str, HashMap hashMap) {
        this.f848m = "sqlite_error";
        this.f849n = str;
        this.f850o = hashMap;
    }

    @Override // w2.InterfaceC0608c
    public void c(Serializable serializable) {
        this.f847l = serializable;
    }

    public ArrayList d(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f847l;
        n(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f848m;
        n(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0250b c0250b = (C0250b) list.get(i4);
            if (!hashMap.containsKey(c0250b.f5026b) && !hashMap2.containsKey(Integer.valueOf(c0250b.f5027c))) {
                arrayList.add(c0250b);
            }
        }
        return arrayList;
    }

    public SpannableString e() {
        if (((String) this.f847l) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f847l);
        ArrayList arrayList = (ArrayList) this.f848m;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.j jVar = (io.flutter.view.j) it.next();
                int b4 = L.j.b(jVar.f6533c);
                if (b4 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f6531a, jVar.f6532b, 0);
                } else if (b4 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.h) jVar).f6530d)), jVar.f6531a, jVar.f6532b, 0);
                }
            }
        }
        String str = (String) this.f850o;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f850o), 0, ((String) this.f847l).length(), 0);
        }
        String str2 = (String) this.f849n;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f849n)), 0, ((String) this.f847l).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(d3.b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof I.C0040i
            if (r0 == 0) goto L13
            r0 = r7
            I.i r0 = (I.C0040i) r0
            int r1 = r0.f828r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f828r = r1
            goto L18
        L13:
            I.i r0 = new I.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f826p
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f828r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            I.m r0 = r0.f825o
            p1.AbstractC0462a.P(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            I.m r0 = r0.f825o
            p1.AbstractC0462a.P(r7)
            goto L74
        L3a:
            p1.AbstractC0462a.P(r7)
            java.lang.Object r7 = r6.f849n
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f850o
            I.Q r2 = (I.Q) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            I.a0 r7 = r2.h()
            I.l r4 = new I.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f825o = r6
            r0.f828r = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            I.c r7 = (I.C0034c) r7
            goto L76
        L67:
            r0.f825o = r6
            r0.f828r = r4
            r7 = 0
            java.lang.Object r7 = I.Q.g(r2, r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            I.c r7 = (I.C0034c) r7
        L76:
            java.lang.Object r0 = r0.f850o
            I.Q r0 = (I.Q) r0
            B2.r r0 = r0.s
            r0.n(r7)
            Z2.g r7 = Z2.g.f3186a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0044m.f(d3.b):java.lang.Object");
    }

    @Override // q0.J
    public void g(int i4, q0.F f4, C0491x c0491x, n0.g gVar) {
        if (l(i4, f4)) {
            ((f0.e) this.f848m).l(c0491x, m(gVar, f4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r8.F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r9.reset();
        r6.E(r8.f2694a, r8.f2696c);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    @Override // V0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(byte[] r34, int r35, int r36, V0.k r37, W.c r38) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0044m.h(byte[], int, int, V0.k, W.c):void");
    }

    public File i(Context context) {
        ((F1.g) this.f848m).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void j(String str, Object obj, L2.p pVar) {
        ((L2.f) this.f847l).a((String) this.f848m, ((L2.q) this.f849n).a(new L2.n(obj, str)), pVar == null ? null : new L2.a(1, this, pVar));
    }

    public void k(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C0016c) this.f850o) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public boolean l(int i4, q0.F f4) {
        q0.F f5;
        AbstractC0478j abstractC0478j = (AbstractC0478j) this.f850o;
        Object obj = this.f847l;
        if (f4 != null) {
            f5 = abstractC0478j.v(obj, f4);
            if (f5 == null) {
                return false;
            }
        } else {
            f5 = null;
        }
        int y4 = abstractC0478j.y(i4, obj);
        f0.e eVar = (f0.e) this.f848m;
        if (eVar.f5454a != y4 || !W.y.a(eVar.f5455b, f5)) {
            this.f848m = new f0.e(abstractC0478j.f7810n.f5456c, y4, f5);
        }
        f0.e eVar2 = (f0.e) this.f849n;
        if (eVar2.f5454a == y4 && W.y.a(eVar2.f5455b, f5)) {
            return true;
        }
        this.f849n = new f0.e(abstractC0478j.f7811o.f5456c, y4, f5);
        return true;
    }

    public n0.g m(n0.g gVar, q0.F f4) {
        AbstractC0478j abstractC0478j = (AbstractC0478j) this.f850o;
        Object obj = this.f847l;
        long j4 = gVar.f7424o;
        long w = abstractC0478j.w(j4, obj);
        long j5 = gVar.f7425p;
        long w4 = abstractC0478j.w(j5, obj);
        if (w == j4 && w4 == j5) {
            return gVar;
        }
        return new n0.g(gVar.f7421l, gVar.f7422m, (C0095p) gVar.f7426q, gVar.f7423n, gVar.f7427r, w, w4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [z3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(d3.b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof I.V
            if (r0 == 0) goto L13
            r0 = r8
            I.V r0 = (I.V) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            I.V r0 = new I.V
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f789q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.s
            Z2.g r3 = Z2.g.f3186a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            z3.a r1 = r0.f788p
            I.m r0 = r0.f787o
            p1.AbstractC0462a.P(r8)     // Catch: java.lang.Throwable -> L31
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
            z3.a r2 = r0.f788p
            I.m r5 = r0.f787o
            p1.AbstractC0462a.P(r8)
            r8 = r2
            goto L66
        L44:
            p1.AbstractC0462a.P(r8)
            java.lang.Object r8 = r7.f848m
            r3.l r8 = (r3.C0525l) r8
            java.lang.Object r8 = r8.E()
            boolean r8 = r8 instanceof r3.L
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f787o = r7
            java.lang.Object r8 = r7.f847l
            z3.d r8 = (z3.d) r8
            r0.f788p = r8
            r0.s = r5
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f848m     // Catch: java.lang.Throwable -> L97
            r3.l r2 = (r3.C0525l) r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.E()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2 instanceof r3.L     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L78
            z3.d r8 = (z3.d) r8
            r8.e(r6)
            return r3
        L78:
            r0.f787o = r5     // Catch: java.lang.Throwable -> L97
            r0.f788p = r8     // Catch: java.lang.Throwable -> L97
            r0.s = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.f(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L85
            return r1
        L85:
            r1 = r8
            r0 = r5
        L87:
            java.lang.Object r8 = r0.f848m     // Catch: java.lang.Throwable -> L31
            r3.l r8 = (r3.C0525l) r8     // Catch: java.lang.Throwable -> L31
            r8.K(r3)     // Catch: java.lang.Throwable -> L31
            z3.d r1 = (z3.d) r1
            r1.e(r6)
            return r3
        L94:
            r1 = r8
            r8 = r0
            goto L99
        L97:
            r0 = move-exception
            goto L94
        L99:
            z3.d r1 = (z3.d) r1
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0044m.o(d3.b):java.lang.Object");
    }

    public C0250b p(List list) {
        ArrayList d4 = d(list);
        if (d4.size() < 2) {
            return (C0250b) f2.r.k(d4, null);
        }
        Collections.sort(d4, new W0.d(1));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = ((C0250b) d4.get(0)).f5027c;
        int i6 = 0;
        while (true) {
            if (i6 >= d4.size()) {
                break;
            }
            C0250b c0250b = (C0250b) d4.get(i6);
            if (i5 == c0250b.f5027c) {
                arrayList.add(new Pair(c0250b.f5026b, Integer.valueOf(c0250b.f5028d)));
                i6++;
            } else if (arrayList.size() == 1) {
                return (C0250b) d4.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.f849n;
        C0250b c0250b2 = (C0250b) hashMap.get(arrayList);
        if (c0250b2 == null) {
            List subList = d4.subList(0, arrayList.size());
            int i7 = 0;
            for (int i8 = 0; i8 < subList.size(); i8++) {
                i7 += ((C0250b) subList.get(i8)).f5028d;
            }
            int nextInt = ((Random) this.f850o).nextInt(i7);
            int i9 = 0;
            while (true) {
                if (i4 >= subList.size()) {
                    c0250b2 = (C0250b) f2.r.l(subList);
                    break;
                }
                C0250b c0250b3 = (C0250b) subList.get(i4);
                i9 += c0250b3.f5028d;
                if (nextInt < i9) {
                    c0250b2 = c0250b3;
                    break;
                }
                i4++;
            }
            hashMap.put(arrayList, c0250b2);
        }
        return c0250b2;
    }

    public void q(Serializable serializable, L2.c cVar) {
        ((L2.f) this.f847l).a((String) this.f848m, ((L2.m) this.f849n).b(serializable), cVar == null ? null : new L2.a(0, this, cVar));
    }

    public void r(L2.b bVar) {
        String str = (String) this.f848m;
        L2.f fVar = (L2.f) this.f847l;
        F1.g gVar = (F1.g) this.f850o;
        if (gVar != null) {
            fVar.f(str, bVar != null ? new B1.d(17, this, bVar) : null, gVar);
        } else {
            fVar.g(str, bVar != null ? new B1.d(17, this, bVar) : null);
        }
    }

    public void s(L2.o oVar) {
        String str = (String) this.f848m;
        L2.f fVar = (L2.f) this.f847l;
        F1.g gVar = (F1.g) this.f850o;
        if (gVar != null) {
            fVar.f(str, oVar != null ? new B1.d(18, this, oVar) : null, gVar);
        } else {
            fVar.g(str, oVar != null ? new B1.d(18, this, oVar) : null);
        }
    }

    @Override // V0.l
    public int w() {
        return 2;
    }

    @Override // q0.J
    public void x(int i4, q0.F f4, n0.g gVar) {
        if (l(i4, f4)) {
            ((f0.e) this.f848m).m(m(gVar, f4));
        }
    }

    @Override // q0.J
    public void z(int i4, q0.F f4, n0.g gVar) {
        if (l(i4, f4)) {
            ((f0.e) this.f848m).b(m(gVar, f4));
        }
    }

    public C0044m(int i4) {
        switch (i4) {
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f847l = new W.r();
                this.f848m = new W.r();
                this.f849n = new Y0.a();
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Random random = new Random();
                this.f849n = new HashMap();
                this.f850o = random;
                this.f847l = new HashMap();
                this.f848m = new HashMap();
                return;
            default:
                Object obj = new Object();
                L1.g gVar = new L1.g(5, false);
                this.f847l = new HashSet();
                this.f848m = obj;
                this.f849n = gVar;
                return;
        }
    }

    public C0044m(L2.f fVar, String str) {
        this(fVar, str, L2.v.f1099a, null);
    }
}
