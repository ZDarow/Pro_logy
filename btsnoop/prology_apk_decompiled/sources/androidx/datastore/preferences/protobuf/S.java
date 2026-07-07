package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final S f4034c = new S();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4036b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E f4035a = new E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.N] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.N] */
    public final V a(Class cls) {
        C0163o c0163o;
        M x3;
        M m4;
        Class cls2;
        AbstractC0171x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4036b;
        V v4 = (V) concurrentHashMap.get(cls);
        if (v4 != null) {
            return v4;
        }
        E e4 = this.f4035a;
        e4.getClass();
        Class cls3 = W.f4044a;
        if (!AbstractC0169v.class.isAssignableFrom(cls) && (cls2 = W.f4044a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U b4 = ((D) e4.f4004a).b(cls);
        if ((b4.f4043d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0169v.class.isAssignableFrom(cls);
            AbstractC0169v abstractC0169v = b4.f4040a;
            if (isAssignableFrom) {
                m4 = new N(W.f4046c, AbstractC0164p.f4119a, abstractC0169v);
            } else {
                d0 d0Var = W.f4045b;
                C0163o c0163o2 = AbstractC0164p.f4120b;
                if (c0163o2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                m4 = new N(d0Var, c0163o2, abstractC0169v);
            }
            x3 = m4;
        } else if (AbstractC0169v.class.isAssignableFrom(cls)) {
            O o2 = P.f4033b;
            B b5 = C.f4001b;
            d0 d0Var2 = W.f4046c;
            C0163o c0163o3 = L.j.b(b4.d()) != 1 ? AbstractC0164p.f4119a : null;
            I i4 = J.f4012b;
            int[] iArr = M.f4014n;
            if (!(b4 instanceof U)) {
                b4.getClass();
                throw new ClassCastException();
            }
            x3 = M.x(b4, o2, b5, d0Var2, c0163o3, i4);
        } else {
            O o4 = P.f4032a;
            B b6 = C.f4000a;
            d0 d0Var3 = W.f4045b;
            if (L.j.b(b4.d()) != 1) {
                c0163o = AbstractC0164p.f4120b;
                if (c0163o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0163o = null;
            }
            I i5 = J.f4011a;
            int[] iArr2 = M.f4014n;
            if (!(b4 instanceof U)) {
                b4.getClass();
                throw new ClassCastException();
            }
            x3 = M.x(b4, o4, b6, d0Var3, c0163o, i5);
        }
        V v5 = (V) concurrentHashMap.putIfAbsent(cls, x3);
        return v5 != null ? v5 : x3;
    }
}
