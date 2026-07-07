package p086W;

/* renamed from: W.v */
/* loaded from: classes.dex */
public final class C0802v {

    /* renamed from: b */
    public static final java.util.ArrayList f2794b = new java.util.ArrayList(50);

    /* renamed from: a */
    public final android.os.Handler f2795a;

    public C0802v(android.os.Handler handler) {
        this.f2795a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static p086W.C0801u m1568b() {
        p086W.C0801u obj;
        java.util.ArrayList arrayList = f2794b;
        synchronized (arrayList) {
            try {
                obj = arrayList.isEmpty() ? new java.lang.Object() : (p086W.C0801u) arrayList.remove(arrayList.size() - 1);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public final p086W.C0801u m1569a(int i4, java.lang.Object obj) {
        p086W.C0801u m1568b = m1568b();
        m1568b.f2793a = this.f2795a.obtainMessage(i4, obj);
        return m1568b;
    }

    /* renamed from: c */
    public final boolean m1570c(java.lang.Runnable runnable) {
        return this.f2795a.post(runnable);
    }

    /* renamed from: d */
    public final void m1571d(int i4) {
        p086W.AbstractC0781a.m1416e(i4 != 0);
        this.f2795a.removeMessages(i4);
    }

    /* renamed from: e */
    public final boolean m1572e(int i4) {
        return this.f2795a.sendEmptyMessage(i4);
    }
}
