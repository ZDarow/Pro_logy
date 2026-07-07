package p052N;

/* renamed from: N.f */
/* loaded from: classes.dex */
public final class C0434f extends p052N.C0430b {
    public C0434f(byte[] bArr) {
        super(bArr);
        this.f1216l.mark(Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public final void m913b(long j4) {
        int i4 = this.f1218n;
        if (i4 > j4) {
            this.f1218n = 0;
            this.f1216l.reset();
        } else {
            j4 -= i4;
        }
        m905a((int) j4);
    }

    public C0434f(java.io.InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1216l.mark(Integer.MAX_VALUE);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
