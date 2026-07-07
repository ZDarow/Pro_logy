package t0;

import T.V;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final V f8384a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8385b;

    public r(V v4, int[] iArr) {
        if (iArr.length == 0) {
            W.a.o("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f8384a = v4;
        this.f8385b = iArr;
    }
}
