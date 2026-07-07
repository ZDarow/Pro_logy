package p140i;

/* renamed from: i.f */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1514f extends p140i.AbstractC1519k implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: A */
    public int f6240A;

    /* renamed from: B */
    public boolean f6241B;

    /* renamed from: C */
    public boolean f6242C;

    /* renamed from: D */
    public int f6243D;

    /* renamed from: E */
    public int f6244E;

    /* renamed from: G */
    public boolean f6246G;

    /* renamed from: H */
    public p140i.InterfaceC1522n f6247H;

    /* renamed from: I */
    public android.view.ViewTreeObserver f6248I;

    /* renamed from: J */
    public p140i.C1520l f6249J;

    /* renamed from: K */
    public boolean f6250K;

    /* renamed from: m */
    public final android.content.Context f6251m;

    /* renamed from: n */
    public final int f6252n;

    /* renamed from: o */
    public final int f6253o;

    /* renamed from: p */
    public final boolean f6254p;

    /* renamed from: q */
    public final android.os.Handler f6255q;

    /* renamed from: t */
    public final p140i.ViewTreeObserverOnGlobalLayoutListenerC1511c f6258t;

    /* renamed from: u */
    public final p140i.ViewOnAttachStateChangeListenerC1512d f6259u;

    /* renamed from: y */
    public android.view.View f6263y;

    /* renamed from: z */
    public android.view.View f6264z;

    /* renamed from: r */
    public final java.util.ArrayList f6256r = new java.util.ArrayList();

    /* renamed from: s */
    public final java.util.ArrayList f6257s = new java.util.ArrayList();

    /* renamed from: v */
    public final p129f2.C1408Y f6260v = new p129f2.C1408Y(5, this);

    /* renamed from: w */
    public int f6261w = 0;

    /* renamed from: x */
    public int f6262x = 0;

    /* renamed from: F */
    public boolean f6245F = false;

    public ViewOnKeyListenerC1514f(android.content.Context context, android.view.View view, int i4, boolean z4) {
        this.f6258t = new p140i.ViewTreeObserverOnGlobalLayoutListenerC1511c(this, r0);
        this.f6259u = new p140i.ViewOnAttachStateChangeListenerC1512d(this, r0);
        this.f6251m = context;
        this.f6263y = view;
        this.f6253o = i4;
        this.f6254p = z4;
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        this.f6240A = view.getLayoutDirection() != 1 ? 1 : 0;
        android.content.res.Resources resources = context.getResources();
        this.f6252n = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.prology.R.dimen.abc_config_prefDialogWidth));
        this.f6255q = new android.os.Handler();
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: a */
    public final void mo3340a(p140i.MenuC1517i menuC1517i, boolean z4) {
        java.util.ArrayList arrayList = this.f6257s;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (menuC1517i == ((p140i.C1513e) arrayList.get(i4)).f6238b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            ((p140i.C1513e) arrayList.get(i5)).f6238b.m3361c(false);
        }
        p140i.C1513e c1513e = (p140i.C1513e) arrayList.remove(i4);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = c1513e.f6238b.f6289r;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            p140i.InterfaceC1523o interfaceC1523o = (p140i.InterfaceC1523o) weakReference.get();
            if (interfaceC1523o == null || interfaceC1523o == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z5 = this.f6250K;
        p145j.C1637P c1637p = c1513e.f6237a;
        if (z5) {
            c1637p.f6848G.setExitTransition(null);
            c1637p.f6848G.setAnimationStyle(0);
        }
        c1637p.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f6240A = ((p140i.C1513e) arrayList.get(size2 - 1)).f6239c;
        } else {
            android.view.View view = this.f6263y;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            this.f6240A = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((p140i.C1513e) arrayList.get(0)).f6238b.m3361c(false);
                return;
            }
            return;
        }
        dismiss();
        p140i.InterfaceC1522n interfaceC1522n = this.f6247H;
        if (interfaceC1522n != null) {
            interfaceC1522n.mo821a(menuC1517i, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f6248I;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f6248I.removeGlobalOnLayoutListener(this.f6258t);
            }
            this.f6248I = null;
        }
        this.f6264z.removeOnAttachStateChangeListener(this.f6259u);
        this.f6249J.onDismiss();
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: c */
    public final void mo3341c() {
        if (mo3345i()) {
            return;
        }
        java.util.ArrayList arrayList = this.f6256r;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m3356v((p140i.MenuC1517i) it.next());
        }
        arrayList.clear();
        android.view.View view = this.f6263y;
        this.f6264z = view;
        if (view != null) {
            boolean z4 = this.f6248I == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f6248I = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f6258t);
            }
            this.f6264z.addOnAttachStateChangeListener(this.f6259u);
        }
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: d */
    public final boolean mo3342d() {
        return false;
    }

    @Override // p140i.InterfaceC1525q
    public final void dismiss() {
        java.util.ArrayList arrayList = this.f6257s;
        int size = arrayList.size();
        if (size > 0) {
            p140i.C1513e[] c1513eArr = (p140i.C1513e[]) arrayList.toArray(new p140i.C1513e[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                p140i.C1513e c1513e = c1513eArr[i4];
                if (c1513e.f6237a.f6848G.isShowing()) {
                    c1513e.f6237a.dismiss();
                }
            }
        }
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: f */
    public final void mo3343f(p140i.InterfaceC1522n interfaceC1522n) {
        this.f6247H = interfaceC1522n;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: h */
    public final void mo3344h() {
        java.util.Iterator it = this.f6257s.iterator();
        while (it.hasNext()) {
            android.widget.ListAdapter adapter = ((p140i.C1513e) it.next()).f6237a.f6851n.getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((p140i.C1515g) adapter).notifyDataSetChanged();
        }
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: i */
    public final boolean mo3345i() {
        java.util.ArrayList arrayList = this.f6257s;
        return arrayList.size() > 0 && ((p140i.C1513e) arrayList.get(0)).f6237a.f6848G.isShowing();
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: j */
    public final boolean mo3346j(p140i.SubMenuC1527s subMenuC1527s) {
        java.util.Iterator it = this.f6257s.iterator();
        while (it.hasNext()) {
            p140i.C1513e c1513e = (p140i.C1513e) it.next();
            if (subMenuC1527s == c1513e.f6238b) {
                c1513e.f6237a.f6851n.requestFocus();
                return true;
            }
        }
        if (!subMenuC1527s.hasVisibleItems()) {
            return false;
        }
        mo3348l(subMenuC1527s);
        p140i.InterfaceC1522n interfaceC1522n = this.f6247H;
        if (interfaceC1522n != null) {
            interfaceC1522n.mo822h(subMenuC1527s);
        }
        return true;
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: k */
    public final android.widget.ListView mo3347k() {
        java.util.ArrayList arrayList = this.f6257s;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((p140i.C1513e) arrayList.get(arrayList.size() - 1)).f6237a.f6851n;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: l */
    public final void mo3348l(p140i.MenuC1517i menuC1517i) {
        menuC1517i.m3360b(this, this.f6251m);
        if (mo3345i()) {
            m3356v(menuC1517i);
        } else {
            this.f6256r.add(menuC1517i);
        }
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: n */
    public final void mo3349n(android.view.View view) {
        if (this.f6263y != view) {
            this.f6263y = view;
            int i4 = this.f6261w;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            this.f6262x = android.view.Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: o */
    public final void mo3350o(boolean z4) {
        this.f6245F = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        p140i.C1513e c1513e;
        java.util.ArrayList arrayList = this.f6257s;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                c1513e = null;
                break;
            }
            c1513e = (p140i.C1513e) arrayList.get(i4);
            if (!c1513e.f6237a.f6848G.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (c1513e != null) {
            c1513e.f6238b.m3361c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i4, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: p */
    public final void mo3351p(int i4) {
        if (this.f6261w != i4) {
            this.f6261w = i4;
            android.view.View view = this.f6263y;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            this.f6262x = android.view.Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: q */
    public final void mo3352q(int i4) {
        this.f6241B = true;
        this.f6243D = i4;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: r */
    public final void mo3353r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f6249J = (p140i.C1520l) onDismissListener;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: s */
    public final void mo3354s(boolean z4) {
        this.f6246G = z4;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: t */
    public final void mo3355t(int i4) {
        this.f6242C = true;
        this.f6244E = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Type inference failed for: r7v0, types: [j.M, j.P] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3356v(p140i.MenuC1517i r18) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p140i.ViewOnKeyListenerC1514f.m3356v(i.i):void");
    }
}
