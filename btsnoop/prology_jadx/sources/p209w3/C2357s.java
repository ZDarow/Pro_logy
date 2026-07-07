package p209w3;

/* renamed from: w3.s */
/* loaded from: classes.dex */
public final class C2357s {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public C2357s(int i4) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i4);
    }

    /* renamed from: a */
    public final int m4569a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final java.lang.Object m4570b(int i4) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        if (i4 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i4);
        }
        return null;
    }

    /* renamed from: c */
    public final void m4571c(int i4, p218y3.C2418a c2418a) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i4 < length) {
            atomicReferenceArray.set(i4, c2418a);
            return;
        }
        int i5 = i4 + 1;
        int i6 = length * 2;
        if (i5 < i6) {
            i5 = i6;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i5);
        for (int i7 = 0; i7 < length; i7++) {
            atomicReferenceArray2.set(i7, atomicReferenceArray.get(i7));
        }
        atomicReferenceArray2.set(i4, c2418a);
        this.array = atomicReferenceArray2;
    }
}
