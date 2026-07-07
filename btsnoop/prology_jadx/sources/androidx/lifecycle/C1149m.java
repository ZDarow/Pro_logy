package androidx.lifecycle;

/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class C1149m extends androidx.lifecycle.AbstractC1143g {

    /* renamed from: a */
    public final boolean f4311a;

    /* renamed from: b */
    public p155l.C1815a f4312b;

    /* renamed from: c */
    public androidx.lifecycle.EnumC1142f f4313c;

    /* renamed from: d */
    public final java.lang.ref.WeakReference f4314d;

    /* renamed from: e */
    public int f4315e;

    /* renamed from: f */
    public boolean f4316f;

    /* renamed from: g */
    public boolean f4317g;

    /* renamed from: h */
    public final java.util.ArrayList f4318h;

    /* renamed from: i */
    public final p200u3.C2263q f4319i;

    public C1149m(androidx.lifecycle.InterfaceC1147k interfaceC1147k) {
        new java.util.concurrent.atomic.AtomicReference();
        this.f4311a = true;
        this.f4312b = new p155l.C1815a();
        androidx.lifecycle.EnumC1142f enumC1142f = androidx.lifecycle.EnumC1142f.f4303m;
        this.f4313c = enumC1142f;
        this.f4318h = new java.util.ArrayList();
        this.f4314d = new java.lang.ref.WeakReference(interfaceC1147k);
        this.f4319i = new p200u3.C2263q(enumC1142f);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, androidx.lifecycle.l] */
    /* renamed from: a */
    public final void m2657a(androidx.lifecycle.InterfaceC1146j interfaceC1146j) {
        java.lang.Object obj;
        androidx.lifecycle.InterfaceC1147k interfaceC1147k;
        java.util.ArrayList arrayList = this.f4318h;
        m2659c("addObserver");
        androidx.lifecycle.EnumC1142f enumC1142f = this.f4313c;
        androidx.lifecycle.EnumC1142f enumC1142f2 = androidx.lifecycle.EnumC1142f.f4302l;
        if (enumC1142f != enumC1142f2) {
            enumC1142f2 = androidx.lifecycle.EnumC1142f.f4303m;
        }
        ?? obj2 = new java.lang.Object();
        int i4 = androidx.lifecycle.AbstractC1150n.f4320a;
        obj2.f4310b = interfaceC1146j;
        obj2.f4309a = enumC1142f2;
        p155l.C1815a c1815a = this.f4312b;
        p155l.C1817c mo3792a = c1815a.mo3792a(interfaceC1146j);
        if (mo3792a != null) {
            obj = mo3792a.f7381m;
        } else {
            java.util.HashMap hashMap = c1815a.f7376p;
            p155l.C1817c c1817c = new p155l.C1817c(interfaceC1146j, obj2);
            c1815a.f7390o++;
            p155l.C1817c c1817c2 = c1815a.f7388m;
            if (c1817c2 == null) {
                c1815a.f7387l = c1817c;
                c1815a.f7388m = c1817c;
            } else {
                c1817c2.f7382n = c1817c;
                c1817c.f7383o = c1817c2;
                c1815a.f7388m = c1817c;
            }
            hashMap.put(interfaceC1146j, c1817c);
            obj = null;
        }
        if (((androidx.lifecycle.C1148l) obj) == null && (interfaceC1147k = (androidx.lifecycle.InterfaceC1147k) this.f4314d.get()) != null) {
            boolean z4 = this.f4315e != 0 || this.f4316f;
            androidx.lifecycle.EnumC1142f m2658b = m2658b(interfaceC1146j);
            this.f4315e++;
            while (obj2.f4309a.compareTo(m2658b) < 0 && this.f4312b.f7376p.containsKey(interfaceC1146j)) {
                arrayList.add(obj2.f4309a);
                androidx.lifecycle.C1139c c1139c = androidx.lifecycle.EnumC1141e.Companion;
                androidx.lifecycle.EnumC1142f enumC1142f3 = obj2.f4309a;
                c1139c.getClass();
                androidx.lifecycle.EnumC1141e m2653a = androidx.lifecycle.C1139c.m2653a(enumC1142f3);
                if (m2653a == null) {
                    throw new java.lang.IllegalStateException("no event up from " + obj2.f4309a);
                }
                obj2.m2656a(interfaceC1147k, m2653a);
                arrayList.remove(arrayList.size() - 1);
                m2658b = m2658b(interfaceC1146j);
            }
            if (!z4) {
                m2661e();
            }
            this.f4315e--;
        }
    }

    /* renamed from: b */
    public final androidx.lifecycle.EnumC1142f m2658b(androidx.lifecycle.InterfaceC1146j interfaceC1146j) {
        java.util.HashMap hashMap = this.f4312b.f7376p;
        p155l.C1817c c1817c = hashMap.containsKey(interfaceC1146j) ? ((p155l.C1817c) hashMap.get(interfaceC1146j)).f7383o : null;
        androidx.lifecycle.EnumC1142f enumC1142f = c1817c != null ? ((androidx.lifecycle.C1148l) c1817c.f7381m).f4309a : null;
        java.util.ArrayList arrayList = this.f4318h;
        androidx.lifecycle.EnumC1142f enumC1142f2 = arrayList.isEmpty() ? null : (androidx.lifecycle.EnumC1142f) arrayList.get(arrayList.size() - 1);
        androidx.lifecycle.EnumC1142f enumC1142f3 = this.f4313c;
        p154k3.AbstractC1803h.m3779e(enumC1142f3, "state1");
        if (enumC1142f == null || enumC1142f.compareTo(enumC1142f3) >= 0) {
            enumC1142f = enumC1142f3;
        }
        return (enumC1142f2 == null || enumC1142f2.compareTo(enumC1142f) >= 0) ? enumC1142f : enumC1142f2;
    }

    /* renamed from: c */
    public final void m2659c(java.lang.String str) {
        p150k.C1749a c1749a;
        if (this.f4311a) {
            if (p150k.C1749a.f7185b != null) {
                c1749a = p150k.C1749a.f7185b;
            } else {
                synchronized (p150k.C1749a.class) {
                    try {
                        if (p150k.C1749a.f7185b == null) {
                            p150k.C1749a.f7185b = new p150k.C1749a(0);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                c1749a = p150k.C1749a.f7185b;
            }
            ((p150k.C1749a) c1749a.f7186a).getClass();
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                return;
            }
            throw new java.lang.IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* renamed from: d */
    public final void m2660d(androidx.lifecycle.EnumC1141e enumC1141e) {
        p154k3.AbstractC1803h.m3779e(enumC1141e, "event");
        m2659c("handleLifecycleEvent");
        androidx.lifecycle.EnumC1142f m2654a = enumC1141e.m2654a();
        androidx.lifecycle.EnumC1142f enumC1142f = this.f4313c;
        if (enumC1142f == m2654a) {
            return;
        }
        androidx.lifecycle.EnumC1142f enumC1142f2 = androidx.lifecycle.EnumC1142f.f4303m;
        androidx.lifecycle.EnumC1142f enumC1142f3 = androidx.lifecycle.EnumC1142f.f4302l;
        if (enumC1142f == enumC1142f2 && m2654a == enumC1142f3) {
            throw new java.lang.IllegalStateException(("no event down from " + this.f4313c + " in component " + this.f4314d.get()).toString());
        }
        this.f4313c = m2654a;
        if (this.f4316f || this.f4315e != 0) {
            this.f4317g = true;
            return;
        }
        this.f4316f = true;
        m2661e();
        this.f4316f = false;
        if (this.f4313c == enumC1142f3) {
            this.f4312b = new p155l.C1815a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r8.f4317g = false;
        r0 = r8.f4313c;
        r1 = r8.f4319i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = p205v3.AbstractC2296l.f9086a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.m4449b(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2661e() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1149m.m2661e():void");
    }
}
