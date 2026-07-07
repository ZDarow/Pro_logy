package B3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f250m;

    /* renamed from: l, reason: collision with root package name */
    public final b f251l;

    static {
        String str = File.separator;
        k3.h.d(str, "separator");
        f250m = str;
    }

    public l(b bVar) {
        k3.h.e(bVar, "bytes");
        this.f251l = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a4 = C3.b.a(this);
        b bVar = this.f251l;
        if (a4 == -1) {
            a4 = 0;
        } else if (a4 < bVar.b() && bVar.g(a4) == 92) {
            a4++;
        }
        int b4 = bVar.b();
        int i4 = a4;
        while (a4 < b4) {
            if (bVar.g(a4) == 47 || bVar.g(a4) == 92) {
                arrayList.add(bVar.l(i4, a4));
                i4 = a4 + 1;
            }
            a4++;
        }
        if (i4 < bVar.b()) {
            arrayList.add(bVar.l(i4, bVar.b()));
        }
        return arrayList;
    }

    public final String b() {
        b bVar = C3.b.f382a;
        b bVar2 = C3.b.f382a;
        b bVar3 = this.f251l;
        int i4 = b.i(bVar3, bVar2);
        if (i4 == -1) {
            i4 = b.i(bVar3, C3.b.f383b);
        }
        if (i4 != -1) {
            bVar3 = b.m(bVar3, i4 + 1, 0, 2);
        } else if (g() != null && bVar3.b() == 2) {
            bVar3 = b.f225o;
        }
        return bVar3.n();
    }

    public final l c() {
        b bVar = C3.b.f385d;
        b bVar2 = this.f251l;
        if (k3.h.a(bVar2, bVar)) {
            return null;
        }
        b bVar3 = C3.b.f382a;
        if (k3.h.a(bVar2, bVar3)) {
            return null;
        }
        b bVar4 = C3.b.f383b;
        if (k3.h.a(bVar2, bVar4)) {
            return null;
        }
        b bVar5 = C3.b.f386e;
        bVar2.getClass();
        k3.h.e(bVar5, "suffix");
        int b4 = bVar2.b();
        byte[] bArr = bVar5.f226l;
        if (bVar2.k(b4 - bArr.length, bVar5, bArr.length) && (bVar2.b() == 2 || bVar2.k(bVar2.b() - 3, bVar3, 1) || bVar2.k(bVar2.b() - 3, bVar4, 1))) {
            return null;
        }
        int i4 = b.i(bVar2, bVar3);
        if (i4 == -1) {
            i4 = b.i(bVar2, bVar4);
        }
        if (i4 == 2 && g() != null) {
            if (bVar2.b() == 3) {
                return null;
            }
            return new l(b.m(bVar2, 0, 3, 1));
        }
        if (i4 == 1) {
            k3.h.e(bVar4, "prefix");
            if (bVar2.k(0, bVar4, bVar4.f226l.length)) {
                return null;
            }
        }
        if (i4 != -1 || g() == null) {
            return i4 == -1 ? new l(bVar) : i4 == 0 ? new l(b.m(bVar2, 0, 1, 1)) : new l(b.m(bVar2, 0, i4, 1));
        }
        if (bVar2.b() == 2) {
            return null;
        }
        return new l(b.m(bVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        k3.h.e(lVar, "other");
        return this.f251l.compareTo(lVar.f251l);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, B3.a] */
    public final l d(String str) {
        k3.h.e(str, "child");
        ?? obj = new Object();
        obj.p(str);
        return C3.b.b(this, C3.b.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f251l.n());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && k3.h.a(((l) obj).f251l, this.f251l);
    }

    public final Path f() {
        Path path = Paths.get(this.f251l.n(), new String[0]);
        k3.h.d(path, "get(toString())");
        return path;
    }

    public final Character g() {
        b bVar = C3.b.f382a;
        b bVar2 = this.f251l;
        if (b.e(bVar2, bVar) != -1 || bVar2.b() < 2 || bVar2.g(1) != 58) {
            return null;
        }
        char g4 = (char) bVar2.g(0);
        if (('a' > g4 || g4 >= '{') && ('A' > g4 || g4 >= '[')) {
            return null;
        }
        return Character.valueOf(g4);
    }

    public final int hashCode() {
        return this.f251l.hashCode();
    }

    public final String toString() {
        return this.f251l.n();
    }
}
