package M;

import B3.m;
import B3.n;
import B3.o;
import B3.p;
import L.i;
import L.j;
import L.k;
import androidx.datastore.preferences.protobuf.AbstractC0169v;
import androidx.datastore.preferences.protobuf.AbstractC0171x;
import androidx.datastore.preferences.protobuf.C0155g;
import androidx.datastore.preferences.protobuf.C0160l;
import androidx.datastore.preferences.protobuf.C0173z;
import androidx.datastore.preferences.protobuf.InterfaceC0170w;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1113a = new Object();

    public final b a(p pVar) {
        byte[] bArr;
        try {
            L.f q4 = L.f.q(new o(pVar));
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            k3.h.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map o2 = q4.o();
            k3.h.d(o2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o2.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                k3.h.d(str, "name");
                k3.h.d(kVar, "value");
                int E3 = kVar.E();
                switch (E3 == 0 ? -1 : g.f1112a[j.b(E3)]) {
                    case -1:
                        throw new IOException("Value case is null.", null);
                    case 0:
                    default:
                        throw new RuntimeException();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(kVar.v()));
                        break;
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                        bVar.d(new d(str), Float.valueOf(kVar.z()));
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        bVar.d(new d(str), Double.valueOf(kVar.y()));
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        bVar.d(new d(str), Integer.valueOf(kVar.A()));
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        bVar.d(new d(str), Long.valueOf(kVar.B()));
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        d dVar = new d(str);
                        String C4 = kVar.C();
                        k3.h.d(C4, "value.string");
                        bVar.d(dVar, C4);
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        d dVar2 = new d(str);
                        InterfaceC0170w p2 = kVar.D().p();
                        k3.h.d(p2, "value.stringSet.stringsList");
                        bVar.d(dVar2, a3.d.j0(p2));
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        d dVar3 = new d(str);
                        C0155g w = kVar.w();
                        int size = w.size();
                        if (size == 0) {
                            bArr = AbstractC0171x.f4149b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w.d(bArr2, size);
                            bArr = bArr2;
                        }
                        k3.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new IOException("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (C0173z e4) {
            throw new IOException("Unable to parse preferences proto.", e4);
        }
    }

    public final void b(Object obj, n nVar) {
        AbstractC0169v a4;
        Map a5 = ((b) obj).a();
        L.d p2 = L.f.p();
        for (Map.Entry entry : a5.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f1108a;
            if (value instanceof Boolean) {
                i F3 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                k.s((k) F3.f4147m, booleanValue);
                a4 = F3.a();
            } else if (value instanceof Float) {
                i F4 = k.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                k.t((k) F4.f4147m, floatValue);
                a4 = F4.a();
            } else if (value instanceof Double) {
                i F5 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                k.q((k) F5.f4147m, doubleValue);
                a4 = F5.a();
            } else if (value instanceof Integer) {
                i F6 = k.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                k.u((k) F6.f4147m, intValue);
                a4 = F6.a();
            } else if (value instanceof Long) {
                i F7 = k.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                k.n((k) F7.f4147m, longValue);
                a4 = F7.a();
            } else if (value instanceof String) {
                i F8 = k.F();
                F8.c();
                k.o((k) F8.f4147m, (String) value);
                a4 = F8.a();
            } else if (value instanceof Set) {
                i F9 = k.F();
                L.g q4 = L.h.q();
                k3.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q4.c();
                L.h.n((L.h) q4.f4147m, (Set) value);
                F9.c();
                k.p((k) F9.f4147m, (L.h) q4.a());
                a4 = F9.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i F10 = k.F();
                byte[] bArr = (byte[]) value;
                C0155g c0155g = C0155g.f4078n;
                C0155g c4 = C0155g.c(bArr, 0, bArr.length);
                F10.c();
                k.r((k) F10.f4147m, c4);
                a4 = F10.a();
            }
            p2.getClass();
            str.getClass();
            p2.c();
            L.f.n((L.f) p2.f4147m).put(str, (k) a4);
        }
        L.f fVar = (L.f) p2.a();
        m mVar = new m(nVar);
        int a6 = fVar.a(null);
        Logger logger = C0160l.f4108l;
        if (a6 > 4096) {
            a6 = 4096;
        }
        C0160l c0160l = new C0160l(mVar, a6);
        fVar.b(c0160l);
        if (c0160l.f4113j > 0) {
            c0160l.q0();
        }
    }
}
