package i0;

import V0.i;
import V0.l;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340b implements V0.e, Z.c {

    /* renamed from: a, reason: collision with root package name */
    public final Z.h f6127a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6128b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f6129c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6130d;

    /* renamed from: e, reason: collision with root package name */
    public final Z.f[] f6131e;

    /* renamed from: f, reason: collision with root package name */
    public final Z.g[] f6132f;

    /* renamed from: g, reason: collision with root package name */
    public int f6133g;

    /* renamed from: h, reason: collision with root package name */
    public int f6134h;

    /* renamed from: i, reason: collision with root package name */
    public Z.f f6135i;

    /* renamed from: j, reason: collision with root package name */
    public Z.d f6136j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6137k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6138l;

    /* renamed from: m, reason: collision with root package name */
    public long f6139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6140n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6141o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0340b(l lVar) {
        this(new i[2], new V0.c[2]);
        this.f6140n = 1;
        int i4 = this.f6133g;
        Z.f[] fVarArr = this.f6131e;
        W.a.j(i4 == fVarArr.length);
        for (Z.f fVar : fVarArr) {
            fVar.h(1024);
        }
        this.f6141o = lVar;
    }

    @Override // V0.e
    public void a(long j4) {
    }

    @Override // Z.c
    public final Object c() {
        Z.f fVar;
        synchronized (this.f6128b) {
            try {
                Z.d dVar = this.f6136j;
                if (dVar != null) {
                    throw dVar;
                }
                W.a.j(this.f6135i == null);
                int i4 = this.f6133g;
                if (i4 == 0) {
                    fVar = null;
                } else {
                    Z.f[] fVarArr = this.f6131e;
                    int i5 = i4 - 1;
                    this.f6133g = i5;
                    fVar = fVarArr[i5];
                }
                this.f6135i = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // Z.c
    public final void e(long j4) {
        boolean z4;
        synchronized (this.f6128b) {
            try {
                if (this.f6133g != this.f6131e.length && !this.f6137k) {
                    z4 = false;
                    W.a.j(z4);
                    this.f6139m = j4;
                }
                z4 = true;
                W.a.j(z4);
                this.f6139m = j4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z.d, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z.d, java.lang.Exception] */
    public final Z.d f(Throwable th) {
        switch (this.f6140n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    @Override // Z.c
    public final void flush() {
        synchronized (this.f6128b) {
            try {
                this.f6137k = true;
                Z.f fVar = this.f6135i;
                if (fVar != null) {
                    fVar.e();
                    int i4 = this.f6133g;
                    this.f6133g = i4 + 1;
                    this.f6131e[i4] = fVar;
                    this.f6135i = null;
                }
                while (!this.f6129c.isEmpty()) {
                    Z.f fVar2 = (Z.f) this.f6129c.removeFirst();
                    fVar2.e();
                    int i5 = this.f6133g;
                    this.f6133g = i5 + 1;
                    this.f6131e[i5] = fVar2;
                }
                while (!this.f6130d.isEmpty()) {
                    ((Z.g) this.f6130d.removeFirst()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Z.d g(Z.f fVar, Z.g gVar, boolean z4) {
        switch (this.f6140n) {
            case 0:
                C0339a c0339a = (C0339a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f3140p;
                    byteBuffer.getClass();
                    W.a.j(byteBuffer.hasArray());
                    W.a.e(byteBuffer.arrayOffset() == 0);
                    b0.d dVar = (b0.d) this.f6141o;
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    dVar.getClass();
                    c0339a.f6125p = b0.d.d(array, remaining);
                    c0339a.f3144n = fVar.f3142r;
                    return null;
                } catch (d e4) {
                    return e4;
                }
            default:
                i iVar = (i) fVar;
                V0.c cVar = (V0.c) gVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f3140p;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    l lVar = (l) this.f6141o;
                    if (z4) {
                        lVar.b();
                    }
                    V0.d F3 = lVar.F(array2, 0, limit);
                    long j4 = iVar.f3142r;
                    long j5 = iVar.f2618u;
                    cVar.f3144n = j4;
                    cVar.f2603p = F3;
                    if (j5 != Long.MAX_VALUE) {
                        j4 = j5;
                    }
                    cVar.f2604q = j4;
                    cVar.f3145o = false;
                    return null;
                } catch (V0.f e5) {
                    return e5;
                }
        }
    }

    public final boolean h() {
        boolean z4;
        Z.d f4;
        synchronized (this.f6128b) {
            while (!this.f6138l) {
                try {
                    if (!this.f6129c.isEmpty() && this.f6134h > 0) {
                        break;
                    }
                    this.f6128b.wait();
                } finally {
                }
            }
            if (this.f6138l) {
                return false;
            }
            Z.f fVar = (Z.f) this.f6129c.removeFirst();
            Z.g[] gVarArr = this.f6132f;
            int i4 = this.f6134h - 1;
            this.f6134h = i4;
            Z.g gVar = gVarArr[i4];
            boolean z5 = this.f6137k;
            this.f6137k = false;
            if (fVar.c(4)) {
                gVar.a(4);
            } else {
                gVar.f3144n = fVar.f3142r;
                if (fVar.c(134217728)) {
                    gVar.a(134217728);
                }
                long j4 = fVar.f3142r;
                synchronized (this.f6128b) {
                    long j5 = this.f6139m;
                    if (j5 != -9223372036854775807L && j4 < j5) {
                        z4 = false;
                    }
                    z4 = true;
                }
                if (!z4) {
                    gVar.f3145o = true;
                }
                try {
                    f4 = g(fVar, gVar, z5);
                } catch (OutOfMemoryError e4) {
                    f4 = f(e4);
                } catch (RuntimeException e5) {
                    f4 = f(e5);
                }
                if (f4 != null) {
                    synchronized (this.f6128b) {
                        this.f6136j = f4;
                    }
                    return false;
                }
            }
            synchronized (this.f6128b) {
                try {
                    if (this.f6137k) {
                        gVar.f();
                    } else if (gVar.f3145o) {
                        gVar.f();
                    } else {
                        this.f6130d.addLast(gVar);
                    }
                    fVar.e();
                    int i5 = this.f6133g;
                    this.f6133g = i5 + 1;
                    this.f6131e[i5] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // Z.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Z.g b() {
        synchronized (this.f6128b) {
            try {
                Z.d dVar = this.f6136j;
                if (dVar != null) {
                    throw dVar;
                }
                if (this.f6130d.isEmpty()) {
                    return null;
                }
                return (Z.g) this.f6130d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void d(Z.f fVar) {
        synchronized (this.f6128b) {
            try {
                Z.d dVar = this.f6136j;
                if (dVar != null) {
                    throw dVar;
                }
                W.a.e(fVar == this.f6135i);
                this.f6129c.addLast(fVar);
                if (!this.f6129c.isEmpty() && this.f6134h > 0) {
                    this.f6128b.notify();
                }
                this.f6135i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Z.g gVar) {
        synchronized (this.f6128b) {
            gVar.e();
            int i4 = this.f6134h;
            this.f6134h = i4 + 1;
            this.f6132f[i4] = gVar;
            if (!this.f6129c.isEmpty() && this.f6134h > 0) {
                this.f6128b.notify();
            }
        }
    }

    @Override // Z.c
    public final void release() {
        synchronized (this.f6128b) {
            this.f6138l = true;
            this.f6128b.notify();
        }
        try {
            this.f6127a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C0340b(Z.f[] fVarArr, Z.g[] gVarArr) {
        Z.g c0339a;
        Z.f fVar;
        this.f6128b = new Object();
        this.f6139m = -9223372036854775807L;
        this.f6129c = new ArrayDeque();
        this.f6130d = new ArrayDeque();
        this.f6131e = fVarArr;
        this.f6133g = fVarArr.length;
        for (int i4 = 0; i4 < this.f6133g; i4++) {
            Z.f[] fVarArr2 = this.f6131e;
            switch (this.f6140n) {
                case 0:
                    fVar = new Z.f(1);
                    break;
                default:
                    fVar = new Z.f(1);
                    break;
            }
            fVarArr2[i4] = fVar;
        }
        this.f6132f = gVarArr;
        this.f6134h = gVarArr.length;
        for (int i5 = 0; i5 < this.f6134h; i5++) {
            Z.g[] gVarArr2 = this.f6132f;
            switch (this.f6140n) {
                case 0:
                    c0339a = new C0339a(this);
                    break;
                default:
                    c0339a = new V0.c(this);
                    break;
            }
            gVarArr2[i5] = c0339a;
        }
        Z.h hVar = new Z.h(this);
        this.f6127a = hVar;
        hVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0340b(b0.d dVar) {
        this(new Z.f[1], new C0339a[1]);
        this.f6140n = 0;
        this.f6141o = dVar;
    }
}
