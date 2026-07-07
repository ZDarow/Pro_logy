package k3;

/* loaded from: classes.dex */
public final class k extends l implements o3.c, j3.l {
    @Override // k3.c
    public final o3.a a() {
        q.f7105a.getClass();
        return this;
    }

    @Override // j3.l
    public final Object b(Object obj) {
        g();
        throw null;
    }

    public final void g() {
        if (this.f7100r) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        o3.a f4 = f();
        if (f4 == this) {
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((o3.c) f4)).g();
    }
}
