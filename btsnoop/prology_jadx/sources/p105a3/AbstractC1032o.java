package p105a3;

/* renamed from: a3.o */
/* loaded from: classes.dex */
public abstract class AbstractC1032o extends p080U1.AbstractC0748a {
    /* renamed from: Q */
    public static int m2057Q(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: R */
    public static final void m2058R(java.util.HashMap hashMap, p100Z2.C0929b[] c0929bArr) {
        for (p100Z2.C0929b c0929b : c0929bArr) {
            hashMap.put(c0929b.f3291l, c0929b.f3292m);
        }
    }
}
