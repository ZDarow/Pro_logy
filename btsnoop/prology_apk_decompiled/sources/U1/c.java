package U1;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f2521b;

    /* renamed from: a, reason: collision with root package name */
    public b f2522a;

    /* JADX WARN: Type inference failed for: r0v0, types: [U1.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f2522a = null;
        f2521b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f2521b;
        synchronized (cVar) {
            try {
                if (cVar.f2522a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f2522a = new b(context);
                }
                bVar = cVar.f2522a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
