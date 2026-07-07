package m2;

import L2.p;
import L2.s;
import a.AbstractC0110a;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import k3.h;
import p1.AbstractC0462a;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437a implements s {

    /* renamed from: l, reason: collision with root package name */
    public boolean f7334l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f7335m;

    public final boolean a() {
        String[] strArr = this.f7335m;
        if (strArr.length <= 0) {
            return true;
        }
        String str = strArr[0];
        WeakReference weakReference = AbstractC0110a.f3190c;
        if (weakReference == null) {
            h.i("context");
            throw null;
        }
        Context context = (Context) weakReference.get();
        if (context != null) {
            return AbstractC0462a.o(context, str) == 0;
        }
        throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
    }

    public final void b() {
        WeakReference weakReference = AbstractC0110a.f3191d;
        if (weakReference == null) {
            h.i("activity");
            throw null;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
        }
        AbstractC0462a.L(activity, this.f7335m, 88560);
    }

    @Override // L2.s
    public final boolean c(int i4, String[] strArr, int[] iArr) {
        h.e(strArr, "permissions");
        h.e(iArr, "grantResults");
        if (88560 != i4) {
            return false;
        }
        boolean z4 = iArr.length != 0 && iArr[0] == 0;
        WeakReference weakReference = AbstractC0110a.f3193f;
        if (weakReference == null) {
            h.i("result");
            throw null;
        }
        p pVar = (p) weakReference.get();
        if (pVar == null) {
            throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
        }
        if (z4) {
            pVar.b(Boolean.TRUE);
        } else if (this.f7334l) {
            WeakReference weakReference2 = AbstractC0110a.f3191d;
            if (weakReference2 == null) {
                h.i("activity");
                throw null;
            }
            Activity activity = (Activity) weakReference2.get();
            if (activity == null) {
                throw new Exception("Tried to get one of the methods but the 'PluginProvider' has not initialized");
            }
            String[] strArr2 = this.f7335m;
            if (AbstractC0462a.O(activity, strArr2[0]) || AbstractC0462a.O(activity, strArr2[1])) {
                this.f7334l = false;
                b();
            }
        } else {
            pVar.b(Boolean.FALSE);
        }
        return true;
    }
}
