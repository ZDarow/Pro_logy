package p058O1;

/* renamed from: O1.w */
/* loaded from: classes.dex */
public final class C0519w extends p058O1.AbstractC0512p {

    /* renamed from: g */
    public final android.os.IBinder f1535g;

    /* renamed from: h */
    public final /* synthetic */ com.google.android.gms.common.internal.AbstractC1253a f1536h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519w(com.google.android.gms.common.internal.AbstractC1253a abstractC1253a, int i4, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(abstractC1253a, i4, bundle);
        this.f1536h = abstractC1253a;
        this.f1535g = iBinder;
    }

    @Override // p058O1.AbstractC0512p
    /* renamed from: a */
    public final void mo1010a(p046L1.C0357a c0357a) {
        p058O1.C0504h c0504h = this.f1536h.f4937z;
        if (c0504h != null) {
            ((p050M1.InterfaceC0424h) c0504h.f1497a).mo902f0(c0357a);
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // p058O1.AbstractC0512p
    /* renamed from: b */
    public final boolean mo1011b() {
        android.os.IBinder iBinder = this.f1535g;
        try {
            p058O1.AbstractC0515s.m1017d(iBinder);
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.AbstractC1253a abstractC1253a = this.f1536h;
            if (!abstractC1253a.mo1081r().equals(interfaceDescriptor)) {
                android.util.Log.w("GmsClient", "service descriptor mismatch: " + abstractC1253a.mo1081r() + " vs. " + interfaceDescriptor);
                return false;
            }
            android.os.IInterface mo1078n = abstractC1253a.mo1078n(iBinder);
            if (mo1078n == null || !(com.google.android.gms.common.internal.AbstractC1253a.m2934v(abstractC1253a, 2, 4, mo1078n) || com.google.android.gms.common.internal.AbstractC1253a.m2934v(abstractC1253a, 3, 4, mo1078n))) {
                return false;
            }
            abstractC1253a.f4918D = null;
            p058O1.C0504h c0504h = abstractC1253a.f4936y;
            if (c0504h == null) {
                return true;
            }
            ((p050M1.InterfaceC0423g) c0504h.f1497a).mo901V();
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
