package j;

import android.content.Context;
import android.view.View;
import com.prology.R;
import i.AbstractC0330k;
import i.C0332m;
import i.MenuC0328i;
import i.SubMenuC0338s;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351f extends C0332m {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6644l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0354i f6645m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0351f(C0354i c0354i, Context context, MenuC0328i menuC0328i, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0328i, true);
        this.f6645m = c0354i;
        this.f6101f = 8388613;
        f2.Y y4 = c0354i.f6680G;
        this.f6103h = y4;
        AbstractC0330k abstractC0330k = this.f6104i;
        if (abstractC0330k != null) {
            abstractC0330k.f(y4);
        }
    }

    @Override // i.C0332m
    public final void c() {
        switch (this.f6644l) {
            case 0:
                C0354i c0354i = this.f6645m;
                c0354i.f6677D = null;
                c0354i.getClass();
                super.c();
                return;
            default:
                C0354i c0354i2 = this.f6645m;
                MenuC0328i menuC0328i = c0354i2.f6683n;
                if (menuC0328i != null) {
                    menuC0328i.c(true);
                }
                c0354i2.f6676C = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0351f(C0354i c0354i, Context context, SubMenuC0338s subMenuC0338s, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0338s, false);
        this.f6645m = c0354i;
        if (!subMenuC0338s.w.d()) {
            View view2 = c0354i.s;
            this.f6100e = view2 == null ? c0354i.f6687r : view2;
        }
        f2.Y y4 = c0354i.f6680G;
        this.f6103h = y4;
        AbstractC0330k abstractC0330k = this.f6104i;
        if (abstractC0330k != null) {
            abstractC0330k.f(y4);
        }
    }
}
