package p078T2;

/* renamed from: T2.m */
/* loaded from: classes.dex */
public final class C0736m implements p047L2.InterfaceC0379i {

    /* renamed from: l */
    public final p078T2.C0734k f2541l;

    @Override // p047L2.InterfaceC0379i
    /* renamed from: E */
    public void mo47E() {
        p078T2.C0734k c0734k = this.f2541l;
        c0734k.f2535a = null;
        c0734k.m1320a();
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: H */
    public void mo48H(java.lang.Object obj, p047L2.C0378h c0378h) {
        p078T2.C0734k c0734k = this.f2541l;
        c0734k.f2535a = c0378h;
        c0734k.m1320a();
    }

    /* renamed from: a */
    public void m1324a(long j4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", java.util.Collections.singletonList(java.util.Arrays.asList(0, java.lang.Long.valueOf(j4))));
        this.f2541l.m1321b(hashMap);
    }

    /* renamed from: b */
    public void m1325b(int i4, int i5, long j4, int i6) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "initialized");
        p009B2.AbstractC0051h.m157p(i4, hashMap, "width", i5, "height");
        hashMap.put("duration", java.lang.Long.valueOf(j4));
        if (i6 != 0) {
            hashMap.put("rotationCorrection", java.lang.Integer.valueOf(i6));
        }
        this.f2541l.m1321b(hashMap);
    }
}
