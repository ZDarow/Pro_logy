package t0;

import T.I;
import Y.w;
import f1.C0271e;
import java.io.FileNotFoundException;
import java.io.IOException;
import v0.AbstractC0587a;
import y0.F;
import y0.InterfaceC0624g;
import y0.z;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560b implements u0.k, InterfaceC0624g, y0.q {
    public static C0271e d(u0.h hVar, B.c cVar) {
        int i4;
        IOException iOException = (IOException) cVar.f85m;
        if (!(iOException instanceof w) || ((i4 = ((w) iOException).f3063o) != 403 && i4 != 404 && i4 != 410 && i4 != 416 && i4 != 500 && i4 != 503)) {
            return null;
        }
        if (hVar.a(1)) {
            return new C0271e(300000L, 1);
        }
        if (hVar.a(2)) {
            return new C0271e(60000L, 2);
        }
        return null;
    }

    public static long f(B.c cVar) {
        Throwable th = (IOException) cVar.f85m;
        if (!(th instanceof I) && !(th instanceof FileNotFoundException) && !(th instanceof Y.t) && !(th instanceof u0.m)) {
            int i4 = Y.i.f3014m;
            while (th != null) {
                if (!(th instanceof Y.i) || ((Y.i) th).f3015l != 2008) {
                    th = th.getCause();
                }
            }
            return Math.min((cVar.f84l - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // y0.InterfaceC0624g
    public long a(long j4) {
        return j4;
    }

    @Override // u0.k
    public void b() {
        synchronized (AbstractC0587a.f8655a) {
            Object obj = AbstractC0587a.f8656b;
            synchronized (obj) {
                if (AbstractC0587a.f8657c) {
                    return;
                }
                long a4 = AbstractC0587a.a();
                synchronized (obj) {
                    AbstractC0587a.f8658d = a4;
                    AbstractC0587a.f8657c = true;
                }
            }
        }
    }

    @Override // u0.k
    public void c() {
    }

    public int e(int i4) {
        return i4 == 7 ? 6 : 3;
    }

    @Override // y0.q
    public void s() {
    }

    @Override // y0.q
    public void t(z zVar) {
    }

    @Override // y0.q
    public F v(int i4, int i5) {
        return new y0.n();
    }
}
