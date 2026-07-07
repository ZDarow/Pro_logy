package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v */
/* loaded from: classes.dex */
public abstract class AbstractC1132v extends androidx.datastore.preferences.protobuf.AbstractC1093a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.AbstractC1132v> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected androidx.datastore.preferences.protobuf.C1098c0 unknownFields;

    public AbstractC1132v() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = androidx.datastore.preferences.protobuf.C1098c0.f4213f;
    }

    /* renamed from: f */
    public static androidx.datastore.preferences.protobuf.AbstractC1132v m2633f(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = defaultInstanceMap.get(cls);
        if (abstractC1132v == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1132v = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e4) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC1132v == null) {
            abstractC1132v = (androidx.datastore.preferences.protobuf.AbstractC1132v) ((androidx.datastore.preferences.protobuf.AbstractC1132v) androidx.datastore.preferences.protobuf.AbstractC1110i0.m2566d(cls)).mo774e(6);
            if (abstractC1132v == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC1132v);
        }
        return abstractC1132v;
    }

    /* renamed from: g */
    public static java.lang.Object m2634g(java.lang.reflect.Method method, androidx.datastore.preferences.protobuf.AbstractC1093a abstractC1093a, java.lang.Object... objArr) {
        try {
            return method.invoke(abstractC1093a, objArr);
        } catch (java.lang.IllegalAccessException e4) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (java.lang.reflect.InvocationTargetException e5) {
            java.lang.Throwable cause = e5.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: h */
    public static final boolean m2635h(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v, boolean z4) {
        byte byteValue = ((java.lang.Byte) abstractC1132v.mo774e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        c1085s.getClass();
        boolean mo2400a = c1085s.m2422a(abstractC1132v.getClass()).mo2400a(abstractC1132v);
        if (z4) {
            abstractC1132v.mo774e(2);
        }
        return mo2400a;
    }

    /* renamed from: l */
    public static void m2636l(java.lang.Class cls, androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v) {
        abstractC1132v.m2640j();
        defaultInstanceMap.put(cls, abstractC1132v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1093a
    /* renamed from: a */
    public final int mo2484a(androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        int mo2405f;
        int mo2405f2;
        if (m2639i()) {
            if (interfaceC1088V == null) {
                androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
                c1085s.getClass();
                mo2405f2 = c1085s.m2422a(getClass()).mo2405f(this);
            } else {
                mo2405f2 = interfaceC1088V.mo2405f(this);
            }
            if (mo2405f2 >= 0) {
                return mo2405f2;
            }
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("serialized size must be non-negative, was ", mo2405f2));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i4 & Integer.MAX_VALUE;
        }
        if (interfaceC1088V == null) {
            androidx.datastore.preferences.protobuf.C1085S c1085s2 = androidx.datastore.preferences.protobuf.C1085S.f4182c;
            c1085s2.getClass();
            mo2405f = c1085s2.m2422a(getClass()).mo2405f(this);
        } else {
            mo2405f = interfaceC1088V.mo2405f(this);
        }
        m2642m(mo2405f);
        return mo2405f;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1093a
    /* renamed from: b */
    public final void mo2485b(androidx.datastore.preferences.protobuf.C1115l c1115l) {
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        c1085s.getClass();
        androidx.datastore.preferences.protobuf.InterfaceC1088V m2422a = c1085s.m2422a(getClass());
        androidx.datastore.preferences.protobuf.C1072E c1072e = c1115l.f4258g;
        if (c1072e == null) {
            c1072e = new androidx.datastore.preferences.protobuf.C1072E(c1115l);
        }
        m2422a.mo2403d(this, c1072e);
    }

    /* renamed from: c */
    public final void m2637c() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    /* renamed from: d */
    public final void m2638d() {
        m2642m(Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public abstract java.lang.Object mo774e(int i4);

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        c1085s.getClass();
        return c1085s.m2422a(getClass()).mo2408i(this, (androidx.datastore.preferences.protobuf.AbstractC1132v) obj);
    }

    public final int hashCode() {
        if (m2639i()) {
            androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
            c1085s.getClass();
            return c1085s.m2422a(getClass()).mo2404e(this);
        }
        if (this.memoizedHashCode == 0) {
            androidx.datastore.preferences.protobuf.C1085S c1085s2 = androidx.datastore.preferences.protobuf.C1085S.f4182c;
            c1085s2.getClass();
            this.memoizedHashCode = c1085s2.m2422a(getClass()).mo2404e(this);
        }
        return this.memoizedHashCode;
    }

    /* renamed from: i */
    public final boolean m2639i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* renamed from: j */
    public final void m2640j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v m2641k() {
        return (androidx.datastore.preferences.protobuf.AbstractC1132v) mo774e(4);
    }

    /* renamed from: m */
    public final void m2642m(int i4) {
        if (i4 < 0) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("serialized size must be non-negative, was ", i4));
        }
        this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final java.lang.String toString() {
        java.lang.String obj = super.toString();
        char[] cArr = androidx.datastore.preferences.protobuf.AbstractC1079L.f4161a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(obj);
        androidx.datastore.preferences.protobuf.AbstractC1079L.m2381c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
