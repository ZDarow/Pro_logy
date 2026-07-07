package u;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import j3.p;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p1.AbstractC0462a;
import r3.AbstractC0514a;
import t.C0555b;
import w2.InterfaceC0608c;
import z.C0635h;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0579g implements InterfaceC0608c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8488l;

    public AbstractC0579g(int i4) {
        this.f8488l = i4;
        switch (i4) {
            case 1:
                return;
            default:
                new ConcurrentHashMap();
                return;
        }
    }

    public static boolean g(Method method, k3.e eVar) {
        Class a4 = eVar.a();
        k3.h.c(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(p pVar, AbstractC0514a abstractC0514a, AbstractC0514a abstractC0514a2) {
        try {
            w3.a.i(AbstractC0462a.C(((d3.b) pVar).g(abstractC0514a2, abstractC0514a)), Z2.g.f3186a, null);
        } catch (Throwable th) {
            abstractC0514a2.i(AbstractC0462a.s(th));
            throw th;
        }
    }

    public static final boolean o(String str, j3.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.c()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    @Override // w2.InterfaceC0608c
    public void a(String str, HashMap hashMap) {
        l().a(str, hashMap);
    }

    public abstract Typeface b(Context context, C0555b c0555b, Resources resources, int i4);

    @Override // w2.InterfaceC0608c
    public void c(Serializable serializable) {
        l().c(serializable);
    }

    public abstract Typeface d(Context context, C0635h[] c0635hArr, int i4);

    public Typeface e(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface f(Context context, Resources resources, int i4, String str, int i5) {
        File d4 = AbstractC0580h.d(context);
        if (d4 == null) {
            return null;
        }
        try {
            if (AbstractC0580h.b(d4, resources, i4)) {
                return Typeface.createFromFile(d4.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d4.delete();
        }
    }

    public C0635h h(C0635h[] c0635hArr, int i4) {
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z4 = (i4 & 2) != 0;
        C0635h c0635h = null;
        int i6 = Integer.MAX_VALUE;
        for (C0635h c0635h2 : c0635hArr) {
            int abs = (Math.abs(c0635h2.f9211c - i5) * 2) + (c0635h2.f9212d == z4 ? 0 : 1);
            if (c0635h == null || i6 > abs) {
                c0635h = c0635h2;
                i6 = abs;
            }
        }
        return c0635h;
    }

    public abstract Object i(String str);

    public abstract String j();

    public boolean k() {
        return Boolean.TRUE.equals(i("noResult"));
    }

    public abstract InterfaceC0608c l();

    public abstract boolean m();

    public String toString() {
        switch (this.f8488l) {
            case 1:
                return j() + " " + ((String) i("sql")) + " " + ((List) i("arguments"));
            default:
                return super.toString();
        }
    }
}
