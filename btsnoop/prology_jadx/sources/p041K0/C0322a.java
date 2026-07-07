package p041K0;

/* renamed from: K0.a */
/* loaded from: classes.dex */
public final class C0322a implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p041K0.C0322a> CREATOR = new p024F.C0206i(4);

    /* renamed from: l */
    public final int f974l;

    /* renamed from: m */
    public final java.lang.String f975m;

    /* renamed from: n */
    public final java.lang.String f976n;

    /* renamed from: o */
    public final int f977o;

    /* renamed from: p */
    public final int f978p;

    /* renamed from: q */
    public final int f979q;

    /* renamed from: r */
    public final int f980r;

    /* renamed from: s */
    public final byte[] f981s;

    public C0322a(int i4, java.lang.String str, java.lang.String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f974l = i4;
        this.f975m = str;
        this.f976n = str2;
        this.f977o = i5;
        this.f978p = i6;
        this.f979q = i7;
        this.f980r = i8;
        this.f981s = bArr;
    }

    /* renamed from: d */
    public static p041K0.C0322a m716d(p086W.C0798r c0798r) {
        int m1546h = c0798r.m1546h();
        java.lang.String m1201l = p076T.AbstractC0665H.m1201l(c0798r.m1557s(c0798r.m1546h(), p124e2.AbstractC1356d.f5628a));
        java.lang.String m1557s = c0798r.m1557s(c0798r.m1546h(), p124e2.AbstractC1356d.f5630c);
        int m1546h2 = c0798r.m1546h();
        int m1546h3 = c0798r.m1546h();
        int m1546h4 = c0798r.m1546h();
        int m1546h5 = c0798r.m1546h();
        int m1546h6 = c0798r.m1546h();
        byte[] bArr = new byte[m1546h6];
        c0798r.m1544f(bArr, 0, m1546h6);
        return new p041K0.C0322a(m1546h, m1201l, m1557s, m1546h2, m1546h3, m1546h4, m1546h5, bArr);
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: c */
    public final void mo717c(p076T.C0661D c0661d) {
        c0661d.m1180a(this.f981s, this.f974l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p041K0.C0322a.class != obj.getClass()) {
            return false;
        }
        p041K0.C0322a c0322a = (p041K0.C0322a) obj;
        return this.f974l == c0322a.f974l && this.f975m.equals(c0322a.f975m) && this.f976n.equals(c0322a.f976n) && this.f977o == c0322a.f977o && this.f978p == c0322a.f978p && this.f979q == c0322a.f979q && this.f980r == c0322a.f980r && java.util.Arrays.equals(this.f981s, c0322a.f981s);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f981s) + ((((((((((this.f976n.hashCode() + ((this.f975m.hashCode() + ((527 + this.f974l) * 31)) * 31)) * 31) + this.f977o) * 31) + this.f978p) * 31) + this.f979q) * 31) + this.f980r) * 31);
    }

    public final java.lang.String toString() {
        return "Picture: mimeType=" + this.f975m + ", description=" + this.f976n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f974l);
        parcel.writeString(this.f975m);
        parcel.writeString(this.f976n);
        parcel.writeInt(this.f977o);
        parcel.writeInt(this.f978p);
        parcel.writeInt(this.f979q);
        parcel.writeInt(this.f980r);
        parcel.writeByteArray(this.f981s);
    }

    public C0322a(android.os.Parcel parcel) {
        this.f974l = parcel.readInt();
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f975m = readString;
        this.f976n = parcel.readString();
        this.f977o = parcel.readInt();
        this.f978p = parcel.readInt();
        this.f979q = parcel.readInt();
        this.f980r = parcel.readInt();
        this.f981s = parcel.createByteArray();
    }
}
