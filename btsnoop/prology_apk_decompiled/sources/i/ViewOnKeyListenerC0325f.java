package i;

import C.x;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.prology.R;
import f2.Y;
import j.P;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0325f extends AbstractC0330k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public int f6020A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6021B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6022C;

    /* renamed from: D, reason: collision with root package name */
    public int f6023D;

    /* renamed from: E, reason: collision with root package name */
    public int f6024E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6026G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0333n f6027H;

    /* renamed from: I, reason: collision with root package name */
    public ViewTreeObserver f6028I;
    public C0331l J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f6029K;

    /* renamed from: m, reason: collision with root package name */
    public final Context f6030m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6031n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6032o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6033p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f6034q;

    /* renamed from: t, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0322c f6036t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0323d f6037u;

    /* renamed from: y, reason: collision with root package name */
    public View f6040y;

    /* renamed from: z, reason: collision with root package name */
    public View f6041z;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f6035r = new ArrayList();
    public final ArrayList s = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final Y f6038v = new Y(5, this);
    public int w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f6039x = 0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6025F = false;

    public ViewOnKeyListenerC0325f(Context context, View view, int i4, boolean z4) {
        this.f6036t = new ViewTreeObserverOnGlobalLayoutListenerC0322c(this, r0);
        this.f6037u = new ViewOnAttachStateChangeListenerC0323d(this, r0);
        this.f6030m = context;
        this.f6040y = view;
        this.f6032o = i4;
        this.f6033p = z4;
        Field field = x.f330a;
        this.f6020A = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f6031n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f6034q = new Handler();
    }

    @Override // i.InterfaceC0334o
    public final void a(MenuC0328i menuC0328i, boolean z4) {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (menuC0328i == ((C0324e) arrayList.get(i4)).f6018b) {
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
            ((C0324e) arrayList.get(i5)).f6018b.c(false);
        }
        C0324e c0324e = (C0324e) arrayList.remove(i4);
        CopyOnWriteArrayList copyOnWriteArrayList = c0324e.f6018b.f6066r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0334o interfaceC0334o = (InterfaceC0334o) weakReference.get();
            if (interfaceC0334o == null || interfaceC0334o == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z5 = this.f6029K;
        P p2 = c0324e.f6017a;
        if (z5) {
            p2.f6597G.setExitTransition(null);
            p2.f6597G.setAnimationStyle(0);
        }
        p2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f6020A = ((C0324e) arrayList.get(size2 - 1)).f6019c;
        } else {
            View view = this.f6040y;
            Field field = x.f330a;
            this.f6020A = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C0324e) arrayList.get(0)).f6018b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0333n interfaceC0333n = this.f6027H;
        if (interfaceC0333n != null) {
            interfaceC0333n.a(menuC0328i, true);
        }
        ViewTreeObserver viewTreeObserver = this.f6028I;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f6028I.removeGlobalOnLayoutListener(this.f6036t);
            }
            this.f6028I = null;
        }
        this.f6041z.removeOnAttachStateChangeListener(this.f6037u);
        this.J.onDismiss();
    }

    @Override // i.InterfaceC0336q
    public final void c() {
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f6035r;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0328i) it.next());
        }
        arrayList.clear();
        View view = this.f6040y;
        this.f6041z = view;
        if (view != null) {
            boolean z4 = this.f6028I == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f6028I = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f6036t);
            }
            this.f6041z.addOnAttachStateChangeListener(this.f6037u);
        }
    }

    @Override // i.InterfaceC0334o
    public final boolean d() {
        return false;
    }

    @Override // i.InterfaceC0336q
    public final void dismiss() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        if (size > 0) {
            C0324e[] c0324eArr = (C0324e[]) arrayList.toArray(new C0324e[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                C0324e c0324e = c0324eArr[i4];
                if (c0324e.f6017a.f6597G.isShowing()) {
                    c0324e.f6017a.dismiss();
                }
            }
        }
    }

    @Override // i.InterfaceC0334o
    public final void f(InterfaceC0333n interfaceC0333n) {
        this.f6027H = interfaceC0333n;
    }

    @Override // i.InterfaceC0334o
    public final void h() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0324e) it.next()).f6017a.f6600n.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0326g) adapter).notifyDataSetChanged();
        }
    }

    @Override // i.InterfaceC0336q
    public final boolean i() {
        ArrayList arrayList = this.s;
        return arrayList.size() > 0 && ((C0324e) arrayList.get(0)).f6017a.f6597G.isShowing();
    }

    @Override // i.InterfaceC0334o
    public final boolean j(SubMenuC0338s subMenuC0338s) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            C0324e c0324e = (C0324e) it.next();
            if (subMenuC0338s == c0324e.f6018b) {
                c0324e.f6017a.f6600n.requestFocus();
                return true;
            }
        }
        if (!subMenuC0338s.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0338s);
        InterfaceC0333n interfaceC0333n = this.f6027H;
        if (interfaceC0333n != null) {
            interfaceC0333n.h(subMenuC0338s);
        }
        return true;
    }

    @Override // i.InterfaceC0336q
    public final ListView k() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0324e) arrayList.get(arrayList.size() - 1)).f6017a.f6600n;
    }

    @Override // i.AbstractC0330k
    public final void l(MenuC0328i menuC0328i) {
        menuC0328i.b(this, this.f6030m);
        if (i()) {
            v(menuC0328i);
        } else {
            this.f6035r.add(menuC0328i);
        }
    }

    @Override // i.AbstractC0330k
    public final void n(View view) {
        if (this.f6040y != view) {
            this.f6040y = view;
            int i4 = this.w;
            Field field = x.f330a;
            this.f6039x = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // i.AbstractC0330k
    public final void o(boolean z4) {
        this.f6025F = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0324e c0324e;
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                c0324e = null;
                break;
            }
            c0324e = (C0324e) arrayList.get(i4);
            if (!c0324e.f6017a.f6597G.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (c0324e != null) {
            c0324e.f6018b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i.AbstractC0330k
    public final void p(int i4) {
        if (this.w != i4) {
            this.w = i4;
            View view = this.f6040y;
            Field field = x.f330a;
            this.f6039x = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // i.AbstractC0330k
    public final void q(int i4) {
        this.f6021B = true;
        this.f6023D = i4;
    }

    @Override // i.AbstractC0330k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.J = (C0331l) onDismissListener;
    }

    @Override // i.AbstractC0330k
    public final void s(boolean z4) {
        this.f6026G = z4;
    }

    @Override // i.AbstractC0330k
    public final void t(int i4) {
        this.f6022C = true;
        this.f6024E = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Type inference failed for: r7v0, types: [j.M, j.P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(i.MenuC0328i r18) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.ViewOnKeyListenerC0325f.v(i.i):void");
    }
}
