package x1;

import B2.AbstractC0007h;
import a3.l;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u1.C0583c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f8973a;

    public f() {
        AbstractC0007h.s("verificationMode", 3);
        this.f8973a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (k3.h.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AbstractC0612a.b(sidecarDeviceState) != AbstractC0612a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (k3.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return k3.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!b((SidecarDisplayFeature) list.get(i4), (SidecarDisplayFeature) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (k3.h.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC0612a.c(sidecarWindowLayoutInfo), AbstractC0612a.c(sidecarWindowLayoutInfo2));
    }

    public final ArrayList e(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0583c g4 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g4 != null) {
                arrayList.add(g4);
            }
        }
        return arrayList;
    }

    public final u1.j f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        k3.h.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new u1.j(l.f3631l);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC0612a.d(sidecarDeviceState2, AbstractC0612a.b(sidecarDeviceState));
        return new u1.j(e(AbstractC0612a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u1.C0583c g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            k3.h.e(r5, r0)
            int r0 = r4.f8973a
            r1.h r0 = r1.C0507a.a(r0, r5)
            x1.b r1 = x1.b.f8969m
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            r1.g r0 = r0.d(r2, r1)
            x1.c r1 = x1.c.f8970m
            java.lang.String r2 = "Feature bounds must not be 0"
            r1.g r0 = r0.d(r2, r1)
            x1.d r1 = x1.d.f8971m
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            r1.g r0 = r0.d(r2, r1)
            x1.e r1 = x1.e.f8972m
            java.lang.String r2 = "Feature be pinned to either left or top"
            r1.g r0 = r0.d(r2, r1)
            java.lang.Object r0 = r0.a()
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
            u1.b r0 = u1.C0582b.s
            goto L45
        L43:
            u1.b r0 = u1.C0582b.f8569r
        L45:
            int r6 = x1.AbstractC0612a.b(r6)
            if (r6 == 0) goto L6e
            if (r6 == r3) goto L6e
            if (r6 == r2) goto L58
            u1.b r2 = u1.C0582b.f8567p
            r3 = 3
            if (r6 == r3) goto L5a
            r3 = 4
            if (r6 == r3) goto L6e
            goto L5a
        L58:
            u1.b r2 = u1.C0582b.f8568q
        L5a:
            u1.c r6 = new u1.c
            r1.b r1 = new r1.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            k3.h.d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):u1.c");
    }
}
