package P2;

import B2.AbstractActivityC0003d;
import K2.o;
import T.C0095p;
import T.I;
import W.r;
import W.w;
import W.y;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import android.view.View;
import e2.c;
import f2.AbstractC0275C;
import f2.G;
import f2.J;
import f2.K;
import f2.Y;
import f2.f0;
import f2.h0;
import f2.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.C0412A;
import m0.C0432m;
import m0.C0433n;
import m0.z;
import p1.AbstractC0462a;
import v2.g;
import y0.h;
import y0.i;
import y0.l;

/* loaded from: classes.dex */
public final class a implements i, v2.i {

    /* renamed from: l, reason: collision with root package name */
    public int f1500l;

    /* renamed from: m, reason: collision with root package name */
    public Object f1501m;

    /* renamed from: n, reason: collision with root package name */
    public Object f1502n;

    public a(int i4, C0433n c0433n, String str) {
        this.f1500l = i4;
        this.f1501m = c0433n;
        this.f1502n = str;
    }

    @Override // y0.i
    public h B(l lVar, long j4) {
        long j5 = lVar.f9089o;
        int min = (int) Math.min(112800, lVar.f9088n - j5);
        r rVar = (r) this.f1502n;
        rVar.D(min);
        lVar.p(rVar.f2694a, 0, min, false);
        int i4 = rVar.f2696c;
        long j6 = -1;
        long j7 = -1;
        long j8 = -9223372036854775807L;
        while (rVar.a() >= 188) {
            byte[] bArr = rVar.f2694a;
            int i5 = rVar.f2695b;
            while (i5 < i4 && bArr[i5] != 71) {
                i5++;
            }
            int i6 = i5 + 188;
            if (i6 > i4) {
                break;
            }
            long I3 = AbstractC0462a.I(rVar, i5, this.f1500l);
            if (I3 != -9223372036854775807L) {
                long b4 = ((w) this.f1501m).b(I3);
                if (b4 > j4) {
                    return j8 == -9223372036854775807L ? new h(-1, b4, j5) : new h(0, -9223372036854775807L, j5 + j7);
                }
                if (100000 + b4 > j4) {
                    return new h(0, -9223372036854775807L, j5 + i5);
                }
                j7 = i5;
                j8 = b4;
            }
            rVar.G(i6);
            j6 = i6;
        }
        return j8 != -9223372036854775807L ? new h(-2, j8, j5 + j6) : h.f9069d;
    }

    @Override // y0.i
    public void E() {
        byte[] bArr = y.f2714f;
        r rVar = (r) this.f1502n;
        rVar.getClass();
        rVar.E(bArr, bArr.length);
    }

    @Override // v2.i
    public void a(g gVar) {
        ((Handler) this.f1502n).post(gVar.f8679b);
    }

    @Override // v2.i
    public void c() {
        HandlerThread handlerThread = (HandlerThread) this.f1501m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1501m = null;
            this.f1502n = null;
        }
    }

    @Override // v2.i
    public void d() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f1500l);
        this.f1501m = handlerThread;
        handlerThread.start();
        this.f1502n = new Handler(((HandlerThread) this.f1501m).getLooper());
    }

    public h0 e() {
        K k4 = (K) this.f1502n;
        if (k4 != null) {
            throw k4.a();
        }
        h0 b4 = h0.b(this.f1500l, (Object[]) this.f1501m, this);
        K k5 = (K) this.f1502n;
        if (k5 == null) {
            return b4;
        }
        throw k5.a();
    }

    public Object f(int i4) {
        SparseArray sparseArray;
        if (this.f1500l == -1) {
            this.f1500l = 0;
        }
        while (true) {
            int i5 = this.f1500l;
            sparseArray = (SparseArray) this.f1501m;
            if (i5 <= 0 || i4 >= sparseArray.keyAt(i5)) {
                break;
            }
            this.f1500l--;
        }
        while (this.f1500l < sparseArray.size() - 1 && i4 >= sparseArray.keyAt(this.f1500l + 1)) {
            this.f1500l++;
        }
        return sparseArray.valueAt(this.f1500l);
    }

    public int g() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) this.f1501m;
        int i4 = this.f1500l;
        View findViewById = abstractActivityC0003d.findViewById(i4);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i4 + "not found");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    public C0412A h(int i4, String str, Map map, Uri uri) {
        C0432m c0432m = (C0432m) this.f1502n;
        String str2 = c0432m.f7252n;
        int i5 = this.f1500l;
        this.f1500l = i5 + 1;
        Y y4 = new Y(i5, str2, str);
        if (c0432m.f7261y != null) {
            W.a.k(c0432m.f7258u);
            try {
                y4.s("Authorization", c0432m.f7261y.b(c0432m.f7258u, uri, i4));
            } catch (I e4) {
                C0432m.c(c0432m, new IOException(e4));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            y4.s((String) entry.getKey(), (String) entry.getValue());
        }
        return new C0412A(uri, i4, new C0433n(y4), "");
    }

    public void i(Object obj, Object obj2) {
        int i4 = (this.f1500l + 1) * 2;
        Object[] objArr = (Object[]) this.f1501m;
        if (i4 > objArr.length) {
            this.f1501m = Arrays.copyOf(objArr, AbstractC0275C.e(objArr.length, i4));
        }
        f2.r.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1501m;
        int i5 = this.f1500l;
        int i6 = i5 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f1500l = i5 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        W.a.k((C0412A) this.f1501m);
        C0433n c0433n = ((C0412A) this.f1501m).f7134c;
        HashMap hashMap = new HashMap();
        J j4 = c0433n.f7263a;
        r0 it = ((f0) j4.f5511o.keySet()).iterator();
        while (true) {
            G g4 = (G) it;
            if (!g4.hasNext()) {
                C0412A c0412a = (C0412A) this.f1501m;
                l(h(c0412a.f7133b, ((C0432m) this.f1502n).f7259v, hashMap, c0412a.f7132a));
                return;
            }
            String str = (String) g4.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) f2.r.l(j4.d(str)));
            }
        }
    }

    public void k(String str, Uri uri) {
        l(h(2, str, h0.f5570r, uri));
    }

    public void l(C0412A c0412a) {
        String c4 = c0412a.f7134c.c("CSeq");
        c4.getClass();
        int parseInt = Integer.parseInt(c4);
        C0432m c0432m = (C0432m) this.f1502n;
        W.a.j(c0432m.f7255q.get(parseInt) == null);
        c0432m.f7255q.append(parseInt, c0412a);
        c0432m.f7257t.b(z.g(c0412a));
        this.f1501m = c0412a;
    }

    public void m(int i4) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) this.f1501m;
        int i5 = this.f1500l;
        View findViewById = abstractActivityC0003d.findViewById(i5);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i5 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i4) {
            return;
        }
        findViewById.setContentSensitivity(i4);
        findViewById.invalidate();
    }

    public List n(CharSequence charSequence) {
        charSequence.getClass();
        o oVar = (o) this.f1502n;
        oVar.getClass();
        e2.i iVar = new e2.i(oVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public a(o oVar) {
        this.f1502n = oVar;
        this.f1501m = c.f5433l;
        this.f1500l = Integer.MAX_VALUE;
    }

    public a(int i4, int i5) {
        switch (i5) {
            case 9:
                this.f1500l = i4;
                return;
            default:
                this.f1501m = new Object[i4 * 2];
                this.f1500l = 0;
                return;
        }
    }

    public a(C0095p c0095p, int i4, String str) {
        this.f1501m = c0095p;
        this.f1500l = i4;
        this.f1502n = str;
    }
}
