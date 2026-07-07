package T0;

import W.r;
import Y.p;
import Y.x;
import java.io.EOFException;
import java.util.HashMap;
import y0.l;

/* loaded from: classes.dex */
public final class e implements Y.g {

    /* renamed from: l, reason: collision with root package name */
    public int f2387l;

    /* renamed from: m, reason: collision with root package name */
    public int f2388m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2389n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f2390o;

    /* renamed from: p, reason: collision with root package name */
    public Object f2391p;

    public e(int i4) {
        switch (i4) {
            case 1:
                this.f2390o = new x(0, (byte) 0);
                this.f2387l = 8000;
                this.f2388m = 8000;
                return;
            default:
                this.f2390o = new f();
                this.f2391p = new r(new byte[65025], 0);
                this.f2387l = -1;
                return;
        }
    }

    @Override // Y.g
    public Y.h a() {
        return new p((String) this.f2391p, this.f2387l, this.f2388m, this.f2389n, (x) this.f2390o);
    }

    public int b(int i4) {
        int i5;
        int i6 = 0;
        this.f2388m = 0;
        do {
            int i7 = this.f2388m;
            int i8 = i4 + i7;
            f fVar = (f) this.f2390o;
            if (i8 >= fVar.f2394c) {
                break;
            }
            int[] iArr = fVar.f2397f;
            this.f2388m = i7 + 1;
            i5 = iArr[i7 + i4];
            i6 += i5;
        } while (i5 == 255);
        return i6;
    }

    public boolean c(l lVar) {
        int i4;
        W.a.j(lVar != null);
        boolean z4 = this.f2389n;
        r rVar = (r) this.f2391p;
        if (z4) {
            this.f2389n = false;
            rVar.D(0);
        }
        while (!this.f2389n) {
            int i5 = this.f2387l;
            f fVar = (f) this.f2390o;
            if (i5 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i6 = fVar.f2395d;
                    if ((fVar.f2392a & 1) == 1 && rVar.f2696c == 0) {
                        i6 += b(0);
                        i4 = this.f2388m;
                    } else {
                        i4 = 0;
                    }
                    try {
                        lVar.e(i6);
                        this.f2387l = i4;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int b4 = b(this.f2387l);
            int i7 = this.f2387l + this.f2388m;
            if (b4 > 0) {
                rVar.b(rVar.f2696c + b4);
                try {
                    lVar.k(rVar.f2694a, rVar.f2696c, b4, false);
                    rVar.F(rVar.f2696c + b4);
                    this.f2389n = fVar.f2397f[i7 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i7 == fVar.f2394c) {
                i7 = -1;
            }
            this.f2387l = i7;
        }
        return true;
    }

    public void d(HashMap hashMap) {
        x xVar = (x) this.f2390o;
        synchronized (xVar) {
            xVar.f3066n = null;
            ((HashMap) xVar.f3065m).clear();
            ((HashMap) xVar.f3065m).putAll(hashMap);
        }
    }
}
