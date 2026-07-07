package androidx.core.graphics.drawable;

import C.AbstractC0018e;
import L.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3951k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f3952a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3953b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3954c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3955d;

    /* renamed from: e, reason: collision with root package name */
    public int f3956e;

    /* renamed from: f, reason: collision with root package name */
    public int f3957f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3958g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3959h;

    /* renamed from: i, reason: collision with root package name */
    public String f3960i;

    /* renamed from: j, reason: collision with root package name */
    public String f3961j;

    public IconCompat() {
        this.f3952a = -1;
        this.f3954c = null;
        this.f3955d = null;
        this.f3956e = 0;
        this.f3957f = 0;
        this.f3958g = null;
        this.f3959h = f3951k;
        this.f3960i = null;
    }

    public static IconCompat b(Resources resources, String str, int i4) {
        str.getClass();
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3956e = i4;
        if (resources != null) {
            try {
                iconCompat.f3953b = resources.getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3953b = str;
        }
        iconCompat.f3961j = str;
        return iconCompat;
    }

    public final int c() {
        int i4 = this.f3952a;
        if (i4 != -1) {
            if (i4 == 2) {
                return this.f3956e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f3953b;
        if (i5 >= 28) {
            return AbstractC0018e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    public final Uri d() {
        int i4 = this.f3952a;
        if (i4 != -1) {
            if (i4 == 4 || i4 == 6) {
                return Uri.parse((String) this.f3953b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f3953b;
        if (i5 >= 28) {
            return AbstractC0018e.k(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon e(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.e(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f3952a == -1) {
            return String.valueOf(this.f3953b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3952a) {
            case 1:
                str = "BITMAP";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f3952a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3953b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3953b).getHeight());
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f3961j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f3956e);
                if (this.f3957f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3957f);
                    break;
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f3953b);
                break;
        }
        if (this.f3958g != null) {
            sb.append(" tint=");
            sb.append(this.f3958g);
        }
        if (this.f3959h != f3951k) {
            sb.append(" mode=");
            sb.append(this.f3959h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i4) {
        this.f3954c = null;
        this.f3955d = null;
        this.f3956e = 0;
        this.f3957f = 0;
        this.f3958g = null;
        this.f3959h = f3951k;
        this.f3960i = null;
        this.f3952a = i4;
    }
}
