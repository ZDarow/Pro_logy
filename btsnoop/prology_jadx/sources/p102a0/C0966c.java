package p102a0;

/* renamed from: a0.c */
/* loaded from: classes.dex */
public final class C0966c implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final android.os.Handler f3519a;

    /* renamed from: b */
    public final /* synthetic */ p102a0.C0968d f3520b;

    public C0966c(p102a0.C0968d c0968d, android.os.Handler handler) {
        this.f3520b = c0968d;
        this.f3519a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        this.f3519a.post(new p093X2.RunnableC0848i(i4, 2, this));
    }
}
