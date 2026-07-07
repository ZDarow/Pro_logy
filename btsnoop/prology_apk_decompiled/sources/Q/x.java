package Q;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
public final class x extends VolumeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W.l f1581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(W.l lVar, int i4, int i5, int i6) {
        super(i4, i5, i6, null);
        this.f1581a = lVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i4) {
        this.f1581a.getClass();
        W.l.f(i4);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i4) {
        this.f1581a.getClass();
        W.l.g(i4);
    }
}
