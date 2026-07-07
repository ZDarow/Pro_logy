package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f7584d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f7585e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0462a f7586f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f7587g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f7588a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f7589b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f7590c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [p1.a] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r4 = new Object();
        }
        f7586f = r4;
        if (th != null) {
            f7585e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7587g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f7590c;
        } while (!f7586f.j(gVar, fVar, f.f7581c));
        while (fVar != null) {
            Thread thread = fVar.f7582a;
            if (thread != null) {
                fVar.f7582a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f7583b;
        }
        do {
            cVar = gVar.f7589b;
        } while (!f7586f.h(gVar, cVar, c.f7574b));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f7575a;
            cVar.f7575a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f7575a;
            try {
                throw null;
                break;
            } catch (RuntimeException e4) {
                f7585e.log(Level.SEVERE, "RuntimeException while executing runnable " + ((Object) null) + " with executor null", (Throwable) e4);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0459a) {
            CancellationException cancellationException = ((C0459a) obj).f7573a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0460b) {
            ((AbstractC0460b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f7587g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d4 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d4 == this ? "this future" : String.valueOf(d4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f7588a;
        if (obj != null) {
            return false;
        }
        if (!f7586f.i(this, obj, f7584d ? new C0459a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C0459a.f7571b : C0459a.f7572c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f7582a = null;
        while (true) {
            f fVar2 = this.f7590c;
            if (fVar2 == f.f7581c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f7583b;
                if (fVar2.f7582a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f7583b = fVar4;
                    if (fVar3.f7582a == null) {
                        break;
                    }
                } else if (!f7586f.j(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.f7588a;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.f7590c;
                f fVar2 = f.f7581c;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        AbstractC0462a abstractC0462a = f7586f;
                        abstractC0462a.G(fVar3, fVar);
                        if (abstractC0462a.j(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7588a;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar = this.f7590c;
                        }
                    } while (fVar != fVar2);
                }
                return c(this.f7588a);
            }
            while (nanos > 0) {
                Object obj3 = this.f7588a;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                boolean z4 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
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
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7588a instanceof C0459a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7588a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7588a instanceof C0459a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7588a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f7590c;
            f fVar2 = f.f7581c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0462a abstractC0462a = f7586f;
                    abstractC0462a.G(fVar3, fVar);
                    if (abstractC0462a.j(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7588a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f7590c;
                } while (fVar != fVar2);
            }
            return c(this.f7588a);
        }
        throw new InterruptedException();
    }
}
