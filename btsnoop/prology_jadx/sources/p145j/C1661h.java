package p145j;

/* renamed from: j.h */
/* loaded from: classes.dex */
public final class C1661h extends p145j.C1679q implements p145j.InterfaceC1665j {

    /* renamed from: n */
    public final /* synthetic */ p145j.C1663i f6912n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1661h(p145j.C1663i c1663i, android.content.Context context) {
        super(context, com.prology.R.attr.actionOverflowButtonStyle);
        this.f6912n = c1663i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new p140i.ViewOnTouchListenerC1509a(this, this));
    }

    @Override // p145j.InterfaceC1665j
    /* renamed from: a */
    public final boolean mo2275a() {
        return false;
    }

    @Override // p145j.InterfaceC1665j
    /* renamed from: b */
    public final boolean mo2276b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6912n.m3605k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
