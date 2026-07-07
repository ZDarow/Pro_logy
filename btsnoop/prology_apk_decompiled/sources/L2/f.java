package L2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface f {
    void a(String str, ByteBuffer byteBuffer, e eVar);

    F1.g b(l lVar);

    void c(String str, ByteBuffer byteBuffer);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [L2.l, java.lang.Object] */
    default F1.g d() {
        return b(new Object());
    }

    void f(String str, d dVar, F1.g gVar);

    void g(String str, d dVar);
}
