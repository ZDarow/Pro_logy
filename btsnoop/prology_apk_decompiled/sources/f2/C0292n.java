package f2;

import a.AbstractC0110a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: f2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292n extends AbstractCollection {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5599l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5600m;

    public /* synthetic */ C0292n(int i4, Serializable serializable) {
        this.f5599l = i4;
        this.f5600m = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f5599l) {
            case 0:
                ((Z) this.f5600m).c();
                return;
            case 1:
                ((C0299v) this.f5600m).clear();
                return;
            default:
                ((C0282d) this.f5600m).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f5599l) {
            case 0:
                return ((Z) this.f5600m).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0282d) this.f5600m).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5599l) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0282d) this.f5600m).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5599l) {
            case 0:
                return new C0279a((Z) this.f5600m);
            case 1:
                C0299v c0299v = (C0299v) this.f5600m;
                Map c4 = c0299v.c();
                return c4 != null ? c4.values().iterator() : new C0296s(c0299v, 2);
            default:
                return new q0(((C0282d) this.f5600m).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f5599l) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0282d c0282d = (C0282d) this.f5600m;
                    for (Map.Entry entry : c0282d.entrySet()) {
                        if (AbstractC0110a.v(obj, entry.getValue())) {
                            c0282d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f5599l) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0282d c0282d = (C0282d) this.f5600m;
                    for (Map.Entry entry : c0282d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0282d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f5599l) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0282d c0282d = (C0282d) this.f5600m;
                    for (Map.Entry entry : c0282d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0282d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f5599l) {
            case 0:
                return ((Z) this.f5600m).f5537p;
            case 1:
                return ((C0299v) this.f5600m).size();
            default:
                return ((C0282d) this.f5600m).f5555n.size();
        }
    }

    public C0292n(C0282d c0282d) {
        this.f5599l = 2;
        this.f5600m = c0282d;
    }
}
