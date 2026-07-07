package t0;

import T.a0;
import W.y;
import a0.l0;
import j.C0359n;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f8388a;

    /* renamed from: b, reason: collision with root package name */
    public final l0[] f8389b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f8390c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f8391d;

    /* renamed from: e, reason: collision with root package name */
    public final C0359n f8392e;

    public v(l0[] l0VarArr, s[] sVarArr, a0 a0Var, C0359n c0359n) {
        W.a.e(l0VarArr.length == sVarArr.length);
        this.f8389b = l0VarArr;
        this.f8390c = (s[]) sVarArr.clone();
        this.f8391d = a0Var;
        this.f8392e = c0359n;
        this.f8388a = l0VarArr.length;
    }

    public final boolean a(v vVar, int i4) {
        return vVar != null && y.a(this.f8389b[i4], vVar.f8389b[i4]) && y.a(this.f8390c[i4], vVar.f8390c[i4]);
    }

    public final boolean b(int i4) {
        return this.f8389b[i4] != null;
    }
}
