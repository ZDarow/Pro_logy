package p064Q;

/* renamed from: Q.y */
/* loaded from: classes.dex */
public final class C0553y extends android.media.VolumeProvider {

    /* renamed from: a */
    public final /* synthetic */ p086W.C0792l f1634a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0553y(p086W.C0792l c0792l, int i4, int i5, int i6) {
        super(i4, i5, i6);
        this.f1634a = c0792l;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i4) {
        this.f1634a.getClass();
        p086W.C0792l.m1446f(i4);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i4) {
        this.f1634a.getClass();
        p086W.C0792l.m1447g(i4);
    }
}
