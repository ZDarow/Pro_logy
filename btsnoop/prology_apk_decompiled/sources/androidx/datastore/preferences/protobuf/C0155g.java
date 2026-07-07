package androidx.datastore.preferences.protobuf;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0155g implements Iterable, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final C0155g f4078n = new C0155g(AbstractC0171x.f4149b);

    /* renamed from: o, reason: collision with root package name */
    public static final C0153e f4079o;

    /* renamed from: l, reason: collision with root package name */
    public int f4080l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f4081m;

    static {
        f4079o = AbstractC0151c.a() ? new C0153e(1) : new C0153e(0);
    }

    public C0155g(byte[] bArr) {
        bArr.getClass();
        this.f4081m = bArr;
    }

    public static int b(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0007h.j(i4, "Beginning index: ", " < 0"));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(AbstractC0007h.i(i4, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0007h.i(i5, i6, "End index: ", " >= "));
    }

    public static C0155g c(byte[] bArr, int i4, int i5) {
        byte[] copyOfRange;
        b(i4, i4 + i5, bArr.length);
        switch (f4079o.f4074a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i4, i5 + i4);
                break;
            default:
                copyOfRange = new byte[i5];
                System.arraycopy(bArr, i4, copyOfRange, 0, i5);
                break;
        }
        return new C0155g(copyOfRange);
    }

    public byte a(int i4) {
        return this.f4081m[i4];
    }

    public void d(byte[] bArr, int i4) {
        System.arraycopy(this.f4081m, 0, bArr, 0, i4);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0155g) || size() != ((C0155g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0155g)) {
            return obj.equals(this);
        }
        C0155g c0155g = (C0155g) obj;
        int i4 = this.f4080l;
        int i5 = c0155g.f4080l;
        if (i4 != 0 && i5 != 0 && i4 != i5) {
            return false;
        }
        int size = size();
        if (size > c0155g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0155g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0155g.size());
        }
        int e4 = e() + size;
        int e5 = e();
        int e6 = c0155g.e();
        while (e5 < e4) {
            if (this.f4081m[e5] != c0155g.f4081m[e6]) {
                return false;
            }
            e5++;
            e6++;
        }
        return true;
    }

    public byte f(int i4) {
        return this.f4081m[i4];
    }

    public final int hashCode() {
        int i4 = this.f4080l;
        if (i4 == 0) {
            int size = size();
            int e4 = e();
            int i5 = size;
            for (int i6 = e4; i6 < e4 + size; i6++) {
                i5 = (i5 * 31) + this.f4081m[i6];
            }
            i4 = i5 == 0 ? 1 : i5;
            this.f4080l = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0152d(this);
    }

    public int size() {
        return this.f4081m.length;
    }

    public final String toString() {
        C0155g c0154f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0110a.w(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b4 = b(0, 47, size());
            if (b4 == 0) {
                c0154f = f4078n;
            } else {
                c0154f = new C0154f(this.f4081m, e(), b4);
            }
            sb2.append(AbstractC0110a.w(c0154f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0007h.m(sb3, sb, "\">");
    }
}
