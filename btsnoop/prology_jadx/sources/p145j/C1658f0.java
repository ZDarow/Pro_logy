package p145j;

/* renamed from: j.f0 */
/* loaded from: classes.dex */
public final class C1658f0 extends android.view.TouchDelegate {

    /* renamed from: a */
    public final android.view.View f6900a;

    /* renamed from: b */
    public final android.graphics.Rect f6901b;

    /* renamed from: c */
    public final android.graphics.Rect f6902c;

    /* renamed from: d */
    public final android.graphics.Rect f6903d;

    /* renamed from: e */
    public final int f6904e;

    /* renamed from: f */
    public boolean f6905f;

    public C1658f0(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        super(rect, view);
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f6904e = scaledTouchSlop;
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.f6901b = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.f6903d = rect4;
        android.graphics.Rect rect5 = new android.graphics.Rect();
        this.f6902c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f6900a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x3 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f6905f;
                if (z5 && !this.f6903d.contains(x3, y4)) {
                    z6 = z5;
                    z4 = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f6905f;
                    this.f6905f = false;
                }
                z4 = true;
                z6 = false;
            }
            z6 = z5;
            z4 = true;
        } else {
            if (this.f6901b.contains(x3, y4)) {
                this.f6905f = true;
                z4 = true;
            }
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        android.graphics.Rect rect = this.f6902c;
        android.view.View view = this.f6900a;
        if (!z4 || rect.contains(x3, y4)) {
            motionEvent.setLocation(x3 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
