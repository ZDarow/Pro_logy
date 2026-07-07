package p024F;

/* renamed from: F.i */
/* loaded from: classes.dex */
public final class C0206i implements android.os.Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f574a;

    public /* synthetic */ C0206i(int i4) {
        this.f574a = i4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$BaseSavedState, F.j, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f574a) {
            case 0:
                ?? baseSavedState = new android.view.View.BaseSavedState(parcel);
                baseSavedState.f575l = parcel.readInt();
                return baseSavedState;
            case 1:
                java.lang.String readString = parcel.readString();
                readString.getClass();
                return new p036I0.C0305a(readString, parcel.readInt());
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p039J0.C0310a(parcel);
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                int m1790a0 = p101a.AbstractC0936a.m1790a0(parcel);
                java.lang.String str = null;
                java.lang.String str2 = null;
                java.lang.String str3 = null;
                java.lang.String str4 = null;
                android.net.Uri uri = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                java.util.ArrayList arrayList = null;
                java.lang.String str7 = null;
                java.lang.String str8 = null;
                long j4 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < m1790a0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i4 = p101a.AbstractC0936a.m1776N(parcel, readInt);
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            str = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            str2 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            str3 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            str4 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (android.net.Uri) p101a.AbstractC0936a.m1808p(parcel, readInt, android.net.Uri.CREATOR);
                            break;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str5 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            j4 = p101a.AbstractC0936a.m1777O(parcel, readInt);
                            break;
                        case '\t':
                            str6 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = p101a.AbstractC0936a.m1811s(parcel, readInt, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case 11:
                            str7 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        case '\f':
                            str8 = p101a.AbstractC0936a.m1809q(parcel, readInt);
                            break;
                        default:
                            p101a.AbstractC0936a.m1784V(parcel, readInt);
                            break;
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a0);
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(i4, str, str2, str3, str4, uri, str5, j4, str6, arrayList, str7, str8);
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new p041K0.C0322a(parcel);
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return new p041K0.C0323b(parcel);
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new p045L0.C0355b(parcel);
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p045L0.C0356c(parcel);
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                int m1790a02 = p101a.AbstractC0936a.m1790a0(parcel);
                android.app.PendingIntent pendingIntent = null;
                int i5 = 0;
                int i6 = 0;
                java.lang.String str9 = null;
                while (parcel.dataPosition() < m1790a02) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i5 = p101a.AbstractC0936a.m1776N(parcel, readInt2);
                    } else if (c4 == 2) {
                        i6 = p101a.AbstractC0936a.m1776N(parcel, readInt2);
                    } else if (c4 == 3) {
                        pendingIntent = (android.app.PendingIntent) p101a.AbstractC0936a.m1808p(parcel, readInt2, android.app.PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt2);
                    } else {
                        str9 = p101a.AbstractC0936a.m1809q(parcel, readInt2);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a02);
                return new p046L1.C0357a(i5, i6, pendingIntent, str9);
            case 9:
                int m1790a03 = p101a.AbstractC0936a.m1790a0(parcel);
                long j5 = -1;
                int i7 = 0;
                java.lang.String str10 = null;
                while (parcel.dataPosition() < m1790a03) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        str10 = p101a.AbstractC0936a.m1809q(parcel, readInt3);
                    } else if (c5 == 2) {
                        i7 = p101a.AbstractC0936a.m1776N(parcel, readInt3);
                    } else if (c5 != 3) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt3);
                    } else {
                        j5 = p101a.AbstractC0936a.m1777O(parcel, readInt3);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a03);
                return new p046L1.C0359c(j5, str10, i7);
            case 10:
                return new p049M0.C0402a(parcel);
            case 11:
                return new p049M0.C0403b(parcel);
            case 12:
                return new p049M0.C0404c(parcel);
            case 13:
                return new p049M0.C0405d(parcel);
            case 14:
                return new p049M0.C0406e(parcel);
            case 15:
                return new p049M0.C0407f(parcel);
            case 16:
                return new p049M0.C0412k(parcel);
            case 17:
                return new p049M0.C0413l(parcel);
            case 18:
                return new p049M0.C0414m(parcel);
            case 19:
                java.lang.String readString2 = parcel.readString();
                readString2.getClass();
                java.lang.String readString3 = parcel.readString();
                java.lang.String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new p049M0.C0415n(readString2, readString3, p129f2.AbstractC1393I.m3163k(createStringArray));
            case 20:
                return new p049M0.C0416o(parcel);
            case 21:
                int m1790a04 = p101a.AbstractC0936a.m1790a0(parcel);
                java.lang.String str11 = null;
                int i8 = 0;
                while (parcel.dataPosition() < m1790a04) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        i8 = p101a.AbstractC0936a.m1776N(parcel, readInt4);
                    } else if (c6 != 2) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt4);
                    } else {
                        str11 = p101a.AbstractC0936a.m1809q(parcel, readInt4);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a04);
                return new com.google.android.gms.common.api.Scope(str11, i8);
            case 22:
                int m1790a05 = p101a.AbstractC0936a.m1790a0(parcel);
                java.lang.String str12 = null;
                p046L1.C0357a c0357a = null;
                int i9 = 0;
                android.app.PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < m1790a05) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i9 = p101a.AbstractC0936a.m1776N(parcel, readInt5);
                    } else if (c7 == 2) {
                        str12 = p101a.AbstractC0936a.m1809q(parcel, readInt5);
                    } else if (c7 == 3) {
                        pendingIntent2 = (android.app.PendingIntent) p101a.AbstractC0936a.m1808p(parcel, readInt5, android.app.PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt5);
                    } else {
                        c0357a = (p046L1.C0357a) p101a.AbstractC0936a.m1808p(parcel, readInt5, p046L1.C0357a.CREATOR);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a05);
                return new com.google.android.gms.common.api.Status(i9, str12, pendingIntent2, c0357a);
            case 23:
                return new p053N0.C0438a(parcel);
            case 24:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                parcel.readList(arrayList2, p053N0.C0439b.class.getClassLoader());
                return new p053N0.C0440c(arrayList2);
            case 25:
                return new p053N0.C0439b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 26:
                return new p053N0.C0441d(parcel);
            case 27:
                return new p057O0.C0482a(parcel);
            case 28:
                return new p057O0.C0486e(parcel);
            default:
                return new java.lang.Object();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i4) {
        switch (this.f574a) {
            case 0:
                return new p024F.C0207j[i4];
            case 1:
                return new p036I0.C0305a[i4];
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p039J0.C0310a[i4];
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i4];
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new p041K0.C0322a[i4];
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return new p041K0.C0323b[i4];
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new p045L0.C0355b[i4];
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p045L0.C0356c[i4];
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return new p046L1.C0357a[i4];
            case 9:
                return new p046L1.C0359c[i4];
            case 10:
                return new p049M0.C0402a[i4];
            case 11:
                return new p049M0.C0403b[i4];
            case 12:
                return new p049M0.C0404c[i4];
            case 13:
                return new p049M0.C0405d[i4];
            case 14:
                return new p049M0.C0406e[i4];
            case 15:
                return new p049M0.C0407f[i4];
            case 16:
                return new p049M0.C0412k[i4];
            case 17:
                return new p049M0.C0413l[i4];
            case 18:
                return new p049M0.C0414m[i4];
            case 19:
                return new p049M0.C0415n[i4];
            case 20:
                return new p049M0.C0416o[i4];
            case 21:
                return new com.google.android.gms.common.api.Scope[i4];
            case 22:
                return new com.google.android.gms.common.api.Status[i4];
            case 23:
                return new p053N0.C0438a[i4];
            case 24:
                return new p053N0.C0440c[i4];
            case 25:
                return new p053N0.C0439b[i4];
            case 26:
                return new p053N0.C0441d[i4];
            case 27:
                return new p057O0.C0482a[i4];
            case 28:
                return new p057O0.C0486e[i4];
            default:
                return new p057O0.C0487f[i4];
        }
    }
}
