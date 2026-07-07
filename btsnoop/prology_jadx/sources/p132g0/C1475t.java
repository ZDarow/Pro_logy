package p132g0;

/* renamed from: g0.t */
/* loaded from: classes.dex */
public final class C1475t implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p132g0.C1475t> CREATOR = new p104a2.C1009g(10);

    /* renamed from: l */
    public final java.lang.String f6008l;

    /* renamed from: m */
    public final java.lang.String f6009m;

    /* renamed from: n */
    public final java.util.List f6010n;

    public C1475t(java.lang.String str, java.lang.String str2, java.util.List list) {
        this.f6008l = str;
        this.f6009m = str2;
        this.f6010n = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p132g0.C1475t.class != obj.getClass()) {
            return false;
        }
        p132g0.C1475t c1475t = (p132g0.C1475t) obj;
        return android.text.TextUtils.equals(this.f6008l, c1475t.f6008l) && android.text.TextUtils.equals(this.f6009m, c1475t.f6009m) && this.f6010n.equals(c1475t.f6010n);
    }

    public final int hashCode() {
        java.lang.String str = this.f6008l;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f6009m;
        return this.f6010n.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HlsTrackMetadataEntry");
        java.lang.String str2 = this.f6008l;
        if (str2 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" [");
            sb2.append(str2);
            sb2.append(", ");
            str = p009B2.AbstractC0051h.m154m(sb2, this.f6009m, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f6008l);
        parcel.writeString(this.f6009m);
        java.util.List list = this.f6010n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeParcelable((android.os.Parcelable) list.get(i5), 0);
        }
    }

    public C1475t(android.os.Parcel parcel) {
        this.f6008l = parcel.readString();
        this.f6009m = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add((p132g0.C1474s) parcel.readParcelable(p132g0.C1474s.class.getClassLoader()));
        }
        this.f6010n = java.util.Collections.unmodifiableList(arrayList);
    }
}
