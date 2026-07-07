package C3;

import B2.I;
import B3.l;
import B3.p;
import B3.u;
import L.k;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import k3.i;
import p1.AbstractC0462a;
import q1.C0494a;

/* loaded from: classes.dex */
public final class c extends i implements j3.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f387m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f388n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, Object obj) {
        super(0);
        this.f387m = i4;
        this.f388n = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // j3.a
    public final Object c() {
        int m02;
        long c4;
        Iterator it;
        p f4;
        Z2.b bVar;
        Z2.b bVar2;
        Z2.b bVar3;
        Z2.b bVar4 = null;
        Object obj = this.f388n;
        switch (this.f387m) {
            case 0:
                l lVar = d.f389c;
                ClassLoader classLoader = (ClassLoader) obj;
                Enumeration<URL> resources = classLoader.getResources("");
                k3.h.d(resources, "getResources(\"\")");
                ArrayList<URL> list = Collections.list(resources);
                k3.h.d(list, "list(this)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    l lVar2 = d.f389c;
                    k3.h.d(url, "it");
                    if (k3.h.a(url.getProtocol(), "file")) {
                        B3.i iVar = B3.f.f242a;
                        String str = l.f250m;
                        bVar3 = new Z2.b(iVar, F1.g.v(new File(url.toURI())));
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 != null) {
                        arrayList.add(bVar3);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                k3.h.d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
                ArrayList list2 = Collections.list(resources2);
                k3.h.d(list2, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    URL url2 = (URL) it2.next();
                    l lVar3 = d.f389c;
                    k3.h.d(url2, "it");
                    String url3 = url2.toString();
                    k3.h.d(url3, "toString()");
                    if (q3.i.p0(url3, "jar:file:") && (m02 = q3.i.m0(url3, "!")) != -1) {
                        String str2 = l.f250m;
                        String substring = url3.substring(4, m02);
                        k3.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        l v4 = F1.g.v(new File(URI.create(substring)));
                        B3.i iVar2 = B3.f.f242a;
                        k3.h.e(iVar2, "fileSystem");
                        B3.h e4 = iVar2.e(v4);
                        try {
                            c4 = e4.c() - 22;
                        } finally {
                        }
                        if (c4 < 0) {
                            throw new IOException("not a zip: size=" + e4.c());
                        }
                        it = it2;
                        long max = Math.max(c4 - 65536, 0L);
                        do {
                            p f5 = AbstractC0462a.f(e4.e(c4));
                            try {
                                if (f5.a() == 101010256) {
                                    int c5 = f5.c() & 65535;
                                    int c6 = f5.c() & 65535;
                                    long c7 = f5.c() & 65535;
                                    if (c7 != (f5.c() & 65535) || c5 != 0 || c6 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    f5.g(4L);
                                    int c8 = f5.c() & 65535;
                                    I i4 = new I(c8, c7, f5.a() & 4294967295L);
                                    f5.e(c8);
                                    f5.close();
                                    long j4 = c4 - 20;
                                    long j5 = 0;
                                    if (j4 > 0) {
                                        p f6 = AbstractC0462a.f(e4.e(j4));
                                        try {
                                            if (f6.a() == 117853008) {
                                                int a4 = f6.a();
                                                long b4 = f6.b();
                                                if (f6.a() != 1 || a4 != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                f4 = AbstractC0462a.f(e4.e(b4));
                                                try {
                                                    int a5 = f4.a();
                                                    if (a5 != 101075792) {
                                                        throw new IOException("bad zip: expected " + a.b(101075792) + " but was " + a.b(a5));
                                                    }
                                                    f4.g(12L);
                                                    int a6 = f4.a();
                                                    int a7 = f4.a();
                                                    long b5 = f4.b();
                                                    if (b5 != f4.b() || a6 != 0 || a7 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    f4.g(8L);
                                                    I i5 = new I(c8, b5, f4.b());
                                                    AbstractC0462a.q(f4, null);
                                                    i4 = i5;
                                                } finally {
                                                }
                                            }
                                            AbstractC0462a.q(f6, null);
                                        } finally {
                                        }
                                    }
                                    long j6 = i4.f123b;
                                    ArrayList arrayList3 = new ArrayList();
                                    f4 = AbstractC0462a.f(e4.e(j6));
                                    try {
                                        long j7 = i4.f122a;
                                        while (j5 < j7) {
                                            e c9 = a.c(f4);
                                            long j8 = j7;
                                            if (c9.f395e >= j6) {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            l lVar4 = d.f389c;
                                            if (L1.g.f(c9.f391a)) {
                                                arrayList3.add(c9);
                                            }
                                            j5++;
                                            j7 = j8;
                                        }
                                        bVar = null;
                                        AbstractC0462a.q(f4, null);
                                        u uVar = new u(v4, iVar2, a.a(arrayList3));
                                        AbstractC0462a.q(e4, null);
                                        bVar2 = new Z2.b(uVar, d.f389c);
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } finally {
                                            AbstractC0462a.q(f4, th);
                                        }
                                    }
                                } else {
                                    f5.close();
                                    c4--;
                                }
                            } catch (Throwable th2) {
                                f5.close();
                                throw th2;
                            }
                        } while (c4 >= max);
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    bVar2 = bVar4;
                    bVar = bVar2;
                    it = it2;
                    if (bVar2 != null) {
                        arrayList2.add(bVar2);
                    }
                    bVar4 = bVar;
                    it2 = it;
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(arrayList2);
                return arrayList4;
            case 1:
                File file = (File) ((L.b) obj).c();
                if (h3.a.Q(file).equals("preferences_pb")) {
                    String str3 = l.f250m;
                    File absoluteFile = file.getAbsoluteFile();
                    k3.h.d(absoluteFile, "file.absoluteFile");
                    return F1.g.v(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                ((O.d) obj).getClass();
                throw new IllegalStateException("Can't access ViewModels from detached fragment");
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                C0494a c0494a = (C0494a) obj;
                Class<?> loadClass = c0494a.f7941a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                k3.h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = c0494a.f7941a.loadClass("androidx.window.extensions.WindowExtensions");
                k3.h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                k3.h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                r1.i iVar3 = (r1.i) obj;
                return BigInteger.valueOf(iVar3.f8087l).shiftLeft(32).or(BigInteger.valueOf(iVar3.f8088m)).shiftLeft(32).or(BigInteger.valueOf(iVar3.f8089n));
        }
    }
}
