package k1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l extends E0.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7020b;

    public l(s sVar, int i4) {
        this.f7020b = i4;
        new Rect();
        this.f527a = sVar;
    }

    @Override // E0.e
    public final int d(View view) {
        switch (this.f7020b) {
            case 0:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f527a).getClass();
                return view.getRight() + ((t) view.getLayoutParams()).f7034a.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f527a).getClass();
                return view.getBottom() + ((t) view.getLayoutParams()).f7034a.bottom + ((ViewGroup.MarginLayoutParams) tVar2).bottomMargin;
        }
    }

    @Override // E0.e
    public final int e(View view) {
        switch (this.f7020b) {
            case 0:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f527a).getClass();
                return (view.getLeft() - ((t) view.getLayoutParams()).f7034a.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f527a).getClass();
                return (view.getTop() - ((t) view.getLayoutParams()).f7034a.top) - ((ViewGroup.MarginLayoutParams) tVar2).topMargin;
        }
    }

    @Override // E0.e
    public final int f() {
        switch (this.f7020b) {
            case 0:
                s sVar = (s) this.f527a;
                return sVar.f7032f - sVar.t();
            default:
                s sVar2 = (s) this.f527a;
                return sVar2.f7033g - sVar2.r();
        }
    }

    @Override // E0.e
    public final int i() {
        switch (this.f7020b) {
            case 0:
                return ((s) this.f527a).s();
            default:
                return ((s) this.f527a).u();
        }
    }

    @Override // E0.e
    public final int j() {
        switch (this.f7020b) {
            case 0:
                s sVar = (s) this.f527a;
                return (sVar.f7032f - sVar.s()) - sVar.t();
            default:
                s sVar2 = (s) this.f527a;
                return (sVar2.f7033g - sVar2.u()) - sVar2.r();
        }
    }
}
