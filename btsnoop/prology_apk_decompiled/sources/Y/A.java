package Y;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class A extends AbstractC0107c {

    /* renamed from: p, reason: collision with root package name */
    public final Context f2983p;

    /* renamed from: q, reason: collision with root package name */
    public l f2984q;

    /* renamed from: r, reason: collision with root package name */
    public AssetFileDescriptor f2985r;
    public FileInputStream s;

    /* renamed from: t, reason: collision with root package name */
    public long f2986t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2987u;

    public A(Context context) {
        super(false);
        this.f2983p = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i4) {
        return Uri.parse("rawresource:///" + i4);
    }

    @Override // Y.h
    public final long b(l lVar) {
        Resources resourcesForApplication;
        int parseInt;
        int i4;
        Resources resources;
        this.f2984q = lVar;
        f();
        Uri normalizeScheme = lVar.f3029a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f2983p;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new i("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i4 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new i("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new i("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new i("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new i("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (parseInt == 0) {
                    throw new i("Resource not found.", null, 2005);
                }
            }
            i4 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i4);
            if (openRawResourceFd == null) {
                throw new i("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.f2985r = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f2985r.getFileDescriptor());
            this.s = fileInputStream;
            long j4 = lVar.f3033e;
            try {
                if (length != -1 && j4 > length) {
                    throw new i(null, null, 2008);
                }
                long startOffset = this.f2985r.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j4) - startOffset;
                if (skip != j4) {
                    throw new i(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f2986t = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f2986t = size;
                        if (size < 0) {
                            throw new i(null, null, 2008);
                        }
                    }
                } else {
                    long j5 = length - skip;
                    this.f2986t = j5;
                    if (j5 < 0) {
                        throw new i(2008);
                    }
                }
                long j6 = lVar.f3034f;
                if (j6 != -1) {
                    long j7 = this.f2986t;
                    this.f2986t = j7 == -1 ? j6 : Math.min(j7, j6);
                }
                this.f2987u = true;
                i(lVar);
                return j6 != -1 ? j6 : this.f2986t;
            } catch (z e5) {
                throw e5;
            } catch (IOException e6) {
                throw new i(null, e6, 2000);
            }
        } catch (Resources.NotFoundException e7) {
            throw new i(null, e7, 2005);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f2984q = null;
        try {
            try {
                FileInputStream fileInputStream = this.s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.s = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f2985r;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new i(null, e4, 2000);
                    }
                } finally {
                    this.f2985r = null;
                    if (this.f2987u) {
                        this.f2987u = false;
                        c();
                    }
                }
            } catch (IOException e5) {
                throw new i(null, e5, 2000);
            }
        } catch (Throwable th) {
            this.s = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f2985r;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f2985r = null;
                    if (this.f2987u) {
                        this.f2987u = false;
                        c();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new i(null, e6, 2000);
                }
            } finally {
                this.f2985r = null;
                if (this.f2987u) {
                    this.f2987u = false;
                    c();
                }
            }
        }
    }

    @Override // Y.h
    public final Uri o() {
        l lVar = this.f2984q;
        if (lVar != null) {
            return lVar.f3029a;
        }
        return null;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f2986t;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) Math.min(j4, i5);
            } catch (IOException e4) {
                throw new i(null, e4, 2000);
            }
        }
        FileInputStream fileInputStream = this.s;
        int i6 = W.y.f2709a;
        int read = fileInputStream.read(bArr, i4, i5);
        if (read == -1) {
            if (this.f2986t == -1) {
                return -1;
            }
            throw new i("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j5 = this.f2986t;
        if (j5 != -1) {
            this.f2986t = j5 - read;
        }
        a(read);
        return read;
    }
}
