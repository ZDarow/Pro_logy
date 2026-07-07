package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import n.C0440c;
import n.C0442e;

/* loaded from: classes.dex */
public class a0 extends AbstractSet {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4060l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f4061m;

    public /* synthetic */ a0(Map map, int i4) {
        this.f4060l = i4;
        this.f4061m = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f4060l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((X) this.f4061m).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4060l) {
            case 0:
                ((X) this.f4061m).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f4060l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((X) this.f4061m).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4060l) {
            case 0:
                return new Z((X) this.f4061m);
            default:
                return new C0440c((C0442e) this.f4061m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f4060l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((X) this.f4061m).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4060l) {
            case 0:
                return ((X) this.f4061m).size();
            default:
                return ((C0442e) this.f4061m).f7367n;
        }
    }
}
