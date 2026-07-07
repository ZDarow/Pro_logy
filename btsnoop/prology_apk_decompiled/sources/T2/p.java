package T2;

import B2.AbstractC0007h;
import B2.x;
import I.C0044m;
import T.K;
import a.AbstractC0110a;
import a0.C0118H;
import a0.InterfaceC0138s;
import android.content.Context;
import android.support.v4.media.session.t;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class p implements H2.b {

    /* renamed from: m, reason: collision with root package name */
    public H2.a f2458m;

    /* renamed from: l, reason: collision with root package name */
    public final LongSparseArray f2457l = new LongSparseArray();

    /* renamed from: n, reason: collision with root package name */
    public final n f2459n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public Long f2460o = Long.MAX_VALUE;

    public static void e(L2.f fVar, final p pVar) {
        f fVar2 = f.f2440d;
        C0044m c0044m = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", fVar2, null);
        if (pVar != null) {
            final int i4 = 0;
            c0044m.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i4) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i5 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i5)).b();
                                i5++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m.r(null);
        }
        C0044m c0044m2 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", fVar2, null);
        if (pVar != null) {
            final int i5 = 3;
            c0044m2.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i5) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m2.r(null);
        }
        C0044m c0044m3 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", fVar2, null);
        if (pVar != null) {
            final int i6 = 4;
            c0044m3.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i6) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m3.r(null);
        }
        C0044m c0044m4 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping", fVar2, null);
        if (pVar != null) {
            final int i7 = 5;
            c0044m4.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i7) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m4.r(null);
        }
        C0044m c0044m5 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume", fVar2, null);
        if (pVar != null) {
            final int i8 = 6;
            c0044m5.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i8) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m5.r(null);
        }
        C0044m c0044m6 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed", fVar2, null);
        if (pVar != null) {
            final int i9 = 7;
            c0044m6.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i9) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m6.r(null);
        }
        C0044m c0044m7 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play", fVar2, null);
        if (pVar != null) {
            final int i10 = 8;
            c0044m7.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i10) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m7.r(null);
        }
        C0044m c0044m8 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position", fVar2, null);
        if (pVar != null) {
            final int i11 = 9;
            c0044m8.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i11) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m8.r(null);
        }
        C0044m c0044m9 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo", fVar2, null);
        if (pVar != null) {
            final int i12 = 10;
            c0044m9.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i12) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m9.r(null);
        }
        C0044m c0044m10 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause", fVar2, null);
        if (pVar != null) {
            final int i13 = 1;
            c0044m10.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i13) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0044m10.r(null);
        }
        C0044m c0044m11 = new C0044m(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", fVar2, null);
        if (pVar == null) {
            c0044m11.r(null);
        } else {
            final int i14 = 2;
            c0044m11.r(new L2.b(pVar) { // from class: T2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ p f2433m;

                {
                    this.f2433m = pVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    LongSparseArray longSparseArray;
                    switch (i14) {
                        case 0:
                            p pVar2 = this.f2433m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = pVar2.f2457l;
                                } catch (Throwable th) {
                                    arrayList = AbstractC0110a.d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    dVar.e(arrayList);
                                    return;
                                }
                                ((l) longSparseArray.valueAt(i52)).b();
                                i52++;
                            }
                        case 1:
                            p pVar3 = this.f2433m;
                            ArrayList arrayList2 = new ArrayList();
                            Long l4 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar3.getClass();
                                E0.e eVar = (E0.e) pVar3.c(l4.longValue()).f2453c;
                                eVar.getClass();
                                ((C0118H) eVar).J(false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.d0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            p pVar4 = this.f2433m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                pVar4.f2459n.f2455a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0110a.d0(th3);
                            }
                            dVar.e(arrayList3);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            p pVar5 = this.f2433m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, pVar5.a((e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0110a.d0(th4);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            p pVar6 = this.f2433m;
                            ArrayList arrayList5 = new ArrayList();
                            Long l5 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar6.getClass();
                                pVar6.c(l5.longValue()).b();
                                pVar6.f2457l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0110a.d0(th5);
                            }
                            dVar.e(arrayList5);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            p pVar7 = this.f2433m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            Long l6 = (Long) arrayList7.get(0);
                            Boolean bool = (Boolean) arrayList7.get(1);
                            try {
                                pVar7.getClass();
                                ((C0118H) pVar7.c(l6.longValue()).f2453c).L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0110a.d0(th6);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p pVar8 = this.f2433m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            Long l7 = (Long) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                pVar8.getClass();
                                ((C0118H) pVar8.c(l7.longValue()).f2453c).O((float) Math.max(0.0d, Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0110a.d0(th7);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p pVar9 = this.f2433m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            Long l8 = (Long) arrayList11.get(0);
                            Double d5 = (Double) arrayList11.get(1);
                            try {
                                pVar9.getClass();
                                ((C0118H) pVar9.c(l8.longValue()).f2453c).K(new K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = AbstractC0110a.d0(th8);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            p pVar10 = this.f2433m;
                            ArrayList arrayList12 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar10.getClass();
                                E0.e eVar2 = (E0.e) pVar10.c(l9.longValue()).f2453c;
                                eVar2.getClass();
                                ((C0118H) eVar2).J(true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = AbstractC0110a.d0(th9);
                            }
                            dVar.e(arrayList12);
                            return;
                        case 9:
                            p pVar11 = this.f2433m;
                            ArrayList arrayList13 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                pVar11.getClass();
                                l c4 = pVar11.c(l10.longValue());
                                InterfaceC0138s interfaceC0138s = c4.f2453c;
                                long r4 = ((C0118H) interfaceC0138s).r();
                                c4.f2451a.a(((C0118H) interfaceC0138s).m());
                                arrayList13.add(0, Long.valueOf(r4));
                            } catch (Throwable th10) {
                                arrayList13 = AbstractC0110a.d0(th10);
                            }
                            dVar.e(arrayList13);
                            return;
                        default:
                            p pVar12 = this.f2433m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l11 = (Long) arrayList15.get(0);
                            Long l12 = (Long) arrayList15.get(1);
                            try {
                                pVar12.getClass();
                                l c5 = pVar12.c(l11.longValue());
                                long intValue = l12.intValue();
                                E0.e eVar3 = (E0.e) c5.f2453c;
                                eVar3.getClass();
                                eVar3.k(((C0118H) eVar3).q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = AbstractC0110a.d0(th11);
                            }
                            dVar.e(arrayList14);
                            return;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [V2.b, T2.l, io.flutter.view.o] */
    public final Long a(e eVar) {
        E0.e bVar;
        l lVar;
        long j4;
        String a4;
        int i4 = 2;
        String str = eVar.f2434a;
        if (str != null) {
            String str2 = eVar.f2436c;
            if (str2 != null) {
                F2.f fVar = ((o) this.f2458m.f712p).f2456a;
                StringBuilder sb = new StringBuilder("packages");
                String str3 = File.separator;
                sb.append(str3);
                sb.append(str2);
                sb.append(str3);
                sb.append(str);
                a4 = fVar.a(sb.toString());
            } else {
                a4 = ((o) this.f2458m.f711o).f2456a.a(str);
            }
            String l4 = AbstractC0007h.l("asset:///", a4);
            if (!l4.startsWith("asset:///")) {
                throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
            }
            bVar = new c(l4, 0);
        } else if (eVar.f2435b.startsWith("rtsp://")) {
            String str4 = eVar.f2435b;
            if (!str4.startsWith("rtsp://")) {
                throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
            }
            bVar = new c(str4, 1);
        } else {
            String str5 = eVar.f2437d;
            if (str5 != null) {
                char c4 = 65535;
                switch (str5.hashCode()) {
                    case 3680:
                        if (str5.equals("ss")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case 103407:
                        if (str5.equals("hls")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 3075986:
                        if (str5.equals("dash")) {
                            c4 = 2;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 1:
                        i4 = 4;
                        break;
                    case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i4 = 3;
                        break;
                }
                bVar = new b(eVar.f2435b, i4, new HashMap(eVar.f2438e));
            }
            i4 = 1;
            bVar = new b(eVar.f2435b, i4, new HashMap(eVar.f2438e));
        }
        if (eVar.f2439f == h.f2442m) {
            Long l5 = this.f2460o;
            this.f2460o = Long.valueOf(l5.longValue() - 1);
            j4 = l5.longValue();
            H2.a aVar = this.f2458m;
            Context context = (Context) aVar.f708l;
            t tVar = new t((L2.f) aVar.f709m, "flutter.io/videoPlayer/videoEvents" + j4);
            k kVar = new k();
            tVar.B0(new m(kVar));
            lVar = new l(new m(kVar), bVar.g(), this.f2459n, null, new U2.d(context, bVar, 0));
        } else {
            io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) this.f2458m.f710n;
            jVar.getClass();
            TextureRegistry$SurfaceProducer c5 = jVar.c(1);
            long id = c5.id();
            H2.a aVar2 = this.f2458m;
            Context context2 = (Context) aVar2.f708l;
            t tVar2 = new t((L2.f) aVar2.f709m, "flutter.io/videoPlayer/videoEvents" + id);
            k kVar2 = new k();
            tVar2.B0(new m(kVar2));
            ?? lVar2 = new l(new m(kVar2), bVar.g(), this.f2459n, c5, new U2.d(context2, bVar, 1));
            lVar2.f2639d = true;
            c5.setCallback(lVar2);
            Surface surface = c5.getSurface();
            ((C0118H) lVar2.f2453c).N(surface);
            lVar2.f2639d = surface == null;
            lVar = lVar2;
            j4 = id;
        }
        this.f2457l.put(j4, lVar);
        return Long.valueOf(j4);
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        if (this.f2458m == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        H2.a aVar2 = this.f2458m;
        L2.f fVar = (L2.f) aVar.f709m;
        aVar2.getClass();
        e(fVar, null);
        this.f2458m = null;
        int i4 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f2457l;
            if (i4 >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((l) longSparseArray.valueAt(i4)).b();
                i4++;
            }
        }
    }

    public final l c(long j4) {
        LongSparseArray longSparseArray = this.f2457l;
        l lVar = (l) longSparseArray.get(j4);
        if (lVar != null) {
            return lVar;
        }
        String str = "No player found with playerId <" + j4 + ">";
        if (longSparseArray.size() == 0) {
            str = str + " and no active players created by the plugin.";
        }
        throw new IllegalStateException(str);
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        t n02 = t.n0();
        Context context = (Context) aVar.f708l;
        F2.f fVar = (F2.f) n02.f3734m;
        o oVar = new o(fVar);
        o oVar2 = new o(fVar);
        io.flutter.embedding.engine.renderer.j jVar = (io.flutter.embedding.engine.renderer.j) aVar.f710n;
        L2.f fVar2 = (L2.f) aVar.f709m;
        this.f2458m = new H2.a(context, fVar2, oVar, oVar2, jVar);
        e(fVar2, this);
        LongSparseArray longSparseArray = this.f2457l;
        Objects.requireNonNull(longSparseArray);
        U2.b bVar = new U2.b(new x(9, longSparseArray));
        HashMap hashMap = (HashMap) ((io.flutter.plugin.platform.m) aVar.f712p).f6356m;
        if (hashMap.containsKey("plugins.flutter.dev/video_player_android")) {
            return;
        }
        hashMap.put("plugins.flutter.dev/video_player_android", bVar);
    }
}
