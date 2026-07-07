package p0;

import T.C0095p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f7594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7596c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7597d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7600g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7601h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7602i;

    /* renamed from: j, reason: collision with root package name */
    public final C0095p[] f7603j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7604k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7605l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7606m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7607n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f7608o;

    /* renamed from: p, reason: collision with root package name */
    public final long f7609p;

    public b(String str, String str2, int i4, String str3, long j4, String str4, int i5, int i6, int i7, int i8, String str5, C0095p[] c0095pArr, ArrayList arrayList, long[] jArr, long j5) {
        this.f7605l = str;
        this.f7606m = str2;
        this.f7594a = i4;
        this.f7595b = str3;
        this.f7596c = j4;
        this.f7597d = str4;
        this.f7598e = i5;
        this.f7599f = i6;
        this.f7600g = i7;
        this.f7601h = i8;
        this.f7602i = str5;
        this.f7603j = c0095pArr;
        this.f7607n = arrayList;
        this.f7608o = jArr;
        this.f7609p = j5;
        this.f7604k = arrayList.size();
    }

    public final b a(C0095p[] c0095pArr) {
        long[] jArr = this.f7608o;
        return new b(this.f7605l, this.f7606m, this.f7594a, this.f7595b, this.f7596c, this.f7597d, this.f7598e, this.f7599f, this.f7600g, this.f7601h, this.f7602i, c0095pArr, this.f7607n, jArr, this.f7609p);
    }

    public final long b(int i4) {
        if (i4 == this.f7604k - 1) {
            return this.f7609p;
        }
        long[] jArr = this.f7608o;
        return jArr[i4 + 1] - jArr[i4];
    }
}
