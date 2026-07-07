package f2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class Z extends AbstractC0293o implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final transient Map f5536o;

    /* renamed from: p, reason: collision with root package name */
    public transient int f5537p;

    /* renamed from: q, reason: collision with root package name */
    public transient X f5538q;

    public Z(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f5536o = map;
    }

    @Override // f2.AbstractC0293o
    public final Map a() {
        Map map = this.f5603n;
        if (map == null) {
            Map map2 = this.f5536o;
            map = map2 instanceof NavigableMap ? new C0284f(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new C0287i(this, (SortedMap) map2) : new C0282d(this, map2);
            this.f5603n = map;
        }
        return map;
    }

    public final void c() {
        Map map = this.f5536o;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f5537p = 0;
    }

    public final Collection d() {
        return (List) this.f5538q.get();
    }
}
