package p076T;

/* renamed from: T.P */
/* loaded from: classes.dex */
public final class C0673P implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p076T.C0673P> CREATOR = new p057O0.C0488g(15);

    /* renamed from: l */
    public final int f2220l;

    /* renamed from: m */
    public final int f2221m;

    /* renamed from: n */
    public final int f2222n;

    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
    }

    public C0673P() {
        this.f2220l = -1;
        this.f2221m = -1;
        this.f2222n = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p076T.C0673P c0673p = (p076T.C0673P) obj;
        int i4 = this.f2220l - c0673p.f2220l;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f2221m - c0673p.f2221m;
        return i5 == 0 ? this.f2222n - c0673p.f2222n : i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0673P.class != obj.getClass()) {
            return false;
        }
        p076T.C0673P c0673p = (p076T.C0673P) obj;
        return this.f2220l == c0673p.f2220l && this.f2221m == c0673p.f2221m && this.f2222n == c0673p.f2222n;
    }

    public final int hashCode() {
        return (((this.f2220l * 31) + this.f2221m) * 31) + this.f2222n;
    }

    public final java.lang.String toString() {
        return this.f2220l + "." + this.f2221m + "." + this.f2222n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f2220l);
        parcel.writeInt(this.f2221m);
        parcel.writeInt(this.f2222n);
    }

    public C0673P(android.os.Parcel parcel) {
        this.f2220l = parcel.readInt();
        this.f2221m = parcel.readInt();
        this.f2222n = parcel.readInt();
    }
}
