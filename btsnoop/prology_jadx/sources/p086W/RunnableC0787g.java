package p086W;

/* renamed from: W.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0787g implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f2748l;

    /* renamed from: m */
    public final /* synthetic */ int f2749m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f2750n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f2751o;

    public /* synthetic */ RunnableC0787g(java.lang.Object obj, int i4, java.lang.Object obj2, int i5) {
        this.f2748l = i5;
        this.f2750n = obj;
        this.f2749m = i4;
        this.f2751o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2748l) {
            case 0:
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f2750n).iterator();
                while (it.hasNext()) {
                    p086W.C0790j c0790j = (p086W.C0790j) it.next();
                    if (!c0790j.f2755d) {
                        int i4 = this.f2749m;
                        if (i4 != -1) {
                            c0790j.f2753b.m118a(i4);
                        }
                        c0790j.f2754c = true;
                        ((p086W.InterfaceC0788h) this.f2751o).mo285b(c0790j.f2752a);
                    }
                }
                return;
            default:
                ((p142i1.C1536a) this.f2750n).f6399b.mo595i(this.f2749m, (java.io.Serializable) this.f2751o);
                return;
        }
    }
}
