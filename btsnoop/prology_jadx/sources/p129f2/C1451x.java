package p129f2;

/* renamed from: f2.x */
/* loaded from: classes.dex */
public final class C1451x extends p129f2.AbstractC1453z {
    /* renamed from: f */
    public static p129f2.AbstractC1453z m3258f(int i4) {
        return i4 < 0 ? p129f2.AbstractC1453z.f5827b : i4 > 0 ? p129f2.AbstractC1453z.f5828c : p129f2.AbstractC1453z.f5826a;
    }

    @Override // p129f2.AbstractC1453z
    /* renamed from: a */
    public final p129f2.AbstractC1453z mo3259a(int i4, int i5) {
        return m3258f(i4 < i5 ? -1 : i4 > i5 ? 1 : 0);
    }

    @Override // p129f2.AbstractC1453z
    /* renamed from: b */
    public final p129f2.AbstractC1453z mo3260b(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return m3258f(comparator.compare(obj, obj2));
    }

    @Override // p129f2.AbstractC1453z
    /* renamed from: c */
    public final p129f2.AbstractC1453z mo3261c(boolean z4, boolean z5) {
        return m3258f(z4 == z5 ? 0 : z4 ? 1 : -1);
    }

    @Override // p129f2.AbstractC1453z
    /* renamed from: d */
    public final p129f2.AbstractC1453z mo3262d(boolean z4, boolean z5) {
        return m3258f(z5 == z4 ? 0 : z5 ? 1 : -1);
    }

    @Override // p129f2.AbstractC1453z
    /* renamed from: e */
    public final int mo3263e() {
        return 0;
    }
}
