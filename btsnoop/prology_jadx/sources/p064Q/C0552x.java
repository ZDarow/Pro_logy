package p064Q;

/* renamed from: Q.x */
/* loaded from: classes.dex */
public final class C0552x extends android.media.VolumeProvider {

    /* renamed from: a */
    public final /* synthetic */ p086W.C0792l f1633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0552x(p086W.C0792l c0792l, int i4, int i5, int i6) {
        super(i4, i5, i6, null);
        this.f1633a = c0792l;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i4) {
        this.f1633a.getClass();
        p086W.C0792l.m1446f(i4);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i4) {
        this.f1633a.getClass();
        p086W.C0792l.m1447g(i4);
    }
}
