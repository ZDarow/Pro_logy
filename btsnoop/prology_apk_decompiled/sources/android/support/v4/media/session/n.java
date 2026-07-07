package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class n extends Binder implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3715d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f3716c;

    public n(o oVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f3716c = new AtomicReference(oVar);
    }

    @Override // android.support.v4.media.session.d
    public final int A() {
        o oVar = (o) this.f3716c.get();
        if (oVar != null) {
            return oVar.f3726j;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void B(long j4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void C(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D(int i4, int i5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo E() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat F() {
        o oVar = (o) this.f3716c.get();
        if (oVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = oVar.f3722f;
        MediaMetadataCompat mediaMetadataCompat = oVar.f3724h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j4 = playbackStateCompat.f3684m;
        long j5 = -1;
        if (j4 == -1) {
            return playbackStateCompat;
        }
        int i4 = playbackStateCompat.f3683l;
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.s <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = (playbackStateCompat.f3686o * ((float) (elapsedRealtime - r7))) + j4;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f3648l;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j5 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j7 = (j5 < 0 || j6 <= j5) ? j6 < 0 ? 0L : j6 : j5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.f3690t;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f3683l, j7, playbackStateCompat.f3685n, playbackStateCompat.f3686o, playbackStateCompat.f3687p, playbackStateCompat.f3688q, playbackStateCompat.f3689r, elapsedRealtime, arrayList, playbackStateCompat.f3691u, playbackStateCompat.f3692v);
    }

    @Override // android.support.v4.media.session.d
    public final void G() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle H() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void I(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void J(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean L() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void M(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent N() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int O() {
        o oVar = (o) this.f3716c.get();
        if (oVar != null) {
            return oVar.f3727k;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void P(long j4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Q(int i4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void S(int i4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void T() {
    }

    @Override // android.support.v4.media.session.d
    public final void U(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean W() {
        o oVar = (o) this.f3716c.get();
        return oVar != null && oVar.f3725i;
    }

    @Override // android.support.v4.media.session.d
    public final String X() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.d
    public final void b0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void c() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void c0(float f4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void d0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e(int i4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List e0() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void f() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence h() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void i(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void i0(int i4, int i5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k(b bVar) {
        o oVar = (o) this.f3716c.get();
        if (oVar == null) {
            return;
        }
        oVar.f3721e.register(bVar, new Q.u(Binder.getCallingPid(), Binder.getCallingUid(), "android.media.session.MediaController"));
        synchronized (oVar.f3720d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final boolean k0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void l(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat m() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o() {
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.support.v4.media.session.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.support.v4.media.session.a, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i4 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i4) {
            case 1:
                d0(parcel.readString(), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) AbstractC0462a.a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                boolean k02 = k0((KeyEvent) AbstractC0462a.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(k02 ? 1 : 0);
                return true;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                        ?? obj = new Object();
                        obj.f3698c = readStrongBinder;
                        bVar = obj;
                    } else {
                        bVar = (b) queryLocalInterface;
                    }
                }
                k(bVar);
                parcel2.writeNoException();
                return true;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                        ?? obj2 = new Object();
                        obj2.f3698c = readStrongBinder2;
                        bVar2 = obj2;
                    } else {
                        bVar2 = (b) queryLocalInterface2;
                    }
                }
                r(bVar2);
                parcel2.writeNoException();
                return true;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                boolean L3 = L();
                parcel2.writeNoException();
                parcel2.writeInt(L3 ? 1 : 0);
                return true;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                String X3 = X();
                parcel2.writeNoException();
                parcel2.writeString(X3);
                return true;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                String u4 = u();
                parcel2.writeNoException();
                parcel2.writeString(u4);
                return true;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                PendingIntent N3 = N();
                parcel2.writeNoException();
                AbstractC0462a.W(parcel2, N3, 1);
                return true;
            case 9:
                long y4 = y();
                parcel2.writeNoException();
                parcel2.writeLong(y4);
                return true;
            case 10:
                ParcelableVolumeInfo E3 = E();
                parcel2.writeNoException();
                AbstractC0462a.W(parcel2, E3, 1);
                return true;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                i0(readInt, readInt2);
                parcel2.writeNoException();
                return true;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                D(readInt3, readInt4);
                parcel2.writeNoException();
                return true;
            case 13:
                b0();
                parcel2.writeNoException();
                return true;
            case 14:
                x(parcel.readString(), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                C(parcel.readString(), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                I((Uri) AbstractC0462a.a(parcel, Uri.CREATOR), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                B(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                a();
                parcel2.writeNoException();
                return true;
            case 19:
                o();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                G();
                parcel2.writeNoException();
                return true;
            case 23:
                f();
                parcel2.writeNoException();
                return true;
            case 24:
                P(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                w((RatingCompat) AbstractC0462a.a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                i(parcel.readString(), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat m4 = m();
                parcel2.writeNoException();
                AbstractC0462a.W(parcel2, m4, 1);
                return true;
            case 28:
                PlaybackStateCompat F3 = F();
                parcel2.writeNoException();
                AbstractC0462a.W(parcel2, F3, 1);
                return true;
            case 29:
                List e02 = e0();
                parcel2.writeNoException();
                if (e02 == null) {
                    parcel2.writeInt(-1);
                } else {
                    int size = e02.size();
                    parcel2.writeInt(size);
                    for (int i6 = 0; i6 < size; i6++) {
                        AbstractC0462a.W(parcel2, (Parcelable) e02.get(i6), 1);
                    }
                }
                return true;
            case 30:
                CharSequence h4 = h();
                parcel2.writeNoException();
                if (h4 != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(h4, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                Bundle H3 = H();
                parcel2.writeNoException();
                AbstractC0462a.W(parcel2, H3, 1);
                return true;
            case 32:
                T();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                c();
                parcel2.writeNoException();
                return true;
            case 34:
                n(parcel.readString(), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                U(parcel.readString(), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                z((Uri) AbstractC0462a.a(parcel, Uri.CREATOR), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int A4 = A();
                parcel2.writeNoException();
                parcel2.writeInt(A4);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                e(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                M((MediaDescriptionCompat) AbstractC0462a.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                s((MediaDescriptionCompat) AbstractC0462a.a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                J((MediaDescriptionCompat) AbstractC0462a.a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                S(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                boolean W3 = W();
                parcel2.writeNoException();
                parcel2.writeInt(W3 ? 1 : 0);
                return true;
            case 46:
                v(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int O3 = O();
                parcel2.writeNoException();
                parcel2.writeInt(O3);
                return true;
            case 48:
                Q(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                c0(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle q4 = q();
                parcel2.writeNoException();
                AbstractC0462a.W(parcel2, q4, 1);
                return true;
            case 51:
                l((RatingCompat) AbstractC0462a.a(parcel, RatingCompat.CREATOR), (Bundle) AbstractC0462a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle q() {
        ((o) this.f3716c.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void r(b bVar) {
        o oVar = (o) this.f3716c.get();
        if (oVar == null) {
            return;
        }
        oVar.f3721e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (oVar.f3720d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void s(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String u() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void v(boolean z4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long y() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }
}
