package p014C3;

/* renamed from: C3.b */
/* loaded from: classes.dex */
public abstract class AbstractC0145b {

    /* renamed from: a */
    public static final p010B3.C0071b f390a;

    /* renamed from: b */
    public static final p010B3.C0071b f391b;

    /* renamed from: c */
    public static final p010B3.C0071b f392c;

    /* renamed from: d */
    public static final p010B3.C0071b f393d;

    /* renamed from: e */
    public static final p010B3.C0071b f394e;

    static {
        p010B3.C0071b c0071b = p010B3.C0071b.f230o;
        f390a = p101a.AbstractC0936a.m1812t("/");
        f391b = p101a.AbstractC0936a.m1812t("\\");
        f392c = p101a.AbstractC0936a.m1812t("/\\");
        f393d = p101a.AbstractC0936a.m1812t(".");
        f394e = p101a.AbstractC0936a.m1812t("..");
    }

    /* renamed from: a */
    public static final int m495a(p010B3.C0081l c0081l) {
        if (c0081l.f256l.mo310b() == 0) {
            return -1;
        }
        p010B3.C0071b c0071b = c0081l.f256l;
        if (c0071b.mo314g(0) != 47) {
            if (c0071b.mo314g(0) != 92) {
                if (c0071b.mo310b() <= 2 || c0071b.mo314g(1) != 58 || c0071b.mo314g(2) != 92) {
                    return -1;
                }
                char mo314g = (char) c0071b.mo314g(0);
                return (('a' > mo314g || mo314g >= '{') && ('A' > mo314g || mo314g >= '[')) ? -1 : 3;
            }
            if (c0071b.mo310b() > 2 && c0071b.mo314g(1) == 92) {
                p010B3.C0071b c0071b2 = f391b;
                p154k3.AbstractC1803h.m3779e(c0071b2, "other");
                int mo312d = c0071b.mo312d(c0071b2.f231l, 2);
                return mo312d == -1 ? c0071b.mo310b() : mo312d;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, B3.a] */
    /* renamed from: b */
    public static final p010B3.C0081l m496b(p010B3.C0081l c0081l, p010B3.C0081l c0081l2, boolean z4) {
        p154k3.AbstractC1803h.m3779e(c0081l, "<this>");
        p154k3.AbstractC1803h.m3779e(c0081l2, "child");
        if (m495a(c0081l2) != -1 || c0081l2.m339g() != null) {
            return c0081l2;
        }
        p010B3.C0071b m497c = m497c(c0081l);
        if (m497c == null && (m497c = m497c(c0081l2)) == null) {
            m497c = m500f(p010B3.C0081l.f255m);
        }
        ?? obj = new java.lang.Object();
        obj.m302m(c0081l.f256l);
        if (obj.f229m > 0) {
            obj.m302m(m497c);
        }
        obj.m302m(c0081l2.f256l);
        return m498d(obj, z4);
    }

    /* renamed from: c */
    public static final p010B3.C0071b m497c(p010B3.C0081l c0081l) {
        p010B3.C0071b c0071b = c0081l.f256l;
        p010B3.C0071b c0071b2 = f390a;
        if (p010B3.C0071b.m306e(c0071b, c0071b2) != -1) {
            return c0071b2;
        }
        p010B3.C0071b c0071b3 = f391b;
        if (p010B3.C0071b.m306e(c0081l.f256l, c0071b3) != -1) {
            return c0071b3;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
    
        if (p154k3.AbstractC1803h.m3775a(r4.get(r4.size() - 1), r9) != false) goto L88;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, B3.a] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p010B3.C0081l m498d(p010B3.C0070a r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p014C3.AbstractC0145b.m498d(B3.a, boolean):B3.l");
    }

    /* renamed from: e */
    public static final p010B3.C0071b m499e(byte b4) {
        if (b4 == 47) {
            return f390a;
        }
        if (b4 == 92) {
            return f391b;
        }
        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("not a directory separator: ", b4));
    }

    /* renamed from: f */
    public static final p010B3.C0071b m500f(java.lang.String str) {
        if (p154k3.AbstractC1803h.m3775a(str, "/")) {
            return f390a;
        }
        if (p154k3.AbstractC1803h.m3775a(str, "\\")) {
            return f391b;
        }
        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m153l("not a directory separator: ", str));
    }
}
