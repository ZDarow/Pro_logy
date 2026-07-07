package p200u3;

/* renamed from: u3.q */
/* loaded from: classes.dex */
public final class C2263q extends p205v3.AbstractC2286b implements p200u3.InterfaceC2250d, p200u3.InterfaceC2251e, p205v3.InterfaceC2294j {

    /* renamed from: p */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8999p = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p200u3.C2263q.class, java.lang.Object.class, "_state");
    private volatile java.lang.Object _state;

    /* renamed from: o */
    public int f9000o;

    public C2263q(java.lang.Object obj) {
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
    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo266C(p200u3.InterfaceC2251e r18, p110b3.InterfaceC1190d r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p200u3.C2263q.mo266C(u3.e, b3.d):java.lang.Object");
    }

    @Override // p200u3.InterfaceC2251e
    /* renamed from: a */
    public final java.lang.Object mo707a(java.lang.Object obj, p110b3.InterfaceC1190d interfaceC1190d) {
        if (obj == null) {
            obj = p205v3.AbstractC2296l.f9086a;
        }
        m4449b(null, obj);
        return p100Z2.C0934g.f3298a;
    }

    /* renamed from: b */
    public final boolean m4449b(java.lang.Object obj, java.lang.Object obj2) {
        int i4;
        p205v3.AbstractC2287c[] abstractC2287cArr;
        p124e2.C1358f c1358f;
        synchronized (this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8999p;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p154k3.AbstractC1803h.m3775a(obj3, obj)) {
                return false;
            }
            if (p154k3.AbstractC1803h.m3775a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f9000o;
            if ((i5 & 1) != 0) {
                this.f9000o = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f9000o = i6;
            p205v3.AbstractC2287c[] abstractC2287cArr2 = this.f9066l;
            while (true) {
                p200u3.C2265s[] c2265sArr = (p200u3.C2265s[]) abstractC2287cArr2;
                if (c2265sArr != null) {
                    for (p200u3.C2265s c2265s : c2265sArr) {
                        if (c2265s != null) {
                            while (true) {
                                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p200u3.C2265s.f9003a;
                                java.lang.Object obj4 = atomicReferenceFieldUpdater2.get(c2265s);
                                if (obj4 != null && obj4 != (c1358f = p200u3.AbstractC2264r.f9002b)) {
                                    p124e2.C1358f c1358f2 = p200u3.AbstractC2264r.f9001a;
                                    if (obj4 != c1358f2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(c2265s, obj4, c1358f2)) {
                                            if (atomicReferenceFieldUpdater2.get(c2265s) != obj4) {
                                                break;
                                            }
                                        }
                                        ((p187r3.C2108f) obj4).mo2836i(p100Z2.C0934g.f3298a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(c2265s, obj4, c1358f)) {
                                        if (atomicReferenceFieldUpdater2.get(c2265s) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i4 = this.f9000o;
                    if (i4 == i6) {
                        this.f9000o = i6 + 1;
                        return true;
                    }
                    abstractC2287cArr = this.f9066l;
                }
                abstractC2287cArr2 = abstractC2287cArr;
                i6 = i4;
            }
        }
    }

    @Override // p205v3.InterfaceC2294j
    /* renamed from: y */
    public final p200u3.InterfaceC2250d mo4450y(p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        return ((((i4 < 0 || i4 >= 2) && i4 != -2) || i5 != 2) && !((i4 == 0 || i4 == -3) && i5 == 1)) ? new p205v3.C2292h(this, interfaceC1195i, i4, i5) : this;
    }
}
