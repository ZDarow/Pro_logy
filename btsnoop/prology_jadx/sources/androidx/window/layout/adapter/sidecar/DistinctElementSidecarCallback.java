package androidx.window.layout.adapter.sidecar;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {

    /* renamed from: b */
    public androidx.window.sidecar.SidecarDeviceState f4473b;

    /* renamed from: d */
    public final p212x1.C2373f f4475d;

    /* renamed from: e */
    public final androidx.window.sidecar.SidecarInterface.SidecarCallback f4476e;

    /* renamed from: a */
    public final java.lang.Object f4472a = new java.lang.Object();

    /* renamed from: c */
    public final java.util.WeakHashMap f4474c = new java.util.WeakHashMap();

    public DistinctElementSidecarCallback(p212x1.C2373f c2373f, androidx.window.sidecar.SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4475d = c2373f;
        this.f4476e = sidecarCallback;
    }

    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4472a) {
            try {
                p212x1.C2373f c2373f = this.f4475d;
                androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2 = this.f4473b;
                c2373f.getClass();
                if (p212x1.C2373f.m4584a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f4473b = sidecarDeviceState;
                this.f4476e.onDeviceStateChanged(sidecarDeviceState);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f4472a) {
            try {
                androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (androidx.window.sidecar.SidecarWindowLayoutInfo) this.f4474c.get(iBinder);
                this.f4475d.getClass();
                if (p212x1.C2373f.m4587d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f4474c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4476e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
