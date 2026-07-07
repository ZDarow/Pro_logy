package p057O0;

/* renamed from: O0.g */
/* loaded from: classes.dex */
public final class C0488g implements android.os.Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f1426a;

    public /* synthetic */ C0488g(int i4) {
        this.f1426a = i4;
    }

    /* renamed from: a */
    public static void m997a(p058O1.C0501e c0501e, android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        int i5 = c0501e.f1472l;
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(i5);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(c0501e.f1473m);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(c0501e.f1474n);
        p176p1.AbstractC1949a.m3917T(parcel, 4, c0501e.f1475o);
        p176p1.AbstractC1949a.m3915R(parcel, 5, c0501e.f1476p);
        p176p1.AbstractC1949a.m3918U(parcel, 6, c0501e.f1477q, i4);
        android.os.Bundle bundle = c0501e.f1478r;
        if (bundle != null) {
            int m3921X2 = p176p1.AbstractC1949a.m3921X(parcel, 7);
            parcel.writeBundle(bundle);
            p176p1.AbstractC1949a.m3922Y(parcel, m3921X2);
        }
        p176p1.AbstractC1949a.m3916S(parcel, 8, c0501e.f1479s, i4);
        p176p1.AbstractC1949a.m3918U(parcel, 10, c0501e.f1480t, i4);
        p176p1.AbstractC1949a.m3918U(parcel, 11, c0501e.f1481u, i4);
        p176p1.AbstractC1949a.m3925a0(parcel, 12, 4);
        parcel.writeInt(c0501e.f1482v ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 13, 4);
        parcel.writeInt(c0501e.f1483w);
        boolean z4 = c0501e.f1484x;
        p176p1.AbstractC1949a.m3925a0(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        p176p1.AbstractC1949a.m3917T(parcel, 15, c0501e.f1485y);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
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
        throw new UnsupportedOperationException("Method not decompiled: p057O0.C0488g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i4) {
        switch (this.f1426a) {
            case 0:
                return new p057O0.C0491j[i4];
            case 1:
                return new p057O0.C0492k[i4];
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p058O1.C0499c[i4];
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return new p058O1.C0506j[i4];
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new p058O1.C0503g[i4];
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return new p058O1.C0510n[i4];
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new p058O1.C0511o[i4];
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p058O1.C0505i[i4];
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return new p058O1.C0521y[i4];
            case 9:
                return new p058O1.C0500d[i4];
            case 10:
                return new p058O1.C0501e[i4];
            case 11:
                return new p061P0.C0526a[i4];
            case 12:
                return new p076T.C0699m[i4];
            case 13:
                return new p076T.C0698l[i4];
            case 14:
                return new p076T.C0664G[i4];
            case 15:
                return new p076T.C0673P[i4];
            case 16:
                return new p090X.C0824a[i4];
            case 17:
                return new p090X.C0825b[i4];
            case 18:
                return new p090X.C0826c[i4];
            case 19:
                return new p096Y1.C0900k[i4];
            case 20:
                return new p096Y1.C0901l[i4];
            case 21:
                return new p096Y1.C0902m[i4];
            case 22:
                return new p096Y1.C0899j[i4];
            case 23:
                return new p096Y1.C0909t[i4];
            case 24:
                return new p104a2.C1003a[i4];
            case 25:
                return new com.google.android.gms.location.LocationAvailability[i4];
            case 26:
                return new com.google.android.gms.location.LocationRequest[i4];
            case 27:
                return new com.google.android.gms.location.LocationResult[i4];
            case 28:
                return new p104a2.C1005c[i4];
            default:
                return new p104a2.C1007e[i4];
        }
    }
}
