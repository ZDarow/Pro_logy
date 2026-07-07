package p054N1;

/* renamed from: N1.h */
/* loaded from: classes.dex */
public final class C0453h {

    /* renamed from: a */
    public final p054N1.ExecutorC0457l f1325a;

    /* renamed from: b */
    public volatile java.lang.Object f1326b;

    /* renamed from: c */
    public volatile p054N1.C0452g f1327c;

    public C0453h(android.os.Looper looper, java.lang.Object obj, java.lang.String str) {
        this.f1325a = new p054N1.ExecutorC0457l(looper);
        p058O1.AbstractC0515s.m1018e(obj, "Listener must not be null");
        this.f1326b = obj;
        p058O1.AbstractC0515s.m1016c(str);
        this.f1327c = new p054N1.C0452g(obj, str);
    }

    /* renamed from: a */
    public final void m959a(p043K2.C0339o c0339o) {
        this.f1325a.execute(new p054N1.RunnableC0462q(this, c0339o, 1, false));
    }
}
