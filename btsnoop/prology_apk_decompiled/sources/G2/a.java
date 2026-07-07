package G2;

import C.C0016c;
import a.AbstractC0110a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.platform.h;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f685a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f687c;

    public a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f686b = onFocusChangeListener;
        this.f687c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f685a) {
            case 0:
                b bVar = (b) this.f687c;
                this.f686b.onFocusChange(bVar, AbstractC0110a.Y(bVar, new C0016c(13)));
                return;
            default:
                C0016c c0016c = new C0016c(13);
                h hVar = (h) this.f687c;
                this.f686b.onFocusChange(hVar, AbstractC0110a.Y(hVar, c0016c));
                return;
        }
    }

    public a(h hVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f687c = hVar;
        this.f686b = onFocusChangeListener;
    }
}
