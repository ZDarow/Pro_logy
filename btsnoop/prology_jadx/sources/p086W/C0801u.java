package p086W;

/* renamed from: W.u */
/* loaded from: classes.dex */
public final class C0801u {

    /* renamed from: a */
    public android.os.Message f2793a;

    /* renamed from: a */
    public final void m1566a() {
        this.f2793a = null;
        java.util.ArrayList arrayList = p086W.C0802v.f2794b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    /* renamed from: b */
    public final void m1567b() {
        android.os.Message message = this.f2793a;
        message.getClass();
        message.sendToTarget();
        m1566a();
    }
}
