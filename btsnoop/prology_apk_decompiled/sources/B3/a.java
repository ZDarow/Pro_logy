package B3;

import B2.AbstractC0007h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public final class a implements t, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: l, reason: collision with root package name */
    public q f223l;

    /* renamed from: m, reason: collision with root package name */
    public long f224m;

    public final byte a(long j4) {
        U1.a.d(this.f224m, j4, 1L);
        q qVar = this.f223l;
        if (qVar == null) {
            k3.h.b(null);
            throw null;
        }
        long j5 = this.f224m;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                qVar = qVar.f266g;
                k3.h.b(qVar);
                j5 -= qVar.f262c - qVar.f261b;
            }
            return qVar.f260a[(int) ((qVar.f261b + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            int i4 = qVar.f262c;
            int i5 = qVar.f261b;
            long j7 = (i4 - i5) + j6;
            if (j7 > j4) {
                return qVar.f260a[(int) ((i5 + j4) - j6)];
            }
            qVar = qVar.f265f;
            k3.h.b(qVar);
            j6 = j7;
        }
    }

    public final long b(b bVar) {
        int i4;
        int i5;
        k3.h.e(bVar, "targetBytes");
        q qVar = this.f223l;
        if (qVar == null) {
            return -1L;
        }
        long j4 = this.f224m;
        long j5 = 0;
        byte[] bArr = bVar.f226l;
        if (j4 < 0) {
            while (j4 > 0) {
                qVar = qVar.f266g;
                k3.h.b(qVar);
                j4 -= qVar.f262c - qVar.f261b;
            }
            if (bArr.length == 2) {
                byte b4 = bArr[0];
                byte b5 = bArr[1];
                while (j4 < this.f224m) {
                    i4 = (int) ((qVar.f261b + j5) - j4);
                    int i6 = qVar.f262c;
                    while (i4 < i6) {
                        byte b6 = qVar.f260a[i4];
                        if (b6 != b4 && b6 != b5) {
                            i4++;
                        }
                        i5 = qVar.f261b;
                    }
                    j5 = (qVar.f262c - qVar.f261b) + j4;
                    qVar = qVar.f265f;
                    k3.h.b(qVar);
                    j4 = j5;
                }
                return -1L;
            }
            while (j4 < this.f224m) {
                i4 = (int) ((qVar.f261b + j5) - j4);
                int i7 = qVar.f262c;
                while (i4 < i7) {
                    byte b7 = qVar.f260a[i4];
                    for (byte b8 : bArr) {
                        if (b7 == b8) {
                            i5 = qVar.f261b;
                        }
                    }
                    i4++;
                }
                j5 = (qVar.f262c - qVar.f261b) + j4;
                qVar = qVar.f265f;
                k3.h.b(qVar);
                j4 = j5;
            }
            return -1L;
        }
        j4 = 0;
        while (true) {
            long j6 = (qVar.f262c - qVar.f261b) + j4;
            if (j6 > 0) {
                break;
            }
            qVar = qVar.f265f;
            k3.h.b(qVar);
            j4 = j6;
        }
        if (bArr.length == 2) {
            byte b9 = bArr[0];
            byte b10 = bArr[1];
            while (j4 < this.f224m) {
                i4 = (int) ((qVar.f261b + j5) - j4);
                int i8 = qVar.f262c;
                while (i4 < i8) {
                    byte b11 = qVar.f260a[i4];
                    if (b11 != b9 && b11 != b10) {
                        i4++;
                    }
                    i5 = qVar.f261b;
                }
                j5 = (qVar.f262c - qVar.f261b) + j4;
                qVar = qVar.f265f;
                k3.h.b(qVar);
                j4 = j5;
            }
            return -1L;
        }
        while (j4 < this.f224m) {
            i4 = (int) ((qVar.f261b + j5) - j4);
            int i9 = qVar.f262c;
            while (i4 < i9) {
                byte b12 = qVar.f260a[i4];
                for (byte b13 : bArr) {
                    if (b12 == b13) {
                        i5 = qVar.f261b;
                    }
                }
                i4++;
            }
            j5 = (qVar.f262c - qVar.f261b) + j4;
            qVar = qVar.f265f;
            k3.h.b(qVar);
            j4 = j5;
        }
        return -1L;
        return (i4 - i5) + j4;
    }

    public final boolean c(b bVar) {
        k3.h.e(bVar, "bytes");
        byte[] bArr = bVar.f226l;
        int length = bArr.length;
        if (length < 0 || this.f224m < length || bArr.length < length) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (a(i4) != bArr[i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B3.a] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f224m != 0) {
            q qVar = this.f223l;
            k3.h.b(qVar);
            q c4 = qVar.c();
            obj.f223l = c4;
            c4.f266g = c4;
            c4.f265f = c4;
            for (q qVar2 = qVar.f265f; qVar2 != qVar; qVar2 = qVar2.f265f) {
                q qVar3 = c4.f266g;
                k3.h.b(qVar3);
                k3.h.b(qVar2);
                qVar3.b(qVar2.c());
            }
            obj.f224m = this.f224m;
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // B3.t
    public final long d(a aVar, long j4) {
        k3.h.e(aVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j5 = this.f224m;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        aVar.l(this, j4);
        return j4;
    }

    public final byte e() {
        if (this.f224m == 0) {
            throw new EOFException();
        }
        q qVar = this.f223l;
        k3.h.b(qVar);
        int i4 = qVar.f261b;
        int i5 = qVar.f262c;
        int i6 = i4 + 1;
        byte b4 = qVar.f260a[i4];
        this.f224m--;
        if (i6 == i5) {
            this.f223l = qVar.a();
            r.a(qVar);
        } else {
            qVar.f261b = i6;
        }
        return b4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                long j4 = this.f224m;
                a aVar = (a) obj;
                if (j4 == aVar.f224m) {
                    if (j4 != 0) {
                        q qVar = this.f223l;
                        k3.h.b(qVar);
                        q qVar2 = aVar.f223l;
                        k3.h.b(qVar2);
                        int i4 = qVar.f261b;
                        int i5 = qVar2.f261b;
                        long j5 = 0;
                        while (j5 < this.f224m) {
                            long min = Math.min(qVar.f262c - i4, qVar2.f262c - i5);
                            long j6 = 0;
                            while (j6 < min) {
                                int i6 = i4 + 1;
                                byte b4 = qVar.f260a[i4];
                                int i7 = i5 + 1;
                                if (b4 == qVar2.f260a[i5]) {
                                    j6++;
                                    i5 = i7;
                                    i4 = i6;
                                }
                            }
                            if (i4 == qVar.f262c) {
                                q qVar3 = qVar.f265f;
                                k3.h.b(qVar3);
                                i4 = qVar3.f261b;
                                qVar = qVar3;
                            }
                            if (i5 == qVar2.f262c) {
                                qVar2 = qVar2.f265f;
                                k3.h.b(qVar2);
                                i5 = qVar2.f261b;
                            }
                            j5 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte[] f(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f224m < j4) {
            throw new EOFException();
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = read(bArr, i5, i4 - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
        return bArr;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final b g(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f224m < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new b(f(j4));
        }
        b j5 = j((int) j4);
        i(j4);
        return j5;
    }

    public final int h() {
        if (this.f224m < 4) {
            throw new EOFException();
        }
        q qVar = this.f223l;
        k3.h.b(qVar);
        int i4 = qVar.f261b;
        int i5 = qVar.f262c;
        if (i5 - i4 < 4) {
            return ((e() & 255) << 24) | ((e() & 255) << 16) | ((e() & 255) << 8) | (e() & 255);
        }
        byte[] bArr = qVar.f260a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.f224m -= 4;
        if (i8 == i5) {
            this.f223l = qVar.a();
            r.a(qVar);
        } else {
            qVar.f261b = i8;
        }
        return i9;
    }

    public final int hashCode() {
        q qVar = this.f223l;
        if (qVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = qVar.f262c;
            for (int i6 = qVar.f261b; i6 < i5; i6++) {
                i4 = (i4 * 31) + qVar.f260a[i6];
            }
            qVar = qVar.f265f;
            k3.h.b(qVar);
        } while (qVar != this.f223l);
        return i4;
    }

    public final void i(long j4) {
        while (j4 > 0) {
            q qVar = this.f223l;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, qVar.f262c - qVar.f261b);
            long j5 = min;
            this.f224m -= j5;
            j4 -= j5;
            int i4 = qVar.f261b + min;
            qVar.f261b = i4;
            if (i4 == qVar.f262c) {
                this.f223l = qVar.a();
                r.a(qVar);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final b j(int i4) {
        if (i4 == 0) {
            return b.f225o;
        }
        U1.a.d(this.f224m, 0L, i4);
        q qVar = this.f223l;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            k3.h.b(qVar);
            int i8 = qVar.f262c;
            int i9 = qVar.f261b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            qVar = qVar.f265f;
        }
        byte[][] bArr = new byte[i7];
        int[] iArr = new int[i7 * 2];
        q qVar2 = this.f223l;
        int i10 = 0;
        while (i5 < i4) {
            k3.h.b(qVar2);
            bArr[i10] = qVar2.f260a;
            i5 += qVar2.f262c - qVar2.f261b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = qVar2.f261b;
            qVar2.f263d = true;
            i10++;
            qVar2 = qVar2.f265f;
        }
        return new s(bArr, iArr);
    }

    public final q k(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f223l;
        if (qVar == null) {
            q b4 = r.b();
            this.f223l = b4;
            b4.f266g = b4;
            b4.f265f = b4;
            return b4;
        }
        q qVar2 = qVar.f266g;
        k3.h.b(qVar2);
        if (qVar2.f262c + i4 <= 8192 && qVar2.f264e) {
            return qVar2;
        }
        q b5 = r.b();
        qVar2.b(b5);
        return b5;
    }

    public final void l(a aVar, long j4) {
        q b4;
        k3.h.e(aVar, "source");
        if (aVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        U1.a.d(aVar.f224m, 0L, j4);
        while (j4 > 0) {
            q qVar = aVar.f223l;
            k3.h.b(qVar);
            int i4 = qVar.f262c;
            q qVar2 = aVar.f223l;
            k3.h.b(qVar2);
            long j5 = i4 - qVar2.f261b;
            int i5 = 0;
            if (j4 < j5) {
                q qVar3 = this.f223l;
                q qVar4 = qVar3 != null ? qVar3.f266g : null;
                if (qVar4 != null && qVar4.f264e) {
                    if ((qVar4.f262c + j4) - (qVar4.f263d ? 0 : qVar4.f261b) <= 8192) {
                        q qVar5 = aVar.f223l;
                        k3.h.b(qVar5);
                        qVar5.d(qVar4, (int) j4);
                        aVar.f224m -= j4;
                        this.f224m += j4;
                        return;
                    }
                }
                q qVar6 = aVar.f223l;
                k3.h.b(qVar6);
                int i6 = (int) j4;
                if (i6 <= 0 || i6 > qVar6.f262c - qVar6.f261b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    b4 = qVar6.c();
                } else {
                    b4 = r.b();
                    int i7 = qVar6.f261b;
                    a3.c.g0(0, i7, i7 + i6, qVar6.f260a, b4.f260a);
                }
                b4.f262c = b4.f261b + i6;
                qVar6.f261b += i6;
                q qVar7 = qVar6.f266g;
                k3.h.b(qVar7);
                qVar7.b(b4);
                aVar.f223l = b4;
            }
            q qVar8 = aVar.f223l;
            k3.h.b(qVar8);
            long j6 = qVar8.f262c - qVar8.f261b;
            aVar.f223l = qVar8.a();
            q qVar9 = this.f223l;
            if (qVar9 == null) {
                this.f223l = qVar8;
                qVar8.f266g = qVar8;
                qVar8.f265f = qVar8;
            } else {
                q qVar10 = qVar9.f266g;
                k3.h.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f266g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                k3.h.b(qVar11);
                if (qVar11.f264e) {
                    int i8 = qVar8.f262c - qVar8.f261b;
                    q qVar12 = qVar8.f266g;
                    k3.h.b(qVar12);
                    int i9 = 8192 - qVar12.f262c;
                    q qVar13 = qVar8.f266g;
                    k3.h.b(qVar13);
                    if (!qVar13.f263d) {
                        q qVar14 = qVar8.f266g;
                        k3.h.b(qVar14);
                        i5 = qVar14.f261b;
                    }
                    if (i8 <= i9 + i5) {
                        q qVar15 = qVar8.f266g;
                        k3.h.b(qVar15);
                        qVar8.d(qVar15, i8);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            aVar.f224m -= j6;
            this.f224m += j6;
            j4 -= j6;
        }
    }

    public final void m(b bVar) {
        k3.h.e(bVar, "byteString");
        bVar.o(this, bVar.b());
    }

    public final void n(byte[] bArr, int i4, int i5) {
        k3.h.e(bArr, "source");
        long j4 = i5;
        U1.a.d(bArr.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            q k4 = k(1);
            int min = Math.min(i6 - i4, 8192 - k4.f262c);
            int i7 = i4 + min;
            a3.c.g0(k4.f262c, i4, i7, bArr, k4.f260a);
            k4.f262c += min;
            i4 = i7;
        }
        this.f224m += j4;
    }

    public final void o(int i4) {
        q k4 = k(1);
        int i5 = k4.f262c;
        k4.f262c = i5 + 1;
        k4.f260a[i5] = (byte) i4;
        this.f224m++;
    }

    public final void p(String str) {
        char charAt;
        k3.h.e(str, "string");
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0007h.j(length, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        int i4 = 0;
        while (i4 < length) {
            char charAt2 = str.charAt(i4);
            if (charAt2 < 128) {
                q k4 = k(1);
                int i5 = k4.f262c - i4;
                int min = Math.min(length, 8192 - i5);
                int i6 = i4 + 1;
                byte[] bArr = k4.f260a;
                bArr[i4 + i5] = (byte) charAt2;
                while (true) {
                    i4 = i6;
                    if (i4 >= min || (charAt = str.charAt(i4)) >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    bArr[i4 + i5] = (byte) charAt;
                }
                int i7 = k4.f262c;
                int i8 = (i5 + i4) - i7;
                k4.f262c = i7 + i8;
                this.f224m += i8;
            } else {
                if (charAt2 < 2048) {
                    q k5 = k(2);
                    int i9 = k5.f262c;
                    byte[] bArr2 = k5.f260a;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    k5.f262c = i9 + 2;
                    this.f224m += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q k6 = k(3);
                    int i10 = k6.f262c;
                    byte[] bArr3 = k6.f260a;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    k6.f262c = i10 + 3;
                    this.f224m += 3;
                } else {
                    int i11 = i4 + 1;
                    char charAt3 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        o(63);
                        i4 = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q k7 = k(4);
                        int i13 = k7.f262c;
                        byte[] bArr4 = k7.f260a;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        k7.f262c = i13 + 4;
                        this.f224m += 4;
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k3.h.e(byteBuffer, "sink");
        q qVar = this.f223l;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f262c - qVar.f261b);
        byteBuffer.put(qVar.f260a, qVar.f261b, min);
        int i4 = qVar.f261b + min;
        qVar.f261b = i4;
        this.f224m -= min;
        if (i4 == qVar.f262c) {
            this.f223l = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final String toString() {
        long j4 = this.f224m;
        if (j4 <= 2147483647L) {
            return j((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f224m).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        k3.h.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            q k4 = k(1);
            int min = Math.min(i4, 8192 - k4.f262c);
            byteBuffer.get(k4.f260a, k4.f262c, min);
            i4 -= min;
            k4.f262c += min;
        }
        this.f224m += remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i4, int i5) {
        k3.h.e(bArr, "sink");
        U1.a.d(bArr.length, i4, i5);
        q qVar = this.f223l;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i5, qVar.f262c - qVar.f261b);
        int i6 = qVar.f261b;
        a3.c.g0(i4, i6, i6 + min, qVar.f260a, bArr);
        int i7 = qVar.f261b + min;
        qVar.f261b = i7;
        this.f224m -= min;
        if (i7 == qVar.f262c) {
            this.f223l = qVar.a();
            r.a(qVar);
        }
        return min;
    }
}
