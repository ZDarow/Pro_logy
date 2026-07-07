package v2;

import f2.Y;

/* loaded from: classes.dex */
public interface i {
    void a(g gVar);

    default void b(f fVar, Runnable runnable) {
        a(new g(fVar == null ? null : new Y(29, fVar), runnable));
    }

    void c();

    void d();
}
