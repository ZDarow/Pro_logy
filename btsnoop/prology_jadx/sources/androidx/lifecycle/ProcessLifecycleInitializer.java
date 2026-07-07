package androidx.lifecycle;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p162m1.InterfaceC1871b {
    @Override // p162m1.InterfaceC1871b
    /* renamed from: a */
    public final java.util.List mo2650a() {
        return p105a3.C1029l.f3755l;
    }

    @Override // p162m1.InterfaceC1871b
    /* renamed from: b */
    public final java.lang.Object mo2651b(android.content.Context context) {
        p154k3.AbstractC1803h.m3779e(context, "context");
        p162m1.C1870a m3851c = p162m1.C1870a.m3851c(context);
        p154k3.AbstractC1803h.m3778d(m3851c, "getInstance(context)");
        if (!m3851c.f7611b.contains(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            throw new java.lang.IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!androidx.lifecycle.AbstractC1145i.f4308a.getAndSet(true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            p154k3.AbstractC1803h.m3777c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.C1144h());
        }
        androidx.lifecycle.C1154r c1154r = androidx.lifecycle.C1154r.f4325t;
        c1154r.getClass();
        c1154r.f4330p = new android.os.Handler();
        c1154r.f4331q.m2660d(androidx.lifecycle.EnumC1141e.ON_CREATE);
        android.content.Context applicationContext2 = context.getApplicationContext();
        p154k3.AbstractC1803h.m3777c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(new androidx.lifecycle.C1153q(c1154r));
        return c1154r;
    }
}
