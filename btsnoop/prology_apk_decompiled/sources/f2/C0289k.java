package f2;

import java.util.List;
import java.util.ListIterator;

/* renamed from: f2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289k extends C0281c implements ListIterator {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0290l f5587p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289k(C0290l c0290l) {
        super(c0290l);
        this.f5587p = c0290l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0290l c0290l = this.f5587p;
        boolean isEmpty = c0290l.isEmpty();
        b().add(obj);
        c0290l.f5594q.f5537p++;
        if (isEmpty) {
            c0290l.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f5547m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289k(C0290l c0290l, int i4) {
        super(c0290l, ((List) c0290l.f5590m).listIterator(i4));
        this.f5587p = c0290l;
    }
}
