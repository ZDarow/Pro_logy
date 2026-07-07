package p058O1;

/* renamed from: O1.o */
/* loaded from: classes.dex */
public final class C0511o extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0511o> CREATOR = new p057O0.C0488g(6);

    /* renamed from: l */
    public final int f1515l;

    /* renamed from: m */
    public final android.os.IBinder f1516m;

    /* renamed from: n */
    public final p046L1.C0357a f1517n;

    /* renamed from: o */
    public final boolean f1518o;

    /* renamed from: p */
    public final boolean f1519p;

    public C0511o(int i4, android.os.IBinder iBinder, p046L1.C0357a c0357a, boolean z4, boolean z5) {
        this.f1515l = i4;
        this.f1516m = iBinder;
        this.f1517n = c0357a;
        this.f1518o = z4;
        this.f1519p = z5;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Object c0496d;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p058O1.C0511o)) {
            return false;
        }
        p058O1.C0511o c0511o = (p058O1.C0511o) obj;
        if (this.f1517n.equals(c0511o.f1517n)) {
            java.lang.Object obj2 = null;
            android.os.IBinder iBinder = this.f1516m;
            if (iBinder == null) {
                c0496d = null;
            } else {
                int i4 = p058O1.AbstractBinderC0497a.f1461d;
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c0496d = queryLocalInterface instanceof p058O1.InterfaceC0502f ? (p058O1.InterfaceC0502f) queryLocalInterface : new p058O1.C0496D(iBinder);
            }
            android.os.IBinder iBinder2 = c0511o.f1516m;
            if (iBinder2 != null) {
                int i5 = p058O1.AbstractBinderC0497a.f1461d;
                android.os.IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof p058O1.InterfaceC0502f ? (p058O1.InterfaceC0502f) queryLocalInterface2 : new p058O1.C0496D(iBinder2);
            }
            if (p058O1.AbstractC0515s.m1019f(c0496d, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1515l);
        p176p1.AbstractC1949a.m3915R(parcel, 2, this.f1516m);
        p176p1.AbstractC1949a.m3916S(parcel, 3, this.f1517n, i4);
        p176p1.AbstractC1949a.m3925a0(parcel, 4, 4);
        parcel.writeInt(this.f1518o ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 5, 4);
        parcel.writeInt(this.f1519p ? 1 : 0);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
