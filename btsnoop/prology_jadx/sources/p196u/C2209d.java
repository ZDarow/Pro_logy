package p196u;

/* renamed from: u.d */
/* loaded from: classes.dex */
public class C2209d extends p196u.AbstractC2212g {

    /* renamed from: t */
    public static java.lang.Class f8816t = null;

    /* renamed from: u */
    public static java.lang.reflect.Constructor f8817u = null;

    /* renamed from: v */
    public static java.lang.reflect.Method f8818v = null;

    /* renamed from: w */
    public static java.lang.reflect.Method f8819w = null;

    /* renamed from: x */
    public static boolean f8820x = false;

    /* renamed from: m */
    public final java.lang.Class f8821m;

    /* renamed from: n */
    public final java.lang.reflect.Constructor f8822n;

    /* renamed from: o */
    public final java.lang.reflect.Method f8823o;

    /* renamed from: p */
    public final java.lang.reflect.Method f8824p;

    /* renamed from: q */
    public final java.lang.reflect.Method f8825q;

    /* renamed from: r */
    public final java.lang.reflect.Method f8826r;

    /* renamed from: s */
    public final java.lang.reflect.Method f8827s;

    public C2209d() {
        super(0);
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.Class<?> cls = null;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = m4393x(cls2);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls3, android.graphics.fonts.FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = mo4403y(cls2);
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e4) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f8821m = cls;
        this.f8822n = constructor;
        this.f8823o = method2;
        this.f8824p = method3;
        this.f8825q = method4;
        this.f8826r = method5;
        this.f8827s = method;
    }

    /* renamed from: r */
    public static boolean m4391r(java.lang.Object obj, java.lang.String str, int i4, boolean z4) {
        m4392u();
        try {
            return ((java.lang.Boolean) f8818v.invoke(obj, str, java.lang.Integer.valueOf(i4), java.lang.Boolean.valueOf(z4))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    /* renamed from: u */
    public static void m4392u() {
        java.lang.reflect.Method method;
        java.lang.Class<?> cls;
        java.lang.reflect.Method method2;
        if (f8820x) {
            return;
        }
        f8820x = true;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e4) {
            android.util.Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f8817u = constructor;
        f8816t = cls;
        f8818v = method2;
        f8819w = method;
    }

    /* renamed from: x */
    public static java.lang.reflect.Method m4393x(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls2, java.lang.Boolean.TYPE, cls2, cls2, cls2, android.graphics.fonts.FontVariationAxis[].class);
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: b */
    public final android.graphics.Typeface mo4394b(android.content.Context context, p192t.C2159b c2159b, android.content.res.Resources resources, int i4) {
        if (m4401v()) {
            java.lang.Object m4402w = m4402w();
            if (m4402w == null) {
                return null;
            }
            for (p192t.C2160c c2160c : c2159b.f8596a) {
                if (!m4398q(context, m4402w, c2160c.f8597a, c2160c.f8601e, c2160c.f8598b, c2160c.f8599c ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(c2160c.f8600d))) {
                    m4397p(m4402w);
                    return null;
                }
            }
            if (m4400t(m4402w)) {
                return mo4399s(m4402w);
            }
            return null;
        }
        m4392u();
        try {
            java.lang.Object newInstance = f8817u.newInstance(null);
            for (p192t.C2160c c2160c2 : c2159b.f8596a) {
                java.io.File m4420d = p196u.AbstractC2213h.m4420d(context);
                if (m4420d == null) {
                    return null;
                }
                try {
                    if (p196u.AbstractC2213h.m4418b(m4420d, resources, c2160c2.f8602f) && m4391r(newInstance, m4420d.getPath(), c2160c2.f8598b, c2160c2.f8599c)) {
                        m4420d.delete();
                    }
                } catch (java.lang.RuntimeException unused) {
                } catch (java.lang.Throwable th) {
                    m4420d.delete();
                    throw th;
                }
                m4420d.delete();
                return null;
            }
            m4392u();
            try {
                java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f8816t, 1);
                java.lang.reflect.Array.set(newInstance2, 0, newInstance);
                return (android.graphics.Typeface) f8819w.invoke(null, newInstance2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e4) {
                throw new java.lang.RuntimeException(e4);
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e5) {
            throw new java.lang.RuntimeException(e5);
        }
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: d */
    public final android.graphics.Typeface mo4395d(android.content.Context context, p219z.C2437h[] c2437hArr, int i4) {
        android.graphics.Typeface mo4399s;
        boolean z4;
        if (c2437hArr.length < 1) {
            return null;
        }
        if (m4401v()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (p219z.C2437h c2437h : c2437hArr) {
                if (c2437h.f9577e == 0) {
                    android.net.Uri uri = c2437h.f9573a;
                    if (hashMap.containsKey(uri)) {
                        continue;
                    } else {
                        java.nio.MappedByteBuffer mappedByteBuffer = null;
                        try {
                            android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
                            if (openFileDescriptor != null) {
                                try {
                                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                                    try {
                                        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                                        java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                        fileInputStream.close();
                                        openFileDescriptor.close();
                                        mappedByteBuffer = map;
                                    } finally {
                                        break;
                                    }
                                } finally {
                                    break;
                                }
                            } else if (openFileDescriptor != null) {
                                openFileDescriptor.close();
                            }
                        } catch (java.io.IOException unused) {
                        }
                        hashMap.put(uri, mappedByteBuffer);
                    }
                }
            }
            java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
            java.lang.Object m4402w = m4402w();
            if (m4402w == null) {
                return null;
            }
            int length = c2437hArr.length;
            int i5 = 0;
            boolean z5 = false;
            while (i5 < length) {
                p219z.C2437h c2437h2 = c2437hArr[i5];
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) unmodifiableMap.get(c2437h2.f9573a);
                if (byteBuffer != null) {
                    try {
                        z4 = ((java.lang.Boolean) this.f8824p.invoke(m4402w, byteBuffer, java.lang.Integer.valueOf(c2437h2.f9574b), null, java.lang.Integer.valueOf(c2437h2.f9575c), java.lang.Integer.valueOf(c2437h2.f9576d ? 1 : 0))).booleanValue();
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                        z4 = false;
                    }
                    if (!z4) {
                        m4397p(m4402w);
                        return null;
                    }
                    z5 = true;
                }
                i5++;
                z5 = z5;
            }
            if (!z5) {
                m4397p(m4402w);
                return null;
            }
            if (m4400t(m4402w) && (mo4399s = mo4399s(m4402w)) != null) {
                return android.graphics.Typeface.create(mo4399s, i4);
            }
            return null;
        }
        p219z.C2437h mo4408h = mo4408h(c2437hArr, i4);
        try {
            android.os.ParcelFileDescriptor openFileDescriptor2 = context.getContentResolver().openFileDescriptor(mo4408h.f9573a, "r", null);
            if (openFileDescriptor2 == null) {
                if (openFileDescriptor2 != null) {
                    openFileDescriptor2.close();
                }
                return null;
            }
            try {
                android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor2.getFileDescriptor()).setWeight(mo4408h.f9575c).setItalic(mo4408h.f9576d).build();
                openFileDescriptor2.close();
                return build;
            } finally {
            }
        } catch (java.io.IOException unused3) {
            return null;
        }
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: f */
    public final android.graphics.Typeface mo4396f(android.content.Context context, android.content.res.Resources resources, int i4, java.lang.String str, int i5) {
        if (!m4401v()) {
            return super.mo4396f(context, resources, i4, str, i5);
        }
        java.lang.Object m4402w = m4402w();
        if (m4402w == null) {
            return null;
        }
        if (!m4398q(context, m4402w, str, 0, -1, -1, null)) {
            m4397p(m4402w);
            return null;
        }
        if (m4400t(m4402w)) {
            return mo4399s(m4402w);
        }
        return null;
    }

    /* renamed from: p */
    public final void m4397p(java.lang.Object obj) {
        try {
            this.f8826r.invoke(obj, null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    public final boolean m4398q(android.content.Context context, java.lang.Object obj, java.lang.String str, int i4, int i5, int i6, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.f8823o.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public android.graphics.Typeface mo4399s(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f8821m, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.f8827s.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public final boolean m4400t(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.f8825q.invoke(obj, null)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: v */
    public final boolean m4401v() {
        java.lang.reflect.Method method = this.f8823o;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: w */
    public final java.lang.Object m4402w() {
        try {
            return this.f8822n.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: y */
    public java.lang.reflect.Method mo4403y(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
