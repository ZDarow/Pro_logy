package p071R2;

/* renamed from: R2.L */
/* loaded from: classes.dex */
public abstract class AbstractC0591L {

    /* renamed from: a */
    public static final /* synthetic */ p173o3.InterfaceC1933c[] f1857a;

    /* renamed from: b */
    public static final p044L.C0345c f1858b;

    static {
        p154k3.AbstractC1807l abstractC1807l = new p154k3.AbstractC1807l(p154k3.C1797b.f7356l, p071R2.AbstractC0591L.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        p154k3.AbstractC1812q.f7375a.getClass();
        f1857a = new p173o3.InterfaceC1933c[]{abstractC1807l};
        p044L.C0343a c0343a = p044L.C0343a.f1070m;
        p218y3.ExecutorC2420c executorC2420c = p187r3.AbstractC2074B.f8426b;
        p187r3.C2091T c2091t = new p187r3.C2091T(null);
        executorC2420c.getClass();
        p110b3.InterfaceC1195i m1772J = p101a.AbstractC0936a.m1772J(executorC2420c, c2091t);
        if (m1772J.mo678j(p187r3.C2129t.f8496m) == null) {
            m1772J = m1772J.mo676c(new p187r3.C2091T(null));
        }
        f1858b = new p044L.C0345c(c0343a, new p209w3.C2343e(m1772J));
    }

    /* renamed from: a */
    public static final p043K2.C0339o m1119a(android.content.Context context) {
        p043K2.C0339o c0339o;
        p044L.C0345c c0345c = f1858b;
        p173o3.InterfaceC1933c interfaceC1933c = f1857a[0];
        c0345c.getClass();
        p154k3.AbstractC1803h.m3779e(context, "thisRef");
        p154k3.AbstractC1803h.m3779e(interfaceC1933c, "property");
        p043K2.C0339o c0339o2 = c0345c.f1077d;
        if (c0339o2 != null) {
            return c0339o2;
        }
        synchronized (c0345c.f1076c) {
            try {
                if (c0345c.f1077d == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    p149j3.InterfaceC1737l interfaceC1737l = c0345c.f1074a;
                    p154k3.AbstractC1803h.m3778d(applicationContext, "applicationContext");
                    java.util.List list = (java.util.List) interfaceC1737l.mo661b(applicationContext);
                    p187r3.InterfaceC2130u interfaceC2130u = c0345c.f1075b;
                    p044L.C0344b c0344b = new p044L.C0344b(0, applicationContext, c0345c);
                    p154k3.AbstractC1803h.m3779e(list, "migrations");
                    p035I.C0265Q c0265q = new p035I.C0265Q(new p040K.C0316f(p010B3.AbstractC0075f.f247a, new p014C3.C0146c(1, c0344b)), p176p1.AbstractC1949a.m3904E(new p035I.C0280d(list, null)), new p046L1.C0363g(6, false), interfaceC2130u);
                    c0345c.f1077d = new p043K2.C0339o(1, new p043K2.C0339o(1, c0265q));
                }
                c0339o = c0345c.f1077d;
                p154k3.AbstractC1803h.m3776b(c0339o);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0339o;
    }

    /* renamed from: b */
    public static final boolean m1120b(java.lang.String str, java.lang.Object obj, java.util.Set set) {
        p154k3.AbstractC1803h.m3779e(str, "key");
        return set == null ? (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.String) || (obj instanceof java.lang.Double) : set.contains(str);
    }

    /* renamed from: c */
    public static final java.lang.Object m1121c(java.lang.Object obj, p025F1.C0215g c0215g) {
        if (!(obj instanceof java.lang.String)) {
            return obj;
        }
        java.lang.String str = (java.lang.String) obj;
        if (!p182q3.AbstractC2032i.m4082p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (!p182q3.AbstractC2032i.m4082p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return obj;
            }
            java.lang.String substring = str.substring(40);
            p154k3.AbstractC1803h.m3778d(substring, "substring(...)");
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(substring));
        }
        if (p182q3.AbstractC2032i.m4082p0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return obj;
        }
        java.lang.String substring2 = str.substring(40);
        p154k3.AbstractC1803h.m3778d(substring2, "substring(...)");
        c0215g.getClass();
        p154k3.AbstractC1803h.m3779e(substring2, "listString");
        java.lang.Object readObject = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(substring2, 0))).readObject();
        p154k3.AbstractC1803h.m3777c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : (java.util.List) readObject) {
            if (obj2 instanceof java.lang.String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
