package O0;

import O1.C0063c;
import O1.C0064d;
import O1.n;
import O1.o;
import O1.y;
import T.C0091l;
import T.C0092m;
import T.G;
import T.P;
import Y1.l;
import Y1.m;
import Y1.t;
import a2.C0147a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    public /* synthetic */ g(int i4) {
        this.f1378a = i4;
    }

    public static void a(O1.e eVar, Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        int i5 = eVar.f1424l;
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(i5);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(eVar.f1425m);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(eVar.f1426n);
        AbstractC0462a.T(parcel, 4, eVar.f1427o);
        AbstractC0462a.R(parcel, 5, eVar.f1428p);
        AbstractC0462a.U(parcel, 6, eVar.f1429q, i4);
        Bundle bundle = eVar.f1430r;
        if (bundle != null) {
            int X4 = AbstractC0462a.X(parcel, 7);
            parcel.writeBundle(bundle);
            AbstractC0462a.Y(parcel, X4);
        }
        AbstractC0462a.S(parcel, 8, eVar.s, i4);
        AbstractC0462a.U(parcel, 10, eVar.f1431t, i4);
        AbstractC0462a.U(parcel, 11, eVar.f1432u, i4);
        AbstractC0462a.a0(parcel, 12, 4);
        parcel.writeInt(eVar.f1433v ? 1 : 0);
        AbstractC0462a.a0(parcel, 13, 4);
        parcel.writeInt(eVar.w);
        boolean z4 = eVar.f1434x;
        AbstractC0462a.a0(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0462a.T(parcel, 15, eVar.f1435y);
        AbstractC0462a.Y(parcel, X3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 670
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r42) {
        /*
            Method dump skipped, instructions count: 2042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f1378a) {
            case 0:
                return new j[i4];
            case 1:
                return new k[i4];
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0063c[i4];
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new O1.j[i4];
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return new O1.g[i4];
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return new n[i4];
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new o[i4];
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new O1.i[i4];
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return new y[i4];
            case 9:
                return new C0064d[i4];
            case 10:
                return new O1.e[i4];
            case 11:
                return new P0.a[i4];
            case 12:
                return new C0092m[i4];
            case 13:
                return new C0091l[i4];
            case 14:
                return new G[i4];
            case 15:
                return new P[i4];
            case 16:
                return new X.a[i4];
            case 17:
                return new X.b[i4];
            case 18:
                return new X.c[i4];
            case 19:
                return new Y1.k[i4];
            case 20:
                return new l[i4];
            case 21:
                return new m[i4];
            case 22:
                return new Y1.j[i4];
            case 23:
                return new t[i4];
            case 24:
                return new C0147a[i4];
            case 25:
                return new LocationAvailability[i4];
            case 26:
                return new LocationRequest[i4];
            case 27:
                return new LocationResult[i4];
            case 28:
                return new a2.c[i4];
            default:
                return new a2.e[i4];
        }
    }
}
