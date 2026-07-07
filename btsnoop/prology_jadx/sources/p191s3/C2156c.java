package p191s3;

/* renamed from: s3.c */
/* loaded from: classes.dex */
public final class C2156c extends p187r3.AbstractC2128s implements p187r3.InterfaceC2134y {
    private volatile p191s3.C2156c _immediate;

    /* renamed from: n */
    public final android.os.Handler f8592n;

    /* renamed from: o */
    public final java.lang.String f8593o;

    /* renamed from: p */
    public final boolean f8594p;

    /* renamed from: q */
    public final p191s3.C2156c f8595q;

    public C2156c(android.os.Handler handler, java.lang.String str, boolean z4) {
        this.f8592n = handler;
        this.f8593o = str;
        this.f8594p = z4;
        this._immediate = z4 ? this : null;
        p191s3.C2156c c2156c = this._immediate;
        if (c2156c == null) {
            c2156c = new p191s3.C2156c(handler, str, true);
            this._immediate = c2156c;
        }
        this.f8595q = c2156c;
    }

    @Override // p187r3.AbstractC2128s
    /* renamed from: e */
    public final void mo4159e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Runnable runnable) {
        if (this.f8592n.post(runnable)) {
            return;
        }
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) interfaceC1195i.mo678j(p187r3.C2129t.f8496m);
        if (interfaceC2088P != null) {
            interfaceC2088P.mo4170b(cancellationException);
        }
        p187r3.AbstractC2074B.f8426b.mo4159e(interfaceC1195i, runnable);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p191s3.C2156c) && ((p191s3.C2156c) obj).f8592n == this.f8592n;
    }

    @Override // p187r3.AbstractC2128s
    /* renamed from: f */
    public final boolean mo4241f() {
        return (this.f8594p && p154k3.AbstractC1803h.m3775a(android.os.Looper.myLooper(), this.f8592n.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f8592n);
    }

    @Override // p187r3.AbstractC2128s
    public final java.lang.String toString() {
        p191s3.C2156c c2156c;
        java.lang.String str;
        p218y3.C2421d c2421d = p187r3.AbstractC2074B.f8425a;
        p191s3.C2156c c2156c2 = p209w3.AbstractC2353o.f9301a;
        if (this == c2156c2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c2156c = c2156c2.f8595q;
            } catch (java.lang.UnsupportedOperationException unused) {
                c2156c = null;
            }
            str = this == c2156c ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.f8593o;
        if (str2 == null) {
            str2 = this.f8592n.toString();
        }
        if (!this.f8594p) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public C2156c(android.os.Handler handler) {
        this(handler, null, false);
    }
}
