package p214y;

/* renamed from: y.c */
/* loaded from: classes.dex */
public abstract class AbstractC2381c {

    /* renamed from: a */
    public static final /* synthetic */ int f9348a = 0;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception e4) {
                android.util.Log.i("TraceCompat", "Unable to initialize via reflection.", e4);
            }
        }
    }
}
