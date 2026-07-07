package defpackage;

import B1.d;
import B2.AbstractActivityC0003d;
import B2.AbstractC0007h;
import F1.g;
import I.C0044m;
import L2.b;
import L2.f;
import L2.m;
import R2.C0068d;
import Z2.e;
import c0.C0218q;
import java.util.List;
import k3.h;
import p1.AbstractC0462a;
import w0.C0591a;
import z2.C0637a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f4802a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final e f4803b = new e(new C0068d(1));

    public static void a(d dVar, f fVar, final C0637a c0637a) {
        dVar.getClass();
        h.e(fVar, "binaryMessenger");
        String concat = "".length() > 0 ? ".".concat("") : "";
        String l4 = AbstractC0007h.l("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", concat);
        e eVar = f4803b;
        g gVar = null;
        C0044m c0044m = new C0044m(fVar, l4, (m) eVar.a(), gVar);
        if (c0637a != null) {
            final int i4 = 0;
            c0044m.r(new b() { // from class: c
                @Override // L2.b
                public final void e(Object obj, d dVar2) {
                    List c4;
                    List c5;
                    AbstractActivityC0003d abstractActivityC0003d;
                    switch (i4) {
                        case 0:
                            C0637a c0637a2 = c0637a;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            h.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c0637a2.a((b) obj2);
                                c4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                c4 = AbstractC0462a.c(th);
                            }
                            dVar2.e(c4);
                            return;
                        default:
                            try {
                                C0591a c0591a = c0637a.f9234l;
                                h.b(c0591a);
                                abstractActivityC0003d = (AbstractActivityC0003d) c0591a.f8747l;
                            } catch (Throwable th2) {
                                c5 = AbstractC0462a.c(th2);
                            }
                            if (abstractActivityC0003d == null) {
                                throw new C0218q();
                            }
                            h.b(abstractActivityC0003d);
                            c5 = AbstractC0462a.E(new a(Boolean.valueOf((abstractActivityC0003d.getWindow().getAttributes().flags & 128) != 0)));
                            dVar2.e(c5);
                            return;
                    }
                }
            });
        } else {
            c0044m.r(null);
        }
        C0044m c0044m2 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", concat), (m) eVar.a(), gVar);
        if (c0637a == null) {
            c0044m2.r(null);
        } else {
            final int i5 = 1;
            c0044m2.r(new b() { // from class: c
                @Override // L2.b
                public final void e(Object obj, d dVar2) {
                    List c4;
                    List c5;
                    AbstractActivityC0003d abstractActivityC0003d;
                    switch (i5) {
                        case 0:
                            C0637a c0637a2 = c0637a;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            h.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c0637a2.a((b) obj2);
                                c4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                c4 = AbstractC0462a.c(th);
                            }
                            dVar2.e(c4);
                            return;
                        default:
                            try {
                                C0591a c0591a = c0637a.f9234l;
                                h.b(c0591a);
                                abstractActivityC0003d = (AbstractActivityC0003d) c0591a.f8747l;
                            } catch (Throwable th2) {
                                c5 = AbstractC0462a.c(th2);
                            }
                            if (abstractActivityC0003d == null) {
                                throw new C0218q();
                            }
                            h.b(abstractActivityC0003d);
                            c5 = AbstractC0462a.E(new a(Boolean.valueOf((abstractActivityC0003d.getWindow().getAttributes().flags & 128) != 0)));
                            dVar2.e(c5);
                            return;
                    }
                }
            });
        }
    }
}
