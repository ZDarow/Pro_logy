package u3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.C0519f;

/* loaded from: classes.dex */
public final class q extends v3.b implements d, e, v3.j {

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8649p = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: o, reason: collision with root package name */
    public int f8650o;

    public q(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // u3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(u3.e r18, b3.InterfaceC0190d r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.q.C(u3.e, b3.d):java.lang.Object");
    }

    @Override // u3.e
    public final Object a(Object obj, InterfaceC0190d interfaceC0190d) {
        if (obj == null) {
            obj = v3.l.f8732a;
        }
        b(null, obj);
        return Z2.g.f3186a;
    }

    public final boolean b(Object obj, Object obj2) {
        int i4;
        v3.c[] cVarArr;
        e2.f fVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8649p;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !k3.h.a(obj3, obj)) {
                return false;
            }
            if (k3.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f8650o;
            if ((i5 & 1) != 0) {
                this.f8650o = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f8650o = i6;
            v3.c[] cVarArr2 = this.f8713l;
            while (true) {
                s[] sVarArr = (s[]) cVarArr2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f8653a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                if (obj4 != null && obj4 != (fVar = r.f8652b)) {
                                    e2.f fVar2 = r.f8651a;
                                    if (obj4 != fVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, fVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0519f) obj4).i(Z2.g.f3186a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, fVar)) {
                                        if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i4 = this.f8650o;
                    if (i4 == i6) {
                        this.f8650o = i6 + 1;
                        return true;
                    }
                    cVarArr = this.f8713l;
                }
                cVarArr2 = cVarArr;
                i6 = i4;
            }
        }
    }

    @Override // v3.j
    public final d y(InterfaceC0195i interfaceC0195i, int i4, int i5) {
        return ((((i4 < 0 || i4 >= 2) && i4 != -2) || i5 != 2) && !((i4 == 0 || i4 == -3) && i5 == 1)) ? new v3.h(this, interfaceC0195i, i4, i5) : this;
    }
}
