package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    public static androidx.core.graphics.drawable.IconCompat read(p176p1.AbstractC1950b abstractC1950b) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.f4096a = abstractC1950b.m3954f(iconCompat.f4096a, 1);
        byte[] bArr = iconCompat.f4098c;
        if (abstractC1950b.mo3953e(2)) {
            android.os.Parcel parcel = ((p176p1.C1951c) abstractC1950b).f7940e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4098c = bArr;
        iconCompat.f4099d = abstractC1950b.m3955g(iconCompat.f4099d, 3);
        iconCompat.f4100e = abstractC1950b.m3954f(iconCompat.f4100e, 4);
        iconCompat.f4101f = abstractC1950b.m3954f(iconCompat.f4101f, 5);
        iconCompat.f4102g = (android.content.res.ColorStateList) abstractC1950b.m3955g(iconCompat.f4102g, 6);
        java.lang.String str = iconCompat.f4104i;
        if (abstractC1950b.mo3953e(7)) {
            str = ((p176p1.C1951c) abstractC1950b).f7940e.readString();
        }
        iconCompat.f4104i = str;
        java.lang.String str2 = iconCompat.f4105j;
        if (abstractC1950b.mo3953e(8)) {
            str2 = ((p176p1.C1951c) abstractC1950b).f7940e.readString();
        }
        iconCompat.f4105j = str2;
        iconCompat.f4103h = android.graphics.PorterDuff.Mode.valueOf(iconCompat.f4104i);
        switch (iconCompat.f4096a) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.f4099d;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4097b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                android.os.Parcelable parcelable2 = iconCompat.f4099d;
                if (parcelable2 != null) {
                    iconCompat.f4097b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f4098c;
                    iconCompat.f4097b = bArr3;
                    iconCompat.f4096a = 3;
                    iconCompat.f4100e = 0;
                    iconCompat.f4101f = bArr3.length;
                }
                return iconCompat;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String str3 = new java.lang.String(iconCompat.f4098c, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.f4097b = str3;
                if (iconCompat.f4096a == 2 && iconCompat.f4105j == null) {
                    iconCompat.f4105j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4097b = iconCompat.f4098c;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, p176p1.AbstractC1950b abstractC1950b) {
        abstractC1950b.getClass();
        iconCompat.f4104i = iconCompat.f4103h.name();
        switch (iconCompat.f4096a) {
            case -1:
                iconCompat.f4099d = (android.os.Parcelable) iconCompat.f4097b;
                break;
            case 1:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f4099d = (android.os.Parcelable) iconCompat.f4097b;
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f4098c = ((java.lang.String) iconCompat.f4097b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4098c = (byte[]) iconCompat.f4097b;
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f4098c = iconCompat.f4097b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f4096a;
        if (-1 != i4) {
            abstractC1950b.m3958j(i4, 1);
        }
        byte[] bArr = iconCompat.f4098c;
        if (bArr != null) {
            abstractC1950b.mo3957i(2);
            int length = bArr.length;
            android.os.Parcel parcel = ((p176p1.C1951c) abstractC1950b).f7940e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.f4099d;
        if (parcelable != null) {
            abstractC1950b.m3959k(parcelable, 3);
        }
        int i5 = iconCompat.f4100e;
        if (i5 != 0) {
            abstractC1950b.m3958j(i5, 4);
        }
        int i6 = iconCompat.f4101f;
        if (i6 != 0) {
            abstractC1950b.m3958j(i6, 5);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.f4102g;
        if (colorStateList != null) {
            abstractC1950b.m3959k(colorStateList, 6);
        }
        java.lang.String str = iconCompat.f4104i;
        if (str != null) {
            abstractC1950b.mo3957i(7);
            ((p176p1.C1951c) abstractC1950b).f7940e.writeString(str);
        }
        java.lang.String str2 = iconCompat.f4105j;
        if (str2 != null) {
            abstractC1950b.mo3957i(8);
            ((p176p1.C1951c) abstractC1950b).f7940e.writeString(str2);
        }
    }
}
