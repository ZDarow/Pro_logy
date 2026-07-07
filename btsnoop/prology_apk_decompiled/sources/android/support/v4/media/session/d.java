package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface d extends IInterface {
    int A();

    void B(long j4);

    void C(String str, Bundle bundle);

    void D(int i4, int i5);

    ParcelableVolumeInfo E();

    PlaybackStateCompat F();

    void G();

    Bundle H();

    void I(Uri uri, Bundle bundle);

    void J(MediaDescriptionCompat mediaDescriptionCompat);

    boolean L();

    void M(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent N();

    int O();

    void P(long j4);

    void Q(int i4);

    void S(int i4);

    void T();

    void U(String str, Bundle bundle);

    boolean W();

    String X();

    void a();

    void b0();

    void c();

    void c0(float f4);

    void d0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void e(int i4);

    List e0();

    void f();

    CharSequence h();

    void i(String str, Bundle bundle);

    void i0(int i4, int i5);

    void k(b bVar);

    boolean k0(KeyEvent keyEvent);

    void l(RatingCompat ratingCompat, Bundle bundle);

    MediaMetadataCompat m();

    void n(String str, Bundle bundle);

    void next();

    void o();

    void previous();

    Bundle q();

    void r(b bVar);

    void s(MediaDescriptionCompat mediaDescriptionCompat, int i4);

    String u();

    void v(boolean z4);

    void w(RatingCompat ratingCompat);

    void x(String str, Bundle bundle);

    long y();

    void z(Uri uri, Bundle bundle);
}
