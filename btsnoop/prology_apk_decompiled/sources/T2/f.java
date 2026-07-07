package T2;

import L2.t;
import L2.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends u {

    /* renamed from: d, reason: collision with root package name */
    public static final f f2440d = new Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [T2.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T2.e, java.lang.Object] */
    @Override // L2.u
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        switch (b4) {
            case -127:
                Object e4 = e(byteBuffer);
                if (e4 == null) {
                    return null;
                }
                return h.values()[((Long) e4).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj = new Object();
                Long l4 = (Long) arrayList.get(0);
                if (l4 == null) {
                    throw new IllegalStateException("Nonnull field \"playerId\" is null.");
                }
                obj.f2441a = l4;
                return obj;
            case -125:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.f2434a = (String) arrayList2.get(0);
                obj2.f2435b = (String) arrayList2.get(1);
                obj2.f2436c = (String) arrayList2.get(2);
                obj2.f2437d = (String) arrayList2.get(3);
                Map map = (Map) arrayList2.get(4);
                if (map == null) {
                    throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
                }
                obj2.f2438e = map;
                obj2.f2439f = (h) arrayList2.get(5);
                return obj2;
            default:
                return super.f(b4, byteBuffer);
        }
    }

    @Override // L2.u
    public final void k(t tVar, Object obj) {
        if (obj instanceof h) {
            tVar.write(129);
            k(tVar, obj == null ? null : Integer.valueOf(((h) obj).f2444l));
            return;
        }
        if (obj instanceof g) {
            tVar.write(130);
            g gVar = (g) obj;
            gVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(gVar.f2441a);
            k(tVar, arrayList);
            return;
        }
        if (!(obj instanceof e)) {
            super.k(tVar, obj);
            return;
        }
        tVar.write(131);
        e eVar = (e) obj;
        eVar.getClass();
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(eVar.f2434a);
        arrayList2.add(eVar.f2435b);
        arrayList2.add(eVar.f2436c);
        arrayList2.add(eVar.f2437d);
        arrayList2.add(eVar.f2438e);
        arrayList2.add(eVar.f2439f);
        k(tVar, arrayList2);
    }
}
