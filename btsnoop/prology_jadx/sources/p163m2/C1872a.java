package p163m2;

/* renamed from: m2.a */
/* loaded from: classes.dex */
public final class C1872a implements p047L2.InterfaceC0389s {

    /* renamed from: l */
    public boolean f7613l;

    /* renamed from: m */
    public java.lang.String[] f7614m;

    /* renamed from: a */
    public final boolean m3854a() {
        java.lang.String[] strArr = this.f7614m;
        if (strArr.length <= 0) {
            return true;
        }
        java.lang.String str = strArr[0];
        java.lang.ref.WeakReference weakReference = p101a.AbstractC0936a.f3302c;
        if (weakReference == null) {
            p154k3.AbstractC1803h.m3783i("context");
            throw null;
        }
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context != null) {
            return p176p1.AbstractC1949a.m3938o(context, str) == 0;
        }
        throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    /* renamed from: b */
    public final void m3855b() {
        java.lang.ref.WeakReference weakReference = p101a.AbstractC0936a.f3303d;
        if (weakReference == null) {
            p154k3.AbstractC1803h.m3783i("activity");
            throw null;
        }
        android.app.Activity activity = (android.app.Activity) weakReference.get();
        if (activity == null) {
            throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
        }
        p176p1.AbstractC1949a.m3909L(activity, this.f7614m, 88560);
    }

    @Override // p047L2.InterfaceC0389s
    /* renamed from: c */
    public final boolean mo648c(int i4, java.lang.String[] strArr, int[] iArr) {
        p154k3.AbstractC1803h.m3779e(strArr, "permissions");
        p154k3.AbstractC1803h.m3779e(iArr, "grantResults");
        if (88560 != i4) {
            return false;
        }
        boolean z4 = iArr.length != 0 && iArr[0] == 0;
        java.lang.ref.WeakReference weakReference = p101a.AbstractC0936a.f3305f;
        if (weakReference == null) {
            p154k3.AbstractC1803h.m3783i("result");
            throw null;
        }
        p047L2.InterfaceC0386p interfaceC0386p = (p047L2.InterfaceC0386p) weakReference.get();
        if (interfaceC0386p == null) {
            throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
        }
        if (z4) {
            interfaceC0386p.mo742b(java.lang.Boolean.TRUE);
        } else if (this.f7613l) {
            java.lang.ref.WeakReference weakReference2 = p101a.AbstractC0936a.f3303d;
            if (weakReference2 == null) {
                p154k3.AbstractC1803h.m3783i("activity");
                throw null;
            }
            android.app.Activity activity = (android.app.Activity) weakReference2.get();
            if (activity == null) {
                throw new java.lang.Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
            }
            java.lang.String[] strArr2 = this.f7614m;
            if (p176p1.AbstractC1949a.m3912O(activity, strArr2[0]) || p176p1.AbstractC1949a.m3912O(activity, strArr2[1])) {
                this.f7613l = false;
                m3855b();
            }
        } else {
            interfaceC0386p.mo742b(java.lang.Boolean.FALSE);
        }
        return true;
    }
}
