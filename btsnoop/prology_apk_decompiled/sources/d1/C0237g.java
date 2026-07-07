package d1;

/* renamed from: d1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237g implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public final int f4956l;

    /* renamed from: m, reason: collision with root package name */
    public final C0233c f4957m;

    public C0237g(int i4, C0233c c0233c) {
        this.f4956l = i4;
        this.f4957m = c0233c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4956l, ((C0237g) obj).f4956l);
    }
}
