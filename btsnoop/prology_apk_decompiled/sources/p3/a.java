package p3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7656a;

    public a(e eVar) {
        this.f7656a = new AtomicReference(eVar);
    }

    @Override // p3.b
    public final Iterator iterator() {
        b bVar = (b) this.f7656a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
