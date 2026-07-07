package p048M;

/* renamed from: M.h */
/* loaded from: classes.dex */
public final class C0401h {

    /* renamed from: a */
    public static final p048M.C0401h f1152a = new java.lang.Object();

    /* renamed from: a */
    public final p048M.C0395b m858a(p010B3.C0085p c0085p) {
        byte[] bArr;
        try {
            p044L.C0348f m773q = p044L.C0348f.m773q(new p010B3.C0084o(c0085p));
            p048M.C0395b c0395b = new p048M.C0395b(false);
            p048M.AbstractC0398e[] abstractC0398eArr = (p048M.AbstractC0398e[]) java.util.Arrays.copyOf(new p048M.AbstractC0398e[0], 0);
            p154k3.AbstractC1803h.m3779e(abstractC0398eArr, "pairs");
            c0395b.m855b();
            if (abstractC0398eArr.length > 0) {
                p048M.AbstractC0398e abstractC0398e = abstractC0398eArr[0];
                throw null;
            }
            java.util.Map m775o = m773q.m775o();
            p154k3.AbstractC1803h.m3778d(m775o, "preferencesProto.preferencesMap");
            for (java.util.Map.Entry entry : m775o.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                p044L.C0353k c0353k = (p044L.C0353k) entry.getValue();
                p154k3.AbstractC1803h.m3778d(str, "name");
                p154k3.AbstractC1803h.m3778d(c0353k, "value");
                int m797E = c0353k.m797E();
                switch (m797E == 0 ? -1 : p048M.AbstractC0400g.f1151a[p044L.AbstractC0352j.m781b(m797E)]) {
                    case -1:
                        throw new java.io.IOException("Value case is null.", null);
                    case 0:
                    default:
                        throw new java.lang.RuntimeException();
                    case 1:
                        c0395b.m857d(new p048M.C0397d(str), java.lang.Boolean.valueOf(c0353k.m798v()));
                        break;
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        c0395b.m857d(new p048M.C0397d(str), java.lang.Float.valueOf(c0353k.m801z()));
                        break;
                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                        c0395b.m857d(new p048M.C0397d(str), java.lang.Double.valueOf(c0353k.m800y()));
                        break;
                    case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                        c0395b.m857d(new p048M.C0397d(str), java.lang.Integer.valueOf(c0353k.m793A()));
                        break;
                    case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                        c0395b.m857d(new p048M.C0397d(str), java.lang.Long.valueOf(c0353k.m794B()));
                        break;
                    case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                        p048M.C0397d c0397d = new p048M.C0397d(str);
                        java.lang.String m795C = c0353k.m795C();
                        p154k3.AbstractC1803h.m3778d(m795C, "value.string");
                        c0395b.m857d(c0397d, m795C);
                        break;
                    case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                        p048M.C0397d c0397d2 = new p048M.C0397d(str);
                        androidx.datastore.preferences.protobuf.InterfaceC1133w m779p = c0353k.m796D().m779p();
                        p154k3.AbstractC1803h.m3778d(m779p, "value.stringSet.stringsList");
                        c0395b.m857d(c0397d2, p105a3.AbstractC1021d.m2055j0(m779p));
                        break;
                    case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                        p048M.C0397d c0397d3 = new p048M.C0397d(str);
                        androidx.datastore.preferences.protobuf.C1105g m799w = c0353k.m799w();
                        int size = m799w.size();
                        if (size == 0) {
                            bArr = androidx.datastore.preferences.protobuf.AbstractC1134x.f4298b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            m799w.mo2497d(bArr2, size);
                            bArr = bArr2;
                        }
                        p154k3.AbstractC1803h.m3778d(bArr, "value.bytes.toByteArray()");
                        c0395b.m857d(c0397d3, bArr);
                        break;
                    case 9:
                        throw new java.io.IOException("Value not set.", null);
                }
            }
            return new p048M.C0395b(new java.util.LinkedHashMap(c0395b.m854a()), true);
        } catch (androidx.datastore.preferences.protobuf.C1136z e4) {
            throw new java.io.IOException("Unable to parse preferences proto.", e4);
        }
    }

    /* renamed from: b */
    public final void m859b(java.lang.Object obj, p010B3.C0083n c0083n) {
        androidx.datastore.preferences.protobuf.AbstractC1132v m2630a;
        java.util.Map m854a = ((p048M.C0395b) obj).m854a();
        p044L.C0346d m772p = p044L.C0348f.m772p();
        for (java.util.Map.Entry entry : m854a.entrySet()) {
            p048M.C0397d c0397d = (p048M.C0397d) entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.String str = c0397d.f1147a;
            if (value instanceof java.lang.Boolean) {
                p044L.C0351i m783F = p044L.C0353k.m783F();
                boolean booleanValue = ((java.lang.Boolean) value).booleanValue();
                m783F.m2632c();
                p044L.C0353k.m789s((p044L.C0353k) m783F.f4296m, booleanValue);
                m2630a = m783F.m2630a();
            } else if (value instanceof java.lang.Float) {
                p044L.C0351i m783F2 = p044L.C0353k.m783F();
                float floatValue = ((java.lang.Number) value).floatValue();
                m783F2.m2632c();
                p044L.C0353k.m790t((p044L.C0353k) m783F2.f4296m, floatValue);
                m2630a = m783F2.m2630a();
            } else if (value instanceof java.lang.Double) {
                p044L.C0351i m783F3 = p044L.C0353k.m783F();
                double doubleValue = ((java.lang.Number) value).doubleValue();
                m783F3.m2632c();
                p044L.C0353k.m787q((p044L.C0353k) m783F3.f4296m, doubleValue);
                m2630a = m783F3.m2630a();
            } else if (value instanceof java.lang.Integer) {
                p044L.C0351i m783F4 = p044L.C0353k.m783F();
                int intValue = ((java.lang.Number) value).intValue();
                m783F4.m2632c();
                p044L.C0353k.m791u((p044L.C0353k) m783F4.f4296m, intValue);
                m2630a = m783F4.m2630a();
            } else if (value instanceof java.lang.Long) {
                p044L.C0351i m783F5 = p044L.C0353k.m783F();
                long longValue = ((java.lang.Number) value).longValue();
                m783F5.m2632c();
                p044L.C0353k.m784n((p044L.C0353k) m783F5.f4296m, longValue);
                m2630a = m783F5.m2630a();
            } else if (value instanceof java.lang.String) {
                p044L.C0351i m783F6 = p044L.C0353k.m783F();
                m783F6.m2632c();
                p044L.C0353k.m785o((p044L.C0353k) m783F6.f4296m, (java.lang.String) value);
                m2630a = m783F6.m2630a();
            } else if (value instanceof java.util.Set) {
                p044L.C0351i m783F7 = p044L.C0353k.m783F();
                p044L.C0349g m778q = p044L.C0350h.m778q();
                p154k3.AbstractC1803h.m3777c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                m778q.m2632c();
                p044L.C0350h.m776n((p044L.C0350h) m778q.f4296m, (java.util.Set) value);
                m783F7.m2632c();
                p044L.C0353k.m786p((p044L.C0353k) m783F7.f4296m, (p044L.C0350h) m778q.m2630a());
                m2630a = m783F7.m2630a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new java.lang.IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                p044L.C0351i m783F8 = p044L.C0353k.m783F();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.C1105g c1105g = androidx.datastore.preferences.protobuf.C1105g.f4226n;
                androidx.datastore.preferences.protobuf.C1105g m2509c = androidx.datastore.preferences.protobuf.C1105g.m2509c(bArr, 0, bArr.length);
                m783F8.m2632c();
                p044L.C0353k.m788r((p044L.C0353k) m783F8.f4296m, m2509c);
                m2630a = m783F8.m2630a();
            }
            m772p.getClass();
            str.getClass();
            m772p.m2632c();
            p044L.C0348f.m771n((p044L.C0348f) m772p.f4296m).put(str, (p044L.C0353k) m2630a);
        }
        p044L.C0348f c0348f = (p044L.C0348f) m772p.m2630a();
        p010B3.C0082m c0082m = new p010B3.C0082m(c0083n);
        int mo2484a = c0348f.mo2484a(null);
        java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
        if (mo2484a > 4096) {
            mo2484a = 4096;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = new androidx.datastore.preferences.protobuf.C1115l(c0082m, mo2484a);
        c0348f.mo2485b(c1115l);
        if (c1115l.f4261j > 0) {
            c1115l.m2615q0();
        }
    }
}
