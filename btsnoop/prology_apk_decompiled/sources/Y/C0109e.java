package Y;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: Y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109e extends AbstractC0107c {

    /* renamed from: p, reason: collision with root package name */
    public final ContentResolver f3006p;

    /* renamed from: q, reason: collision with root package name */
    public Uri f3007q;

    /* renamed from: r, reason: collision with root package name */
    public AssetFileDescriptor f3008r;
    public FileInputStream s;

    /* renamed from: t, reason: collision with root package name */
    public long f3009t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3010u;

    public C0109e(Context context) {
        super(false);
        this.f3006p = context.getContentResolver();
    }

    @Override // Y.h
    public final long b(l lVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = lVar.f3029a.normalizeScheme();
            this.f3007q = normalizeScheme;
            f();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f3006p;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f3008r = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new i(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.s = fileInputStream;
            long j4 = lVar.f3033e;
            if (length != -1 && j4 > length) {
                throw new i((Exception) null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j4) - startOffset;
            if (skip != j4) {
                throw new i((Exception) null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f3009t = -1L;
                } else {
                    long position = size - channel.position();
                    this.f3009t = position;
                    if (position < 0) {
                        throw new i((Exception) null, 2008);
                    }
                }
            } else {
                long j5 = length - skip;
                this.f3009t = j5;
                if (j5 < 0) {
                    throw new i((Exception) null, 2008);
                }
            }
            long j6 = lVar.f3034f;
            if (j6 != -1) {
                long j7 = this.f3009t;
                this.f3009t = j7 == -1 ? j6 : Math.min(j7, j6);
            }
            this.f3010u = true;
            i(lVar);
            return j6 != -1 ? j6 : this.f3009t;
        } catch (C0108d e4) {
            throw e4;
        } catch (IOException e5) {
            throw new i(e5, e5 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3007q = null;
        try {
            try {
                FileInputStream fileInputStream = this.s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.s = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3008r;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new i(e4, 2000);
                    }
                } finally {
                    this.f3008r = null;
                    if (this.f3010u) {
                        this.f3010u = false;
                        c();
                    }
                }
            } catch (IOException e5) {
                throw new i(e5, 2000);
            }
        } catch (Throwable th) {
            this.s = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3008r;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3008r = null;
                    if (this.f3010u) {
                        this.f3010u = false;
                        c();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new i(e6, 2000);
                }
            } finally {
                this.f3008r = null;
                if (this.f3010u) {
                    this.f3010u = false;
                    c();
                }
            }
        }
    }

    @Override // Y.h
    public final Uri o() {
        return this.f3007q;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3009t;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) Math.min(j4, i5);
            } catch (IOException e4) {
                throw new i(e4, 2000);
            }
        }
        FileInputStream fileInputStream = this.s;
        int i6 = W.y.f2709a;
        int read = fileInputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        long j5 = this.f3009t;
        if (j5 != -1) {
            this.f3009t = j5 - read;
        }
        a(read);
        return read;
    }
}
