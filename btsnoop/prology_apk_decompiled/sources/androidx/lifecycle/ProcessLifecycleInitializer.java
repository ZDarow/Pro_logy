package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import m1.C0435a;
import m1.InterfaceC0436b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0436b {
    @Override // m1.InterfaceC0436b
    public final List a() {
        return a3.l.f3631l;
    }

    @Override // m1.InterfaceC0436b
    public final Object b(Context context) {
        k3.h.e(context, "context");
        C0435a c4 = C0435a.c(context);
        k3.h.d(c4, "getInstance(context)");
        if (!c4.f7332b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!i.f4159a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            k3.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new h());
        }
        r rVar = r.f4176t;
        rVar.getClass();
        rVar.f4181p = new Handler();
        rVar.f4182q.d(e.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        k3.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q(rVar));
        return rVar;
    }
}
