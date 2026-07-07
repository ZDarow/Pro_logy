package F;

import M0.l;
import M0.m;
import M0.n;
import M0.o;
import a.AbstractC0110a;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import f2.I;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f564a;

    public /* synthetic */ i(int i4) {
        this.f564a = i4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$BaseSavedState, F.j, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f564a) {
            case 0:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f565l = parcel.readInt();
                return baseSavedState;
            case 1:
                String readString = parcel.readString();
                readString.getClass();
                return new I0.a(readString, parcel.readInt());
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new J0.a(parcel);
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                int a02 = AbstractC0110a.a0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j4 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i4 = AbstractC0110a.N(parcel, readInt);
                            break;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            str = AbstractC0110a.q(parcel, readInt);
                            break;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str2 = AbstractC0110a.q(parcel, readInt);
                            break;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            str3 = AbstractC0110a.q(parcel, readInt);
                            break;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            str4 = AbstractC0110a.q(parcel, readInt);
                            break;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) AbstractC0110a.p(parcel, readInt, Uri.CREATOR);
                            break;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str5 = AbstractC0110a.q(parcel, readInt);
                            break;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            j4 = AbstractC0110a.O(parcel, readInt);
                            break;
                        case '\t':
                            str6 = AbstractC0110a.q(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = AbstractC0110a.s(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = AbstractC0110a.q(parcel, readInt);
                            break;
                        case '\f':
                            str8 = AbstractC0110a.q(parcel, readInt);
                            break;
                        default:
                            AbstractC0110a.V(parcel, readInt);
                            break;
                    }
                }
                AbstractC0110a.u(parcel, a02);
                return new GoogleSignInAccount(i4, str, str2, str3, str4, uri, str5, j4, str6, arrayList, str7, str8);
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return new K0.a(parcel);
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return new K0.b(parcel);
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new L0.b(parcel);
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new L0.c(parcel);
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                int a03 = AbstractC0110a.a0(parcel);
                PendingIntent pendingIntent = null;
                int i5 = 0;
                int i6 = 0;
                String str9 = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i5 = AbstractC0110a.N(parcel, readInt2);
                    } else if (c4 == 2) {
                        i6 = AbstractC0110a.N(parcel, readInt2);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0110a.p(parcel, readInt2, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        AbstractC0110a.V(parcel, readInt2);
                    } else {
                        str9 = AbstractC0110a.q(parcel, readInt2);
                    }
                }
                AbstractC0110a.u(parcel, a03);
                return new L1.a(i5, i6, pendingIntent, str9);
            case 9:
                int a04 = AbstractC0110a.a0(parcel);
                long j5 = -1;
                int i7 = 0;
                String str10 = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        str10 = AbstractC0110a.q(parcel, readInt3);
                    } else if (c5 == 2) {
                        i7 = AbstractC0110a.N(parcel, readInt3);
                    } else if (c5 != 3) {
                        AbstractC0110a.V(parcel, readInt3);
                    } else {
                        j5 = AbstractC0110a.O(parcel, readInt3);
                    }
                }
                AbstractC0110a.u(parcel, a04);
                return new L1.c(j5, str10, i7);
            case 10:
                return new M0.a(parcel);
            case 11:
                return new M0.b(parcel);
            case 12:
                return new M0.c(parcel);
            case 13:
                return new M0.d(parcel);
            case 14:
                return new M0.e(parcel);
            case 15:
                return new M0.f(parcel);
            case 16:
                return new M0.k(parcel);
            case 17:
                return new l(parcel);
            case 18:
                return new m(parcel);
            case 19:
                String readString2 = parcel.readString();
                readString2.getClass();
                String readString3 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString2, readString3, I.k(createStringArray));
            case 20:
                return new o(parcel);
            case 21:
                int a05 = AbstractC0110a.a0(parcel);
                String str11 = null;
                int i8 = 0;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        i8 = AbstractC0110a.N(parcel, readInt4);
                    } else if (c6 != 2) {
                        AbstractC0110a.V(parcel, readInt4);
                    } else {
                        str11 = AbstractC0110a.q(parcel, readInt4);
                    }
                }
                AbstractC0110a.u(parcel, a05);
                return new Scope(str11, i8);
            case 22:
                int a06 = AbstractC0110a.a0(parcel);
                String str12 = null;
                L1.a aVar = null;
                int i9 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i9 = AbstractC0110a.N(parcel, readInt5);
                    } else if (c7 == 2) {
                        str12 = AbstractC0110a.q(parcel, readInt5);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0110a.p(parcel, readInt5, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        AbstractC0110a.V(parcel, readInt5);
                    } else {
                        aVar = (L1.a) AbstractC0110a.p(parcel, readInt5, L1.a.CREATOR);
                    }
                }
                AbstractC0110a.u(parcel, a06);
                return new Status(i9, str12, pendingIntent2, aVar);
            case 23:
                return new N0.a(parcel);
            case 24:
                ArrayList arrayList2 = new ArrayList();
                parcel.readList(arrayList2, N0.b.class.getClassLoader());
                return new N0.c(arrayList2);
            case 25:
                return new N0.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 26:
                return new N0.d(parcel);
            case 27:
                return new O0.a(parcel);
            case 28:
                return new O0.e(parcel);
            default:
                return new Object();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f564a) {
            case 0:
                return new j[i4];
            case 1:
                return new I0.a[i4];
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new J0.a[i4];
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new GoogleSignInAccount[i4];
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return new K0.a[i4];
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return new K0.b[i4];
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new L0.b[i4];
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new L0.c[i4];
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return new L1.a[i4];
            case 9:
                return new L1.c[i4];
            case 10:
                return new M0.a[i4];
            case 11:
                return new M0.b[i4];
            case 12:
                return new M0.c[i4];
            case 13:
                return new M0.d[i4];
            case 14:
                return new M0.e[i4];
            case 15:
                return new M0.f[i4];
            case 16:
                return new M0.k[i4];
            case 17:
                return new l[i4];
            case 18:
                return new m[i4];
            case 19:
                return new n[i4];
            case 20:
                return new o[i4];
            case 21:
                return new Scope[i4];
            case 22:
                return new Status[i4];
            case 23:
                return new N0.a[i4];
            case 24:
                return new N0.c[i4];
            case 25:
                return new N0.b[i4];
            case 26:
                return new N0.d[i4];
            case 27:
                return new O0.a[i4];
            case 28:
                return new O0.e[i4];
            default:
                return new O0.f[i4];
        }
    }
}
