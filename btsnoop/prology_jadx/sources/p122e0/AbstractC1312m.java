package p122e0;

/* renamed from: e0.m */
/* loaded from: classes.dex */
public abstract class AbstractC1312m {

    /* renamed from: l */
    public final p076T.C0702p f5265l;

    /* renamed from: m */
    public final p129f2.AbstractC1393I f5266m;

    /* renamed from: n */
    public final long f5267n;

    /* renamed from: o */
    public final java.util.List f5268o;

    /* renamed from: p */
    public final p122e0.C1309j f5269p;

    public AbstractC1312m(p076T.C0702p c0702p, p129f2.AbstractC1393I abstractC1393I, p122e0.AbstractC1318s abstractC1318s, java.util.ArrayList arrayList) {
        p086W.AbstractC0781a.m1416e(!abstractC1393I.isEmpty());
        this.f5265l = c0702p;
        this.f5266m = p129f2.AbstractC1393I.m3162j(abstractC1393I);
        this.f5268o = arrayList == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(arrayList);
        this.f5269p = abstractC1318s.mo3078a(this);
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f5267n = p086W.AbstractC0805y.m1600U(abstractC1318s.f5286c, 1000000L, abstractC1318s.f5285b, java.math.RoundingMode.FLOOR);
    }

    /* renamed from: b */
    public abstract java.lang.String mo3067b();

    /* renamed from: d */
    public abstract p117d0.InterfaceC1264h mo3068d();

    /* renamed from: e */
    public abstract p122e0.C1309j mo3069e();
}
