package Y;

import android.os.SystemClock;
import f2.c0;
import java.util.ArrayList;

/* renamed from: Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0107c implements h {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3002l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3003m = new ArrayList(1);

    /* renamed from: n, reason: collision with root package name */
    public int f3004n;

    /* renamed from: o, reason: collision with root package name */
    public l f3005o;

    public AbstractC0107c(boolean z4) {
        this.f3002l = z4;
    }

    public final void a(int i4) {
        l lVar = this.f3005o;
        int i5 = W.y.f2709a;
        for (int i6 = 0; i6 < this.f3004n; i6++) {
            C c4 = (C) this.f3003m.get(i6);
            boolean z4 = this.f3002l;
            u0.g gVar = (u0.g) c4;
            synchronized (gVar) {
                c0 c0Var = u0.g.f8507n;
                if (z4 && (lVar.f3036h & 8) != 8) {
                    gVar.f8520h += i4;
                }
            }
        }
    }

    public final void c() {
        l lVar = this.f3005o;
        int i4 = W.y.f2709a;
        for (int i5 = 0; i5 < this.f3004n; i5++) {
            C c4 = (C) this.f3003m.get(i5);
            boolean z4 = this.f3002l;
            u0.g gVar = (u0.g) c4;
            synchronized (gVar) {
                try {
                    c0 c0Var = u0.g.f8507n;
                    if (z4 && (lVar.f3036h & 8) != 8) {
                        W.a.j(gVar.f8518f > 0);
                        gVar.f8515c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i6 = (int) (elapsedRealtime - gVar.f8519g);
                        gVar.f8521i += i6;
                        long j4 = gVar.f8522j;
                        long j5 = gVar.f8520h;
                        gVar.f8522j = j4 + j5;
                        if (i6 > 0) {
                            gVar.f8517e.a((((float) j5) * 8000.0f) / i6, (int) Math.sqrt(j5));
                            if (gVar.f8521i < 2000) {
                                if (gVar.f8522j >= 524288) {
                                }
                                gVar.c(i6, gVar.f8520h, gVar.f8523k);
                                gVar.f8519g = elapsedRealtime;
                                gVar.f8520h = 0L;
                            }
                            gVar.f8523k = gVar.f8517e.b();
                            gVar.c(i6, gVar.f8520h, gVar.f8523k);
                            gVar.f8519g = elapsedRealtime;
                            gVar.f8520h = 0L;
                        }
                        gVar.f8518f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f3005o = null;
    }

    public final void f() {
        for (int i4 = 0; i4 < this.f3004n; i4++) {
            ((C) this.f3003m.get(i4)).getClass();
        }
    }

    public final void i(l lVar) {
        this.f3005o = lVar;
        for (int i4 = 0; i4 < this.f3004n; i4++) {
            C c4 = (C) this.f3003m.get(i4);
            boolean z4 = this.f3002l;
            u0.g gVar = (u0.g) c4;
            synchronized (gVar) {
                try {
                    c0 c0Var = u0.g.f8507n;
                    if (z4 && (lVar.f3036h & 8) != 8) {
                        if (gVar.f8518f == 0) {
                            gVar.f8515c.getClass();
                            gVar.f8519g = SystemClock.elapsedRealtime();
                        }
                        gVar.f8518f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Y.h
    public final void j(C c4) {
        c4.getClass();
        ArrayList arrayList = this.f3003m;
        if (arrayList.contains(c4)) {
            return;
        }
        arrayList.add(c4);
        this.f3004n++;
    }
}
