package f2;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class Q extends q0 implements ListIterator {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5526m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractList f5527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(AbstractList abstractList, ListIterator listIterator, int i4) {
        super(listIterator);
        this.f5526m = i4;
        this.f5527n = abstractList;
    }

    @Override // f2.q0
    public final Object a(Object obj) {
        switch (this.f5526m) {
            case 0:
                return ((S) this.f5527n).f5529m.apply(obj);
            default:
                return ((T) this.f5527n).f5531m.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f5607l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f5607l).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f5607l).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f5607l).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
