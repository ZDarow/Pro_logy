package p046L1;

/* renamed from: L1.k */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0367k extends p088W1.AbstractBinderC0816b implements p058O1.InterfaceC0513q {

    /* renamed from: d */
    public final int f1118d;

    public AbstractBinderC0367k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        if (bArr.length != 25) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f1118d = java.util.Arrays.hashCode(bArr);
    }

    /* renamed from: o0 */
    public static byte[] m825o0(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e4) {
            throw new java.lang.AssertionError(e4);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof p058O1.InterfaceC0513q)) {
            try {
                p058O1.InterfaceC0513q interfaceC0513q = (p058O1.InterfaceC0513q) obj;
                if (((p046L1.AbstractBinderC0367k) interfaceC0513q).f1118d != this.f1118d) {
                    return false;
                }
                return java.util.Arrays.equals(mo824p0(), new p084V1.BinderC0778a(((p046L1.AbstractBinderC0367k) interfaceC0513q).mo824p0()).f2729d);
            } catch (android.os.RemoteException e4) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1118d;
    }

    @Override // p088W1.AbstractBinderC0816b
    /* renamed from: m0 */
    public final boolean mo826m0(int i4, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i4 == 1) {
            p084V1.BinderC0778a binderC0778a = new p084V1.BinderC0778a(mo824p0());
            parcel2.writeNoException();
            int i5 = p092X1.AbstractC0839a.f3011a;
            parcel2.writeStrongBinder(binderC0778a);
        } else {
            if (i4 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f1118d);
        }
        return true;
    }

    /* renamed from: p0 */
    public abstract byte[] mo824p0();
}
