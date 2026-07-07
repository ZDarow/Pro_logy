package p187r3;

/* renamed from: r3.m */
/* loaded from: classes.dex */
public final class C2122m {

    /* renamed from: a */
    public final java.lang.Object f8479a;

    /* renamed from: b */
    public final p187r3.C2076D f8480b;

    /* renamed from: c */
    public final p149j3.InterfaceC1737l f8481c;

    /* renamed from: d */
    public final java.lang.Object f8482d;

    /* renamed from: e */
    public final java.lang.Throwable f8483e;

    public C2122m(java.lang.Object obj, p187r3.C2076D c2076d, p149j3.InterfaceC1737l interfaceC1737l, java.lang.Object obj2, java.lang.Throwable th) {
        this.f8479a = obj;
        this.f8480b = c2076d;
        this.f8481c = interfaceC1737l;
        this.f8482d = obj2;
        this.f8483e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* renamed from: a */
    public static p187r3.C2122m m4240a(p187r3.C2122m c2122m, p187r3.C2076D c2076d, java.util.concurrent.CancellationException cancellationException, int i4) {
        java.lang.Object obj = c2122m.f8479a;
        if ((i4 & 2) != 0) {
            c2076d = c2122m.f8480b;
        }
        p187r3.C2076D c2076d2 = c2076d;
        p149j3.InterfaceC1737l interfaceC1737l = c2122m.f8481c;
        java.lang.Object obj2 = c2122m.f8482d;
        java.util.concurrent.CancellationException cancellationException2 = cancellationException;
        if ((i4 & 16) != 0) {
            cancellationException2 = c2122m.f8483e;
        }
        c2122m.getClass();
        return new p187r3.C2122m(obj, c2076d2, interfaceC1737l, obj2, cancellationException2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p187r3.C2122m)) {
            return false;
        }
        p187r3.C2122m c2122m = (p187r3.C2122m) obj;
        return p154k3.AbstractC1803h.m3775a(this.f8479a, c2122m.f8479a) && p154k3.AbstractC1803h.m3775a(this.f8480b, c2122m.f8480b) && p154k3.AbstractC1803h.m3775a(this.f8481c, c2122m.f8481c) && p154k3.AbstractC1803h.m3775a(this.f8482d, c2122m.f8482d) && p154k3.AbstractC1803h.m3775a(this.f8483e, c2122m.f8483e);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f8479a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        p187r3.C2076D c2076d = this.f8480b;
        int hashCode2 = (hashCode + (c2076d == null ? 0 : c2076d.hashCode())) * 31;
        p149j3.InterfaceC1737l interfaceC1737l = this.f8481c;
        int hashCode3 = (hashCode2 + (interfaceC1737l == null ? 0 : interfaceC1737l.hashCode())) * 31;
        java.lang.Object obj2 = this.f8482d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.f8483e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.f8479a + ", cancelHandler=" + this.f8480b + ", onCancellation=" + this.f8481c + ", idempotentResume=" + this.f8482d + ", cancelCause=" + this.f8483e + ')';
    }

    public /* synthetic */ C2122m(java.lang.Object obj, p187r3.C2076D c2076d, p149j3.InterfaceC1737l interfaceC1737l, java.util.concurrent.CancellationException cancellationException, int i4) {
        this(obj, (i4 & 2) != 0 ? null : c2076d, (i4 & 4) != 0 ? null : interfaceC1737l, (java.lang.Object) null, (i4 & 16) != 0 ? null : cancellationException);
    }
}
