package p104a2;

/* renamed from: a2.g */
/* loaded from: classes.dex */
public final class C1009g implements android.os.Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f3739a;

    public /* synthetic */ C1009g(int i4) {
        this.f3739a = i4;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [k1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k1.G] */
    /* JADX WARN: Type inference failed for: r0v12, types: [k1.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [c.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [c.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p111c.InterfaceC1199b interfaceC1199b = null;
        p046L1.C0357a c0357a = null;
        android.content.Intent intent = null;
        int i4 = 0;
        switch (this.f3739a) {
            case 0:
                int m1790a0 = p101a.AbstractC0936a.m1790a0(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < m1790a0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            z4 = p101a.AbstractC0936a.m1773K(parcel, readInt);
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            z5 = p101a.AbstractC0936a.m1773K(parcel, readInt);
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            z6 = p101a.AbstractC0936a.m1773K(parcel, readInt);
                            break;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            z7 = p101a.AbstractC0936a.m1773K(parcel, readInt);
                            break;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            z8 = p101a.AbstractC0936a.m1773K(parcel, readInt);
                            break;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            z9 = p101a.AbstractC0936a.m1773K(parcel, readInt);
                            break;
                        default:
                            p101a.AbstractC0936a.m1784V(parcel, readInt);
                            break;
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a0);
                return new p104a2.C1008f(z4, z5, z6, z7, z8, z9);
            case 1:
                int m1790a02 = p101a.AbstractC0936a.m1790a0(parcel);
                int i5 = 1;
                int i6 = 1;
                long j4 = -1;
                long j5 = -1;
                while (parcel.dataPosition() < m1790a02) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i5 = p101a.AbstractC0936a.m1776N(parcel, readInt2);
                    } else if (c4 == 2) {
                        i6 = p101a.AbstractC0936a.m1776N(parcel, readInt2);
                    } else if (c4 == 3) {
                        j4 = p101a.AbstractC0936a.m1777O(parcel, readInt2);
                    } else if (c4 != 4) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt2);
                    } else {
                        j5 = p101a.AbstractC0936a.m1777O(parcel, readInt2);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a02);
                return new p104a2.C1011i(i5, i6, j4, j5);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new android.support.v4.media.MediaBrowserCompat$MediaItem(parcel);
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return android.support.v4.media.MediaDescriptionCompat.m2060d(android.media.MediaDescription.CREATOR.createFromParcel(parcel));
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new android.support.v4.media.MediaMetadataCompat(parcel);
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return new android.support.v4.media.RatingCompat(parcel.readFloat(), parcel.readInt());
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? obj = new java.lang.Object();
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                int i7 = p111c.BinderC1200c.f4628d;
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(p111c.InterfaceC1199b.f4627b);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof p111c.InterfaceC1199b)) {
                        ?? obj2 = new java.lang.Object();
                        obj2.f4626c = readStrongBinder;
                        interfaceC1199b = obj2;
                    } else {
                        interfaceC1199b = (p111c.InterfaceC1199b) queryLocalInterface;
                    }
                }
                obj.f4630l = interfaceC1199b;
                return obj;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                int m1790a03 = p101a.AbstractC0936a.m1790a0(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < m1790a03) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i4 = p101a.AbstractC0936a.m1776N(parcel, readInt3);
                    } else if (c5 == 2) {
                        i8 = p101a.AbstractC0936a.m1776N(parcel, readInt3);
                    } else if (c5 != 3) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt3);
                    } else {
                        intent = (android.content.Intent) p101a.AbstractC0936a.m1808p(parcel, readInt3, android.content.Intent.CREATOR);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a03);
                return new p114c2.C1247b(i4, i8, intent);
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                int m1790a04 = p101a.AbstractC0936a.m1790a0(parcel);
                java.util.ArrayList<java.lang.String> arrayList = null;
                java.lang.String str = null;
                while (parcel.dataPosition() < m1790a04) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        int m1778P = p101a.AbstractC0936a.m1778P(parcel, readInt4);
                        int dataPosition = parcel.dataPosition();
                        if (m1778P == 0) {
                            arrayList = null;
                        } else {
                            java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + m1778P);
                            arrayList = createStringArrayList;
                        }
                    } else if (c6 != 2) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt4);
                    } else {
                        str = p101a.AbstractC0936a.m1809q(parcel, readInt4);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a04);
                return new p114c2.C1250e(str, arrayList);
            case 9:
                int m1790a05 = p101a.AbstractC0936a.m1790a0(parcel);
                int i9 = 0;
                p058O1.C0511o c0511o = null;
                while (parcel.dataPosition() < m1790a05) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i9 = p101a.AbstractC0936a.m1776N(parcel, readInt5);
                    } else if (c7 == 2) {
                        c0357a = (p046L1.C0357a) p101a.AbstractC0936a.m1808p(parcel, readInt5, p046L1.C0357a.CREATOR);
                    } else if (c7 != 3) {
                        p101a.AbstractC0936a.m1784V(parcel, readInt5);
                    } else {
                        c0511o = (p058O1.C0511o) p101a.AbstractC0936a.m1808p(parcel, readInt5, p058O1.C0511o.CREATOR);
                    }
                }
                p101a.AbstractC0936a.m1813u(parcel, m1790a05);
                return new p114c2.C1251f(i9, c0357a, c0511o);
            case 10:
                return new p132g0.C1475t(parcel);
            case 11:
                return new p132g0.C1474s(parcel);
            case 12:
                ?? obj3 = new java.lang.Object();
                obj3.f7283l = parcel.readInt();
                obj3.f7284m = parcel.readInt();
                obj3.f7285n = parcel.readInt() == 1;
                return obj3;
            case 13:
                ?? obj4 = new java.lang.Object();
                obj4.f7213l = parcel.readInt();
                obj4.f7214m = parcel.readInt();
                obj4.f7216o = parcel.readInt() == 1;
                int readInt6 = parcel.readInt();
                if (readInt6 > 0) {
                    int[] iArr = new int[readInt6];
                    obj4.f7215n = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 14:
                ?? obj5 = new java.lang.Object();
                obj5.f7217l = parcel.readInt();
                obj5.f7218m = parcel.readInt();
                int readInt7 = parcel.readInt();
                obj5.f7219n = readInt7;
                if (readInt7 > 0) {
                    int[] iArr2 = new int[readInt7];
                    obj5.f7220o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt8 = parcel.readInt();
                obj5.f7221p = readInt8;
                if (readInt8 > 0) {
                    int[] iArr3 = new int[readInt8];
                    obj5.f7222q = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj5.f7224s = parcel.readInt() == 1;
                obj5.f7225t = parcel.readInt() == 1;
                obj5.f7226u = parcel.readInt() == 1;
                obj5.f7223r = parcel.readArrayList(p152k1.C1759G.class.getClassLoader());
                return obj5;
            default:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i4) {
        switch (this.f3739a) {
            case 0:
                return new p104a2.C1008f[i4];
            case 1:
                return new p104a2.C1011i[i4];
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new android.support.v4.media.MediaBrowserCompat$MediaItem[i4];
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return new android.support.v4.media.MediaDescriptionCompat[i4];
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new android.support.v4.media.MediaMetadataCompat[i4];
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return new android.support.v4.media.RatingCompat[i4];
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new p111c.C1201d[i4];
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p114c2.C1247b[i4];
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return new p114c2.C1250e[i4];
            case 9:
                return new p114c2.C1251f[i4];
            case 10:
                return new p132g0.C1475t[i4];
            case 11:
                return new p132g0.C1474s[i4];
            case 12:
                return new p152k1.C1772k[i4];
            case 13:
                return new p152k1.C1759G[i4];
            case 14:
                return new p152k1.C1760H[i4];
            default:
                return new androidx.versionedparcelable.ParcelImpl[i4];
        }
    }
}
