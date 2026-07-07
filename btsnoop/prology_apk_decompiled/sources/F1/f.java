package F1;

import L2.r;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: m, reason: collision with root package name */
    public static f f597m;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f598l = new CopyOnWriteArrayList();

    public static h b(Context context, boolean z4, j jVar) {
        if (z4) {
            return new i(context, jVar);
        }
        try {
            if (L1.d.f1065c.b(context, L1.e.f1066a) == 0) {
                return new e(context, jVar);
            }
        } catch (NoClassDefFoundError unused) {
        }
        return new i(context, jVar);
    }

    @Override // L2.r
    public final boolean a(int i4, int i5, Intent intent) {
        Iterator it = this.f598l.iterator();
        while (it.hasNext()) {
            if (((h) it.next()).c(i4, i5)) {
                return true;
            }
        }
        return false;
    }
}
