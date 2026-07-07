package p140i;

/* renamed from: i.i */
/* loaded from: classes.dex */
public class MenuC1517i implements android.view.Menu {

    /* renamed from: u */
    public static final int[] f6271u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final android.content.Context f6272a;

    /* renamed from: b */
    public final android.content.res.Resources f6273b;

    /* renamed from: c */
    public boolean f6274c;

    /* renamed from: d */
    public final boolean f6275d;

    /* renamed from: e */
    public p129f2.C1408Y f6276e;

    /* renamed from: f */
    public final java.util.ArrayList f6277f;

    /* renamed from: g */
    public final java.util.ArrayList f6278g;

    /* renamed from: h */
    public boolean f6279h;

    /* renamed from: i */
    public final java.util.ArrayList f6280i;

    /* renamed from: j */
    public final java.util.ArrayList f6281j;

    /* renamed from: k */
    public boolean f6282k;

    /* renamed from: l */
    public java.lang.CharSequence f6283l;

    /* renamed from: s */
    public p140i.MenuItemC1518j f6290s;

    /* renamed from: m */
    public boolean f6284m = false;

    /* renamed from: n */
    public boolean f6285n = false;

    /* renamed from: o */
    public boolean f6286o = false;

    /* renamed from: p */
    public boolean f6287p = false;

    /* renamed from: q */
    public final java.util.ArrayList f6288q = new java.util.ArrayList();

    /* renamed from: r */
    public final java.util.concurrent.CopyOnWriteArrayList f6289r = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: t */
    public boolean f6291t = false;

    public MenuC1517i(android.content.Context context) {
        boolean z4;
        boolean z5 = false;
        this.f6272a = context;
        android.content.res.Resources resources = context.getResources();
        this.f6273b = resources;
        this.f6277f = new java.util.ArrayList();
        this.f6278g = new java.util.ArrayList();
        this.f6279h = true;
        this.f6280i = new java.util.ArrayList();
        this.f6281j = new java.util.ArrayList();
        this.f6282k = true;
        if (resources.getConfiguration().keyboard != 1) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                z4 = p011C.AbstractC0113e.m417n(viewConfiguration);
            } else {
                android.content.res.Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z4 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z4) {
                z5 = true;
            }
        }
        this.f6275d = z5;
    }

    /* renamed from: a */
    public final p140i.MenuItemC1518j m3359a(int i4, int i5, int i6, java.lang.CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f6271u[i8] << 16) | (65535 & i6);
        p140i.MenuItemC1518j menuItemC1518j = new p140i.MenuItemC1518j(this, i4, i5, i6, i9, charSequence);
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((p140i.MenuItemC1518j) arrayList.get(size)).f6297d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, menuItemC1518j);
        m3373o(true);
        return menuItemC1518j;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return m3359a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i7, android.view.MenuItem[] menuItemArr) {
        int i8;
        android.content.pm.PackageManager packageManager = this.f6272a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            android.content.pm.ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            android.content.Intent intent2 = new android.content.Intent(i10 < 0 ? intent : intentArr[i10]);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new android.content.ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            p140i.MenuItemC1518j m3359a = m3359a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            m3359a.setIcon(resolveInfo.loadIcon(packageManager));
            m3359a.f6300g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = m3359a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m3360b(p140i.InterfaceC1523o interfaceC1523o, android.content.Context context) {
        this.f6289r.add(new java.lang.ref.WeakReference(interfaceC1523o));
        interfaceC1523o.mo3388e(context, this);
        this.f6282k = true;
    }

    /* renamed from: c */
    public final void m3361c(boolean z4) {
        if (this.f6287p) {
            return;
        }
        this.f6287p = true;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f6289r;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            p140i.InterfaceC1523o interfaceC1523o = (p140i.InterfaceC1523o) weakReference.get();
            if (interfaceC1523o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1523o.mo3340a(this, z4);
            }
        }
        this.f6287p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        p140i.MenuItemC1518j menuItemC1518j = this.f6290s;
        if (menuItemC1518j != null) {
            mo3362d(menuItemC1518j);
        }
        this.f6277f.clear();
        m3373o(true);
    }

    public final void clearHeader() {
        this.f6283l = null;
        m3373o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3361c(true);
    }

    /* renamed from: d */
    public boolean mo3362d(p140i.MenuItemC1518j menuItemC1518j) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f6289r;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6290s == menuItemC1518j) {
            m3377s();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                p140i.InterfaceC1523o interfaceC1523o = (p140i.InterfaceC1523o) weakReference.get();
                if (interfaceC1523o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = interfaceC1523o.mo3387b(menuItemC1518j);
                    if (z4) {
                        break;
                    }
                }
            }
            m3376r();
            if (z4) {
                this.f6290s = null;
            }
        }
        return z4;
    }

    /* renamed from: e */
    public boolean mo3363e(p140i.MenuC1517i menuC1517i, android.view.MenuItem menuItem) {
        p145j.InterfaceC1669l interfaceC1669l;
        p129f2.C1408Y c1408y = this.f6276e;
        if (c1408y == null || (interfaceC1669l = ((androidx.appcompat.widget.ActionMenuView) c1408y.f5729m).f3947I) == null) {
            return false;
        }
        ((androidx.appcompat.widget.Toolbar) ((p129f2.C1408Y) interfaceC1669l).f5729m).getClass();
        return false;
    }

    /* renamed from: f */
    public boolean mo3364f(p140i.MenuItemC1518j menuItemC1518j) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f6289r;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3377s();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            p140i.InterfaceC1523o interfaceC1523o = (p140i.InterfaceC1523o) weakReference.get();
            if (interfaceC1523o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = interfaceC1523o.mo3389g(menuItemC1518j);
                if (z4) {
                    break;
                }
            }
        }
        m3376r();
        if (z4) {
            this.f6290s = menuItemC1518j;
        }
        return z4;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i4) {
        android.view.MenuItem findItem;
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i5);
            if (menuItemC1518j.f6294a == i4) {
                return menuItemC1518j;
            }
            if (menuItemC1518j.hasSubMenu() && (findItem = menuItemC1518j.f6308o.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final p140i.MenuItemC1518j m3365g(int i4, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.f6288q;
        arrayList.clear();
        m3366h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (p140i.MenuItemC1518j) arrayList.get(0);
        }
        boolean mo3371m = mo3371m();
        for (int i5 = 0; i5 < size; i5++) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i5);
            char c4 = mo3371m ? menuItemC1518j.f6303j : menuItemC1518j.f6301h;
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (mo3371m && c4 == '\b' && i4 == 67))) {
                return menuItemC1518j;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i4) {
        return (android.view.MenuItem) this.f6277f.get(i4);
    }

    /* renamed from: h */
    public final void m3366h(java.util.ArrayList arrayList, int i4, android.view.KeyEvent keyEvent) {
        int i5;
        boolean mo3371m = mo3371m();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            java.util.ArrayList arrayList2 = this.f6277f;
            int size = arrayList2.size();
            for (0; i5 < size; i5 + 1) {
                p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList2.get(i5);
                if (menuItemC1518j.hasSubMenu()) {
                    menuItemC1518j.f6308o.m3366h(arrayList, i4, keyEvent);
                }
                char c4 = mo3371m ? menuItemC1518j.f6303j : menuItemC1518j.f6301h;
                if ((modifiers & 69647) == ((mo3371m ? menuItemC1518j.f6304k : menuItemC1518j.f6302i) & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if (c4 != cArr[0] && c4 != cArr[2]) {
                        if (mo3371m && c4 == '\b') {
                            i5 = i4 != 67 ? i5 + 1 : 0;
                        }
                    }
                    if (menuItemC1518j.isEnabled()) {
                        arrayList.add(menuItemC1518j);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((p140i.MenuItemC1518j) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m3367i() {
        java.util.ArrayList m3369k = m3369k();
        if (this.f6282k) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f6289r;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                p140i.InterfaceC1523o interfaceC1523o = (p140i.InterfaceC1523o) weakReference.get();
                if (interfaceC1523o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 |= interfaceC1523o.mo3342d();
                }
            }
            java.util.ArrayList arrayList = this.f6280i;
            java.util.ArrayList arrayList2 = this.f6281j;
            if (z4) {
                arrayList.clear();
                arrayList2.clear();
                int size = m3369k.size();
                for (int i4 = 0; i4 < size; i4++) {
                    p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) m3369k.get(i4);
                    if (menuItemC1518j.m3381d()) {
                        arrayList.add(menuItemC1518j);
                    } else {
                        arrayList2.add(menuItemC1518j);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m3369k());
            }
            this.f6282k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, android.view.KeyEvent keyEvent) {
        return m3365g(i4, keyEvent) != null;
    }

    /* renamed from: j */
    public p140i.MenuC1517i mo3368j() {
        return this;
    }

    /* renamed from: k */
    public final java.util.ArrayList m3369k() {
        boolean z4 = this.f6279h;
        java.util.ArrayList arrayList = this.f6278g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f6277f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList2.get(i4);
            if (menuItemC1518j.isVisible()) {
                arrayList.add(menuItemC1518j);
            }
        }
        this.f6279h = false;
        this.f6282k = true;
        return arrayList;
    }

    /* renamed from: l */
    public boolean mo3370l() {
        return this.f6291t;
    }

    /* renamed from: m */
    public boolean mo3371m() {
        return this.f6274c;
    }

    /* renamed from: n */
    public boolean mo3372n() {
        return this.f6275d;
    }

    /* renamed from: o */
    public final void m3373o(boolean z4) {
        if (this.f6284m) {
            this.f6285n = true;
            if (z4) {
                this.f6286o = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f6279h = true;
            this.f6282k = true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f6289r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m3377s();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            p140i.InterfaceC1523o interfaceC1523o = (p140i.InterfaceC1523o) weakReference.get();
            if (interfaceC1523o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1523o.mo3344h();
            }
        }
        m3376r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3374p(android.view.MenuItem r6, p140i.AbstractC1519k r7, int r8) {
        /*
            r5 = this;
            i.j r6 = (p140i.MenuItemC1518j) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f6309p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L36
        L1a:
            i.i r1 = r6.f6307n
            boolean r3 = r1.mo3363e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f6300g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f6272a     // Catch: android.content.ActivityNotFoundException -> L2d
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
            boolean r3 = r6.m3380c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.m3361c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.m3361c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.m3361c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            i.s r8 = new i.s
            android.content.Context r3 = r5.f6272a
            r8.<init>(r3, r5, r6)
            r6.f6308o = r8
            java.lang.CharSequence r3 = r6.f6298e
            r8.setHeaderTitle(r3)
        L70:
            i.s r6 = r6.f6308o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f6289r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.mo3346j(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            i.o r4 = (p140i.InterfaceC1523o) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.mo3346j(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.m3361c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p140i.MenuC1517i.m3374p(android.view.MenuItem, i.k, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return m3374p(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, android.view.KeyEvent keyEvent, int i5) {
        p140i.MenuItemC1518j m3365g = m3365g(i4, keyEvent);
        boolean m3374p = m3365g != null ? m3374p(m3365g, null, i5) : false;
        if ((i5 & 2) != 0) {
            m3361c(true);
        }
        return m3374p;
    }

    /* renamed from: q */
    public final void m3375q(int i4, java.lang.CharSequence charSequence, int i5, android.view.View view) {
        if (view != null) {
            this.f6283l = null;
        } else {
            if (i4 > 0) {
                this.f6283l = this.f6273b.getText(i4);
            } else if (charSequence != null) {
                this.f6283l = charSequence;
            }
            if (i5 > 0) {
                this.f6272a.getDrawable(i5);
            }
        }
        m3373o(false);
    }

    /* renamed from: r */
    public final void m3376r() {
        this.f6284m = false;
        if (this.f6285n) {
            this.f6285n = false;
            m3373o(this.f6286o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((p140i.MenuItemC1518j) arrayList.get(i6)).f6295b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((p140i.MenuItemC1518j) arrayList.get(i6)).f6295b != i4) {
                    break;
                }
                if (i6 >= 0) {
                    java.util.ArrayList arrayList2 = this.f6277f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            m3373o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((p140i.MenuItemC1518j) arrayList.get(i5)).f6294a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            java.util.ArrayList arrayList2 = this.f6277f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            m3373o(true);
        }
    }

    /* renamed from: s */
    public final void m3377s() {
        if (this.f6284m) {
            return;
        }
        this.f6284m = true;
        this.f6285n = false;
        this.f6286o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i5);
            if (menuItemC1518j.f6295b == i4) {
                menuItemC1518j.f6317x = (menuItemC1518j.f6317x & (-5)) | (z5 ? 4 : 0);
                menuItemC1518j.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f6291t = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i5);
            if (menuItemC1518j.f6295b == i4) {
                menuItemC1518j.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        java.util.ArrayList arrayList = this.f6277f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i5);
            if (menuItemC1518j.f6295b == i4) {
                int i6 = menuItemC1518j.f6317x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                menuItemC1518j.f6317x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            m3373o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f6274c = z4;
        m3373o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6277f.size();
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i4) {
        return m3359a(0, 0, 0, this.f6273b.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f6273b.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i4, int i5, int i6, java.lang.CharSequence charSequence) {
        return m3359a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i4, int i5, int i6, java.lang.CharSequence charSequence) {
        p140i.MenuItemC1518j m3359a = m3359a(i4, i5, i6, charSequence);
        p140i.SubMenuC1527s subMenuC1527s = new p140i.SubMenuC1527s(this.f6272a, this, m3359a);
        m3359a.f6308o = subMenuC1527s;
        subMenuC1527s.setHeaderTitle(m3359a.f6298e);
        return subMenuC1527s;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i4, int i5, int i6, int i7) {
        return m3359a(i4, i5, i6, this.f6273b.getString(i7));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f6273b.getString(i7));
    }
}
