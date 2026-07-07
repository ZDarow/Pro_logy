package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* renamed from: k */
    public static final android.graphics.PorterDuff.Mode f4095k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f4096a;

    /* renamed from: b */
    public java.lang.Object f4097b;

    /* renamed from: c */
    public byte[] f4098c;

    /* renamed from: d */
    public android.os.Parcelable f4099d;

    /* renamed from: e */
    public int f4100e;

    /* renamed from: f */
    public int f4101f;

    /* renamed from: g */
    public android.content.res.ColorStateList f4102g;

    /* renamed from: h */
    public android.graphics.PorterDuff.Mode f4103h;

    /* renamed from: i */
    public java.lang.String f4104i;

    /* renamed from: j */
    public java.lang.String f4105j;

    public IconCompat() {
        this.f4096a = -1;
        this.f4098c = null;
        this.f4099d = null;
        this.f4100e = 0;
        this.f4101f = 0;
        this.f4102g = null;
        this.f4103h = f4095k;
        this.f4104i = null;
    }

    /* renamed from: b */
    public static androidx.core.graphics.drawable.IconCompat m2331b(android.content.res.Resources resources, java.lang.String str, int i4) {
        str.getClass();
        if (i4 == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.f4100e = i4;
        if (resources != null) {
            try {
                iconCompat.f4097b = resources.getResourceName(i4);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4097b = str;
        }
        iconCompat.f4105j = str;
        return iconCompat;
    }

    /* renamed from: c */
    public final int m2332c() {
        int i4 = this.f4096a;
        if (i4 != -1) {
            if (i4 == 2) {
                return this.f4100e;
            }
            throw new java.lang.IllegalStateException("called getResId() on " + this);
        }
        int i5 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj = this.f4097b;
        if (i5 >= 28) {
            return p011C.AbstractC0113e.m406c(obj);
        }
        try {
            return ((java.lang.Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (java.lang.IllegalAccessException e4) {
            android.util.Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (java.lang.NoSuchMethodException e5) {
            android.util.Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (java.lang.reflect.InvocationTargetException e6) {
            android.util.Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    /* renamed from: d */
    public final android.net.Uri m2333d() {
        int i4 = this.f4096a;
        if (i4 != -1) {
            if (i4 == 4 || i4 == 6) {
                return android.net.Uri.parse((java.lang.String) this.f4097b);
            }
            throw new java.lang.IllegalStateException("called getUri() on " + this);
        }
        int i5 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj = this.f4097b;
        if (i5 >= 28) {
            return p011C.AbstractC0113e.m414k(obj);
        }
        try {
            return (android.net.Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (java.lang.IllegalAccessException e4) {
            android.util.Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (java.lang.NoSuchMethodException e5) {
            android.util.Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e6) {
            android.util.Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon m2334e(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.m2334e(android.content.Context):android.graphics.drawable.Icon");
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (this.f4096a == -1) {
            return java.lang.String.valueOf(this.f4097b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.f4096a) {
            case 1:
                str = "BITMAP";
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f4096a) {
            case 1:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.f4097b).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.f4097b).getHeight());
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f4105j);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(m2332c())));
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f4100e);
                if (this.f4101f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4101f);
                    break;
                }
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f4097b);
                break;
        }
        if (this.f4102g != null) {
            sb.append(" tint=");
            sb.append(this.f4102g);
        }
        if (this.f4103h != f4095k) {
            sb.append(" mode=");
            sb.append(this.f4103h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i4) {
        this.f4098c = null;
        this.f4099d = null;
        this.f4100e = 0;
        this.f4101f = 0;
        this.f4102g = null;
        this.f4103h = f4095k;
        this.f4104i = null;
        this.f4096a = i4;
    }
}
