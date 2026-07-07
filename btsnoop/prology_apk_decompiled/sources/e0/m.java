package e0;

import T.C0095p;
import W.y;
import f2.I;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: l, reason: collision with root package name */
    public final C0095p f5077l;

    /* renamed from: m, reason: collision with root package name */
    public final I f5078m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5079n;

    /* renamed from: o, reason: collision with root package name */
    public final List f5080o;

    /* renamed from: p, reason: collision with root package name */
    public final j f5081p;

    public m(C0095p c0095p, I i4, s sVar, ArrayList arrayList) {
        W.a.e(!i4.isEmpty());
        this.f5077l = c0095p;
        this.f5078m = I.j(i4);
        this.f5080o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f5081p = sVar.a(this);
        int i5 = y.f2709a;
        this.f5079n = y.U(sVar.f5098c, 1000000L, sVar.f5097b, RoundingMode.FLOOR);
    }

    public abstract String b();

    public abstract d0.h d();

    public abstract j e();
}
