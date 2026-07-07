package j;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: j.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0363s implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextView f6737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Typeface f6738m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6739n;

    public RunnableC0363s(TextView textView, Typeface typeface, int i4) {
        this.f6737l = textView;
        this.f6738m = typeface;
        this.f6739n = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6737l.setTypeface(this.f6738m, this.f6739n);
    }
}
