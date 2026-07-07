package Y1;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class m extends P1.a {
    public static final Parcelable.Creator<m> CREATOR = new O0.g(21);

    /* renamed from: l, reason: collision with root package name */
    public final int f3105l;

    /* renamed from: m, reason: collision with root package name */
    public final l f3106m;

    /* renamed from: n, reason: collision with root package name */
    public final a2.o f3107n;

    /* renamed from: o, reason: collision with root package name */
    public final a2.l f3108o;

    /* renamed from: p, reason: collision with root package name */
    public final PendingIntent f3109p;

    /* renamed from: q, reason: collision with root package name */
    public final w f3110q;

    /* renamed from: r, reason: collision with root package name */
    public final String f3111r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [W1.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [W1.a] */
    /* JADX WARN: Type inference failed for: r6v5, types: [W1.a] */
    public m(int i4, l lVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        a2.o oVar;
        a2.l lVar2;
        this.f3105l = i4;
        this.f3106m = lVar;
        w wVar = null;
        if (iBinder != null) {
            int i5 = a2.n.f3623d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            oVar = queryLocalInterface instanceof a2.o ? (a2.o) queryLocalInterface : new W1.a(iBinder, "com.google.android.gms.location.ILocationListener", 1);
        } else {
            oVar = null;
        }
        this.f3107n = oVar;
        this.f3109p = pendingIntent;
        if (iBinder2 != null) {
            int i6 = h.f3089e;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            lVar2 = queryLocalInterface2 instanceof a2.l ? (a2.l) queryLocalInterface2 : new W1.a(iBinder2, "com.google.android.gms.location.ILocationCallback", 1);
        } else {
            lVar2 = null;
        }
        this.f3108o = lVar2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            wVar = queryLocalInterface3 instanceof w ? (w) queryLocalInterface3 : new W1.a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
        }
        this.f3110q = wVar;
        this.f3111r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f3105l);
        AbstractC0462a.S(parcel, 2, this.f3106m, i4);
        IInterface iInterface = this.f3107n;
        AbstractC0462a.R(parcel, 3, iInterface == null ? null : ((W1.a) iInterface).f2812d);
        AbstractC0462a.S(parcel, 4, this.f3109p, i4);
        a2.l lVar = this.f3108o;
        AbstractC0462a.R(parcel, 5, lVar == null ? null : lVar.asBinder());
        w wVar = this.f3110q;
        AbstractC0462a.R(parcel, 6, wVar != null ? wVar.asBinder() : null);
        AbstractC0462a.T(parcel, 8, this.f3111r);
        AbstractC0462a.Y(parcel, X3);
    }
}
