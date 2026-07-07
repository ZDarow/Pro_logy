package p078T2;

/* renamed from: T2.f */
/* loaded from: classes.dex */
public final class C0729f extends p047L2.C0391u {

    /* renamed from: d */
    public static final p078T2.C0729f f2527d = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [T2.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T2.e, java.lang.Object] */
    @Override // p047L2.C0391u
    /* renamed from: f */
    public final java.lang.Object mo850f(byte b4, java.nio.ByteBuffer byteBuffer) {
        switch (b4) {
            case -127:
                java.lang.Object m849e = m849e(byteBuffer);
                if (m849e == null) {
                    return null;
                }
                return p078T2.EnumC0731h.values()[((java.lang.Long) m849e).intValue()];
            case -126:
                java.util.ArrayList arrayList = (java.util.ArrayList) m849e(byteBuffer);
                ?? obj = new java.lang.Object();
                java.lang.Long l4 = (java.lang.Long) arrayList.get(0);
                if (l4 == null) {
                    throw new java.lang.IllegalStateException("Nonnull field \"playerId\" is null.");
                }
                obj.f2528a = l4;
                return obj;
            case -125:
                java.util.ArrayList arrayList2 = (java.util.ArrayList) m849e(byteBuffer);
                ?? obj2 = new java.lang.Object();
                obj2.f2521a = (java.lang.String) arrayList2.get(0);
                obj2.f2522b = (java.lang.String) arrayList2.get(1);
                obj2.f2523c = (java.lang.String) arrayList2.get(2);
                obj2.f2524d = (java.lang.String) arrayList2.get(3);
                java.util.Map map = (java.util.Map) arrayList2.get(4);
                if (map == null) {
                    throw new java.lang.IllegalStateException("Nonnull field \"httpHeaders\" is null.");
                }
                obj2.f2525e = map;
                obj2.f2526f = (p078T2.EnumC0731h) arrayList2.get(5);
                return obj2;
            default:
                return super.mo850f(b4, byteBuffer);
        }
    }

    @Override // p047L2.C0391u
    /* renamed from: k */
    public final void mo851k(p047L2.C0390t c0390t, java.lang.Object obj) {
        if (obj instanceof p078T2.EnumC0731h) {
            c0390t.write(129);
            mo851k(c0390t, obj == null ? null : java.lang.Integer.valueOf(((p078T2.EnumC0731h) obj).f2531l));
            return;
        }
        if (obj instanceof p078T2.C0730g) {
            c0390t.write(130);
            p078T2.C0730g c0730g = (p078T2.C0730g) obj;
            c0730g.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(c0730g.f2528a);
            mo851k(c0390t, arrayList);
            return;
        }
        if (!(obj instanceof p078T2.C0728e)) {
            super.mo851k(c0390t, obj);
            return;
        }
        c0390t.write(131);
        p078T2.C0728e c0728e = (p078T2.C0728e) obj;
        c0728e.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(6);
        arrayList2.add(c0728e.f2521a);
        arrayList2.add(c0728e.f2522b);
        arrayList2.add(c0728e.f2523c);
        arrayList2.add(c0728e.f2524d);
        arrayList2.add(c0728e.f2525e);
        arrayList2.add(c0728e.f2526f);
        mo851k(c0390t, arrayList2);
    }
}
