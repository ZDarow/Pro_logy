package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.U */
/* loaded from: classes.dex */
public final class C1087U {

    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v f4188a;

    /* renamed from: b */
    public final java.lang.String f4189b;

    /* renamed from: c */
    public final java.lang.Object[] f4190c;

    /* renamed from: d */
    public final int f4191d;

    public C1087U(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v, java.lang.String str, java.lang.Object[] objArr) {
        this.f4188a = abstractC1132v;
        this.f4189b = str;
        this.f4190c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4191d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f4191d = i4 | (charAt2 << i6);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.AbstractC1093a m2425a() {
        return this.f4188a;
    }

    /* renamed from: b */
    public final java.lang.Object[] m2426b() {
        return this.f4190c;
    }

    /* renamed from: c */
    public final java.lang.String m2427c() {
        return this.f4189b;
    }

    /* renamed from: d */
    public final int m2428d() {
        int i4 = this.f4191d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
