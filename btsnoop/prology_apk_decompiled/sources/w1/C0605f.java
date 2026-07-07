package w1;

import B2.q;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k3.h;
import u1.j;

/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605f implements B.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8898a;

    /* renamed from: c, reason: collision with root package name */
    public j f8900c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f8899b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f8901d = new LinkedHashSet();

    public C0605f(Context context) {
        this.f8898a = context;
    }

    @Override // B.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f8899b;
        reentrantLock.lock();
        try {
            this.f8900c = AbstractC0604e.b(this.f8898a, windowLayoutInfo);
            Iterator it = this.f8901d.iterator();
            while (it.hasNext()) {
                ((B.a) it.next()).accept(this.f8900c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(q qVar) {
        ReentrantLock reentrantLock = this.f8899b;
        reentrantLock.lock();
        try {
            j jVar = this.f8900c;
            if (jVar != null) {
                qVar.accept(jVar);
            }
            this.f8901d.add(qVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f8901d.isEmpty();
    }

    public final void d(q qVar) {
        ReentrantLock reentrantLock = this.f8899b;
        reentrantLock.lock();
        try {
            this.f8901d.remove(qVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
