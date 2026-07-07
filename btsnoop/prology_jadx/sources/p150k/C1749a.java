package p150k;

/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C1749a extends p176p1.AbstractC1949a {

    /* renamed from: b */
    public static volatile p150k.C1749a f7185b;

    /* renamed from: a */
    public final java.lang.Object f7186a;

    public C1749a(int i4) {
        switch (i4) {
            case 1:
                this.f7186a = new java.lang.Object();
                java.util.concurrent.Executors.newFixedThreadPool(4, new p150k.ThreadFactoryC1750b());
                return;
            default:
                this.f7186a = new p150k.C1749a(1);
                return;
        }
    }
}
