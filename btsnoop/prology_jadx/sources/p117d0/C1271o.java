package p117d0;

/* renamed from: d0.o */
/* loaded from: classes.dex */
public final class C1271o implements android.os.Handler.Callback {

    /* renamed from: l */
    public final p197u0.C2218e f5103l;

    /* renamed from: m */
    public final p117d0.C1260d f5104m;

    /* renamed from: q */
    public p122e0.C1302c f5108q;

    /* renamed from: r */
    public boolean f5109r;

    /* renamed from: s */
    public boolean f5110s;

    /* renamed from: t */
    public boolean f5111t;

    /* renamed from: p */
    public final java.util.TreeMap f5107p = new java.util.TreeMap();

    /* renamed from: o */
    public final android.os.Handler f5106o = p086W.AbstractC0805y.m1619n(this);

    /* renamed from: n */
    public final p036I0.C0306b f5105n = new p036I0.C0306b(1);

    public C1271o(p122e0.C1302c c1302c, p117d0.C1260d c1260d, p197u0.C2218e c2218e) {
        this.f5108q = c1302c;
        this.f5104m = c1260d;
        this.f5103l = c2218e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (this.f5111t) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        p117d0.C1269m c1269m = (p117d0.C1269m) message.obj;
        long j4 = c1269m.f5096a;
        java.util.TreeMap treeMap = this.f5107p;
        long j5 = c1269m.f5097b;
        java.lang.Long l4 = (java.lang.Long) treeMap.get(java.lang.Long.valueOf(j5));
        if (l4 == null) {
            treeMap.put(java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j4));
        } else if (l4.longValue() > j4) {
            treeMap.put(java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j4));
        }
        return true;
    }
}
