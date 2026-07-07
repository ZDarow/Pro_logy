package androidx.lifecycle;

/* loaded from: classes.dex */
public final class c {
    public static e a(f fVar) {
        k3.h.e(fVar, "state");
        int ordinal = fVar.ordinal();
        if (ordinal == 1) {
            return e.ON_CREATE;
        }
        if (ordinal == 2) {
            return e.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return e.ON_RESUME;
    }
}
