package B3;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p implements t, ReadableByteChannel {

    /* renamed from: l, reason: collision with root package name */
    public final t f257l;

    /* renamed from: m, reason: collision with root package name */
    public final a f258m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f259n;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, B3.a] */
    public p(t tVar) {
        k3.h.e(tVar, "source");
        this.f257l = tVar;
        this.f258m = new Object();
    }

    public final int a() {
        f(4L);
        int h4 = this.f258m.h();
        return ((h4 & 255) << 24) | (((-16777216) & h4) >>> 24) | ((16711680 & h4) >>> 8) | ((65280 & h4) << 8);
    }

    public final long b() {
        long j4;
        f(8L);
        a aVar = this.f258m;
        if (aVar.f224m < 8) {
            throw new EOFException();
        }
        q qVar = aVar.f223l;
        k3.h.b(qVar);
        int i4 = qVar.f261b;
        int i5 = qVar.f262c;
        if (i5 - i4 < 8) {
            j4 = ((aVar.h() & 4294967295L) << 32) | (4294967295L & aVar.h());
        } else {
            byte[] bArr = qVar.f260a;
            int i6 = i4 + 7;
            long j5 = ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
            int i7 = i4 + 8;
            long j6 = j5 | (bArr[i6] & 255);
            aVar.f224m -= 8;
            if (i7 == i5) {
                aVar.f223l = qVar.a();
                r.a(qVar);
            } else {
                qVar.f261b = i7;
            }
            j4 = j6;
        }
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    public final short c() {
        short s;
        f(2L);
        a aVar = this.f258m;
        if (aVar.f224m < 2) {
            throw new EOFException();
        }
        q qVar = aVar.f223l;
        k3.h.b(qVar);
        int i4 = qVar.f261b;
        int i5 = qVar.f262c;
        if (i5 - i4 < 2) {
            s = (short) ((aVar.e() & 255) | ((aVar.e() & 255) << 8));
        } else {
            int i6 = i4 + 1;
            byte[] bArr = qVar.f260a;
            int i7 = (bArr[i4] & 255) << 8;
            int i8 = i4 + 2;
            int i9 = (bArr[i6] & 255) | i7;
            aVar.f224m -= 2;
            if (i8 == i5) {
                aVar.f223l = qVar.a();
                r.a(qVar);
            } else {
                qVar.f261b = i8;
            }
            s = (short) i9;
        }
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f259n) {
            return;
        }
        this.f259n = true;
        this.f257l.close();
        a aVar = this.f258m;
        aVar.i(aVar.f224m);
    }

    @Override // B3.t
    public final long d(a aVar, long j4) {
        k3.h.e(aVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f259n) {
            throw new IllegalStateException("closed");
        }
        a aVar2 = this.f258m;
        if (aVar2.f224m == 0 && this.f257l.d(aVar2, 8192L) == -1) {
            return -1L;
        }
        return aVar2.d(aVar, Math.min(j4, aVar2.f224m));
    }

    public final String e(long j4) {
        f(j4);
        a aVar = this.f258m;
        aVar.getClass();
        Charset charset = q3.a.f7945a;
        k3.h.e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (aVar.f224m < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        q qVar = aVar.f223l;
        k3.h.b(qVar);
        int i4 = qVar.f261b;
        if (i4 + j4 > qVar.f262c) {
            return new String(aVar.f(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(qVar.f260a, i4, i5, charset);
        int i6 = qVar.f261b + i5;
        qVar.f261b = i6;
        aVar.f224m -= j4;
        if (i6 == qVar.f262c) {
            aVar.f223l = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final void f(long j4) {
        a aVar;
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f259n) {
            throw new IllegalStateException("closed");
        }
        do {
            aVar = this.f258m;
            if (aVar.f224m >= j4) {
                return;
            }
        } while (this.f257l.d(aVar, 8192L) != -1);
        throw new EOFException();
    }

    public final void g(long j4) {
        if (this.f259n) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            a aVar = this.f258m;
            if (aVar.f224m == 0 && this.f257l.d(aVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, aVar.f224m);
            aVar.i(min);
            j4 -= min;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f259n;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k3.h.e(byteBuffer, "sink");
        a aVar = this.f258m;
        if (aVar.f224m == 0 && this.f257l.d(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f257l + ')';
    }
}
