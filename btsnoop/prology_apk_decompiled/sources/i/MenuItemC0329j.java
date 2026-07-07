package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import f.AbstractC0266a;
import java.util.ArrayList;

/* renamed from: i.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC0329j implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f6068A;

    /* renamed from: a, reason: collision with root package name */
    public final int f6070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6073d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f6074e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f6075f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f6076g;

    /* renamed from: h, reason: collision with root package name */
    public char f6077h;

    /* renamed from: j, reason: collision with root package name */
    public char f6079j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f6081l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0328i f6083n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0338s f6084o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f6085p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f6086q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f6087r;

    /* renamed from: z, reason: collision with root package name */
    public View f6093z;

    /* renamed from: i, reason: collision with root package name */
    public int f6078i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f6080k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f6082m = 0;
    public ColorStateList s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f6088t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6089u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6090v = false;
    public boolean w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f6091x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6069B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f6092y = 0;

    public MenuItemC0329j(MenuC0328i menuC0328i, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f6083n = menuC0328i;
        this.f6070a = i5;
        this.f6071b = i4;
        this.f6072c = i6;
        this.f6073d = i7;
        this.f6074e = charSequence;
    }

    public static void a(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.w && (this.f6089u || this.f6090v)) {
            drawable = drawable.mutate();
            if (this.f6089u) {
                drawable.setTintList(this.s);
            }
            if (this.f6090v) {
                drawable.setTintMode(this.f6088t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f6092y & 8) == 0 || this.f6093z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6092y & 8) == 0) {
            return false;
        }
        if (this.f6093z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6068A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6083n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f6091x & 32) == 32;
    }

    public final MenuItemC0329j e(CharSequence charSequence) {
        this.f6086q = charSequence;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6068A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6083n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.f6091x |= 32;
        } else {
            this.f6091x &= -33;
        }
    }

    public final MenuItemC0329j g(CharSequence charSequence) {
        this.f6087r = charSequence;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6093z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6080k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6079j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6086q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6071b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6081l;
        if (drawable != null) {
            return b(drawable);
        }
        int i4 = this.f6082m;
        if (i4 == 0) {
            return null;
        }
        Drawable a4 = AbstractC0266a.a(this.f6083n.f6049a, i4);
        this.f6082m = 0;
        this.f6081l = a4;
        return b(a4);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6088t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6076g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6070a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6078i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6077h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6072c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6084o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6074e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6075f;
        return charSequence != null ? charSequence : this.f6074e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6087r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6084o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6069B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6091x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6091x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6091x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6091x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f6093z = view;
        if (view != null && view.getId() == -1 && (i4 = this.f6070a) > 0) {
            view.setId(i4);
        }
        MenuC0328i menuC0328i = this.f6083n;
        menuC0328i.f6059k = true;
        menuC0328i.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f6079j == c4) {
            return this;
        }
        this.f6079j = Character.toLowerCase(c4);
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i4 = this.f6091x;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.f6091x = i5;
        if (i4 != i5) {
            this.f6083n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i4 = this.f6091x;
        if ((i4 & 4) != 0) {
            MenuC0328i menuC0328i = this.f6083n;
            menuC0328i.getClass();
            ArrayList arrayList = menuC0328i.f6054f;
            int size = arrayList.size();
            menuC0328i.s();
            for (int i5 = 0; i5 < size; i5++) {
                MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i5);
                if (menuItemC0329j.f6071b == this.f6071b && (menuItemC0329j.f6091x & 4) != 0 && menuItemC0329j.isCheckable()) {
                    boolean z5 = menuItemC0329j == this;
                    int i6 = menuItemC0329j.f6091x;
                    int i7 = (z5 ? 2 : 0) | (i6 & (-3));
                    menuItemC0329j.f6091x = i7;
                    if (i6 != i7) {
                        menuItemC0329j.f6083n.o(false);
                    }
                }
            }
            menuC0328i.r();
        } else {
            int i8 = (i4 & (-3)) | (z4 ? 2 : 0);
            this.f6091x = i8;
            if (i4 != i8) {
                this.f6083n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f6091x |= 16;
        } else {
            this.f6091x &= -17;
        }
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6082m = 0;
        this.f6081l = drawable;
        this.w = true;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.f6089u = true;
        this.w = true;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6088t = mode;
        this.f6090v = true;
        this.w = true;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6076g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f6077h == c4) {
            return this;
        }
        this.f6077h = c4;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6068A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6085p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f6077h = c4;
        this.f6079j = Character.toLowerCase(c5);
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6092y = i4;
        MenuC0328i menuC0328i = this.f6083n;
        menuC0328i.f6059k = true;
        menuC0328i.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6074e = charSequence;
        this.f6083n.o(false);
        SubMenuC0338s subMenuC0338s = this.f6084o;
        if (subMenuC0338s != null) {
            subMenuC0338s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6075f = charSequence;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i4 = this.f6091x;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.f6091x = i5;
        if (i4 != i5) {
            MenuC0328i menuC0328i = this.f6083n;
            menuC0328i.f6056h = true;
            menuC0328i.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6074e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f6079j == c4 && this.f6080k == i4) {
            return this;
        }
        this.f6079j = Character.toLowerCase(c4);
        this.f6080k = KeyEvent.normalizeMetaState(i4);
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f6077h == c4 && this.f6078i == i4) {
            return this;
        }
        this.f6077h = c4;
        this.f6078i = KeyEvent.normalizeMetaState(i4);
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f6077h = c4;
        this.f6078i = KeyEvent.normalizeMetaState(i4);
        this.f6079j = Character.toLowerCase(c5);
        this.f6080k = KeyEvent.normalizeMetaState(i5);
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f6081l = null;
        this.f6082m = i4;
        this.w = true;
        this.f6083n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f6083n.f6049a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        Context context = this.f6083n.f6049a;
        View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f6093z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f6070a) > 0) {
            inflate.setId(i5);
        }
        MenuC0328i menuC0328i = this.f6083n;
        menuC0328i.f6059k = true;
        menuC0328i.o(true);
        return this;
    }
}
