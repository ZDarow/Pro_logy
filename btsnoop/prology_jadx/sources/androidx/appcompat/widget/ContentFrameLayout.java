package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* renamed from: l */
    public android.util.TypedValue f3951l;

    /* renamed from: m */
    public android.util.TypedValue f3952m;

    /* renamed from: n */
    public android.util.TypedValue f3953n;

    /* renamed from: o */
    public android.util.TypedValue f3954o;

    /* renamed from: p */
    public android.util.TypedValue f3955p;

    /* renamed from: q */
    public android.util.TypedValue f3956q;

    /* renamed from: r */
    public final android.graphics.Rect f3957r;

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3957r = new android.graphics.Rect();
    }

    public android.util.TypedValue getFixedHeightMajor() {
        if (this.f3955p == null) {
            this.f3955p = new android.util.TypedValue();
        }
        return this.f3955p;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        if (this.f3956q == null) {
            this.f3956q = new android.util.TypedValue();
        }
        return this.f3956q;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        if (this.f3953n == null) {
            this.f3953n = new android.util.TypedValue();
        }
        return this.f3953n;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        if (this.f3954o == null) {
            this.f3954o = new android.util.TypedValue();
        }
        return this.f3954o;
    }

    public android.util.TypedValue getMinWidthMajor() {
        if (this.f3951l == null) {
            this.f3951l = new android.util.TypedValue();
        }
        return this.f3951l;
    }

    public android.util.TypedValue getMinWidthMinor() {
        if (this.f3952m == null) {
            this.f3952m = new android.util.TypedValue();
        }
        return this.f3952m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(p145j.InterfaceC1694z interfaceC1694z) {
    }
}
