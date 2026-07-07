package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaMetadataCompat> CREATOR;

    /* renamed from: o */
    public static final p165n.C1878e f3769o;

    /* renamed from: p */
    public static final java.lang.String[] f3770p;

    /* renamed from: q */
    public static final java.lang.String[] f3771q;

    /* renamed from: r */
    public static final java.lang.String[] f3772r;

    /* renamed from: l */
    public final android.os.Bundle f3773l;

    /* renamed from: m */
    public android.media.MediaMetadata f3774m;

    /* renamed from: n */
    public android.support.v4.media.MediaDescriptionCompat f3775n;

    /* JADX WARN: Type inference failed for: r0v0, types: [n.e, n.j] */
    static {
        ?? c1883j = new p165n.C1883j(0);
        f3769o = c1883j;
        c1883j.put("android.media.metadata.TITLE", 1);
        c1883j.put("android.media.metadata.ARTIST", 1);
        c1883j.put("android.media.metadata.DURATION", 0);
        c1883j.put("android.media.metadata.ALBUM", 1);
        c1883j.put("android.media.metadata.AUTHOR", 1);
        c1883j.put("android.media.metadata.WRITER", 1);
        c1883j.put("android.media.metadata.COMPOSER", 1);
        c1883j.put("android.media.metadata.COMPILATION", 1);
        c1883j.put("android.media.metadata.DATE", 1);
        c1883j.put("android.media.metadata.YEAR", 0);
        c1883j.put("android.media.metadata.GENRE", 1);
        c1883j.put("android.media.metadata.TRACK_NUMBER", 0);
        c1883j.put("android.media.metadata.NUM_TRACKS", 0);
        c1883j.put("android.media.metadata.DISC_NUMBER", 0);
        c1883j.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1883j.put("android.media.metadata.ART", 2);
        c1883j.put("android.media.metadata.ART_URI", 1);
        c1883j.put("android.media.metadata.ALBUM_ART", 2);
        c1883j.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1883j.put("android.media.metadata.USER_RATING", 3);
        c1883j.put("android.media.metadata.RATING", 3);
        c1883j.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1883j.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1883j.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1883j.put("android.media.metadata.DISPLAY_ICON", 2);
        c1883j.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1883j.put("android.media.metadata.MEDIA_ID", 1);
        c1883j.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1883j.put("android.media.metadata.MEDIA_URI", 1);
        c1883j.put("android.media.metadata.ADVERTISEMENT", 0);
        c1883j.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f3770p = new java.lang.String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f3771q = new java.lang.String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f3772r = new java.lang.String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new p104a2.C1009g(4);
    }

    public MediaMetadataCompat(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        this.f3773l = bundle2;
        android.support.v4.media.session.C1061t.m2199b0(bundle2);
    }

    /* renamed from: d */
    public final android.support.v4.media.MediaDescriptionCompat m2062d() {
        android.graphics.Bitmap bitmap;
        android.net.Uri uri;
        android.graphics.Bitmap bitmap2;
        android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat = this.f3775n;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        java.lang.String m2063e = m2063e("android.media.metadata.MEDIA_ID");
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
        android.os.Bundle bundle = this.f3773l;
        java.lang.CharSequence charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (android.text.TextUtils.isEmpty(charSequence)) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < 3) {
                java.lang.String[] strArr = f3770p;
                if (i5 >= strArr.length) {
                    break;
                }
                int i6 = i5 + 1;
                java.lang.CharSequence charSequence2 = bundle.getCharSequence(strArr[i5]);
                if (!android.text.TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i4] = charSequence2;
                    i4++;
                }
                i5 = i6;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i7 = 0;
        while (true) {
            java.lang.String[] strArr2 = f3771q;
            if (i7 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap2 = (android.graphics.Bitmap) bundle.getParcelable(strArr2[i7]);
            } catch (java.lang.Exception e4) {
                android.util.Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e4);
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
                break;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            java.lang.String[] strArr3 = f3772r;
            if (i8 >= strArr3.length) {
                uri = null;
                break;
            }
            java.lang.String m2063e2 = m2063e(strArr3[i8]);
            if (!android.text.TextUtils.isEmpty(m2063e2)) {
                uri = android.net.Uri.parse(m2063e2);
                break;
            }
            i8++;
        }
        java.lang.String m2063e3 = m2063e("android.media.metadata.MEDIA_URI");
        android.net.Uri parse = !android.text.TextUtils.isEmpty(m2063e3) ? android.net.Uri.parse(m2063e3) : null;
        java.lang.CharSequence charSequence3 = charSequenceArr[0];
        java.lang.CharSequence charSequence4 = charSequenceArr[1];
        java.lang.CharSequence charSequence5 = charSequenceArr[2];
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat2 = new android.support.v4.media.MediaDescriptionCompat(m2063e, charSequence3, charSequence4, charSequence5, bitmap, uri, !bundle2.isEmpty() ? bundle2 : null, parse);
        this.f3775n = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final java.lang.String m2063e(java.lang.String str) {
        java.lang.CharSequence charSequence = this.f3773l.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeBundle(this.f3773l);
    }

    public MediaMetadataCompat(android.os.Parcel parcel) {
        this.f3773l = parcel.readBundle(android.support.v4.media.session.C1061t.class.getClassLoader());
    }
}
