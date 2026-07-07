package f2;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.datastore.preferences.protobuf.C0159k;
import androidx.profileinstaller.ProfileInstallReceiver;
import f1.C0271e;
import i.C0324e;
import i.InterfaceC0333n;
import i.MenuC0328i;
import i.MenuItemC0329j;
import i.SubMenuC0338s;
import i.ViewOnKeyListenerC0325f;
import j.C0354i;
import j.InterfaceC0357l;
import java.io.IOException;
import java.io.Serializable;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.C0425f;
import m0.C0433n;
import m0.RunnableC0434o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s0.InterfaceC0541c;
import t2.C0571b;
import v0.AbstractC0587a;

/* loaded from: classes.dex */
public final class Y implements q0.b0, j.N, i0.c, i1.c, InterfaceC0333n, InterfaceC0357l, j0.k, u0.i, q0.Y, u0.p, InterfaceC0541c, L2.i, u3.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5534l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5535m;

    public /* synthetic */ Y(int i4, Object obj) {
        this.f5534l = i4;
        this.f5535m = obj;
    }

    private final void A(u0.k kVar, long j4, long j5, boolean z4) {
    }

    public static int w(int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    public static boolean z(int i4) {
        return (48 <= i4 && i4 <= 57) || i4 == 35 || i4 == 42;
    }

    public void B(C0159k c0159k) {
        boolean z4 = c0159k instanceof m0.t;
        m0.r rVar = (m0.r) this.f5535m;
        if (!z4 || rVar.f7282G) {
            rVar.w = c0159k;
        } else {
            m0.r.y(rVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [d3.g, j3.p] */
    @Override // u3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(u3.e r7, b3.InterfaceC0190d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof u3.a
            if (r0 == 0) goto L13
            r0 = r8
            u3.a r0 = (u3.a) r0
            int r1 = r0.f8598r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8598r = r1
            goto L18
        L13:
            u3.a r0 = new u3.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8596p
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f8598r
            Z2.g r3 = Z2.g.f3186a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            v3.n r7 = r0.f8595o
            p1.AbstractC0462a.P(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p1.AbstractC0462a.P(r8)
            v3.n r8 = new v3.n
            b3.i r2 = r0.f4989m
            k3.h.b(r2)
            r8.<init>(r7, r2)
            r0.f8595o = r8     // Catch: java.lang.Throwable -> L5e
            r0.f8598r = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f5535m     // Catch: java.lang.Throwable -> L5e
            d3.g r7 = (d3.g) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.h(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.m()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.m()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.Y.C(u3.e, b3.d):java.lang.Object");
    }

    public void D() {
        g0.l lVar = (g0.l) this.f5535m;
        int i4 = lVar.f5704C - 1;
        lVar.f5704C = i4;
        if (i4 > 0) {
            return;
        }
        int i5 = 0;
        for (g0.r rVar : lVar.f5706E) {
            rVar.a();
            i5 += rVar.f5766T.f7877a;
        }
        T.V[] vArr = new T.V[i5];
        int i6 = 0;
        for (g0.r rVar2 : lVar.f5706E) {
            rVar2.a();
            int i7 = rVar2.f5766T.f7877a;
            int i8 = 0;
            while (i8 < i7) {
                rVar2.a();
                vArr[i6] = rVar2.f5766T.a(i8);
                i8++;
                i6++;
            }
        }
        lVar.f5705D = new q0.k0(vArr);
        lVar.f5703B.o(lVar);
    }

    @Override // L2.i
    public void E() {
        ((C0571b) this.f5535m).f8423a = null;
    }

    public void F(String str, IOException iOException) {
        ((m0.r) this.f5535m).f7292v = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r2 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r2 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int G(T.C0095p r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f2325m
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = T.H.i(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = W.y.f2709a
            java.lang.String r7 = r7.f2325m
            r7.getClass()
            int r2 = W.y.f2709a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = r0
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = r1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = a0.AbstractC0125e.f(r0, r3, r3, r3)
            goto L83
        L7f:
            int r7 = a0.AbstractC0125e.f(r1, r3, r3, r3)
        L83:
            return r7
        L84:
            int r7 = a0.AbstractC0125e.f(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.Y.G(T.p):int");
    }

    @Override // L2.i
    public void H(Object obj, L2.h hVar) {
        ((C0571b) this.f5535m).f8423a = hVar;
    }

    @Override // i.InterfaceC0333n
    public void a(MenuC0328i menuC0328i, boolean z4) {
        if (menuC0328i instanceof SubMenuC0338s) {
            ((SubMenuC0338s) menuC0328i).f6124v.j().c(false);
        }
        InterfaceC0333n interfaceC0333n = ((C0354i) this.f5535m).f6685p;
        if (interfaceC0333n != null) {
            interfaceC0333n.a(menuC0328i, z4);
        }
    }

    @Override // j0.k
    public void b(int i4, Z.b bVar, long j4, int i5) {
        ((MediaCodec) this.f5535m).queueSecureInputBuffer(i4, 0, bVar.f3136i, j4, i5);
    }

    @Override // j0.k
    public void c(Bundle bundle) {
        ((MediaCodec) this.f5535m).setParameters(bundle);
    }

    @Override // j0.k
    public void d() {
    }

    @Override // j0.k
    public void e(int i4, int i5, long j4, int i6) {
        ((MediaCodec) this.f5535m).queueInputBuffer(i4, 0, i5, j4, i6);
    }

    @Override // q0.b0
    public void f(q0.c0 c0Var) {
        g0.l lVar = (g0.l) this.f5535m;
        lVar.f5703B.f(lVar);
    }

    @Override // j0.k
    public void flush() {
    }

    @Override // j.N
    public void g(MenuC0328i menuC0328i, MenuItemC0329j menuItemC0329j) {
        ViewOnKeyListenerC0325f viewOnKeyListenerC0325f = (ViewOnKeyListenerC0325f) this.f5535m;
        viewOnKeyListenerC0325f.f6034q.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0325f.s;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (menuC0328i == ((C0324e) arrayList.get(i4)).f6018b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        viewOnKeyListenerC0325f.f6034q.postAtTime(new Q.p(this, i5 < arrayList.size() ? (C0324e) arrayList.get(i5) : null, menuItemC0329j, menuC0328i, 2), menuC0328i, SystemClock.uptimeMillis() + 200);
    }

    @Override // i.InterfaceC0333n
    public boolean h(MenuC0328i menuC0328i) {
        C0354i c0354i = (C0354i) this.f5535m;
        if (menuC0328i == c0354i.f6683n) {
            return false;
        }
        ((SubMenuC0338s) menuC0328i).w.getClass();
        c0354i.getClass();
        InterfaceC0333n interfaceC0333n = c0354i.f6685p;
        if (interfaceC0333n != null) {
            return interfaceC0333n.h(menuC0328i);
        }
        return false;
    }

    @Override // i1.c
    public void i(int i4, Serializable serializable) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f5535m).setResultCode(i4);
    }

    @Override // j.N
    public void j(MenuC0328i menuC0328i, MenuItemC0329j menuItemC0329j) {
        ((ViewOnKeyListenerC0325f) this.f5535m).f6034q.removeCallbacksAndMessages(menuC0328i);
    }

    @Override // u0.i
    public void k(u0.k kVar, long j4, long j5) {
        boolean z4;
        switch (this.f5534l) {
            case 16:
                C0425f c0425f = (C0425f) kVar;
                m0.r rVar = (m0.r) this.f5535m;
                if (rVar.h() == 0) {
                    if (rVar.f7282G) {
                        return;
                    }
                    m0.r.y(rVar);
                    return;
                }
                int i4 = 0;
                while (true) {
                    ArrayList arrayList = rVar.f7287p;
                    if (i4 < arrayList.size()) {
                        m0.q qVar = (m0.q) arrayList.get(i4);
                        if (qVar.f7270a.f7267b == c0425f) {
                            qVar.a();
                        } else {
                            i4++;
                        }
                    }
                }
                rVar.f7286o.f7262z = 1;
                return;
            case 17:
            default:
                d0.d dVar = (d0.d) this.f5535m;
                synchronized (AbstractC0587a.f8656b) {
                    z4 = AbstractC0587a.f8657c;
                }
                if (z4) {
                    dVar.b();
                    return;
                } else {
                    dVar.f4837m.z(new IOException(new ConcurrentModificationException()));
                    return;
                }
            case 18:
                return;
        }
    }

    @Override // j0.k
    public void l() {
    }

    @Override // i1.c
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // q0.Y
    public void n() {
        m0.r rVar = (m0.r) this.f5535m;
        rVar.f7284m.post(new RunnableC0434o(rVar, 1));
    }

    @Override // u0.p
    public Object p(Uri uri, Y.j jVar) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f5535m).newPullParser();
            newPullParser.setInput(jVar, null);
            return (p0.c) new p0.f(uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e4) {
            throw T.I.b(null, e4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    @Override // u0.i
    public C0271e q(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        switch (this.f5534l) {
            case 16:
                C0425f c0425f = (C0425f) kVar;
                m0.r rVar = (m0.r) this.f5535m;
                if (!rVar.f7279D) {
                    rVar.f7292v = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i5 = rVar.f7281F;
                    rVar.f7281F = i5 + 1;
                    if (i5 < 3) {
                        return u0.n.f8539o;
                    }
                } else {
                    rVar.w = new IOException(c0425f.f7200m.f7305b.toString(), iOException);
                }
                return u0.n.f8540p;
            case 17:
            default:
                ((d0.d) this.f5535m).f4837m.z(iOException);
                return u0.n.f8540p;
            case 18:
                if (!((m0.y) this.f5535m).f7320q) {
                    Y.x xVar = ((m0.y) this.f5535m).f7315l;
                }
                return u0.n.f8540p;
        }
    }

    @Override // j0.k
    public void r() {
    }

    public void s(String str, String str2) {
        String b4 = C0433n.b(str.trim());
        String trim = str2.trim();
        K2.o oVar = (K2.o) this.f5535m;
        oVar.getClass();
        r.d(b4, trim);
        C0299v c0299v = (C0299v) oVar.f1009m;
        Collection collection = (Collection) c0299v.get(b4);
        if (collection == null) {
            collection = new ArrayList();
            c0299v.put(b4, collection);
        }
        collection.add(trim);
    }

    public void t(List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = (String) list.get(i4);
            int i5 = W.y.f2709a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                s(split[0], split[1]);
            }
        }
    }

    public Z u() {
        Map f4 = ((r) this.f5535m).f();
        X x3 = new X();
        Z z4 = new Z(f4);
        z4.f5538q = x3;
        return z4;
    }

    public C0433n v() {
        return new C0433n(this);
    }

    @Override // u0.i
    public void x(u0.k kVar, long j4, long j5, boolean z4) {
        switch (this.f5534l) {
            case 16:
                return;
            case 17:
            default:
                return;
            case 18:
                return;
        }
    }

    public Y(int i4) {
        this.f5534l = i4;
        switch (i4) {
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                this.f5535m = new SparseArray();
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f5535m = new b0.d(14);
                return;
            case 13:
                this.f5535m = new SparseIntArray();
                return;
            case 15:
                this.f5535m = new K2.o(29);
                return;
            case 21:
                this.f5535m = new LinkedHashMap(0, 0.75f, true);
                return;
            case 22:
                try {
                    this.f5535m = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e4) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
                }
            case 23:
                this.f5535m = new L1.g(15, false);
                return;
            case 25:
                return;
            case 26:
                this.f5535m = new CopyOnWriteArrayList();
                return;
            default:
                this.f5535m = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public Y(c0 c0Var) {
        this.f5534l = 19;
        this.f5535m = I.j(c0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(int i4, String str, String str2) {
        this(15);
        this.f5534l = 15;
        s("User-Agent", str);
        s("CSeq", String.valueOf(i4));
        if (str2 != null) {
            s("Session", str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Y(j3.p pVar) {
        this.f5534l = 27;
        this.f5535m = (d3.g) pVar;
    }
}
