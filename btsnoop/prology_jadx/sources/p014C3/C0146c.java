package p014C3;

/* renamed from: C3.c */
/* loaded from: classes.dex */
public final class C0146c extends p154k3.AbstractC1804i implements p149j3.InterfaceC1726a {

    /* renamed from: m */
    public final /* synthetic */ int f395m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0146c(int i4, java.lang.Object obj) {
        super(0);
        this.f395m = i4;
        this.f396n = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p149j3.InterfaceC1726a
    /* renamed from: c */
    public final java.lang.Object mo501c() {
        int m4079m0;
        long m326c;
        java.util.Iterator it;
        p010B3.C0085p m3932f;
        p100Z2.C0929b c0929b;
        p100Z2.C0929b c0929b2;
        p100Z2.C0929b c0929b3;
        p100Z2.C0929b c0929b4 = null;
        java.lang.Object obj = this.f396n;
        switch (this.f395m) {
            case 0:
                p010B3.C0081l c0081l = p014C3.C0147d.f397c;
                java.lang.ClassLoader classLoader = (java.lang.ClassLoader) obj;
                java.util.Enumeration<java.net.URL> resources = classLoader.getResources("");
                p154k3.AbstractC1803h.m3778d(resources, "getResources(\"\")");
                java.util.ArrayList<java.net.URL> list = java.util.Collections.list(resources);
                p154k3.AbstractC1803h.m3778d(list, "list(this)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.net.URL url : list) {
                    p010B3.C0081l c0081l2 = p014C3.C0147d.f397c;
                    p154k3.AbstractC1803h.m3778d(url, "it");
                    if (p154k3.AbstractC1803h.m3775a(url.getProtocol(), "file")) {
                        p010B3.C0078i c0078i = p010B3.AbstractC0075f.f247a;
                        java.lang.String str = p010B3.C0081l.f255m;
                        c0929b3 = new p100Z2.C0929b(c0078i, p025F1.C0215g.m585v(new java.io.File(url.toURI())));
                    } else {
                        c0929b3 = null;
                    }
                    if (c0929b3 != null) {
                        arrayList.add(c0929b3);
                    }
                }
                java.util.Enumeration<java.net.URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                p154k3.AbstractC1803h.m3778d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
                java.util.ArrayList list2 = java.util.Collections.list(resources2);
                p154k3.AbstractC1803h.m3778d(list2, "list(this)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    java.net.URL url2 = (java.net.URL) it2.next();
                    p010B3.C0081l c0081l3 = p014C3.C0147d.f397c;
                    p154k3.AbstractC1803h.m3778d(url2, "it");
                    java.lang.String url3 = url2.toString();
                    p154k3.AbstractC1803h.m3778d(url3, "toString()");
                    if (p182q3.AbstractC2032i.m4082p0(url3, "jar:file:") && (m4079m0 = p182q3.AbstractC2032i.m4079m0(url3, "!")) != -1) {
                        java.lang.String str2 = p010B3.C0081l.f255m;
                        java.lang.String substring = url3.substring(4, m4079m0);
                        p154k3.AbstractC1803h.m3778d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        p010B3.C0081l m585v = p025F1.C0215g.m585v(new java.io.File(java.net.URI.create(substring)));
                        p010B3.C0078i c0078i2 = p010B3.AbstractC0075f.f247a;
                        p154k3.AbstractC1803h.m3779e(c0078i2, "fileSystem");
                        p010B3.C0077h m330e = c0078i2.m330e(m585v);
                        try {
                            m326c = m330e.m326c() - 22;
                        } finally {
                        }
                        if (m326c < 0) {
                            throw new java.io.IOException("not a zip: size=" + m330e.m326c());
                        }
                        it = it2;
                        long max = java.lang.Math.max(m326c - 65536, 0L);
                        do {
                            p010B3.C0085p m3932f2 = p176p1.AbstractC1949a.m3932f(m330e.m327e(m326c));
                            try {
                                if (m3932f2.m341a() == 101010256) {
                                    int m343c = m3932f2.m343c() & 65535;
                                    int m343c2 = m3932f2.m343c() & 65535;
                                    long m343c3 = m3932f2.m343c() & 65535;
                                    if (m343c3 != (m3932f2.m343c() & 65535) || m343c != 0 || m343c2 != 0) {
                                        throw new java.io.IOException("unsupported zip: spanned");
                                    }
                                    m3932f2.m346g(4L);
                                    int m343c4 = m3932f2.m343c() & 65535;
                                    p009B2.C0038I c0038i = new p009B2.C0038I(m343c4, m343c3, m3932f2.m341a() & 4294967295L);
                                    m3932f2.m344e(m343c4);
                                    m3932f2.close();
                                    long j4 = m326c - 20;
                                    long j5 = 0;
                                    if (j4 > 0) {
                                        p010B3.C0085p m3932f3 = p176p1.AbstractC1949a.m3932f(m330e.m327e(j4));
                                        try {
                                            if (m3932f3.m341a() == 117853008) {
                                                int m341a = m3932f3.m341a();
                                                long m342b = m3932f3.m342b();
                                                if (m3932f3.m341a() != 1 || m341a != 0) {
                                                    throw new java.io.IOException("unsupported zip: spanned");
                                                }
                                                m3932f = p176p1.AbstractC1949a.m3932f(m330e.m327e(m342b));
                                                try {
                                                    int m341a2 = m3932f.m341a();
                                                    if (m341a2 != 101075792) {
                                                        throw new java.io.IOException("bad zip: expected " + p014C3.AbstractC0144a.m491b(101075792) + " but was " + p014C3.AbstractC0144a.m491b(m341a2));
                                                    }
                                                    m3932f.m346g(12L);
                                                    int m341a3 = m3932f.m341a();
                                                    int m341a4 = m3932f.m341a();
                                                    long m342b2 = m3932f.m342b();
                                                    if (m342b2 != m3932f.m342b() || m341a3 != 0 || m341a4 != 0) {
                                                        throw new java.io.IOException("unsupported zip: spanned");
                                                    }
                                                    m3932f.m346g(8L);
                                                    p009B2.C0038I c0038i2 = new p009B2.C0038I(m343c4, m342b2, m3932f.m342b());
                                                    p176p1.AbstractC1949a.m3940q(m3932f, null);
                                                    c0038i = c0038i2;
                                                } finally {
                                                }
                                            }
                                            p176p1.AbstractC1949a.m3940q(m3932f3, null);
                                        } finally {
                                        }
                                    }
                                    long j6 = c0038i.f126b;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    m3932f = p176p1.AbstractC1949a.m3932f(m330e.m327e(j6));
                                    try {
                                        long j7 = c0038i.f125a;
                                        while (j5 < j7) {
                                            p014C3.C0148e m492c = p014C3.AbstractC0144a.m492c(m3932f);
                                            long j8 = j7;
                                            if (m492c.f403e >= j6) {
                                                throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            p010B3.C0081l c0081l4 = p014C3.C0147d.f397c;
                                            if (p046L1.C0363g.m812f(m492c.f399a)) {
                                                arrayList3.add(m492c);
                                            }
                                            j5++;
                                            j7 = j8;
                                        }
                                        c0929b = null;
                                        p176p1.AbstractC1949a.m3940q(m3932f, null);
                                        p010B3.C0090u c0090u = new p010B3.C0090u(m585v, c0078i2, p014C3.AbstractC0144a.m490a(arrayList3));
                                        p176p1.AbstractC1949a.m3940q(m330e, null);
                                        c0929b2 = new p100Z2.C0929b(c0090u, p014C3.C0147d.f397c);
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            throw th;
                                        } finally {
                                            p176p1.AbstractC1949a.m3940q(m3932f, th);
                                        }
                                    }
                                } else {
                                    m3932f2.close();
                                    m326c--;
                                }
                            } catch (java.lang.Throwable th2) {
                                m3932f2.close();
                                throw th2;
                            }
                        } while (m326c >= max);
                        throw new java.io.IOException("not a zip: end of central directory signature not found");
                    }
                    c0929b2 = c0929b4;
                    c0929b = c0929b2;
                    it = it2;
                    if (c0929b2 != null) {
                        arrayList2.add(c0929b2);
                    }
                    c0929b4 = c0929b;
                    it2 = it;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList2.size() + arrayList.size());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(arrayList2);
                return arrayList4;
            case 1:
                java.io.File file = (java.io.File) ((p044L.C0344b) obj).mo501c();
                if (p139h3.AbstractC1508a.m3334Q(file).equals("preferences_pb")) {
                    java.lang.String str3 = p010B3.C0081l.f255m;
                    java.io.File absoluteFile = file.getAbsoluteFile();
                    p154k3.AbstractC1803h.m3778d(absoluteFile, "file.absoluteFile");
                    return p025F1.C0215g.m585v(absoluteFile);
                }
                throw new java.lang.IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                ((p056O.DialogInterfaceOnCancelListenerC0476d) obj).getClass();
                throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                p180q1.C2022a c2022a = (p180q1.C2022a) obj;
                java.lang.Class<?> loadClass = c2022a.f8249a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                p154k3.AbstractC1803h.m3778d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                java.lang.reflect.Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                java.lang.Class<?> loadClass2 = c2022a.f8249a.loadClass("androidx.window.extensions.WindowExtensions");
                p154k3.AbstractC1803h.m3778d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                p154k3.AbstractC1803h.m3778d(declaredMethod, "getWindowExtensionsMethod");
                return java.lang.Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && java.lang.reflect.Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                p185r1.C2066i c2066i = (p185r1.C2066i) obj;
                return java.math.BigInteger.valueOf(c2066i.f8402l).shiftLeft(32).or(java.math.BigInteger.valueOf(c2066i.f8403m)).shiftLeft(32).or(java.math.BigInteger.valueOf(c2066i.f8404n));
        }
    }
}
