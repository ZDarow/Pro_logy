package p186r2;

/* renamed from: r2.f */
/* loaded from: classes.dex */
public class C2072f implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o {

    /* renamed from: n */
    public static java.util.Map f8420n;

    /* renamed from: o */
    public static final java.util.ArrayList f8421o = new java.util.ArrayList();

    /* renamed from: l */
    public p035I.C0291m f8422l;

    /* renamed from: m */
    public p186r2.C2071e f8423m;

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        java.util.List list = (java.util.List) c0384n.f1134b;
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        if (!str.equals("setConfiguration")) {
            if (str.equals("getConfiguration")) {
                c0335k.mo742b(f8420n);
                return;
            } else {
                c0335k.mo743c();
                return;
            }
        }
        f8420n = (java.util.Map) list.get(0);
        c0335k.mo742b(null);
        java.lang.Object[] objArr = {f8420n};
        java.util.Iterator it = f8421o.iterator();
        while (it.hasNext()) {
            p186r2.C2072f c2072f = (p186r2.C2072f) it.next();
            c2072f.f8422l.m694j("onConfigurationChanged", new java.util.ArrayList(java.util.Arrays.asList(objArr)), null);
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        this.f8422l.m702s(null);
        this.f8422l = null;
        p186r2.C2071e c2071e = this.f8423m;
        c2071e.f8419l.m702s(null);
        p186r2.C2071e.f8418m.f8410a.remove(c2071e);
        if (p186r2.C2071e.f8418m.f8410a.size() == 0) {
            p186r2.C2070d c2070d = p186r2.C2071e.f8418m;
            c2070d.m4138a();
            c2070d.f8415f.unregisterAudioDeviceCallback(c2070d.f8416g);
            c2070d.f8414e = null;
            c2070d.f8415f = null;
            p186r2.C2071e.f8418m = null;
        }
        c2071e.f8419l = null;
        this.f8423m = null;
        f8421o.remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [r2.e, L2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [r2.d, java.lang.Object] */
    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "com.ryanheise.audio_session");
        this.f8422l = c0291m;
        c0291m.m702s(this);
        ?? obj = new java.lang.Object();
        if (p186r2.C2071e.f8418m == null) {
            ?? obj2 = new java.lang.Object();
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            obj2.f8410a = new java.util.ArrayList();
            obj2.f8417h = new java.util.ArrayList();
            android.content.Context context = (android.content.Context) c0247a.f719l;
            obj2.f8414e = context;
            obj2.f8415f = (android.media.AudioManager) context.getSystemService("audio");
            p112c0.C1225g c1225g = new p112c0.C1225g(1, obj2);
            obj2.f8416g = c1225g;
            obj2.f8415f.registerAudioDeviceCallback(c1225g, handler);
            p186r2.C2071e.f8418m = obj2;
        }
        obj.f8419l = new p035I.C0291m(interfaceC0376f, "com.ryanheise.android_audio_manager");
        p186r2.C2071e.f8418m.f8410a.add(obj);
        obj.f8419l.m702s(obj);
        this.f8423m = obj;
        f8421o.add(this);
    }
}
