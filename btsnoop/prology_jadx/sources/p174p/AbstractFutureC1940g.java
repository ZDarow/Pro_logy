package p174p;

/* renamed from: p.g */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1940g implements java.util.concurrent.Future {

    /* renamed from: d */
    public static final boolean f7875d = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final java.util.logging.Logger f7876e = java.util.logging.Logger.getLogger(p174p.AbstractFutureC1940g.class.getName());

    /* renamed from: f */
    public static final p176p1.AbstractC1949a f7877f;

    /* renamed from: g */
    public static final java.lang.Object f7878g;

    /* renamed from: a */
    public volatile java.lang.Object f7879a;

    /* renamed from: b */
    public volatile p174p.C1936c f7880b;

    /* renamed from: c */
    public volatile p174p.C1939f f7881c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [p1.a] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new p174p.C1937d(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p174p.C1939f.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p174p.C1939f.class, p174p.C1939f.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p174p.AbstractFutureC1940g.class, p174p.C1939f.class, "c"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p174p.AbstractFutureC1940g.class, p174p.C1936c.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p174p.AbstractFutureC1940g.class, java.lang.Object.class, "a"));
        } catch (java.lang.Throwable th) {
            th = th;
            r4 = new java.lang.Object();
        }
        f7877f = r4;
        if (th != null) {
            f7876e.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7878g = new java.lang.Object();
    }

    /* renamed from: b */
    public static void m3892b(p174p.AbstractFutureC1940g abstractFutureC1940g) {
        p174p.C1939f c1939f;
        p174p.C1936c c1936c;
        do {
            c1939f = abstractFutureC1940g.f7881c;
        } while (!f7877f.mo3891j(abstractFutureC1940g, c1939f, p174p.C1939f.f7872c));
        while (c1939f != null) {
            java.lang.Thread thread = c1939f.f7873a;
            if (thread != null) {
                c1939f.f7873a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            c1939f = c1939f.f7874b;
        }
        do {
            c1936c = abstractFutureC1940g.f7880b;
        } while (!f7877f.mo3889h(abstractFutureC1940g, c1936c, p174p.C1936c.f7865b));
        p174p.C1936c c1936c2 = null;
        while (c1936c != null) {
            p174p.C1936c c1936c3 = c1936c.f7866a;
            c1936c.f7866a = c1936c2;
            c1936c2 = c1936c;
            c1936c = c1936c3;
        }
        while (c1936c2 != null) {
            c1936c2 = c1936c2.f7866a;
            try {
                throw null;
                break;
            } catch (java.lang.RuntimeException e4) {
                f7876e.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + ((java.lang.Object) null) + " with executor null", (java.lang.Throwable) e4);
            }
        }
    }

    /* renamed from: c */
    public static java.lang.Object m3893c(java.lang.Object obj) {
        if (obj instanceof p174p.C1934a) {
            java.util.concurrent.CancellationException cancellationException = ((p174p.C1934a) obj).f7864a;
            java.util.concurrent.CancellationException cancellationException2 = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof p174p.AbstractC1935b) {
            ((p174p.AbstractC1935b) obj).getClass();
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
        }
        if (obj == f7878g) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static java.lang.Object m3894d(p174p.AbstractFutureC1940g abstractFutureC1940g) {
        java.lang.Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = abstractFutureC1940g.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z4 = true;
            } catch (java.lang.Throwable th) {
                if (z4) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m3895a(java.lang.StringBuilder sb) {
        try {
            java.lang.Object m3894d = m3894d(this);
            sb.append("SUCCESS, result=[");
            sb.append(m3894d == this ? "this future" : java.lang.String.valueOf(m3894d));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        java.lang.Object obj = this.f7879a;
        if (obj != null) {
            return false;
        }
        if (!f7877f.mo3890i(this, obj, f7875d ? new p174p.C1934a(z4, new java.util.concurrent.CancellationException("Future.cancel() was called.")) : z4 ? p174p.C1934a.f7862b : p174p.C1934a.f7863c)) {
            return false;
        }
        m3892b(this);
        return true;
    }

    /* renamed from: e */
    public final void m3896e(p174p.C1939f c1939f) {
        c1939f.f7873a = null;
        while (true) {
            p174p.C1939f c1939f2 = this.f7881c;
            if (c1939f2 == p174p.C1939f.f7872c) {
                return;
            }
            p174p.C1939f c1939f3 = null;
            while (c1939f2 != null) {
                p174p.C1939f c1939f4 = c1939f2.f7874b;
                if (c1939f2.f7873a != null) {
                    c1939f3 = c1939f2;
                } else if (c1939f3 != null) {
                    c1939f3.f7874b = c1939f4;
                    if (c1939f3.f7873a == null) {
                        break;
                    }
                } else if (!f7877f.mo3891j(this, c1939f2, c1939f4)) {
                    break;
                }
                c1939f2 = c1939f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j4, java.util.concurrent.TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj = this.f7879a;
            if (obj != null) {
                return m3893c(obj);
            }
            long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                p174p.C1939f c1939f = this.f7881c;
                p174p.C1939f c1939f2 = p174p.C1939f.f7872c;
                if (c1939f != c1939f2) {
                    p174p.C1939f c1939f3 = new p174p.C1939f();
                    do {
                        p176p1.AbstractC1949a abstractC1949a = f7877f;
                        abstractC1949a.mo3887G(c1939f3, c1939f);
                        if (abstractC1949a.mo3891j(this, c1939f, c1939f3)) {
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                                if (!java.lang.Thread.interrupted()) {
                                    java.lang.Object obj2 = this.f7879a;
                                    if (obj2 != null) {
                                        return m3893c(obj2);
                                    }
                                    nanos = nanoTime - java.lang.System.nanoTime();
                                } else {
                                    m3896e(c1939f3);
                                    throw new java.lang.InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m3896e(c1939f3);
                        } else {
                            c1939f = this.f7881c;
                        }
                    } while (c1939f != c1939f2);
                }
                return m3893c(this.f7879a);
            }
            while (nanos > 0) {
                java.lang.Object obj3 = this.f7879a;
                if (obj3 != null) {
                    return m3893c(obj3);
                }
                if (!java.lang.Thread.interrupted()) {
                    nanos = nanoTime - java.lang.System.nanoTime();
                } else {
                    throw new java.lang.InterruptedException();
                }
            }
            java.lang.String abstractFutureC1940g = toString();
            java.lang.String obj4 = timeUnit.toString();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = obj4.toLowerCase(locale);
            java.lang.String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                java.lang.String str2 = str + " (plus ";
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, java.util.concurrent.TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                boolean z4 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    java.lang.String str3 = str2 + convert + " " + lowerCase;
                    if (z4) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z4) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new java.util.concurrent.TimeoutException(str + " but future completed as timeout expired");
            }
            throw new java.util.concurrent.TimeoutException(str + " for " + abstractFutureC1940g);
        }
        throw new java.lang.InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7879a instanceof p174p.C1934a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7879a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7879a instanceof p174p.C1934a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3895a(sb);
        } else {
            try {
                if (this instanceof java.util.concurrent.ScheduledFuture) {
                    str = "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (java.lang.RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m3895a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.f7879a;
            if (obj2 != null) {
                return m3893c(obj2);
            }
            p174p.C1939f c1939f = this.f7881c;
            p174p.C1939f c1939f2 = p174p.C1939f.f7872c;
            if (c1939f != c1939f2) {
                p174p.C1939f c1939f3 = new p174p.C1939f();
                do {
                    p176p1.AbstractC1949a abstractC1949a = f7877f;
                    abstractC1949a.mo3887G(c1939f3, c1939f);
                    if (abstractC1949a.mo3891j(this, c1939f, c1939f3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.f7879a;
                            } else {
                                m3896e(c1939f3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (obj == null);
                        return m3893c(obj);
                    }
                    c1939f = this.f7881c;
                } while (c1939f != c1939f2);
            }
            return m3893c(this.f7879a);
        }
        throw new java.lang.InterruptedException();
    }
}
