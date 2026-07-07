package r3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class X implements L {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8134m = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleting");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8135n = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_rootCause");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8136o = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f8137l;

    public X(a0 a0Var, Throwable th) {
        this.f8137l = a0Var;
        this._rootCause = th;
    }

    @Override // r3.L
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable c4 = c();
        if (c4 == null) {
            f8135n.set(this, th);
            return;
        }
        if (th == c4) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8136o;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable c() {
        return (Throwable) f8135n.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return f8134m.get(this) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8136o;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c4 = c();
        if (c4 != null) {
            arrayList.add(0, c4);
        }
        if (th != null && !th.equals(c4)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0534v.f8185g);
        return arrayList;
    }

    @Override // r3.L
    public final a0 g() {
        return this.f8137l;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f8136o.get(this) + ", list=" + this.f8137l + ']';
    }
}
