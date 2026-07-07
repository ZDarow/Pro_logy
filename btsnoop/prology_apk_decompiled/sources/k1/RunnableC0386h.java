package k1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import y.AbstractC0616c;

/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0386h implements Runnable {

    /* renamed from: p, reason: collision with root package name */
    public static final ThreadLocal f7006p = new ThreadLocal();

    /* renamed from: q, reason: collision with root package name */
    public static final C3.f f7007q = new C3.f(1);

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7008l;

    /* renamed from: m, reason: collision with root package name */
    public long f7009m;

    /* renamed from: n, reason: collision with root package name */
    public long f7010n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f7011o;

    public final void a(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.f4301x && this.f7009m == 0) {
            this.f7009m = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        A0.c cVar = recyclerView.f4280h0;
        cVar.f7a = i4;
        cVar.f8b = i5;
    }

    public final void b(long j4) {
        C0385g c0385g;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f7008l;
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                A0.c cVar = recyclerView2.f4280h0;
                cVar.f9c = 0;
                i4 += cVar.f9c;
            }
        }
        ArrayList arrayList2 = this.f7011o;
        arrayList2.ensureCapacity(i4);
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                A0.c cVar2 = recyclerView3.f4280h0;
                Math.abs(cVar2.f7a);
                Math.abs(cVar2.f8b);
                if (cVar2.f9c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new Object());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f7007q);
        if (arrayList2.size() <= 0 || (recyclerView = (c0385g = (C0385g) arrayList2.get(0)).f7004d) == null) {
            return;
        }
        int i7 = c0385g.f7005e;
        if (recyclerView.f4290o.j0() > 0) {
            RecyclerView.j(recyclerView.f4290o.i0(0));
            throw null;
        }
        io.flutter.plugin.platform.c cVar3 = recyclerView.f4284l;
        try {
            recyclerView.f4258H++;
            cVar3.c(i7);
            throw null;
        } catch (Throwable th) {
            int i8 = recyclerView.f4258H - 1;
            recyclerView.f4258H = i8;
            if (i8 < 1) {
                recyclerView.f4258H = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i4 = AbstractC0616c.f8989a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f7008l;
            if (arrayList.isEmpty()) {
                this.f7009m = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    j4 = Math.max(recyclerView.getDrawingTime(), j4);
                }
            }
            if (j4 == 0) {
                this.f7009m = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j4) + this.f7010n);
                this.f7009m = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f7009m = 0L;
            int i6 = AbstractC0616c.f8989a;
            Trace.endSection();
            throw th;
        }
    }
}
