package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
public final class C1046e extends android.media.session.MediaController.Callback {

    /* renamed from: a */
    public final java.lang.ref.WeakReference f3827a;

    public C1046e(p190s2.C2145e c2145e) {
        this.f3827a = new java.lang.ref.WeakReference(c2145e);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackInfo) {
        if (((p190s2.C2145e) this.f3827a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(android.os.Bundle bundle) {
        android.support.v4.media.session.C1061t.m2199b0(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(android.media.MediaMetadata mediaMetadata) {
        if (((p190s2.C2145e) this.f3827a.get()) != null) {
            p165n.C1878e c1878e = android.support.v4.media.MediaMetadataCompat.f3769o;
            if (mediaMetadata != null) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                android.support.v4.media.MediaMetadataCompat createFromParcel = android.support.v4.media.MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                createFromParcel.f3774m = mediaMetadata;
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(android.media.session.PlaybackState playbackState) {
        java.util.ArrayList arrayList;
        android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction;
        p190s2.C2145e c2145e = (p190s2.C2145e) this.f3827a.get();
        if (c2145e == null || c2145e.f8555c != null || playbackState == null) {
            return;
        }
        java.util.List<android.media.session.PlaybackState.CustomAction> m2258j = android.support.v4.media.session.AbstractC1062u.m2258j(playbackState);
        if (m2258j != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(m2258j.size());
            for (android.media.session.PlaybackState.CustomAction customAction2 : m2258j) {
                if (customAction2 != null) {
                    android.media.session.PlaybackState.CustomAction customAction3 = customAction2;
                    android.os.Bundle m2260l = android.support.v4.media.session.AbstractC1062u.m2260l(customAction3);
                    android.support.v4.media.session.C1061t.m2199b0(m2260l);
                    customAction = new android.support.v4.media.session.PlaybackStateCompat.CustomAction(android.support.v4.media.session.AbstractC1062u.m2254f(customAction3), android.support.v4.media.session.AbstractC1062u.m2263o(customAction3), android.support.v4.media.session.AbstractC1062u.m2261m(customAction3), m2260l);
                    customAction.f3824p = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        android.os.Bundle m2273a = android.support.v4.media.session.AbstractC1063v.m2273a(playbackState);
        android.support.v4.media.session.C1061t.m2199b0(m2273a);
        new android.support.v4.media.session.PlaybackStateCompat(android.support.v4.media.session.AbstractC1062u.m2266r(playbackState), android.support.v4.media.session.AbstractC1062u.m2265q(playbackState), android.support.v4.media.session.AbstractC1062u.m2257i(playbackState), android.support.v4.media.session.AbstractC1062u.m2264p(playbackState), android.support.v4.media.session.AbstractC1062u.m2255g(playbackState), 0, android.support.v4.media.session.AbstractC1062u.m2259k(playbackState), android.support.v4.media.session.AbstractC1062u.m2262n(playbackState), arrayList, android.support.v4.media.session.AbstractC1062u.m2256h(playbackState), m2273a).f3819w = playbackState;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(java.util.List list) {
        android.support.v4.media.session.MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((p190s2.C2145e) this.f3827a.get()) == null || list == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.Object obj : list) {
            if (obj != null) {
                android.media.session.MediaSession.QueueItem queueItem = (android.media.session.MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new android.support.v4.media.session.MediaSessionCompat$QueueItem(queueItem, android.support.v4.media.MediaDescriptionCompat.m2060d(android.support.v4.media.session.AbstractC1059r.m2195b(queueItem)), android.support.v4.media.session.AbstractC1059r.m2196c(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(java.lang.CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.C1061t.m2199b0(bundle);
    }
}
