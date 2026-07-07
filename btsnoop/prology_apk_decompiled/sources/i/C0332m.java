package i;

import C.x;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.prology.R;
import java.lang.reflect.Field;

/* renamed from: i.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0332m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6096a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0328i f6097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6098c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6099d;

    /* renamed from: e, reason: collision with root package name */
    public View f6100e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6102g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0333n f6103h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0330k f6104i;

    /* renamed from: j, reason: collision with root package name */
    public C0331l f6105j;

    /* renamed from: f, reason: collision with root package name */
    public int f6101f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0331l f6106k = new C0331l(this);

    public C0332m(int i4, Context context, View view, MenuC0328i menuC0328i, boolean z4) {
        this.f6096a = context;
        this.f6097b = menuC0328i;
        this.f6100e = view;
        this.f6098c = z4;
        this.f6099d = i4;
    }

    public final AbstractC0330k a() {
        AbstractC0330k viewOnKeyListenerC0337r;
        if (this.f6104i == null) {
            Context context = this.f6096a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0337r = new ViewOnKeyListenerC0325f(context, this.f6100e, this.f6099d, this.f6098c);
            } else {
                View view = this.f6100e;
                Context context2 = this.f6096a;
                boolean z4 = this.f6098c;
                viewOnKeyListenerC0337r = new ViewOnKeyListenerC0337r(this.f6099d, context2, view, this.f6097b, z4);
            }
            viewOnKeyListenerC0337r.l(this.f6097b);
            viewOnKeyListenerC0337r.r(this.f6106k);
            viewOnKeyListenerC0337r.n(this.f6100e);
            viewOnKeyListenerC0337r.f(this.f6103h);
            viewOnKeyListenerC0337r.o(this.f6102g);
            viewOnKeyListenerC0337r.p(this.f6101f);
            this.f6104i = viewOnKeyListenerC0337r;
        }
        return this.f6104i;
    }

    public final boolean b() {
        AbstractC0330k abstractC0330k = this.f6104i;
        return abstractC0330k != null && abstractC0330k.i();
    }

    public void c() {
        this.f6104i = null;
        C0331l c0331l = this.f6105j;
        if (c0331l != null) {
            c0331l.onDismiss();
        }
    }

    public final void d(int i4, int i5, boolean z4, boolean z5) {
        AbstractC0330k a4 = a();
        a4.s(z5);
        if (z4) {
            int i6 = this.f6101f;
            View view = this.f6100e;
            Field field = x.f330a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f6100e.getWidth();
            }
            a4.q(i4);
            a4.t(i5);
            int i7 = (int) ((this.f6096a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a4.f6094l = new Rect(i4 - i7, i5 - i7, i4 + i7, i5 + i7);
        }
        a4.c();
    }
}
