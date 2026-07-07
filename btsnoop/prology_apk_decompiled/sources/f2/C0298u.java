package f2;

import a.AbstractC0110a;
import java.util.Map;

/* renamed from: f2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298u extends AbstractC0291m {

    /* renamed from: l, reason: collision with root package name */
    public final Object f5616l;

    /* renamed from: m, reason: collision with root package name */
    public int f5617m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0299v f5618n;

    public C0298u(C0299v c0299v, int i4) {
        this.f5618n = c0299v;
        Object obj = C0299v.f5619u;
        this.f5616l = c0299v.j()[i4];
        this.f5617m = i4;
    }

    public final void a() {
        int i4 = this.f5617m;
        Object obj = this.f5616l;
        C0299v c0299v = this.f5618n;
        if (i4 != -1 && i4 < c0299v.size()) {
            if (AbstractC0110a.v(obj, c0299v.j()[this.f5617m])) {
                return;
            }
        }
        Object obj2 = C0299v.f5619u;
        this.f5617m = c0299v.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5616l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0299v c0299v = this.f5618n;
        Map c4 = c0299v.c();
        if (c4 != null) {
            return c4.get(this.f5616l);
        }
        a();
        int i4 = this.f5617m;
        if (i4 == -1) {
            return null;
        }
        return c0299v.k()[i4];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0299v c0299v = this.f5618n;
        Map c4 = c0299v.c();
        Object obj2 = this.f5616l;
        if (c4 != null) {
            return c4.put(obj2, obj);
        }
        a();
        int i4 = this.f5617m;
        if (i4 == -1) {
            c0299v.put(obj2, obj);
            return null;
        }
        Object obj3 = c0299v.k()[i4];
        c0299v.k()[this.f5617m] = obj;
        return obj3;
    }
}
