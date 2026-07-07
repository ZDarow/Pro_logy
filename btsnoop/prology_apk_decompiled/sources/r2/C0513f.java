package r2;

import I.C0044m;
import K2.k;
import L2.n;
import L2.o;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import c0.C0208g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: r2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0513f implements H2.b, o {

    /* renamed from: n, reason: collision with root package name */
    public static Map f8105n;

    /* renamed from: o, reason: collision with root package name */
    public static final ArrayList f8106o = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public C0044m f8107l;

    /* renamed from: m, reason: collision with root package name */
    public C0512e f8108m;

    @Override // L2.o
    public final void I(n nVar, k kVar) {
        List list = (List) nVar.f1095b;
        String str = nVar.f1094a;
        str.getClass();
        if (!str.equals("setConfiguration")) {
            if (str.equals("getConfiguration")) {
                kVar.b(f8105n);
                return;
            } else {
                kVar.c();
                return;
            }
        }
        f8105n = (Map) list.get(0);
        kVar.b(null);
        Object[] objArr = {f8105n};
        Iterator it = f8106o.iterator();
        while (it.hasNext()) {
            C0513f c0513f = (C0513f) it.next();
            c0513f.f8107l.j("onConfigurationChanged", new ArrayList(Arrays.asList(objArr)), null);
        }
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        this.f8107l.s(null);
        this.f8107l = null;
        C0512e c0512e = this.f8108m;
        c0512e.f8104l.s(null);
        C0512e.f8103m.f8095a.remove(c0512e);
        if (C0512e.f8103m.f8095a.size() == 0) {
            C0511d c0511d = C0512e.f8103m;
            c0511d.a();
            c0511d.f8100f.unregisterAudioDeviceCallback(c0511d.f8101g);
            c0511d.f8099e = null;
            c0511d.f8100f = null;
            C0512e.f8103m = null;
        }
        c0512e.f8104l = null;
        this.f8108m = null;
        f8106o.remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [r2.e, L2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [r2.d, java.lang.Object] */
    @Override // H2.b
    public final void d(H2.a aVar) {
        L2.f fVar = (L2.f) aVar.f709m;
        C0044m c0044m = new C0044m(fVar, "com.ryanheise.audio_session");
        this.f8107l = c0044m;
        c0044m.s(this);
        ?? obj = new Object();
        if (C0512e.f8103m == null) {
            ?? obj2 = new Object();
            Handler handler = new Handler(Looper.getMainLooper());
            obj2.f8095a = new ArrayList();
            obj2.f8102h = new ArrayList();
            Context context = (Context) aVar.f708l;
            obj2.f8099e = context;
            obj2.f8100f = (AudioManager) context.getSystemService("audio");
            C0208g c0208g = new C0208g(1, obj2);
            obj2.f8101g = c0208g;
            obj2.f8100f.registerAudioDeviceCallback(c0208g, handler);
            C0512e.f8103m = obj2;
        }
        obj.f8104l = new C0044m(fVar, "com.ryanheise.android_audio_manager");
        C0512e.f8103m.f8095a.add(obj);
        obj.f8104l.s(obj);
        this.f8108m = obj;
        f8106o.add(this);
    }
}
