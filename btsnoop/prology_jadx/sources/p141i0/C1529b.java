package p141i0;

/* renamed from: i0.b */
/* loaded from: classes.dex */
public final class C1529b implements p083V0.InterfaceC0767e, p098Z.InterfaceC0918c {

    /* renamed from: a */
    public final p098Z.C0923h f6356a;

    /* renamed from: b */
    public final java.lang.Object f6357b;

    /* renamed from: c */
    public final java.util.ArrayDeque f6358c;

    /* renamed from: d */
    public final java.util.ArrayDeque f6359d;

    /* renamed from: e */
    public final p098Z.C0921f[] f6360e;

    /* renamed from: f */
    public final p098Z.AbstractC0922g[] f6361f;

    /* renamed from: g */
    public int f6362g;

    /* renamed from: h */
    public int f6363h;

    /* renamed from: i */
    public p098Z.C0921f f6364i;

    /* renamed from: j */
    public p098Z.AbstractC0919d f6365j;

    /* renamed from: k */
    public boolean f6366k;

    /* renamed from: l */
    public boolean f6367l;

    /* renamed from: m */
    public long f6368m;

    /* renamed from: n */
    public final /* synthetic */ int f6369n;

    /* renamed from: o */
    public final java.lang.Object f6370o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1529b(p083V0.InterfaceC0774l interfaceC0774l) {
        this(new p083V0.C0771i[2], new p083V0.C0765c[2]);
        this.f6369n = 1;
        int i4 = this.f6362g;
        p098Z.C0921f[] c0921fArr = this.f6360e;
        p086W.AbstractC0781a.m1421j(i4 == c0921fArr.length);
        for (p098Z.C0921f c0921f : c0921fArr) {
            c0921f.m1752h(1024);
        }
        this.f6370o = interfaceC0774l;
    }

    @Override // p083V0.InterfaceC0767e
    /* renamed from: a */
    public void mo1400a(long j4) {
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: c */
    public final java.lang.Object mo1654c() {
        p098Z.C0921f c0921f;
        synchronized (this.f6357b) {
            try {
                p098Z.AbstractC0919d abstractC0919d = this.f6365j;
                if (abstractC0919d != null) {
                    throw abstractC0919d;
                }
                p086W.AbstractC0781a.m1421j(this.f6364i == null);
                int i4 = this.f6362g;
                if (i4 == 0) {
                    c0921f = null;
                } else {
                    p098Z.C0921f[] c0921fArr = this.f6360e;
                    int i5 = i4 - 1;
                    this.f6362g = i5;
                    c0921f = c0921fArr[i5];
                }
                this.f6364i = c0921f;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0921f;
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: e */
    public final void mo1656e(long j4) {
        boolean z4;
        synchronized (this.f6357b) {
            try {
                if (this.f6362g != this.f6360e.length && !this.f6366k) {
                    z4 = false;
                    p086W.AbstractC0781a.m1421j(z4);
                    this.f6368m = j4;
                }
                z4 = true;
                p086W.AbstractC0781a.m1421j(z4);
                this.f6368m = j4;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z.d, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z.d, java.lang.Exception] */
    /* renamed from: f */
    public final p098Z.AbstractC0919d m3394f(java.lang.Throwable th) {
        switch (this.f6369n) {
            case 0:
                return new java.lang.Exception("Unexpected decode error", th);
            default:
                return new java.lang.Exception("Unexpected decode error", th);
        }
    }

    @Override // p098Z.InterfaceC0918c
    public final void flush() {
        synchronized (this.f6357b) {
            try {
                this.f6366k = true;
                p098Z.C0921f c0921f = this.f6364i;
                if (c0921f != null) {
                    c0921f.mo1750e();
                    int i4 = this.f6362g;
                    this.f6362g = i4 + 1;
                    this.f6360e[i4] = c0921f;
                    this.f6364i = null;
                }
                while (!this.f6358c.isEmpty()) {
                    p098Z.C0921f c0921f2 = (p098Z.C0921f) this.f6358c.removeFirst();
                    c0921f2.mo1750e();
                    int i5 = this.f6362g;
                    this.f6362g = i5 + 1;
                    this.f6360e[i5] = c0921f2;
                }
                while (!this.f6359d.isEmpty()) {
                    ((p098Z.AbstractC0922g) this.f6359d.removeFirst()).mo1399f();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final p098Z.AbstractC0919d m3395g(p098Z.C0921f c0921f, p098Z.AbstractC0922g abstractC0922g, boolean z4) {
        switch (this.f6369n) {
            case 0:
                p141i0.C1528a c1528a = (p141i0.C1528a) abstractC0922g;
                try {
                    java.nio.ByteBuffer byteBuffer = c0921f.f3251p;
                    byteBuffer.getClass();
                    p086W.AbstractC0781a.m1421j(byteBuffer.hasArray());
                    p086W.AbstractC0781a.m1416e(byteBuffer.arrayOffset() == 0);
                    p107b0.C1169d c1169d = (p107b0.C1169d) this.f6370o;
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    c1169d.getClass();
                    c1528a.f6354p = p107b0.C1169d.m2736d(array, remaining);
                    c1528a.f3256n = c0921f.f3253r;
                    return null;
                } catch (p141i0.C1531d e4) {
                    return e4;
                }
            default:
                p083V0.C0771i c0771i = (p083V0.C0771i) c0921f;
                p083V0.C0765c c0765c = (p083V0.C0765c) abstractC0922g;
                try {
                    java.nio.ByteBuffer byteBuffer2 = c0771i.f3251p;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    p083V0.InterfaceC0774l interfaceC0774l = (p083V0.InterfaceC0774l) this.f6370o;
                    if (z4) {
                        interfaceC0774l.mo1403b();
                    }
                    p083V0.InterfaceC0766d mo1402F = interfaceC0774l.mo1402F(array2, 0, limit);
                    long j4 = c0771i.f3253r;
                    long j5 = c0771i.f2710u;
                    c0765c.f3256n = j4;
                    c0765c.f2694p = mo1402F;
                    if (j5 != Long.MAX_VALUE) {
                        j4 = j5;
                    }
                    c0765c.f2695q = j4;
                    c0765c.f3257o = false;
                    return null;
                } catch (p083V0.C0768f e5) {
                    return e5;
                }
        }
    }

    /* renamed from: h */
    public final boolean m3396h() {
        boolean z4;
        p098Z.AbstractC0919d m3394f;
        synchronized (this.f6357b) {
            while (!this.f6367l) {
                try {
                    if (!this.f6358c.isEmpty() && this.f6363h > 0) {
                        break;
                    }
                    this.f6357b.wait();
                } finally {
                }
            }
            if (this.f6367l) {
                return false;
            }
            p098Z.C0921f c0921f = (p098Z.C0921f) this.f6358c.removeFirst();
            p098Z.AbstractC0922g[] abstractC0922gArr = this.f6361f;
            int i4 = this.f6363h - 1;
            this.f6363h = i4;
            p098Z.AbstractC0922g abstractC0922g = abstractC0922gArr[i4];
            boolean z5 = this.f6366k;
            this.f6366k = false;
            if (c0921f.m1138c(4)) {
                abstractC0922g.m1137a(4);
            } else {
                abstractC0922g.f3256n = c0921f.f3253r;
                if (c0921f.m1138c(134217728)) {
                    abstractC0922g.m1137a(134217728);
                }
                long j4 = c0921f.f3253r;
                synchronized (this.f6357b) {
                    long j5 = this.f6368m;
                    if (j5 != -9223372036854775807L && j4 < j5) {
                        z4 = false;
                    }
                    z4 = true;
                }
                if (!z4) {
                    abstractC0922g.f3257o = true;
                }
                try {
                    m3394f = m3395g(c0921f, abstractC0922g, z5);
                } catch (java.lang.OutOfMemoryError e4) {
                    m3394f = m3394f(e4);
                } catch (java.lang.RuntimeException e5) {
                    m3394f = m3394f(e5);
                }
                if (m3394f != null) {
                    synchronized (this.f6357b) {
                        this.f6365j = m3394f;
                    }
                    return false;
                }
            }
            synchronized (this.f6357b) {
                try {
                    if (this.f6366k) {
                        abstractC0922g.mo1399f();
                    } else if (abstractC0922g.f3257o) {
                        abstractC0922g.mo1399f();
                    } else {
                        this.f6359d.addLast(abstractC0922g);
                    }
                    c0921f.mo1750e();
                    int i5 = this.f6362g;
                    this.f6362g = i5 + 1;
                    this.f6360e[i5] = c0921f;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final p098Z.AbstractC0922g mo1637b() {
        synchronized (this.f6357b) {
            try {
                p098Z.AbstractC0919d abstractC0919d = this.f6365j;
                if (abstractC0919d != null) {
                    throw abstractC0919d;
                }
                if (this.f6359d.isEmpty()) {
                    return null;
                }
                return (p098Z.AbstractC0922g) this.f6359d.removeFirst();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void mo1655d(p098Z.C0921f c0921f) {
        synchronized (this.f6357b) {
            try {
                p098Z.AbstractC0919d abstractC0919d = this.f6365j;
                if (abstractC0919d != null) {
                    throw abstractC0919d;
                }
                p086W.AbstractC0781a.m1416e(c0921f == this.f6364i);
                this.f6358c.addLast(c0921f);
                if (!this.f6358c.isEmpty() && this.f6363h > 0) {
                    this.f6357b.notify();
                }
                this.f6364i = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void m3399k(p098Z.AbstractC0922g abstractC0922g) {
        synchronized (this.f6357b) {
            abstractC0922g.mo1398e();
            int i4 = this.f6363h;
            this.f6363h = i4 + 1;
            this.f6361f[i4] = abstractC0922g;
            if (!this.f6358c.isEmpty() && this.f6363h > 0) {
                this.f6357b.notify();
            }
        }
    }

    @Override // p098Z.InterfaceC0918c
    public final void release() {
        synchronized (this.f6357b) {
            this.f6367l = true;
            this.f6357b.notify();
        }
        try {
            this.f6356a.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public C1529b(p098Z.C0921f[] c0921fArr, p098Z.AbstractC0922g[] abstractC0922gArr) {
        p098Z.AbstractC0922g c1528a;
        p098Z.C0921f c0921f;
        this.f6357b = new java.lang.Object();
        this.f6368m = -9223372036854775807L;
        this.f6358c = new java.util.ArrayDeque();
        this.f6359d = new java.util.ArrayDeque();
        this.f6360e = c0921fArr;
        this.f6362g = c0921fArr.length;
        for (int i4 = 0; i4 < this.f6362g; i4++) {
            p098Z.C0921f[] c0921fArr2 = this.f6360e;
            switch (this.f6369n) {
                case 0:
                    c0921f = new p098Z.C0921f(1);
                    break;
                default:
                    c0921f = new p098Z.C0921f(1);
                    break;
            }
            c0921fArr2[i4] = c0921f;
        }
        this.f6361f = abstractC0922gArr;
        this.f6363h = abstractC0922gArr.length;
        for (int i5 = 0; i5 < this.f6363h; i5++) {
            p098Z.AbstractC0922g[] abstractC0922gArr2 = this.f6361f;
            switch (this.f6369n) {
                case 0:
                    c1528a = new p141i0.C1528a(this);
                    break;
                default:
                    c1528a = new p083V0.C0765c(this);
                    break;
            }
            abstractC0922gArr2[i5] = c1528a;
        }
        p098Z.C0923h c0923h = new p098Z.C0923h(this);
        this.f6356a = c0923h;
        c0923h.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1529b(p107b0.C1169d c1169d) {
        this(new p098Z.C0921f[1], new p141i0.C1528a[1]);
        this.f6369n = 0;
        this.f6370o = c1169d;
    }
}
