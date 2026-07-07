package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;
import k1.C0378A;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: l, reason: collision with root package name */
    public int f6329l;

    /* renamed from: m, reason: collision with root package name */
    public int f6330m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6331n;

    /* renamed from: o, reason: collision with root package name */
    public Object f6332o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6333p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f6334q;

    public c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f6329l = 0;
        this.f6330m = 0;
        this.f6333p = new Handler();
        this.f6334q = new C0345b(this);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6331n = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @Override // io.flutter.plugin.platform.g
    public long a() {
        return ((TextureRegistry$ImageTextureEntry) this.f6331n).id();
    }

    @Override // io.flutter.plugin.platform.g
    public void b(int i4, int i5) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.f6332o;
        if (imageReader != null && this.f6329l == i4 && this.f6330m == i5) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f6331n).pushImage(null);
            ((ImageReader) this.f6332o).close();
            this.f6332o = null;
        }
        this.f6329l = i4;
        this.f6330m = i5;
        int i6 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f6333p;
        C0345b c0345b = (C0345b) this.f6334q;
        if (i6 >= 33) {
            B1.b.p();
            ImageReader.Builder h4 = B1.b.h(this.f6329l, this.f6330m);
            h4.setMaxImages(4);
            h4.setImageFormat(34);
            h4.setUsage(256L);
            newInstance = h4.build();
            newInstance.setOnImageAvailableListener(c0345b, handler);
        } else {
            if (i6 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i4, i5, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c0345b, handler);
        }
        this.f6332o = newInstance;
    }

    public void c(int i4) {
        RecyclerView recyclerView = (RecyclerView) this.f6334q;
        if (i4 < 0 || i4 >= recyclerView.f4281i0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + recyclerView.f4281i0.a() + recyclerView.h());
        }
        C0378A c0378a = recyclerView.f4281i0;
        boolean z4 = c0378a.f6938c;
        ArrayList arrayList = (ArrayList) this.f6331n;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f4290o.f3736o;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f6332o;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int d02 = recyclerView.f4288n.d0(i4, 0);
        if (d02 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + d02 + ").state:" + c0378a.a() + recyclerView.h());
    }

    public void d() {
        k1.s sVar = ((RecyclerView) this.f6334q).f4298t;
        this.f6330m = this.f6329l;
        ArrayList arrayList = (ArrayList) this.f6332o;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f6330m) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f4247s0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.g
    public int getHeight() {
        return this.f6330m;
    }

    @Override // io.flutter.plugin.platform.g
    public Surface getSurface() {
        return ((ImageReader) this.f6332o).getSurface();
    }

    @Override // io.flutter.plugin.platform.g
    public int getWidth() {
        return this.f6329l;
    }

    @Override // io.flutter.plugin.platform.g
    public void release() {
        if (((ImageReader) this.f6332o) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f6331n).pushImage(null);
            ((ImageReader) this.f6332o).close();
            this.f6332o = null;
        }
        this.f6331n = null;
    }

    public c(RecyclerView recyclerView) {
        this.f6334q = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6331n = arrayList;
        this.f6332o = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f6329l = 2;
        this.f6330m = 2;
    }
}
