package p145j;

/* renamed from: j.o0 */
/* loaded from: classes.dex */
public final class C1676o0 implements p140i.InterfaceC1523o {

    /* renamed from: l */
    public p140i.MenuC1517i f6984l;

    /* renamed from: m */
    public p140i.MenuItemC1518j f6985m;

    /* renamed from: n */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f6986n;

    public C1676o0(androidx.appcompat.widget.Toolbar toolbar) {
        this.f6986n = toolbar;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: a */
    public final void mo3340a(p140i.MenuC1517i menuC1517i, boolean z4) {
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: b */
    public final boolean mo3387b(p140i.MenuItemC1518j menuItemC1518j) {
        androidx.appcompat.widget.Toolbar toolbar = this.f6986n;
        android.view.KeyEvent.Callback callback = toolbar.f4073t;
        if (callback instanceof p135h.InterfaceC1480a) {
            androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) ((p135h.InterfaceC1480a) callback);
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f3959A;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f3991j0 = "";
            searchView.clearFocus();
            searchView.m2308u(true);
            searchAutoComplete.setImeOptions(searchView.f3993l0);
            searchView.f3992k0 = false;
        }
        toolbar.removeView(toolbar.f4073t);
        toolbar.removeView(toolbar.f4072s);
        toolbar.f4073t = null;
        java.util.ArrayList arrayList = toolbar.f4058P;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((android.view.View) arrayList.get(size));
        }
        arrayList.clear();
        this.f6985m = null;
        toolbar.requestLayout();
        menuItemC1518j.f6293B = false;
        menuItemC1518j.f6307n.m3373o(false);
        return true;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: d */
    public final boolean mo3342d() {
        return false;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: e */
    public final void mo3388e(android.content.Context context, p140i.MenuC1517i menuC1517i) {
        p140i.MenuItemC1518j menuItemC1518j;
        p140i.MenuC1517i menuC1517i2 = this.f6984l;
        if (menuC1517i2 != null && (menuItemC1518j = this.f6985m) != null) {
            menuC1517i2.mo3362d(menuItemC1518j);
        }
        this.f6984l = menuC1517i;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: g */
    public final boolean mo3389g(p140i.MenuItemC1518j menuItemC1518j) {
        androidx.appcompat.widget.Toolbar toolbar = this.f6986n;
        toolbar.m2319c();
        android.view.ViewParent parent = toolbar.f4072s.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.f4072s);
            }
            toolbar.addView(toolbar.f4072s);
        }
        android.view.View view = menuItemC1518j.f6319z;
        if (view == null) {
            view = null;
        }
        toolbar.f4073t = view;
        this.f6985m = menuItemC1518j;
        android.view.ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.f4073t);
            }
            p145j.C1678p0 m2313g = androidx.appcompat.widget.Toolbar.m2313g();
            m2313g.f6989a = (toolbar.f4078y & 112) | 8388611;
            m2313g.f6990b = 2;
            toolbar.f4073t.setLayoutParams(m2313g);
            toolbar.addView(toolbar.f4073t);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((p145j.C1678p0) childAt.getLayoutParams()).f6990b != 2 && childAt != toolbar.f4065l) {
                toolbar.removeViewAt(childCount);
                toolbar.f4058P.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC1518j.f6293B = true;
        menuItemC1518j.f6307n.m3373o(false);
        android.view.KeyEvent.Callback callback = toolbar.f4073t;
        if (callback instanceof p135h.InterfaceC1480a) {
            androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) ((p135h.InterfaceC1480a) callback);
            if (!searchView.f3992k0) {
                searchView.f3992k0 = true;
                androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f3959A;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f3993l0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: h */
    public final void mo3344h() {
        if (this.f6985m != null) {
            p140i.MenuC1517i menuC1517i = this.f6984l;
            if (menuC1517i != null) {
                int size = menuC1517i.f6277f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f6984l.getItem(i4) == this.f6985m) {
                        return;
                    }
                }
            }
            mo3387b(this.f6985m);
        }
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: j */
    public final boolean mo3346j(p140i.SubMenuC1527s subMenuC1527s) {
        return false;
    }
}
