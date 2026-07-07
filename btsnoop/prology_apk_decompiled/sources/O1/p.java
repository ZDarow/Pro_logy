package O1;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1469a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1472d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f1473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1474f;

    public p(com.google.android.gms.common.internal.a aVar, int i4, Bundle bundle) {
        this.f1474f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f1471c = aVar;
        this.f1469a = bool;
        this.f1470b = false;
        this.f1472d = i4;
        this.f1473e = bundle;
    }

    public abstract void a(L1.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1469a = null;
        }
        synchronized (this.f1471c.f4759v) {
            this.f1471c.f4759v.remove(this);
        }
    }
}
