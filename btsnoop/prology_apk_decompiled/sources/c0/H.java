package c0;

import a0.C0119I;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class H extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f4490a;

    public H(I i4) {
        this.f4490a = i4;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i4) {
        J j4;
        K2.o oVar;
        C0119I c0119i;
        if (audioTrack.equals(this.f4490a.f4493c.w) && (oVar = (j4 = this.f4490a.f4493c).s) != null && j4.f4520Y && (c0119i = ((M) oVar.f1009m).f6878Q) != null) {
            c0119i.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f4490a.f4493c.w)) {
            this.f4490a.f4493c.f4519X = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        J j4;
        K2.o oVar;
        C0119I c0119i;
        if (audioTrack.equals(this.f4490a.f4493c.w) && (oVar = (j4 = this.f4490a.f4493c).s) != null && j4.f4520Y && (c0119i = ((M) oVar.f1009m).f6878Q) != null) {
            c0119i.a();
        }
    }
}
