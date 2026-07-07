package n;

import java.util.ConcurrentModificationException;
import o.AbstractC0454a;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0445h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7357a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7358b = new Object();

    public static final void a(C0443f c0443f, int i4) {
        k3.h.e(c0443f, "<this>");
        c0443f.f7350l = new int[i4];
        c0443f.f7351m = new Object[i4];
    }

    public static final int b(C0443f c0443f, Object obj, int i4) {
        k3.h.e(c0443f, "<this>");
        int i5 = c0443f.f7352n;
        if (i5 == 0) {
            return -1;
        }
        try {
            int a4 = AbstractC0454a.a(c0443f.f7352n, i4, c0443f.f7350l);
            if (a4 < 0 || k3.h.a(obj, c0443f.f7351m[a4])) {
                return a4;
            }
            int i6 = a4 + 1;
            while (i6 < i5 && c0443f.f7350l[i6] == i4) {
                if (k3.h.a(obj, c0443f.f7351m[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a4 - 1; i7 >= 0 && c0443f.f7350l[i7] == i4; i7--) {
                if (k3.h.a(obj, c0443f.f7351m[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
