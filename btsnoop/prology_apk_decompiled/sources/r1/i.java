package r1;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    public static final i f8086q;

    /* renamed from: l, reason: collision with root package name */
    public final int f8087l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8088m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8089n;

    /* renamed from: o, reason: collision with root package name */
    public final String f8090o;

    /* renamed from: p, reason: collision with root package name */
    public final Z2.e f8091p = new Z2.e(new C3.c(4, this));

    static {
        new i(0, 0, 0, "");
        f8086q = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i4, int i5, int i6, String str) {
        this.f8087l = i4;
        this.f8088m = i5;
        this.f8089n = i6;
        this.f8090o = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        k3.h.e(iVar, "other");
        Object a4 = this.f8091p.a();
        k3.h.d(a4, "<get-bigInteger>(...)");
        Object a5 = iVar.f8091p.a();
        k3.h.d(a5, "<get-bigInteger>(...)");
        return ((BigInteger) a4).compareTo((BigInteger) a5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8087l == iVar.f8087l && this.f8088m == iVar.f8088m && this.f8089n == iVar.f8089n;
    }

    public final int hashCode() {
        return ((((527 + this.f8087l) * 31) + this.f8088m) * 31) + this.f8089n;
    }

    public final String toString() {
        String str;
        String str2 = this.f8090o;
        if (q3.i.l0(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f8087l + '.' + this.f8088m + '.' + this.f8089n + str;
    }
}
