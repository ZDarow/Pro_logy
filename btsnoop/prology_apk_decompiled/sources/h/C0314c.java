package h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import i.MenuItemC0329j;
import java.lang.reflect.Constructor;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314c {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f5818A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f5821D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f5822a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5829h;

    /* renamed from: i, reason: collision with root package name */
    public int f5830i;

    /* renamed from: j, reason: collision with root package name */
    public int f5831j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f5832k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5833l;

    /* renamed from: m, reason: collision with root package name */
    public int f5834m;

    /* renamed from: n, reason: collision with root package name */
    public char f5835n;

    /* renamed from: o, reason: collision with root package name */
    public int f5836o;

    /* renamed from: p, reason: collision with root package name */
    public char f5837p;

    /* renamed from: q, reason: collision with root package name */
    public int f5838q;

    /* renamed from: r, reason: collision with root package name */
    public int f5839r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5840t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5841u;

    /* renamed from: v, reason: collision with root package name */
    public int f5842v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public String f5843x;

    /* renamed from: y, reason: collision with root package name */
    public String f5844y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f5845z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f5819B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f5820C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f5823b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f5824c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5825d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5826e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5827f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5828g = true;

    public C0314c(d dVar, Menu menu) {
        this.f5821D = dVar;
        this.f5822a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f5821D.f5850c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, h.b] */
    public final void b(MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.s).setVisible(this.f5840t).setEnabled(this.f5841u).setCheckable(this.f5839r >= 1).setTitleCondensed(this.f5833l).setIcon(this.f5834m);
        int i4 = this.f5842v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        String str = this.f5844y;
        d dVar = this.f5821D;
        if (str != null) {
            if (dVar.f5850c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f5851d == null) {
                dVar.f5851d = d.a(dVar.f5850c);
            }
            Object obj = dVar.f5851d;
            String str2 = this.f5844y;
            ?? obj2 = new Object();
            obj2.f5816a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f5817b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0313b.f5815c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f5839r >= 2 && (menuItem instanceof MenuItemC0329j)) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) menuItem;
            menuItemC0329j.f6091x = (menuItemC0329j.f6091x & (-5)) | 4;
        }
        String str3 = this.f5843x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f5846e, dVar.f5848a));
            z4 = true;
        }
        int i5 = this.w;
        if (i5 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        CharSequence charSequence = this.f5845z;
        boolean z5 = menuItem instanceof MenuItemC0329j;
        if (z5) {
            ((MenuItemC0329j) menuItem).e(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f5818A;
        if (z5) {
            ((MenuItemC0329j) menuItem).g(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c4 = this.f5835n;
        int i6 = this.f5836o;
        if (z5) {
            ((MenuItemC0329j) menuItem).setAlphabeticShortcut(c4, i6);
        } else {
            menuItem.setAlphabeticShortcut(c4, i6);
        }
        char c5 = this.f5837p;
        int i7 = this.f5838q;
        if (z5) {
            ((MenuItemC0329j) menuItem).setNumericShortcut(c5, i7);
        } else {
            menuItem.setNumericShortcut(c5, i7);
        }
        PorterDuff.Mode mode = this.f5820C;
        if (mode != null) {
            if (z5) {
                ((MenuItemC0329j) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f5819B;
        if (colorStateList != null) {
            if (z5) {
                ((MenuItemC0329j) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
