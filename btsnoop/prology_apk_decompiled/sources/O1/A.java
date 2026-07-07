package O1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class A implements ServiceConnection {

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f1395l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public int f1396m = 2;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1397n;

    /* renamed from: o, reason: collision with root package name */
    public IBinder f1398o;

    /* renamed from: p, reason: collision with root package name */
    public final z f1399p;

    /* renamed from: q, reason: collision with root package name */
    public ComponentName f1400q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C f1401r;

    public A(C c4, z zVar) {
        this.f1401r = c4;
        this.f1399p = zVar;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f1396m = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C c4 = this.f1401r;
            R1.a aVar = c4.f1409d;
            Context context = c4.f1407b;
            boolean b4 = aVar.b(context, str, this.f1399p.a(context), this, executor);
            this.f1397n = b4;
            if (b4) {
                this.f1401r.f1408c.sendMessageDelayed(this.f1401r.f1408c.obtainMessage(1, this.f1399p), this.f1401r.f1411f);
            } else {
                this.f1396m = 2;
                try {
                    C c5 = this.f1401r;
                    c5.f1409d.a(c5.f1407b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1401r.f1406a) {
            try {
                this.f1401r.f1408c.removeMessages(1, this.f1399p);
                this.f1398o = iBinder;
                this.f1400q = componentName;
                Iterator it = this.f1395l.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1396m = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1401r.f1406a) {
            try {
                this.f1401r.f1408c.removeMessages(1, this.f1399p);
                this.f1398o = null;
                this.f1400q = componentName;
                Iterator it = this.f1395l.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1396m = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
