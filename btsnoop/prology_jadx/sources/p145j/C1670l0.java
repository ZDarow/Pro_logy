package p145j;

/* renamed from: j.l0 */
/* loaded from: classes.dex */
public final class C1670l0 {

    /* renamed from: a */
    public boolean f6966a;

    /* renamed from: b */
    public boolean f6967b;

    /* renamed from: c */
    public java.lang.Object f6968c;

    /* renamed from: d */
    public java.lang.Object f6969d;

    /* renamed from: a */
    public android.os.Bundle m3611a(java.lang.String str) {
        if (!this.f6967b) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        android.os.Bundle bundle = (android.os.Bundle) this.f6969d;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle.getBundle(str);
        android.os.Bundle bundle3 = (android.os.Bundle) this.f6969d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        android.os.Bundle bundle4 = (android.os.Bundle) this.f6969d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f6969d = null;
        }
        return bundle2;
    }
}
