package k1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class t extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f7034a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7035b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7034a = new Rect();
        this.f7035b = true;
    }

    public t(int i4, int i5) {
        super(i4, i5);
        this.f7034a = new Rect();
        this.f7035b = true;
    }

    public t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7034a = new Rect();
        this.f7035b = true;
    }

    public t(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7034a = new Rect();
        this.f7035b = true;
    }

    public t(t tVar) {
        super((ViewGroup.LayoutParams) tVar);
        this.f7034a = new Rect();
        this.f7035b = true;
    }
}
