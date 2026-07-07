package i;

import C.AbstractC0018e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import f2.Y;
import j.InterfaceC0357l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0328i implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f6048u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f6049a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6050b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6051c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6052d;

    /* renamed from: e, reason: collision with root package name */
    public Y f6053e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6054f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6055g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6056h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6057i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6058j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6059k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f6060l;
    public MenuItemC0329j s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6061m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6062n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6063o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6064p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f6065q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f6066r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f6067t = false;

    public MenuC0328i(Context context) {
        boolean z4;
        boolean z5 = false;
        this.f6049a = context;
        Resources resources = context.getResources();
        this.f6050b = resources;
        this.f6054f = new ArrayList();
        this.f6055g = new ArrayList();
        this.f6056h = true;
        this.f6057i = new ArrayList();
        this.f6058j = new ArrayList();
        this.f6059k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z4 = AbstractC0018e.n(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z4 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z4) {
                z5 = true;
            }
        }
        this.f6052d = z5;
    }

    public final MenuItemC0329j a(int i4, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f6048u[i8] << 16) | (65535 & i6);
        MenuItemC0329j menuItemC0329j = new MenuItemC0329j(this, i4, i5, i6, i9, charSequence);
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((MenuItemC0329j) arrayList.get(size)).f6073d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, menuItemC0329j);
        o(true);
        return menuItemC0329j;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f6049a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC0329j a4 = a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            a4.setIcon(resolveInfo.loadIcon(packageManager));
            a4.f6076g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a4;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0334o interfaceC0334o, Context context) {
        this.f6066r.add(new WeakReference(interfaceC0334o));
        interfaceC0334o.e(context, this);
        this.f6059k = true;
    }

    public final void c(boolean z4) {
        if (this.f6064p) {
            return;
        }
        this.f6064p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6066r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0334o interfaceC0334o = (InterfaceC0334o) weakReference.get();
            if (interfaceC0334o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0334o.a(this, z4);
            }
        }
        this.f6064p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0329j menuItemC0329j = this.s;
        if (menuItemC0329j != null) {
            d(menuItemC0329j);
        }
        this.f6054f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f6060l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC0329j menuItemC0329j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6066r;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.s == menuItemC0329j) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0334o interfaceC0334o = (InterfaceC0334o) weakReference.get();
                if (interfaceC0334o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = interfaceC0334o.b(menuItemC0329j);
                    if (z4) {
                        break;
                    }
                }
            }
            r();
            if (z4) {
                this.s = null;
            }
        }
        return z4;
    }

    public boolean e(MenuC0328i menuC0328i, MenuItem menuItem) {
        InterfaceC0357l interfaceC0357l;
        Y y4 = this.f6053e;
        if (y4 == null || (interfaceC0357l = ((ActionMenuView) y4.f5535m).f3810I) == null) {
            return false;
        }
        ((Toolbar) ((Y) interfaceC0357l).f5535m).getClass();
        return false;
    }

    public boolean f(MenuItemC0329j menuItemC0329j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6066r;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0334o interfaceC0334o = (InterfaceC0334o) weakReference.get();
            if (interfaceC0334o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = interfaceC0334o.g(menuItemC0329j);
                if (z4) {
                    break;
                }
            }
        }
        r();
        if (z4) {
            this.s = menuItemC0329j;
        }
        return z4;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem findItem;
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i5);
            if (menuItemC0329j.f6070a == i4) {
                return menuItemC0329j;
            }
            if (menuItemC0329j.hasSubMenu() && (findItem = menuItemC0329j.f6084o.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC0329j g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6065q;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC0329j) arrayList.get(0);
        }
        boolean m4 = m();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i5);
            char c4 = m4 ? menuItemC0329j.f6079j : menuItemC0329j.f6077h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (m4 && c4 == '\b' && i4 == 67))) {
                return menuItemC0329j;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f6054f.get(i4);
    }

    public final void h(ArrayList arrayList, int i4, KeyEvent keyEvent) {
        int i5;
        boolean m4 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList2 = this.f6054f;
            int size = arrayList2.size();
            for (0; i5 < size; i5 + 1) {
                MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList2.get(i5);
                if (menuItemC0329j.hasSubMenu()) {
                    menuItemC0329j.f6084o.h(arrayList, i4, keyEvent);
                }
                char c4 = m4 ? menuItemC0329j.f6079j : menuItemC0329j.f6077h;
                if ((modifiers & 69647) == ((m4 ? menuItemC0329j.f6080k : menuItemC0329j.f6078i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if (c4 != cArr[0] && c4 != cArr[2]) {
                        if (m4 && c4 == '\b') {
                            i5 = i4 != 67 ? i5 + 1 : 0;
                        }
                    }
                    if (menuItemC0329j.isEnabled()) {
                        arrayList.add(menuItemC0329j);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((MenuItemC0329j) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k4 = k();
        if (this.f6059k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6066r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0334o interfaceC0334o = (InterfaceC0334o) weakReference.get();
                if (interfaceC0334o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 |= interfaceC0334o.d();
                }
            }
            ArrayList arrayList = this.f6057i;
            ArrayList arrayList2 = this.f6058j;
            if (z4) {
                arrayList.clear();
                arrayList2.clear();
                int size = k4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    MenuItemC0329j menuItemC0329j = (MenuItemC0329j) k4.get(i4);
                    if (menuItemC0329j.d()) {
                        arrayList.add(menuItemC0329j);
                    } else {
                        arrayList2.add(menuItemC0329j);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f6059k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public MenuC0328i j() {
        return this;
    }

    public final ArrayList k() {
        boolean z4 = this.f6056h;
        ArrayList arrayList = this.f6055g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f6054f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList2.get(i4);
            if (menuItemC0329j.isVisible()) {
                arrayList.add(menuItemC0329j);
            }
        }
        this.f6056h = false;
        this.f6059k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f6067t;
    }

    public boolean m() {
        return this.f6051c;
    }

    public boolean n() {
        return this.f6052d;
    }

    public final void o(boolean z4) {
        if (this.f6061m) {
            this.f6062n = true;
            if (z4) {
                this.f6063o = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f6056h = true;
            this.f6059k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6066r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0334o interfaceC0334o = (InterfaceC0334o) weakReference.get();
            if (interfaceC0334o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0334o.h();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, i.AbstractC0330k r7, int r8) {
        /*
            r5 = this;
            i.j r6 = (i.MenuItemC0329j) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f6085p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L36
        L1a:
            i.i r1 = r6.f6083n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f6076g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f6049a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = r0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            i.s r8 = new i.s
            android.content.Context r3 = r5.f6049a
            r8.<init>(r3, r5, r6)
            r6.f6084o = r8
            java.lang.CharSequence r3 = r6.f6074e
            r8.setHeaderTitle(r3)
        L70:
            i.s r6 = r6.f6084o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f6066r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.j(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            i.o r4 = (i.InterfaceC0334o) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.j(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.MenuC0328i.p(android.view.MenuItem, i.k, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return p(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        MenuItemC0329j g4 = g(i4, keyEvent);
        boolean p2 = g4 != null ? p(g4, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return p2;
    }

    public final void q(int i4, CharSequence charSequence, int i5, View view) {
        if (view != null) {
            this.f6060l = null;
        } else {
            if (i4 > 0) {
                this.f6060l = this.f6050b.getText(i4);
            } else if (charSequence != null) {
                this.f6060l = charSequence;
            }
            if (i5 > 0) {
                this.f6049a.getDrawable(i5);
            }
        }
        o(false);
    }

    public final void r() {
        this.f6061m = false;
        if (this.f6062n) {
            this.f6062n = false;
            o(this.f6063o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((MenuItemC0329j) arrayList.get(i6)).f6071b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((MenuItemC0329j) arrayList.get(i6)).f6071b != i4) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f6054f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((MenuItemC0329j) arrayList.get(i5)).f6070a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f6054f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            o(true);
        }
    }

    public final void s() {
        if (this.f6061m) {
            return;
        }
        this.f6061m = true;
        this.f6062n = false;
        this.f6063o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i5);
            if (menuItemC0329j.f6071b == i4) {
                menuItemC0329j.f6091x = (menuItemC0329j.f6091x & (-5)) | (z5 ? 4 : 0);
                menuItemC0329j.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f6067t = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i5);
            if (menuItemC0329j.f6071b == i4) {
                menuItemC0329j.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        ArrayList arrayList = this.f6054f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0329j menuItemC0329j = (MenuItemC0329j) arrayList.get(i5);
            if (menuItemC0329j.f6071b == i4) {
                int i6 = menuItemC0329j.f6091x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                menuItemC0329j.f6091x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f6051c = z4;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6054f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f6050b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f6050b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        MenuItemC0329j a4 = a(i4, i5, i6, charSequence);
        SubMenuC0338s subMenuC0338s = new SubMenuC0338s(this.f6049a, this, a4);
        a4.f6084o = subMenuC0338s;
        subMenuC0338s.setHeaderTitle(a4.f6074e);
        return subMenuC0338s;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f6050b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f6050b.getString(i7));
    }
}
