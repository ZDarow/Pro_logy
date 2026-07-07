package r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.AbstractBinderC0175b;
import b.InterfaceC0176c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements Handler.Callback, ServiceConnection {

    /* renamed from: l, reason: collision with root package name */
    public final Context f7988l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f7989m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f7990n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public HashSet f7991o = new HashSet();

    public i(Context context) {
        this.f7988l = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f7989m = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(h hVar) {
        boolean z4;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = hVar.f7983a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + hVar.f7986d.size() + " queued tasks");
        }
        if (hVar.f7986d.isEmpty()) {
            return;
        }
        if (hVar.f7984b) {
            z4 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f7988l;
            boolean bindService = context.bindService(component, this, 33);
            hVar.f7984b = bindService;
            if (bindService) {
                hVar.f7987e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z4 = hVar.f7984b;
        }
        if (!z4 || hVar.f7985c == null) {
            b(hVar);
            return;
        }
        while (true) {
            arrayDeque = hVar.f7986d;
            f fVar = (f) arrayDeque.peek();
            if (fVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + fVar);
                }
                fVar.a(hVar.f7985c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e4) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e4);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(hVar);
    }

    public final void b(h hVar) {
        Handler handler = this.f7989m;
        ComponentName componentName = hVar.f7983a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i4 = hVar.f7987e;
        int i5 = i4 + 1;
        hVar.f7987e = i5;
        if (i5 <= 6) {
            int i6 = (1 << i4) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i6 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i6);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = hVar.f7986d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(hVar.f7987e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i4 = message.what;
        InterfaceC0176c interfaceC0176c = null;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    h hVar = (h) this.f7990n.get((ComponentName) message.obj);
                    if (hVar != null) {
                        a(hVar);
                    }
                    return true;
                }
                h hVar2 = (h) this.f7990n.get((ComponentName) message.obj);
                if (hVar2 != null) {
                    if (hVar2.f7984b) {
                        this.f7988l.unbindService(this);
                        hVar2.f7984b = false;
                    }
                    hVar2.f7985c = null;
                }
                return true;
            }
            g gVar = (g) message.obj;
            ComponentName componentName = gVar.f7981a;
            IBinder iBinder = gVar.f7982b;
            h hVar3 = (h) this.f7990n.get(componentName);
            if (hVar3 != null) {
                int i5 = AbstractBinderC0175b.f4324c;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0176c.f4325a);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0176c)) {
                        ?? obj = new Object();
                        obj.f4323c = iBinder;
                        interfaceC0176c = obj;
                    } else {
                        interfaceC0176c = (InterfaceC0176c) queryLocalInterface;
                    }
                }
                hVar3.f7985c = interfaceC0176c;
                hVar3.f7987e = 0;
                a(hVar3);
            }
            return true;
        }
        f fVar = (f) message.obj;
        String string = Settings.Secure.getString(this.f7988l.getContentResolver(), "enabled_notification_listeners");
        synchronized (j.f7992b) {
            if (string != null) {
                try {
                    if (!string.equals(j.f7993c)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        j.f7994d = hashSet2;
                        j.f7993c = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = j.f7994d;
        }
        if (!hashSet.equals(this.f7991o)) {
            this.f7991o = hashSet;
            List<ResolveInfo> queryIntentServices = this.f7988l.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f7990n.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f7990n.put(componentName3, new h(componentName3));
                }
            }
            Iterator it2 = this.f7990n.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    h hVar4 = (h) entry.getValue();
                    if (hVar4.f7984b) {
                        this.f7988l.unbindService(this);
                        hVar4.f7984b = false;
                    }
                    hVar4.f7985c = null;
                    it2.remove();
                }
            }
        }
        for (h hVar5 : this.f7990n.values()) {
            hVar5.f7986d.add(fVar);
            a(hVar5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f7989m.obtainMessage(1, new g(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f7989m.obtainMessage(2, componentName).sendToTarget();
    }
}
