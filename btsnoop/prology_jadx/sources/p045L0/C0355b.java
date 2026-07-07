package p045L0;

/* renamed from: L0.b */
/* loaded from: classes.dex */
public final class C0355b implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p045L0.C0355b> CREATOR = new p024F.C0206i(6);

    /* renamed from: l */
    public final int f1083l;

    /* renamed from: m */
    public final java.lang.String f1084m;

    /* renamed from: n */
    public final java.lang.String f1085n;

    /* renamed from: o */
    public final java.lang.String f1086o;

    /* renamed from: p */
    public final boolean f1087p;

    /* renamed from: q */
    public final int f1088q;

    public C0355b(int i4, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z4, int i5) {
        p086W.AbstractC0781a.m1416e(i5 == -1 || i5 > 0);
        this.f1083l = i4;
        this.f1084m = str;
        this.f1085n = str2;
        this.f1086o = str3;
        this.f1087p = z4;
        this.f1088q = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p045L0.C0355b m802d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p045L0.C0355b.m802d(java.util.Map):L0.b");
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: c */
    public final void mo717c(p076T.C0661D c0661d) {
        java.lang.String str = this.f1085n;
        if (str != null) {
            c0661d.f2171v = str;
        }
        java.lang.String str2 = this.f1084m;
        if (str2 != null) {
            c0661d.f2170u = str2;
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
        if (obj == null || p045L0.C0355b.class != obj.getClass()) {
            return false;
        }
        p045L0.C0355b c0355b = (p045L0.C0355b) obj;
        return this.f1083l == c0355b.f1083l && p086W.AbstractC0805y.m1606a(this.f1084m, c0355b.f1084m) && p086W.AbstractC0805y.m1606a(this.f1085n, c0355b.f1085n) && p086W.AbstractC0805y.m1606a(this.f1086o, c0355b.f1086o) && this.f1087p == c0355b.f1087p && this.f1088q == c0355b.f1088q;
    }

    public final int hashCode() {
        int i4 = (527 + this.f1083l) * 31;
        java.lang.String str = this.f1084m;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f1085n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f1086o;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f1087p ? 1 : 0)) * 31) + this.f1088q;
    }

    public final java.lang.String toString() {
        return "IcyHeaders: name=\"" + this.f1085n + "\", genre=\"" + this.f1084m + "\", bitrate=" + this.f1083l + ", metadataInterval=" + this.f1088q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f1083l);
        parcel.writeString(this.f1084m);
        parcel.writeString(this.f1085n);
        parcel.writeString(this.f1086o);
        int i5 = p086W.AbstractC0805y.f2801a;
        parcel.writeInt(this.f1087p ? 1 : 0);
        parcel.writeInt(this.f1088q);
    }

    public C0355b(android.os.Parcel parcel) {
        this.f1083l = parcel.readInt();
        this.f1084m = parcel.readString();
        this.f1085n = parcel.readString();
        this.f1086o = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1087p = parcel.readInt() != 0;
        this.f1088q = parcel.readInt();
    }
}
