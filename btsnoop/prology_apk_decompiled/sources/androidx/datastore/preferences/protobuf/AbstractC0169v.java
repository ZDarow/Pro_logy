package androidx.datastore.preferences.protobuf;

import B2.AbstractC0007h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0169v extends AbstractC0149a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0169v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0169v() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f4065f;
    }

    public static AbstractC0169v f(Class cls) {
        AbstractC0169v abstractC0169v = defaultInstanceMap.get(cls);
        if (abstractC0169v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0169v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0169v == null) {
            abstractC0169v = (AbstractC0169v) ((AbstractC0169v) i0.d(cls)).e(6);
            if (abstractC0169v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0169v);
        }
        return abstractC0169v;
    }

    public static Object g(Method method, AbstractC0149a abstractC0149a, Object... objArr) {
        try {
            return method.invoke(abstractC0149a, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0169v abstractC0169v, boolean z4) {
        byte byteValue = ((Byte) abstractC0169v.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        S s = S.f4034c;
        s.getClass();
        boolean a4 = s.a(abstractC0169v.getClass()).a(abstractC0169v);
        if (z4) {
            abstractC0169v.e(2);
        }
        return a4;
    }

    public static void l(Class cls, AbstractC0169v abstractC0169v) {
        abstractC0169v.j();
        defaultInstanceMap.put(cls, abstractC0169v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0149a
    public final int a(V v4) {
        int f4;
        int f5;
        if (i()) {
            if (v4 == null) {
                S s = S.f4034c;
                s.getClass();
                f5 = s.a(getClass()).f(this);
            } else {
                f5 = v4.f(this);
            }
            if (f5 >= 0) {
                return f5;
            }
            throw new IllegalStateException(AbstractC0007h.k("serialized size must be non-negative, was ", f5));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i4 & Integer.MAX_VALUE;
        }
        if (v4 == null) {
            S s4 = S.f4034c;
            s4.getClass();
            f4 = s4.a(getClass()).f(this);
        } else {
            f4 = v4.f(this);
        }
        m(f4);
        return f4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0149a
    public final void b(C0160l c0160l) {
        S s = S.f4034c;
        s.getClass();
        V a4 = s.a(getClass());
        E e4 = c0160l.f4110g;
        if (e4 == null) {
            e4 = new E(c0160l);
        }
        a4.d(this, e4);
    }

    public final void c() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S s = S.f4034c;
        s.getClass();
        return s.a(getClass()).i(this, (AbstractC0169v) obj);
    }

    public final int hashCode() {
        if (i()) {
            S s = S.f4034c;
            s.getClass();
            return s.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            S s4 = S.f4034c;
            s4.getClass();
            this.memoizedHashCode = s4.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0169v k() {
        return (AbstractC0169v) e(4);
    }

    public final void m(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException(AbstractC0007h.k("serialized size must be non-negative, was ", i4));
        }
        this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L.f4013a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        L.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
