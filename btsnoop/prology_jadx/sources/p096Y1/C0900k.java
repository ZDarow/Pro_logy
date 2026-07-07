package p096Y1;

/* renamed from: Y1.k */
/* loaded from: classes.dex */
public final class C0900k extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p096Y1.C0900k> CREATOR = new p057O0.C0488g(19);

    /* renamed from: l */
    public final int f3210l;

    /* renamed from: m */
    public final android.os.IBinder f3211m;

    /* renamed from: n */
    public final android.os.IBinder f3212n;

    /* renamed from: o */
    public final android.app.PendingIntent f3213o;

    /* renamed from: p */
    public final java.lang.String f3214p;

    public C0900k(int i4, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.f3210l = i4;
        this.f3211m = iBinder;
        this.f3212n = iBinder2;
        this.f3213o = pendingIntent;
        this.f3214p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f3210l);
        p176p1.AbstractC1949a.m3915R(parcel, 2, this.f3211m);
        p176p1.AbstractC1949a.m3915R(parcel, 3, this.f3212n);
        p176p1.AbstractC1949a.m3916S(parcel, 4, this.f3213o, i4);
        p176p1.AbstractC1949a.m3917T(parcel, 6, this.f3214p);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
