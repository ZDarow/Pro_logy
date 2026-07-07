package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.q */
/* loaded from: classes.dex */
public final class C1125q {

    /* renamed from: c */
    public static final /* synthetic */ int f4269c = 0;

    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.C1090X f4270a = androidx.datastore.preferences.protobuf.C1090X.m2475f();

    /* renamed from: b */
    public boolean f4271b;

    static {
        new androidx.datastore.preferences.protobuf.C1125q(0);
    }

    public C1125q() {
    }

    /* renamed from: b */
    public static void m2627b(androidx.datastore.preferences.protobuf.C1115l c1115l, androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q0, int i4, java.lang.Object obj) {
        if (enumC1126q0 == androidx.datastore.preferences.protobuf.EnumC1126q0.f4273o) {
            c1115l.m2605F0(i4, 3);
            ((androidx.datastore.preferences.protobuf.AbstractC1093a) obj).mo2485b(c1115l);
            c1115l.m2605F0(i4, 4);
            return;
        }
        c1115l.m2605F0(i4, enumC1126q0.f4277m);
        switch (enumC1126q0.ordinal()) {
            case 0:
                c1115l.m2600A0(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                return;
            case 1:
                c1115l.m2623y0(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                c1115l.m2609J0(((java.lang.Long) obj).longValue());
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                c1115l.m2609J0(((java.lang.Long) obj).longValue());
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                c1115l.m2602C0(((java.lang.Integer) obj).intValue());
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                c1115l.m2600A0(((java.lang.Long) obj).longValue());
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                c1115l.m2623y0(((java.lang.Integer) obj).intValue());
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                c1115l.m2617s0(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof androidx.datastore.preferences.protobuf.C1105g) {
                    c1115l.m2621w0((androidx.datastore.preferences.protobuf.C1105g) obj);
                    return;
                } else {
                    c1115l.m2604E0((java.lang.String) obj);
                    return;
                }
            case 9:
                ((androidx.datastore.preferences.protobuf.AbstractC1093a) obj).mo2485b(c1115l);
                return;
            case 10:
                androidx.datastore.preferences.protobuf.AbstractC1093a abstractC1093a = (androidx.datastore.preferences.protobuf.AbstractC1093a) obj;
                c1115l.getClass();
                c1115l.m2607H0(((androidx.datastore.preferences.protobuf.AbstractC1132v) abstractC1093a).mo2484a(null));
                abstractC1093a.mo2485b(c1115l);
                return;
            case 11:
                if (obj instanceof androidx.datastore.preferences.protobuf.C1105g) {
                    c1115l.m2621w0((androidx.datastore.preferences.protobuf.C1105g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c1115l.m2607H0(length);
                c1115l.m2618t0(bArr, 0, length);
                return;
            case 12:
                c1115l.m2607H0(((java.lang.Integer) obj).intValue());
                return;
            case 13:
                c1115l.m2602C0(((java.lang.Integer) obj).intValue());
                return;
            case 14:
                c1115l.m2623y0(((java.lang.Integer) obj).intValue());
                return;
            case 15:
                c1115l.m2600A0(((java.lang.Long) obj).longValue());
                return;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                c1115l.m2607H0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                c1115l.m2609J0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void m2628a() {
        if (this.f4271b) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1090X c1090x = this.f4270a;
        int size = c1090x.f4196l.size();
        for (int i4 = 0; i4 < size; i4++) {
            java.util.Map.Entry m2478c = c1090x.m2478c(i4);
            if (m2478c.getValue() instanceof androidx.datastore.preferences.protobuf.AbstractC1132v) {
                androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = (androidx.datastore.preferences.protobuf.AbstractC1132v) m2478c.getValue();
                abstractC1132v.getClass();
                androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
                c1085s.getClass();
                c1085s.m2422a(abstractC1132v.getClass()).mo2407h(abstractC1132v);
                abstractC1132v.m2640j();
            }
        }
        if (!c1090x.f4198n) {
            if (c1090x.f4196l.size() > 0) {
                c1090x.m2478c(0).getKey().getClass();
                throw new java.lang.ClassCastException();
            }
            java.util.Iterator it = c1090x.m2479d().iterator();
            if (it.hasNext()) {
                ((java.util.Map.Entry) it.next()).getKey().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        if (!c1090x.f4198n) {
            c1090x.f4197m = c1090x.f4197m.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(c1090x.f4197m);
            c1090x.f4200p = c1090x.f4200p.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(c1090x.f4200p);
            c1090x.f4198n = true;
        }
        this.f4271b = true;
    }

    public final java.lang.Object clone() {
        androidx.datastore.preferences.protobuf.C1125q c1125q = new androidx.datastore.preferences.protobuf.C1125q();
        androidx.datastore.preferences.protobuf.C1090X c1090x = this.f4270a;
        if (c1090x.f4196l.size() > 0) {
            java.util.Map.Entry m2478c = c1090x.m2478c(0);
            if (m2478c.getKey() != null) {
                throw new java.lang.ClassCastException();
            }
            m2478c.getValue();
            throw null;
        }
        java.util.Iterator it = c1090x.m2479d().iterator();
        if (!it.hasNext()) {
            return c1125q;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new java.lang.ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.C1125q) {
            return this.f4270a.equals(((androidx.datastore.preferences.protobuf.C1125q) obj).f4270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4270a.hashCode();
    }

    public C1125q(int i4) {
        m2628a();
        m2628a();
    }
}
