package p047L2;

/* renamed from: L2.v */
/* loaded from: classes.dex */
public final class C0392v implements p047L2.InterfaceC0387q {

    /* renamed from: a */
    public static final p047L2.C0392v f1138a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L2.v] */
    static {
        p047L2.C0391u c0391u = p047L2.C0391u.f1135a;
        f1138a = new java.lang.Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, L2.t] */
    @Override // p047L2.InterfaceC0387q
    /* renamed from: a */
    public final java.nio.ByteBuffer mo833a(p047L2.C0384n c0384n) {
        ?? byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        p047L2.C0391u c0391u = p047L2.C0391u.f1135a;
        c0391u.mo851k(byteArrayOutputStream, c0384n.f1133a);
        c0391u.mo851k(byteArrayOutputStream, c0384n.f1134b);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.m842a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, L2.t] */
    @Override // p047L2.InterfaceC0387q
    /* renamed from: b */
    public final java.nio.ByteBuffer mo834b(java.lang.Object obj) {
        ?? byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        p047L2.C0391u.f1135a.mo851k(byteArrayOutputStream, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.m842a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // p047L2.InterfaceC0387q
    /* renamed from: c */
    public final p047L2.C0384n mo835c(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        p047L2.C0391u c0391u = p047L2.C0391u.f1135a;
        java.lang.Object m849e = c0391u.m849e(byteBuffer);
        java.lang.Object m849e2 = c0391u.m849e(byteBuffer);
        if (!(m849e instanceof java.lang.String) || byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Method call corrupted");
        }
        return new p047L2.C0384n(m849e2, (java.lang.String) m849e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // p047L2.InterfaceC0387q
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo836d(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L46
            goto L1e
        L11:
            L2.u r0 = p047L2.C0391u.f1135a
            java.lang.Object r0 = r0.m849e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            L2.u r0 = p047L2.C0391u.f1135a
            java.lang.Object r1 = r0.m849e(r5)
            java.lang.Object r2 = r0.m849e(r5)
            java.lang.Object r0 = r0.m849e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L46
            if (r2 == 0) goto L36
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L46
        L36:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L46
            L2.j r5 = new L2.j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p047L2.C0392v.mo836d(java.nio.ByteBuffer):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, L2.t] */
    @Override // p047L2.InterfaceC0387q
    /* renamed from: e */
    public final java.nio.ByteBuffer mo837e(java.lang.String str, java.lang.String str2) {
        ?? byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        p047L2.C0391u c0391u = p047L2.C0391u.f1135a;
        c0391u.mo851k(byteArrayOutputStream, "error");
        c0391u.mo851k(byteArrayOutputStream, str);
        byteArrayOutputStream.write(0);
        c0391u.mo851k(byteArrayOutputStream, str2);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.m842a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, L2.t] */
    @Override // p047L2.InterfaceC0387q
    /* renamed from: f */
    public final java.nio.ByteBuffer mo838f(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        ?? byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        p047L2.C0391u c0391u = p047L2.C0391u.f1135a;
        c0391u.mo851k(byteArrayOutputStream, str);
        c0391u.mo851k(byteArrayOutputStream, str2);
        if (obj instanceof java.lang.Throwable) {
            c0391u.mo851k(byteArrayOutputStream, android.util.Log.getStackTraceString((java.lang.Throwable) obj));
        } else {
            c0391u.mo851k(byteArrayOutputStream, obj);
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.m842a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
}
