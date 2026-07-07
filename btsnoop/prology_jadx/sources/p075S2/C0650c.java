package p075S2;

/* renamed from: S2.c */
/* loaded from: classes.dex */
public final class C0650c extends p047L2.C0391u {

    /* renamed from: d */
    public static final p075S2.C0650c f2131d = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r4v1, types: [S2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [S2.a, java.lang.Object] */
    @Override // p047L2.C0391u
    /* renamed from: f */
    public final java.lang.Object mo850f(byte b4, java.nio.ByteBuffer byteBuffer) {
        if (b4 != -127) {
            if (b4 != -126) {
                return super.mo850f(b4, byteBuffer);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) m849e(byteBuffer);
            ?? obj = new java.lang.Object();
            java.lang.Boolean bool = (java.lang.Boolean) arrayList.get(0);
            if (bool == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            obj.f2129a = bool;
            return obj;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) m849e(byteBuffer);
        ?? obj2 = new java.lang.Object();
        java.lang.Boolean bool2 = (java.lang.Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new java.lang.IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        obj2.f2134a = bool2;
        java.lang.Boolean bool3 = (java.lang.Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new java.lang.IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        obj2.f2135b = bool3;
        java.util.Map map = (java.util.Map) arrayList2.get(2);
        if (map == null) {
            throw new java.lang.IllegalStateException("Nonnull field \"headers\" is null.");
        }
        obj2.f2136c = map;
        return obj2;
    }

    @Override // p047L2.C0391u
    /* renamed from: k */
    public final void mo851k(p047L2.C0390t c0390t, java.lang.Object obj) {
        if (obj instanceof p075S2.C0652e) {
            c0390t.write(129);
            p075S2.C0652e c0652e = (p075S2.C0652e) obj;
            c0652e.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add(c0652e.f2134a);
            arrayList.add(c0652e.f2135b);
            arrayList.add(c0652e.f2136c);
            mo851k(c0390t, arrayList);
            return;
        }
        if (!(obj instanceof p075S2.C0648a)) {
            super.mo851k(c0390t, obj);
            return;
        }
        c0390t.write(130);
        p075S2.C0648a c0648a = (p075S2.C0648a) obj;
        c0648a.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList2.add(c0648a.f2129a);
        mo851k(c0390t, arrayList2);
    }
}
