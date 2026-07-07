package p154k3;

/* renamed from: k3.c */
/* loaded from: classes.dex */
public abstract class AbstractC1798c implements p173o3.InterfaceC1931a, java.io.Serializable {

    /* renamed from: l */
    public transient p173o3.InterfaceC1931a f7357l;

    /* renamed from: m */
    public final java.lang.Object f7358m;

    /* renamed from: n */
    public final java.lang.Class f7359n;

    /* renamed from: o */
    public final java.lang.String f7360o;

    /* renamed from: p */
    public final java.lang.String f7361p;

    /* renamed from: q */
    public final boolean f7362q;

    public AbstractC1798c(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z4) {
        this.f7358m = obj;
        this.f7359n = cls;
        this.f7360o = str;
        this.f7361p = str2;
        this.f7362q = z4;
    }

    /* renamed from: a */
    public abstract p173o3.InterfaceC1931a mo3771a();

    /* renamed from: d */
    public final p154k3.InterfaceC1799d m3772d() {
        java.lang.Class cls = this.f7359n;
        if (!this.f7362q) {
            return p154k3.AbstractC1812q.m3788a(cls);
        }
        p154k3.AbstractC1812q.f7375a.getClass();
        return new p154k3.C1805j(cls);
    }
}
