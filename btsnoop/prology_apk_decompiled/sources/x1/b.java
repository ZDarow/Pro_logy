package x1;

import androidx.window.sidecar.SidecarDisplayFeature;
import j3.l;

/* loaded from: classes.dex */
public final class b extends k3.i implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final b f8969m = new k3.i(1);

    @Override // j3.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean b(SidecarDisplayFeature sidecarDisplayFeature) {
        k3.h.e(sidecarDisplayFeature, "$this$require");
        boolean z4 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
