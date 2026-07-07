package p;

import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class e extends AbstractC0462a {
    @Override // p1.AbstractC0462a
    public final void G(f fVar, f fVar2) {
        fVar.f7583b = fVar2;
    }

    @Override // p1.AbstractC0462a
    public final void H(f fVar, Thread thread) {
        fVar.f7582a = thread;
    }

    @Override // p1.AbstractC0462a
    public final boolean h(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f7589b != cVar) {
                    return false;
                }
                gVar.f7589b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p1.AbstractC0462a
    public final boolean i(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f7588a != obj) {
                    return false;
                }
                gVar.f7588a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p1.AbstractC0462a
    public final boolean j(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f7590c != fVar) {
                    return false;
                }
                gVar.f7590c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
