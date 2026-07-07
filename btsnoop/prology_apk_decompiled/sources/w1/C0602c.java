package w1;

import B2.q;
import Z2.g;
import a3.l;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import i1.ExecutorC0342b;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import q1.C0494a;
import v1.InterfaceC0588a;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602c implements InterfaceC0588a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f8888a;

    /* renamed from: b, reason: collision with root package name */
    public final C0494a f8889b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f8890c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8891d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8892e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8893f = new LinkedHashMap();

    public C0602c(WindowLayoutComponent windowLayoutComponent, C0494a c0494a) {
        this.f8888a = windowLayoutComponent;
        this.f8889b = c0494a;
    }

    @Override // v1.InterfaceC0588a
    public final void a(q qVar) {
        ReentrantLock reentrantLock = this.f8890c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f8892e;
        try {
            Context context = (Context) linkedHashMap.get(qVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f8891d;
            C0605f c0605f = (C0605f) linkedHashMap2.get(context);
            if (c0605f == null) {
                return;
            }
            c0605f.d(qVar);
            linkedHashMap.remove(qVar);
            if (c0605f.f8901d.isEmpty()) {
                linkedHashMap2.remove(context);
                r1.d dVar = (r1.d) this.f8893f.remove(c0605f);
                if (dVar != null) {
                    dVar.f8076a.invoke(dVar.f8077b, dVar.f8078c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // v1.InterfaceC0588a
    public final void b(Context context, ExecutorC0342b executorC0342b, q qVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f8890c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f8891d;
        try {
            C0605f c0605f = (C0605f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f8892e;
            if (c0605f != null) {
                c0605f.b(qVar);
                linkedHashMap2.put(qVar, context);
                gVar = g.f3186a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                C0605f c0605f2 = new C0605f(context);
                linkedHashMap.put(context, c0605f2);
                linkedHashMap2.put(qVar, context);
                c0605f2.b(qVar);
                if (!(context instanceof Activity)) {
                    c0605f2.accept(new WindowLayoutInfo(l.f3631l));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f8893f.put(c0605f2, this.f8889b.a(this.f8888a, k3.q.a(WindowLayoutInfo.class), (Activity) context, new C0601b(c0605f2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
