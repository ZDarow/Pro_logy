package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440c implements Iterator, Map.Entry {

    /* renamed from: l, reason: collision with root package name */
    public int f7342l;

    /* renamed from: m, reason: collision with root package name */
    public int f7343m = -1;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7344n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0442e f7345o;

    public C0440c(C0442e c0442e) {
        this.f7345o = c0442e;
        this.f7342l = c0442e.f7367n - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f7344n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i4 = this.f7343m;
        C0442e c0442e = this.f7345o;
        return k3.h.a(key, c0442e.e(i4)) && k3.h.a(entry.getValue(), c0442e.h(this.f7343m));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f7344n) {
            return this.f7345o.e(this.f7343m);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f7344n) {
            return this.f7345o.h(this.f7343m);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7343m < this.f7342l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7344n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.f7343m;
        C0442e c0442e = this.f7345o;
        Object e4 = c0442e.e(i4);
        Object h4 = c0442e.h(this.f7343m);
        return (e4 == null ? 0 : e4.hashCode()) ^ (h4 != null ? h4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7343m++;
        this.f7344n = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7344n) {
            throw new IllegalStateException();
        }
        this.f7345o.f(this.f7343m);
        this.f7343m--;
        this.f7342l--;
        this.f7344n = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f7344n) {
            return this.f7345o.g(this.f7343m, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
