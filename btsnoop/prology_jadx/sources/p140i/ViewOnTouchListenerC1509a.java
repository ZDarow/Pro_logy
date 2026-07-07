package p140i;

/* renamed from: i.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1509a implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f6222a;

    /* renamed from: b */
    public final int f6223b;

    /* renamed from: c */
    public final int f6224c;

    /* renamed from: d */
    public final android.view.View f6225d;

    /* renamed from: e */
    public p145j.RunnableC1627F f6226e;

    /* renamed from: f */
    public p145j.RunnableC1627F f6227f;

    /* renamed from: g */
    public boolean f6228g;

    /* renamed from: h */
    public int f6229h;

    /* renamed from: i */
    public final int[] f6230i;

    /* renamed from: j */
    public final /* synthetic */ int f6231j;

    /* renamed from: k */
    public final /* synthetic */ android.view.View f6232k;

    public ViewOnTouchListenerC1509a(android.view.View view) {
        this.f6230i = new int[2];
        this.f6225d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f6222a = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.f6223b = tapTimeout;
        this.f6224c = (android.view.ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m3335a() {
        p145j.RunnableC1627F runnableC1627F = this.f6227f;
        android.view.View view = this.f6225d;
        if (runnableC1627F != null) {
            view.removeCallbacks(runnableC1627F);
        }
        p145j.RunnableC1627F runnableC1627F2 = this.f6226e;
        if (runnableC1627F2 != null) {
            view.removeCallbacks(runnableC1627F2);
        }
    }

    /* renamed from: b */
    public final p140i.AbstractC1519k m3336b() {
        p145j.C1657f c1657f;
        switch (this.f6231j) {
            case 0:
                p140i.AbstractC1510b abstractC1510b = ((androidx.appcompat.view.menu.ActionMenuItemView) this.f6232k).f3870v;
                if (abstractC1510b == null || (c1657f = ((p145j.C1659g) abstractC1510b).f6906a.f6933D) == null) {
                    return null;
                }
                return c1657f.m3390a();
            default:
                p145j.C1657f c1657f2 = ((p145j.C1661h) this.f6232k).f6912n.f6932C;
                if (c1657f2 == null) {
                    return null;
                }
                return c1657f2.m3390a();
        }
    }

    /* renamed from: c */
    public final boolean m3337c() {
        p140i.AbstractC1519k m3336b;
        switch (this.f6231j) {
            case 0:
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) this.f6232k;
                p140i.InterfaceC1516h interfaceC1516h = actionMenuItemView.f3868t;
                return interfaceC1516h != null && interfaceC1516h.mo2280a(actionMenuItemView.f3865q) && (m3336b = m3336b()) != null && m3336b.mo3345i();
            default:
                ((p145j.C1661h) this.f6232k).f6912n.m3605k();
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
        throw new UnsupportedOperationException("Method not decompiled: p140i.ViewOnTouchListenerC1509a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f6228g = false;
        this.f6229h = -1;
        p145j.RunnableC1627F runnableC1627F = this.f6226e;
        if (runnableC1627F != null) {
            this.f6225d.removeCallbacks(runnableC1627F);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1509a(androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView) {
        this((android.view.View) actionMenuItemView);
        this.f6231j = 0;
        this.f6232k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1509a(p145j.C1661h c1661h, p145j.C1661h c1661h2) {
        this(c1661h2);
        this.f6231j = 1;
        this.f6232k = c1661h;
    }
}
