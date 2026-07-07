package f2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: f2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0288j extends C0283e implements SortedSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f5585n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288j(Z z4, SortedMap sortedMap) {
        super(z4, sortedMap);
        this.f5585n = z4;
    }

    public SortedMap a() {
        return (SortedMap) this.f5558l;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0288j(this.f5585n, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0288j(this.f5585n, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0288j(this.f5585n, a().tailMap(obj));
    }
}
