package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new s(4);

    /* renamed from: l, reason: collision with root package name */
    public final int f3683l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3684m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3685n;

    /* renamed from: o, reason: collision with root package name */
    public final float f3686o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3687p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3688q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f3689r;
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3690t;

    /* renamed from: u, reason: collision with root package name */
    public final long f3691u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f3692v;
    public PlaybackState w;

    public PlaybackStateCompat(int i4, long j4, long j5, float f4, long j6, int i5, CharSequence charSequence, long j7, ArrayList arrayList, long j8, Bundle bundle) {
        this.f3683l = i4;
        this.f3684m = j4;
        this.f3685n = j5;
        this.f3686o = f4;
        this.f3687p = j6;
        this.f3688q = i5;
        this.f3689r = charSequence;
        this.s = j7;
        this.f3690t = new ArrayList(arrayList);
        this.f3691u = j8;
        this.f3692v = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f3683l + ", position=" + this.f3684m + ", buffered position=" + this.f3685n + ", speed=" + this.f3686o + ", updated=" + this.s + ", actions=" + this.f3687p + ", error code=" + this.f3688q + ", error message=" + this.f3689r + ", custom actions=" + this.f3690t + ", active item id=" + this.f3691u + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3683l);
        parcel.writeLong(this.f3684m);
        parcel.writeFloat(this.f3686o);
        parcel.writeLong(this.s);
        parcel.writeLong(this.f3685n);
        parcel.writeLong(this.f3687p);
        TextUtils.writeToParcel(this.f3689r, parcel, i4);
        parcel.writeTypedList(this.f3690t);
        parcel.writeLong(this.f3691u);
        parcel.writeBundle(this.f3692v);
        parcel.writeInt(this.f3688q);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: l, reason: collision with root package name */
        public final String f3693l;

        /* renamed from: m, reason: collision with root package name */
        public final CharSequence f3694m;

        /* renamed from: n, reason: collision with root package name */
        public final int f3695n;

        /* renamed from: o, reason: collision with root package name */
        public final Bundle f3696o;

        /* renamed from: p, reason: collision with root package name */
        public PlaybackState.CustomAction f3697p;

        public CustomAction(String str, CharSequence charSequence, int i4, Bundle bundle) {
            this.f3693l = str;
            this.f3694m = charSequence;
            this.f3695n = i4;
            this.f3696o = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f3694m) + ", mIcon=" + this.f3695n + ", mExtras=" + this.f3696o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f3693l);
            TextUtils.writeToParcel(this.f3694m, parcel, i4);
            parcel.writeInt(this.f3695n);
            parcel.writeBundle(this.f3696o);
        }

        public CustomAction(Parcel parcel) {
            this.f3693l = parcel.readString();
            this.f3694m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3695n = parcel.readInt();
            this.f3696o = parcel.readBundle(t.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3683l = parcel.readInt();
        this.f3684m = parcel.readLong();
        this.f3686o = parcel.readFloat();
        this.s = parcel.readLong();
        this.f3685n = parcel.readLong();
        this.f3687p = parcel.readLong();
        this.f3689r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3690t = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3691u = parcel.readLong();
        this.f3692v = parcel.readBundle(t.class.getClassLoader());
        this.f3688q = parcel.readInt();
    }
}
