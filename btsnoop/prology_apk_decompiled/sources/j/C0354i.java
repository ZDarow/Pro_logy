package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.prology.R;
import i.AbstractC0330k;
import i.InterfaceC0333n;
import i.InterfaceC0334o;
import i.InterfaceC0335p;
import i.MenuC0328i;
import i.MenuItemC0329j;
import i.SubMenuC0338s;
import java.util.ArrayList;

/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354i implements InterfaceC0334o {

    /* renamed from: A, reason: collision with root package name */
    public boolean f6674A;

    /* renamed from: C, reason: collision with root package name */
    public C0351f f6676C;

    /* renamed from: D, reason: collision with root package name */
    public C0351f f6677D;

    /* renamed from: E, reason: collision with root package name */
    public N1.q f6678E;

    /* renamed from: F, reason: collision with root package name */
    public C0352g f6679F;

    /* renamed from: l, reason: collision with root package name */
    public final Context f6681l;

    /* renamed from: m, reason: collision with root package name */
    public Context f6682m;

    /* renamed from: n, reason: collision with root package name */
    public MenuC0328i f6683n;

    /* renamed from: o, reason: collision with root package name */
    public final LayoutInflater f6684o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0333n f6685p;

    /* renamed from: r, reason: collision with root package name */
    public ActionMenuView f6687r;
    public C0353h s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f6688t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6689u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6690v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public int f6691x;

    /* renamed from: y, reason: collision with root package name */
    public int f6692y;

    /* renamed from: z, reason: collision with root package name */
    public int f6693z;

    /* renamed from: q, reason: collision with root package name */
    public final int f6686q = R.layout.abc_action_menu_item_layout;

    /* renamed from: B, reason: collision with root package name */
    public final SparseBooleanArray f6675B = new SparseBooleanArray();

    /* renamed from: G, reason: collision with root package name */
    public final f2.Y f6680G = new f2.Y(9, this);

    public C0354i(Context context) {
        this.f6681l = context;
        this.f6684o = LayoutInflater.from(context);
    }

    @Override // i.InterfaceC0334o
    public final void a(MenuC0328i menuC0328i, boolean z4) {
        i();
        C0351f c0351f = this.f6677D;
        if (c0351f != null && c0351f.b()) {
            c0351f.f6104i.dismiss();
        }
        InterfaceC0333n interfaceC0333n = this.f6685p;
        if (interfaceC0333n != null) {
            interfaceC0333n.a(menuC0328i, z4);
        }
    }

    @Override // i.InterfaceC0334o
    public final boolean b(MenuItemC0329j menuItemC0329j) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View c(MenuItemC0329j menuItemC0329j, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC0329j.f6093z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || menuItemC0329j.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0335p ? (InterfaceC0335p) view : (InterfaceC0335p) this.f6684o.inflate(this.f6686q, (ViewGroup) actionMenuView, false);
            actionMenuItemView.c(menuItemC0329j);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f6687r);
            if (this.f6679F == null) {
                this.f6679F = new C0352g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f6679F);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(menuItemC0329j.f6069B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0356k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // i.InterfaceC0334o
    public final boolean d() {
        int i4;
        ArrayList arrayList;
        int i5;
        boolean z4;
        MenuC0328i menuC0328i = this.f6683n;
        if (menuC0328i != null) {
            arrayList = menuC0328i.k();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i6 = this.f6693z;
        int i7 = this.f6692y;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f6687r;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z4 = true;
            if (i8 >= i4) {
                break;
            }
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i8);
            int i11 = menuItemC0329j.f6092y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z5 = true;
            }
            if (this.f6674A && menuItemC0329j.f6069B) {
                i6 = 0;
            }
            i8++;
        }
        if (this.f6690v && (z5 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = this.f6675B;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i4) {
            MenuItemC0329j menuItemC0329j2 = (MenuItemC0329j) arrayList.get(i13);
            int i15 = menuItemC0329j2.f6092y;
            boolean z6 = (i15 & 2) == i5 ? z4 : false;
            int i16 = menuItemC0329j2.f6071b;
            if (z6) {
                View c4 = c(menuItemC0329j2, null, actionMenuView);
                c4.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c4.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z4);
                }
                menuItemC0329j2.f(z4);
            } else if ((i15 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i16);
                boolean z8 = ((i12 > 0 || z7) && i7 > 0) ? z4 : false;
                if (z8) {
                    View c5 = c(menuItemC0329j2, null, actionMenuView);
                    c5.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c5.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z8 &= i7 + i14 > 0;
                }
                if (z8 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z7) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        MenuItemC0329j menuItemC0329j3 = (MenuItemC0329j) arrayList.get(i17);
                        if (menuItemC0329j3.f6071b == i16) {
                            if (menuItemC0329j3.d()) {
                                i12++;
                            }
                            menuItemC0329j3.f(false);
                        }
                    }
                }
                if (z8) {
                    i12--;
                }
                menuItemC0329j2.f(z8);
            } else {
                menuItemC0329j2.f(false);
                i13++;
                i5 = 2;
                z4 = true;
            }
            i13++;
            i5 = 2;
            z4 = true;
        }
        return z4;
    }

    @Override // i.InterfaceC0334o
    public final void e(Context context, MenuC0328i menuC0328i) {
        this.f6682m = context;
        LayoutInflater.from(context);
        this.f6683n = menuC0328i;
        Resources resources = context.getResources();
        if (!this.w) {
            this.f6690v = true;
        }
        int i4 = 2;
        this.f6691x = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i4 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i4 = 4;
        } else if (i5 >= 360) {
            i4 = 3;
        }
        this.f6693z = i4;
        int i7 = this.f6691x;
        if (this.f6690v) {
            if (this.s == null) {
                C0353h c0353h = new C0353h(this, this.f6681l);
                this.s = c0353h;
                if (this.f6689u) {
                    c0353h.setImageDrawable(this.f6688t);
                    this.f6688t = null;
                    this.f6689u = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.s.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.s.getMeasuredWidth();
        } else {
            this.s = null;
        }
        this.f6692y = i7;
        float f4 = resources.getDisplayMetrics().density;
    }

    @Override // i.InterfaceC0334o
    public final void f(InterfaceC0333n interfaceC0333n) {
        throw null;
    }

    @Override // i.InterfaceC0334o
    public final boolean g(MenuItemC0329j menuItemC0329j) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.InterfaceC0334o
    public final void h() {
        int i4;
        ActionMenuView actionMenuView = this.f6687r;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (actionMenuView != null) {
            MenuC0328i menuC0328i = this.f6683n;
            if (menuC0328i != null) {
                menuC0328i.i();
                ArrayList k4 = this.f6683n.k();
                int size = k4.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    MenuItemC0329j menuItemC0329j = (MenuItemC0329j) k4.get(i5);
                    if (menuItemC0329j.d()) {
                        View childAt = actionMenuView.getChildAt(i4);
                        MenuItemC0329j itemData = childAt instanceof InterfaceC0335p ? ((InterfaceC0335p) childAt).getItemData() : null;
                        View c4 = c(menuItemC0329j, childAt, actionMenuView);
                        if (menuItemC0329j != itemData) {
                            c4.setPressed(false);
                            c4.jumpDrawablesToCurrentState();
                        }
                        if (c4 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c4.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c4);
                            }
                            this.f6687r.addView(c4, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i4) == this.s) {
                    i4++;
                } else {
                    actionMenuView.removeViewAt(i4);
                }
            }
        }
        this.f6687r.requestLayout();
        MenuC0328i menuC0328i2 = this.f6683n;
        if (menuC0328i2 != null) {
            menuC0328i2.i();
            ArrayList arrayList2 = menuC0328i2.f6057i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((MenuItemC0329j) arrayList2.get(i6)).getClass();
            }
        }
        MenuC0328i menuC0328i3 = this.f6683n;
        if (menuC0328i3 != null) {
            menuC0328i3.i();
            arrayList = menuC0328i3.f6058j;
        }
        if (this.f6690v && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((MenuItemC0329j) arrayList.get(0)).f6069B;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.s == null) {
                this.s = new C0353h(this, this.f6681l);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.s.getParent();
            if (viewGroup2 != this.f6687r) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.s);
                }
                ActionMenuView actionMenuView2 = this.f6687r;
                C0353h c0353h = this.s;
                actionMenuView2.getClass();
                C0356k h4 = ActionMenuView.h();
                h4.f6701a = true;
                actionMenuView2.addView(c0353h, h4);
            }
        } else {
            C0353h c0353h2 = this.s;
            if (c0353h2 != null) {
                ViewParent parent = c0353h2.getParent();
                ActionMenuView actionMenuView3 = this.f6687r;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.s);
                }
            }
        }
        this.f6687r.setOverflowReserved(this.f6690v);
    }

    public final boolean i() {
        ActionMenuView actionMenuView;
        N1.q qVar = this.f6678E;
        if (qVar != null && (actionMenuView = this.f6687r) != null) {
            actionMenuView.removeCallbacks(qVar);
            this.f6678E = null;
            return true;
        }
        C0351f c0351f = this.f6676C;
        if (c0351f == null) {
            return false;
        }
        if (c0351f.b()) {
            c0351f.f6104i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.InterfaceC0334o
    public final boolean j(SubMenuC0338s subMenuC0338s) {
        boolean z4;
        if (!subMenuC0338s.hasVisibleItems()) {
            return false;
        }
        SubMenuC0338s subMenuC0338s2 = subMenuC0338s;
        while (true) {
            MenuC0328i menuC0328i = subMenuC0338s2.f6124v;
            if (menuC0328i == this.f6683n) {
                break;
            }
            subMenuC0338s2 = (SubMenuC0338s) menuC0328i;
        }
        ActionMenuView actionMenuView = this.f6687r;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i4);
                if ((childAt instanceof InterfaceC0335p) && ((InterfaceC0335p) childAt).getItemData() == subMenuC0338s2.w) {
                    view = childAt;
                    break;
                }
                i4++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0338s.w.getClass();
        int size = subMenuC0338s.f6054f.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = subMenuC0338s.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i5++;
        }
        C0351f c0351f = new C0351f(this, this.f6682m, subMenuC0338s, view);
        this.f6677D = c0351f;
        c0351f.f6102g = z4;
        AbstractC0330k abstractC0330k = c0351f.f6104i;
        if (abstractC0330k != null) {
            abstractC0330k.o(z4);
        }
        C0351f c0351f2 = this.f6677D;
        if (!c0351f2.b()) {
            if (c0351f2.f6100e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0351f2.d(0, 0, false, false);
        }
        InterfaceC0333n interfaceC0333n = this.f6685p;
        if (interfaceC0333n != null) {
            interfaceC0333n.h(subMenuC0338s);
        }
        return true;
    }

    public final boolean k() {
        MenuC0328i menuC0328i;
        if (!this.f6690v) {
            return false;
        }
        C0351f c0351f = this.f6676C;
        if ((c0351f != null && c0351f.b()) || (menuC0328i = this.f6683n) == null || this.f6687r == null || this.f6678E != null) {
            return false;
        }
        menuC0328i.i();
        if (menuC0328i.f6058j.isEmpty()) {
            return false;
        }
        N1.q qVar = new N1.q(8, this, new C0351f(this, this.f6682m, this.f6683n, this.s));
        this.f6678E = qVar;
        this.f6687r.post(qVar);
        return true;
    }
}
