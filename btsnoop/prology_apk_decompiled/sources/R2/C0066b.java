package R2;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: R2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066b extends L2.u {

    /* renamed from: e, reason: collision with root package name */
    public static final C0066b f1803e = new C0066b(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1804d;

    public /* synthetic */ C0066b(int i4) {
        this.f1804d = i4;
    }

    @Override // L2.u
    public Object f(byte b4, ByteBuffer byteBuffer) {
        switch (this.f1804d) {
            case 1:
                k3.h.e(byteBuffer, "buffer");
                if (b4 == -127) {
                    Long l4 = (Long) e(byteBuffer);
                    if (l4 == null) {
                        return null;
                    }
                    int longValue = (int) l4.longValue();
                    M.f1793m.getClass();
                    for (M m4 : M.values()) {
                        if (m4.f1798l == longValue) {
                            return m4;
                        }
                    }
                    return null;
                }
                if (b4 == -126) {
                    Object e4 = e(byteBuffer);
                    List list = e4 instanceof List ? (List) e4 : null;
                    if (list == null) {
                        return null;
                    }
                    String str = (String) list.get(0);
                    Object obj = list.get(1);
                    k3.h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0072h(str, ((Boolean) obj).booleanValue());
                }
                if (b4 != -125) {
                    return super.f(b4, byteBuffer);
                }
                Object e5 = e(byteBuffer);
                List list2 = e5 instanceof List ? (List) e5 : null;
                if (list2 == null) {
                    return null;
                }
                String str2 = (String) list2.get(0);
                Object obj2 = list2.get(1);
                k3.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new O(str2, (M) obj2);
            default:
                return super.f(b4, byteBuffer);
        }
    }

    @Override // L2.u
    public void k(L2.t tVar, Object obj) {
        switch (this.f1804d) {
            case 1:
                if (obj instanceof M) {
                    tVar.write(129);
                    k(tVar, Integer.valueOf(((M) obj).f1798l));
                    return;
                }
                if (obj instanceof C0072h) {
                    tVar.write(130);
                    C0072h c0072h = (C0072h) obj;
                    k(tVar, a3.e.d0(c0072h.f1813a, Boolean.valueOf(c0072h.f1814b)));
                    return;
                }
                if (!(obj instanceof O)) {
                    super.k(tVar, obj);
                    return;
                }
                tVar.write(131);
                O o2 = (O) obj;
                k(tVar, a3.e.d0(o2.f1799a, o2.f1800b));
                return;
            default:
                super.k(tVar, obj);
                return;
        }
    }
}
