package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a0 */
/* loaded from: classes.dex */
public class C1094a0 extends java.util.AbstractSet {

    /* renamed from: l */
    public final /* synthetic */ int f4208l;

    /* renamed from: m */
    public final /* synthetic */ java.util.Map f4209m;

    public /* synthetic */ C1094a0(java.util.Map map, int i4) {
        this.f4208l = i4;
        this.f4209m = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        switch (this.f4208l) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.C1090X) this.f4209m).put((java.lang.Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4208l) {
            case 0:
                ((androidx.datastore.preferences.protobuf.C1090X) this.f4209m).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        switch (this.f4208l) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object obj2 = ((androidx.datastore.preferences.protobuf.C1090X) this.f4209m).get(entry.getKey());
                java.lang.Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        switch (this.f4208l) {
            case 0:
                return new androidx.datastore.preferences.protobuf.C1092Z((androidx.datastore.preferences.protobuf.C1090X) this.f4209m);
            default:
                return new p165n.C1876c((p165n.C1878e) this.f4209m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        switch (this.f4208l) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.C1090X) this.f4209m).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4208l) {
            case 0:
                return ((androidx.datastore.preferences.protobuf.C1090X) this.f4209m).size();
            default:
                return ((p165n.C1878e) this.f4209m).f7646n;
        }
    }
}
