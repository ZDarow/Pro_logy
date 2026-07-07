package p175p0;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public final class C1943b {

    /* renamed from: a */
    public final int f7885a;

    /* renamed from: b */
    public final java.lang.String f7886b;

    /* renamed from: c */
    public final long f7887c;

    /* renamed from: d */
    public final java.lang.String f7888d;

    /* renamed from: e */
    public final int f7889e;

    /* renamed from: f */
    public final int f7890f;

    /* renamed from: g */
    public final int f7891g;

    /* renamed from: h */
    public final int f7892h;

    /* renamed from: i */
    public final java.lang.String f7893i;

    /* renamed from: j */
    public final p076T.C0702p[] f7894j;

    /* renamed from: k */
    public final int f7895k;

    /* renamed from: l */
    public final java.lang.String f7896l;

    /* renamed from: m */
    public final java.lang.String f7897m;

    /* renamed from: n */
    public final java.util.ArrayList f7898n;

    /* renamed from: o */
    public final long[] f7899o;

    /* renamed from: p */
    public final long f7900p;

    public C1943b(java.lang.String str, java.lang.String str2, int i4, java.lang.String str3, long j4, java.lang.String str4, int i5, int i6, int i7, int i8, java.lang.String str5, p076T.C0702p[] c0702pArr, java.util.ArrayList arrayList, long[] jArr, long j5) {
        this.f7896l = str;
        this.f7897m = str2;
        this.f7885a = i4;
        this.f7886b = str3;
        this.f7887c = j4;
        this.f7888d = str4;
        this.f7889e = i5;
        this.f7890f = i6;
        this.f7891g = i7;
        this.f7892h = i8;
        this.f7893i = str5;
        this.f7894j = c0702pArr;
        this.f7898n = arrayList;
        this.f7899o = jArr;
        this.f7900p = j5;
        this.f7895k = arrayList.size();
    }

    /* renamed from: a */
    public final p175p0.C1943b m3897a(p076T.C0702p[] c0702pArr) {
        long[] jArr = this.f7899o;
        return new p175p0.C1943b(this.f7896l, this.f7897m, this.f7885a, this.f7886b, this.f7887c, this.f7888d, this.f7889e, this.f7890f, this.f7891g, this.f7892h, this.f7893i, c0702pArr, this.f7898n, jArr, this.f7900p);
    }

    /* renamed from: b */
    public final long m3898b(int i4) {
        if (i4 == this.f7895k - 1) {
            return this.f7900p;
        }
        long[] jArr = this.f7899o;
        return jArr[i4 + 1] - jArr[i4];
    }
}
