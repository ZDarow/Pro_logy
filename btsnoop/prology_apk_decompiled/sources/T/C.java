package T;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f2072a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f2073b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (C.class) {
            if (f2072a.add(str)) {
                f2073b += ", " + str;
            }
        }
    }
}
