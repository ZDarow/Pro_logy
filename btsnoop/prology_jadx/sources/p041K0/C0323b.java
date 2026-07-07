package p041K0;

/* renamed from: K0.b */
/* loaded from: classes.dex */
public class C0323b implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p041K0.C0323b> CREATOR = new p024F.C0206i(5);

    /* renamed from: l */
    public final java.lang.String f982l;

    /* renamed from: m */
    public final java.lang.String f983m;

    public C0323b(java.lang.String str, java.lang.String str2) {
        this.f982l = p080U1.AbstractC0748a.m1364L(str);
        this.f983m = str2;
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: c */
    public final void mo717c(p076T.C0661D c0661d) {
        java.lang.String str = this.f982l;
        str.getClass();
        java.lang.String str2 = this.f983m;
        char c4 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c4 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c4 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c4 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c4 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                c0661d.f2152c = str2;
                return;
            case 1:
                c0661d.f2150a = str2;
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                c0661d.f2154e = str2;
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                c0661d.f2153d = str2;
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                c0661d.f2151b = str2;
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p041K0.C0323b c0323b = (p041K0.C0323b) obj;
        return this.f982l.equals(c0323b.f982l) && this.f983m.equals(c0323b.f983m);
    }

    public final int hashCode() {
        return this.f983m.hashCode() + ((this.f982l.hashCode() + 527) * 31);
    }

    public final java.lang.String toString() {
        return "VC: " + this.f982l + "=" + this.f983m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f982l);
        parcel.writeString(this.f983m);
    }

    public C0323b(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f982l = readString;
        this.f983m = parcel.readString();
    }
}
