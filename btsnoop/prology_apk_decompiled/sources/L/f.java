package L;

import W.l;
import androidx.datastore.preferences.protobuf.AbstractC0167t;
import androidx.datastore.preferences.protobuf.AbstractC0169v;
import androidx.datastore.preferences.protobuf.C0157i;
import androidx.datastore.preferences.protobuf.C0162n;
import androidx.datastore.preferences.protobuf.C0173z;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.b0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0169v {
    private static final f DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f4009m;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0169v.l(f.class, fVar);
    }

    public static H n(f fVar) {
        H h4 = fVar.preferences_;
        if (!h4.f4010l) {
            fVar.preferences_ = h4.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0167t) DEFAULT_INSTANCE.e(5));
    }

    public static f q(InputStream inputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0157i c0157i = new C0157i(inputStream);
        C0162n a4 = C0162n.a();
        AbstractC0169v k4 = fVar.k();
        try {
            S s = S.f4034c;
            s.getClass();
            V a5 = s.a(k4.getClass());
            l lVar = c0157i.f4106b;
            if (lVar == null) {
                lVar = new l(c0157i);
            }
            a5.c(k4, lVar, a4);
            a5.h(k4);
            if (AbstractC0169v.h(k4, true)) {
                return (f) k4;
            }
            throw new IOException(new b0().getMessage());
        } catch (b0 e4) {
            throw new IOException(e4.getMessage());
        } catch (C0173z e5) {
            if (e5.f4150l) {
                throw new IOException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (IOException e6) {
            if (e6.getCause() instanceof C0173z) {
                throw ((C0173z) e6.getCause());
            }
            throw new IOException(e6.getMessage(), e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof C0173z) {
                throw ((C0173z) e7.getCause());
            }
            throw e7;
        }
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.datastore.preferences.protobuf.Q, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0169v
    public final Object e(int i4) {
        switch (j.b(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f1039a});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0167t(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Q q4 = PARSER;
                Q q5 = q4;
                if (q4 == null) {
                    synchronized (f.class) {
                        try {
                            Q q6 = PARSER;
                            Q q7 = q6;
                            if (q6 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                q7 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return q5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
