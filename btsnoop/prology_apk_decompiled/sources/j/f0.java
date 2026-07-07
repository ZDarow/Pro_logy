package j;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class f0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f6646a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f6647b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6648c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6649d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6650e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6651f;

    public f0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f6650e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f6647b = rect3;
        Rect rect4 = new Rect();
        this.f6649d = rect4;
        Rect rect5 = new Rect();
        this.f6648c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f6646a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x3 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f6651f;
                if (z5 && !this.f6649d.contains(x3, y4)) {
                    z6 = z5;
                    z4 = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f6651f;
                    this.f6651f = false;
                }
                z4 = true;
                z6 = false;
            }
            z6 = z5;
            z4 = true;
        } else {
            if (this.f6647b.contains(x3, y4)) {
                this.f6651f = true;
                z4 = true;
            }
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.f6648c;
        View view = this.f6646a;
        if (!z4 || rect.contains(x3, y4)) {
            motionEvent.setLocation(x3 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
