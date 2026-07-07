package N1;

import O1.AbstractBinderC0061a;
import android.content.Context;
import android.graphics.Typeface;
import android.location.Location;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import b3.C0196j;
import c2.C0224f;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import d2.C0240c;
import d2.C0243f;
import d2.C0244g;
import d2.C0246i;
import d2.InterfaceC0238a;
import d2.InterfaceC0239b;
import f2.Y;
import i.MenuC0328i;
import j.C0351f;
import j.C0354i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import r3.AbstractC0534v;
import z.C0632e;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1304l;

    /* renamed from: m, reason: collision with root package name */
    public Object f1305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1306n;

    public /* synthetic */ q(int i4, Object obj, Object obj2) {
        this.f1304l = i4;
        this.f1306n = obj;
        this.f1305m = obj2;
    }

    private final void a() {
        synchronized (((C0244g) this.f1306n).f4978b) {
            ((InterfaceC0238a) ((C0244g) this.f1306n).f4980d).f((C0246i) this.f1305m);
        }
    }

    private final void b() {
        Exception exc;
        synchronized (((C0244g) this.f1306n).f4978b) {
            InterfaceC0239b interfaceC0239b = (InterfaceC0239b) ((C0244g) this.f1306n).f4980d;
            C0246i c0246i = (C0246i) this.f1305m;
            synchronized (c0246i.f4981a) {
                exc = c0246i.f4986f;
            }
            O1.s.d(exc);
            interfaceC0239b.g(exc);
        }
    }

    private final void c() {
        synchronized (((C0244g) this.f1306n).f4978b) {
            B2.x xVar = (B2.x) ((C0244g) this.f1306n).f4980d;
            Object a4 = ((C0246i) this.f1305m).a();
            switch (xVar.f213l) {
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    F1.e eVar = (F1.e) xVar.f214m;
                    eVar.h(eVar.f594f);
                    break;
                default:
                    ((D1.f) xVar.f214m).a((Location) a4);
                    break;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3.i iVar;
        O1.f fVar;
        E1.a aVar;
        g gVar;
        Set set;
        Y y4;
        Location location = null;
        O1.f fVar2 = null;
        switch (this.f1304l) {
            case 0:
                r rVar = (r) this.f1306n;
                o oVar = (o) ((C0060d) rVar.f1312f).f1275u.get((C0058b) rVar.f1309c);
                if (oVar == null) {
                    return;
                }
                L1.a aVar2 = (L1.a) this.f1305m;
                if ((aVar2.f1055m == 0 ? 1 : 0) == 0) {
                    oVar.l(aVar2, null);
                    return;
                }
                rVar.f1307a = true;
                M1.c cVar = (M1.c) rVar.f1308b;
                if (cVar.j()) {
                    if (!rVar.f1307a || (fVar = (O1.f) rVar.f1310d) == null) {
                        return;
                    }
                    cVar.g(fVar, (Set) rVar.f1311e);
                    return;
                }
                try {
                    cVar.g(null, cVar.f());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    cVar.i("Failed to get service from broker.");
                    oVar.l(new L1.a(10), null);
                    return;
                }
            case 1:
                h hVar = (h) this.f1305m;
                K2.o oVar2 = (K2.o) this.f1306n;
                Object obj = hVar.f1282b;
                if (obj == null) {
                    return;
                }
                switch (oVar2.f1008l) {
                    case 18:
                        F1.d dVar = (F1.d) obj;
                        LocationResult locationResult = (LocationResult) oVar2.f1009m;
                        synchronized (dVar) {
                            if (dVar.f588c.f596h == null) {
                                Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                                F1.e eVar = dVar.f588c;
                                eVar.f591c.d(eVar.f590b);
                                E1.a aVar3 = dVar.f588c.f595g;
                                if (aVar3 != null) {
                                    aVar3.c(2);
                                }
                                return;
                            }
                            List list = locationResult.f4781l;
                            int size = list.size();
                            if (size != 0) {
                                location = (Location) list.get(size - 1);
                            }
                            if (location == null) {
                                return;
                            }
                            if (location.getExtras() == null) {
                                location.setExtras(Bundle.EMPTY);
                            }
                            if (dVar.f586a != null) {
                                location.getExtras().putBoolean("geolocator_use_mslAltitude", dVar.f586a.f613d);
                            }
                            dVar.f588c.f592d.a(location);
                            dVar.f588c.f596h.a(location);
                            return;
                        }
                    case 19:
                        F1.d dVar2 = (F1.d) obj;
                        LocationAvailability locationAvailability = (LocationAvailability) oVar2.f1009m;
                        synchronized (dVar2) {
                            if (locationAvailability.f4766o >= 1000) {
                                r1 = false;
                            }
                            if (!r1) {
                                F1.e eVar2 = dVar2.f588c;
                                Context context = dVar2.f587b;
                                eVar2.getClass();
                                if (!F1.h.e(context) && (aVar = dVar2.f588c.f595g) != null) {
                                    aVar.c(3);
                                }
                            }
                        }
                        return;
                    default:
                        Y1.a aVar4 = ((Y1.h) oVar2.f1009m).f3090d;
                        synchronized (aVar4) {
                            aVar4.f3078l = false;
                            gVar = ((h) aVar4.f3079m).f1283c;
                        }
                        if (gVar != null) {
                            ((Y1.b) aVar4.f3080n).b(gVar, 2441);
                            return;
                        }
                        return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0224f c0224f = (C0224f) this.f1305m;
                L1.a aVar5 = c0224f.f4708m;
                r1 = aVar5.f1055m == 0;
                A a4 = (A) this.f1306n;
                if (r1) {
                    O1.o oVar3 = c0224f.f4709n;
                    O1.s.d(oVar3);
                    L1.a aVar6 = oVar3.f1466n;
                    if (aVar6.f1055m != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar6)), new Exception());
                        a4.f1246j.c(aVar6);
                        a4.f1245i.h();
                        return;
                    }
                    r rVar2 = a4.f1246j;
                    IBinder iBinder = oVar3.f1465m;
                    if (iBinder != null) {
                        int i4 = AbstractBinderC0061a.f1413d;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        fVar2 = queryLocalInterface instanceof O1.f ? (O1.f) queryLocalInterface : new O1.D(iBinder);
                    }
                    rVar2.getClass();
                    if (fVar2 == null || (set = a4.f1243g) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        rVar2.c(new L1.a(4));
                    } else {
                        rVar2.f1310d = fVar2;
                        rVar2.f1311e = set;
                        if (rVar2.f1307a) {
                            ((M1.c) rVar2.f1308b).g(fVar2, set);
                        }
                    }
                } else {
                    a4.f1246j.c(aVar5);
                }
                a4.f1245i.h();
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                Q.k kVar = (Q.k) this.f1306n;
                ArrayList arrayList = (ArrayList) kVar.f1530a;
                boolean isEmpty = arrayList.isEmpty();
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f1305m;
                if (!isEmpty) {
                    android.support.v4.media.session.d d4 = mediaSessionCompat$Token.d();
                    if (d4 != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", d4.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                ((Q.j) kVar.f1531b).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f3675m);
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                if (((C0246i) this.f1305m).f4984d) {
                    C0246i c0246i = ((C0243f) this.f1306n).f4976a;
                    synchronized (c0246i.f4981a) {
                        try {
                            if (!c0246i.f4983c) {
                                c0246i.f4983c = true;
                                c0246i.f4984d = true;
                                c0246i.f4982b.f(c0246i);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                try {
                    ((C0243f) this.f1306n).getClass();
                    ((C0243f) this.f1306n).f4976a.d(null);
                    return;
                } catch (C0240c e5) {
                    if (e5.getCause() instanceof Exception) {
                        ((C0243f) this.f1306n).f4976a.c((Exception) e5.getCause());
                        return;
                    } else {
                        ((C0243f) this.f1306n).f4976a.c(e5);
                        return;
                    }
                } catch (Exception e6) {
                    ((C0243f) this.f1306n).f4976a.c(e6);
                    return;
                }
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                a();
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                b();
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c();
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                C0354i c0354i = (C0354i) this.f1306n;
                MenuC0328i menuC0328i = c0354i.f6683n;
                if (menuC0328i != null && (y4 = menuC0328i.f6053e) != null) {
                    ((ActionMenuView) y4.f5535m).getClass();
                }
                ActionMenuView actionMenuView = c0354i.f6687r;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0351f c0351f = (C0351f) this.f1305m;
                    if (!c0351f.b()) {
                        if (c0351f.f6100e != null) {
                            c0351f.d(0, 0, false, false);
                        }
                    }
                    c0354i.f6676C = c0351f;
                }
                c0354i.f6678E = null;
                return;
            case 9:
                break;
            case 10:
                S0.g gVar2 = (S0.g) ((Y) this.f1305m).f5535m;
                if (gVar2 != null) {
                    gVar2.e((Typeface) this.f1306n);
                    return;
                }
                return;
            default:
                ((C0632e) this.f1305m).accept(this.f1306n);
                return;
        }
        do {
            try {
                ((Runnable) this.f1305m).run();
            } catch (Throwable th) {
                AbstractC0534v.d(C0196j.f4462l, th);
            }
            iVar = (w3.i) this.f1306n;
            Runnable g4 = iVar.g();
            if (g4 == null) {
                return;
            }
            this.f1305m = g4;
            r2++;
        } while (r2 < 16);
        y3.k kVar2 = iVar.f8926n;
        kVar2.getClass();
        kVar2.e(iVar, this);
    }

    public /* synthetic */ q(Object obj, Object obj2, int i4, boolean z4) {
        this.f1304l = i4;
        this.f1305m = obj;
        this.f1306n = obj2;
    }
}
