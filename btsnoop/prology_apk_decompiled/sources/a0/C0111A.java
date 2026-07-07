package a0;

import f2.C0278F;
import t0.C0566h;
import t0.C0569k;

/* renamed from: a0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0111A implements W.h, t0.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0569k f3198l;

    @Override // t0.n
    public f2.c0 a(int i4, T.V v4, int[] iArr) {
        C0278F i5 = f2.I.i();
        for (int i6 = 0; i6 < v4.f2169a; i6++) {
            int i7 = i6;
            i5.a(new C0566h(i4, v4, i7, this.f3198l, iArr[i6]));
        }
        return i5.g();
    }

    @Override // W.h
    public void b(Object obj) {
        ((T.M) obj).d(this.f3198l);
    }
}
