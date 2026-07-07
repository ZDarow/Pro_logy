package p076T;

/* renamed from: T.m */
/* loaded from: classes.dex */
public final class C0699m implements java.util.Comparator, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p076T.C0699m> CREATOR = new p057O0.C0488g(12);

    /* renamed from: l */
    public final p076T.C0698l[] f2345l;

    /* renamed from: m */
    public int f2346m;

    /* renamed from: n */
    public final java.lang.String f2347n;

    /* renamed from: o */
    public final int f2348o;

    public C0699m(java.lang.String str, java.util.ArrayList arrayList) {
        this(str, false, (p076T.C0698l[]) arrayList.toArray(new p076T.C0698l[0]));
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        p076T.C0698l c0698l = (p076T.C0698l) obj;
        p076T.C0698l c0698l2 = (p076T.C0698l) obj2;
        java.util.UUID uuid = p076T.AbstractC0693g.f2320a;
        return uuid.equals(c0698l.f2341m) ? uuid.equals(c0698l2.f2341m) ? 0 : 1 : c0698l.f2341m.compareTo(c0698l2.f2341m);
    }

    /* renamed from: d */
    public final p076T.C0699m m1285d(java.lang.String str) {
        return p086W.AbstractC0805y.m1606a(this.f2347n, str) ? this : new p076T.C0699m(str, false, this.f2345l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0699m.class != obj.getClass()) {
            return false;
        }
        p076T.C0699m c0699m = (p076T.C0699m) obj;
        return p086W.AbstractC0805y.m1606a(this.f2347n, c0699m.f2347n) && java.util.Arrays.equals(this.f2345l, c0699m.f2345l);
    }

    public final int hashCode() {
        if (this.f2346m == 0) {
            java.lang.String str = this.f2347n;
            this.f2346m = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.f2345l);
        }
        return this.f2346m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f2347n);
        parcel.writeTypedArray(this.f2345l, 0);
    }

    public C0699m(p076T.C0698l... c0698lArr) {
        this(null, true, c0698lArr);
    }

    public C0699m(java.lang.String str, boolean z4, p076T.C0698l... c0698lArr) {
        this.f2347n = str;
        c0698lArr = z4 ? (p076T.C0698l[]) c0698lArr.clone() : c0698lArr;
        this.f2345l = c0698lArr;
        this.f2348o = c0698lArr.length;
        java.util.Arrays.sort(c0698lArr, this);
    }

    public C0699m(android.os.Parcel parcel) {
        this.f2347n = parcel.readString();
        p076T.C0698l[] c0698lArr = (p076T.C0698l[]) parcel.createTypedArray(p076T.C0698l.CREATOR);
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f2345l = c0698lArr;
        this.f2348o = c0698lArr.length;
    }
}
