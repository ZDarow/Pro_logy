package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import n.C0442e;
import s2.C0548e;

/* loaded from: classes.dex */
public final class e extends MediaController.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3700a;

    public e(C0548e c0548e) {
        this.f3700a = new WeakReference(c0548e);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((C0548e) this.f3700a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        t.b0(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((C0548e) this.f3700a.get()) != null) {
            C0442e c0442e = MediaMetadataCompat.f3644o;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                createFromParcel.f3649m = mediaMetadata;
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        C0548e c0548e = (C0548e) this.f3700a.get();
        if (c0548e == null || c0548e.f8236c != null || playbackState == null) {
            return;
        }
        List<PlaybackState.CustomAction> j4 = u.j(playbackState);
        if (j4 != null) {
            ArrayList arrayList2 = new ArrayList(j4.size());
            for (PlaybackState.CustomAction customAction2 : j4) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l4 = u.l(customAction3);
                    t.b0(l4);
                    customAction = new PlaybackStateCompat.CustomAction(u.f(customAction3), u.o(customAction3), u.m(customAction3), l4);
                    customAction.f3697p = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle a4 = v.a(playbackState);
        t.b0(a4);
        new PlaybackStateCompat(u.r(playbackState), u.q(playbackState), u.i(playbackState), u.p(playbackState), u.g(playbackState), 0, u.k(playbackState), u.n(playbackState), arrayList, u.h(playbackState), a4).w = playbackState;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((C0548e) this.f3700a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.d(r.b(queueItem)), r.c(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        t.b0(bundle);
    }
}
