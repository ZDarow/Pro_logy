package p039J0;

/* renamed from: J0.a */
/* loaded from: classes.dex */
public final class C0310a implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p039J0.C0310a> CREATOR;

    /* renamed from: r */
    public static final p076T.C0702p f923r;

    /* renamed from: s */
    public static final p076T.C0702p f924s;

    /* renamed from: l */
    public final java.lang.String f925l;

    /* renamed from: m */
    public final java.lang.String f926m;

    /* renamed from: n */
    public final long f927n;

    /* renamed from: o */
    public final long f928o;

    /* renamed from: p */
    public final byte[] f929p;

    /* renamed from: q */
    public int f930q;

    static {
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/id3");
        f923r = new p076T.C0702p(c0701o);
        p076T.C0701o c0701o2 = new p076T.C0701o();
        c0701o2.f2370l = p076T.AbstractC0665H.m1201l("application/x-scte35");
        f924s = new p076T.C0702p(c0701o2);
        CREATOR = new p024F.C0206i(2);
    }

    public C0310a(java.lang.String str, java.lang.String str2, long j4, long j5, byte[] bArr) {
        this.f925l = str;
        this.f926m = str2;
        this.f927n = j4;
        this.f928o = j5;
        this.f929p = bArr;
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: a */
    public final byte[] mo710a() {
        if (mo711b() != null) {
            return this.f929p;
        }
        return null;
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: b */
    public final p076T.C0702p mo711b() {
        java.lang.String str = this.f925l;
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
                return f924s;
            case 1:
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return f923r;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p039J0.C0310a.class != obj.getClass()) {
            return false;
        }
        p039J0.C0310a c0310a = (p039J0.C0310a) obj;
        return this.f927n == c0310a.f927n && this.f928o == c0310a.f928o && p086W.AbstractC0805y.m1606a(this.f925l, c0310a.f925l) && p086W.AbstractC0805y.m1606a(this.f926m, c0310a.f926m) && java.util.Arrays.equals(this.f929p, c0310a.f929p);
    }

    public final int hashCode() {
        if (this.f930q == 0) {
            java.lang.String str = this.f925l;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.f926m;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j4 = this.f927n;
            int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f928o;
            this.f930q = java.util.Arrays.hashCode(this.f929p) + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        }
        return this.f930q;
    }

    public final java.lang.String toString() {
        return "EMSG: scheme=" + this.f925l + ", id=" + this.f928o + ", durationMs=" + this.f927n + ", value=" + this.f926m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f925l);
        parcel.writeString(this.f926m);
        parcel.writeLong(this.f927n);
        parcel.writeLong(this.f928o);
        parcel.writeByteArray(this.f929p);
    }

    public C0310a(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f925l = readString;
        this.f926m = parcel.readString();
        this.f927n = parcel.readLong();
        this.f928o = parcel.readLong();
        this.f929p = parcel.createByteArray();
    }
}
