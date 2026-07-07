package d2;

import O1.s;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241d {

    /* renamed from: a, reason: collision with root package name */
    public final C0246i f4974a = new C0246i();

    public final void a(Object obj) {
        this.f4974a.d(obj);
    }

    public final void b(Exception exc) {
        C0246i c0246i = this.f4974a;
        c0246i.getClass();
        s.e(exc, "Exception must not be null");
        synchronized (c0246i.f4981a) {
            try {
                if (c0246i.f4983c) {
                    return;
                }
                c0246i.f4983c = true;
                c0246i.f4986f = exc;
                c0246i.f4982b.f(c0246i);
            } finally {
            }
        }
    }
}
