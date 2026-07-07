package O2;

import B2.AbstractActivityC0003d;
import C2.d;
import H2.b;
import K2.k;
import L2.p;
import L2.r;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class a implements b, I2.a, r {

    /* renamed from: l, reason: collision with root package name */
    public final PackageManager f1495l;

    /* renamed from: m, reason: collision with root package name */
    public d f1496m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f1497n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f1498o = new HashMap();

    public a(B1.d dVar) {
        this.f1495l = (PackageManager) dVar.f96m;
        dVar.f97n = this;
    }

    @Override // L2.r
    public final boolean a(int i4, int i5, Intent intent) {
        HashMap hashMap = this.f1498o;
        if (!hashMap.containsKey(Integer.valueOf(i4))) {
            return false;
        }
        ((p) hashMap.remove(Integer.valueOf(i4))).b(i5 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
    }

    public final void c(String str, String str2, boolean z4, k kVar) {
        if (this.f1496m == null) {
            kVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f1497n;
        if (hashMap == null) {
            kVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            kVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = kVar.hashCode();
        this.f1498o.put(Integer.valueOf(hashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        ((AbstractActivityC0003d) this.f1496m.f367a).startActivityForResult(intent, hashCode);
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
    }

    @Override // I2.a
    public final void e() {
        ((HashSet) this.f1496m.f369c).remove(this);
        this.f1496m = null;
    }

    @Override // I2.a
    public final void f(d dVar) {
        this.f1496m = dVar;
        dVar.a(this);
    }

    @Override // I2.a
    public final void g() {
        ((HashSet) this.f1496m.f369c).remove(this);
        this.f1496m = null;
    }

    @Override // I2.a
    public final void h(d dVar) {
        this.f1496m = dVar;
        dVar.a(this);
    }

    public final HashMap i() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f1497n;
        PackageManager packageManager = this.f1495l;
        if (hashMap == null) {
            this.f1497n = new HashMap();
            int i4 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (i4 >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f1497n.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f1497n.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f1497n.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }
}
