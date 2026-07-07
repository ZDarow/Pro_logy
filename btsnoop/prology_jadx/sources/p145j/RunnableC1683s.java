package p145j;

/* renamed from: j.s */
/* loaded from: classes.dex */
public final class RunnableC1683s implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ android.widget.TextView f6995l;

    /* renamed from: m */
    public final /* synthetic */ android.graphics.Typeface f6996m;

    /* renamed from: n */
    public final /* synthetic */ int f6997n;

    public RunnableC1683s(android.widget.TextView textView, android.graphics.Typeface typeface, int i4) {
        this.f6995l = textView;
        this.f6996m = typeface;
        this.f6997n = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6995l.setTypeface(this.f6996m, this.f6997n);
    }
}
