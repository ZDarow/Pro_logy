package p140i;

/* renamed from: i.m */
/* loaded from: classes.dex */
public class C1521m {

    /* renamed from: a */
    public final android.content.Context f6322a;

    /* renamed from: b */
    public final p140i.MenuC1517i f6323b;

    /* renamed from: c */
    public final boolean f6324c;

    /* renamed from: d */
    public final int f6325d;

    /* renamed from: e */
    public android.view.View f6326e;

    /* renamed from: g */
    public boolean f6328g;

    /* renamed from: h */
    public p140i.InterfaceC1522n f6329h;

    /* renamed from: i */
    public p140i.AbstractC1519k f6330i;

    /* renamed from: j */
    public p140i.C1520l f6331j;

    /* renamed from: f */
    public int f6327f = 8388611;

    /* renamed from: k */
    public final p140i.C1520l f6332k = new p140i.C1520l(this);

    public C1521m(int i4, android.content.Context context, android.view.View view, p140i.MenuC1517i menuC1517i, boolean z4) {
        this.f6322a = context;
        this.f6323b = menuC1517i;
        this.f6326e = view;
        this.f6324c = z4;
        this.f6325d = i4;
    }

    /* renamed from: a */
    public final p140i.AbstractC1519k m3390a() {
        p140i.AbstractC1519k viewOnKeyListenerC1526r;
        if (this.f6330i == null) {
            android.content.Context context = this.f6322a;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            if (java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(com.prology.R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1526r = new p140i.ViewOnKeyListenerC1514f(context, this.f6326e, this.f6325d, this.f6324c);
            } else {
                android.view.View view = this.f6326e;
                android.content.Context context2 = this.f6322a;
                boolean z4 = this.f6324c;
                viewOnKeyListenerC1526r = new p140i.ViewOnKeyListenerC1526r(this.f6325d, context2, view, this.f6323b, z4);
            }
            viewOnKeyListenerC1526r.mo3348l(this.f6323b);
            viewOnKeyListenerC1526r.mo3353r(this.f6332k);
            viewOnKeyListenerC1526r.mo3349n(this.f6326e);
            viewOnKeyListenerC1526r.mo3343f(this.f6329h);
            viewOnKeyListenerC1526r.mo3350o(this.f6328g);
            viewOnKeyListenerC1526r.mo3351p(this.f6327f);
            this.f6330i = viewOnKeyListenerC1526r;
        }
        return this.f6330i;
    }

    /* renamed from: b */
    public final boolean m3391b() {
        p140i.AbstractC1519k abstractC1519k = this.f6330i;
        return abstractC1519k != null && abstractC1519k.mo3345i();
    }

    /* renamed from: c */
    public void mo3392c() {
        this.f6330i = null;
        p140i.C1520l c1520l = this.f6331j;
        if (c1520l != null) {
            c1520l.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m3393d(int i4, int i5, boolean z4, boolean z5) {
        p140i.AbstractC1519k m3390a = m3390a();
        m3390a.mo3354s(z5);
        if (z4) {
            int i6 = this.f6327f;
            android.view.View view = this.f6326e;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            if ((android.view.Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f6326e.getWidth();
            }
            m3390a.mo3352q(i4);
            m3390a.mo3355t(i5);
            int i7 = (int) ((this.f6322a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m3390a.f6320l = new android.graphics.Rect(i4 - i7, i5 - i7, i4 + i7, i5 + i7);
        }
        m3390a.mo3341c();
    }
}
