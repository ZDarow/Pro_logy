package C3;

import B2.AbstractC0007h;
import B3.l;
import a.AbstractC0110a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final B3.b f382a;

    /* renamed from: b, reason: collision with root package name */
    public static final B3.b f383b;

    /* renamed from: c, reason: collision with root package name */
    public static final B3.b f384c;

    /* renamed from: d, reason: collision with root package name */
    public static final B3.b f385d;

    /* renamed from: e, reason: collision with root package name */
    public static final B3.b f386e;

    static {
        B3.b bVar = B3.b.f225o;
        f382a = AbstractC0110a.t("/");
        f383b = AbstractC0110a.t("\\");
        f384c = AbstractC0110a.t("/\\");
        f385d = AbstractC0110a.t(".");
        f386e = AbstractC0110a.t("..");
    }

    public static final int a(l lVar) {
        if (lVar.f251l.b() == 0) {
            return -1;
        }
        B3.b bVar = lVar.f251l;
        if (bVar.g(0) != 47) {
            if (bVar.g(0) != 92) {
                if (bVar.b() <= 2 || bVar.g(1) != 58 || bVar.g(2) != 92) {
                    return -1;
                }
                char g4 = (char) bVar.g(0);
                return (('a' > g4 || g4 >= '{') && ('A' > g4 || g4 >= '[')) ? -1 : 3;
            }
            if (bVar.b() > 2 && bVar.g(1) == 92) {
                B3.b bVar2 = f383b;
                k3.h.e(bVar2, "other");
                int d4 = bVar.d(bVar2.f226l, 2);
                return d4 == -1 ? bVar.b() : d4;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, B3.a] */
    public static final l b(l lVar, l lVar2, boolean z4) {
        k3.h.e(lVar, "<this>");
        k3.h.e(lVar2, "child");
        if (a(lVar2) != -1 || lVar2.g() != null) {
            return lVar2;
        }
        B3.b c4 = c(lVar);
        if (c4 == null && (c4 = c(lVar2)) == null) {
            c4 = f(l.f250m);
        }
        ?? obj = new Object();
        obj.m(lVar.f251l);
        if (obj.f224m > 0) {
            obj.m(c4);
        }
        obj.m(lVar2.f251l);
        return d(obj, z4);
    }

    public static final B3.b c(l lVar) {
        B3.b bVar = lVar.f251l;
        B3.b bVar2 = f382a;
        if (B3.b.e(bVar, bVar2) != -1) {
            return bVar2;
        }
        B3.b bVar3 = f383b;
        if (B3.b.e(lVar.f251l, bVar3) != -1) {
            return bVar3;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
    
        if (k3.h.a(r4.get(r4.size() - 1), r9) != false) goto L88;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, B3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final B3.l d(B3.a r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.b.d(B3.a, boolean):B3.l");
    }

    public static final B3.b e(byte b4) {
        if (b4 == 47) {
            return f382a;
        }
        if (b4 == 92) {
            return f383b;
        }
        throw new IllegalArgumentException(AbstractC0007h.k("not a directory separator: ", b4));
    }

    public static final B3.b f(String str) {
        if (k3.h.a(str, "/")) {
            return f382a;
        }
        if (k3.h.a(str, "\\")) {
            return f383b;
        }
        throw new IllegalArgumentException(AbstractC0007h.l("not a directory separator: ", str));
    }
}
