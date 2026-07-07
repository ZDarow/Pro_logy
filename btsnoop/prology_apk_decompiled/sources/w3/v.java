package w3;

import a.AbstractC0110a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8950a = 0;

    static {
        Object s;
        Object s4;
        Exception exc = new Exception();
        String simpleName = AbstractC0110a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            s = d3.b.class.getCanonicalName();
        } catch (Throwable th) {
            s = AbstractC0462a.s(th);
        }
        if (Z2.d.a(s) != null) {
            s = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            s4 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            s4 = AbstractC0462a.s(th2);
        }
        if (Z2.d.a(s4) != null) {
            s4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
