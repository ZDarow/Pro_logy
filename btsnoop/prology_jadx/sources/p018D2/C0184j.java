package p018D2;

/* renamed from: D2.j */
/* loaded from: classes.dex */
public final class C0184j implements p047L2.InterfaceC0376f, p018D2.InterfaceC0185k {

    /* renamed from: l */
    public final io.flutter.embedding.engine.FlutterJNI f502l;

    /* renamed from: m */
    public final java.util.HashMap f503m;

    /* renamed from: n */
    public final java.util.HashMap f504n;

    /* renamed from: o */
    public final java.lang.Object f505o;

    /* renamed from: p */
    public final java.util.concurrent.atomic.AtomicBoolean f506p;

    /* renamed from: q */
    public final java.util.HashMap f507q;

    /* renamed from: r */
    public int f508r;

    /* renamed from: s */
    public final p018D2.C0186l f509s;

    /* renamed from: t */
    public final java.util.WeakHashMap f510t;

    /* renamed from: u */
    public final p009B2.C0061r f511u;

    public C0184j(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        p009B2.C0061r c0061r = new p009B2.C0061r(7, false);
        c0061r.f188m = (java.util.concurrent.ExecutorService) android.support.v4.media.session.C1061t.m2201n0().f3863o;
        this.f503m = new java.util.HashMap();
        this.f504n = new java.util.HashMap();
        this.f505o = new java.lang.Object();
        this.f506p = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f507q = new java.util.HashMap();
        this.f508r = 1;
        this.f509s = new p018D2.C0186l();
        this.f510t = new java.util.WeakHashMap();
        this.f502l = flutterJNI;
        this.f511u = c0061r;
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: a */
    public final void mo267a(java.lang.String str, java.nio.ByteBuffer byteBuffer, p047L2.InterfaceC0375e interfaceC0375e) {
        p089W2.AbstractC0821a.m1664b("DartMessenger#send on " + str);
        try {
            int i4 = this.f508r;
            this.f508r = i4 + 1;
            if (interfaceC0375e != null) {
                this.f507q.put(java.lang.Integer.valueOf(i4), interfaceC0375e);
            }
            io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f502l;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i4);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i4);
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [F1.g, java.lang.Object] */
    @Override // p047L2.InterfaceC0376f
    /* renamed from: b */
    public final p025F1.C0215g mo268b(p047L2.C0382l c0382l) {
        p009B2.C0061r c0061r = this.f511u;
        c0061r.getClass();
        p018D2.C0183i c0183i = new p018D2.C0183i((java.util.concurrent.ExecutorService) c0061r.f188m);
        ?? obj = new java.lang.Object();
        this.f510t.put(obj, c0183i);
        return obj;
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: c */
    public final void mo269c(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        mo267a(str, byteBuffer, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [D2.c] */
    /* renamed from: e */
    public final void m541e(final java.lang.String str, final p018D2.C0180f c0180f, final java.nio.ByteBuffer byteBuffer, final int i4, final long j4) {
        p018D2.InterfaceC0179e interfaceC0179e = c0180f != null ? c0180f.f493b : null;
        java.lang.String m1663a = p089W2.AbstractC0821a.m1663a("PlatformChannel ScheduleHandler on " + str);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            p167n1.AbstractC1895a.m3877a(p101a.AbstractC0936a.m1788Z(m1663a), i4);
        } else {
            java.lang.String m1788Z = p101a.AbstractC0936a.m1788Z(m1663a);
            try {
                if (p101a.AbstractC0936a.f3308i == null) {
                    p101a.AbstractC0936a.f3308i = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                }
                p101a.AbstractC0936a.f3308i.invoke(null, java.lang.Long.valueOf(p101a.AbstractC0936a.f3306g), m1788Z, java.lang.Integer.valueOf(i4));
            } catch (java.lang.Exception e4) {
                p101a.AbstractC0936a.m1767E("asyncTraceBegin", e4);
            }
        }
        ?? r02 = new java.lang.Runnable() { // from class: D2.c
            @Override // java.lang.Runnable
            public final void run() {
                long j5 = j4;
                io.flutter.embedding.engine.FlutterJNI flutterJNI = p018D2.C0184j.this.f502l;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformChannel ScheduleHandler on ");
                java.lang.String str2 = str;
                sb.append(str2);
                java.lang.String m1663a2 = p089W2.AbstractC0821a.m1663a(sb.toString());
                int i5 = android.os.Build.VERSION.SDK_INT;
                int i6 = i4;
                if (i5 >= 29) {
                    p167n1.AbstractC1895a.m3878b(p101a.AbstractC0936a.m1788Z(m1663a2), i6);
                } else {
                    java.lang.String m1788Z2 = p101a.AbstractC0936a.m1788Z(m1663a2);
                    try {
                        if (p101a.AbstractC0936a.f3309j == null) {
                            p101a.AbstractC0936a.f3309j = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                        }
                        p101a.AbstractC0936a.f3309j.invoke(null, java.lang.Long.valueOf(p101a.AbstractC0936a.f3306g), m1788Z2, java.lang.Integer.valueOf(i6));
                    } catch (java.lang.Exception e5) {
                        p101a.AbstractC0936a.m1767E("asyncTraceEnd", e5);
                    }
                }
                try {
                    p089W2.AbstractC0821a.m1664b("DartMessenger#handleMessageFromDart on " + str2);
                    p018D2.C0180f c0180f2 = c0180f;
                    java.nio.ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0180f2 != null) {
                            try {
                                try {
                                    c0180f2.f492a.mo103R(byteBuffer2, new p018D2.C0181g(flutterJNI, i6));
                                } catch (java.lang.Exception e6) {
                                    android.util.Log.e("DartMessenger", "Uncaught exception in binary message listener", e6);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                                }
                            } catch (java.lang.Error e7) {
                                java.lang.Thread currentThread = java.lang.Thread.currentThread();
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
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th) {
                        try {
                            android.os.Trace.endSection();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j5);
                }
            }
        };
        p018D2.InterfaceC0179e interfaceC0179e2 = interfaceC0179e;
        if (interfaceC0179e == null) {
            interfaceC0179e2 = this.f509s;
        }
        interfaceC0179e2.mo539a(r02);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: f */
    public final void mo271f(java.lang.String str, p047L2.InterfaceC0374d interfaceC0374d, p025F1.C0215g c0215g) {
        p018D2.InterfaceC0179e interfaceC0179e;
        if (interfaceC0374d == null) {
            synchronized (this.f505o) {
                this.f503m.remove(str);
            }
            return;
        }
        if (c0215g != null) {
            interfaceC0179e = (p018D2.InterfaceC0179e) this.f510t.get(c0215g);
            if (interfaceC0179e == null) {
                throw new java.lang.IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0179e = null;
        }
        synchronized (this.f505o) {
            try {
                this.f503m.put(str, new p018D2.C0180f(interfaceC0374d, interfaceC0179e));
                java.util.List<p018D2.C0178d> list = (java.util.List) this.f504n.remove(str);
                if (list == null) {
                    return;
                }
                for (p018D2.C0178d c0178d : list) {
                    m541e(str, (p018D2.C0180f) this.f503m.get(str), c0178d.f489a, c0178d.f490b, c0178d.f491c);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: g */
    public final void mo272g(java.lang.String str, p047L2.InterfaceC0374d interfaceC0374d) {
        mo271f(str, interfaceC0374d, null);
    }
}
