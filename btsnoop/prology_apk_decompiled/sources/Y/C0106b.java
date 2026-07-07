package Y;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106b extends AbstractC0107c {

    /* renamed from: p, reason: collision with root package name */
    public final AssetManager f2998p;

    /* renamed from: q, reason: collision with root package name */
    public Uri f2999q;

    /* renamed from: r, reason: collision with root package name */
    public InputStream f3000r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3001t;

    public C0106b(Context context) {
        super(false);
        this.f2998p = context.getAssets();
    }

    @Override // Y.h
    public final long b(l lVar) {
        try {
            Uri uri = lVar.f3029a;
            long j4 = lVar.f3033e;
            this.f2999q = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f();
            InputStream open = this.f2998p.open(path, 1);
            this.f3000r = open;
            if (open.skip(j4) < j4) {
                throw new i((Exception) null, 2008);
            }
            long j5 = lVar.f3034f;
            if (j5 != -1) {
                this.s = j5;
            } else {
                long available = this.f3000r.available();
                this.s = available;
                if (available == 2147483647L) {
                    this.s = -1L;
                }
            }
            this.f3001t = true;
            i(lVar);
            return this.s;
        } catch (C0105a e4) {
            throw e4;
        } catch (IOException e5) {
            throw new i(e5, e5 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f2999q = null;
        try {
            try {
                InputStream inputStream = this.f3000r;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new i(e4, 2000);
            }
        } finally {
            this.f3000r = null;
            if (this.f3001t) {
                this.f3001t = false;
                c();
            }
        }
    }

    @Override // Y.h
    public final Uri o() {
        return this.f2999q;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.s;
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
        InputStream inputStream = this.f3000r;
        int i6 = W.y.f2709a;
        int read = inputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        long j5 = this.s;
        if (j5 != -1) {
            this.s = j5 - read;
        }
        a(read);
        return read;
    }
}
