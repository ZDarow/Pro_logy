package p119d2;

/* renamed from: d2.i */
/* loaded from: classes.dex */
public final class C1290i {

    /* renamed from: a */
    public final java.lang.Object f5168a = new java.lang.Object();

    /* renamed from: b */
    public final p096Y1.C0890a f5169b;

    /* renamed from: c */
    public boolean f5170c;

    /* renamed from: d */
    public volatile boolean f5171d;

    /* renamed from: e */
    public java.lang.Object f5172e;

    /* renamed from: f */
    public java.lang.Exception f5173f;

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.a, java.lang.Object] */
    public C1290i() {
        ?? obj = new java.lang.Object();
        obj.f3189m = new java.lang.Object();
        this.f5169b = obj;
    }

    /* renamed from: a */
    public final java.lang.Object m3024a() {
        java.lang.Object obj;
        synchronized (this.f5168a) {
            try {
                if (!this.f5170c) {
                    throw new java.lang.IllegalStateException("Task is not yet complete");
                }
                if (this.f5171d) {
                    throw new java.util.concurrent.CancellationException("Task is already canceled.");
                }
                java.lang.Exception exc = this.f5173f;
                if (exc != null) {
                    throw new java.lang.RuntimeException(exc);
                }
                obj = this.f5172e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* renamed from: b */
    public final boolean m3025b() {
        boolean z4;
        synchronized (this.f5168a) {
            try {
                z4 = false;
                if (this.f5170c && !this.f5171d && this.f5173f == null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    /* renamed from: c */
    public final void m3026c(java.lang.Exception exc) {
        p058O1.AbstractC0515s.m1018e(exc, "Exception must not be null");
        synchronized (this.f5168a) {
            m3028e();
            this.f5170c = true;
            this.f5173f = exc;
        }
        this.f5169b.m1732f(this);
    }

    /* renamed from: d */
    public final void m3027d(java.lang.Object obj) {
        synchronized (this.f5168a) {
            m3028e();
            this.f5170c = true;
            this.f5172e = obj;
        }
        this.f5169b.m1732f(this);
    }

    /* renamed from: e */
    public final void m3028e() {
        boolean z4;
        if (this.f5170c) {
            int i4 = p076T.C0703q.f2422l;
            synchronized (this.f5168a) {
                z4 = this.f5170c;
            }
            if (!z4) {
                throw new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.f5168a) {
                java.lang.Exception exc = this.f5173f;
            }
        }
    }

    /* renamed from: f */
    public final void m3029f() {
        synchronized (this.f5168a) {
            try {
                if (this.f5170c) {
                    this.f5169b.m1732f(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
