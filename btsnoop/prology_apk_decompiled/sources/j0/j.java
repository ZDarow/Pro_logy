package j0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface j {
    void A(int i4);

    MediaFormat M();

    void b(int i4, Z.b bVar, long j4, int i5);

    void c(Bundle bundle);

    void e(int i4, int i5, long j4, int i6);

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void j(long j4, int i4);

    ByteBuffer k(int i4);

    void l(Surface surface);

    void o(w0.l lVar, Handler handler);

    default boolean q(s sVar) {
        return false;
    }

    void r(int i4, boolean z4);

    void release();

    ByteBuffer u(int i4);

    int z();
}
