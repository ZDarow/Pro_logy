package C3;

import B3.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends B3.f {

    /* renamed from: c, reason: collision with root package name */
    public static final l f389c;

    /* renamed from: b, reason: collision with root package name */
    public final Z2.e f390b;

    static {
        String str = l.f250m;
        f389c = F1.g.u("/", false);
    }

    public d(ClassLoader classLoader) {
        this.f390b = new Z2.e(new c(0, classLoader));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, B3.a] */
    @Override // B3.f
    public final B3.e b(l lVar) {
        l d4;
        k3.h.e(lVar, "path");
        if (!L1.g.f(lVar)) {
            return null;
        }
        l lVar2 = f389c;
        lVar2.getClass();
        k3.h.e(lVar, "child");
        l b4 = b.b(lVar2, lVar, true);
        int a4 = b.a(b4);
        B3.b bVar = b4.f251l;
        l lVar3 = a4 == -1 ? null : new l(bVar.l(0, a4));
        int a5 = b.a(lVar2);
        B3.b bVar2 = lVar2.f251l;
        if (!k3.h.a(lVar3, a5 == -1 ? null : new l(bVar2.l(0, a5)))) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b4 + " and " + lVar2).toString());
        }
        ArrayList a6 = b4.a();
        ArrayList a7 = lVar2.a();
        int min = Math.min(a6.size(), a7.size());
        int i4 = 0;
        while (i4 < min && k3.h.a(a6.get(i4), a7.get(i4))) {
            i4++;
        }
        if (i4 == min && bVar.b() == bVar2.b()) {
            String str = l.f250m;
            d4 = F1.g.u(".", false);
        } else {
            if (a7.subList(i4, a7.size()).indexOf(b.f386e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + b4 + " and " + lVar2).toString());
            }
            ?? obj = new Object();
            B3.b c4 = b.c(lVar2);
            if (c4 == null && (c4 = b.c(b4)) == null) {
                c4 = b.f(l.f250m);
            }
            int size = a7.size();
            for (int i5 = i4; i5 < size; i5++) {
                obj.m(b.f386e);
                obj.m(c4);
            }
            int size2 = a6.size();
            while (i4 < size2) {
                obj.m((B3.b) a6.get(i4));
                obj.m(c4);
                i4++;
            }
            d4 = b.d(obj, false);
        }
        String n4 = d4.f251l.n();
        for (Z2.b bVar3 : (List) this.f390b.a()) {
            B3.e b5 = ((B3.f) bVar3.f3179l).b(((l) bVar3.f3180m).d(n4));
            if (b5 != null) {
                return b5;
            }
        }
        return null;
    }
}
