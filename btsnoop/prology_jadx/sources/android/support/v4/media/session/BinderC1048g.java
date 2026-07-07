package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.g */
/* loaded from: classes.dex */
public final class BinderC1048g extends android.os.Binder implements android.support.v4.media.session.InterfaceC1043b {

    /* renamed from: c */
    public final java.lang.ref.WeakReference f3830c;

    public BinderC1048g(p190s2.C2145e c2145e) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f3830c = new java.lang.ref.WeakReference(c2145e);
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: R */
    public final void mo2099R(boolean z4) {
        p190s2.C2145e c2145e = (p190s2.C2145e) this.f3830c.get();
        if (c2145e != null) {
            c2145e.m4264a(11, java.lang.Boolean.valueOf(z4), null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: Y */
    public final void mo2100Y(int i4) {
        p190s2.C2145e c2145e = (p190s2.C2145e) this.f3830c.get();
        if (c2145e != null) {
            c2145e.m4264a(12, java.lang.Integer.valueOf(i4), null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: Z */
    public final void mo2107Z(android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: a0 */
    public final void mo2101a0(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        p190s2.C2145e c2145e = (p190s2.C2145e) this.f3830c.get();
        if (c2145e != null) {
            c2145e.m4264a(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: b */
    public final void mo2102b(int i4) {
        p190s2.C2145e c2145e = (p190s2.C2145e) this.f3830c.get();
        if (c2145e != null) {
            c2145e.m4264a(9, java.lang.Integer.valueOf(i4), null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: d */
    public final void mo2103d(java.util.List list) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: g */
    public final void mo2108g(java.lang.CharSequence charSequence) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: j0 */
    public final void mo2104j0(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new java.lang.AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, android.os.Parcel parcel, android.os.Parcel parcel2, int i5) {
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i4 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        java.lang.ref.WeakReference weakReference = this.f3830c;
        switch (i4) {
            case 1:
                java.lang.String readString = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) p101a.AbstractC0936a.m1789a(parcel, android.os.Bundle.CREATOR);
                p190s2.C2145e c2145e = (p190s2.C2145e) weakReference.get();
                if (c2145e != null) {
                    c2145e.m4264a(1, readString, bundle);
                }
                return true;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                mo2105p();
                return true;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                mo2101a0((android.support.v4.media.session.PlaybackStateCompat) p101a.AbstractC0936a.m1789a(parcel, android.support.v4.media.session.PlaybackStateCompat.CREATOR));
                return true;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                mo2106t((android.support.v4.media.MediaMetadataCompat) p101a.AbstractC0936a.m1789a(parcel, android.support.v4.media.MediaMetadataCompat.CREATOR));
                return true;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                mo2103d(parcel.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                mo2108g((java.lang.CharSequence) p101a.AbstractC0936a.m1789a(parcel, android.text.TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                mo2107Z((android.os.Bundle) p101a.AbstractC0936a.m1789a(parcel, android.os.Bundle.CREATOR));
                return true;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                mo2104j0((android.support.v4.media.session.ParcelableVolumeInfo) p101a.AbstractC0936a.m1789a(parcel, android.support.v4.media.session.ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                mo2102b(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                mo2099R(parcel.readInt() != 0);
                return true;
            case 12:
                mo2100Y(parcel.readInt());
                return true;
            case 13:
                p190s2.C2145e c2145e2 = (p190s2.C2145e) weakReference.get();
                if (c2145e2 != null) {
                    c2145e2.m4264a(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: p */
    public final void mo2105p() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: t */
    public final void mo2106t(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        throw new java.lang.AssertionError();
    }
}
