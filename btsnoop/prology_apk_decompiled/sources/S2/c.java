package S2;

import L2.t;
import L2.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends u {

    /* renamed from: d, reason: collision with root package name */
    public static final c f2055d = new Object();

    /* JADX WARN: Type inference failed for: r4v1, types: [S2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [S2.a, java.lang.Object] */
    @Override // L2.u
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        if (b4 != -127) {
            if (b4 != -126) {
                return super.f(b4, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            ?? obj = new Object();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            obj.f2053a = bool;
            return obj;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        ?? obj2 = new Object();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        obj2.f2058a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        obj2.f2059b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        obj2.f2060c = map;
        return obj2;
    }

    @Override // L2.u
    public final void k(t tVar, Object obj) {
        if (obj instanceof e) {
            tVar.write(129);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f2058a);
            arrayList.add(eVar.f2059b);
            arrayList.add(eVar.f2060c);
            k(tVar, arrayList);
            return;
        }
        if (!(obj instanceof a)) {
            super.k(tVar, obj);
            return;
        }
        tVar.write(130);
        a aVar = (a) obj;
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(aVar.f2053a);
        k(tVar, arrayList2);
    }
}
