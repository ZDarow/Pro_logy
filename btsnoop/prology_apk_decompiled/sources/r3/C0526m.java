package r3;

import java.util.concurrent.CancellationException;

/* renamed from: r3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8161a;

    /* renamed from: b, reason: collision with root package name */
    public final D f8162b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.l f8163c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8164d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f8165e;

    public C0526m(Object obj, D d4, j3.l lVar, Object obj2, Throwable th) {
        this.f8161a = obj;
        this.f8162b = d4;
        this.f8163c = lVar;
        this.f8164d = obj2;
        this.f8165e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0526m a(C0526m c0526m, D d4, CancellationException cancellationException, int i4) {
        Object obj = c0526m.f8161a;
        if ((i4 & 2) != 0) {
            d4 = c0526m.f8162b;
        }
        D d5 = d4;
        j3.l lVar = c0526m.f8163c;
        Object obj2 = c0526m.f8164d;
        CancellationException cancellationException2 = cancellationException;
        if ((i4 & 16) != 0) {
            cancellationException2 = c0526m.f8165e;
        }
        c0526m.getClass();
        return new C0526m(obj, d5, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0526m)) {
            return false;
        }
        C0526m c0526m = (C0526m) obj;
        return k3.h.a(this.f8161a, c0526m.f8161a) && k3.h.a(this.f8162b, c0526m.f8162b) && k3.h.a(this.f8163c, c0526m.f8163c) && k3.h.a(this.f8164d, c0526m.f8164d) && k3.h.a(this.f8165e, c0526m.f8165e);
    }

    public final int hashCode() {
        Object obj = this.f8161a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d4 = this.f8162b;
        int hashCode2 = (hashCode + (d4 == null ? 0 : d4.hashCode())) * 31;
        j3.l lVar = this.f8163c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f8164d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8165e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8161a + ", cancelHandler=" + this.f8162b + ", onCancellation=" + this.f8163c + ", idempotentResume=" + this.f8164d + ", cancelCause=" + this.f8165e + ')';
    }

    public /* synthetic */ C0526m(Object obj, D d4, j3.l lVar, CancellationException cancellationException, int i4) {
        this(obj, (i4 & 2) != 0 ? null : d4, (i4 & 4) != 0 ? null : lVar, (Object) null, (i4 & 16) != 0 ? null : cancellationException);
    }
}
