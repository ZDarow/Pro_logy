package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.c */
/* loaded from: classes.dex */
public final class C1580c implements io.flutter.plugin.platform.InterfaceC1584g {

    /* renamed from: l */
    public int f6564l;

    /* renamed from: m */
    public int f6565m;

    /* renamed from: n */
    public java.lang.Object f6566n;

    /* renamed from: o */
    public java.lang.Object f6567o;

    /* renamed from: p */
    public java.lang.Object f6568p;

    /* renamed from: q */
    public final java.lang.Object f6569q;

    public C1580c(io.flutter.view.TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f6564l = 0;
        this.f6565m = 0;
        this.f6568p = new android.os.Handler();
        this.f6569q = new io.flutter.plugin.platform.C1579b(this);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.f6566n = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    /* renamed from: a */
    public long mo3501a() {
        return ((io.flutter.view.TextureRegistry$ImageTextureEntry) this.f6566n).mo3442id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    /* renamed from: b */
    public void mo3502b(int i4, int i5) {
        android.media.ImageReader newInstance;
        android.media.ImageReader imageReader = (android.media.ImageReader) this.f6567o;
        if (imageReader != null && this.f6564l == i4 && this.f6565m == i5) {
            return;
        }
        if (imageReader != null) {
            ((io.flutter.view.TextureRegistry$ImageTextureEntry) this.f6566n).pushImage(null);
            ((android.media.ImageReader) this.f6567o).close();
            this.f6567o = null;
        }
        this.f6564l = i4;
        this.f6565m = i5;
        int i6 = android.os.Build.VERSION.SDK_INT;
        android.os.Handler handler = (android.os.Handler) this.f6568p;
        io.flutter.plugin.platform.C1579b c1579b = (io.flutter.plugin.platform.C1579b) this.f6569q;
        if (i6 >= 33) {
            p008B1.AbstractC0024b.m87p();
            android.media.ImageReader.Builder m79h = p008B1.AbstractC0024b.m79h(this.f6564l, this.f6565m);
            m79h.setMaxImages(4);
            m79h.setImageFormat(34);
            m79h.setUsage(256L);
            newInstance = m79h.build();
            newInstance.setOnImageAvailableListener(c1579b, handler);
        } else {
            if (i6 < 29) {
                throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = android.media.ImageReader.newInstance(i4, i5, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c1579b, handler);
        }
        this.f6567o = newInstance;
    }

    /* renamed from: c */
    public void m3503c(int i4) {
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f6569q;
        if (i4 < 0 || i4 >= recyclerView.f4434i0.m3718a()) {
            throw new java.lang.IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + recyclerView.f4434i0.m3718a() + recyclerView.m2716h());
        }
        p152k1.C1753A c1753a = recyclerView.f4434i0;
        boolean z4 = c1753a.f7201c;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f6566n;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new java.lang.ClassCastException();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) recyclerView.f4443o.f3863o;
        if (arrayList2.size() > 0) {
            androidx.recyclerview.widget.RecyclerView.m2709j((android.view.View) arrayList2.get(0));
            throw null;
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f6567o;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new java.lang.ClassCastException();
        }
        int m2220d0 = recyclerView.f4441n.m2220d0(i4, 0);
        if (m2220d0 >= 0) {
            throw null;
        }
        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + m2220d0 + ").state:" + c1753a.m3718a() + recyclerView.m2716h());
    }

    /* renamed from: d */
    public void m3504d() {
        p152k1.AbstractC1780s abstractC1780s = ((androidx.recyclerview.widget.RecyclerView) this.f6569q).f4452t;
        this.f6565m = this.f6564l;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f6567o;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f6565m) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new java.lang.ClassCastException();
        }
        int[] iArr = androidx.recyclerview.widget.RecyclerView.f4399s0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public int getHeight() {
        return this.f6565m;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public android.view.Surface getSurface() {
        return ((android.media.ImageReader) this.f6567o).getSurface();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public int getWidth() {
        return this.f6564l;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public void release() {
        if (((android.media.ImageReader) this.f6567o) != null) {
            ((io.flutter.view.TextureRegistry$ImageTextureEntry) this.f6566n).pushImage(null);
            ((android.media.ImageReader) this.f6567o).close();
            this.f6567o = null;
        }
        this.f6566n = null;
    }

    public C1580c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f6569q = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f6566n = arrayList;
        this.f6567o = new java.util.ArrayList();
        java.util.Collections.unmodifiableList(arrayList);
        this.f6564l = 2;
        this.f6565m = 2;
    }
}
