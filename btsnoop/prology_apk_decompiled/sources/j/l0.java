package j;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6708a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6709b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6710c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6711d;

    public Bundle a(String str) {
        if (!this.f6709b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f6711d;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f6711d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f6711d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f6711d = null;
        }
        return bundle2;
    }
}
