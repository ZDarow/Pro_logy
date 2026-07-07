package p094Y;

/* renamed from: Y.A */
/* loaded from: classes.dex */
public final class C0858A extends p094Y.AbstractC0865c {

    /* renamed from: p */
    public final android.content.Context f3083p;

    /* renamed from: q */
    public p094Y.C0874l f3084q;

    /* renamed from: r */
    public android.content.res.AssetFileDescriptor f3085r;

    /* renamed from: s */
    public java.io.FileInputStream f3086s;

    /* renamed from: t */
    public long f3087t;

    /* renamed from: u */
    public boolean f3088u;

    public C0858A(android.content.Context context) {
        super(false);
        this.f3083p = context.getApplicationContext();
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i4) {
        return android.net.Uri.parse("rawresource:///" + i4);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        android.content.res.Resources resourcesForApplication;
        int parseInt;
        int i4;
        android.content.res.Resources resources;
        this.f3084q = c0874l;
        m1692f();
        android.net.Uri normalizeScheme = c0874l.f3135a.normalizeScheme();
        boolean equals = android.text.TextUtils.equals("rawresource", normalizeScheme.getScheme());
        android.content.Context context = this.f3083p;
        if (equals) {
            resources = context.getResources();
            java.util.List<java.lang.String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new p094Y.C0871i("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i4 = java.lang.Integer.parseInt(pathSegments.get(0));
            } catch (java.lang.NumberFormatException unused) {
                throw new p094Y.C0871i("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!android.text.TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new p094Y.C0871i("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            java.lang.String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            java.lang.String packageName = android.text.TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (android.content.pm.PackageManager.NameNotFoundException e4) {
                    throw new p094Y.C0871i("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = java.lang.Integer.parseInt(path);
                } catch (java.lang.NumberFormatException unused2) {
                    throw new p094Y.C0871i("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (parseInt == 0) {
                    throw new p094Y.C0871i("Resource not found.", null, 2005);
                }
            }
            i4 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            android.content.res.AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i4);
            if (openRawResourceFd == null) {
                throw new p094Y.C0871i("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.f3085r = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.f3085r.getFileDescriptor());
            this.f3086s = fileInputStream;
            long j4 = c0874l.f3139e;
            try {
                if (length != -1 && j4 > length) {
                    throw new p094Y.C0871i(null, null, 2008);
                }
                long startOffset = this.f3085r.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j4) - startOffset;
                if (skip != j4) {
                    throw new p094Y.C0871i(null, null, 2008);
                }
                if (length == -1) {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f3087t = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f3087t = size;
                        if (size < 0) {
                            throw new p094Y.C0871i(null, null, 2008);
                        }
                    }
                } else {
                    long j5 = length - skip;
                    this.f3087t = j5;
                    if (j5 < 0) {
                        throw new p094Y.C0871i(2008);
                    }
                }
                long j6 = c0874l.f3140f;
                if (j6 != -1) {
                    long j7 = this.f3087t;
                    this.f3087t = j7 == -1 ? j6 : java.lang.Math.min(j7, j6);
                }
                this.f3088u = true;
                m1693i(c0874l);
                return j6 != -1 ? j6 : this.f3087t;
            } catch (p094Y.C0888z e5) {
                throw e5;
            } catch (java.io.IOException e6) {
                throw new p094Y.C0871i(null, e6, 2000);
            }
        } catch (android.content.res.Resources.NotFoundException e7) {
            throw new p094Y.C0871i(null, e7, 2005);
        }
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f3084q = null;
        try {
            try {
                java.io.FileInputStream fileInputStream = this.f3086s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3086s = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.f3085r;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e4) {
                        throw new p094Y.C0871i(null, e4, 2000);
                    }
                } finally {
                    this.f3085r = null;
                    if (this.f3088u) {
                        this.f3088u = false;
                        m1691c();
                    }
                }
            } catch (java.io.IOException e5) {
                throw new p094Y.C0871i(null, e5, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.f3086s = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.f3085r;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3085r = null;
                    if (this.f3088u) {
                        this.f3088u = false;
                        m1691c();
                    }
                    throw th;
                } catch (java.io.IOException e6) {
                    throw new p094Y.C0871i(null, e6, 2000);
                }
            } finally {
                this.f3085r = null;
                if (this.f3088u) {
                    this.f3088u = false;
                    m1691c();
                }
            }
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        p094Y.C0874l c0874l = this.f3084q;
        if (c0874l != null) {
            return c0874l.f3135a;
        }
        return null;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3087t;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) java.lang.Math.min(j4, i5);
            } catch (java.io.IOException e4) {
                throw new p094Y.C0871i(null, e4, 2000);
            }
        }
        java.io.FileInputStream fileInputStream = this.f3086s;
        int i6 = p086W.AbstractC0805y.f2801a;
        int read = fileInputStream.read(bArr, i4, i5);
        if (read == -1) {
            if (this.f3087t == -1) {
                return -1;
            }
            throw new p094Y.C0871i("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j5 = this.f3087t;
        if (j5 != -1) {
            this.f3087t = j5 - read;
        }
        m1690a(read);
        return read;
    }
}
