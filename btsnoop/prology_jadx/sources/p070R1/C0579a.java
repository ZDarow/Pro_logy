package p070R1;

/* renamed from: R1.a */
/* loaded from: classes.dex */
public final class C0579a {

    /* renamed from: a */
    public static final java.lang.Object f1816a = new java.lang.Object();

    /* renamed from: b */
    public static volatile p070R1.C0579a f1817b;

    /* renamed from: a */
    public final void m1100a(android.content.Context context, p058O1.ServiceConnectionC0493A serviceConnectionC0493A) {
        try {
            context.unbindService(serviceConnectionC0493A);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    /* renamed from: b */
    public final boolean m1101b(android.content.Context context, java.lang.String str, android.content.Intent intent, p058O1.ServiceConnectionC0493A serviceConnectionC0493A, java.util.concurrent.Executor executor) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.lang.String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((p080U1.C0750c.m1395a(context).f2608l.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        return (android.os.Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnectionC0493A, 4225) : context.bindService(intent, 4225, executor, serviceConnectionC0493A);
    }
}
