package V0;

import C.C0016c;
import W.y;
import f2.C0295q;
import f2.I;
import f2.a0;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final C0295q f2600n;

    /* renamed from: l, reason: collision with root package name */
    public final I f2601l;

    /* renamed from: m, reason: collision with root package name */
    public final long[] f2602m;

    static {
        a0 a0Var = a0.f5544l;
        C0016c c0016c = new C0016c(12);
        a0Var.getClass();
        f2600n = new C0295q(c0016c, a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(f2.c0 r20) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.<init>(f2.c0):void");
    }

    @Override // V0.d
    public final long B(int i4) {
        W.a.e(i4 < this.f2601l.size());
        return this.f2602m[i4];
    }

    @Override // V0.d
    public final int Q() {
        return this.f2601l.size();
    }

    @Override // V0.d
    public final int g(long j4) {
        int b4 = y.b(this.f2602m, j4, false);
        if (b4 < this.f2601l.size()) {
            return b4;
        }
        return -1;
    }

    @Override // V0.d
    public final List w(long j4) {
        int f4 = y.f(this.f2602m, j4, false);
        return f4 == -1 ? I.m() : (I) this.f2601l.get(f4);
    }
}
