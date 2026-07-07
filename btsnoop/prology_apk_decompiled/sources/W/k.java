package W;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t f2664a;

    /* renamed from: b, reason: collision with root package name */
    public final v f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2666c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f2667d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f2668e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f2669f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2670g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2671h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2672i;

    public k(Looper looper, t tVar, i iVar) {
        this(new CopyOnWriteArraySet(), looper, tVar, iVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f2670g) {
            try {
                if (this.f2671h) {
                    return;
                }
                this.f2667d.add(new j(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f2669f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        v vVar = this.f2665b;
        if (!vVar.f2703a.hasMessages(1)) {
            vVar.getClass();
            u b4 = v.b();
            b4.f2701a = vVar.f2703a.obtainMessage(1);
            vVar.getClass();
            Message message = b4.f2701a;
            message.getClass();
            vVar.f2703a.sendMessageAtFrontOfQueue(message);
            b4.a();
        }
        ArrayDeque arrayDeque2 = this.f2668e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i4, h hVar) {
        f();
        this.f2669f.add(new g(new CopyOnWriteArraySet(this.f2667d), i4, hVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.f2670g) {
            this.f2671h = true;
        }
        Iterator it = this.f2667d.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            i iVar = this.f2666c;
            jVar.f2663d = true;
            if (jVar.f2662c) {
                jVar.f2662c = false;
                iVar.c(jVar.f2660a, jVar.f2661b.b());
            }
        }
        this.f2667d.clear();
    }

    public final void e(int i4, h hVar) {
        c(i4, hVar);
        b();
    }

    public final void f() {
        if (this.f2672i) {
            a.j(Thread.currentThread() == this.f2665b.f2703a.getLooper().getThread());
        }
    }

    public k(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, t tVar, i iVar, boolean z4) {
        this.f2664a = tVar;
        this.f2667d = copyOnWriteArraySet;
        this.f2666c = iVar;
        this.f2670g = new Object();
        this.f2668e = new ArrayDeque();
        this.f2669f = new ArrayDeque();
        this.f2665b = tVar.a(looper, new f(0, this));
        this.f2672i = z4;
    }
}
