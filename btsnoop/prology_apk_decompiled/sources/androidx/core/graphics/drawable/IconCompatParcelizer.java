package androidx.core.graphics.drawable;

import L.k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p1.b;
import p1.c;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0088. Please report as an issue. */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3952a = bVar.f(iconCompat.f3952a, 1);
        byte[] bArr = iconCompat.f3954c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f7649e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3954c = bArr;
        iconCompat.f3955d = bVar.g(iconCompat.f3955d, 3);
        iconCompat.f3956e = bVar.f(iconCompat.f3956e, 4);
        iconCompat.f3957f = bVar.f(iconCompat.f3957f, 5);
        iconCompat.f3958g = (ColorStateList) bVar.g(iconCompat.f3958g, 6);
        String str = iconCompat.f3960i;
        if (bVar.e(7)) {
            str = ((c) bVar).f7649e.readString();
        }
        iconCompat.f3960i = str;
        String str2 = iconCompat.f3961j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f7649e.readString();
        }
        iconCompat.f3961j = str2;
        iconCompat.f3959h = PorterDuff.Mode.valueOf(iconCompat.f3960i);
        switch (iconCompat.f3952a) {
            case -1:
                Parcelable parcelable = iconCompat.f3955d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3953b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f3955d;
                if (parcelable2 != null) {
                    iconCompat.f3953b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f3954c;
                    iconCompat.f3953b = bArr3;
                    iconCompat.f3952a = 3;
                    iconCompat.f3956e = 0;
                    iconCompat.f3957f = bArr3.length;
                }
                return iconCompat;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f3954c, Charset.forName("UTF-16"));
                iconCompat.f3953b = str3;
                if (iconCompat.f3952a == 2 && iconCompat.f3961j == null) {
                    iconCompat.f3961j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f3953b = iconCompat.f3954c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f3960i = iconCompat.f3959h.name();
        switch (iconCompat.f3952a) {
            case -1:
                iconCompat.f3955d = (Parcelable) iconCompat.f3953b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f3955d = (Parcelable) iconCompat.f3953b;
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f3954c = ((String) iconCompat.f3953b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f3954c = (byte[]) iconCompat.f3953b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f3954c = iconCompat.f3953b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f3952a;
        if (-1 != i4) {
            bVar.j(i4, 1);
        }
        byte[] bArr = iconCompat.f3954c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f7649e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3955d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i5 = iconCompat.f3956e;
        if (i5 != 0) {
            bVar.j(i5, 4);
        }
        int i6 = iconCompat.f3957f;
        if (i6 != 0) {
            bVar.j(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f3958g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f3960i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f7649e.writeString(str);
        }
        String str2 = iconCompat.f3961j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f7649e.writeString(str2);
        }
    }
}
