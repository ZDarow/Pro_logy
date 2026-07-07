package Z;

import i0.C0340b;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0340b f3146l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C0340b c0340b) {
        super("ExoPlayer:SimpleDecoder");
        this.f3146l = c0340b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (this.f3146l.h());
    }
}
