package f2;

import a.AbstractC0110a;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: f2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297t extends AbstractSet {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5614l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0299v f5615m;

    public /* synthetic */ C0297t(C0299v c0299v, int i4) {
        this.f5614l = i4;
        this.f5615m = c0299v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5614l) {
            case 0:
                this.f5615m.clear();
                return;
            default:
                this.f5615m.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5614l) {
            case 0:
                C0299v c0299v = this.f5615m;
                Map c4 = c0299v.c();
                if (c4 != null) {
                    return c4.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e4 = c0299v.e(entry.getKey());
                    if (e4 != -1 && AbstractC0110a.v(c0299v.k()[e4], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f5615m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5614l) {
            case 0:
                C0299v c0299v = this.f5615m;
                Map c4 = c0299v.c();
                return c4 != null ? c4.entrySet().iterator() : new C0296s(c0299v, 1);
            default:
                C0299v c0299v2 = this.f5615m;
                Map c5 = c0299v2.c();
                return c5 != null ? c5.keySet().iterator() : new C0296s(c0299v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5614l) {
            case 0:
                C0299v c0299v = this.f5615m;
                Map c4 = c0299v.c();
                if (c4 != null) {
                    return c4.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0299v.g()) {
                        int d4 = c0299v.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0299v.f5620l;
                        Objects.requireNonNull(obj2);
                        int q4 = r.q(key, value, d4, obj2, c0299v.i(), c0299v.j(), c0299v.k());
                        if (q4 != -1) {
                            c0299v.f(q4, d4);
                            c0299v.f5625q--;
                            c0299v.f5624p += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0299v c0299v2 = this.f5615m;
                Map c5 = c0299v2.c();
                return c5 != null ? c5.keySet().remove(obj) : c0299v2.h(obj) != C0299v.f5619u;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5614l) {
            case 0:
                return this.f5615m.size();
            default:
                return this.f5615m.size();
        }
    }
}
