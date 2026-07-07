package p119d2;

/* renamed from: d2.g */
/* loaded from: classes.dex */
public final class C1288g implements p119d2.InterfaceC1289h {

    /* renamed from: a */
    public final /* synthetic */ int f5164a = 2;

    /* renamed from: b */
    public final java.lang.Object f5165b = new java.lang.Object();

    /* renamed from: c */
    public final java.util.concurrent.Executor f5166c;

    /* renamed from: d */
    public final java.lang.Object f5167d;

    public C1288g(p054N1.ExecutorC0457l executorC0457l, p009B2.C0067x c0067x) {
        this.f5166c = executorC0457l;
        this.f5167d = c0067x;
    }

    @Override // p119d2.InterfaceC1289h
    /* renamed from: a */
    public final void mo3023a(p119d2.C1290i c1290i) {
        switch (this.f5164a) {
            case 0:
                synchronized (this.f5165b) {
                }
                this.f5166c.execute(new p054N1.RunnableC0462q(5, this, c1290i));
                return;
            case 1:
                if (c1290i.m3025b() || c1290i.f5171d) {
                    return;
                }
                synchronized (this.f5165b) {
                }
                ((p054N1.ExecutorC0457l) this.f5166c).execute(new p054N1.RunnableC0462q(6, this, c1290i));
                return;
            default:
                if (c1290i.m3025b()) {
                    synchronized (this.f5165b) {
                    }
                    ((p054N1.ExecutorC0457l) this.f5166c).execute(new p054N1.RunnableC0462q(7, this, c1290i));
                    return;
                }
                return;
        }
    }

    public C1288g(p054N1.ExecutorC0457l executorC0457l, p119d2.InterfaceC1283b interfaceC1283b) {
        this.f5166c = executorC0457l;
        this.f5167d = interfaceC1283b;
    }

    public C1288g(java.util.concurrent.Executor executor, p119d2.InterfaceC1282a interfaceC1282a) {
        this.f5166c = executor;
        this.f5167d = interfaceC1282a;
    }
}
