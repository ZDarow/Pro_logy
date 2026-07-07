package u0;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f8506a;

    public final void a(int i4) {
        g gVar = this.f8506a;
        synchronized (gVar) {
            int i5 = gVar.f8525m;
            if (i5 == 0 || gVar.f8516d) {
                if (i5 == i4) {
                    return;
                }
                gVar.f8525m = i4;
                if (i4 != 1 && i4 != 0 && i4 != 8) {
                    gVar.f8523k = gVar.b(i4);
                    gVar.f8515c.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    gVar.c(gVar.f8518f > 0 ? (int) (elapsedRealtime - gVar.f8519g) : 0, gVar.f8520h, gVar.f8523k);
                    gVar.f8519g = elapsedRealtime;
                    gVar.f8520h = 0L;
                    gVar.f8522j = 0L;
                    gVar.f8521i = 0L;
                    s sVar = gVar.f8517e;
                    sVar.f8557b.clear();
                    sVar.f8559d = -1;
                    sVar.f8560e = 0;
                    sVar.f8561f = 0;
                }
            }
        }
    }
}
