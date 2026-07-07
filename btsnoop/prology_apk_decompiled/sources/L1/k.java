package L1;

import O1.q;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k extends W1.b implements q {

    /* renamed from: d, reason: collision with root package name */
    public final int f1079d;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f1079d = Arrays.hashCode(bArr);
    }

    public static byte[] o0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q)) {
            try {
                q qVar = (q) obj;
                if (((k) qVar).f1079d != this.f1079d) {
                    return false;
                }
                return Arrays.equals(p0(), new V1.a(((k) qVar).p0()).f2637d);
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1079d;
    }

    @Override // W1.b
    public final boolean m0(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            V1.a aVar = new V1.a(p0());
            parcel2.writeNoException();
            int i5 = X1.a.f2913a;
            parcel2.writeStrongBinder(aVar);
        } else {
            if (i4 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f1079d);
        }
        return true;
    }

    public abstract byte[] p0();
}
