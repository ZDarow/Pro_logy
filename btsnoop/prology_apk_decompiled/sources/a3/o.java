package a3;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class o extends U1.a {
    public static int Q(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void R(HashMap hashMap, Z2.b[] bVarArr) {
        for (Z2.b bVar : bVarArr) {
            hashMap.put(bVar.f3179l, bVar.f3180m);
        }
    }
}
