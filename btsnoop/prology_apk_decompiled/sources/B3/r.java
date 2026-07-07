package B3;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f267a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f268b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f269c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f268b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f269c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        k3.h.e(qVar, "segment");
        if (qVar.f265f != null || qVar.f266g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.f263d) {
            return;
        }
        AtomicReference atomicReference = f269c[(int) (Thread.currentThread().getId() & (f268b - 1))];
        q qVar2 = f267a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i4 = qVar3 != null ? qVar3.f262c : 0;
        if (i4 >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f265f = qVar3;
        qVar.f261b = 0;
        qVar.f262c = i4 + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f269c[(int) (Thread.currentThread().getId() & (f268b - 1))];
        q qVar = f267a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f265f);
        qVar2.f265f = null;
        qVar2.f262c = 0;
        return qVar2;
    }
}
