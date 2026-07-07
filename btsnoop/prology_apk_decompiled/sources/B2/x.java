package B2;

import T.C0084e;
import T.C0095p;
import a0.C0126f;
import a0.SurfaceHolderCallbackC0115E;
import android.util.Log;
import android.view.View;
import b0.C0177a;
import d2.C0246i;
import d2.InterfaceC0238a;
import d2.InterfaceC0239b;
import f2.C0278F;
import j0.InterfaceC0371A;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import q0.C0491x;
import y0.InterfaceC0624g;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements InterfaceC0624g, InterfaceC0238a, InterfaceC0239b, L2.c, e2.e, W.c, W2.c, W.h, InterfaceC0371A {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f214m;

    public /* synthetic */ x(int i4, Object obj) {
        this.f213l = i4;
        this.f214m = obj;
    }

    @Override // y0.InterfaceC0624g
    public long a(long j4) {
        return W.y.k((j4 * r0.f9108e) / 1000000, 0L, ((y0.s) this.f214m).f9113j - 1);
    }

    @Override // W.c
    public void accept(Object obj) {
        V0.a aVar = (V0.a) obj;
        switch (this.f213l) {
            case 10:
                V0.h hVar = (V0.h) this.f214m;
                hVar.getClass();
                V0.g gVar = new V0.g(aVar.f2597b, F1.g.t(aVar.f2596a, aVar.f2598c));
                hVar.f2610c.add(gVar);
                long j4 = hVar.f2617j;
                if (j4 == -9223372036854775807L || aVar.f2597b >= j4) {
                    hVar.a(gVar);
                    return;
                }
                return;
            default:
                ((C0278F) this.f214m).a(aVar);
                return;
        }
    }

    @Override // e2.e
    public Object apply(Object obj) {
        S0.u uVar = (S0.u) obj;
        ((S0.n) this.f214m).getClass();
        return uVar;
    }

    @Override // W.h
    public void b(Object obj) {
        switch (this.f213l) {
            case 14:
                ((T.M) obj).i((T.E) this.f214m);
                return;
            case 15:
                ((T.M) obj).j((C0084e) this.f214m);
                return;
            case 16:
                ((T.M) obj).k((V.c) this.f214m);
                return;
            case 17:
                ((T.M) obj).i(((SurfaceHolderCallbackC0115E) this.f214m).f3204a.f3219L);
                return;
            case 18:
                ((T.M) obj).v((T.G) this.f214m);
                return;
            case 19:
                ((T.M) obj).w((List) this.f214m);
                return;
            case 20:
            default:
                ((b0.j) obj).getClass();
                return;
            case 21:
                b0.j jVar = (b0.j) obj;
                int i4 = jVar.f4387x;
                C0126f c0126f = (C0126f) this.f214m;
                jVar.f4387x = i4 + c0126f.f3452g;
                jVar.f4388y += c0126f.f3450e;
                return;
            case 22:
                ((b0.j) obj).f4379n = (T.J) this.f214m;
                return;
            case 23:
                b0.j jVar2 = (b0.j) obj;
                jVar2.getClass();
                jVar2.f4386v = ((n0.g) this.f214m).f7421l;
                return;
        }
    }

    @Override // j0.InterfaceC0371A
    public int c(Object obj) {
        j0.m mVar = (j0.m) obj;
        mVar.getClass();
        C0095p c0095p = (C0095p) this.f214m;
        String str = c0095p.f2325m;
        String str2 = mVar.f6834b;
        return ((str2.equals(str) || str2.equals(j0.B.b(c0095p))) && mVar.c(c0095p, false)) ? 1 : 0;
    }

    @Override // W2.c
    public boolean d(View view) {
        int i4 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f214m;
            if (i4 >= clsArr.length) {
                return false;
            }
            if (clsArr[i4].isInstance(view)) {
                return true;
            }
            i4++;
        }
    }

    @Override // L2.c
    public void e(Object obj) {
        boolean z4 = false;
        if (obj != null) {
            try {
                z4 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e4) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        ((D) ((x) this.f214m).f214m).c(z4);
    }

    @Override // d2.InterfaceC0238a
    public void f(C0246i c0246i) {
        boolean b4 = c0246i.b();
        r rVar = (r) this.f214m;
        if (!b4) {
            ((K2.k) rVar.f185m).a(AbstractC0007h.f(3), AbstractC0007h.e(3), null);
        }
        a2.d dVar = (a2.d) c0246i.a();
        if (dVar == null) {
            ((K2.k) rVar.f185m).a(AbstractC0007h.f(3), AbstractC0007h.e(3), null);
        } else {
            a2.f fVar = dVar.f3606a.f3608m;
            ((K2.k) rVar.f185m).b(Boolean.valueOf((fVar != null && fVar.f3609l) || (fVar != null && fVar.f3610m)));
        }
    }

    @Override // d2.InterfaceC0239b
    public void g(Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        ((D1.f) this.f214m).c(2);
    }

    public /* synthetic */ x(C0177a c0177a, Object obj, int i4) {
        this.f213l = i4;
        this.f214m = obj;
    }

    public /* synthetic */ x(C0177a c0177a, Object obj, long j4) {
        this.f213l = 24;
        this.f214m = obj;
    }

    public /* synthetic */ x(C0177a c0177a, C0491x c0491x, n0.g gVar, IOException iOException, boolean z4) {
        this.f213l = 23;
        this.f214m = gVar;
    }
}
