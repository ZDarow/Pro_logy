package p064Q;

/* renamed from: Q.r */
/* loaded from: classes.dex */
public final class RunnableC0546r implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1613l;

    /* renamed from: m */
    public final /* synthetic */ p043K2.C0339o f1614m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.String f1615n;

    /* renamed from: o */
    public final /* synthetic */ android.os.Bundle f1616o;

    /* renamed from: p */
    public final /* synthetic */ java.lang.Object f1617p;

    /* renamed from: q */
    public final /* synthetic */ p043K2.C0339o f1618q;

    public /* synthetic */ RunnableC0546r(p043K2.C0339o c0339o, p043K2.C0339o c0339o2, java.lang.String str, android.os.Bundle bundle, p111c.C1201d c1201d, int i4) {
        this.f1613l = i4;
        this.f1618q = c0339o;
        this.f1614m = c0339o2;
        this.f1615n = str;
        this.f1616o = bundle;
        this.f1617p = c1201d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1613l) {
            case 0:
                android.os.IBinder binder = ((android.os.Messenger) this.f1614m.f1048m).getBinder();
                p043K2.C0339o c0339o = this.f1618q;
                p064Q.C0534f c0534f = (p064Q.C0534f) ((p064Q.AbstractServiceC0548t) c0339o.f1048m).f1626p.get(binder);
                java.lang.String str = this.f1615n;
                if (c0534f == null) {
                    android.util.Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                    return;
                }
                ((p064Q.AbstractServiceC0548t) c0339o.f1048m).getClass();
                p064Q.C0533e c0533e = new p064Q.C0533e(str, (p111c.C1201d) this.f1617p, 1);
                if (com.ryanheise.audioservice.AudioService.f4961L == null) {
                    c0533e.m1054e(new java.util.ArrayList());
                } else {
                    if (p190s2.C2151k.f8573t != null) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("query", str);
                        hashMap.put("extras", p190s2.C2151k.m4270k(this.f1616o));
                        p190s2.C2151k.f8573t.m656a("search", hashMap, new p190s2.C2148h(c0533e, 2));
                    }
                    c0533e.mo1038a();
                }
                if (!c0533e.m1052b()) {
                    throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m153l("onSearch must call detach() or sendResult() before returning for query=", str));
                }
                return;
            case 1:
                android.os.IBinder binder2 = ((android.os.Messenger) this.f1614m.f1048m).getBinder();
                p043K2.C0339o c0339o2 = this.f1618q;
                if (((p064Q.C0534f) ((p064Q.AbstractServiceC0548t) c0339o2.f1048m).f1626p.get(binder2)) != null) {
                    ((p064Q.AbstractServiceC0548t) c0339o2.f1048m).getClass();
                    ((p111c.C1201d) this.f1617p).m2838e(-1, null);
                    return;
                }
                android.util.Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f1615n + ", extras=" + this.f1616o);
                return;
            default:
                android.os.IBinder binder3 = ((android.os.Messenger) this.f1614m.f1048m).getBinder();
                p043K2.C0339o c0339o3 = this.f1618q;
                p064Q.C0534f c0534f2 = (p064Q.C0534f) ((p064Q.AbstractServiceC0548t) c0339o3.f1048m).f1626p.get(binder3);
                java.lang.String str2 = this.f1615n;
                if (c0534f2 == null) {
                    android.util.Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str2);
                    return;
                }
                p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) c0339o3.f1048m;
                abstractServiceC0548t.getClass();
                java.util.HashMap hashMap2 = c0534f2.f1572e;
                java.util.List list = (java.util.List) hashMap2.get(str2);
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                java.util.Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    android.os.IBinder iBinder = (android.os.IBinder) this.f1617p;
                    android.os.Bundle bundle = this.f1616o;
                    if (!hasNext) {
                        list.add(new p006B.C0019b(iBinder, bundle));
                        hashMap2.put(str2, list);
                        abstractServiceC0548t.m1060e(str2, c0534f2, bundle, null);
                        return;
                    }
                    p006B.C0019b c0019b = (p006B.C0019b) it.next();
                    if (iBinder == c0019b.f85a) {
                        android.os.Bundle bundle2 = (android.os.Bundle) c0019b.f86b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    public RunnableC0546r(p043K2.C0339o c0339o, p043K2.C0339o c0339o2, java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.f1613l = 2;
        this.f1618q = c0339o;
        this.f1614m = c0339o2;
        this.f1615n = str;
        this.f1617p = iBinder;
        this.f1616o = bundle;
    }
}
