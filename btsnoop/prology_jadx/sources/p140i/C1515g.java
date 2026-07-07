package p140i;

/* renamed from: i.g */
/* loaded from: classes.dex */
public final class C1515g extends android.widget.BaseAdapter {

    /* renamed from: l */
    public final p140i.MenuC1517i f6265l;

    /* renamed from: m */
    public int f6266m = -1;

    /* renamed from: n */
    public boolean f6267n;

    /* renamed from: o */
    public final boolean f6268o;

    /* renamed from: p */
    public final android.view.LayoutInflater f6269p;

    /* renamed from: q */
    public final int f6270q;

    public C1515g(p140i.MenuC1517i menuC1517i, android.view.LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f6268o = z4;
        this.f6269p = layoutInflater;
        this.f6265l = menuC1517i;
        this.f6270q = i4;
        m3357a();
    }

    /* renamed from: a */
    public final void m3357a() {
        p140i.MenuC1517i menuC1517i = this.f6265l;
        p140i.MenuItemC1518j menuItemC1518j = menuC1517i.f6290s;
        if (menuItemC1518j != null) {
            menuC1517i.m3367i();
            java.util.ArrayList arrayList = menuC1517i.f6281j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((p140i.MenuItemC1518j) arrayList.get(i4)) == menuItemC1518j) {
                    this.f6266m = i4;
                    return;
                }
            }
        }
        this.f6266m = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p140i.MenuItemC1518j getItem(int i4) {
        java.util.ArrayList m3369k;
        p140i.MenuC1517i menuC1517i = this.f6265l;
        if (this.f6268o) {
            menuC1517i.m3367i();
            m3369k = menuC1517i.f6281j;
        } else {
            m3369k = menuC1517i.m3369k();
        }
        int i5 = this.f6266m;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (p140i.MenuItemC1518j) m3369k.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList m3369k;
        p140i.MenuC1517i menuC1517i = this.f6265l;
        if (this.f6268o) {
            menuC1517i.m3367i();
            m3369k = menuC1517i.f6281j;
        } else {
            m3369k = menuC1517i.m3369k();
        }
        return this.f6266m < 0 ? m3369k.size() : m3369k.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i4, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f6269p.inflate(this.f6270q, viewGroup, false);
        }
        int i5 = getItem(i4).f6295b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f6295b : i5;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        if (this.f6265l.mo3370l() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        p140i.InterfaceC1524p interfaceC1524p = (p140i.InterfaceC1524p) view;
        if (this.f6267n) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1524p.mo2277c(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3357a();
        super.notifyDataSetChanged();
    }
}
