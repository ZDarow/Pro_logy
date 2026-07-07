package a2;

import a.AbstractC0110a;
import android.content.Intent;
import android.media.MediaDescription;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.versionedparcelable.ParcelImpl;
import c.BinderC0199c;
import c.C0200d;
import c.InterfaceC0198b;
import c2.C0220b;
import c2.C0223e;
import c2.C0224f;
import g0.s;
import g0.t;
import java.util.ArrayList;
import k1.G;
import k1.H;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3615a;

    public /* synthetic */ g(int i4) {
        this.f3615a = i4;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [k1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k1.G] */
    /* JADX WARN: Type inference failed for: r0v12, types: [k1.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [c.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [c.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC0198b interfaceC0198b = null;
        L1.a aVar = null;
        Intent intent = null;
        int i4 = 0;
        switch (this.f3615a) {
            case 0:
                int a02 = AbstractC0110a.a0(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            z4 = AbstractC0110a.K(parcel, readInt);
                            break;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            z5 = AbstractC0110a.K(parcel, readInt);
                            break;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            z6 = AbstractC0110a.K(parcel, readInt);
                            break;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            z7 = AbstractC0110a.K(parcel, readInt);
                            break;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            z8 = AbstractC0110a.K(parcel, readInt);
                            break;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            z9 = AbstractC0110a.K(parcel, readInt);
                            break;
                        default:
                            AbstractC0110a.V(parcel, readInt);
                            break;
                    }
                }
                AbstractC0110a.u(parcel, a02);
                return new f(z4, z5, z6, z7, z8, z9);
            case 1:
                int a03 = AbstractC0110a.a0(parcel);
                int i5 = 1;
                int i6 = 1;
                long j4 = -1;
                long j5 = -1;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i5 = AbstractC0110a.N(parcel, readInt2);
                    } else if (c4 == 2) {
                        i6 = AbstractC0110a.N(parcel, readInt2);
                    } else if (c4 == 3) {
                        j4 = AbstractC0110a.O(parcel, readInt2);
                    } else if (c4 != 4) {
                        AbstractC0110a.V(parcel, readInt2);
                    } else {
                        j5 = AbstractC0110a.O(parcel, readInt2);
                    }
                }
                AbstractC0110a.u(parcel, a03);
                return new i(i5, i6, j4, j5);
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaBrowserCompat$MediaItem(parcel);
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return MediaDescriptionCompat.d(MediaDescription.CREATOR.createFromParcel(parcel));
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return new MediaMetadataCompat(parcel);
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? obj = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i7 = BinderC0199c.f4467d;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0198b.f4466b);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0198b)) {
                        ?? obj2 = new Object();
                        obj2.f4465c = readStrongBinder;
                        interfaceC0198b = obj2;
                    } else {
                        interfaceC0198b = (InterfaceC0198b) queryLocalInterface;
                    }
                }
                obj.f4469l = interfaceC0198b;
                return obj;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int a04 = AbstractC0110a.a0(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i4 = AbstractC0110a.N(parcel, readInt3);
                    } else if (c5 == 2) {
                        i8 = AbstractC0110a.N(parcel, readInt3);
                    } else if (c5 != 3) {
                        AbstractC0110a.V(parcel, readInt3);
                    } else {
                        intent = (Intent) AbstractC0110a.p(parcel, readInt3, Intent.CREATOR);
                    }
                }
                AbstractC0110a.u(parcel, a04);
                return new C0220b(i4, i8, intent);
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                int a05 = AbstractC0110a.a0(parcel);
                ArrayList<String> arrayList = null;
                String str = null;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        int P3 = AbstractC0110a.P(parcel, readInt4);
                        int dataPosition = parcel.dataPosition();
                        if (P3 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + P3);
                            arrayList = createStringArrayList;
                        }
                    } else if (c6 != 2) {
                        AbstractC0110a.V(parcel, readInt4);
                    } else {
                        str = AbstractC0110a.q(parcel, readInt4);
                    }
                }
                AbstractC0110a.u(parcel, a05);
                return new C0223e(str, arrayList);
            case 9:
                int a06 = AbstractC0110a.a0(parcel);
                int i9 = 0;
                O1.o oVar = null;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i9 = AbstractC0110a.N(parcel, readInt5);
                    } else if (c7 == 2) {
                        aVar = (L1.a) AbstractC0110a.p(parcel, readInt5, L1.a.CREATOR);
                    } else if (c7 != 3) {
                        AbstractC0110a.V(parcel, readInt5);
                    } else {
                        oVar = (O1.o) AbstractC0110a.p(parcel, readInt5, O1.o.CREATOR);
                    }
                }
                AbstractC0110a.u(parcel, a06);
                return new C0224f(i9, aVar, oVar);
            case 10:
                return new t(parcel);
            case 11:
                return new s(parcel);
            case 12:
                ?? obj3 = new Object();
                obj3.f7017l = parcel.readInt();
                obj3.f7018m = parcel.readInt();
                obj3.f7019n = parcel.readInt() == 1;
                return obj3;
            case 13:
                ?? obj4 = new Object();
                obj4.f6950l = parcel.readInt();
                obj4.f6951m = parcel.readInt();
                obj4.f6953o = parcel.readInt() == 1;
                int readInt6 = parcel.readInt();
                if (readInt6 > 0) {
                    int[] iArr = new int[readInt6];
                    obj4.f6952n = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 14:
                ?? obj5 = new Object();
                obj5.f6954l = parcel.readInt();
                obj5.f6955m = parcel.readInt();
                int readInt7 = parcel.readInt();
                obj5.f6956n = readInt7;
                if (readInt7 > 0) {
                    int[] iArr2 = new int[readInt7];
                    obj5.f6957o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt8 = parcel.readInt();
                obj5.f6958p = readInt8;
                if (readInt8 > 0) {
                    int[] iArr3 = new int[readInt8];
                    obj5.f6959q = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj5.s = parcel.readInt() == 1;
                obj5.f6961t = parcel.readInt() == 1;
                obj5.f6962u = parcel.readInt() == 1;
                obj5.f6960r = parcel.readArrayList(G.class.getClassLoader());
                return obj5;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f3615a) {
            case 0:
                return new f[i4];
            case 1:
                return new i[i4];
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaBrowserCompat$MediaItem[i4];
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new MediaDescriptionCompat[i4];
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return new MediaMetadataCompat[i4];
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return new RatingCompat[i4];
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0200d[i4];
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0220b[i4];
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return new C0223e[i4];
            case 9:
                return new C0224f[i4];
            case 10:
                return new t[i4];
            case 11:
                return new s[i4];
            case 12:
                return new k1.k[i4];
            case 13:
                return new G[i4];
            case 14:
                return new H[i4];
            default:
                return new ParcelImpl[i4];
        }
    }
}
