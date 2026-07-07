package D1;

import B2.AbstractC0007h;
import F1.h;
import F1.o;
import K2.k;
import android.location.Location;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements o, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f455e;

    public /* synthetic */ e(g gVar, boolean[] zArr, h hVar, String str, k kVar) {
        this.f451a = gVar;
        this.f452b = zArr;
        this.f453c = hVar;
        this.f454d = str;
        this.f455e = kVar;
    }

    @Override // F1.o
    public void a(Location location) {
        g gVar = this.f451a;
        gVar.getClass();
        boolean[] zArr = this.f452b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        h hVar = this.f453c;
        gVar.f461o.f598l.remove(hVar);
        hVar.d();
        ((HashMap) gVar.f463q).remove(this.f454d);
        this.f455e.b(U1.a.H(location));
    }

    @Override // E1.a
    public void c(int i4) {
        g gVar = this.f451a;
        gVar.getClass();
        boolean[] zArr = this.f452b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        h hVar = this.f453c;
        gVar.f461o.f598l.remove(hVar);
        hVar.d();
        ((HashMap) gVar.f463q).remove(this.f454d);
        this.f455e.a(AbstractC0007h.f(i4), AbstractC0007h.e(i4), null);
    }
}
