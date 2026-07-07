package i;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.C0351f;
import j.C0352g;
import j.C0353h;
import j.F;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0320a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f6002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6004c;

    /* renamed from: d, reason: collision with root package name */
    public final View f6005d;

    /* renamed from: e, reason: collision with root package name */
    public F f6006e;

    /* renamed from: f, reason: collision with root package name */
    public F f6007f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6008g;

    /* renamed from: h, reason: collision with root package name */
    public int f6009h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f6010i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6011j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f6012k;

    public ViewOnTouchListenerC0320a(View view) {
        this.f6010i = new int[2];
        this.f6005d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f6002a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f6003b = tapTimeout;
        this.f6004c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        F f4 = this.f6007f;
        View view = this.f6005d;
        if (f4 != null) {
            view.removeCallbacks(f4);
        }
        F f5 = this.f6006e;
        if (f5 != null) {
            view.removeCallbacks(f5);
        }
    }

    public final AbstractC0330k b() {
        C0351f c0351f;
        switch (this.f6011j) {
            case 0:
                AbstractC0321b abstractC0321b = ((ActionMenuItemView) this.f6012k).f3742v;
                if (abstractC0321b == null || (c0351f = ((C0352g) abstractC0321b).f6652a.f6677D) == null) {
                    return null;
                }
                return c0351f.a();
            default:
                C0351f c0351f2 = ((C0353h) this.f6012k).f6658n.f6676C;
                if (c0351f2 == null) {
                    return null;
                }
                return c0351f2.a();
        }
    }

    public final boolean c() {
        AbstractC0330k b4;
        switch (this.f6011j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f6012k;
                InterfaceC0327h interfaceC0327h = actionMenuItemView.f3740t;
                return interfaceC0327h != null && interfaceC0327h.a(actionMenuItemView.f3738q) && (b4 = b()) != null && b4.i();
            default:
                ((C0353h) this.f6012k).f6658n.k();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.ViewOnTouchListenerC0320a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6008g = false;
        this.f6009h = -1;
        F f4 = this.f6006e;
        if (f4 != null) {
            this.f6005d.removeCallbacks(f4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0320a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f6011j = 0;
        this.f6012k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0320a(C0353h c0353h, C0353h c0353h2) {
        this(c0353h2);
        this.f6011j = 1;
        this.f6012k = c0353h;
    }
}
