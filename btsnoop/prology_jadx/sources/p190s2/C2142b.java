package p190s2;

/* renamed from: s2.b */
/* loaded from: classes.dex */
public final class C2142b extends android.support.v4.media.session.AbstractC1054m {

    /* renamed from: f */
    public final /* synthetic */ com.ryanheise.audioservice.AudioService f8536f;

    public C2142b(com.ryanheise.audioservice.AudioService audioService) {
        this.f8536f = audioService;
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: A */
    public final void mo2160A(long j4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("skipToQueueItem", p190s2.C2151k.m4275q("index", java.lang.Long.valueOf(j4)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: B */
    public final void mo2161B() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("stop", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: b */
    public final void mo2163b(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("addQueueItem", p190s2.C2151k.m4275q("mediaItem", p190s2.C2151k.m4266a((android.support.v4.media.MediaMetadataCompat) com.ryanheise.audioservice.AudioService.f4963N.get(mediaDescriptionCompat.f3760l))), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: c */
    public final void mo2164c(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("insertQueueItem", p190s2.C2151k.m4275q("mediaItem", p190s2.C2151k.m4266a((android.support.v4.media.MediaMetadataCompat) com.ryanheise.audioservice.AudioService.f4963N.get(mediaDescriptionCompat.f3760l)), "index", java.lang.Integer.valueOf(i4)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: d */
    public final void mo2165d(java.lang.String str, android.os.Bundle bundle) {
        if (com.ryanheise.audioservice.AudioService.f4961L == null) {
            return;
        }
        if ("com.ryanheise.audioservice.action.STOP".equals(str)) {
            p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
            c0247a.getClass();
            c0247a.m656a("stop", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
            p034H2.C0247a c0247a2 = com.ryanheise.audioservice.AudioService.f4961L;
            c0247a2.getClass();
            c0247a2.m656a("fastForward", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
            p034H2.C0247a c0247a3 = com.ryanheise.audioservice.AudioService.f4961L;
            c0247a3.getClass();
            c0247a3.m656a("rewind", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
        } else {
            p034H2.C0247a c0247a4 = com.ryanheise.audioservice.AudioService.f4961L;
            c0247a4.getClass();
            c0247a4.m656a("customAction", p190s2.C2151k.m4275q("name", str, "extras", p190s2.C2151k.m4270k(bundle)), null);
        }
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: e */
    public final void mo2166e() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("fastForward", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: f */
    public final boolean mo2167f(android.content.Intent intent) {
        int i4;
        if (com.ryanheise.audioservice.AudioService.f4961L == null) {
            return false;
        }
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    mo2168g();
                } else if (keyCode != 126 && keyCode != 127) {
                    switch (keyCode) {
                        case 86:
                            mo2161B();
                            break;
                        case 89:
                            mo2178q();
                            break;
                        case 90:
                            mo2166e();
                            break;
                        case 91:
                            mo2169h();
                            break;
                    }
                }
            }
            p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 79 && keyCode2 != 85) {
                if (keyCode2 == 87) {
                    i4 = 2;
                } else if (keyCode2 == 88) {
                    i4 = 3;
                }
                c0247a.getClass();
                c0247a.m656a("click", p190s2.C2151k.m4275q("button", java.lang.Integer.valueOf(p044L.AbstractC0352j.m781b(i4))), null);
            }
            i4 = 1;
            c0247a.getClass();
            c0247a.m656a("click", p190s2.C2151k.m4275q("button", java.lang.Integer.valueOf(p044L.AbstractC0352j.m781b(i4))), null);
        }
        return true;
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: g */
    public final void mo2168g() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("pause", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: h */
    public final void mo2169h() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("play", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: i */
    public final void mo2170i(java.lang.String str, android.os.Bundle bundle) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("playFromMediaId", p190s2.C2151k.m4275q("mediaId", str, "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: j */
    public final void mo2171j(java.lang.String str, android.os.Bundle bundle) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("playFromSearch", p190s2.C2151k.m4275q("query", str, "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: k */
    public final void mo2172k(android.net.Uri uri, android.os.Bundle bundle) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("playFromUri", p190s2.C2151k.m4275q("uri", uri.toString(), "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: l */
    public final void mo2173l() {
        if (com.ryanheise.audioservice.AudioService.f4961L == null) {
            return;
        }
        com.ryanheise.audioservice.AudioService audioService = this.f8536f;
        if (!audioService.f4975v.m2236o0()) {
            audioService.f4975v.m2246x0(true);
        }
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        c0247a.getClass();
        c0247a.m656a("prepare", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: m */
    public final void mo2174m(java.lang.String str, android.os.Bundle bundle) {
        if (com.ryanheise.audioservice.AudioService.f4961L == null) {
            return;
        }
        com.ryanheise.audioservice.AudioService audioService = this.f8536f;
        if (!audioService.f4975v.m2236o0()) {
            audioService.f4975v.m2246x0(true);
        }
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        c0247a.getClass();
        c0247a.m656a("prepareFromMediaId", p190s2.C2151k.m4275q("mediaId", str, "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: n */
    public final void mo2175n(java.lang.String str, android.os.Bundle bundle) {
        if (com.ryanheise.audioservice.AudioService.f4961L == null) {
            return;
        }
        com.ryanheise.audioservice.AudioService audioService = this.f8536f;
        if (!audioService.f4975v.m2236o0()) {
            audioService.f4975v.m2246x0(true);
        }
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        c0247a.getClass();
        c0247a.m656a("prepareFromSearch", p190s2.C2151k.m4275q("query", str, "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: o */
    public final void mo2176o(android.net.Uri uri, android.os.Bundle bundle) {
        if (com.ryanheise.audioservice.AudioService.f4961L == null) {
            return;
        }
        com.ryanheise.audioservice.AudioService audioService = this.f8536f;
        if (!audioService.f4975v.m2236o0()) {
            audioService.f4975v.m2246x0(true);
        }
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        c0247a.getClass();
        c0247a.m656a("prepareFromUri", p190s2.C2151k.m4275q("uri", uri.toString(), "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: p */
    public final void mo2177p(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("removeQueueItem", p190s2.C2151k.m4275q("mediaItem", p190s2.C2151k.m4266a((android.support.v4.media.MediaMetadataCompat) com.ryanheise.audioservice.AudioService.f4963N.get(mediaDescriptionCompat.f3760l))), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: q */
    public final void mo2178q() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("rewind", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: r */
    public final void mo2179r(long j4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("seek", p190s2.C2151k.m4275q("position", java.lang.Long.valueOf(j4 * 1000)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: s */
    public final void mo2180s(boolean z4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("setCaptioningEnabled", p190s2.C2151k.m4275q("enabled", java.lang.Boolean.valueOf(z4)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: t */
    public final void mo2181t(float f4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("setSpeed", p190s2.C2151k.m4275q("speed", java.lang.Float.valueOf(f4)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: u */
    public final void mo2182u(android.support.v4.media.RatingCompat ratingCompat) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("setRating", p190s2.C2151k.m4275q("rating", p190s2.C2151k.m4278t(ratingCompat), "extras", null), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: v */
    public final void mo2183v(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("setRating", p190s2.C2151k.m4275q("rating", p190s2.C2151k.m4278t(ratingCompat), "extras", p190s2.C2151k.m4270k(bundle)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: w */
    public final void mo2184w(int i4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("setRepeatMode", p190s2.C2151k.m4275q("repeatMode", java.lang.Integer.valueOf(i4)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: x */
    public final void mo2185x(int i4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("setShuffleMode", p190s2.C2151k.m4275q("shuffleMode", java.lang.Integer.valueOf(i4)), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: y */
    public final void mo2186y() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("skipToNext", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }

    @Override // android.support.v4.media.session.AbstractC1054m
    /* renamed from: z */
    public final void mo2187z() {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("skipToPrevious", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }
}
