package w3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8919a;

    static {
        try {
            Iterator it = Arrays.asList(new s3.b()).iterator();
            k3.h.e(it, "<this>");
            f8919a = p3.c.d0(new p3.a(new p3.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
