package p096Y1;

/* renamed from: Y1.m */
/* loaded from: classes.dex */
public final class C0902m extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p096Y1.C0902m> CREATOR = new p057O0.C0488g(21);

    /* renamed from: l */
    public final int f3216l;

    /* renamed from: m */
    public final p096Y1.C0901l f3217m;

    /* renamed from: n */
    public final p104a2.InterfaceC1017o f3218n;

    /* renamed from: o */
    public final p104a2.InterfaceC1014l f3219o;

    /* renamed from: p */
    public final android.app.PendingIntent f3220p;

    /* renamed from: q */
    public final p096Y1.InterfaceC0912w f3221q;

    /* renamed from: r */
    public final java.lang.String f3222r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [W1.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [W1.a] */
    /* JADX WARN: Type inference failed for: r6v5, types: [W1.a] */
    public C0902m(int i4, p096Y1.C0901l c0901l, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder3, java.lang.String str) {
        p104a2.InterfaceC1017o interfaceC1017o;
        p104a2.InterfaceC1014l interfaceC1014l;
        this.f3216l = i4;
        this.f3217m = c0901l;
        p096Y1.InterfaceC0912w interfaceC0912w = null;
        if (iBinder != null) {
            int i5 = p104a2.AbstractBinderC1016n.f3747d;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            interfaceC1017o = queryLocalInterface instanceof p104a2.InterfaceC1017o ? (p104a2.InterfaceC1017o) queryLocalInterface : new p088W1.AbstractC0815a(iBinder, "com.google.android.gms.location.ILocationListener", 1);
        } else {
            interfaceC1017o = null;
        }
        this.f3218n = interfaceC1017o;
        this.f3220p = pendingIntent;
        if (iBinder2 != null) {
            int i6 = p096Y1.BinderC0897h.f3199e;
            android.os.IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            interfaceC1014l = queryLocalInterface2 instanceof p104a2.InterfaceC1014l ? (p104a2.InterfaceC1014l) queryLocalInterface2 : new p088W1.AbstractC0815a(iBinder2, "com.google.android.gms.location.ILocationCallback", 1);
        } else {
            interfaceC1014l = null;
        }
        this.f3219o = interfaceC1014l;
        if (iBinder3 != null) {
            android.os.IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            interfaceC0912w = queryLocalInterface3 instanceof p096Y1.InterfaceC0912w ? (p096Y1.InterfaceC0912w) queryLocalInterface3 : new p088W1.AbstractC0815a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
        }
        this.f3221q = interfaceC0912w;
        this.f3222r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f3216l);
        p176p1.AbstractC1949a.m3916S(parcel, 2, this.f3217m, i4);
        android.os.IInterface iInterface = this.f3218n;
        p176p1.AbstractC1949a.m3915R(parcel, 3, iInterface == null ? null : ((p088W1.AbstractC0815a) iInterface).f2908d);
        p176p1.AbstractC1949a.m3916S(parcel, 4, this.f3220p, i4);
        p104a2.InterfaceC1014l interfaceC1014l = this.f3219o;
        p176p1.AbstractC1949a.m3915R(parcel, 5, interfaceC1014l == null ? null : interfaceC1014l.asBinder());
        p096Y1.InterfaceC0912w interfaceC0912w = this.f3221q;
        p176p1.AbstractC1949a.m3915R(parcel, 6, interfaceC0912w != null ? interfaceC0912w.asBinder() : null);
        p176p1.AbstractC1949a.m3917T(parcel, 8, this.f3222r);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
