package D2;

import B2.r;
import a.AbstractC0110a;
import android.os.Build;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.AbstractC0451a;

/* loaded from: classes.dex */
public final class j implements L2.f, k {

    /* renamed from: l, reason: collision with root package name */
    public final FlutterJNI f493l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f494m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f495n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f496o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f497p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f498q;

    /* renamed from: r, reason: collision with root package name */
    public int f499r;
    public final l s;

    /* renamed from: t, reason: collision with root package name */
    public final WeakHashMap f500t;

    /* renamed from: u, reason: collision with root package name */
    public final r f501u;

    public j(FlutterJNI flutterJNI) {
        r rVar = new r(7, false);
        rVar.f185m = (ExecutorService) t.n0().f3736o;
        this.f494m = new HashMap();
        this.f495n = new HashMap();
        this.f496o = new Object();
        this.f497p = new AtomicBoolean(false);
        this.f498q = new HashMap();
        this.f499r = 1;
        this.s = new l();
        this.f500t = new WeakHashMap();
        this.f493l = flutterJNI;
        this.f501u = rVar;
    }

    @Override // L2.f
    public final void a(String str, ByteBuffer byteBuffer, L2.e eVar) {
        W2.a.b("DartMessenger#send on " + str);
        try {
            int i4 = this.f499r;
            this.f499r = i4 + 1;
            if (eVar != null) {
                this.f498q.put(Integer.valueOf(i4), eVar);
            }
            FlutterJNI flutterJNI = this.f493l;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i4);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i4);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [F1.g, java.lang.Object] */
    @Override // L2.f
    public final F1.g b(L2.l lVar) {
        r rVar = this.f501u;
        rVar.getClass();
        i iVar = new i((ExecutorService) rVar.f185m);
        ?? obj = new Object();
        this.f500t.put(obj, iVar);
        return obj;
    }

    @Override // L2.f
    public final void c(String str, ByteBuffer byteBuffer) {
        a(str, byteBuffer, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [D2.c] */
    public final void e(final String str, final f fVar, final ByteBuffer byteBuffer, final int i4, final long j4) {
        e eVar = fVar != null ? fVar.f484b : null;
        String a4 = W2.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0451a.a(AbstractC0110a.Z(a4), i4);
        } else {
            String Z3 = AbstractC0110a.Z(a4);
            try {
                if (AbstractC0110a.f3196i == null) {
                    AbstractC0110a.f3196i = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0110a.f3196i.invoke(null, Long.valueOf(AbstractC0110a.f3194g), Z3, Integer.valueOf(i4));
            } catch (Exception e4) {
                AbstractC0110a.E("asyncTraceBegin", e4);
            }
        }
        ?? r02 = new Runnable() { // from class: D2.c
            @Override // java.lang.Runnable
            public final void run() {
                long j5 = j4;
                FlutterJNI flutterJNI = j.this.f493l;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a5 = W2.a.a(sb.toString());
                int i5 = Build.VERSION.SDK_INT;
                int i6 = i4;
                if (i5 >= 29) {
                    AbstractC0451a.b(AbstractC0110a.Z(a5), i6);
                } else {
                    String Z4 = AbstractC0110a.Z(a5);
                    try {
                        if (AbstractC0110a.f3197j == null) {
                            AbstractC0110a.f3197j = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0110a.f3197j.invoke(null, Long.valueOf(AbstractC0110a.f3194g), Z4, Integer.valueOf(i6));
                    } catch (Exception e5) {
                        AbstractC0110a.E("asyncTraceEnd", e5);
                    }
                }
                try {
                    W2.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f483a.R(byteBuffer2, new g(flutterJNI, i6));
                                } catch (Exception e6) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e6);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                                }
                            } catch (Error e7) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e7;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e7);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j5);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.s;
        }
        eVar2.a(r02);
    }

    @Override // L2.f
    public final void f(String str, L2.d dVar, F1.g gVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f496o) {
                this.f494m.remove(str);
            }
            return;
        }
        if (gVar != null) {
            eVar = (e) this.f500t.get(gVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f496o) {
            try {
                this.f494m.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f495n.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    e(str, (f) this.f494m.get(str), dVar2.f480a, dVar2.f481b, dVar2.f482c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L2.f
    public final void g(String str, L2.d dVar) {
        f(str, dVar, null);
    }
}
