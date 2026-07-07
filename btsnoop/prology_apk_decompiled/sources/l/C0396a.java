package l;

import java.util.HashMap;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396a extends C0401f {

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f7106p = new HashMap();

    @Override // l.C0401f
    public final C0398c a(Object obj) {
        return (C0398c) this.f7106p.get(obj);
    }

    @Override // l.C0401f
    public final Object b(Object obj) {
        Object b4 = super.b(obj);
        this.f7106p.remove(obj);
        return b4;
    }
}
