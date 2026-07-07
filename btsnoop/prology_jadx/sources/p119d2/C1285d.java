package p119d2;

/* renamed from: d2.d */
/* loaded from: classes.dex */
public final class C1285d {

    /* renamed from: a */
    public final p119d2.C1290i f5161a = new p119d2.C1290i();

    /* renamed from: a */
    public final void m3021a(java.lang.Object obj) {
        this.f5161a.m3027d(obj);
    }

    /* renamed from: b */
    public final void m3022b(java.lang.Exception exc) {
        p119d2.C1290i c1290i = this.f5161a;
        c1290i.getClass();
        p058O1.AbstractC0515s.m1018e(exc, "Exception must not be null");
        synchronized (c1290i.f5168a) {
            try {
                if (c1290i.f5170c) {
                    return;
                }
                c1290i.f5170c = true;
                c1290i.f5173f = exc;
                c1290i.f5169b.m1732f(c1290i);
            } finally {
            }
        }
    }
}
