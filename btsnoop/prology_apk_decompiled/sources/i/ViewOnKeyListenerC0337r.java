package i;

import C.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.prology.R;
import j.M;
import j.O;
import j.P;
import java.lang.reflect.Field;

/* renamed from: i.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0337r extends AbstractC0330k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f6107A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6108B;

    /* renamed from: C, reason: collision with root package name */
    public int f6109C;

    /* renamed from: D, reason: collision with root package name */
    public int f6110D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6111E;

    /* renamed from: m, reason: collision with root package name */
    public final Context f6112m;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0328i f6113n;

    /* renamed from: o, reason: collision with root package name */
    public final C0326g f6114o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6115p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6116q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6117r;
    public final P s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0322c f6118t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0323d f6119u;

    /* renamed from: v, reason: collision with root package name */
    public C0331l f6120v;
    public View w;

    /* renamed from: x, reason: collision with root package name */
    public View f6121x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0333n f6122y;

    /* renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f6123z;

    /* JADX WARN: Type inference failed for: r6v1, types: [j.M, j.P] */
    public ViewOnKeyListenerC0337r(int i4, Context context, View view, MenuC0328i menuC0328i, boolean z4) {
        int i5 = 1;
        this.f6118t = new ViewTreeObserverOnGlobalLayoutListenerC0322c(this, i5);
        this.f6119u = new ViewOnAttachStateChangeListenerC0323d(this, i5);
        this.f6112m = context;
        this.f6113n = menuC0328i;
        this.f6115p = z4;
        this.f6114o = new C0326g(menuC0328i, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f6117r = i4;
        Resources resources = context.getResources();
        this.f6116q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.w = view;
        this.s = new M(context, i4);
        menuC0328i.b(this, context);
    }

    @Override // i.InterfaceC0334o
    public final void a(MenuC0328i menuC0328i, boolean z4) {
        if (menuC0328i != this.f6113n) {
            return;
        }
        dismiss();
        InterfaceC0333n interfaceC0333n = this.f6122y;
        if (interfaceC0333n != null) {
            interfaceC0333n.a(menuC0328i, z4);
        }
    }

    @Override // i.InterfaceC0336q
    public final void c() {
        View view;
        if (i()) {
            return;
        }
        if (this.f6107A || (view = this.w) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f6121x = view;
        P p2 = this.s;
        p2.f6597G.setOnDismissListener(this);
        p2.f6608x = this;
        p2.f6596F = true;
        p2.f6597G.setFocusable(true);
        View view2 = this.f6121x;
        boolean z4 = this.f6123z == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f6123z = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f6118t);
        }
        view2.addOnAttachStateChangeListener(this.f6119u);
        p2.w = view2;
        p2.f6606u = this.f6110D;
        boolean z5 = this.f6108B;
        Context context = this.f6112m;
        C0326g c0326g = this.f6114o;
        if (!z5) {
            this.f6109C = AbstractC0330k.m(c0326g, context, this.f6116q);
            this.f6108B = true;
        }
        int i4 = this.f6109C;
        Drawable background = p2.f6597G.getBackground();
        if (background != null) {
            Rect rect = p2.f6594D;
            background.getPadding(rect);
            p2.f6601o = rect.left + rect.right + i4;
        } else {
            p2.f6601o = i4;
        }
        p2.f6597G.setInputMethodMode(2);
        Rect rect2 = this.f6094l;
        p2.f6595E = rect2 != null ? new Rect(rect2) : null;
        p2.c();
        O o2 = p2.f6600n;
        o2.setOnKeyListener(this);
        if (this.f6111E) {
            MenuC0328i menuC0328i = this.f6113n;
            if (menuC0328i.f6060l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0328i.f6060l);
                }
                frameLayout.setEnabled(false);
                o2.addHeaderView(frameLayout, null, false);
            }
        }
        p2.a(c0326g);
        p2.c();
    }

    @Override // i.InterfaceC0334o
    public final boolean d() {
        return false;
    }

    @Override // i.InterfaceC0336q
    public final void dismiss() {
        if (i()) {
            this.s.dismiss();
        }
    }

    @Override // i.InterfaceC0334o
    public final void f(InterfaceC0333n interfaceC0333n) {
        this.f6122y = interfaceC0333n;
    }

    @Override // i.InterfaceC0334o
    public final void h() {
        this.f6108B = false;
        C0326g c0326g = this.f6114o;
        if (c0326g != null) {
            c0326g.notifyDataSetChanged();
        }
    }

    @Override // i.InterfaceC0336q
    public final boolean i() {
        return !this.f6107A && this.s.f6597G.isShowing();
    }

    @Override // i.InterfaceC0334o
    public final boolean j(SubMenuC0338s subMenuC0338s) {
        if (subMenuC0338s.hasVisibleItems()) {
            C0332m c0332m = new C0332m(this.f6117r, this.f6112m, this.f6121x, subMenuC0338s, this.f6115p);
            InterfaceC0333n interfaceC0333n = this.f6122y;
            c0332m.f6103h = interfaceC0333n;
            AbstractC0330k abstractC0330k = c0332m.f6104i;
            if (abstractC0330k != null) {
                abstractC0330k.f(interfaceC0333n);
            }
            boolean u4 = AbstractC0330k.u(subMenuC0338s);
            c0332m.f6102g = u4;
            AbstractC0330k abstractC0330k2 = c0332m.f6104i;
            if (abstractC0330k2 != null) {
                abstractC0330k2.o(u4);
            }
            c0332m.f6105j = this.f6120v;
            this.f6120v = null;
            this.f6113n.c(false);
            P p2 = this.s;
            int i4 = p2.f6602p;
            int i5 = !p2.f6604r ? 0 : p2.f6603q;
            int i6 = this.f6110D;
            View view = this.w;
            Field field = x.f330a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 += this.w.getWidth();
            }
            if (!c0332m.b()) {
                if (c0332m.f6100e != null) {
                    c0332m.d(i4, i5, true, true);
                }
            }
            InterfaceC0333n interfaceC0333n2 = this.f6122y;
            if (interfaceC0333n2 != null) {
                interfaceC0333n2.h(subMenuC0338s);
            }
            return true;
        }
        return false;
    }

    @Override // i.InterfaceC0336q
    public final ListView k() {
        return this.s.f6600n;
    }

    @Override // i.AbstractC0330k
    public final void l(MenuC0328i menuC0328i) {
    }

    @Override // i.AbstractC0330k
    public final void n(View view) {
        this.w = view;
    }

    @Override // i.AbstractC0330k
    public final void o(boolean z4) {
        this.f6114o.f6044n = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6107A = true;
        this.f6113n.c(true);
        ViewTreeObserver viewTreeObserver = this.f6123z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f6123z = this.f6121x.getViewTreeObserver();
            }
            this.f6123z.removeGlobalOnLayoutListener(this.f6118t);
            this.f6123z = null;
        }
        this.f6121x.removeOnAttachStateChangeListener(this.f6119u);
        C0331l c0331l = this.f6120v;
        if (c0331l != null) {
            c0331l.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i.AbstractC0330k
    public final void p(int i4) {
        this.f6110D = i4;
    }

    @Override // i.AbstractC0330k
    public final void q(int i4) {
        this.s.f6602p = i4;
    }

    @Override // i.AbstractC0330k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f6120v = (C0331l) onDismissListener;
    }

    @Override // i.AbstractC0330k
    public final void s(boolean z4) {
        this.f6111E = z4;
    }

    @Override // i.AbstractC0330k
    public final void t(int i4) {
        P p2 = this.s;
        p2.f6603q = i4;
        p2.f6604r = true;
    }
}
