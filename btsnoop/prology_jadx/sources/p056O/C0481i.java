package p056O;

/* renamed from: O.i */
/* loaded from: classes.dex */
public final class C0481i extends java.io.Writer {

    /* renamed from: m */
    public final java.lang.StringBuilder f1403m = new java.lang.StringBuilder(128);

    /* renamed from: l */
    public final java.lang.String f1402l = "FragmentManager";

    /* renamed from: a */
    public final void m996a() {
        java.lang.StringBuilder sb = this.f1403m;
        if (sb.length() > 0) {
            android.util.Log.d(this.f1402l, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m996a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m996a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == '\n') {
                m996a();
            } else {
                this.f1403m.append(c4);
            }
        }
    }
}
