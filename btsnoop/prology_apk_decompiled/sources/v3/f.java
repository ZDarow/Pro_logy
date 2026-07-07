package v3;

import b3.C0196j;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import java.util.ArrayList;
import u.AbstractC0580h;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0195i f8722l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8723m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8724n;

    public f(InterfaceC0195i interfaceC0195i, int i4, int i5) {
        this.f8722l = interfaceC0195i;
        this.f8723m = i4;
        this.f8724n = i5;
    }

    @Override // u3.d
    public Object C(u3.e eVar, InterfaceC0190d interfaceC0190d) {
        d dVar = new d(eVar, this, null);
        w3.t tVar = new w3.t(interfaceC0190d, interfaceC0190d.f());
        Object e4 = AbstractC0580h.e(tVar, tVar, dVar);
        return e4 == EnumC0225a.f4710l ? e4 : Z2.g.f3186a;
    }

    public abstract Object a(t3.o oVar, InterfaceC0190d interfaceC0190d);

    public abstract f b(InterfaceC0195i interfaceC0195i, int i4, int i5);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C0196j c0196j = C0196j.f4462l;
        InterfaceC0195i interfaceC0195i = this.f8722l;
        if (interfaceC0195i != c0196j) {
            arrayList.add("context=" + interfaceC0195i);
        }
        int i4 = this.f8723m;
        if (i4 != -3) {
            arrayList.add("capacity=" + i4);
        }
        int i5 = this.f8724n;
        if (i5 != 1) {
            arrayList.add("onBufferOverflow=".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + a3.d.f0(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // v3.j
    public final u3.d y(InterfaceC0195i interfaceC0195i, int i4, int i5) {
        InterfaceC0195i interfaceC0195i2 = this.f8722l;
        InterfaceC0195i c4 = interfaceC0195i.c(interfaceC0195i2);
        int i6 = this.f8724n;
        int i7 = this.f8723m;
        if (i5 == 1) {
            if (i7 != -3) {
                if (i4 != -3) {
                    if (i7 != -2) {
                        if (i4 != -2) {
                            i4 += i7;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i7;
            }
            i5 = i6;
        }
        return (k3.h.a(c4, interfaceC0195i2) && i4 == i7 && i5 == i6) ? this : b(c4, i4, i5);
    }
}
