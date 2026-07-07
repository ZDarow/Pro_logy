package C;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024k implements InterfaceC0025l {

    /* renamed from: l, reason: collision with root package name */
    public final ScrollFeedbackProvider f322l;

    public C0024k(NestedScrollView nestedScrollView) {
        this.f322l = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // C.InterfaceC0025l
    public final void b(int i4, int i5, int i6, boolean z4) {
        this.f322l.onScrollLimit(i4, i5, i6, z4);
    }

    @Override // C.InterfaceC0025l
    public final void c(int i4, int i5, int i6, int i7) {
        this.f322l.onScrollProgress(i4, i5, i6, i7);
    }
}
