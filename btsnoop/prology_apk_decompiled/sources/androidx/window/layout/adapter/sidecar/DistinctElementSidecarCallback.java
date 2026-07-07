package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import x1.f;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f4317b;

    /* renamed from: d, reason: collision with root package name */
    public final f f4319d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f4320e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4316a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f4318c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4319d = fVar;
        this.f4320e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4316a) {
            try {
                f fVar = this.f4319d;
                SidecarDeviceState sidecarDeviceState2 = this.f4317b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f4317b = sidecarDeviceState;
                this.f4320e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f4316a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f4318c.get(iBinder);
                this.f4319d.getClass();
                if (f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f4318c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4320e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
