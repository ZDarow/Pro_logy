package j;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class J implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f6586m;

    public /* synthetic */ J(M m4, int i4) {
        this.f6585l = i4;
        this.f6586m = m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M m4 = this.f6586m;
        switch (this.f6585l) {
            case 0:
                O o2 = m4.f6600n;
                if (o2 != null) {
                    o2.setListSelectionHidden(true);
                    o2.requestLayout();
                    return;
                }
                return;
            default:
                O o4 = m4.f6600n;
                if (o4 != null) {
                    Field field = C.x.f330a;
                    if (!o4.isAttachedToWindow() || m4.f6600n.getCount() <= m4.f6600n.getChildCount() || m4.f6600n.getChildCount() > Integer.MAX_VALUE) {
                        return;
                    }
                    m4.f6597G.setInputMethodMode(2);
                    m4.c();
                    return;
                }
                return;
        }
    }
}
