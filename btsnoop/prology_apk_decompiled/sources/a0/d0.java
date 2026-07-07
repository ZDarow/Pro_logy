package a0;

import java.util.ArrayList;
import q0.AbstractC0469a;
import q0.C0465B;

/* loaded from: classes.dex */
public final class d0 implements X {

    /* renamed from: a, reason: collision with root package name */
    public final C0465B f3414a;

    /* renamed from: d, reason: collision with root package name */
    public int f3417d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3418e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3416c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f3415b = new Object();

    public d0(AbstractC0469a abstractC0469a, boolean z4) {
        this.f3414a = new C0465B(abstractC0469a, z4);
    }

    @Override // a0.X
    public final Object a() {
        return this.f3415b;
    }

    @Override // a0.X
    public final T.U b() {
        return this.f3414a.f7667z;
    }
}
