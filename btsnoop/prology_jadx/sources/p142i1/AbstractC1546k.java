package p142i1;

/* renamed from: i1.k */
/* loaded from: classes.dex */
public abstract class AbstractC1546k {

    /* renamed from: a */
    public static final p174p.C1941h f6424a = new java.lang.Object();

    /* renamed from: b */
    public static final java.lang.Object f6425b = new java.lang.Object();

    /* renamed from: c */
    public static p025F1.C0215g f6426c = null;

    /* renamed from: a */
    public static long m3435a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return android.os.Build.VERSION.SDK_INT >= 33 ? p142i1.AbstractC1544i.m3432a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F1.g, java.lang.Object] */
    /* renamed from: b */
    public static p025F1.C0215g m3436b() {
        ?? obj = new java.lang.Object();
        f6426c = obj;
        p174p.C1941h c1941h = f6424a;
        c1941h.getClass();
        if (p174p.AbstractFutureC1940g.f7877f.mo3890i(c1941h, null, obj)) {
            p174p.AbstractFutureC1940g.m3892b(c1941h);
        }
        return f6426c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3437c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p142i1.AbstractC1546k.m3437c(android.content.Context, boolean):void");
    }
}
