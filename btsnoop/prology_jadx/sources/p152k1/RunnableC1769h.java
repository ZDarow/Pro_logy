package p152k1;

/* renamed from: k1.h */
/* loaded from: classes.dex */
public final class RunnableC1769h implements java.lang.Runnable {

    /* renamed from: p */
    public static final java.lang.ThreadLocal f7272p = new java.lang.ThreadLocal();

    /* renamed from: q */
    public static final p014C3.C0149f f7273q = new p014C3.C0149f(1);

    /* renamed from: l */
    public java.util.ArrayList f7274l;

    /* renamed from: m */
    public long f7275m;

    /* renamed from: n */
    public long f7276n;

    /* renamed from: o */
    public java.util.ArrayList f7277o;

    /* renamed from: a */
    public final void m3729a(androidx.recyclerview.widget.RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.f4456x && this.f7275m == 0) {
            this.f7275m = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        p002A0.C0005c c0005c = recyclerView.f4433h0;
        c0005c.f7a = i4;
        c0005c.f8b = i5;
    }

    /* renamed from: b */
    public final void m3730b(long j4) {
        p152k1.C1768g c1768g;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.util.ArrayList arrayList = this.f7274l;
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                p002A0.C0005c c0005c = recyclerView2.f4433h0;
                c0005c.f9c = 0;
                i4 += c0005c.f9c;
            }
        }
        java.util.ArrayList arrayList2 = this.f7277o;
        arrayList2.ensureCapacity(i4);
        for (int i6 = 0; i6 < size; i6++) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                p002A0.C0005c c0005c2 = recyclerView3.f4433h0;
                java.lang.Math.abs(c0005c2.f7a);
                java.lang.Math.abs(c0005c2.f8b);
                if (c0005c2.f9c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new java.lang.Object());
                    }
                    throw null;
                }
            }
        }
        java.util.Collections.sort(arrayList2, f7273q);
        if (arrayList2.size() <= 0 || (recyclerView = (c1768g = (p152k1.C1768g) arrayList2.get(0)).f7270d) == null) {
            return;
        }
        int i7 = c1768g.f7271e;
        if (recyclerView.f4443o.m2229j0() > 0) {
            androidx.recyclerview.widget.RecyclerView.m2709j(recyclerView.f4443o.m2227i0(0));
            throw null;
        }
        io.flutter.plugin.platform.C1580c c1580c = recyclerView.f4437l;
        try {
            recyclerView.f4410H++;
            c1580c.m3503c(i7);
            throw null;
        } catch (java.lang.Throwable th) {
            int i8 = recyclerView.f4410H - 1;
            recyclerView.f4410H = i8;
            if (i8 < 1) {
                recyclerView.f4410H = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i4 = p214y.AbstractC2381c.f9348a;
            android.os.Trace.beginSection("RV Prefetch");
            java.util.ArrayList arrayList = this.f7274l;
            if (arrayList.isEmpty()) {
                this.f7275m = 0L;
                android.os.Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    j4 = java.lang.Math.max(recyclerView.getDrawingTime(), j4);
                }
            }
            if (j4 == 0) {
                this.f7275m = 0L;
                android.os.Trace.endSection();
            } else {
                m3730b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j4) + this.f7276n);
                this.f7275m = 0L;
                android.os.Trace.endSection();
            }
        } catch (java.lang.Throwable th) {
            this.f7275m = 0L;
            int i6 = p214y.AbstractC2381c.f9348a;
            android.os.Trace.endSection();
            throw th;
        }
    }
}
