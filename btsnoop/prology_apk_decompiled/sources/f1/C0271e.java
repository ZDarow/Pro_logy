package f1;

import W.r;
import y0.l;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271e {

    /* renamed from: a, reason: collision with root package name */
    public final int f5489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5490b;

    public /* synthetic */ C0271e(int i4, long j4, boolean z4) {
        this.f5489a = i4;
        this.f5490b = j4;
    }

    public static C0271e b(l lVar, r rVar) {
        lVar.p(rVar.f2694a, 0, 8, false);
        rVar.G(0);
        return new C0271e(rVar.h(), rVar.l(), false);
    }

    public boolean a() {
        int i4 = this.f5489a;
        return i4 == 0 || i4 == 1;
    }

    public C0271e(long j4, int i4) {
        W.a.e(j4 >= 0);
        this.f5489a = i4;
        this.f5490b = j4;
    }
}
