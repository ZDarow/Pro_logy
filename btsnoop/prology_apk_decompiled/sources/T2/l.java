package T2;

import T.B;
import T.C0084e;
import a0.C0118H;
import a0.C0134n;
import a0.C0137q;
import a0.InterfaceC0138s;
import android.content.Context;
import f2.I;
import f2.c0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import q0.InterfaceC0468E;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final m f2451a;

    /* renamed from: b, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f2452b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0138s f2453c;

    public l(m mVar, B b4, n nVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, U2.d dVar) {
        C0118H a4;
        this.f2451a = mVar;
        this.f2452b = textureRegistry$SurfaceProducer;
        switch (dVar.f2526a) {
            case 0:
                Context context = dVar.f2527b;
                C0137q c0137q = new C0137q(context);
                InterfaceC0468E h4 = dVar.f2528c.h(context);
                W.a.j(!c0137q.f3578r);
                c0137q.f3564d = new C0134n(1, h4);
                a4 = c0137q.a();
                break;
            default:
                Context context2 = dVar.f2527b;
                C0137q c0137q2 = new C0137q(context2);
                InterfaceC0468E h5 = dVar.f2528c.h(context2);
                W.a.j(!c0137q2.f3578r);
                c0137q2.f3564d = new C0134n(1, h5);
                a4 = c0137q2.a();
                break;
        }
        this.f2453c = a4;
        c0 o2 = I.o(b4);
        a4.U();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < o2.f5552o; i4++) {
            arrayList.add(a4.f3256q.c((B) o2.get(i4)));
        }
        a4.I(arrayList);
        ((C0118H) this.f2453c).D();
        InterfaceC0138s interfaceC0138s = this.f2453c;
        a a5 = a(interfaceC0138s, textureRegistry$SurfaceProducer);
        C0118H c0118h = (C0118H) interfaceC0138s;
        c0118h.getClass();
        c0118h.f3251l.a(a5);
        ((C0118H) this.f2453c).H(new C0084e(3, 0, 1), !nVar.f2455a);
    }

    public abstract a a(InterfaceC0138s interfaceC0138s, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void b() {
        ((C0118H) this.f2453c).E();
    }
}
