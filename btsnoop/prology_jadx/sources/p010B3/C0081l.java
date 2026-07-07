package p010B3;

/* renamed from: B3.l */
/* loaded from: classes.dex */
public final class C0081l implements java.lang.Comparable {

    /* renamed from: m */
    public static final java.lang.String f255m;

    /* renamed from: l */
    public final p010B3.C0071b f256l;

    static {
        java.lang.String str = java.io.File.separator;
        p154k3.AbstractC1803h.m3778d(str, "separator");
        f255m = str;
    }

    public C0081l(p010B3.C0071b c0071b) {
        p154k3.AbstractC1803h.m3779e(c0071b, "bytes");
        this.f256l = c0071b;
    }

    /* renamed from: a */
    public final java.util.ArrayList m333a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int m495a = p014C3.AbstractC0145b.m495a(this);
        p010B3.C0071b c0071b = this.f256l;
        if (m495a == -1) {
            m495a = 0;
        } else if (m495a < c0071b.mo310b() && c0071b.mo314g(m495a) == 92) {
            m495a++;
        }
        int mo310b = c0071b.mo310b();
        int i4 = m495a;
        while (m495a < mo310b) {
            if (c0071b.mo314g(m495a) == 47 || c0071b.mo314g(m495a) == 92) {
                arrayList.add(c0071b.mo318l(i4, m495a));
                i4 = m495a + 1;
            }
            m495a++;
        }
        if (i4 < c0071b.mo310b()) {
            arrayList.add(c0071b.mo318l(i4, c0071b.mo310b()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final java.lang.String m334b() {
        p010B3.C0071b c0071b = p014C3.AbstractC0145b.f390a;
        p010B3.C0071b c0071b2 = p014C3.AbstractC0145b.f390a;
        p010B3.C0071b c0071b3 = this.f256l;
        int m307i = p010B3.C0071b.m307i(c0071b3, c0071b2);
        if (m307i == -1) {
            m307i = p010B3.C0071b.m307i(c0071b3, p014C3.AbstractC0145b.f391b);
        }
        if (m307i != -1) {
            c0071b3 = p010B3.C0071b.m308m(c0071b3, m307i + 1, 0, 2);
        } else if (m339g() != null && c0071b3.mo310b() == 2) {
            c0071b3 = p010B3.C0071b.f230o;
        }
        return c0071b3.m319n();
    }

    /* renamed from: c */
    public final p010B3.C0081l m335c() {
        p010B3.C0071b c0071b = p014C3.AbstractC0145b.f393d;
        p010B3.C0071b c0071b2 = this.f256l;
        if (p154k3.AbstractC1803h.m3775a(c0071b2, c0071b)) {
            return null;
        }
        p010B3.C0071b c0071b3 = p014C3.AbstractC0145b.f390a;
        if (p154k3.AbstractC1803h.m3775a(c0071b2, c0071b3)) {
            return null;
        }
        p010B3.C0071b c0071b4 = p014C3.AbstractC0145b.f391b;
        if (p154k3.AbstractC1803h.m3775a(c0071b2, c0071b4)) {
            return null;
        }
        p010B3.C0071b c0071b5 = p014C3.AbstractC0145b.f394e;
        c0071b2.getClass();
        p154k3.AbstractC1803h.m3779e(c0071b5, "suffix");
        int mo310b = c0071b2.mo310b();
        byte[] bArr = c0071b5.f231l;
        if (c0071b2.mo317k(mo310b - bArr.length, c0071b5, bArr.length) && (c0071b2.mo310b() == 2 || c0071b2.mo317k(c0071b2.mo310b() - 3, c0071b3, 1) || c0071b2.mo317k(c0071b2.mo310b() - 3, c0071b4, 1))) {
            return null;
        }
        int m307i = p010B3.C0071b.m307i(c0071b2, c0071b3);
        if (m307i == -1) {
            m307i = p010B3.C0071b.m307i(c0071b2, c0071b4);
        }
        if (m307i == 2 && m339g() != null) {
            if (c0071b2.mo310b() == 3) {
                return null;
            }
            return new p010B3.C0081l(p010B3.C0071b.m308m(c0071b2, 0, 3, 1));
        }
        if (m307i == 1) {
            p154k3.AbstractC1803h.m3779e(c0071b4, "prefix");
            if (c0071b2.mo317k(0, c0071b4, c0071b4.f231l.length)) {
                return null;
            }
        }
        if (m307i != -1 || m339g() == null) {
            return m307i == -1 ? new p010B3.C0081l(c0071b) : m307i == 0 ? new p010B3.C0081l(p010B3.C0071b.m308m(c0071b2, 0, 1, 1)) : new p010B3.C0081l(p010B3.C0071b.m308m(c0071b2, 0, m307i, 1));
        }
        if (c0071b2.mo310b() == 2) {
            return null;
        }
        return new p010B3.C0081l(p010B3.C0071b.m308m(c0071b2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p010B3.C0081l c0081l = (p010B3.C0081l) obj;
        p154k3.AbstractC1803h.m3779e(c0081l, "other");
        return this.f256l.compareTo(c0081l.f256l);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, B3.a] */
    /* renamed from: d */
    public final p010B3.C0081l m336d(java.lang.String str) {
        p154k3.AbstractC1803h.m3779e(str, "child");
        ?? obj = new java.lang.Object();
        obj.m305p(str);
        return p014C3.AbstractC0145b.m496b(this, p014C3.AbstractC0145b.m498d(obj, false), false);
    }

    /* renamed from: e */
    public final java.io.File m337e() {
        return new java.io.File(this.f256l.m319n());
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p010B3.C0081l) && p154k3.AbstractC1803h.m3775a(((p010B3.C0081l) obj).f256l, this.f256l);
    }

    /* renamed from: f */
    public final java.nio.file.Path m338f() {
        java.nio.file.Path path = java.nio.file.Paths.get(this.f256l.m319n(), new java.lang.String[0]);
        p154k3.AbstractC1803h.m3778d(path, "get(toString())");
        return path;
    }

    /* renamed from: g */
    public final java.lang.Character m339g() {
        p010B3.C0071b c0071b = p014C3.AbstractC0145b.f390a;
        p010B3.C0071b c0071b2 = this.f256l;
        if (p010B3.C0071b.m306e(c0071b2, c0071b) != -1 || c0071b2.mo310b() < 2 || c0071b2.mo314g(1) != 58) {
            return null;
        }
        char mo314g = (char) c0071b2.mo314g(0);
        if (('a' > mo314g || mo314g >= '{') && ('A' > mo314g || mo314g >= '[')) {
            return null;
        }
        return java.lang.Character.valueOf(mo314g);
    }

    public final int hashCode() {
        return this.f256l.hashCode();
    }

    public final java.lang.String toString() {
        return this.f256l.m319n();
    }
}
