package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d0 {
    public static c0 a(Object obj) {
        AbstractC0169v abstractC0169v = (AbstractC0169v) obj;
        c0 c0Var = abstractC0169v.unknownFields;
        if (c0Var != c0.f4065f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        abstractC0169v.unknownFields = c0Var2;
        return c0Var2;
    }

    public static void b(Object obj) {
        c0 c0Var = ((AbstractC0169v) obj).unknownFields;
        if (c0Var.f4070e) {
            c0Var.f4070e = false;
        }
    }

    public static boolean c(int i4, W.l lVar, Object obj) {
        int i5 = lVar.f2673a;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        AbstractC0158j abstractC0158j = (AbstractC0158j) lVar.f2676d;
        if (i7 == 0) {
            lVar.B(0);
            ((c0) obj).c(i6 << 3, Long.valueOf(abstractC0158j.n()));
            return true;
        }
        if (i7 == 1) {
            lVar.B(1);
            ((c0) obj).c((i6 << 3) | 1, Long.valueOf(abstractC0158j.k()));
            return true;
        }
        if (i7 == 2) {
            ((c0) obj).c((i6 << 3) | 2, lVar.i());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw C0173z.b();
            }
            lVar.B(5);
            ((c0) obj).c(5 | (i6 << 3), Integer.valueOf(abstractC0158j.j()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i4 + 1;
        if (i10 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lVar.b() != Integer.MAX_VALUE && c(i10, lVar, c0Var)) {
        }
        if (i9 != lVar.f2673a) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f4070e) {
            c0Var.f4070e = false;
        }
        ((c0) obj).c(i8 | 3, c0Var);
        return true;
    }
}
