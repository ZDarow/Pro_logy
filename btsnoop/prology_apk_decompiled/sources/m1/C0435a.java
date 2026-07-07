package m1;

import a.AbstractC0110a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.prology.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC0451a;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0435a f7329d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7330e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f7333c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7332b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7331a = new HashMap();

    public C0435a(Context context) {
        this.f7333c = context.getApplicationContext();
    }

    public static C0435a c(Context context) {
        if (f7329d == null) {
            synchronized (f7330e) {
                try {
                    if (f7329d == null) {
                        f7329d = new C0435a(context);
                    }
                } finally {
                }
            }
        }
        return f7329d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f7333c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f7332b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0436b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 29) {
            z4 = AbstractC0451a.c();
        } else {
            try {
                if (AbstractC0110a.f3195h == null) {
                    AbstractC0110a.f3194g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0110a.f3195h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z4 = ((Boolean) AbstractC0110a.f3195h.invoke(null, Long.valueOf(AbstractC0110a.f3194g))).booleanValue();
            } catch (Exception e4) {
                AbstractC0110a.E("isTagEnabled", e4);
                z4 = false;
            }
        }
        if (z4) {
            try {
                Trace.beginSection(AbstractC0110a.Z(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f7331a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0436b interfaceC0436b = (InterfaceC0436b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a4 = interfaceC0436b.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b4 = interfaceC0436b.b(this.f7333c);
                hashSet.remove(cls);
                hashMap.put(cls, b4);
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        Trace.endSection();
    }
}
