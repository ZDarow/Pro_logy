package O1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f1403g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static C f1404h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f1405i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1406a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1407b;

    /* renamed from: c, reason: collision with root package name */
    public volatile W1.f f1408c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.a f1409d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1410e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1411f;

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.Handler, W1.f] */
    /* JADX WARN: Type inference failed for: r3v3, types: [R1.a, java.lang.Object] */
    public C(Context context, Looper looper) {
        B b4 = new B(this);
        this.f1407b = context.getApplicationContext();
        ?? handler = new Handler(looper, b4);
        Looper.getMainLooper();
        this.f1408c = handler;
        if (R1.a.f1757b == null) {
            synchronized (R1.a.f1756a) {
                try {
                    if (R1.a.f1757b == null) {
                        ?? obj = new Object();
                        new ConcurrentHashMap();
                        R1.a.f1757b = obj;
                    }
                } finally {
                }
            }
        }
        R1.a aVar = R1.a.f1757b;
        s.d(aVar);
        this.f1409d = aVar;
        this.f1410e = 5000L;
        this.f1411f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z4) {
        z zVar = new z(str, z4);
        s.e(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1406a) {
            try {
                A a4 = (A) this.f1406a.get(zVar);
                if (a4 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(zVar.toString()));
                }
                if (!a4.f1395l.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(zVar.toString()));
                }
                a4.f1395l.remove(serviceConnection);
                if (a4.f1395l.isEmpty()) {
                    this.f1408c.sendMessageDelayed(this.f1408c.obtainMessage(0, zVar), this.f1410e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(z zVar, v vVar, String str) {
        boolean z4;
        synchronized (this.f1406a) {
            try {
                A a4 = (A) this.f1406a.get(zVar);
                if (a4 == null) {
                    a4 = new A(this, zVar);
                    a4.f1395l.put(vVar, vVar);
                    a4.a(str, null);
                    this.f1406a.put(zVar, a4);
                } else {
                    this.f1408c.removeMessages(0, zVar);
                    if (a4.f1395l.containsKey(vVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(zVar.toString()));
                    }
                    a4.f1395l.put(vVar, vVar);
                    int i4 = a4.f1396m;
                    if (i4 == 1) {
                        vVar.onServiceConnected(a4.f1400q, a4.f1398o);
                    } else if (i4 == 2) {
                        a4.a(str, null);
                    }
                }
                z4 = a4.f1397n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
