package p089W2;

/* renamed from: W2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0821a implements java.lang.AutoCloseable {
    /* renamed from: a */
    public static java.lang.String m1663a(java.lang.String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    /* renamed from: b */
    public static void m1664b(java.lang.String str) {
        android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z(m1663a(str)));
    }
}
