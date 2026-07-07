package t0;

import T.C0084e;
import T.C0095p;
import T.V;
import T.W;
import W.y;
import a0.N;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import f2.C0300w;
import f2.I;
import f2.b0;
import f2.c0;
import j.C0359n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import q0.k0;

/* loaded from: classes.dex */
public final class q extends u {

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f8376j = new C0300w(new W0.d(6));

    /* renamed from: c, reason: collision with root package name */
    public final Object f8377c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8378d;

    /* renamed from: e, reason: collision with root package name */
    public final C0560b f8379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8380f;

    /* renamed from: g, reason: collision with root package name */
    public C0569k f8381g;

    /* renamed from: h, reason: collision with root package name */
    public final K2.l f8382h;

    /* renamed from: i, reason: collision with root package name */
    public C0084e f8383i;

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [K2.l, java.lang.Object] */
    public q(Context context) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        K2.l lVar;
        ?? obj = new Object();
        int i4 = C0569k.f8343A;
        C0569k c0569k = new C0569k(new C0568j(context));
        this.f8377c = new Object();
        this.f8378d = context.getApplicationContext();
        this.f8379e = obj;
        this.f8381g = c0569k;
        this.f8383i = C0084e.f2235e;
        boolean L3 = y.L(context);
        this.f8380f = L3;
        if (!L3 && y.f2709a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                lVar = null;
            } else {
                spatializer = audioManager.getSpatializer();
                ?? obj2 = new Object();
                obj2.f1000b = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                obj2.f999a = immersiveAudioLevel != 0;
                lVar = obj2;
            }
            this.f8382h = lVar;
        }
        boolean z4 = this.f8381g.f8347v;
    }

    public static int b(int i4, int i5) {
        if (i4 == 0 || i4 != i5) {
            return Integer.bitCount(i4 & i5);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(C0095p c0095p, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(c0095p.f2316d)) {
            return 4;
        }
        String f4 = f(str);
        String f5 = f(c0095p.f2316d);
        if (f5 == null || f4 == null) {
            return (z4 && f5 == null) ? 1 : 0;
        }
        if (f5.startsWith(f4) || f4.startsWith(f5)) {
            return 3;
        }
        int i4 = y.f2709a;
        return f5.split("-", 2)[0].equals(f4.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean g(C0569k c0569k, int i4, C0095p c0095p) {
        if ((i4 & 3584) == 0) {
            return false;
        }
        W w = c0569k.f2207m;
        if (w.f2177c && (i4 & 2048) == 0) {
            return false;
        }
        if (w.f2176b) {
            return !(c0095p.f2306D != 0 || c0095p.f2307E != 0) || ((i4 & 1024) != 0);
        }
        return true;
    }

    public static Pair h(int i4, C0359n c0359n, int[][][] iArr, n nVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z4;
        C0359n c0359n2 = c0359n;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < c0359n2.f6715a) {
            if (i4 == ((int[]) c0359n2.f6716b)[i5]) {
                k0 k0Var = ((k0[]) c0359n2.f6717c)[i5];
                for (int i6 = 0; i6 < k0Var.f7877a; i6++) {
                    V a4 = k0Var.a(i6);
                    c0 a5 = nVar.a(i5, a4, iArr[i5][i6]);
                    int i7 = a4.f2169a;
                    boolean[] zArr = new boolean[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        o oVar = (o) a5.get(i8);
                        int a6 = oVar.a();
                        if (!zArr[i8] && a6 != 0) {
                            if (a6 == 1) {
                                randomAccess = I.o(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                for (int i9 = i8 + 1; i9 < i7; i9++) {
                                    o oVar2 = (o) a5.get(i9);
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        z4 = true;
                                        zArr[i9] = true;
                                    } else {
                                        z4 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i5++;
            c0359n2 = c0359n;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((o) list.get(i10)).f8361n;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.f8360m, iArr2), Integer.valueOf(oVar3.f8359l));
    }

    @Override // t0.u
    public final void a(C0084e c0084e) {
        boolean equals;
        synchronized (this.f8377c) {
            equals = this.f8383i.equals(c0084e);
            this.f8383i = c0084e;
        }
        if (equals) {
            return;
        }
        e();
    }

    public final C0569k d() {
        C0569k c0569k;
        synchronized (this.f8377c) {
            c0569k = this.f8381g;
        }
        return c0569k;
    }

    public final void e() {
        boolean z4;
        N n4;
        K2.l lVar;
        synchronized (this.f8377c) {
            try {
                z4 = this.f8381g.f8347v && !this.f8380f && y.f2709a >= 32 && (lVar = this.f8382h) != null && lVar.f999a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4 || (n4 = this.f8386a) == null) {
            return;
        }
        n4.s.e(10);
    }

    public final void i(C0569k c0569k) {
        boolean equals;
        synchronized (this.f8377c) {
            equals = this.f8381g.equals(c0569k);
            this.f8381g = c0569k;
        }
        if (equals) {
            return;
        }
        if (c0569k.f8347v && this.f8378d == null) {
            W.a.A("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        N n4 = this.f8386a;
        if (n4 != null) {
            n4.s.e(10);
        }
    }
}
