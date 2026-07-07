package p152k1;

/* renamed from: k1.H */
/* loaded from: classes.dex */
public final class C1760H implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p152k1.C1760H> CREATOR = new p104a2.C1009g(14);

    /* renamed from: l */
    public int f7217l;

    /* renamed from: m */
    public int f7218m;

    /* renamed from: n */
    public int f7219n;

    /* renamed from: o */
    public int[] f7220o;

    /* renamed from: p */
    public int f7221p;

    /* renamed from: q */
    public int[] f7222q;

    /* renamed from: r */
    public java.util.ArrayList f7223r;

    /* renamed from: s */
    public boolean f7224s;

    /* renamed from: t */
    public boolean f7225t;

    /* renamed from: u */
    public boolean f7226u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f7217l);
        parcel.writeInt(this.f7218m);
        parcel.writeInt(this.f7219n);
        if (this.f7219n > 0) {
            parcel.writeIntArray(this.f7220o);
        }
        parcel.writeInt(this.f7221p);
        if (this.f7221p > 0) {
            parcel.writeIntArray(this.f7222q);
        }
        parcel.writeInt(this.f7224s ? 1 : 0);
        parcel.writeInt(this.f7225t ? 1 : 0);
        parcel.writeInt(this.f7226u ? 1 : 0);
        parcel.writeList(this.f7223r);
    }
}
