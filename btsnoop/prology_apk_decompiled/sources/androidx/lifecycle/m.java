package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import k.C0374a;
import l.C0396a;
import l.C0398c;

/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4162a;

    /* renamed from: b, reason: collision with root package name */
    public C0396a f4163b;

    /* renamed from: c, reason: collision with root package name */
    public f f4164c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f4165d;

    /* renamed from: e, reason: collision with root package name */
    public int f4166e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4167f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4168g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4169h;

    /* renamed from: i, reason: collision with root package name */
    public final u3.q f4170i;

    public m(k kVar) {
        new AtomicReference();
        this.f4162a = true;
        this.f4163b = new C0396a();
        f fVar = f.f4154m;
        this.f4164c = fVar;
        this.f4169h = new ArrayList();
        this.f4165d = new WeakReference(kVar);
        this.f4170i = new u3.q(fVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, androidx.lifecycle.l] */
    public final void a(j jVar) {
        Object obj;
        k kVar;
        ArrayList arrayList = this.f4169h;
        c("addObserver");
        f fVar = this.f4164c;
        f fVar2 = f.f4153l;
        if (fVar != fVar2) {
            fVar2 = f.f4154m;
        }
        ?? obj2 = new Object();
        int i4 = n.f4171a;
        obj2.f4161b = jVar;
        obj2.f4160a = fVar2;
        C0396a c0396a = this.f4163b;
        C0398c a4 = c0396a.a(jVar);
        if (a4 != null) {
            obj = a4.f7111m;
        } else {
            HashMap hashMap = c0396a.f7106p;
            C0398c c0398c = new C0398c(jVar, obj2);
            c0396a.f7120o++;
            C0398c c0398c2 = c0396a.f7118m;
            if (c0398c2 == null) {
                c0396a.f7117l = c0398c;
                c0396a.f7118m = c0398c;
            } else {
                c0398c2.f7112n = c0398c;
                c0398c.f7113o = c0398c2;
                c0396a.f7118m = c0398c;
            }
            hashMap.put(jVar, c0398c);
            obj = null;
        }
        if (((l) obj) == null && (kVar = (k) this.f4165d.get()) != null) {
            boolean z4 = this.f4166e != 0 || this.f4167f;
            f b4 = b(jVar);
            this.f4166e++;
            while (obj2.f4160a.compareTo(b4) < 0 && this.f4163b.f7106p.containsKey(jVar)) {
                arrayList.add(obj2.f4160a);
                c cVar = e.Companion;
                f fVar3 = obj2.f4160a;
                cVar.getClass();
                e a5 = c.a(fVar3);
                if (a5 == null) {
                    throw new IllegalStateException("no event up from " + obj2.f4160a);
                }
                obj2.a(kVar, a5);
                arrayList.remove(arrayList.size() - 1);
                b4 = b(jVar);
            }
            if (!z4) {
                e();
            }
            this.f4166e--;
        }
    }

    public final f b(j jVar) {
        HashMap hashMap = this.f4163b.f7106p;
        C0398c c0398c = hashMap.containsKey(jVar) ? ((C0398c) hashMap.get(jVar)).f7113o : null;
        f fVar = c0398c != null ? ((l) c0398c.f7111m).f4160a : null;
        ArrayList arrayList = this.f4169h;
        f fVar2 = arrayList.isEmpty() ? null : (f) arrayList.get(arrayList.size() - 1);
        f fVar3 = this.f4164c;
        k3.h.e(fVar3, "state1");
        if (fVar == null || fVar.compareTo(fVar3) >= 0) {
            fVar = fVar3;
        }
        return (fVar2 == null || fVar2.compareTo(fVar) >= 0) ? fVar : fVar2;
    }

    public final void c(String str) {
        C0374a c0374a;
        if (this.f4162a) {
            if (C0374a.f6923b != null) {
                c0374a = C0374a.f6923b;
            } else {
                synchronized (C0374a.class) {
                    try {
                        if (C0374a.f6923b == null) {
                            C0374a.f6923b = new C0374a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0374a = C0374a.f6923b;
            }
            ((C0374a) c0374a.f6924a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(e eVar) {
        k3.h.e(eVar, "event");
        c("handleLifecycleEvent");
        f a4 = eVar.a();
        f fVar = this.f4164c;
        if (fVar == a4) {
            return;
        }
        f fVar2 = f.f4154m;
        f fVar3 = f.f4153l;
        if (fVar == fVar2 && a4 == fVar3) {
            throw new IllegalStateException(("no event down from " + this.f4164c + " in component " + this.f4165d.get()).toString());
        }
        this.f4164c = a4;
        if (this.f4167f || this.f4166e != 0) {
            this.f4168g = true;
            return;
        }
        this.f4167f = true;
        e();
        this.f4167f = false;
        if (this.f4164c == fVar3) {
            this.f4163b = new C0396a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r8.f4168g = false;
        r0 = r8.f4164c;
        r1 = r8.f4170i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = v3.l.f8732a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.b(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.e():void");
    }
}
