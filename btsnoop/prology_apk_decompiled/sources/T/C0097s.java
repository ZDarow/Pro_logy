package T;

import android.net.Uri;
import java.util.List;

/* renamed from: T.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097s {

    /* renamed from: a, reason: collision with root package name */
    public String f2340a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f2341b;

    /* renamed from: c, reason: collision with root package name */
    public String f2342c;

    /* renamed from: d, reason: collision with root package name */
    public C0098t f2343d;

    /* renamed from: e, reason: collision with root package name */
    public F1.g f2344e;

    /* renamed from: f, reason: collision with root package name */
    public List f2345f;

    /* renamed from: g, reason: collision with root package name */
    public f2.I f2346g;

    /* renamed from: h, reason: collision with root package name */
    public String f2347h;

    /* renamed from: i, reason: collision with root package name */
    public long f2348i;

    /* renamed from: j, reason: collision with root package name */
    public E f2349j;

    /* renamed from: k, reason: collision with root package name */
    public C0101w f2350k;

    /* renamed from: l, reason: collision with root package name */
    public C0104z f2351l;

    /* JADX WARN: Type inference failed for: r13v0, types: [T.u, T.v] */
    public final B a() {
        C0103y c0103y;
        this.f2344e.getClass();
        Uri uri = this.f2341b;
        if (uri != null) {
            String str = this.f2342c;
            this.f2344e.getClass();
            c0103y = new C0103y(uri, str, null, this.f2345f, this.f2346g, this.f2347h, this.f2348i);
        } else {
            c0103y = null;
        }
        String str2 = this.f2340a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C0098t c0098t = this.f2343d;
        c0098t.getClass();
        ?? c0099u = new C0099u(c0098t);
        C0101w c0101w = this.f2350k;
        c0101w.getClass();
        C0102x c0102x = new C0102x(c0101w);
        E e4 = this.f2349j;
        if (e4 == null) {
            e4 = E.f2095y;
        }
        return new B(str3, c0099u, c0103y, c0102x, e4, this.f2351l);
    }
}
