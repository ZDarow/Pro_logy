package p076T;

/* renamed from: T.G */
/* loaded from: classes.dex */
public final class C0664G implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p076T.C0664G> CREATOR = new p057O0.C0488g(14);

    /* renamed from: l */
    public final p076T.InterfaceC0663F[] f2198l;

    /* renamed from: m */
    public final long f2199m;

    public C0664G(p076T.InterfaceC0663F... interfaceC0663FArr) {
        this(-9223372036854775807L, interfaceC0663FArr);
    }

    /* renamed from: d */
    public final p076T.C0664G m1186d(p076T.InterfaceC0663F... interfaceC0663FArr) {
        if (interfaceC0663FArr.length == 0) {
            return this;
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        p076T.InterfaceC0663F[] interfaceC0663FArr2 = this.f2198l;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(interfaceC0663FArr2, interfaceC0663FArr2.length + interfaceC0663FArr.length);
        java.lang.System.arraycopy(interfaceC0663FArr, 0, copyOf, interfaceC0663FArr2.length, interfaceC0663FArr.length);
        return new p076T.C0664G(this.f2199m, (p076T.InterfaceC0663F[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final p076T.C0664G m1187e(p076T.C0664G c0664g) {
        return c0664g == null ? this : m1186d(c0664g.f2198l);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0664G.class != obj.getClass()) {
            return false;
        }
        p076T.C0664G c0664g = (p076T.C0664G) obj;
        return java.util.Arrays.equals(this.f2198l, c0664g.f2198l) && this.f2199m == c0664g.f2199m;
    }

    /* renamed from: f */
    public final p076T.InterfaceC0663F m1188f(int i4) {
        return this.f2198l[i4];
    }

    /* renamed from: g */
    public final int m1189g() {
        return this.f2198l.length;
    }

    public final int hashCode() {
        return p176p1.AbstractC1949a.m3947z(this.f2199m) + (java.util.Arrays.hashCode(this.f2198l) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("entries=");
        sb.append(java.util.Arrays.toString(this.f2198l));
        long j4 = this.f2199m;
        if (j4 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j4;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        p076T.InterfaceC0663F[] interfaceC0663FArr = this.f2198l;
        parcel.writeInt(interfaceC0663FArr.length);
        for (p076T.InterfaceC0663F interfaceC0663F : interfaceC0663FArr) {
            parcel.writeParcelable(interfaceC0663F, 0);
        }
        parcel.writeLong(this.f2199m);
    }

    public C0664G(long j4, p076T.InterfaceC0663F... interfaceC0663FArr) {
        this.f2199m = j4;
        this.f2198l = interfaceC0663FArr;
    }

    public C0664G(java.util.List list) {
        this((p076T.InterfaceC0663F[]) list.toArray(new p076T.InterfaceC0663F[0]));
    }

    public C0664G(android.os.Parcel parcel) {
        this.f2198l = new p076T.InterfaceC0663F[parcel.readInt()];
        int i4 = 0;
        while (true) {
            p076T.InterfaceC0663F[] interfaceC0663FArr = this.f2198l;
            if (i4 < interfaceC0663FArr.length) {
                interfaceC0663FArr[i4] = (p076T.InterfaceC0663F) parcel.readParcelable(p076T.InterfaceC0663F.class.getClassLoader());
                i4++;
            } else {
                this.f2199m = parcel.readLong();
                return;
            }
        }
    }
}
