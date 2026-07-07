package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.prology.R;
import i.ViewOnTouchListenerC0320a;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353h extends C0362q implements InterfaceC0355j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0354i f6658n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353h(C0354i c0354i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f6658n = c0354i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0320a(this, this));
    }

    @Override // j.InterfaceC0355j
    public final boolean a() {
        return false;
    }

    @Override // j.InterfaceC0355j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6658n.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
