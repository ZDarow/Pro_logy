package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4121c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final X f4122a = X.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4123b;

    static {
        new C0165q(0);
    }

    public C0165q() {
    }

    public static void b(C0160l c0160l, q0 q0Var, int i4, Object obj) {
        if (q0Var == q0.f4125o) {
            c0160l.F0(i4, 3);
            ((AbstractC0149a) obj).b(c0160l);
            c0160l.F0(i4, 4);
            return;
        }
        c0160l.F0(i4, q0Var.f4129m);
        switch (q0Var.ordinal()) {
            case 0:
                c0160l.A0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0160l.y0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                c0160l.J0(((Long) obj).longValue());
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0160l.J0(((Long) obj).longValue());
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                c0160l.C0(((Integer) obj).intValue());
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                c0160l.A0(((Long) obj).longValue());
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0160l.y0(((Integer) obj).intValue());
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0160l.s0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0155g) {
                    c0160l.w0((C0155g) obj);
                    return;
                } else {
                    c0160l.E0((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0149a) obj).b(c0160l);
                return;
            case 10:
                AbstractC0149a abstractC0149a = (AbstractC0149a) obj;
                c0160l.getClass();
                c0160l.H0(((AbstractC0169v) abstractC0149a).a(null));
                abstractC0149a.b(c0160l);
                return;
            case 11:
                if (obj instanceof C0155g) {
                    c0160l.w0((C0155g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0160l.H0(length);
                c0160l.t0(bArr, 0, length);
                return;
            case 12:
                c0160l.H0(((Integer) obj).intValue());
                return;
            case 13:
                c0160l.C0(((Integer) obj).intValue());
                return;
            case 14:
                c0160l.y0(((Integer) obj).intValue());
                return;
            case 15:
                c0160l.A0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0160l.H0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0160l.J0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        if (this.f4123b) {
            return;
        }
        X x3 = this.f4122a;
        int size = x3.f4048l.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry c4 = x3.c(i4);
            if (c4.getValue() instanceof AbstractC0169v) {
                AbstractC0169v abstractC0169v = (AbstractC0169v) c4.getValue();
                abstractC0169v.getClass();
                S s = S.f4034c;
                s.getClass();
                s.a(abstractC0169v.getClass()).h(abstractC0169v);
                abstractC0169v.j();
            }
        }
        if (!x3.f4050n) {
            if (x3.f4048l.size() > 0) {
                x3.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x3.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x3.f4050n) {
            x3.f4049m = x3.f4049m.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x3.f4049m);
            x3.f4052p = x3.f4052p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x3.f4052p);
            x3.f4050n = true;
        }
        this.f4123b = true;
    }

    public final Object clone() {
        C0165q c0165q = new C0165q();
        X x3 = this.f4122a;
        if (x3.f4048l.size() > 0) {
            Map.Entry c4 = x3.c(0);
            if (c4.getKey() != null) {
                throw new ClassCastException();
            }
            c4.getValue();
            throw null;
        }
        Iterator it = x3.d().iterator();
        if (!it.hasNext()) {
            return c0165q;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0165q) {
            return this.f4122a.equals(((C0165q) obj).f4122a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4122a.hashCode();
    }

    public C0165q(int i4) {
        a();
        a();
    }
}
