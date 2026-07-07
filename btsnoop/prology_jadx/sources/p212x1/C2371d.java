package p212x1;

/* renamed from: x1.d */
/* loaded from: classes.dex */
public final class C2371d extends p154k3.AbstractC1804i implements p149j3.InterfaceC1737l {

    /* renamed from: m */
    public static final p212x1.C2371d f9330m = new p154k3.AbstractC1804i(1);

    @Override // p149j3.InterfaceC1737l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo661b(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature) {
        p154k3.AbstractC1803h.m3779e(sidecarDisplayFeature, "$this$require");
        boolean z4 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z4 = false;
        }
        return java.lang.Boolean.valueOf(z4);
    }
}
