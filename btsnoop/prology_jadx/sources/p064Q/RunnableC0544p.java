package p064Q;

/* renamed from: Q.p */
/* loaded from: classes.dex */
public final class RunnableC0544p implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1603l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f1604m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f1605n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f1606o;

    /* renamed from: p */
    public final /* synthetic */ java.lang.Object f1607p;

    public /* synthetic */ RunnableC0544p(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i4) {
        this.f1603l = i4;
        this.f1606o = obj;
        this.f1604m = obj2;
        this.f1605n = obj3;
        this.f1607p = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1603l) {
            case 0:
                android.os.IBinder binder = ((android.os.Messenger) ((p043K2.C0339o) this.f1604m).f1048m).getBinder();
                p043K2.C0339o c0339o = (p043K2.C0339o) this.f1606o;
                p064Q.C0534f c0534f = (p064Q.C0534f) ((p064Q.AbstractServiceC0548t) c0339o.f1048m).f1626p.get(binder);
                java.lang.String str = (java.lang.String) this.f1605n;
                if (c0534f == null) {
                    android.util.Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    return;
                }
                ((p064Q.AbstractServiceC0548t) c0339o.f1048m).getClass();
                java.util.HashMap hashMap = c0534f.f1572e;
                android.os.IBinder iBinder = (android.os.IBinder) this.f1607p;
                boolean z4 = false;
                if (iBinder != null) {
                    java.util.List list = (java.util.List) hashMap.get(str);
                    if (list != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (iBinder == ((p006B.C0019b) it.next()).f85a) {
                                it.remove();
                                z4 = true;
                            }
                        }
                        if (list.size() == 0) {
                            hashMap.remove(str);
                        }
                    }
                } else if (hashMap.remove(str) != null) {
                    z4 = true;
                }
                if (z4) {
                    return;
                }
                android.util.Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                return;
            case 1:
                android.os.IBinder binder2 = ((android.os.Messenger) ((p043K2.C0339o) this.f1604m).f1048m).getBinder();
                p043K2.C0339o c0339o2 = (p043K2.C0339o) this.f1606o;
                p064Q.C0534f c0534f2 = (p064Q.C0534f) ((p064Q.AbstractServiceC0548t) c0339o2.f1048m).f1626p.get(binder2);
                java.lang.String str2 = (java.lang.String) this.f1605n;
                if (c0534f2 == null) {
                    android.util.Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str2);
                    return;
                } else {
                    p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) c0339o2.f1048m;
                    abstractServiceC0548t.getClass();
                    p064Q.C0533e c0533e = new p064Q.C0533e(str2, (p111c.C1201d) this.f1607p, 0);
                    abstractServiceC0548t.mo1059d(str2, c0533e);
                    if (!c0533e.m1052b()) {
                        throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m153l("onLoadItem must call detach() or sendResult() before returning for id=", str2));
                    }
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p140i.C1513e c1513e = (p140i.C1513e) this.f1604m;
                if (c1513e != null) {
                    p129f2.C1408Y c1408y = (p129f2.C1408Y) this.f1606o;
                    ((p140i.ViewOnKeyListenerC1514f) c1408y.f5729m).f6250K = true;
                    c1513e.f6238b.m3361c(false);
                    ((p140i.ViewOnKeyListenerC1514f) c1408y.f5729m).f6250K = false;
                }
                p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) this.f1605n;
                if (menuItemC1518j.isEnabled() && menuItemC1518j.hasSubMenu()) {
                    ((p140i.MenuC1517i) this.f1607p).m3374p(menuItemC1518j, null, 4);
                    return;
                }
                return;
            default:
                synchronized (p204v2.C2283m.f9054q) {
                    p204v2.C2276f c2276f = (p204v2.C2276f) this.f1604m;
                    if (c2276f != null) {
                        p204v2.C2283m.m4479a((p204v2.C2283m) this.f1606o, c2276f);
                    }
                    try {
                        if (p204v2.AbstractC2271a.m4461b(p204v2.C2283m.f9055r)) {
                            android.util.Log.d("Sqflite", "delete database " + ((java.lang.String) this.f1605n));
                        }
                        android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File((java.lang.String) this.f1605n));
                    } catch (java.lang.Exception e4) {
                        android.util.Log.e("Sqflite", "error " + e4 + " while closing database " + p204v2.C2283m.f9059v);
                    }
                }
                ((p043K2.C0335k) this.f1607p).mo742b(null);
                return;
        }
    }
}
