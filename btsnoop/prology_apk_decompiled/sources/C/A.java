package C;

import B2.AbstractC0008i;
import android.view.WindowInsets;
import u.C0574b;

/* loaded from: classes.dex */
public class A extends D {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f276a;

    public A() {
        this.f276a = AbstractC0008i.g();
    }

    @Override // C.D
    public O b() {
        WindowInsets build;
        a();
        build = this.f276a.build();
        O c4 = O.c(null, build);
        c4.f296a.o(null);
        return c4;
    }

    @Override // C.D
    public void c(C0574b c0574b) {
        this.f276a.setStableInsets(c0574b.c());
    }

    @Override // C.D
    public void d(C0574b c0574b) {
        this.f276a.setSystemWindowInsets(c0574b.c());
    }

    public A(O o2) {
        super(o2);
        WindowInsets.Builder g4;
        WindowInsets b4 = o2.b();
        if (b4 != null) {
            g4 = AbstractC0008i.h(b4);
        } else {
            g4 = AbstractC0008i.g();
        }
        this.f276a = g4;
    }
}
