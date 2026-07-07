package p212x1;

/* renamed from: x1.f */
/* loaded from: classes.dex */
public final class C2373f {

    /* renamed from: a */
    public final int f9332a;

    public C2373f() {
        p009B2.AbstractC0051h.m160s("verificationMode", 3);
        this.f9332a = 3;
    }

    /* renamed from: a */
    public static boolean m4584a(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2) {
        if (p154k3.AbstractC1803h.m3775a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || p212x1.AbstractC2368a.m4577b(sidecarDeviceState) != p212x1.AbstractC2368a.m4577b(sidecarDeviceState2)) ? false : true;
    }

    /* renamed from: b */
    public static boolean m4585b(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature, androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature2) {
        if (p154k3.AbstractC1803h.m3775a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return p154k3.AbstractC1803h.m3775a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* renamed from: c */
    public static boolean m4586c(java.util.List list, java.util.List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!m4585b((androidx.window.sidecar.SidecarDisplayFeature) list.get(i4), (androidx.window.sidecar.SidecarDisplayFeature) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m4587d(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (p154k3.AbstractC1803h.m3775a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return m4586c(p212x1.AbstractC2368a.m4578c(sidecarWindowLayoutInfo), p212x1.AbstractC2368a.m4578c(sidecarWindowLayoutInfo2));
    }

    /* renamed from: e */
    public final java.util.ArrayList m4588e(java.util.List list, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p198u1.C2235c m4590g = m4590g((androidx.window.sidecar.SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (m4590g != null) {
                arrayList.add(m4590g);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final p198u1.C2242j m4589f(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        p154k3.AbstractC1803h.m3779e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new p198u1.C2242j(p105a3.C1029l.f3755l);
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2 = new androidx.window.sidecar.SidecarDeviceState();
        p212x1.AbstractC2368a.m4579d(sidecarDeviceState2, p212x1.AbstractC2368a.m4577b(sidecarDeviceState));
        return new p198u1.C2242j(m4588e(p212x1.AbstractC2368a.m4578c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p198u1.C2235c m4590g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            p154k3.AbstractC1803h.m3779e(r5, r0)
            int r0 = r4.f9332a
            r1.h r0 = p185r1.C2058a.m4117a(r0, r5)
            x1.b r1 = p212x1.C2369b.f9328m
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            r1.g r0 = r0.mo4123d(r2, r1)
            x1.c r1 = p212x1.C2370c.f9329m
            java.lang.String r2 = "Feature bounds must not be 0"
            r1.g r0 = r0.mo4123d(r2, r1)
            x1.d r1 = p212x1.C2371d.f9330m
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            r1.g r0 = r0.mo4123d(r2, r1)
            x1.e r1 = p212x1.C2372e.f9331m
            java.lang.String r2 = "Feature be pinned to either left or top"
            r1.g r0 = r0.mo4123d(r2, r1)
            java.lang.Object r0 = r0.mo4122a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L35
            return r1
        L35:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L43
            if (r0 == r2) goto L40
            return r1
        L40:
            u1.b r0 = p198u1.C2234b.f8912s
            goto L45
        L43:
            u1.b r0 = p198u1.C2234b.f8911r
        L45:
            int r6 = p212x1.AbstractC2368a.m4577b(r6)
            if (r6 == 0) goto L6e
            if (r6 == r3) goto L6e
            if (r6 == r2) goto L58
            u1.b r2 = p198u1.C2234b.f8909p
            r3 = 3
            if (r6 == r3) goto L5a
            r3 = 4
            if (r6 == r3) goto L6e
            goto L5a
        L58:
            u1.b r2 = p198u1.C2234b.f8910q
        L5a:
            u1.c r6 = new u1.c
            r1.b r1 = new r1.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            p154k3.AbstractC1803h.m3778d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p212x1.C2373f.m4590g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):u1.c");
    }
}
