package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public final class C1042a implements android.support.v4.media.session.InterfaceC1043b {

    /* renamed from: c */
    public android.os.IBinder f3825c;

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: R */
    public final void mo2099R(boolean z4) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(z4 ? 1 : 0);
            this.f3825c.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: Y */
    public final void mo2100Y(int i4) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i4);
            this.f3825c.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: a0 */
    public final void mo2101a0(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            p101a.AbstractC0936a.m1797e0(obtain, playbackStateCompat);
            this.f3825c.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f3825c;
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: b */
    public final void mo2102b(int i4) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i4);
            this.f3825c.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: d */
    public final void mo2103d(java.util.List list) {
        throw null;
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: j0 */
    public final void mo2104j0(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            p101a.AbstractC0936a.m1797e0(obtain, parcelableVolumeInfo);
            this.f3825c.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: p */
    public final void mo2105p() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f3825c.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1043b
    /* renamed from: t */
    public final void mo2106t(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            p101a.AbstractC0936a.m1797e0(obtain, mediaMetadataCompat);
            this.f3825c.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
