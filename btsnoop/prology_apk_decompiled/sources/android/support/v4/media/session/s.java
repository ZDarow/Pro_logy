package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3730a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3730a) {
            case 0:
                ?? obj = new Object();
                obj.f3673l = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                ?? obj2 = new Object();
                obj2.f3678l = parcel.readInt();
                obj2.f3680n = parcel.readInt();
                obj2.f3681o = parcel.readInt();
                obj2.f3682p = parcel.readInt();
                obj2.f3679m = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f3730a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i4];
            case 1:
                return new MediaSessionCompat$QueueItem[i4];
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaSessionCompat$Token[i4];
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new ParcelableVolumeInfo[i4];
            default:
                return new PlaybackStateCompat[i4];
        }
    }
}
