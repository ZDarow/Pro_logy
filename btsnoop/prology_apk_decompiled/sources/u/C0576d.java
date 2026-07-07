package u;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t.C0555b;
import t.C0556c;
import z.C0635h;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0576d extends AbstractC0579g {

    /* renamed from: t, reason: collision with root package name */
    public static Class f8478t = null;

    /* renamed from: u, reason: collision with root package name */
    public static Constructor f8479u = null;

    /* renamed from: v, reason: collision with root package name */
    public static Method f8480v = null;
    public static Method w = null;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f8481x = false;

    /* renamed from: m, reason: collision with root package name */
    public final Class f8482m;

    /* renamed from: n, reason: collision with root package name */
    public final Constructor f8483n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f8484o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f8485p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f8486q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f8487r;
    public final Method s;

    public C0576d() {
        super(0);
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = x(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = y(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f8482m = cls;
        this.f8483n = constructor;
        this.f8484o = method2;
        this.f8485p = method3;
        this.f8486q = method4;
        this.f8487r = method5;
        this.s = method;
    }

    public static boolean r(Object obj, String str, int i4, boolean z4) {
        u();
        try {
            return ((Boolean) f8480v.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void u() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f8481x) {
            return;
        }
        f8481x = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f8479u = constructor;
        f8478t = cls;
        f8480v = method2;
        w = method;
    }

    public static Method x(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // u.AbstractC0579g
    public final Typeface b(Context context, C0555b c0555b, Resources resources, int i4) {
        if (v()) {
            Object w4 = w();
            if (w4 == null) {
                return null;
            }
            for (C0556c c0556c : c0555b.f8275a) {
                if (!q(context, w4, c0556c.f8276a, c0556c.f8280e, c0556c.f8277b, c0556c.f8278c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0556c.f8279d))) {
                    p(w4);
                    return null;
                }
            }
            if (t(w4)) {
                return s(w4);
            }
            return null;
        }
        u();
        try {
            Object newInstance = f8479u.newInstance(null);
            for (C0556c c0556c2 : c0555b.f8275a) {
                File d4 = AbstractC0580h.d(context);
                if (d4 == null) {
                    return null;
                }
                try {
                    if (AbstractC0580h.b(d4, resources, c0556c2.f8281f) && r(newInstance, d4.getPath(), c0556c2.f8277b, c0556c2.f8278c)) {
                        d4.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    d4.delete();
                    throw th;
                }
                d4.delete();
                return null;
            }
            u();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f8478t, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) w.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // u.AbstractC0579g
    public final Typeface d(Context context, C0635h[] c0635hArr, int i4) {
        Typeface s;
        boolean z4;
        if (c0635hArr.length < 1) {
            return null;
        }
        if (v()) {
            HashMap hashMap = new HashMap();
            for (C0635h c0635h : c0635hArr) {
                if (c0635h.f9213e == 0) {
                    Uri uri = c0635h.f9209a;
                    if (hashMap.containsKey(uri)) {
                        continue;
                    } else {
                        MappedByteBuffer mappedByteBuffer = null;
                        try {
                            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
                            if (openFileDescriptor != null) {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                    try {
                                        FileChannel channel = fileInputStream.getChannel();
                                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
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
                        } catch (IOException unused) {
                        }
                        hashMap.put(uri, mappedByteBuffer);
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object w4 = w();
            if (w4 == null) {
                return null;
            }
            int length = c0635hArr.length;
            int i5 = 0;
            boolean z5 = false;
            while (i5 < length) {
                C0635h c0635h2 = c0635hArr[i5];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0635h2.f9209a);
                if (byteBuffer != null) {
                    try {
                        z4 = ((Boolean) this.f8485p.invoke(w4, byteBuffer, Integer.valueOf(c0635h2.f9210b), null, Integer.valueOf(c0635h2.f9211c), Integer.valueOf(c0635h2.f9212d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z4 = false;
                    }
                    if (!z4) {
                        p(w4);
                        return null;
                    }
                    z5 = true;
                }
                i5++;
                z5 = z5;
            }
            if (!z5) {
                p(w4);
                return null;
            }
            if (t(w4) && (s = s(w4)) != null) {
                return Typeface.create(s, i4);
            }
            return null;
        }
        C0635h h4 = h(c0635hArr, i4);
        try {
            ParcelFileDescriptor openFileDescriptor2 = context.getContentResolver().openFileDescriptor(h4.f9209a, "r", null);
            if (openFileDescriptor2 == null) {
                if (openFileDescriptor2 != null) {
                    openFileDescriptor2.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor2.getFileDescriptor()).setWeight(h4.f9211c).setItalic(h4.f9212d).build();
                openFileDescriptor2.close();
                return build;
            } finally {
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    @Override // u.AbstractC0579g
    public final Typeface f(Context context, Resources resources, int i4, String str, int i5) {
        if (!v()) {
            return super.f(context, resources, i4, str, i5);
        }
        Object w4 = w();
        if (w4 == null) {
            return null;
        }
        if (!q(context, w4, str, 0, -1, -1, null)) {
            p(w4);
            return null;
        }
        if (t(w4)) {
            return s(w4);
        }
        return null;
    }

    public final void p(Object obj) {
        try {
            this.f8487r.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f8484o.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface s(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f8482m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.s.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean t(Object obj) {
        try {
            return ((Boolean) this.f8486q.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean v() {
        Method method = this.f8484o;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object w() {
        try {
            return this.f8483n.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method y(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
