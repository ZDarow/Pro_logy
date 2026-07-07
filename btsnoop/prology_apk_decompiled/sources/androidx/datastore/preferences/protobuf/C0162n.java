package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0162n f4117a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0162n f4118b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.n, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f4118b = obj;
    }

    public static C0162n a() {
        S s = S.f4034c;
        C0162n c0162n = f4117a;
        if (c0162n == null) {
            synchronized (C0162n.class) {
                try {
                    c0162n = f4117a;
                    if (c0162n == null) {
                        Class cls = AbstractC0161m.f4116a;
                        C0162n c0162n2 = null;
                        if (cls != null) {
                            try {
                                c0162n2 = (C0162n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0162n2 == null) {
                            c0162n2 = f4118b;
                        }
                        f4117a = c0162n2;
                        c0162n = c0162n2;
                    }
                } finally {
                }
            }
        }
        return c0162n;
    }
}
