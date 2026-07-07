package p058O1;

/* renamed from: O1.p */
/* loaded from: classes.dex */
public abstract class AbstractC0512p {

    /* renamed from: a */
    public java.lang.Boolean f1520a;

    /* renamed from: b */
    public boolean f1521b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.gms.common.internal.AbstractC1253a f1522c;

    /* renamed from: d */
    public final int f1523d;

    /* renamed from: e */
    public final android.os.Bundle f1524e;

    /* renamed from: f */
    public final /* synthetic */ com.google.android.gms.common.internal.AbstractC1253a f1525f;

    public AbstractC0512p(com.google.android.gms.common.internal.AbstractC1253a abstractC1253a, int i4, android.os.Bundle bundle) {
        this.f1525f = abstractC1253a;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f1522c = abstractC1253a;
        this.f1520a = bool;
        this.f1521b = false;
        this.f1523d = i4;
        this.f1524e = bundle;
    }

    /* renamed from: a */
    public abstract void mo1010a(p046L1.C0357a c0357a);

    /* renamed from: b */
    public abstract boolean mo1011b();

    /* renamed from: c */
    public final void m1012c() {
        synchronized (this) {
            this.f1520a = null;
        }
        synchronized (this.f1522c.f4933v) {
            this.f1522c.f4933v.remove(this);
        }
    }
}
