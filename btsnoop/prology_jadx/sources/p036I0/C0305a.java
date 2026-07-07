package p036I0;

/* renamed from: I0.a */
/* loaded from: classes.dex */
public final class C0305a implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p036I0.C0305a> CREATOR = new p024F.C0206i(1);

    /* renamed from: l */
    public final int f919l;

    /* renamed from: m */
    public final java.lang.String f920m;

    public C0305a(java.lang.String str, int i4) {
        this.f919l = i4;
        this.f920m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ait(controlCode=");
        sb.append(this.f919l);
        sb.append(",url=");
        return p009B2.AbstractC0051h.m154m(sb, this.f920m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f920m);
        parcel.writeInt(this.f919l);
    }
}
