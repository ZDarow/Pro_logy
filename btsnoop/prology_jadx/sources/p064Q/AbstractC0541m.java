package p064Q;

/* renamed from: Q.m */
/* loaded from: classes.dex */
public abstract class AbstractC0541m {

    /* renamed from: a */
    public final java.lang.Object f1590a;

    /* renamed from: b */
    public boolean f1591b;

    /* renamed from: c */
    public boolean f1592c;

    /* renamed from: d */
    public boolean f1593d;

    public AbstractC0541m(java.lang.Object obj) {
        this.f1590a = obj;
    }

    /* renamed from: a */
    public void mo1038a() {
        boolean z4 = this.f1591b;
        java.lang.Object obj = this.f1590a;
        if (z4) {
            throw new java.lang.IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (this.f1592c) {
            throw new java.lang.IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
        if (!this.f1593d) {
            this.f1591b = true;
        } else {
            throw new java.lang.IllegalStateException("detach() called when sendError() had already been called for: " + obj);
        }
    }

    /* renamed from: b */
    public final boolean m1052b() {
        return this.f1591b || this.f1592c || this.f1593d;
    }

    /* renamed from: c */
    public abstract void mo1037c(java.lang.Object obj);

    /* renamed from: d */
    public final void m1053d(android.os.Bundle bundle) {
        boolean z4 = this.f1592c;
        java.lang.Object obj = this.f1590a;
        if (z4 || this.f1593d) {
            throw new java.lang.IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + obj);
        }
        this.f1593d = true;
        throw new java.lang.UnsupportedOperationException("It is not supported to send an error for " + obj);
    }

    /* renamed from: e */
    public final void m1054e(java.lang.Object obj) {
        if (this.f1592c || this.f1593d) {
            throw new java.lang.IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f1590a);
        }
        this.f1592c = true;
        mo1037c(obj);
    }
}
