package p212x1;

/* renamed from: x1.j */
/* loaded from: classes.dex */
public final class C2377j implements p203v1.InterfaceC2270a {

    /* renamed from: c */
    public static volatile p212x1.C2377j f9341c;

    /* renamed from: d */
    public static final java.util.concurrent.locks.ReentrantLock f9342d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: a */
    public final p212x1.C2375h f9343a;

    /* renamed from: b */
    public final java.util.concurrent.CopyOnWriteArrayList f9344b = new java.util.concurrent.CopyOnWriteArrayList();

    public C2377j(p212x1.C2375h c2375h) {
        this.f9343a = c2375h;
        if (c2375h != null) {
            c2375h.m4601h(new p206w0.C2305a(this));
        }
    }

    @Override // p203v1.InterfaceC2270a
    /* renamed from: a */
    public final void mo4458a(p009B2.C0060q c0060q) {
        synchronized (f9342d) {
            try {
                if (this.f9343a == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.f9344b.iterator();
                while (it.hasNext()) {
                    p212x1.C2376i c2376i = (p212x1.C2376i) it.next();
                    if (c2376i.f9339b == c0060q) {
                        arrayList.add(c2376i);
                    }
                }
                this.f9344b.removeAll(arrayList);
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    android.app.Activity activity = ((p212x1.C2376i) it2.next()).f9338a;
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f9344b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        java.util.Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((p212x1.C2376i) it3.next()).f9338a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    p212x1.C2375h c2375h = this.f9343a;
                    if (c2375h != null) {
                        c2375h.m4599f(activity);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p203v1.InterfaceC2270a
    /* renamed from: b */
    public final void mo4459b(android.content.Context context, p142i1.ExecutorC1537b executorC1537b, p009B2.C0060q c0060q) {
        java.lang.Object obj;
        android.view.WindowManager.LayoutParams attributes;
        p100Z2.C0934g c0934g = null;
        r1 = null;
        android.os.IBinder iBinder = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        p105a3.C1029l c1029l = p105a3.C1029l.f3755l;
        if (activity != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = f9342d;
            reentrantLock.lock();
            try {
                p212x1.C2375h c2375h = this.f9343a;
                if (c2375h == null) {
                    c0060q.accept(new p198u1.C2242j(c1029l));
                    return;
                }
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f9344b;
                boolean z4 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((p212x1.C2376i) it.next()).f9338a.equals(activity)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                p212x1.C2376i c2376i = new p212x1.C2376i(activity, executorC1537b, c0060q);
                copyOnWriteArrayList.add(c2376i);
                if (z4) {
                    java.util.Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((p212x1.C2376i) obj).f9338a)) {
                                break;
                            }
                        }
                    }
                    p212x1.C2376i c2376i2 = (p212x1.C2376i) obj;
                    p198u1.C2242j c2242j = c2376i2 != null ? c2376i2.f9340c : null;
                    if (c2242j != null) {
                        c2376i.f9340c = c2242j;
                        c2376i.f9339b.accept(c2242j);
                    }
                } else {
                    android.view.Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        c2375h.m4600g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new io.flutter.plugin.platform.ViewOnAttachStateChangeListenerC1602y(c2375h, activity));
                    }
                }
                reentrantLock.unlock();
                c0934g = p100Z2.C0934g.f3298a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0934g == null) {
            c0060q.accept(new p198u1.C2242j(c1029l));
        }
    }
}
