package d2;

import O1.s;
import T.C0096q;
import java.util.concurrent.CancellationException;

/* renamed from: d2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4981a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Y1.a f4982b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4983c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f4984d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4985e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f4986f;

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.a, java.lang.Object] */
    public C0246i() {
        ?? obj = new Object();
        obj.f3079m = new Object();
        this.f4982b = obj;
    }

    public final Object a() {
        Object obj;
        synchronized (this.f4981a) {
            try {
                if (!this.f4983c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f4984d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f4986f;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.f4985e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean b() {
        boolean z4;
        synchronized (this.f4981a) {
            try {
                z4 = false;
                if (this.f4983c && !this.f4984d && this.f4986f == null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public final void c(Exception exc) {
        s.e(exc, "Exception must not be null");
        synchronized (this.f4981a) {
            e();
            this.f4983c = true;
            this.f4986f = exc;
        }
        this.f4982b.f(this);
    }

    public final void d(Object obj) {
        synchronized (this.f4981a) {
            e();
            this.f4983c = true;
            this.f4985e = obj;
        }
        this.f4982b.f(this);
    }

    public final void e() {
        boolean z4;
        if (this.f4983c) {
            int i4 = C0096q.f2337l;
            synchronized (this.f4981a) {
                z4 = this.f4983c;
            }
            if (!z4) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.f4981a) {
                Exception exc = this.f4986f;
            }
        }
    }

    public final void f() {
        synchronized (this.f4981a) {
            try {
                if (this.f4983c) {
                    this.f4982b.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
