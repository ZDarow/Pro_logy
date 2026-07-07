package p196u;

/* renamed from: u.g */
/* loaded from: classes.dex */
public abstract class AbstractC2212g implements p208w2.InterfaceC2337c {

    /* renamed from: l */
    public final /* synthetic */ int f8828l;

    public AbstractC2212g(int i4) {
        this.f8828l = i4;
        switch (i4) {
            case 1:
                return;
            default:
                new java.util.concurrent.ConcurrentHashMap();
                return;
        }
    }

    /* renamed from: g */
    public static boolean m4409g(java.lang.reflect.Method method, p154k3.C1800e c1800e) {
        java.lang.Class mo3773a = c1800e.mo3773a();
        p154k3.AbstractC1803h.m3777c(mo3773a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(mo3773a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static void m4410n(p149j3.InterfaceC1741p interfaceC1741p, p187r3.AbstractC2098a abstractC2098a, p187r3.AbstractC2098a abstractC2098a2) {
        try {
            p209w3.AbstractC2339a.m4546i(p176p1.AbstractC1949a.m3902C(((p120d3.AbstractC1292b) interfaceC1741p).mo659g(abstractC2098a2, abstractC2098a)), p100Z2.C0934g.f3298a, null);
        } catch (java.lang.Throwable th) {
            abstractC2098a2.mo2836i(p176p1.AbstractC1949a.m3942s(th));
            throw th;
        }
    }

    /* renamed from: o */
    public static final boolean m4411o(java.lang.String str, p149j3.InterfaceC1726a interfaceC1726a) {
        try {
            boolean booleanValue = ((java.lang.Boolean) interfaceC1726a.mo501c()).booleanValue();
            if (!booleanValue && str != null) {
                android.util.Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (java.lang.ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            android.util.Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (java.lang.NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            android.util.Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    @Override // p208w2.InterfaceC2337c
    /* renamed from: a */
    public void mo686a(java.lang.String str, java.util.HashMap hashMap) {
        mo4415l().mo686a(str, hashMap);
    }

    /* renamed from: b */
    public abstract android.graphics.Typeface mo4394b(android.content.Context context, p192t.C2159b c2159b, android.content.res.Resources resources, int i4);

    @Override // p208w2.InterfaceC2337c
    /* renamed from: c */
    public void mo687c(java.io.Serializable serializable) {
        mo4415l().mo687c(serializable);
    }

    /* renamed from: d */
    public abstract android.graphics.Typeface mo4395d(android.content.Context context, p219z.C2437h[] c2437hArr, int i4);

    /* renamed from: e */
    public android.graphics.Typeface mo4407e(android.content.Context context, java.util.List list, int i4) {
        throw new java.lang.IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* renamed from: f */
    public android.graphics.Typeface mo4396f(android.content.Context context, android.content.res.Resources resources, int i4, java.lang.String str, int i5) {
        java.io.File m4420d = p196u.AbstractC2213h.m4420d(context);
        if (m4420d == null) {
            return null;
        }
        try {
            if (p196u.AbstractC2213h.m4418b(m4420d, resources, i4)) {
                return android.graphics.Typeface.createFromFile(m4420d.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            m4420d.delete();
        }
    }

    /* renamed from: h */
    public p219z.C2437h mo4408h(p219z.C2437h[] c2437hArr, int i4) {
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z4 = (i4 & 2) != 0;
        p219z.C2437h c2437h = null;
        int i6 = Integer.MAX_VALUE;
        for (p219z.C2437h c2437h2 : c2437hArr) {
            int abs = (java.lang.Math.abs(c2437h2.f9575c - i5) * 2) + (c2437h2.f9576d == z4 ? 0 : 1);
            if (c2437h == null || i6 > abs) {
                c2437h = c2437h2;
                i6 = abs;
            }
        }
        return c2437h;
    }

    /* renamed from: i */
    public abstract java.lang.Object mo4412i(java.lang.String str);

    /* renamed from: j */
    public abstract java.lang.String mo4413j();

    /* renamed from: k */
    public boolean mo4414k() {
        return java.lang.Boolean.TRUE.equals(mo4412i("noResult"));
    }

    /* renamed from: l */
    public abstract p208w2.InterfaceC2337c mo4415l();

    /* renamed from: m */
    public abstract boolean mo4416m();

    public java.lang.String toString() {
        switch (this.f8828l) {
            case 1:
                return mo4413j() + " " + ((java.lang.String) mo4412i("sql")) + " " + ((java.util.List) mo4412i("arguments"));
            default:
                return super.toString();
        }
    }
}
