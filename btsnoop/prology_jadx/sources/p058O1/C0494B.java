package p058O1;

/* renamed from: O1.B */
/* loaded from: classes.dex */
public final class C0494B implements android.os.Handler.Callback {

    /* renamed from: l */
    public final /* synthetic */ p058O1.C0495C f1450l;

    public /* synthetic */ C0494B(p058O1.C0495C c0495c) {
        this.f1450l = c0495c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            synchronized (this.f1450l.f1454a) {
                try {
                    p058O1.C0522z c0522z = (p058O1.C0522z) message.obj;
                    p058O1.ServiceConnectionC0493A serviceConnectionC0493A = (p058O1.ServiceConnectionC0493A) this.f1450l.f1454a.get(c0522z);
                    if (serviceConnectionC0493A != null && serviceConnectionC0493A.f1443l.isEmpty()) {
                        if (serviceConnectionC0493A.f1445n) {
                            serviceConnectionC0493A.f1449r.f1456c.removeMessages(1, serviceConnectionC0493A.f1447p);
                            p058O1.C0495C c0495c = serviceConnectionC0493A.f1449r;
                            c0495c.f1457d.m1100a(c0495c.f1455b, serviceConnectionC0493A);
                            serviceConnectionC0493A.f1445n = false;
                            serviceConnectionC0493A.f1444m = 2;
                        }
                        this.f1450l.f1454a.remove(c0522z);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        synchronized (this.f1450l.f1454a) {
            try {
                p058O1.C0522z c0522z2 = (p058O1.C0522z) message.obj;
                p058O1.ServiceConnectionC0493A serviceConnectionC0493A2 = (p058O1.ServiceConnectionC0493A) this.f1450l.f1454a.get(c0522z2);
                if (serviceConnectionC0493A2 != null && serviceConnectionC0493A2.f1444m == 3) {
                    android.util.Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(java.lang.String.valueOf(c0522z2)), new java.lang.Exception());
                    android.content.ComponentName componentName = serviceConnectionC0493A2.f1448q;
                    if (componentName == null) {
                        c0522z2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        java.lang.String str = c0522z2.f1544b;
                        p058O1.AbstractC0515s.m1017d(str);
                        componentName = new android.content.ComponentName(str, "unknown");
                    }
                    serviceConnectionC0493A2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
