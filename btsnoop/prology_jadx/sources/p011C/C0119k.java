package p011C;

/* renamed from: C.k */
/* loaded from: classes.dex */
public final class C0119k implements p011C.InterfaceC0120l {

    /* renamed from: l */
    public final android.view.ScrollFeedbackProvider f328l;

    public C0119k(androidx.core.widget.NestedScrollView nestedScrollView) {
        this.f328l = android.view.ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p011C.InterfaceC0120l
    /* renamed from: b */
    public final void mo433b(int i4, int i5, int i6, boolean z4) {
        this.f328l.onScrollLimit(i4, i5, i6, z4);
    }

    @Override // p011C.InterfaceC0120l
    /* renamed from: c */
    public final void mo434c(int i4, int i5, int i6, int i7) {
        this.f328l.onScrollProgress(i4, i5, i6, i7);
    }
}
