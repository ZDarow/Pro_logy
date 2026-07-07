package p058O1;

/* renamed from: O1.u */
/* loaded from: classes.dex */
public final class BinderC0517u extends p088W1.AbstractBinderC0816b {

    /* renamed from: d */
    public com.google.android.gms.common.internal.AbstractC1253a f1531d;

    /* renamed from: e */
    public final int f1532e;

    public BinderC0517u(com.google.android.gms.common.internal.AbstractC1253a abstractC1253a, int i4) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f1531d = abstractC1253a;
        this.f1532e = i4;
    }

    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: m0 */
    public final boolean mo826m0(int i4, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i4 == 1) {
            int readInt = parcel.readInt();
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) p092X1.AbstractC0839a.m1678a(parcel, android.os.Bundle.CREATOR);
            p092X1.AbstractC0839a.m1679b(parcel);
            p058O1.AbstractC0515s.m1018e(this.f1531d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.AbstractC1253a abstractC1253a = this.f1531d;
            abstractC1253a.getClass();
            p058O1.C0519w c0519w = new p058O1.C0519w(abstractC1253a, readInt, readStrongBinder, bundle);
            p058O1.HandlerC0516t handlerC0516t = abstractC1253a.f4927p;
            handlerC0516t.sendMessage(handlerC0516t.obtainMessage(1, this.f1532e, -1, c0519w));
            this.f1531d = null;
        } else if (i4 == 2) {
            parcel.readInt();
            p092X1.AbstractC0839a.m1679b(parcel);
            android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
        } else {
            if (i4 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            p058O1.C0521y c0521y = (p058O1.C0521y) p092X1.AbstractC0839a.m1678a(parcel, p058O1.C0521y.CREATOR);
            p092X1.AbstractC0839a.m1679b(parcel);
            com.google.android.gms.common.internal.AbstractC1253a abstractC1253a2 = this.f1531d;
            p058O1.AbstractC0515s.m1018e(abstractC1253a2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            p058O1.AbstractC0515s.m1017d(c0521y);
            abstractC1253a2.f4920F = c0521y;
            if (abstractC1253a2 instanceof p096Y1.C0898i) {
                p058O1.C0500d c0500d = c0521y.f1541o;
                p058O1.C0504h m1003b = p058O1.C0504h.m1003b();
                p058O1.C0505i c0505i = c0500d == null ? null : c0500d.f1464l;
                synchronized (m1003b) {
                    if (c0505i == null) {
                        c0505i = p058O1.C0504h.f1496c;
                    } else {
                        p058O1.C0505i c0505i2 = (p058O1.C0505i) m1003b.f1497a;
                        if (c0505i2 != null) {
                            if (c0505i2.f1498l < c0505i.f1498l) {
                            }
                        }
                    }
                    m1003b.f1497a = c0505i;
                }
            }
            android.os.Bundle bundle2 = c0521y.f1538l;
            p058O1.AbstractC0515s.m1018e(this.f1531d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.AbstractC1253a abstractC1253a3 = this.f1531d;
            abstractC1253a3.getClass();
            p058O1.C0519w c0519w2 = new p058O1.C0519w(abstractC1253a3, readInt2, readStrongBinder2, bundle2);
            p058O1.HandlerC0516t handlerC0516t2 = abstractC1253a3.f4927p;
            handlerC0516t2.sendMessage(handlerC0516t2.obtainMessage(1, this.f1532e, -1, c0519w2));
            this.f1531d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
