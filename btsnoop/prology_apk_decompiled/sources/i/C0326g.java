package i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326g extends BaseAdapter {

    /* renamed from: l, reason: collision with root package name */
    public final MenuC0328i f6042l;

    /* renamed from: m, reason: collision with root package name */
    public int f6043m = -1;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6044n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6045o;

    /* renamed from: p, reason: collision with root package name */
    public final LayoutInflater f6046p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6047q;

    public C0326g(MenuC0328i menuC0328i, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f6045o = z4;
        this.f6046p = layoutInflater;
        this.f6042l = menuC0328i;
        this.f6047q = i4;
        a();
    }

    public final void a() {
        MenuC0328i menuC0328i = this.f6042l;
        MenuItemC0329j menuItemC0329j = menuC0328i.s;
        if (menuItemC0329j != null) {
            menuC0328i.i();
            ArrayList arrayList = menuC0328i.f6058j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((MenuItemC0329j) arrayList.get(i4)) == menuItemC0329j) {
                    this.f6043m = i4;
                    return;
                }
            }
        }
        this.f6043m = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC0329j getItem(int i4) {
        ArrayList k4;
        MenuC0328i menuC0328i = this.f6042l;
        if (this.f6045o) {
            menuC0328i.i();
            k4 = menuC0328i.f6058j;
        } else {
            k4 = menuC0328i.k();
        }
        int i5 = this.f6043m;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (MenuItemC0329j) k4.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k4;
        MenuC0328i menuC0328i = this.f6042l;
        if (this.f6045o) {
            menuC0328i.i();
            k4 = menuC0328i.f6058j;
        } else {
            k4 = menuC0328i.k();
        }
        return this.f6043m < 0 ? k4.size() : k4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f6046p.inflate(this.f6047q, viewGroup, false);
        }
        int i5 = getItem(i4).f6071b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f6071b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f6042l.l() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        InterfaceC0335p interfaceC0335p = (InterfaceC0335p) view;
        if (this.f6044n) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0335p.c(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
