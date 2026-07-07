package g0;

import T.C0094o;
import T.C0095p;
import T.H;
import a.AbstractC0110a;
import java.util.ArrayList;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307c implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5645d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b, reason: collision with root package name */
    public L1.g f5646b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5647c;

    public static void a(int i4, ArrayList arrayList) {
        if (AbstractC0110a.G(i4, 0, 7, f5645d) == -1 || arrayList.contains(Integer.valueOf(i4))) {
            return;
        }
        arrayList.add(Integer.valueOf(i4));
    }

    public final C0095p b(C0095p c0095p) {
        if (!this.f5647c || !this.f5646b.o(c0095p)) {
            return c0095p;
        }
        C0094o a4 = c0095p.a();
        a4.f2290l = H.l("application/x-media3-cues");
        a4.f2275F = this.f5646b.e(c0095p);
        StringBuilder sb = new StringBuilder();
        sb.append(c0095p.f2325m);
        String str = c0095p.f2322j;
        sb.append(str != null ? " ".concat(str) : "");
        a4.f2287i = sb.toString();
        a4.f2295q = Long.MAX_VALUE;
        return new C0095p(a4);
    }
}
