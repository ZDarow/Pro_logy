package p155l;

/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C1815a extends p155l.C1820f {

    /* renamed from: p */
    public final java.util.HashMap f7376p = new java.util.HashMap();

    @Override // p155l.C1820f
    /* renamed from: a */
    public final p155l.C1817c mo3792a(java.lang.Object obj) {
        return (p155l.C1817c) this.f7376p.get(obj);
    }

    @Override // p155l.C1820f
    /* renamed from: b */
    public final java.lang.Object mo3793b(java.lang.Object obj) {
        java.lang.Object mo3793b = super.mo3793b(obj);
        this.f7376p.remove(obj);
        return mo3793b;
    }
}
