package B;

import B2.I;
import L.k;
import L2.h;
import L2.i;
import O1.s;
import X2.j;
import Y.x;
import Z.f;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.AsyncTask;
import androidx.datastore.preferences.protobuf.C0159k;
import j0.z;
import java.util.Arrays;
import m0.q;
import m0.r;
import q0.Z;
import q0.a0;
import y0.l;

/* loaded from: classes.dex */
public final class c implements i, z, a0 {

    /* renamed from: l, reason: collision with root package name */
    public int f84l;

    /* renamed from: m, reason: collision with root package name */
    public Object f85m;

    public /* synthetic */ c(int i4, Object obj) {
        this.f85m = obj;
        this.f84l = i4;
    }

    @Override // L2.i
    public void E() {
        ((j) this.f85m).f2946f.b();
        AsyncTask.execute(new X2.i(this.f84l, 0, this));
    }

    @Override // L2.i
    public void H(Object obj, h hVar) {
        ((j) this.f85m).f2944d = hVar;
    }

    @Override // q0.a0
    public void a() {
        C0159k c0159k = ((r) this.f85m).w;
        if (c0159k != null) {
            throw c0159k;
        }
    }

    @Override // j0.z
    public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // j0.z
    public int c() {
        if (((MediaCodecInfo[]) this.f85m) == null) {
            this.f85m = new MediaCodecList(this.f84l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f85m).length;
    }

    @Override // q0.a0
    public boolean d() {
        r rVar = (r) this.f85m;
        if (!rVar.f7277B) {
            q qVar = (q) rVar.f7287p.get(this.f84l);
            if (qVar.f7272c.s(qVar.f7273d)) {
                return true;
            }
        }
        return false;
    }

    public void e(long j4) {
        int i4 = this.f84l;
        long[] jArr = (long[]) this.f85m;
        if (i4 == jArr.length) {
            this.f85m = Arrays.copyOf(jArr, i4 * 2);
        }
        long[] jArr2 = (long[]) this.f85m;
        int i5 = this.f84l;
        this.f84l = i5 + 1;
        jArr2[i5] = j4;
    }

    @Override // j0.z
    public MediaCodecInfo f(int i4) {
        if (((MediaCodecInfo[]) this.f85m) == null) {
            this.f85m = new MediaCodecList(this.f84l).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f85m)[i4];
    }

    public long g(int i4) {
        if (i4 >= 0 && i4 < this.f84l) {
            return ((long[]) this.f85m)[i4];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i4 + ", size is " + this.f84l);
    }

    public long h(l lVar) {
        W.r rVar = (W.r) this.f85m;
        int i4 = 0;
        lVar.p(rVar.f2694a, 0, 1, false);
        int i5 = rVar.f2694a[0] & 255;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i6 = 128;
        int i7 = 0;
        while ((i5 & i6) == 0) {
            i6 >>= 1;
            i7++;
        }
        int i8 = i5 & (~i6);
        lVar.p(rVar.f2694a, 1, i7, false);
        while (i4 < i7) {
            i4++;
            i8 = (rVar.f2694a[i4] & 255) + (i8 << 8);
        }
        this.f84l = i7 + 1 + this.f84l;
        return i8;
    }

    @Override // j0.z
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // q0.a0
    public int n(long j4) {
        r rVar = (r) this.f85m;
        if (rVar.f7277B) {
            return -3;
        }
        q qVar = (q) rVar.f7287p.get(this.f84l);
        Z z4 = qVar.f7272c;
        int p2 = z4.p(j4, qVar.f7273d);
        z4.C(p2);
        return p2;
    }

    @Override // q0.a0
    public int o(x xVar, f fVar, int i4) {
        r rVar = (r) this.f85m;
        if (rVar.f7277B) {
            return -3;
        }
        q qVar = (q) rVar.f7287p.get(this.f84l);
        return qVar.f7272c.x(xVar, fVar, i4, qVar.f7273d);
    }

    @Override // j0.z
    public boolean r() {
        return true;
    }

    public c(L1.a aVar, int i4) {
        s.d(aVar);
        this.f85m = aVar;
        this.f84l = i4;
    }

    public c(int i4, I[] iArr) {
        this.f84l = i4;
        this.f85m = iArr;
    }

    public c(int i4, boolean z4) {
        switch (i4) {
            case k.LONG_FIELD_NUMBER /* 4 */:
                this.f85m = new long[32];
                return;
            default:
                this.f85m = new W.r(8);
                return;
        }
    }

    public c(int i4) {
        if (i4 > 0) {
            this.f85m = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
