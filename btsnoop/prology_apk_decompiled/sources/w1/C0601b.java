package w1;

import androidx.window.extensions.layout.WindowLayoutInfo;
import j3.l;
import k3.g;
import k3.h;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0601b extends g implements l {
    public C0601b(C0605f c0605f) {
        super(1, c0605f, C0605f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // j3.l
    public final Object b(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((C0605f) this.f7089m).accept(windowLayoutInfo);
        return Z2.g.f3186a;
    }
}
