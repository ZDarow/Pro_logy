package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.B */
/* loaded from: classes.dex */
public final class C1069B {
    /* renamed from: a */
    public static void m2352a(long j4, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC1095b abstractC1095b = (androidx.datastore.preferences.protobuf.AbstractC1095b) ((androidx.datastore.preferences.protobuf.InterfaceC1133w) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj));
        if (abstractC1095b.f4210l) {
            abstractC1095b.f4210l = false;
        }
    }

    /* renamed from: b */
    public static androidx.datastore.preferences.protobuf.InterfaceC1133w m2353b(long j4, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w = (androidx.datastore.preferences.protobuf.InterfaceC1133w) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj);
        if (((androidx.datastore.preferences.protobuf.AbstractC1095b) interfaceC1133w).f4210l) {
            return interfaceC1133w;
        }
        androidx.datastore.preferences.protobuf.C1086T c1086t = (androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w;
        int i4 = c1086t.f4187n;
        androidx.datastore.preferences.protobuf.C1086T m2424c = c1086t.m2424c(i4 == 0 ? 10 : i4 * 2);
        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, m2424c);
        return m2424c;
    }
}
