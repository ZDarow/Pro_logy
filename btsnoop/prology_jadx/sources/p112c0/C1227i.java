package p112c0;

/* renamed from: c0.i */
/* loaded from: classes.dex */
public final class C1227i {

    /* renamed from: a */
    public final android.content.Context f4777a;

    /* renamed from: b */
    public final p009B2.C0067x f4778b;

    /* renamed from: c */
    public final android.os.Handler f4779c;

    /* renamed from: d */
    public final p112c0.C1225g f4780d;

    /* renamed from: e */
    public final p075S2.C0654g f4781e;

    /* renamed from: f */
    public final p112c0.C1226h f4782f;

    /* renamed from: g */
    public p112c0.C1223e f4783g;

    /* renamed from: h */
    public p112c0.C1228j f4784h;

    /* renamed from: i */
    public p076T.C0691e f4785i;

    /* renamed from: j */
    public boolean f4786j;

    public C1227i(android.content.Context context, p009B2.C0067x c0067x, p076T.C0691e c0691e, p112c0.C1228j c1228j) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f4777a = applicationContext;
        this.f4778b = c0067x;
        this.f4785i = c0691e;
        this.f4784h = c1228j;
        int i4 = p086W.AbstractC0805y.f2801a;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Handler handler = new android.os.Handler(myLooper == null ? android.os.Looper.getMainLooper() : myLooper, null);
        this.f4779c = handler;
        int i5 = p086W.AbstractC0805y.f2801a;
        this.f4780d = i5 >= 23 ? new p112c0.C1225g(0, this) : null;
        this.f4781e = i5 >= 21 ? new p075S2.C0654g(2, this) : null;
        p112c0.C1223e c1223e = p112c0.C1223e.f4767c;
        java.lang.String str = p086W.AbstractC0805y.f2803c;
        android.net.Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? android.provider.Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4782f = uriFor != null ? new p112c0.C1226h(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* renamed from: a */
    public final void m2909a(p112c0.C1223e c1223e) {
        p193t0.C2179q c2179q;
        if (!this.f4786j || c1223e.equals(this.f4783g)) {
            return;
        }
        this.f4783g = c1223e;
        p112c0.C1211J c1211j = (p112c0.C1211J) this.f4778b.f219m;
        c1211j.getClass();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper looper = c1211j.f4701i0;
        if (looper != myLooper) {
            java.lang.String name = looper == null ? "null" : looper.getThread().getName();
            throw new java.lang.IllegalStateException("Current looper (" + (myLooper == null ? "null" : myLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (c1223e.equals(c1211j.f4719x)) {
            return;
        }
        c1211j.f4719x = c1223e;
        p043K2.C0339o c0339o = c1211j.f4714s;
        if (c0339o != null) {
            p112c0.C1214M c1214m = (p112c0.C1214M) c0339o.f1048m;
            synchronized (c1214m.f3539l) {
                c2179q = c1214m.f3538B;
            }
            if (c2179q != null) {
                synchronized (c2179q.f8709c) {
                    c2179q.f8713g.getClass();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m2910b(android.media.AudioDeviceInfo audioDeviceInfo) {
        p112c0.C1228j c1228j = this.f4784h;
        if (p086W.AbstractC0805y.m1606a(audioDeviceInfo, c1228j == null ? null : c1228j.f4787a)) {
            return;
        }
        p112c0.C1228j c1228j2 = audioDeviceInfo != null ? new p112c0.C1228j(audioDeviceInfo) : null;
        this.f4784h = c1228j2;
        m2909a(p112c0.C1223e.m2903b(this.f4777a, this.f4785i, c1228j2));
    }
}
