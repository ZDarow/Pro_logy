package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import j.InterfaceC0370z;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public TypedValue f3814l;

    /* renamed from: m, reason: collision with root package name */
    public TypedValue f3815m;

    /* renamed from: n, reason: collision with root package name */
    public TypedValue f3816n;

    /* renamed from: o, reason: collision with root package name */
    public TypedValue f3817o;

    /* renamed from: p, reason: collision with root package name */
    public TypedValue f3818p;

    /* renamed from: q, reason: collision with root package name */
    public TypedValue f3819q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f3820r;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3820r = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3818p == null) {
            this.f3818p = new TypedValue();
        }
        return this.f3818p;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3819q == null) {
            this.f3819q = new TypedValue();
        }
        return this.f3819q;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3816n == null) {
            this.f3816n = new TypedValue();
        }
        return this.f3816n;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3817o == null) {
            this.f3817o = new TypedValue();
        }
        return this.f3817o;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3814l == null) {
            this.f3814l = new TypedValue();
        }
        return this.f3814l;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3815m == null) {
            this.f3815m = new TypedValue();
        }
        return this.f3815m;
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

    public void setAttachListener(InterfaceC0370z interfaceC0370z) {
    }
}
