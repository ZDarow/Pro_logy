package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a2.g(3);

    /* renamed from: l, reason: collision with root package name */
    public final String f3636l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f3637m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f3638n;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f3639o;

    /* renamed from: p, reason: collision with root package name */
    public final Bitmap f3640p;

    /* renamed from: q, reason: collision with root package name */
    public final Uri f3641q;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f3642r;
    public final Uri s;

    /* renamed from: t, reason: collision with root package name */
    public MediaDescription f3643t;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3636l = str;
        this.f3637m = charSequence;
        this.f3638n = charSequence2;
        this.f3639o = charSequence3;
        this.f3640p = bitmap;
        this.f3641q = uri;
        this.f3642r = bundle;
        this.s = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat d(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L5d
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = android.support.v4.media.f.g(r13)
            java.lang.CharSequence r3 = android.support.v4.media.f.i(r13)
            java.lang.CharSequence r4 = android.support.v4.media.f.h(r13)
            java.lang.CharSequence r5 = android.support.v4.media.f.c(r13)
            android.graphics.Bitmap r6 = android.support.v4.media.f.e(r13)
            android.net.Uri r7 = android.support.v4.media.f.f(r13)
            android.os.Bundle r1 = android.support.v4.media.f.d(r13)
            if (r1 == 0) goto L27
            android.os.Bundle r1 = android.support.v4.media.session.t.E0(r1)
        L27:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L32
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 == 0) goto L4c
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L46
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L46
            r8 = r0
            goto L4d
        L46:
            r1.remove(r8)
            r1.remove(r10)
        L4c:
            r8 = r1
        L4d:
            if (r9 == 0) goto L50
            goto L55
        L50:
            android.net.Uri r0 = android.support.v4.media.g.a(r13)
            r9 = r0
        L55:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f3643t = r13
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.d(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MediaDescription e() {
        MediaDescription mediaDescription = this.f3643t;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b4 = f.b();
        f.n(b4, this.f3636l);
        f.p(b4, this.f3637m);
        f.o(b4, this.f3638n);
        f.j(b4, this.f3639o);
        f.l(b4, this.f3640p);
        f.m(b4, this.f3641q);
        f.k(b4, this.f3642r);
        g.b(b4, this.s);
        MediaDescription a4 = f.a(b4);
        this.f3643t = a4;
        return a4;
    }

    public final String toString() {
        return ((Object) this.f3637m) + ", " + ((Object) this.f3638n) + ", " + ((Object) this.f3639o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        e().writeToParcel(parcel, i4);
    }
}
