package p187r3;

/* renamed from: r3.X */
/* loaded from: classes.dex */
public final class C2095X implements p187r3.InterfaceC2084L {

    /* renamed from: m */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8451m = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p187r3.C2095X.class, "_isCompleting");

    /* renamed from: n */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8452n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.C2095X.class, java.lang.Object.class, "_rootCause");

    /* renamed from: o */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8453o = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.C2095X.class, java.lang.Object.class, "_exceptionsHolder");
    private volatile java.lang.Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile java.lang.Object _rootCause;

    /* renamed from: l */
    public final p187r3.C2099a0 f8454l;

    public C2095X(p187r3.C2099a0 c2099a0, java.lang.Throwable th) {
        this.f8454l = c2099a0;
        this._rootCause = th;
    }

    @Override // p187r3.InterfaceC2084L
    /* renamed from: a */
    public final boolean mo4157a() {
        return m4177c() == null;
    }

    /* renamed from: b */
    public final void m4176b(java.lang.Throwable th) {
        java.lang.Throwable m4177c = m4177c();
        if (m4177c == null) {
            f8452n.set(this, th);
            return;
        }
        if (th == m4177c) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8453o;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof java.util.ArrayList) {
                ((java.util.ArrayList) obj).add(th);
                return;
            } else {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* renamed from: c */
    public final java.lang.Throwable m4177c() {
        return (java.lang.Throwable) f8452n.get(this);
    }

    /* renamed from: d */
    public final boolean m4178d() {
        return m4177c() != null;
    }

    /* renamed from: e */
    public final boolean m4179e() {
        return f8451m.get(this) != 0;
    }

    /* renamed from: f */
    public final java.util.ArrayList m4180f(java.lang.Throwable th) {
        java.util.ArrayList arrayList;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8453o;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (obj instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (java.util.ArrayList) obj;
        }
        java.lang.Throwable m4177c = m4177c();
        if (m4177c != null) {
            arrayList.add(0, m4177c);
        }
        if (th != null && !th.equals(m4177c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, p187r3.AbstractC2131v.f8503g);
        return arrayList;
    }

    @Override // p187r3.InterfaceC2084L
    /* renamed from: g */
    public final p187r3.C2099a0 mo4158g() {
        return this.f8454l;
    }

    public final java.lang.String toString() {
        return "Finishing[cancelling=" + m4178d() + ", completing=" + m4179e() + ", rootCause=" + m4177c() + ", exceptions=" + f8453o.get(this) + ", list=" + this.f8454l + ']';
    }
}
