package p162m1;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public final class C1870a {

    /* renamed from: d */
    public static volatile p162m1.C1870a f7608d;

    /* renamed from: e */
    public static final java.lang.Object f7609e = new java.lang.Object();

    /* renamed from: c */
    public final android.content.Context f7612c;

    /* renamed from: b */
    public final java.util.HashSet f7611b = new java.util.HashSet();

    /* renamed from: a */
    public final java.util.HashMap f7610a = new java.util.HashMap();

    public C1870a(android.content.Context context) {
        this.f7612c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static p162m1.C1870a m3851c(android.content.Context context) {
        if (f7608d == null) {
            synchronized (f7609e) {
                try {
                    if (f7608d == null) {
                        f7608d = new p162m1.C1870a(context);
                    }
                } finally {
                }
            }
        }
        return f7608d;
    }

    /* renamed from: a */
    public final void m3852a(android.os.Bundle bundle) {
        java.util.HashSet hashSet;
        java.lang.String string = this.f7612c.getString(com.prology.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f7611b;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(next);
                        if (p162m1.InterfaceC1871b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                java.util.Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m3853b((java.lang.Class) it2.next(), hashSet2);
                }
            } catch (java.lang.ClassNotFoundException e4) {
                throw new java.lang.RuntimeException(e4);
            }
        }
    }

    /* renamed from: b */
    public final void m3853b(java.lang.Class cls, java.util.HashSet hashSet) {
        boolean z4;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            z4 = p167n1.AbstractC1895a.m3879c();
        } else {
            try {
                if (p101a.AbstractC0936a.f3307h == null) {
                    p101a.AbstractC0936a.f3306g = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    p101a.AbstractC0936a.f3307h = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
                }
                z4 = ((java.lang.Boolean) p101a.AbstractC0936a.f3307h.invoke(null, java.lang.Long.valueOf(p101a.AbstractC0936a.f3306g))).booleanValue();
            } catch (java.lang.Exception e4) {
                p101a.AbstractC0936a.m1767E("isTagEnabled", e4);
                z4 = false;
            }
        }
        if (z4) {
            try {
                android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z(cls.getSimpleName()));
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new java.lang.IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        java.util.HashMap hashMap = this.f7610a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                p162m1.InterfaceC1871b interfaceC1871b = (p162m1.InterfaceC1871b) cls.getDeclaredConstructor(null).newInstance(null);
                java.util.List<java.lang.Class> mo2650a = interfaceC1871b.mo2650a();
                if (!mo2650a.isEmpty()) {
                    for (java.lang.Class cls2 : mo2650a) {
                        if (!hashMap.containsKey(cls2)) {
                            m3853b(cls2, hashSet);
                        }
                    }
                }
                java.lang.Object mo2651b = interfaceC1871b.mo2651b(this.f7612c);
                hashSet.remove(cls);
                hashMap.put(cls, mo2651b);
            } catch (java.lang.Throwable th2) {
                throw new java.lang.RuntimeException(th2);
            }
        }
        android.os.Trace.endSection();
    }
}
