package W;

import T.C0095p;
import T.S;
import T.U;
import T.d0;
import a0.C0114D;
import a0.C0117G;
import a0.C0118H;
import a0.C0126f;
import a0.C0133m;
import a0.K;
import a0.N;
import a0.SurfaceHolderCallbackC0115E;
import a0.f0;
import a0.i0;
import a0.k0;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.preferences.protobuf.C0159k;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b0.C0177a;
import c0.C0215n;
import c0.M;
import c0.RunnableC0214m;
import f2.C0278F;
import f2.I;
import f2.J;
import f2.Y;
import f2.c0;
import f2.r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.AbstractC0417F;
import m0.C0412A;
import m0.C0413B;
import m0.C0414C;
import m0.C0432m;
import m0.C0433n;
import m0.z;
import q0.F;
import q0.T;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2677l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2678m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2679n;

    public /* synthetic */ m(int i4, Object obj, Object obj2) {
        this.f2677l = i4;
        this.f2678m = obj;
        this.f2679n = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v51, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.io.IOException] */
    @Override // java.lang.Runnable
    public final void run() {
        long j4;
        boolean z4;
        boolean z5;
        String str;
        c0 m4;
        Y y4;
        long j5 = -9223372036854775807L;
        boolean z6 = false;
        boolean z7 = true;
        z7 = true;
        switch (this.f2677l) {
            case 0:
                ((u0.f) this.f2679n).a(((p) this.f2678m).d());
                return;
            case 1:
                L2.h hVar = ((X2.j) this.f2678m).f2944d;
                if (hVar != null) {
                    hVar.c((byte[]) this.f2679n);
                    return;
                }
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0118H c0118h = (C0118H) this.f2678m;
                K k4 = (K) this.f2679n;
                int i4 = c0118h.f3213E - k4.f3269a;
                c0118h.f3213E = i4;
                if (k4.f3271c) {
                    c0118h.f3214F = k4.f3272d;
                    c0118h.f3215G = true;
                }
                if (i4 == 0) {
                    U u4 = ((f0) k4.f3273e).f3459a;
                    if (!c0118h.f3242e0.f3459a.p() && u4.p()) {
                        c0118h.f3244f0 = -1;
                        c0118h.f3246g0 = 0L;
                    }
                    if (!u4.p()) {
                        List asList = Arrays.asList(((k0) u4).f3534i);
                        a.j(asList.size() == c0118h.f3254o.size());
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((C0117G) c0118h.f3254o.get(i5)).f3208b = (U) asList.get(i5);
                        }
                    }
                    if (c0118h.f3215G) {
                        if (((f0) k4.f3273e).f3460b.equals(c0118h.f3242e0.f3460b) && ((f0) k4.f3273e).f3462d == c0118h.f3242e0.s) {
                            z7 = false;
                        }
                        if (z7) {
                            if (u4.p() || ((f0) k4.f3273e).f3460b.b()) {
                                j5 = ((f0) k4.f3273e).f3462d;
                            } else {
                                f0 f0Var = (f0) k4.f3273e;
                                F f4 = f0Var.f3460b;
                                long j6 = f0Var.f3462d;
                                Object obj = f4.f7668a;
                                S s = c0118h.f3253n;
                                u4.g(obj, s);
                                j5 = j6 + s.f2147e;
                            }
                        }
                        j4 = j5;
                        z5 = z7;
                        z4 = false;
                    } else {
                        j4 = -9223372036854775807L;
                        z4 = false;
                        z5 = false;
                    }
                    c0118h.f3215G = z4;
                    c0118h.S((f0) k4.f3273e, 1, z5, c0118h.f3214F, j4, -1, false);
                    return;
                }
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                i0 i0Var = (i0) this.f2679n;
                ((N) this.f2678m).getClass();
                try {
                    synchronized (i0Var) {
                    }
                    try {
                        i0Var.f3503a.d(i0Var.f3506d, i0Var.f3507e);
                        return;
                    } finally {
                        i0Var.b(true);
                    }
                } catch (C0133m e4) {
                    a.o("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
                    throw new RuntimeException(e4);
                }
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                C0215n c0215n = (C0215n) this.f2678m;
                C0126f c0126f = (C0126f) this.f2679n;
                c0215n.getClass();
                synchronized (c0126f) {
                }
                SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = c0215n.f4632b;
                int i6 = y.f2709a;
                b0.e eVar = surfaceHolderCallbackC0115E.f3204a.f3257r;
                eVar.K(eVar.G((F) eVar.f4344o.f371e), 1013, new b0.c(9));
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                c0.K k5 = (c0.K) this.f2679n;
                C0215n c0215n2 = ((M) ((K2.o) this.f2678m).f1009m).f4560Q0;
                Handler handler = c0215n2.f4631a;
                if (handler != null) {
                    handler.post(new RunnableC0214m(c0215n2, k5, 2));
                    return;
                }
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((h0.b) ((g0.l) ((g0.r) this.f2678m).f5784n.f5535m).f5711m.f5867o.get(((g0.k) this.f2679n).f5699x)).c(true);
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                h0.b bVar = (h0.b) this.f2678m;
                bVar.f5860t = false;
                bVar.d((Uri) this.f2679n);
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                ((ProfileInstallerInitializer) this.f2678m).getClass();
                (Build.VERSION.SDK_INT >= 28 ? i1.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i1.e((Context) this.f2679n, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 9:
                Y.x xVar = (Y.x) this.f2678m;
                I i7 = (I) this.f2679n;
                C0432m c0432m = (C0432m) xVar.f3066n;
                c0432m.getClass();
                Pattern pattern = z.f7321a;
                if (!z.f7322b.matcher((CharSequence) i7.get(0)).matches()) {
                    Matcher matcher = z.f7321a.matcher((CharSequence) i7.get(0));
                    a.e(matcher.matches());
                    String group = matcher.group(1);
                    group.getClass();
                    z.a(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    Uri.parse(group2);
                    int indexOf = i7.indexOf("");
                    a.e(indexOf > 0);
                    List subList = i7.subList(1, indexOf);
                    Y y5 = new Y(15);
                    y5.t(subList);
                    C0433n v4 = y5.v();
                    new e2.f(z.f7328h).b(i7.subList(indexOf + 1, i7.size()));
                    String c4 = v4.c("CSeq");
                    c4.getClass();
                    int parseInt = Integer.parseInt(c4);
                    P2.a aVar = c0432m.f7256r;
                    C0432m c0432m2 = (C0432m) aVar.f1502n;
                    P2.a aVar2 = new P2.a(405, new Y(parseInt, c0432m2.f7252n, c0432m2.f7259v).v(), "");
                    C0433n c0433n = (C0433n) aVar2.f1501m;
                    a.e(c0433n.c("CSeq") != null);
                    C0278F c0278f = new C0278F();
                    int i8 = aVar2.f1500l;
                    Integer valueOf = Integer.valueOf(i8);
                    if (i8 == 200) {
                        str = "OK";
                    } else if (i8 == 461) {
                        str = "Unsupported Transport";
                    } else if (i8 == 500) {
                        str = "Internal Server Error";
                    } else if (i8 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i8 == 301) {
                        str = "Move Permanently";
                    } else if (i8 == 302) {
                        str = "Move Temporarily";
                    } else if (i8 == 400) {
                        str = "Bad Request";
                    } else if (i8 == 401) {
                        str = "Unauthorized";
                    } else if (i8 == 404) {
                        str = "Not Found";
                    } else if (i8 != 405) {
                        switch (i8) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    c0278f.c(y.o("%s %s %s", "RTSP/1.0", valueOf, str));
                    J a4 = c0433n.a();
                    r0 it = a4.e().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        I d4 = a4.d(str2);
                        for (int i9 = 0; i9 < d4.size(); i9++) {
                            c0278f.c(y.o("%s: %s", str2, d4.get(i9)));
                        }
                    }
                    c0278f.c("");
                    c0278f.c((String) aVar2.f1502n);
                    c0432m2.f7257t.b(c0278f.g());
                    aVar.f1500l = Math.max(aVar.f1500l, parseInt + 1);
                    return;
                }
                Matcher matcher2 = z.f7322b.matcher((CharSequence) i7.get(0));
                a.e(matcher2.matches());
                String group3 = matcher2.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3);
                int indexOf2 = i7.indexOf("");
                a.e(indexOf2 > 0);
                List subList2 = i7.subList(1, indexOf2);
                Y y6 = new Y(15);
                y6.t(subList2);
                P2.a aVar3 = new P2.a(parseInt2, new C0433n(y6), new e2.f(z.f7328h).b(i7.subList(indexOf2 + 1, i7.size())));
                C0433n c0433n2 = (C0433n) aVar3.f1501m;
                String c5 = c0433n2.c("CSeq");
                a.h(c5);
                int parseInt3 = Integer.parseInt(c5);
                C0412A c0412a = (C0412A) C0432m.e(c0432m).get(parseInt3);
                if (c0412a == null) {
                    return;
                }
                C0432m.e(c0432m).remove(parseInt3);
                int i10 = aVar3.f1500l;
                int i11 = c0412a.f7133b;
                try {
                    try {
                        if (i10 == 200) {
                            switch (i11) {
                                case 1:
                                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 11:
                                case 12:
                                    return;
                                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                    xVar.U(new Y.x(22, c0433n2, AbstractC0417F.a((String) aVar3.f1502n)));
                                    return;
                                case L.k.LONG_FIELD_NUMBER /* 4 */:
                                    xVar.V(new Y(z.b(c0433n2.c("Public"))));
                                    return;
                                case L.k.STRING_FIELD_NUMBER /* 5 */:
                                    xVar.W();
                                    return;
                                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                    String c6 = c0433n2.c("Range");
                                    C0413B a5 = c6 == null ? C0413B.f7136c : C0413B.a(c6);
                                    try {
                                        String c7 = c0433n2.c("RTP-Info");
                                        m4 = c7 == null ? I.m() : C0414C.a(c7, C0432m.b(c0432m));
                                    } catch (T.I unused) {
                                        m4 = I.m();
                                    }
                                    xVar.X(new Y.x(a5, m4));
                                    return;
                                case 10:
                                    String c8 = c0433n2.c("Session");
                                    String c9 = c0433n2.c("Transport");
                                    if (c8 == null || c9 == null) {
                                        throw T.I.b("Missing mandatory session or transport header", null);
                                    }
                                    xVar.Y(new Y(20, z.c(c8)));
                                    return;
                                default:
                                    throw new IllegalStateException();
                            }
                        }
                        if (i10 == 401) {
                            if (c0432m.f7258u == null || c0432m.f7247B) {
                                C0432m.c(c0432m, new C0159k(z.h(i11) + " " + i10));
                                return;
                            }
                            c0433n2.getClass();
                            I d5 = c0433n2.f7263a.d(C0433n.b("WWW-Authenticate"));
                            if (d5.isEmpty()) {
                                throw T.I.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i12 = 0; i12 < d5.size(); i12++) {
                                c0432m.f7261y = z.e((String) d5.get(i12));
                                if (c0432m.f7261y.f2682a == 2) {
                                    C0432m.a(c0432m).j();
                                    c0432m.f7247B = true;
                                    return;
                                }
                            }
                            C0432m.a(c0432m).j();
                            c0432m.f7247B = true;
                            return;
                        }
                        if (i10 == 461) {
                            String str3 = z.h(i11) + " " + i10;
                            String c10 = c0412a.f7134c.c("Transport");
                            a.h(c10);
                            C0432m.c(c0432m, (i11 != 10 || c10.contains("TCP")) ? new C0159k(str3) : new IOException(str3));
                            return;
                        }
                        if (i10 != 301 && i10 != 302) {
                            C0432m.c(c0432m, new C0159k(z.h(i11) + " " + i10));
                            return;
                        }
                        if (c0432m.f7262z != -1) {
                            c0432m.f7262z = 0;
                        }
                        String c11 = c0433n2.c("Location");
                        if (c11 == null) {
                            c0432m.f7250l.F("Redirection without new location.", null);
                            return;
                        }
                        Uri parse = Uri.parse(c11);
                        c0432m.s = z.f(parse);
                        c0432m.f7258u = z.d(parse);
                        C0432m.a(c0432m).k(c0432m.f7259v, C0432m.b(c0432m));
                        return;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        C0432m.c(c0432m, new IOException(e));
                        return;
                    }
                } catch (T.I e6) {
                    e = e6;
                    C0432m.c(c0432m, new IOException(e));
                    return;
                }
            case 10:
                m0.x xVar2 = (m0.x) this.f2678m;
                byte[] bArr = (byte[]) this.f2679n;
                xVar2.getClass();
                try {
                    xVar2.f7310l.write(bArr);
                    return;
                } catch (Exception unused2) {
                    if (xVar2.f7313o.f7320q) {
                        return;
                    }
                    Y.x xVar3 = xVar2.f7313o.f7315l;
                    return;
                }
            case 11:
                T t4 = (T) this.f2678m;
                L0.b bVar2 = t4.f7720C;
                y0.z zVar = (y0.z) this.f2679n;
                t4.f7727K = bVar2 == null ? zVar : new A0.b(-9223372036854775807L);
                t4.f7728L = zVar.i();
                if (!t4.f7734R && zVar.i() == -9223372036854775807L) {
                    z6 = true;
                }
                t4.f7729M = z6;
                t4.f7730N = z6 ? 7 : 1;
                if (t4.f7724G) {
                    t4.f7747r.w(t4.f7728L, zVar.c(), t4.f7729M);
                    return;
                } else {
                    t4.z();
                    return;
                }
            case 12:
                ((S0.g) this.f2678m).e((Typeface) this.f2679n);
                return;
            case 13:
                v2.h hVar2 = (v2.h) this.f2678m;
                hVar2.getClass();
                v2.g gVar = (v2.g) this.f2679n;
                gVar.f8679b.run();
                hVar2.f8685f = gVar;
                hVar2.f8684e.run();
                return;
            case 14:
                K2.e eVar2 = (K2.e) this.f2678m;
                v2.h hVar3 = (v2.h) this.f2679n;
                synchronized (eVar2) {
                    HashSet hashSet = new HashSet((HashSet) eVar2.f961p);
                    ((HashSet) eVar2.f962q).remove(hVar3);
                    ((HashSet) eVar2.f961p).add(hVar3);
                    v2.g gVar2 = hVar3.f8685f;
                    if (gVar2 == null || (y4 = gVar2.f8678a) == null || !((v2.f) y4.f5535m).j()) {
                        v2.g gVar3 = hVar3.f8685f;
                        if ((gVar3 != null ? gVar3.a() : null) != null) {
                            HashMap hashMap = (HashMap) eVar2.f963r;
                            v2.g gVar4 = hVar3.f8685f;
                            hashMap.remove(gVar4 != null ? gVar4.a() : null);
                        }
                    }
                    eVar2.f(hVar3);
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        eVar2.f((v2.h) it2.next());
                    }
                }
                return;
            case 15:
                C0215n c0215n3 = (C0215n) this.f2678m;
                c0215n3.getClass();
                int i13 = y.f2709a;
                C0118H c0118h2 = c0215n3.f4632b.f3204a;
                d0 d0Var = (d0) this.f2679n;
                c0118h2.f3238c0 = d0Var;
                c0118h2.f3251l.e(25, new C0114D(d0Var));
                return;
            case 16:
                C0215n c0215n4 = (C0215n) this.f2678m;
                c0215n4.getClass();
                int i14 = y.f2709a;
                SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E2 = c0215n4.f4632b;
                C0095p c0095p = (C0095p) this.f2679n;
                C0118H c0118h3 = surfaceHolderCallbackC0115E2.f3204a;
                c0118h3.f3220M = c0095p;
                b0.e eVar3 = c0118h3.f3257r;
                eVar3.K(eVar3.J(), 1017, new b0.c(11));
                return;
            default:
                C0215n c0215n5 = (C0215n) this.f2678m;
                C0126f c0126f2 = (C0126f) this.f2679n;
                c0215n5.getClass();
                synchronized (c0126f2) {
                }
                SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E3 = c0215n5.f4632b;
                int i15 = y.f2709a;
                C0118H c0118h4 = surfaceHolderCallbackC0115E3.f3204a;
                b0.e eVar4 = c0118h4.f3257r;
                C0177a G3 = eVar4.G((F) eVar4.f4344o.f371e);
                eVar4.K(G3, 1020, new B2.x(G3, (Object) c0126f2, 21));
                c0118h4.f3220M = null;
                return;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i4) {
        this.f2677l = i4;
        this.f2678m = obj;
        this.f2679n = obj2;
    }
}
