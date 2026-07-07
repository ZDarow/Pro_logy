package s2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import com.ryanheise.audioservice.AudioService;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545b extends android.support.v4.media.session.m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AudioService f8217f;

    public C0545b(AudioService audioService) {
        this.f8217f = audioService;
    }

    @Override // android.support.v4.media.session.m
    public final void A(long j4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("skipToQueueItem", k.q("index", Long.valueOf(j4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void B() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("stop", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("addQueueItem", k.q("mediaItem", k.a((MediaMetadataCompat) AudioService.f4785N.get(mediaDescriptionCompat.f3636l))), null);
    }

    @Override // android.support.v4.media.session.m
    public final void c(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("insertQueueItem", k.q("mediaItem", k.a((MediaMetadataCompat) AudioService.f4785N.get(mediaDescriptionCompat.f3636l)), "index", Integer.valueOf(i4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void d(String str, Bundle bundle) {
        if (AudioService.f4783L == null) {
            return;
        }
        if ("com.ryanheise.audioservice.action.STOP".equals(str)) {
            H2.a aVar = AudioService.f4783L;
            aVar.getClass();
            aVar.a("stop", k.q(new Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
            H2.a aVar2 = AudioService.f4783L;
            aVar2.getClass();
            aVar2.a("fastForward", k.q(new Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
            H2.a aVar3 = AudioService.f4783L;
            aVar3.getClass();
            aVar3.a("rewind", k.q(new Object[0]), null);
        } else {
            H2.a aVar4 = AudioService.f4783L;
            aVar4.getClass();
            aVar4.a("customAction", k.q("name", str, "extras", k.k(bundle)), null);
        }
    }

    @Override // android.support.v4.media.session.m
    public final void e() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("fastForward", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final boolean f(Intent intent) {
        int i4;
        if (AudioService.f4783L == null) {
            return false;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    g();
                } else if (keyCode != 126 && keyCode != 127) {
                    switch (keyCode) {
                        case 86:
                            B();
                            break;
                        case 89:
                            q();
                            break;
                        case 90:
                            e();
                            break;
                        case 91:
                            h();
                            break;
                    }
                }
            }
            H2.a aVar = AudioService.f4783L;
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 79 && keyCode2 != 85) {
                if (keyCode2 == 87) {
                    i4 = 2;
                } else if (keyCode2 == 88) {
                    i4 = 3;
                }
                aVar.getClass();
                aVar.a("click", k.q("button", Integer.valueOf(L.j.b(i4))), null);
            }
            i4 = 1;
            aVar.getClass();
            aVar.a("click", k.q("button", Integer.valueOf(L.j.b(i4))), null);
        }
        return true;
    }

    @Override // android.support.v4.media.session.m
    public final void g() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("pause", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void h() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("play", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void i(String str, Bundle bundle) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("playFromMediaId", k.q("mediaId", str, "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void j(String str, Bundle bundle) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("playFromSearch", k.q("query", str, "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void k(Uri uri, Bundle bundle) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("playFromUri", k.q("uri", uri.toString(), "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void l() {
        if (AudioService.f4783L == null) {
            return;
        }
        AudioService audioService = this.f8217f;
        if (!audioService.f4797v.o0()) {
            audioService.f4797v.x0(true);
        }
        H2.a aVar = AudioService.f4783L;
        aVar.getClass();
        aVar.a("prepare", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void m(String str, Bundle bundle) {
        if (AudioService.f4783L == null) {
            return;
        }
        AudioService audioService = this.f8217f;
        if (!audioService.f4797v.o0()) {
            audioService.f4797v.x0(true);
        }
        H2.a aVar = AudioService.f4783L;
        aVar.getClass();
        aVar.a("prepareFromMediaId", k.q("mediaId", str, "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void n(String str, Bundle bundle) {
        if (AudioService.f4783L == null) {
            return;
        }
        AudioService audioService = this.f8217f;
        if (!audioService.f4797v.o0()) {
            audioService.f4797v.x0(true);
        }
        H2.a aVar = AudioService.f4783L;
        aVar.getClass();
        aVar.a("prepareFromSearch", k.q("query", str, "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void o(Uri uri, Bundle bundle) {
        if (AudioService.f4783L == null) {
            return;
        }
        AudioService audioService = this.f8217f;
        if (!audioService.f4797v.o0()) {
            audioService.f4797v.x0(true);
        }
        H2.a aVar = AudioService.f4783L;
        aVar.getClass();
        aVar.a("prepareFromUri", k.q("uri", uri.toString(), "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void p(MediaDescriptionCompat mediaDescriptionCompat) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("removeQueueItem", k.q("mediaItem", k.a((MediaMetadataCompat) AudioService.f4785N.get(mediaDescriptionCompat.f3636l))), null);
    }

    @Override // android.support.v4.media.session.m
    public final void q() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("rewind", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void r(long j4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("seek", k.q("position", Long.valueOf(j4 * 1000)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void s(boolean z4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("setCaptioningEnabled", k.q("enabled", Boolean.valueOf(z4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void t(float f4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("setSpeed", k.q("speed", Float.valueOf(f4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void u(RatingCompat ratingCompat) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("setRating", k.q("rating", k.t(ratingCompat), "extras", null), null);
    }

    @Override // android.support.v4.media.session.m
    public final void v(RatingCompat ratingCompat, Bundle bundle) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("setRating", k.q("rating", k.t(ratingCompat), "extras", k.k(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void w(int i4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("setRepeatMode", k.q("repeatMode", Integer.valueOf(i4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void x(int i4) {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("setShuffleMode", k.q("shuffleMode", Integer.valueOf(i4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void y() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("skipToNext", k.q(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void z() {
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("skipToPrevious", k.q(new Object[0]), null);
    }
}
