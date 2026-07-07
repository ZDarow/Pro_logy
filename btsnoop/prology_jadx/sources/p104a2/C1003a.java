package p104a2;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public final class C1003a extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p104a2.C1003a> CREATOR = new p057O0.C0488g(24);

    /* renamed from: l */
    public final long f3722l;

    /* renamed from: m */
    public final int f3723m;

    /* renamed from: n */
    public final boolean f3724n;

    /* renamed from: o */
    public final p096Y1.C0899j f3725o;

    public C1003a(long j4, int i4, boolean z4, p096Y1.C0899j c0899j) {
        this.f3722l = j4;
        this.f3723m = i4;
        this.f3724n = z4;
        this.f3725o = c0899j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p104a2.C1003a)) {
            return false;
        }
        p104a2.C1003a c1003a = (p104a2.C1003a) obj;
        return this.f3722l == c1003a.f3722l && this.f3723m == c1003a.f3723m && this.f3724n == c1003a.f3724n && p058O1.AbstractC0515s.m1019f(this.f3725o, c1003a.f3725o);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f3722l), java.lang.Integer.valueOf(this.f3723m), java.lang.Boolean.valueOf(this.f3724n)});
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LastLocationRequest[");
        long j4 = this.f3722l;
        if (j4 != Long.MAX_VALUE) {
            sb.append("maxAge=");
            p096Y1.AbstractC0903n.m1741a(j4, sb);
        }
        int i4 = this.f3723m;
        if (i4 != 0) {
            sb.append(", ");
            if (i4 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i4 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f3724n) {
            sb.append(", bypass");
        }
        p096Y1.C0899j c0899j = this.f3725o;
        if (c0899j != null) {
            sb.append(", impersonation=");
            sb.append(c0899j);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 8);
        parcel.writeLong(this.f3722l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f3723m);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f3724n ? 1 : 0);
        p176p1.AbstractC1949a.m3916S(parcel, 5, this.f3725o, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
