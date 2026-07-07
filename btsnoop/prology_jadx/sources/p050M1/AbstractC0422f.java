package p050M1;

/* renamed from: M1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0422f {

    /* renamed from: a */
    public final android.content.Context f1201a;

    /* renamed from: b */
    public final java.lang.String f1202b;

    /* renamed from: c */
    public final p008B1.C0026d f1203c;

    /* renamed from: d */
    public final p050M1.InterfaceC0418b f1204d;

    /* renamed from: e */
    public final p054N1.C0447b f1205e;

    /* renamed from: f */
    public final int f1206f;

    /* renamed from: g */
    public final p054N1.C0446a f1207g;

    /* renamed from: h */
    public final p054N1.C0449d f1208h;

    public AbstractC0422f(android.content.Context context, p008B1.C0026d c0026d, p050M1.InterfaceC0418b interfaceC0418b, p050M1.C0421e c0421e) {
        p058O1.AbstractC0515s.m1018e(context, "Null context is not permitted.");
        p058O1.AbstractC0515s.m1018e(c0026d, "Api must not be null.");
        p058O1.AbstractC0515s.m1018e(c0421e, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context applicationContext = context.getApplicationContext();
        p058O1.AbstractC0515s.m1018e(applicationContext, "The provided context did not have an application context.");
        this.f1201a = applicationContext;
        java.lang.String attributionTag = android.os.Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f1202b = attributionTag;
        this.f1203c = c0026d;
        this.f1204d = interfaceC0418b;
        this.f1205e = new p054N1.C0447b(c0026d, interfaceC0418b, attributionTag);
        p054N1.C0449d m953f = p054N1.C0449d.m953f(applicationContext);
        this.f1208h = m953f;
        this.f1206f = m953f.f1316s.getAndIncrement();
        this.f1207g = c0421e.f1200a;
        p088W1.HandlerC0820f handlerC0820f = m953f.f1321x;
        handlerC0820f.sendMessage(handlerC0820f.obtainMessage(7, this));
    }

    /* renamed from: a */
    public final android.support.v4.media.session.C1061t m897a() {
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(10, false);
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (((p165n.C1879f) c1061t.f3861m) == null) {
            c1061t.f3861m = new p165n.C1879f(0);
        }
        ((p165n.C1879f) c1061t.f3861m).addAll(emptySet);
        android.content.Context context = this.f1201a;
        c1061t.f3863o = context.getClass().getName();
        c1061t.f3862n = context.getPackageName();
        return c1061t;
    }

    /* renamed from: b */
    public final p119d2.C1290i m898b(p054N1.C0452g c0452g, int i4) {
        p058O1.AbstractC0515s.m1018e(c0452g, "Listener key cannot be null.");
        p054N1.C0449d c0449d = this.f1208h;
        c0449d.getClass();
        p119d2.C1285d c1285d = new p119d2.C1285d();
        c0449d.m957e(c1285d, i4, this);
        p054N1.C0469x c0469x = new p054N1.C0469x(new p054N1.C0443B(c0452g, c1285d), c0449d.f1317t.get(), this);
        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
        handlerC0820f.sendMessage(handlerC0820f.obtainMessage(13, c0469x));
        return c1285d.f5161a;
    }

    /* renamed from: c */
    public final p119d2.C1290i m899c(int i4, p009B2.C0034E c0034e) {
        p119d2.C1285d c1285d = new p119d2.C1285d();
        p054N1.C0449d c0449d = this.f1208h;
        c0449d.getClass();
        c0449d.m957e(c1285d, c0034e.f122c, this);
        p054N1.C0469x c0469x = new p054N1.C0469x(new p054N1.C0444C(i4, c0034e, c1285d, this.f1207g), c0449d.f1317t.get(), this);
        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
        handlerC0820f.sendMessage(handlerC0820f.obtainMessage(4, c0469x));
        return c1285d.f5161a;
    }
}
