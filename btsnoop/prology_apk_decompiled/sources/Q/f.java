package Q;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final String f1517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1519c;

    /* renamed from: d, reason: collision with root package name */
    public final K2.o f1520d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1521e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public B1.d f1522f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f1523g;

    public f(t tVar, String str, int i4, int i5, K2.o oVar) {
        this.f1523g = tVar;
        this.f1517a = str;
        this.f1518b = i4;
        this.f1519c = i5;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            A.a.s(i4, i5, str);
        }
        this.f1520d = oVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f1523g.f1575q.post(new F.b(6, this));
    }
}
