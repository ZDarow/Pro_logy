package f2;

import java.io.Serializable;

/* renamed from: f2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300w extends b0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final W0.d f5628l;

    public C0300w(W0.d dVar) {
        this.f5628l = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f5628l.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0300w) {
            return this.f5628l.equals(((C0300w) obj).f5628l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5628l.hashCode();
    }

    public final String toString() {
        return this.f5628l.toString();
    }
}
