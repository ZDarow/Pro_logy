package r1;

import B2.AbstractC0007h;
import L.j;
import a3.C0148a;
import a3.l;
import android.util.Log;
import c0.C0218q;
import java.util.ArrayList;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8079a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8081c;

    /* renamed from: d, reason: collision with root package name */
    public final C0218q f8082d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a3.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable, c0.q, java.lang.Exception] */
    public f(Object obj, String str, C0507a c0507a, int i4) {
        k3.h.e(obj, "value");
        AbstractC0007h.s("verificationMode", i4);
        this.f8079a = obj;
        this.f8080b = str;
        this.f8081c = i4;
        String b4 = g.b(obj, str);
        k3.h.e(b4, "message");
        ?? exc = new Exception(b4);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        k3.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0007h.j(length, "Requested element count ", " is less than zero.").toString());
        }
        ?? r02 = l.f3631l;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    r02 = length3 != 1 ? new ArrayList(new C0148a(stackTrace, false)) : AbstractC0462a.E(stackTrace[0]);
                }
            } else if (length == 1) {
                r02 = AbstractC0462a.E(stackTrace[length2 - 1]);
            } else {
                r02 = new ArrayList(length);
                for (int i5 = length2 - length; i5 < length2; i5++) {
                    r02.add(stackTrace[i5]);
                }
            }
        }
        exc.setStackTrace((StackTraceElement[]) r02.toArray(new StackTraceElement[0]));
        this.f8082d = exc;
    }

    @Override // r1.g
    public final Object a() {
        int b4 = j.b(this.f8081c);
        if (b4 == 0) {
            throw this.f8082d;
        }
        if (b4 != 1) {
            if (b4 == 2) {
                return null;
            }
            throw new RuntimeException();
        }
        String b5 = g.b(this.f8079a, this.f8080b);
        k3.h.e(b5, "message");
        Log.d("f", b5);
        return null;
    }

    @Override // r1.g
    public final g d(String str, j3.l lVar) {
        return this;
    }
}
