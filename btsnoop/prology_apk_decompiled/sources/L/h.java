package L;

import androidx.datastore.preferences.protobuf.AbstractC0150b;
import androidx.datastore.preferences.protobuf.AbstractC0167t;
import androidx.datastore.preferences.protobuf.AbstractC0169v;
import androidx.datastore.preferences.protobuf.AbstractC0171x;
import androidx.datastore.preferences.protobuf.InterfaceC0170w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0169v {
    private static final h DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0170w strings_ = T.f4037o;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0169v.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        InterfaceC0170w interfaceC0170w = hVar.strings_;
        if (!((AbstractC0150b) interfaceC0170w).f4062l) {
            T t4 = (T) interfaceC0170w;
            int i4 = t4.f4039n;
            hVar.strings_ = t4.c(i4 == 0 ? 10 : i4 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0171x.f4148a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((T) randomAccess).f4039n);
        }
        T t5 = (T) randomAccess;
        int i5 = t5.f4039n;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (t5.f4039n - i5) + " is null.";
                for (int i6 = t5.f4039n - 1; i6 >= i5; i6--) {
                    t5.remove(i6);
                }
                throw new NullPointerException(str);
            }
            t5.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((AbstractC0167t) DEFAULT_INSTANCE.e(5));
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
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0167t(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Q q4 = PARSER;
                Q q5 = q4;
                if (q4 == null) {
                    synchronized (h.class) {
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

    public final InterfaceC0170w p() {
        return this.strings_;
    }
}
