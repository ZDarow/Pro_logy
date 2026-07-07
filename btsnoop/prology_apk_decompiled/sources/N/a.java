package N;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: l, reason: collision with root package name */
    public long f1173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f1174m;

    public a(f fVar) {
        this.f1174m = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j4 < 0) {
            return -1;
        }
        try {
            long j5 = this.f1173l;
            f fVar = this.f1174m;
            if (j5 != j4) {
                if (j5 >= 0 && j4 >= j5 + fVar.f1177l.available()) {
                    return -1;
                }
                fVar.b(j4);
                this.f1173l = j4;
            }
            if (i5 > fVar.f1177l.available()) {
                i5 = fVar.f1177l.available();
            }
            int read = fVar.read(bArr, i4, i5);
            if (read >= 0) {
                this.f1173l += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f1173l = -1L;
        return -1;
    }
}
