package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public int f4056l = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4057m;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f4058n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f4059o;

    public Z(X x3) {
        this.f4059o = x3;
    }

    public final Iterator a() {
        if (this.f4058n == null) {
            this.f4058n = this.f4059o.f4049m.entrySet().iterator();
        }
        return this.f4058n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f4056l + 1;
        X x3 = this.f4059o;
        if (i4 >= x3.f4048l.size()) {
            return !x3.f4049m.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4057m = true;
        int i4 = this.f4056l + 1;
        this.f4056l = i4;
        X x3 = this.f4059o;
        return i4 < x3.f4048l.size() ? (Map.Entry) x3.f4048l.get(this.f4056l) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4057m) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f4057m = false;
        int i4 = X.f4047q;
        X x3 = this.f4059o;
        x3.b();
        if (this.f4056l >= x3.f4048l.size()) {
            a().remove();
            return;
        }
        int i5 = this.f4056l;
        this.f4056l = i5 - 1;
        x3.h(i5);
    }
}
