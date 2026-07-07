package x1;

import B2.q;
import a3.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import i1.ExecutorC0342b;
import io.flutter.plugin.platform.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import v1.InterfaceC0588a;
import w0.C0591a;

/* loaded from: classes.dex */
public final class j implements InterfaceC0588a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile j f8982c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f8983d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final h f8984a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f8985b = new CopyOnWriteArrayList();

    public j(h hVar) {
        this.f8984a = hVar;
        if (hVar != null) {
            hVar.h(new C0591a(this));
        }
    }

    @Override // v1.InterfaceC0588a
    public final void a(q qVar) {
        synchronized (f8983d) {
            try {
                if (this.f8984a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f8985b.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f8980b == qVar) {
                        arrayList.add(iVar);
                    }
                }
                this.f8985b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((i) it2.next()).f8979a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f8985b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((i) it3.next()).f8979a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    h hVar = this.f8984a;
                    if (hVar != null) {
                        hVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v1.InterfaceC0588a
    public final void b(Context context, ExecutorC0342b executorC0342b, q qVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        Z2.g gVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        l lVar = l.f3631l;
        if (activity != null) {
            ReentrantLock reentrantLock = f8983d;
            reentrantLock.lock();
            try {
                h hVar = this.f8984a;
                if (hVar == null) {
                    qVar.accept(new u1.j(lVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f8985b;
                boolean z4 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((i) it.next()).f8979a.equals(activity)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                i iVar = new i(activity, executorC0342b, qVar);
                copyOnWriteArrayList.add(iVar);
                if (z4) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((i) obj).f8979a)) {
                                break;
                            }
                        }
                    }
                    i iVar2 = (i) obj;
                    u1.j jVar = iVar2 != null ? iVar2.f8981c : null;
                    if (jVar != null) {
                        iVar.f8981c = jVar;
                        iVar.f8980b.accept(jVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        hVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new y(hVar, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = Z2.g.f3186a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            qVar.accept(new u1.j(lVar));
        }
    }
}
