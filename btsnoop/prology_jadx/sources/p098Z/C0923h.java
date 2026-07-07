package p098Z;

/* renamed from: Z.h */
/* loaded from: classes.dex */
public final class C0923h extends java.lang.Thread {

    /* renamed from: l */
    public final /* synthetic */ p141i0.C1529b f3258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923h(p141i0.C1529b c1529b) {
        super("ExoPlayer:SimpleDecoder");
        this.f3258l = c1529b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (java.lang.InterruptedException e4) {
                throw new java.lang.IllegalStateException(e4);
            }
        } while (this.f3258l.m3396h());
    }
}
