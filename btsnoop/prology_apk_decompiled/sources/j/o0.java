package j;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import h.InterfaceC0312a;
import i.InterfaceC0334o;
import i.MenuC0328i;
import i.MenuItemC0329j;
import i.SubMenuC0338s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC0334o {

    /* renamed from: l, reason: collision with root package name */
    public MenuC0328i f6726l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItemC0329j f6727m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6728n;

    public o0(Toolbar toolbar) {
        this.f6728n = toolbar;
    }

    @Override // i.InterfaceC0334o
    public final void a(MenuC0328i menuC0328i, boolean z4) {
    }

    @Override // i.InterfaceC0334o
    public final boolean b(MenuItemC0329j menuItemC0329j) {
        Toolbar toolbar = this.f6728n;
        KeyEvent.Callback callback = toolbar.f3930t;
        if (callback instanceof InterfaceC0312a) {
            SearchView searchView = (SearchView) ((InterfaceC0312a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3822A;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f3853j0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f3855l0);
            searchView.f3854k0 = false;
        }
        toolbar.removeView(toolbar.f3930t);
        toolbar.removeView(toolbar.s);
        toolbar.f3930t = null;
        ArrayList arrayList = toolbar.f3916P;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f6727m = null;
        toolbar.requestLayout();
        menuItemC0329j.f6069B = false;
        menuItemC0329j.f6083n.o(false);
        return true;
    }

    @Override // i.InterfaceC0334o
    public final boolean d() {
        return false;
    }

    @Override // i.InterfaceC0334o
    public final void e(Context context, MenuC0328i menuC0328i) {
        MenuItemC0329j menuItemC0329j;
        MenuC0328i menuC0328i2 = this.f6726l;
        if (menuC0328i2 != null && (menuItemC0329j = this.f6727m) != null) {
            menuC0328i2.d(menuItemC0329j);
        }
        this.f6726l = menuC0328i;
    }

    @Override // i.InterfaceC0334o
    public final boolean g(MenuItemC0329j menuItemC0329j) {
        Toolbar toolbar = this.f6728n;
        toolbar.c();
        ViewParent parent = toolbar.s.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.s);
            }
            toolbar.addView(toolbar.s);
        }
        View view = menuItemC0329j.f6093z;
        if (view == null) {
            view = null;
        }
        toolbar.f3930t = view;
        this.f6727m = menuItemC0329j;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3930t);
            }
            p0 g4 = Toolbar.g();
            g4.f6731a = (toolbar.f3934y & 112) | 8388611;
            g4.f6732b = 2;
            toolbar.f3930t.setLayoutParams(g4);
            toolbar.addView(toolbar.f3930t);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((p0) childAt.getLayoutParams()).f6732b != 2 && childAt != toolbar.f3923l) {
                toolbar.removeViewAt(childCount);
                toolbar.f3916P.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0329j.f6069B = true;
        menuItemC0329j.f6083n.o(false);
        KeyEvent.Callback callback = toolbar.f3930t;
        if (callback instanceof InterfaceC0312a) {
            SearchView searchView = (SearchView) ((InterfaceC0312a) callback);
            if (!searchView.f3854k0) {
                searchView.f3854k0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f3822A;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f3855l0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // i.InterfaceC0334o
    public final void h() {
        if (this.f6727m != null) {
            MenuC0328i menuC0328i = this.f6726l;
            if (menuC0328i != null) {
                int size = menuC0328i.f6054f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f6726l.getItem(i4) == this.f6727m) {
                        return;
                    }
                }
            }
            b(this.f6727m);
        }
    }

    @Override // i.InterfaceC0334o
    public final boolean j(SubMenuC0338s subMenuC0338s) {
        return false;
    }
}
