package p094Y;

/* renamed from: Y.e */
/* loaded from: classes.dex */
public final class C0867e extends p094Y.AbstractC0865c {

    /* renamed from: p */
    public final android.content.ContentResolver f3110p;

    /* renamed from: q */
    public android.net.Uri f3111q;

    /* renamed from: r */
    public android.content.res.AssetFileDescriptor f3112r;

    /* renamed from: s */
    public java.io.FileInputStream f3113s;

    /* renamed from: t */
    public long f3114t;

    /* renamed from: u */
    public boolean f3115u;

    public C0867e(android.content.Context context) {
        super(false);
        this.f3110p = context.getContentResolver();
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        android.content.res.AssetFileDescriptor openAssetFileDescriptor;
        try {
            android.net.Uri normalizeScheme = c0874l.f3135a.normalizeScheme();
            this.f3111q = normalizeScheme;
            m1692f();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            android.content.ContentResolver contentResolver = this.f3110p;
            if (equals) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f3112r = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new p094Y.C0871i(new java.io.IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f3113s = fileInputStream;
            long j4 = c0874l.f3139e;
            if (length != -1 && j4 > length) {
                throw new p094Y.C0871i((java.lang.Exception) null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j4) - startOffset;
            if (skip != j4) {
                throw new p094Y.C0871i((java.lang.Exception) null, 2008);
            }
            if (length == -1) {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f3114t = -1L;
                } else {
                    long position = size - channel.position();
                    this.f3114t = position;
                    if (position < 0) {
                        throw new p094Y.C0871i((java.lang.Exception) null, 2008);
                    }
                }
            } else {
                long j5 = length - skip;
                this.f3114t = j5;
                if (j5 < 0) {
                    throw new p094Y.C0871i((java.lang.Exception) null, 2008);
                }
            }
            long j6 = c0874l.f3140f;
            if (j6 != -1) {
                long j7 = this.f3114t;
                this.f3114t = j7 == -1 ? j6 : java.lang.Math.min(j7, j6);
            }
            this.f3115u = true;
            m1693i(c0874l);
            return j6 != -1 ? j6 : this.f3114t;
        } catch (p094Y.C0866d e4) {
            throw e4;
        } catch (java.io.IOException e5) {
            throw new p094Y.C0871i(e5, e5 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f3111q = null;
        try {
            try {
                java.io.FileInputStream fileInputStream = this.f3113s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3113s = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.f3112r;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e4) {
                        throw new p094Y.C0871i(e4, 2000);
                    }
                } finally {
                    this.f3112r = null;
                    if (this.f3115u) {
                        this.f3115u = false;
                        m1691c();
                    }
                }
            } catch (java.io.IOException e5) {
                throw new p094Y.C0871i(e5, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.f3113s = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f3112r;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3112r = null;
                    if (this.f3115u) {
                        this.f3115u = false;
                        m1691c();
                    }
                    throw th;
                } catch (java.io.IOException e6) {
                    throw new p094Y.C0871i(e6, 2000);
                }
            } finally {
                this.f3112r = null;
                if (this.f3115u) {
                    this.f3115u = false;
                    m1691c();
                }
            }
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f3111q;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3114t;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) java.lang.Math.min(j4, i5);
            } catch (java.io.IOException e4) {
                throw new p094Y.C0871i(e4, 2000);
            }
        }
        java.io.FileInputStream fileInputStream = this.f3113s;
        int i6 = p086W.AbstractC0805y.f2801a;
        int read = fileInputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        long j5 = this.f3114t;
        if (j5 != -1) {
            this.f3114t = j5 - read;
        }
        m1690a(read);
        return read;
    }
}
