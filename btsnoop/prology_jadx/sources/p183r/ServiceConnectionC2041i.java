package p183r;

/* renamed from: r.i */
/* loaded from: classes.dex */
public final class ServiceConnectionC2041i implements android.os.Handler.Callback, android.content.ServiceConnection {

    /* renamed from: l */
    public final android.content.Context f8297l;

    /* renamed from: m */
    public final android.os.Handler f8298m;

    /* renamed from: n */
    public final java.util.HashMap f8299n = new java.util.HashMap();

    /* renamed from: o */
    public java.util.HashSet f8300o = new java.util.HashSet();

    public ServiceConnectionC2041i(android.content.Context context) {
        this.f8297l = context;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f8298m = new android.os.Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public final void m4098a(p183r.C2040h c2040h) {
        boolean z4;
        java.util.ArrayDeque arrayDeque;
        boolean isLoggable = android.util.Log.isLoggable("NotifManCompat", 3);
        android.content.ComponentName componentName = c2040h.f8292a;
        if (isLoggable) {
            android.util.Log.d("NotifManCompat", "Processing component " + componentName + ", " + c2040h.f8295d.size() + " queued tasks");
        }
        if (c2040h.f8295d.isEmpty()) {
            return;
        }
        if (c2040h.f8293b) {
            z4 = true;
        } else {
            android.content.Intent component = new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            android.content.Context context = this.f8297l;
            boolean bindService = context.bindService(component, this, 33);
            c2040h.f8293b = bindService;
            if (bindService) {
                c2040h.f8296e = 0;
            } else {
                android.util.Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z4 = c2040h.f8293b;
        }
        if (!z4 || c2040h.f8294c == null) {
            m4099b(c2040h);
            return;
        }
        while (true) {
            arrayDeque = c2040h.f8295d;
            p183r.C2038f c2038f = (p183r.C2038f) arrayDeque.peek();
            if (c2038f == null) {
                break;
            }
            try {
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    android.util.Log.d("NotifManCompat", "Sending task " + c2038f);
                }
                c2038f.m4097a(c2040h.f8294c);
                arrayDeque.remove();
            } catch (android.os.DeadObjectException unused) {
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    android.util.Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (android.os.RemoteException e4) {
                android.util.Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e4);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m4099b(c2040h);
    }

    /* renamed from: b */
    public final void m4099b(p183r.C2040h c2040h) {
        android.os.Handler handler = this.f8298m;
        android.content.ComponentName componentName = c2040h.f8292a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i4 = c2040h.f8296e;
        int i5 = i4 + 1;
        c2040h.f8296e = i5;
        if (i5 <= 6) {
            int i6 = (1 << i4) * 1000;
            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                android.util.Log.d("NotifManCompat", "Scheduling retry for " + i6 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i6);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Giving up on delivering ");
        java.util.ArrayDeque arrayDeque = c2040h.f8295d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(c2040h.f8296e);
        sb.append(" retries");
        android.util.Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.HashSet hashSet;
        int i4 = message.what;
        p106b.InterfaceC1165c interfaceC1165c = null;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    p183r.C2040h c2040h = (p183r.C2040h) this.f8299n.get((android.content.ComponentName) message.obj);
                    if (c2040h != null) {
                        m4098a(c2040h);
                    }
                    return true;
                }
                p183r.C2040h c2040h2 = (p183r.C2040h) this.f8299n.get((android.content.ComponentName) message.obj);
                if (c2040h2 != null) {
                    if (c2040h2.f8293b) {
                        this.f8297l.unbindService(this);
                        c2040h2.f8293b = false;
                    }
                    c2040h2.f8294c = null;
                }
                return true;
            }
            p183r.C2039g c2039g = (p183r.C2039g) message.obj;
            android.content.ComponentName componentName = c2039g.f8290a;
            android.os.IBinder iBinder = c2039g.f8291b;
            p183r.C2040h c2040h3 = (p183r.C2040h) this.f8299n.get(componentName);
            if (c2040h3 != null) {
                int i5 = p106b.AbstractBinderC1164b.f4480c;
                if (iBinder != null) {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(p106b.InterfaceC1165c.f4481a);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof p106b.InterfaceC1165c)) {
                        ?? obj = new java.lang.Object();
                        obj.f4479c = iBinder;
                        interfaceC1165c = obj;
                    } else {
                        interfaceC1165c = (p106b.InterfaceC1165c) queryLocalInterface;
                    }
                }
                c2040h3.f8294c = interfaceC1165c;
                c2040h3.f8296e = 0;
                m4098a(c2040h3);
            }
            return true;
        }
        p183r.C2038f c2038f = (p183r.C2038f) message.obj;
        java.lang.String string = android.provider.Settings.Secure.getString(this.f8297l.getContentResolver(), "enabled_notification_listeners");
        synchronized (p183r.C2042j.f8301b) {
            if (string != null) {
                try {
                    if (!string.equals(p183r.C2042j.f8302c)) {
                        java.lang.String[] split = string.split(":", -1);
                        java.util.HashSet hashSet2 = new java.util.HashSet(split.length);
                        for (java.lang.String str : split) {
                            android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        p183r.C2042j.f8303d = hashSet2;
                        p183r.C2042j.f8302c = string;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            hashSet = p183r.C2042j.f8303d;
        }
        if (!hashSet.equals(this.f8300o)) {
            this.f8300o = hashSet;
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = this.f8297l.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            java.util.HashSet hashSet3 = new java.util.HashSet();
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    android.content.ComponentName componentName2 = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        android.util.Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            java.util.Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                android.content.ComponentName componentName3 = (android.content.ComponentName) it.next();
                if (!this.f8299n.containsKey(componentName3)) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        android.util.Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f8299n.put(componentName3, new p183r.C2040h(componentName3));
                }
            }
            java.util.Iterator it2 = this.f8299n.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        android.util.Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    p183r.C2040h c2040h4 = (p183r.C2040h) entry.getValue();
                    if (c2040h4.f8293b) {
                        this.f8297l.unbindService(this);
                        c2040h4.f8293b = false;
                    }
                    c2040h4.f8294c = null;
                    it2.remove();
                }
            }
        }
        for (p183r.C2040h c2040h5 : this.f8299n.values()) {
            c2040h5.f8295d.add(c2038f);
            m4098a(c2040h5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.util.Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f8298m.obtainMessage(1, new p183r.C2039g(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.util.Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f8298m.obtainMessage(2, componentName).sendToTarget();
    }
}
