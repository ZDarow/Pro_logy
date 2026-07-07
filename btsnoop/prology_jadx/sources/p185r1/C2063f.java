package p185r1;

/* renamed from: r1.f */
/* loaded from: classes.dex */
public final class C2063f extends p185r1.AbstractC2064g {

    /* renamed from: a */
    public final java.lang.Object f8394a;

    /* renamed from: b */
    public final java.lang.String f8395b;

    /* renamed from: c */
    public final int f8396c;

    /* renamed from: d */
    public final p112c0.C1235q f8397d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a3.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable, c0.q, java.lang.Exception] */
    public C2063f(java.lang.Object obj, java.lang.String str, p185r1.C2058a c2058a, int i4) {
        p154k3.AbstractC1803h.m3779e(obj, "value");
        p009B2.AbstractC0051h.m160s("verificationMode", i4);
        this.f8394a = obj;
        this.f8395b = str;
        this.f8396c = i4;
        java.lang.String m4124b = p185r1.AbstractC2064g.m4124b(obj, str);
        p154k3.AbstractC1803h.m3779e(m4124b, "message");
        ?? exc = new java.lang.Exception(m4124b);
        java.lang.StackTraceElement[] stackTrace = exc.getStackTrace();
        p154k3.AbstractC1803h.m3778d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(length, "Requested element count ", " is less than zero.").toString());
        }
        ?? r02 = p105a3.C1029l.f3755l;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    r02 = length3 != 1 ? new java.util.ArrayList(new p105a3.C1018a(stackTrace, false)) : p176p1.AbstractC1949a.m3904E(stackTrace[0]);
                }
            } else if (length == 1) {
                r02 = p176p1.AbstractC1949a.m3904E(stackTrace[length2 - 1]);
            } else {
                r02 = new java.util.ArrayList(length);
                for (int i5 = length2 - length; i5 < length2; i5++) {
                    r02.add(stackTrace[i5]);
                }
            }
        }
        exc.setStackTrace((java.lang.StackTraceElement[]) r02.toArray(new java.lang.StackTraceElement[0]));
        this.f8397d = exc;
    }

    @Override // p185r1.AbstractC2064g
    /* renamed from: a */
    public final java.lang.Object mo4122a() {
        int m781b = p044L.AbstractC0352j.m781b(this.f8396c);
        if (m781b == 0) {
            throw this.f8397d;
        }
        if (m781b != 1) {
            if (m781b == 2) {
                return null;
            }
            throw new java.lang.RuntimeException();
        }
        java.lang.String m4124b = p185r1.AbstractC2064g.m4124b(this.f8394a, this.f8395b);
        p154k3.AbstractC1803h.m3779e(m4124b, "message");
        android.util.Log.d("f", m4124b);
        return null;
    }

    @Override // p185r1.AbstractC2064g
    /* renamed from: d */
    public final p185r1.AbstractC2064g mo4123d(java.lang.String str, p149j3.InterfaceC1737l interfaceC1737l) {
        return this;
    }
}
