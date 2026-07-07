package p010B3;

/* renamed from: B3.r */
/* loaded from: classes.dex */
public abstract class AbstractC0087r {

    /* renamed from: a */
    public static final p010B3.C0086q f272a = new p010B3.C0086q(new byte[0], 0, 0, false);

    /* renamed from: b */
    public static final int f273b;

    /* renamed from: c */
    public static final java.util.concurrent.atomic.AtomicReference[] f274c;

    static {
        int highestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f273b = highestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new java.util.concurrent.atomic.AtomicReference();
        }
        f274c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m351a(p010B3.C0086q c0086q) {
        p154k3.AbstractC1803h.m3779e(c0086q, "segment");
        if (c0086q.f270f != null || c0086q.f271g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (c0086q.f268d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f274c[(int) (java.lang.Thread.currentThread().getId() & (f273b - 1))];
        p010B3.C0086q c0086q2 = f272a;
        p010B3.C0086q c0086q3 = (p010B3.C0086q) atomicReference.getAndSet(c0086q2);
        if (c0086q3 == c0086q2) {
            return;
        }
        int i4 = c0086q3 != null ? c0086q3.f267c : 0;
        if (i4 >= 65536) {
            atomicReference.set(c0086q3);
            return;
        }
        c0086q.f270f = c0086q3;
        c0086q.f266b = 0;
        c0086q.f267c = i4 + 8192;
        atomicReference.set(c0086q);
    }

    /* renamed from: b */
    public static final p010B3.C0086q m352b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = f274c[(int) (java.lang.Thread.currentThread().getId() & (f273b - 1))];
        p010B3.C0086q c0086q = f272a;
        p010B3.C0086q c0086q2 = (p010B3.C0086q) atomicReference.getAndSet(c0086q);
        if (c0086q2 == c0086q) {
            return new p010B3.C0086q();
        }
        if (c0086q2 == null) {
            atomicReference.set(null);
            return new p010B3.C0086q();
        }
        atomicReference.set(c0086q2.f270f);
        c0086q2.f270f = null;
        c0086q2.f267c = 0;
        return c0086q2;
    }
}
