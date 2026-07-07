package w1;

import B2.q;
import Z2.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import i1.ExecutorC0342b;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import v1.InterfaceC0588a;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603d implements InterfaceC0588a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f8894a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f8895b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8896c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8897d = new LinkedHashMap();

    public C0603d(WindowLayoutComponent windowLayoutComponent) {
        this.f8894a = windowLayoutComponent;
    }

    @Override // v1.InterfaceC0588a
    public final void a(q qVar) {
        ReentrantLock reentrantLock = this.f8895b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f8897d;
        try {
            Context context = (Context) linkedHashMap.get(qVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f8896c;
            C0605f c0605f = (C0605f) linkedHashMap2.get(context);
            if (c0605f == null) {
                return;
            }
            c0605f.d(qVar);
            linkedHashMap.remove(qVar);
            if (c0605f.c()) {
                linkedHashMap2.remove(context);
                this.f8894a.removeWindowLayoutInfoListener(c0605f);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // v1.InterfaceC0588a
    public final void b(Context context, ExecutorC0342b executorC0342b, q qVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f8895b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f8896c;
        try {
            C0605f c0605f = (C0605f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f8897d;
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
                this.f8894a.addWindowLayoutInfoListener(context, c0605f2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
