package J0;

import F.i;
import L.k;
import T.C0094o;
import T.C0095p;
import T.F;
import T.H;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements F {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: r, reason: collision with root package name */
    public static final C0095p f890r;
    public static final C0095p s;

    /* renamed from: l, reason: collision with root package name */
    public final String f891l;

    /* renamed from: m, reason: collision with root package name */
    public final String f892m;

    /* renamed from: n, reason: collision with root package name */
    public final long f893n;

    /* renamed from: o, reason: collision with root package name */
    public final long f894o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f895p;

    /* renamed from: q, reason: collision with root package name */
    public int f896q;

    static {
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("application/id3");
        f890r = new C0095p(c0094o);
        C0094o c0094o2 = new C0094o();
        c0094o2.f2290l = H.l("application/x-scte35");
        s = new C0095p(c0094o2);
        CREATOR = new i(2);
    }

    public a(String str, String str2, long j4, long j5, byte[] bArr) {
        this.f891l = str;
        this.f892m = str2;
        this.f893n = j4;
        this.f894o = j5;
        this.f895p = bArr;
    }

    @Override // T.F
    public final byte[] a() {
        if (b() != null) {
            return this.f895p;
        }
        return null;
    }

    @Override // T.F
    public final C0095p b() {
        String str = this.f891l;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c4 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c4 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c4 = 2;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return s;
            case 1:
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return f890r;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f893n == aVar.f893n && this.f894o == aVar.f894o && y.a(this.f891l, aVar.f891l) && y.a(this.f892m, aVar.f892m) && Arrays.equals(this.f895p, aVar.f895p);
    }

    public final int hashCode() {
        if (this.f896q == 0) {
            String str = this.f891l;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f892m;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j4 = this.f893n;
            int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f894o;
            this.f896q = Arrays.hashCode(this.f895p) + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        }
        return this.f896q;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f891l + ", id=" + this.f894o + ", durationMs=" + this.f893n + ", value=" + this.f892m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f891l);
        parcel.writeString(this.f892m);
        parcel.writeLong(this.f893n);
        parcel.writeLong(this.f894o);
        parcel.writeByteArray(this.f895p);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f891l = readString;
        this.f892m = parcel.readString();
        this.f893n = parcel.readLong();
        this.f894o = parcel.readLong();
        this.f895p = parcel.createByteArray();
    }
}
