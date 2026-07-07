package android.support.v4.media.session;

import a.AbstractC0110a;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import s2.C0548e;

/* loaded from: classes.dex */
public final class g extends Binder implements b {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f3703c;

    public g(C0548e c0548e) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f3703c = new WeakReference(c0548e);
    }

    @Override // android.support.v4.media.session.b
    public final void R(boolean z4) {
        C0548e c0548e = (C0548e) this.f3703c.get();
        if (c0548e != null) {
            c0548e.a(11, Boolean.valueOf(z4), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void Y(int i4) {
        C0548e c0548e = (C0548e) this.f3703c.get();
        if (c0548e != null) {
            c0548e.a(12, Integer.valueOf(i4), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void Z(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void a0(PlaybackStateCompat playbackStateCompat) {
        C0548e c0548e = (C0548e) this.f3703c.get();
        if (c0548e != null) {
            c0548e.a(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.b
    public final void b(int i4) {
        C0548e c0548e = (C0548e) this.f3703c.get();
        if (c0548e != null) {
            c0548e.a(9, Integer.valueOf(i4), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void d(List list) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void g(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void j0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i4 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f3703c;
        switch (i4) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0110a.a(parcel, Bundle.CREATOR);
                C0548e c0548e = (C0548e) weakReference.get();
                if (c0548e != null) {
                    c0548e.a(1, readString, bundle);
                }
                return true;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                p();
                return true;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                a0((PlaybackStateCompat) AbstractC0110a.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                t((MediaMetadataCompat) AbstractC0110a.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                d(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                g((CharSequence) AbstractC0110a.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Z((Bundle) AbstractC0110a.a(parcel, Bundle.CREATOR));
                return true;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                j0((ParcelableVolumeInfo) AbstractC0110a.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                b(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                R(parcel.readInt() != 0);
                return true;
            case 12:
                Y(parcel.readInt());
                return true;
            case 13:
                C0548e c0548e2 = (C0548e) weakReference.get();
                if (c0548e2 != null) {
                    c0548e2.a(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void p() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void t(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }
}
