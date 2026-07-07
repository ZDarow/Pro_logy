package p058O1;

/* renamed from: O1.e */
/* loaded from: classes.dex */
public final class C0501e extends p062P1.AbstractC0527a {

    /* renamed from: l */
    public final int f1472l;

    /* renamed from: m */
    public final int f1473m;

    /* renamed from: n */
    public final int f1474n;

    /* renamed from: o */
    public java.lang.String f1475o;

    /* renamed from: p */
    public android.os.IBinder f1476p;

    /* renamed from: q */
    public com.google.android.gms.common.api.Scope[] f1477q;

    /* renamed from: r */
    public android.os.Bundle f1478r;

    /* renamed from: s */
    public android.accounts.Account f1479s;

    /* renamed from: t */
    public p046L1.C0359c[] f1480t;

    /* renamed from: u */
    public p046L1.C0359c[] f1481u;

    /* renamed from: v */
    public final boolean f1482v;

    /* renamed from: w */
    public final int f1483w;

    /* renamed from: x */
    public boolean f1484x;

    /* renamed from: y */
    public final java.lang.String f1485y;
    public static final android.os.Parcelable.Creator<p058O1.C0501e> CREATOR = new p057O0.C0488g(10);

    /* renamed from: z */
    public static final com.google.android.gms.common.api.Scope[] f1471z = new com.google.android.gms.common.api.Scope[0];

    /* renamed from: A */
    public static final p046L1.C0359c[] f1470A = new p046L1.C0359c[0];

    public C0501e(int i4, int i5, int i6, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, p046L1.C0359c[] c0359cArr, p046L1.C0359c[] c0359cArr2, boolean z4, int i7, boolean z5, java.lang.String str2) {
        scopeArr = scopeArr == null ? f1471z : scopeArr;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        p046L1.C0359c[] c0359cArr3 = f1470A;
        c0359cArr = c0359cArr == null ? c0359cArr3 : c0359cArr;
        c0359cArr2 = c0359cArr2 == null ? c0359cArr3 : c0359cArr2;
        this.f1472l = i4;
        this.f1473m = i5;
        this.f1474n = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f1475o = "com.google.android.gms";
        } else {
            this.f1475o = str;
        }
        if (i4 < 2) {
            android.accounts.Account account2 = null;
            if (iBinder != null) {
                int i8 = p058O1.AbstractBinderC0497a.f1461d;
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                android.os.IInterface c0496d = queryLocalInterface instanceof p058O1.InterfaceC0502f ? (p058O1.InterfaceC0502f) queryLocalInterface : new p058O1.C0496D(iBinder);
                if (c0496d != null) {
                    long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((p058O1.C0496D) c0496d).m1002K();
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f1479s = account2;
        } else {
            this.f1476p = iBinder;
            this.f1479s = account;
        }
        this.f1477q = scopeArr;
        this.f1478r = bundle;
        this.f1480t = c0359cArr;
        this.f1481u = c0359cArr2;
        this.f1482v = z4;
        this.f1483w = i7;
        this.f1484x = z5;
        this.f1485y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        p057O0.C0488g.m997a(this, parcel, i4);
    }
}
