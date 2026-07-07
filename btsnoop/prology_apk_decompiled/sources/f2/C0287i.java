package f2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: f2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0287i extends C0282d implements SortedMap {

    /* renamed from: p, reason: collision with root package name */
    public SortedSet f5577p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f5578q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287i(Z z4, SortedMap sortedMap) {
        super(z4, sortedMap);
        this.f5578q = z4;
    }

    public SortedSet b() {
        return new C0288j(this.f5578q, d());
    }

    @Override // f2.C0282d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f5577p;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b4 = b();
        this.f5577p = b4;
        return b4;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f5555n;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0287i(this.f5578q, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0287i(this.f5578q, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0287i(this.f5578q, d().tailMap(obj));
    }
}
