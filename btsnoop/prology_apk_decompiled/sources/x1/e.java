package x1;

import androidx.window.sidecar.SidecarDisplayFeature;
import j3.l;

/* loaded from: classes.dex */
public final class e extends k3.i implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final e f8972m = new k3.i(1);

    @Override // j3.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean b(SidecarDisplayFeature sidecarDisplayFeature) {
        k3.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
