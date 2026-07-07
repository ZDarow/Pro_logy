package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR = new android.support.v4.media.session.C1060s(4);

    /* renamed from: l */
    public final int f3808l;

    /* renamed from: m */
    public final long f3809m;

    /* renamed from: n */
    public final long f3810n;

    /* renamed from: o */
    public final float f3811o;

    /* renamed from: p */
    public final long f3812p;

    /* renamed from: q */
    public final int f3813q;

    /* renamed from: r */
    public final java.lang.CharSequence f3814r;

    /* renamed from: s */
    public final long f3815s;

    /* renamed from: t */
    public final java.util.ArrayList f3816t;

    /* renamed from: u */
    public final long f3817u;

    /* renamed from: v */
    public final android.os.Bundle f3818v;

    /* renamed from: w */
    public android.media.session.PlaybackState f3819w;

    public PlaybackStateCompat(int i4, long j4, long j5, float f4, long j6, int i5, java.lang.CharSequence charSequence, long j7, java.util.ArrayList arrayList, long j8, android.os.Bundle bundle) {
        this.f3808l = i4;
        this.f3809m = j4;
        this.f3810n = j5;
        this.f3811o = f4;
        this.f3812p = j6;
        this.f3813q = i5;
        this.f3814r = charSequence;
        this.f3815s = j7;
        this.f3816t = new java.util.ArrayList(arrayList);
        this.f3817u = j8;
        this.f3818v = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "PlaybackState {state=" + this.f3808l + ", position=" + this.f3809m + ", buffered position=" + this.f3810n + ", speed=" + this.f3811o + ", updated=" + this.f3815s + ", actions=" + this.f3812p + ", error code=" + this.f3813q + ", error message=" + this.f3814r + ", custom actions=" + this.f3816t + ", active item id=" + this.f3817u + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f3808l);
        parcel.writeLong(this.f3809m);
        parcel.writeFloat(this.f3811o);
        parcel.writeLong(this.f3815s);
        parcel.writeLong(this.f3810n);
        parcel.writeLong(this.f3812p);
        android.text.TextUtils.writeToParcel(this.f3814r, parcel, i4);
        parcel.writeTypedList(this.f3816t);
        parcel.writeLong(this.f3817u);
        parcel.writeBundle(this.f3818v);
        parcel.writeInt(this.f3813q);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> CREATOR = new java.lang.Object();

        /* renamed from: l */
        public final java.lang.String f3820l;

        /* renamed from: m */
        public final java.lang.CharSequence f3821m;

        /* renamed from: n */
        public final int f3822n;

        /* renamed from: o */
        public final android.os.Bundle f3823o;

        /* renamed from: p */
        public android.media.session.PlaybackState.CustomAction f3824p;

        public CustomAction(java.lang.String str, java.lang.CharSequence charSequence, int i4, android.os.Bundle bundle) {
            this.f3820l = str;
            this.f3821m = charSequence;
            this.f3822n = i4;
            this.f3823o = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            return "Action:mName='" + ((java.lang.Object) this.f3821m) + ", mIcon=" + this.f3822n + ", mExtras=" + this.f3823o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i4) {
            parcel.writeString(this.f3820l);
            android.text.TextUtils.writeToParcel(this.f3821m, parcel, i4);
            parcel.writeInt(this.f3822n);
            parcel.writeBundle(this.f3823o);
        }

        public CustomAction(android.os.Parcel parcel) {
            this.f3820l = parcel.readString();
            this.f3821m = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3822n = parcel.readInt();
            this.f3823o = parcel.readBundle(android.support.v4.media.session.C1061t.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(android.os.Parcel parcel) {
        this.f3808l = parcel.readInt();
        this.f3809m = parcel.readLong();
        this.f3811o = parcel.readFloat();
        this.f3815s = parcel.readLong();
        this.f3810n = parcel.readLong();
        this.f3812p = parcel.readLong();
        this.f3814r = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3816t = parcel.createTypedArrayList(android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR);
        this.f3817u = parcel.readLong();
        this.f3818v = parcel.readBundle(android.support.v4.media.session.C1061t.class.getClassLoader());
        this.f3813q = parcel.readInt();
    }
}
