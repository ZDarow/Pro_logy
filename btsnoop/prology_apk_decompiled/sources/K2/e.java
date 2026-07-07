package K2;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class e implements v2.i {

    /* renamed from: l, reason: collision with root package name */
    public final int f957l;

    /* renamed from: m, reason: collision with root package name */
    public final int f958m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f959n;

    /* renamed from: o, reason: collision with root package name */
    public final Serializable f960o;

    /* renamed from: p, reason: collision with root package name */
    public final Serializable f961p;

    /* renamed from: q, reason: collision with root package name */
    public final Serializable f962q;

    /* renamed from: r, reason: collision with root package name */
    public final Serializable f963r;

    public e(int i4, int i5) {
        this.f960o = new LinkedList();
        this.f961p = new HashSet();
        this.f962q = new HashSet();
        this.f963r = new HashMap();
        this.f959n = "Sqflite";
        this.f957l = i4;
        this.f958m = i5;
    }

    @Override // v2.i
    public synchronized void a(v2.g gVar) {
        ((LinkedList) this.f960o).add(gVar);
        Iterator it = new HashSet((HashSet) this.f961p).iterator();
        while (it.hasNext()) {
            f((v2.h) it.next());
        }
    }

    @Override // v2.i
    public synchronized void c() {
        try {
            Iterator it = ((HashSet) this.f961p).iterator();
            while (it.hasNext()) {
                v2.h hVar = (v2.h) it.next();
                synchronized (hVar) {
                    HandlerThread handlerThread = hVar.f8682c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        hVar.f8682c = null;
                        hVar.f8683d = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.f962q).iterator();
            while (it2.hasNext()) {
                v2.h hVar2 = (v2.h) it2.next();
                synchronized (hVar2) {
                    HandlerThread handlerThread2 = hVar2.f8682c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        hVar2.f8682c = null;
                        hVar2.f8683d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // v2.i
    public synchronized void d() {
        for (int i4 = 0; i4 < this.f957l; i4++) {
            v2.h hVar = new v2.h(((String) this.f959n) + i4, this.f958m);
            hVar.a(new W.m(14, this, hVar));
            ((HashSet) this.f961p).add(hVar);
        }
    }

    public synchronized v2.g e(v2.h hVar) {
        v2.g gVar;
        v2.h hVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f960o).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                gVar = (v2.g) listIterator.next();
                hVar2 = gVar.a() != null ? (v2.h) ((HashMap) this.f963r).get(gVar.a()) : null;
                if (hVar2 == null) {
                    break;
                }
            } while (hVar2 != hVar);
            listIterator.remove();
            return gVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f(v2.h hVar) {
        try {
            v2.g e4 = e(hVar);
            if (e4 != null) {
                ((HashSet) this.f962q).add(hVar);
                ((HashSet) this.f961p).remove(hVar);
                if (e4.a() != null) {
                    ((HashMap) this.f963r).put(e4.a(), hVar);
                }
                hVar.f8683d.post(new W.m(13, hVar, e4));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public e(Integer num, int i4, Boolean bool, Integer num2, int i5, Integer num3, Boolean bool2) {
        this.f959n = num;
        this.f957l = i4;
        this.f962q = bool;
        this.f960o = num2;
        this.f958m = i5;
        this.f961p = num3;
        this.f963r = bool2;
    }
}
