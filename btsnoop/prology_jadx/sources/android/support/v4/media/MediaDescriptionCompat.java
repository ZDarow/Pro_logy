package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = new p104a2.C1009g(3);

    /* renamed from: l */
    public final java.lang.String f3760l;

    /* renamed from: m */
    public final java.lang.CharSequence f3761m;

    /* renamed from: n */
    public final java.lang.CharSequence f3762n;

    /* renamed from: o */
    public final java.lang.CharSequence f3763o;

    /* renamed from: p */
    public final android.graphics.Bitmap f3764p;

    /* renamed from: q */
    public final android.net.Uri f3765q;

    /* renamed from: r */
    public final android.os.Bundle f3766r;

    /* renamed from: s */
    public final android.net.Uri f3767s;

    /* renamed from: t */
    public android.media.MediaDescription f3768t;

    public MediaDescriptionCompat(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.f3760l = str;
        this.f3761m = charSequence;
        this.f3762n = charSequence2;
        this.f3763o = charSequence3;
        this.f3764p = bitmap;
        this.f3765q = uri;
        this.f3766r = bundle;
        this.f3767s = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat m2060d(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L5d
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = android.support.v4.media.AbstractC1038f.m2075g(r13)
            java.lang.CharSequence r3 = android.support.v4.media.AbstractC1038f.m2077i(r13)
            java.lang.CharSequence r4 = android.support.v4.media.AbstractC1038f.m2076h(r13)
            java.lang.CharSequence r5 = android.support.v4.media.AbstractC1038f.m2071c(r13)
            android.graphics.Bitmap r6 = android.support.v4.media.AbstractC1038f.m2073e(r13)
            android.net.Uri r7 = android.support.v4.media.AbstractC1038f.m2074f(r13)
            android.os.Bundle r1 = android.support.v4.media.AbstractC1038f.m2072d(r13)
            if (r1 == 0) goto L27
            android.os.Bundle r1 = android.support.v4.media.session.C1061t.m2198E0(r1)
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
            android.net.Uri r0 = android.support.v4.media.AbstractC1039g.m2085a(r13)
            r9 = r0
        L55:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f3768t = r13
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m2060d(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final android.media.MediaDescription m2061e() {
        android.media.MediaDescription mediaDescription = this.f3768t;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        android.media.MediaDescription.Builder m2070b = android.support.v4.media.AbstractC1038f.m2070b();
        android.support.v4.media.AbstractC1038f.m2082n(m2070b, this.f3760l);
        android.support.v4.media.AbstractC1038f.m2084p(m2070b, this.f3761m);
        android.support.v4.media.AbstractC1038f.m2083o(m2070b, this.f3762n);
        android.support.v4.media.AbstractC1038f.m2078j(m2070b, this.f3763o);
        android.support.v4.media.AbstractC1038f.m2080l(m2070b, this.f3764p);
        android.support.v4.media.AbstractC1038f.m2081m(m2070b, this.f3765q);
        android.support.v4.media.AbstractC1038f.m2079k(m2070b, this.f3766r);
        android.support.v4.media.AbstractC1039g.m2086b(m2070b, this.f3767s);
        android.media.MediaDescription m2069a = android.support.v4.media.AbstractC1038f.m2069a(m2070b);
        this.f3768t = m2069a;
        return m2069a;
    }

    public final java.lang.String toString() {
        return ((java.lang.Object) this.f3761m) + ", " + ((java.lang.Object) this.f3762n) + ", " + ((java.lang.Object) this.f3763o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        m2061e().writeToParcel(parcel, i4);
    }
}
