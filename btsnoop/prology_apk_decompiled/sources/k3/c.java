package k3;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements o3.a, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public transient o3.a f7088l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7089m;

    /* renamed from: n, reason: collision with root package name */
    public final Class f7090n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7091o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7092p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7093q;

    public c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f7089m = obj;
        this.f7090n = cls;
        this.f7091o = str;
        this.f7092p = str2;
        this.f7093q = z4;
    }

    public abstract o3.a a();

    public final d d() {
        Class cls = this.f7090n;
        if (!this.f7093q) {
            return q.a(cls);
        }
        q.f7105a.getClass();
        return new j(cls);
    }
}
