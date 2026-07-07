package p014C3;

/* renamed from: C3.d */
/* loaded from: classes.dex */
public final class C0147d extends p010B3.AbstractC0075f {

    /* renamed from: c */
    public static final p010B3.C0081l f397c;

    /* renamed from: b */
    public final p100Z2.C0932e f398b;

    static {
        java.lang.String str = p010B3.C0081l.f255m;
        f397c = p025F1.C0215g.m584u("/", false);
    }

    public C0147d(java.lang.ClassLoader classLoader) {
        this.f398b = new p100Z2.C0932e(new p014C3.C0146c(0, classLoader));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, B3.a] */
    @Override // p010B3.AbstractC0075f
    /* renamed from: b */
    public final p010B3.C0074e mo323b(p010B3.C0081l c0081l) {
        p010B3.C0081l m498d;
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        if (!p046L1.C0363g.m812f(c0081l)) {
            return null;
        }
        p010B3.C0081l c0081l2 = f397c;
        c0081l2.getClass();
        p154k3.AbstractC1803h.m3779e(c0081l, "child");
        p010B3.C0081l m496b = p014C3.AbstractC0145b.m496b(c0081l2, c0081l, true);
        int m495a = p014C3.AbstractC0145b.m495a(m496b);
        p010B3.C0071b c0071b = m496b.f256l;
        p010B3.C0081l c0081l3 = m495a == -1 ? null : new p010B3.C0081l(c0071b.mo318l(0, m495a));
        int m495a2 = p014C3.AbstractC0145b.m495a(c0081l2);
        p010B3.C0071b c0071b2 = c0081l2.f256l;
        if (!p154k3.AbstractC1803h.m3775a(c0081l3, m495a2 == -1 ? null : new p010B3.C0081l(c0071b2.mo318l(0, m495a2)))) {
            throw new java.lang.IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + m496b + " and " + c0081l2).toString());
        }
        java.util.ArrayList m333a = m496b.m333a();
        java.util.ArrayList m333a2 = c0081l2.m333a();
        int min = java.lang.Math.min(m333a.size(), m333a2.size());
        int i4 = 0;
        while (i4 < min && p154k3.AbstractC1803h.m3775a(m333a.get(i4), m333a2.get(i4))) {
            i4++;
        }
        if (i4 == min && c0071b.mo310b() == c0071b2.mo310b()) {
            java.lang.String str = p010B3.C0081l.f255m;
            m498d = p025F1.C0215g.m584u(".", false);
        } else {
            if (m333a2.subList(i4, m333a2.size()).indexOf(p014C3.AbstractC0145b.f394e) != -1) {
                throw new java.lang.IllegalArgumentException(("Impossible relative path to resolve: " + m496b + " and " + c0081l2).toString());
            }
            ?? obj = new java.lang.Object();
            p010B3.C0071b m497c = p014C3.AbstractC0145b.m497c(c0081l2);
            if (m497c == null && (m497c = p014C3.AbstractC0145b.m497c(m496b)) == null) {
                m497c = p014C3.AbstractC0145b.m500f(p010B3.C0081l.f255m);
            }
            int size = m333a2.size();
            for (int i5 = i4; i5 < size; i5++) {
                obj.m302m(p014C3.AbstractC0145b.f394e);
                obj.m302m(m497c);
            }
            int size2 = m333a.size();
            while (i4 < size2) {
                obj.m302m((p010B3.C0071b) m333a.get(i4));
                obj.m302m(m497c);
                i4++;
            }
            m498d = p014C3.AbstractC0145b.m498d(obj, false);
        }
        java.lang.String m319n = m498d.f256l.m319n();
        for (p100Z2.C0929b c0929b : (java.util.List) this.f398b.m1762a()) {
            p010B3.C0074e mo323b = ((p010B3.AbstractC0075f) c0929b.f3291l).mo323b(((p010B3.C0081l) c0929b.f3292m).m336d(m319n));
            if (mo323b != null) {
                return mo323b;
            }
        }
        return null;
    }
}
