package r0;

import T.C0095p;
import Y.x;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0499a extends l {

    /* renamed from: v, reason: collision with root package name */
    public final long f7998v;
    public final long w;

    /* renamed from: x, reason: collision with root package name */
    public x f7999x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f8000y;

    public AbstractC0499a(Y.h hVar, Y.l lVar, C0095p c0095p, int i4, Object obj, long j4, long j5, long j6, long j7, long j8) {
        super(hVar, lVar, c0095p, i4, obj, j4, j5, j8);
        this.f7998v = j6;
        this.w = j7;
    }

    public final int e(int i4) {
        int[] iArr = this.f8000y;
        W.a.k(iArr);
        return iArr[i4];
    }
}
