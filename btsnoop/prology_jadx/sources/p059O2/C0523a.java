package p059O2;

/* renamed from: O2.a */
/* loaded from: classes.dex */
public class C0523a implements p034H2.InterfaceC0248b, p038I2.InterfaceC0309a, p047L2.InterfaceC0388r {

    /* renamed from: l */
    public final android.content.pm.PackageManager f1546l;

    /* renamed from: m */
    public p013C2.C0139d f1547m;

    /* renamed from: n */
    public java.util.HashMap f1548n;

    /* renamed from: o */
    public final java.util.HashMap f1549o = new java.util.HashMap();

    public C0523a(p008B1.C0026d c0026d) {
        this.f1546l = (android.content.pm.PackageManager) c0026d.f99m;
        c0026d.f100n = this;
    }

    @Override // p047L2.InterfaceC0388r
    /* renamed from: a */
    public final boolean mo578a(int i4, int i5, android.content.Intent intent) {
        java.util.HashMap hashMap = this.f1549o;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i4))) {
            return false;
        }
        ((p047L2.InterfaceC0386p) hashMap.remove(java.lang.Integer.valueOf(i4))).mo742b(i5 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
    }

    /* renamed from: c */
    public final void m1021c(java.lang.String str, java.lang.String str2, boolean z4, p043K2.C0335k c0335k) {
        if (this.f1547m == null) {
            c0335k.mo741a("error", "Plugin not bound to an Activity", null);
            return;
        }
        java.util.HashMap hashMap = this.f1548n;
        if (hashMap == null) {
            c0335k.mo741a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            c0335k.mo741a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = c0335k.hashCode();
        this.f1549o.put(java.lang.Integer.valueOf(hashCode), c0335k);
        android.content.Intent intent = new android.content.Intent();
        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        ((p009B2.AbstractActivityC0047d) this.f1547m.f375a).startActivityForResult(intent, hashCode);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        ((java.util.HashSet) this.f1547m.f377c).remove(this);
        this.f1547m = null;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
        this.f1547m = c0139d;
        c0139d.m480a(this);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: g */
    public final void mo533g() {
        ((java.util.HashSet) this.f1547m.f377c).remove(this);
        this.f1547m = null;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: h */
    public final void mo534h(p013C2.C0139d c0139d) {
        this.f1547m = c0139d;
        c0139d.m480a(this);
    }

    /* renamed from: i */
    public final java.util.HashMap m1022i() {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities;
        android.content.pm.PackageManager.ResolveInfoFlags of;
        java.util.HashMap hashMap = this.f1548n;
        android.content.pm.PackageManager packageManager = this.f1546l;
        if (hashMap == null) {
            this.f1548n = new java.util.HashMap();
            int i4 = android.os.Build.VERSION.SDK_INT;
            android.content.Intent type = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (i4 >= 33) {
                of = android.content.pm.PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                java.lang.String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f1548n.put(str, resolveInfo);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.lang.String str2 : this.f1548n.keySet()) {
            hashMap2.put(str2, ((android.content.pm.ResolveInfo) this.f1548n.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }
}
