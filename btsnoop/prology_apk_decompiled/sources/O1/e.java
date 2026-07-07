package O1;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class e extends P1.a {

    /* renamed from: l, reason: collision with root package name */
    public final int f1424l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1425m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1426n;

    /* renamed from: o, reason: collision with root package name */
    public String f1427o;

    /* renamed from: p, reason: collision with root package name */
    public IBinder f1428p;

    /* renamed from: q, reason: collision with root package name */
    public Scope[] f1429q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f1430r;
    public Account s;

    /* renamed from: t, reason: collision with root package name */
    public L1.c[] f1431t;

    /* renamed from: u, reason: collision with root package name */
    public L1.c[] f1432u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1433v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1434x;

    /* renamed from: y, reason: collision with root package name */
    public final String f1435y;
    public static final Parcelable.Creator<e> CREATOR = new O0.g(10);

    /* renamed from: z, reason: collision with root package name */
    public static final Scope[] f1423z = new Scope[0];

    /* renamed from: A, reason: collision with root package name */
    public static final L1.c[] f1422A = new L1.c[0];

    public e(int i4, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, L1.c[] cVarArr, L1.c[] cVarArr2, boolean z4, int i7, boolean z5, String str2) {
        scopeArr = scopeArr == null ? f1423z : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        L1.c[] cVarArr3 = f1422A;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f1424l = i4;
        this.f1425m = i5;
        this.f1426n = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f1427o = "com.google.android.gms";
        } else {
            this.f1427o = str;
        }
        if (i4 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC0061a.f1413d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface d4 = queryLocalInterface instanceof f ? (f) queryLocalInterface : new D(iBinder);
                if (d4 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((D) d4).K();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.s = account2;
        } else {
            this.f1428p = iBinder;
            this.s = account;
        }
        this.f1429q = scopeArr;
        this.f1430r = bundle;
        this.f1431t = cVarArr;
        this.f1432u = cVarArr2;
        this.f1433v = z4;
        this.w = i7;
        this.f1434x = z5;
        this.f1435y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        O0.g.a(this, parcel, i4);
    }
}
