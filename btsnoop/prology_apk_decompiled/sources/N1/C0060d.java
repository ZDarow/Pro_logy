package N1;

import B2.AbstractC0007h;
import B2.E;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n.C0438a;
import n.C0443f;

/* renamed from: N1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060d implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public static C0060d f1265C;

    /* renamed from: l, reason: collision with root package name */
    public long f1267l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1268m;

    /* renamed from: n, reason: collision with root package name */
    public O1.j f1269n;

    /* renamed from: o, reason: collision with root package name */
    public Q1.c f1270o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1271p;

    /* renamed from: q, reason: collision with root package name */
    public final L1.d f1272q;

    /* renamed from: r, reason: collision with root package name */
    public final B1.d f1273r;
    public final AtomicInteger s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicInteger f1274t;

    /* renamed from: u, reason: collision with root package name */
    public final ConcurrentHashMap f1275u;

    /* renamed from: v, reason: collision with root package name */
    public final C0443f f1276v;
    public final C0443f w;

    /* renamed from: x, reason: collision with root package name */
    public final W1.f f1277x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f1278y;

    /* renamed from: z, reason: collision with root package name */
    public static final Status f1266z = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: A, reason: collision with root package name */
    public static final Status f1263A = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: B, reason: collision with root package name */
    public static final Object f1264B = new Object();

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.Handler, W1.f] */
    public C0060d(Context context, Looper looper) {
        L1.d dVar = L1.d.f1065c;
        this.f1267l = 10000L;
        this.f1268m = false;
        this.s = new AtomicInteger(1);
        this.f1274t = new AtomicInteger(0);
        this.f1275u = new ConcurrentHashMap(5, 0.75f, 1);
        this.f1276v = new C0443f(0);
        this.w = new C0443f(0);
        this.f1278y = true;
        this.f1271p = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.f1277x = handler;
        this.f1272q = dVar;
        this.f1273r = new B1.d(26);
        PackageManager packageManager = context.getPackageManager();
        if (U1.a.f2519f == null) {
            U1.a.f2519f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (U1.a.f2519f.booleanValue()) {
            this.f1278y = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status c(C0058b c0058b, L1.a aVar) {
        return new Status(17, "API: " + ((String) c0058b.f1255b.f97n) + " is not available on this device. Connection failed with: " + String.valueOf(aVar), aVar.f1056n, aVar);
    }

    public static C0060d f(Context context) {
        C0060d c0060d;
        HandlerThread handlerThread;
        synchronized (f1264B) {
            if (f1265C == null) {
                synchronized (O1.C.f1403g) {
                    try {
                        handlerThread = O1.C.f1405i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            O1.C.f1405i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = O1.C.f1405i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = L1.d.f1064b;
                f1265C = new C0060d(applicationContext, looper);
            }
            c0060d = f1265C;
        }
        return c0060d;
    }

    public final boolean a() {
        if (this.f1268m) {
            return false;
        }
        O1.i iVar = (O1.i) O1.h.b().f1446a;
        if (iVar != null && !iVar.f1448m) {
            return false;
        }
        int i4 = ((SparseIntArray) this.f1273r.f96m).get(203400000, -1);
        return i4 == -1 || i4 == 0;
    }

    public final boolean b(L1.a aVar, int i4) {
        boolean z4;
        PendingIntent activity;
        Boolean bool;
        L1.d dVar = this.f1272q;
        Context context = this.f1271p;
        dVar.getClass();
        synchronized (U1.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = U1.a.f2514a;
            if (context2 != null && (bool = U1.a.f2515b) != null && context2 == applicationContext) {
                z4 = bool.booleanValue();
            }
            U1.a.f2515b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            U1.a.f2515b = Boolean.valueOf(isInstantApp);
            U1.a.f2514a = applicationContext;
            z4 = isInstantApp;
        }
        if (z4) {
            return false;
        }
        int i5 = aVar.f1055m;
        if (i5 == 0 || (activity = aVar.f1056n) == null) {
            Intent a4 = dVar.a(context, i5, null);
            activity = a4 != null ? PendingIntent.getActivity(context, 0, a4, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i6 = aVar.f1055m;
        int i7 = GoogleApiActivity.f4733m;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i4);
        intent.putExtra("notify_manager", true);
        dVar.f(context, i6, PendingIntent.getActivity(context, 0, intent, W1.e.f2818a | 134217728));
        return true;
    }

    public final o d(M1.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f1275u;
        C0058b c0058b = fVar.f1166e;
        o oVar = (o) concurrentHashMap.get(c0058b);
        if (oVar == null) {
            oVar = new o(this, fVar);
            concurrentHashMap.put(c0058b, oVar);
        }
        if (oVar.f1290d.j()) {
            this.w.add(c0058b);
        }
        oVar.j();
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(d2.C0241d r9, int r10, M1.f r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L83
            N1.b r3 = r11.f1166e
            boolean r11 = r8.a()
            if (r11 != 0) goto Lb
            goto L47
        Lb:
            O1.h r11 = O1.h.b()
            java.lang.Object r11 = r11.f1446a
            O1.i r11 = (O1.i) r11
            r0 = 1
            if (r11 == 0) goto L49
            boolean r1 = r11.f1448m
            if (r1 == 0) goto L47
            java.util.concurrent.ConcurrentHashMap r1 = r8.f1275u
            java.lang.Object r1 = r1.get(r3)
            N1.o r1 = (N1.o) r1
            if (r1 == 0) goto L44
            M1.c r2 = r1.f1290d
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.a
            if (r4 == 0) goto L47
            com.google.android.gms.common.internal.a r2 = (com.google.android.gms.common.internal.a) r2
            O1.y r4 = r2.f4747F
            if (r4 == 0) goto L44
            boolean r4 = r2.a()
            if (r4 != 0) goto L44
            O1.d r11 = N1.v.a(r1, r2, r10)
            if (r11 == 0) goto L47
            int r2 = r1.f1300n
            int r2 = r2 + r0
            r1.f1300n = r2
            boolean r0 = r11.f1418n
            goto L49
        L44:
            boolean r0 = r11.f1449n
            goto L49
        L47:
            r10 = 0
            goto L65
        L49:
            N1.v r11 = new N1.v
            r1 = 0
            if (r0 == 0) goto L54
            long r4 = java.lang.System.currentTimeMillis()
            goto L55
        L54:
            r4 = r1
        L55:
            if (r0 == 0) goto L5d
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L5e
        L5d:
            r6 = r1
        L5e:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L65:
            if (r10 == 0) goto L83
            d2.i r9 = r9.f4974a
            W1.f r11 = r8.f1277x
            r11.getClass()
            N1.l r0 = new N1.l
            r0.<init>(r11)
            r9.getClass()
            d2.g r11 = new d2.g
            r11.<init>(r0, r10)
            Y1.a r10 = r9.f4982b
            r10.e(r11)
            r9.f()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.C0060d.e(d2.d, int, M1.f):void");
    }

    public final void g(L1.a aVar, int i4) {
        if (b(aVar, i4)) {
            return;
        }
        W1.f fVar = this.f1277x;
        fVar.sendMessage(fVar.obtainMessage(5, i4, 0, aVar));
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [Q1.c, M1.f] */
    /* JADX WARN: Type inference failed for: r3v24, types: [Q1.c, M1.f] */
    /* JADX WARN: Type inference failed for: r4v12, types: [Q1.c, M1.f] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        o oVar;
        L1.c[] b4;
        int i4 = 11;
        int i5 = message.what;
        switch (i5) {
            case 1:
                this.f1267l = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f1277x.removeMessages(12);
                for (C0058b c0058b : this.f1275u.keySet()) {
                    W1.f fVar = this.f1277x;
                    fVar.sendMessageDelayed(fVar.obtainMessage(12, c0058b), this.f1267l);
                }
                return true;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                message.obj.getClass();
                throw new ClassCastException();
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                for (o oVar2 : this.f1275u.values()) {
                    O1.s.b(oVar2.f1301o.f1277x);
                    oVar2.f1299m = null;
                    oVar2.j();
                }
                return true;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                x xVar = (x) message.obj;
                o oVar3 = (o) this.f1275u.get(xVar.f1327c.f1166e);
                if (oVar3 == null) {
                    oVar3 = d(xVar.f1327c);
                }
                if (!oVar3.f1290d.j() || this.f1274t.get() == xVar.f1326b) {
                    oVar3.k(xVar.f1325a);
                } else {
                    xVar.f1325a.c(f1266z);
                    oVar3.n();
                }
                return true;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                int i6 = message.arg1;
                L1.a aVar = (L1.a) message.obj;
                Iterator it = this.f1275u.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        oVar = (o) it.next();
                        if (oVar.f1295i == i6) {
                        }
                    } else {
                        oVar = null;
                    }
                }
                if (oVar != null) {
                    int i7 = aVar.f1055m;
                    if (i7 == 13) {
                        this.f1272q.getClass();
                        AtomicBoolean atomicBoolean = L1.f.f1067a;
                        oVar.b(new Status(17, "Error resolution was canceled by the user, original error message: " + L1.a.d(i7) + ": " + aVar.f1057o, null, null));
                    } else {
                        oVar.b(c(oVar.f1291e, aVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", AbstractC0007h.j(i6, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f1271p.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f1271p.getApplicationContext();
                    ComponentCallbacks2C0059c componentCallbacks2C0059c = ComponentCallbacks2C0059c.f1258p;
                    synchronized (componentCallbacks2C0059c) {
                        try {
                            if (!componentCallbacks2C0059c.f1262o) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C0059c);
                                application.registerComponentCallbacks(componentCallbacks2C0059c);
                                componentCallbacks2C0059c.f1262o = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    m mVar = new m(this);
                    synchronized (componentCallbacks2C0059c) {
                        componentCallbacks2C0059c.f1261n.add(mVar);
                    }
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0059c.f1260m;
                    boolean z4 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0059c.f1259l;
                    if (!z4) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f1267l = 300000L;
                    }
                }
                return true;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                d((M1.f) message.obj);
                return true;
            case 9:
                if (this.f1275u.containsKey(message.obj)) {
                    o oVar4 = (o) this.f1275u.get(message.obj);
                    O1.s.b(oVar4.f1301o.f1277x);
                    if (oVar4.f1297k) {
                        oVar4.j();
                    }
                }
                return true;
            case 10:
                C0443f c0443f = this.w;
                c0443f.getClass();
                C0438a c0438a = new C0438a(c0443f);
                while (c0438a.hasNext()) {
                    o oVar5 = (o) this.f1275u.remove((C0058b) c0438a.next());
                    if (oVar5 != null) {
                        oVar5.n();
                    }
                }
                this.w.clear();
                return true;
            case 11:
                if (this.f1275u.containsKey(message.obj)) {
                    o oVar6 = (o) this.f1275u.get(message.obj);
                    C0060d c0060d = oVar6.f1301o;
                    O1.s.b(c0060d.f1277x);
                    boolean z5 = oVar6.f1297k;
                    if (z5) {
                        if (z5) {
                            C0060d c0060d2 = oVar6.f1301o;
                            W1.f fVar2 = c0060d2.f1277x;
                            C0058b c0058b2 = oVar6.f1291e;
                            fVar2.removeMessages(11, c0058b2);
                            c0060d2.f1277x.removeMessages(9, c0058b2);
                            oVar6.f1297k = false;
                        }
                        oVar6.b(c0060d.f1272q.b(c0060d.f1271p, L1.e.f1066a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        oVar6.f1290d.i("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f1275u.containsKey(message.obj)) {
                    o oVar7 = (o) this.f1275u.get(message.obj);
                    O1.s.b(oVar7.f1301o.f1277x);
                    M1.c cVar = oVar7.f1290d;
                    if (cVar.c() && oVar7.f1294h.isEmpty()) {
                        B1.d dVar = oVar7.f1292f;
                        if (((Map) dVar.f96m).isEmpty() && ((Map) dVar.f97n).isEmpty()) {
                            cVar.i("Timing out service connection.");
                        } else {
                            oVar7.g();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                p pVar = (p) message.obj;
                if (this.f1275u.containsKey(pVar.f1302a)) {
                    o oVar8 = (o) this.f1275u.get(pVar.f1302a);
                    if (oVar8.f1298l.contains(pVar) && !oVar8.f1297k) {
                        if (oVar8.f1290d.c()) {
                            oVar8.d();
                        } else {
                            oVar8.j();
                        }
                    }
                }
                return true;
            case 16:
                p pVar2 = (p) message.obj;
                if (this.f1275u.containsKey(pVar2.f1302a)) {
                    o oVar9 = (o) this.f1275u.get(pVar2.f1302a);
                    if (oVar9.f1298l.remove(pVar2)) {
                        C0060d c0060d3 = oVar9.f1301o;
                        c0060d3.f1277x.removeMessages(15, pVar2);
                        c0060d3.f1277x.removeMessages(16, pVar2);
                        L1.c cVar2 = pVar2.f1303b;
                        LinkedList<u> linkedList = oVar9.f1289c;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (u uVar : linkedList) {
                            if (uVar != null && (b4 = uVar.b(oVar9)) != null) {
                                int length = b4.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length) {
                                        break;
                                    }
                                    if (!O1.s.f(b4[i8], cVar2)) {
                                        i8++;
                                    } else if (i8 >= 0) {
                                        arrayList.add(uVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            u uVar2 = (u) arrayList.get(i9);
                            linkedList.remove(uVar2);
                            uVar2.d(new M1.k(cVar2));
                        }
                    }
                }
                return true;
            case 17:
                O1.j jVar = this.f1269n;
                if (jVar != null) {
                    if (jVar.f1452l > 0 || a()) {
                        if (this.f1270o == null) {
                            this.f1270o = new M1.f(this.f1271p, Q1.c.f1705i, O1.k.f1454b, M1.e.f1160b);
                        }
                        Q1.c cVar3 = this.f1270o;
                        cVar3.getClass();
                        E e4 = new E();
                        e4.f119c = 0;
                        e4.f121e = new L1.c[]{W1.d.f2816a};
                        e4.f118b = false;
                        e4.f120d = new K2.o(i4, jVar);
                        cVar3.c(2, e4.a());
                    }
                    this.f1269n = null;
                }
                return true;
            case 18:
                w wVar = (w) message.obj;
                if (wVar.f1323c == 0) {
                    O1.j jVar2 = new O1.j(wVar.f1322b, Arrays.asList(wVar.f1321a));
                    if (this.f1270o == null) {
                        this.f1270o = new M1.f(this.f1271p, Q1.c.f1705i, O1.k.f1454b, M1.e.f1160b);
                    }
                    Q1.c cVar4 = this.f1270o;
                    cVar4.getClass();
                    E e5 = new E();
                    e5.f119c = 0;
                    e5.f121e = new L1.c[]{W1.d.f2816a};
                    e5.f118b = false;
                    e5.f120d = new K2.o(i4, jVar2);
                    cVar4.c(2, e5.a());
                } else {
                    O1.j jVar3 = this.f1269n;
                    if (jVar3 != null) {
                        List list = jVar3.f1453m;
                        if (jVar3.f1452l != wVar.f1322b || (list != null && list.size() >= wVar.f1324d)) {
                            this.f1277x.removeMessages(17);
                            O1.j jVar4 = this.f1269n;
                            if (jVar4 != null) {
                                if (jVar4.f1452l > 0 || a()) {
                                    if (this.f1270o == null) {
                                        this.f1270o = new M1.f(this.f1271p, Q1.c.f1705i, O1.k.f1454b, M1.e.f1160b);
                                    }
                                    Q1.c cVar5 = this.f1270o;
                                    cVar5.getClass();
                                    E e6 = new E();
                                    e6.f119c = 0;
                                    e6.f121e = new L1.c[]{W1.d.f2816a};
                                    e6.f118b = false;
                                    e6.f120d = new K2.o(i4, jVar4);
                                    cVar5.c(2, e6.a());
                                }
                                this.f1269n = null;
                            }
                        } else {
                            O1.j jVar5 = this.f1269n;
                            O1.g gVar = wVar.f1321a;
                            if (jVar5.f1453m == null) {
                                jVar5.f1453m = new ArrayList();
                            }
                            jVar5.f1453m.add(gVar);
                        }
                    }
                    if (this.f1269n == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(wVar.f1321a);
                        this.f1269n = new O1.j(wVar.f1322b, arrayList2);
                        W1.f fVar3 = this.f1277x;
                        fVar3.sendMessageDelayed(fVar3.obtainMessage(17), wVar.f1323c);
                    }
                }
                return true;
            case 19:
                this.f1268m = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i5);
                return false;
        }
    }
}
