package p076T;

/* renamed from: T.C */
/* loaded from: classes.dex */
public abstract class AbstractC0660C {

    /* renamed from: a */
    public static final java.util.HashSet f2148a = new java.util.HashSet();

    /* renamed from: b */
    public static java.lang.String f2149b = "media3.common";

    /* renamed from: a */
    public static synchronized void m1179a(java.lang.String str) {
        synchronized (p076T.AbstractC0660C.class) {
            if (f2148a.add(str)) {
                f2149b += ", " + str;
            }
        }
    }
}
