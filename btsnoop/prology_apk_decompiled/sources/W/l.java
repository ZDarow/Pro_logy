package W;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0158j;
import androidx.datastore.preferences.protobuf.AbstractC0169v;
import androidx.datastore.preferences.protobuf.AbstractC0171x;
import androidx.datastore.preferences.protobuf.C0155g;
import androidx.datastore.preferences.protobuf.C0162n;
import androidx.datastore.preferences.protobuf.C0173z;
import androidx.datastore.preferences.protobuf.InterfaceC0170w;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.q0;
import com.ryanheise.audioservice.AudioService;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2673a;

    /* renamed from: b, reason: collision with root package name */
    public int f2674b;

    /* renamed from: c, reason: collision with root package name */
    public int f2675c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2676d;

    public l() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f2675c = highestOneBit - 1;
        this.f2676d = new int[highestOneBit];
    }

    public static void f(int i4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("androidAdjustRemoteVolume", s2.k.q("direction", Integer.valueOf(i4)), null);
    }

    public static void g(int i4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("androidSetRemoteVolume", s2.k.q("volumeIndex", Integer.valueOf(i4)), null);
    }

    public void A(int i4) {
        if (((AbstractC0158j) this.f2676d).b() != i4) {
            throw C0173z.e();
        }
    }

    public void B(int i4) {
        if ((this.f2673a & 7) != i4) {
            throw C0173z.b();
        }
    }

    public boolean C() {
        int i4;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (abstractC0158j.c() || (i4 = this.f2673a) == this.f2674b) {
            return false;
        }
        return abstractC0158j.x(i4);
    }

    public void a(int i4) {
        int[] iArr = (int[]) this.f2676d;
        int i5 = this.f2674b;
        iArr[i5] = i4;
        int i6 = this.f2675c & (i5 + 1);
        this.f2674b = i6;
        int i7 = this.f2673a;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            a3.c.h0(0, i7, length, iArr, iArr2);
            a3.c.h0(i8, 0, this.f2673a, (int[]) this.f2676d, iArr2);
            this.f2676d = iArr2;
            this.f2673a = 0;
            this.f2674b = length;
            this.f2675c = i9 - 1;
        }
    }

    public int b() {
        int i4 = this.f2675c;
        if (i4 != 0) {
            this.f2673a = i4;
            this.f2675c = 0;
        } else {
            this.f2673a = ((AbstractC0158j) this.f2676d).u();
        }
        int i5 = this.f2673a;
        if (i5 == 0 || i5 == this.f2674b) {
            return Integer.MAX_VALUE;
        }
        return i5 >>> 3;
    }

    public VolumeProvider c() {
        if (((VolumeProvider) this.f2676d) == null) {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = this.f2674b;
            int i6 = this.f2673a;
            if (i4 >= 30) {
                this.f2676d = new Q.x(this, i6, i5, this.f2675c);
            } else {
                this.f2676d = new Q.y(this, i6, i5, this.f2675c);
            }
        }
        return (VolumeProvider) this.f2676d;
    }

    public void d(Object obj, V v4, C0162n c0162n) {
        int i4 = this.f2674b;
        this.f2674b = ((this.f2673a >>> 3) << 3) | 4;
        try {
            v4.c(obj, this, c0162n);
            if (this.f2673a == this.f2674b) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.f2674b = i4;
        }
    }

    public void e(Object obj, V v4, C0162n c0162n) {
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        int v5 = abstractC0158j.v();
        if (abstractC0158j.f4105a >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e4 = abstractC0158j.e(v5);
        abstractC0158j.f4105a++;
        v4.c(obj, this, c0162n);
        abstractC0158j.a(0);
        abstractC0158j.f4105a--;
        abstractC0158j.d(e4);
    }

    public void h(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Boolean.valueOf(abstractC0158j.f()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Boolean.valueOf(abstractC0158j.f()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public C0155g i() {
        B(2);
        return ((AbstractC0158j) this.f2676d).g();
    }

    public void j(InterfaceC0170w interfaceC0170w) {
        int u4;
        if ((this.f2673a & 7) != 2) {
            throw C0173z.b();
        }
        do {
            ((T) interfaceC0170w).add(i());
            AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void k(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 1) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int v4 = abstractC0158j.v();
            if ((v4 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b4 = abstractC0158j.b() + v4;
            do {
                ((T) interfaceC0170w).add(Double.valueOf(abstractC0158j.h()));
            } while (abstractC0158j.b() < b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Double.valueOf(abstractC0158j.h()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void l(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.i()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.i()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public Object m(q0 q0Var, Class cls, C0162n c0162n) {
        int ordinal = q0Var.ordinal();
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        switch (ordinal) {
            case 0:
                B(1);
                return Double.valueOf(abstractC0158j.h());
            case 1:
                B(5);
                return Float.valueOf(abstractC0158j.l());
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                B(0);
                return Long.valueOf(abstractC0158j.n());
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                B(0);
                return Long.valueOf(abstractC0158j.w());
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                B(0);
                return Integer.valueOf(abstractC0158j.m());
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                B(1);
                return Long.valueOf(abstractC0158j.k());
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                B(5);
                return Integer.valueOf(abstractC0158j.j());
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                B(0);
                return Boolean.valueOf(abstractC0158j.f());
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                B(2);
                return abstractC0158j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                B(2);
                V a4 = S.f4034c.a(cls);
                AbstractC0169v g4 = a4.g();
                e(g4, a4, c0162n);
                a4.h(g4);
                return g4;
            case 11:
                return i();
            case 12:
                B(0);
                return Integer.valueOf(abstractC0158j.v());
            case 13:
                B(0);
                return Integer.valueOf(abstractC0158j.i());
            case 14:
                B(5);
                return Integer.valueOf(abstractC0158j.o());
            case 15:
                B(1);
                return Long.valueOf(abstractC0158j.p());
            case 16:
                B(0);
                return Integer.valueOf(abstractC0158j.q());
            case 17:
                B(0);
                return Long.valueOf(abstractC0158j.r());
        }
    }

    public void n(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 == 2) {
            int v4 = abstractC0158j.v();
            if ((v4 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b4 = abstractC0158j.b() + v4;
            do {
                ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.j()));
            } while (abstractC0158j.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw C0173z.b();
        }
        do {
            ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.j()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void o(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 1) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int v4 = abstractC0158j.v();
            if ((v4 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b4 = abstractC0158j.b() + v4;
            do {
                ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.k()));
            } while (abstractC0158j.b() < b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.k()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void p(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 == 2) {
            int v4 = abstractC0158j.v();
            if ((v4 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b4 = abstractC0158j.b() + v4;
            do {
                ((T) interfaceC0170w).add(Float.valueOf(abstractC0158j.l()));
            } while (abstractC0158j.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw C0173z.b();
        }
        do {
            ((T) interfaceC0170w).add(Float.valueOf(abstractC0158j.l()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void q(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.m()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.m()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void r(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.n()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.n()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void s(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 == 2) {
            int v4 = abstractC0158j.v();
            if ((v4 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b4 = abstractC0158j.b() + v4;
            do {
                ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.o()));
            } while (abstractC0158j.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw C0173z.b();
        }
        do {
            ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.o()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void t(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 1) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int v4 = abstractC0158j.v();
            if ((v4 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b4 = abstractC0158j.b() + v4;
            do {
                ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.p()));
            } while (abstractC0158j.b() < b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.p()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void u(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.q()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.q()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void v(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.r()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.r()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void w(InterfaceC0170w interfaceC0170w, boolean z4) {
        String s;
        int u4;
        if ((this.f2673a & 7) != 2) {
            throw C0173z.b();
        }
        do {
            AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
            if (z4) {
                B(2);
                s = abstractC0158j.t();
            } else {
                B(2);
                s = abstractC0158j.s();
            }
            ((T) interfaceC0170w).add(s);
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void x(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.v()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Integer.valueOf(abstractC0158j.v()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public void y(InterfaceC0170w interfaceC0170w) {
        int u4;
        int i4 = this.f2673a & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) this.f2676d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw C0173z.b();
            }
            int b4 = abstractC0158j.b() + abstractC0158j.v();
            do {
                ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.w()));
            } while (abstractC0158j.b() < b4);
            A(b4);
            return;
        }
        do {
            ((T) interfaceC0170w).add(Long.valueOf(abstractC0158j.w()));
            if (abstractC0158j.c()) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == this.f2673a);
        this.f2675c = u4;
    }

    public long z() {
        int i4 = this.f2674b;
        if (i4 == 0) {
            throw new NoSuchElementException();
        }
        int i5 = this.f2673a;
        long j4 = ((long[]) this.f2676d)[i5];
        this.f2673a = (i5 + 1) & this.f2675c;
        this.f2674b = i4 - 1;
        return j4;
    }

    public l(AbstractC0158j abstractC0158j) {
        this.f2675c = 0;
        Charset charset = AbstractC0171x.f4148a;
        this.f2676d = abstractC0158j;
        abstractC0158j.f4106b = this;
    }
}
