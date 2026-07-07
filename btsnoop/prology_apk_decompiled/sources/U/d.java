package U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f2470a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    void b();

    ByteBuffer c();

    void d();

    boolean e();

    void f(ByteBuffer byteBuffer);

    void flush();

    b g(b bVar);
}
