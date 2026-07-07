package Q;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1539a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1540b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1541c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1542d;

    public m(Object obj) {
        this.f1539a = obj;
    }

    public void a() {
        boolean z4 = this.f1540b;
        Object obj = this.f1539a;
        if (z4) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (this.f1541c) {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
        if (!this.f1542d) {
            this.f1540b = true;
        } else {
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + obj);
        }
    }

    public final boolean b() {
        return this.f1540b || this.f1541c || this.f1542d;
    }

    public abstract void c(Object obj);

    public final void d(Bundle bundle) {
        boolean z4 = this.f1541c;
        Object obj = this.f1539a;
        if (z4 || this.f1542d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + obj);
        }
        this.f1542d = true;
        throw new UnsupportedOperationException("It is not supported to send an error for " + obj);
    }

    public final void e(Object obj) {
        if (this.f1541c || this.f1542d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f1539a);
        }
        this.f1541c = true;
        c(obj);
    }
}
