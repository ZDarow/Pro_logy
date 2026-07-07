package D1;

import B2.AbstractC0007h;
import F1.o;
import X2.k;
import android.location.Location;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements E1.a, o, k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2.k f457b;

    public /* synthetic */ f(K2.k kVar, int i4) {
        this.f456a = i4;
        this.f457b = kVar;
    }

    @Override // F1.o
    public void a(Location location) {
        this.f457b.b(U1.a.H(location));
    }

    @Override // X2.k
    public void b(boolean z4) {
        this.f457b.b(Boolean.valueOf(z4));
    }

    @Override // E1.a
    public void c(int i4) {
        switch (this.f456a) {
            case 1:
                this.f457b.a(AbstractC0007h.f(i4), AbstractC0007h.e(i4), null);
                return;
            default:
                this.f457b.a(AbstractC0007h.f(i4), AbstractC0007h.e(i4), null);
                return;
        }
    }
}
