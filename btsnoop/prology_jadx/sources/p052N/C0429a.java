package p052N;

/* renamed from: N.a */
/* loaded from: classes.dex */
public final class C0429a extends android.media.MediaDataSource {

    /* renamed from: l */
    public long f1212l;

    /* renamed from: m */
    public final /* synthetic */ p052N.C0434f f1213m;

    public C0429a(p052N.C0434f c0434f) {
        this.f1213m = c0434f;
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
            long j5 = this.f1212l;
            p052N.C0434f c0434f = this.f1213m;
            if (j5 != j4) {
                if (j5 >= 0 && j4 >= j5 + c0434f.f1216l.available()) {
                    return -1;
                }
                c0434f.m913b(j4);
                this.f1212l = j4;
            }
            if (i5 > c0434f.f1216l.available()) {
                i5 = c0434f.f1216l.available();
            }
            int read = c0434f.read(bArr, i4, i5);
            if (read >= 0) {
                this.f1212l += read;
                return read;
            }
        } catch (java.io.IOException unused) {
        }
        this.f1212l = -1L;
        return -1;
    }
}
