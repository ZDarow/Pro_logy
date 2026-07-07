package p080U1;

/* renamed from: U1.c */
/* loaded from: classes.dex */
public final class C0750c {

    /* renamed from: b */
    public static final p080U1.C0750c f2609b;

    /* renamed from: a */
    public p080U1.C0749b f2610a;

    /* JADX WARN: Type inference failed for: r0v0, types: [U1.c, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        obj.f2610a = null;
        f2609b = obj;
    }

    /* renamed from: a */
    public static p080U1.C0749b m1395a(android.content.Context context) {
        p080U1.C0749b c0749b;
        p080U1.C0750c c0750c = f2609b;
        synchronized (c0750c) {
            try {
                if (c0750c.f2610a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0750c.f2610a = new p080U1.C0749b(context);
                }
                c0749b = c0750c.f2610a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0749b;
    }
}
