package p054N1;

/* renamed from: N1.D */
/* loaded from: classes.dex */
public final class FragmentC0445D extends android.app.Fragment implements p054N1.InterfaceC0451f {

    /* renamed from: l */
    public final java.util.Map f1295l = java.util.Collections.synchronizedMap(new p165n.C1883j(0));

    static {
        new java.util.WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = this.f1295l.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i4, int i5, android.content.Intent intent) {
        super.onActivityResult(i4, i5, intent);
        java.util.Iterator it = this.f1295l.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        for (java.util.Map.Entry entry : this.f1295l.entrySet()) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = (com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle.getBundle((java.lang.String) entry.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        java.util.Iterator it = this.f1295l.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        java.util.Iterator it = this.f1295l.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.f1295l.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).getClass();
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        java.util.Iterator it = this.f1295l.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        java.util.Iterator it = this.f1295l.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }
}
