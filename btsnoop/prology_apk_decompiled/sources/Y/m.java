package Y;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: l, reason: collision with root package name */
    public final Context f3037l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3038m;

    /* renamed from: n, reason: collision with root package name */
    public final h f3039n;

    /* renamed from: o, reason: collision with root package name */
    public s f3040o;

    /* renamed from: p, reason: collision with root package name */
    public C0106b f3041p;

    /* renamed from: q, reason: collision with root package name */
    public C0109e f3042q;

    /* renamed from: r, reason: collision with root package name */
    public h f3043r;
    public E s;

    /* renamed from: t, reason: collision with root package name */
    public f f3044t;

    /* renamed from: u, reason: collision with root package name */
    public A f3045u;

    /* renamed from: v, reason: collision with root package name */
    public h f3046v;

    public m(Context context, h hVar) {
        this.f3037l = context.getApplicationContext();
        hVar.getClass();
        this.f3039n = hVar;
        this.f3038m = new ArrayList();
    }

    public static void c(h hVar, C c4) {
        if (hVar != null) {
            hVar.j(c4);
        }
    }

    public final void a(h hVar) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3038m;
            if (i4 >= arrayList.size()) {
                return;
            }
            hVar.j((C) arrayList.get(i4));
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [Y.f, Y.h, Y.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Y.h, Y.c, Y.s] */
    @Override // Y.h
    public final long b(l lVar) {
        W.a.j(this.f3046v == null);
        String scheme = lVar.f3029a.getScheme();
        int i4 = W.y.f2709a;
        Uri uri = lVar.f3029a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f3037l;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f3040o == null) {
                    ?? abstractC0107c = new AbstractC0107c(false);
                    this.f3040o = abstractC0107c;
                    a(abstractC0107c);
                }
                this.f3046v = this.f3040o;
            } else {
                if (this.f3041p == null) {
                    C0106b c0106b = new C0106b(context);
                    this.f3041p = c0106b;
                    a(c0106b);
                }
                this.f3046v = this.f3041p;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f3041p == null) {
                C0106b c0106b2 = new C0106b(context);
                this.f3041p = c0106b2;
                a(c0106b2);
            }
            this.f3046v = this.f3041p;
        } else if ("content".equals(scheme)) {
            if (this.f3042q == null) {
                C0109e c0109e = new C0109e(context);
                this.f3042q = c0109e;
                a(c0109e);
            }
            this.f3046v = this.f3042q;
        } else {
            boolean equals = "rtmp".equals(scheme);
            h hVar = this.f3039n;
            if (equals) {
                if (this.f3043r == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f3043r = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        W.a.A("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating RTMP extension", e4);
                    }
                    if (this.f3043r == null) {
                        this.f3043r = hVar;
                    }
                }
                this.f3046v = this.f3043r;
            } else if ("udp".equals(scheme)) {
                if (this.s == null) {
                    E e5 = new E(8000);
                    this.s = e5;
                    a(e5);
                }
                this.f3046v = this.s;
            } else if ("data".equals(scheme)) {
                if (this.f3044t == null) {
                    ?? abstractC0107c2 = new AbstractC0107c(false);
                    this.f3044t = abstractC0107c2;
                    a(abstractC0107c2);
                }
                this.f3046v = this.f3044t;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f3045u == null) {
                    A a4 = new A(context);
                    this.f3045u = a4;
                    a(a4);
                }
                this.f3046v = this.f3045u;
            } else {
                this.f3046v = hVar;
            }
        }
        return this.f3046v.b(lVar);
    }

    @Override // Y.h
    public final void close() {
        h hVar = this.f3046v;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f3046v = null;
            }
        }
    }

    @Override // Y.h
    public final void j(C c4) {
        c4.getClass();
        this.f3039n.j(c4);
        this.f3038m.add(c4);
        c(this.f3040o, c4);
        c(this.f3041p, c4);
        c(this.f3042q, c4);
        c(this.f3043r, c4);
        c(this.s, c4);
        c(this.f3044t, c4);
        c(this.f3045u, c4);
    }

    @Override // Y.h
    public final Uri o() {
        h hVar = this.f3046v;
        if (hVar == null) {
            return null;
        }
        return hVar.o();
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        h hVar = this.f3046v;
        hVar.getClass();
        return hVar.read(bArr, i4, i5);
    }

    @Override // Y.h
    public final Map y() {
        h hVar = this.f3046v;
        return hVar == null ? Collections.emptyMap() : hVar.y();
    }
}
