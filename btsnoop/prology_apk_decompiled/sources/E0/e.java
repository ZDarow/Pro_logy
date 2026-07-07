package E0;

import L.k;
import T.B;
import T.O;
import T.T;
import android.content.Context;
import android.support.v4.media.session.t;
import android.view.View;
import java.util.LinkedHashMap;
import k1.l;
import k1.s;
import q0.InterfaceC0468E;

/* loaded from: classes.dex */
public abstract class e implements O {

    /* renamed from: a, reason: collision with root package name */
    public Object f527a;

    public static e b(s sVar, int i4) {
        if (i4 == 0) {
            return new l(sVar, 0);
        }
        if (i4 == 1) {
            return new l(sVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(t tVar);

    public String c() {
        return null;
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract B g();

    public abstract InterfaceC0468E h(Context context);

    public abstract int i();

    public abstract int j();

    public abstract void k(int i4, long j4, boolean z4);

    public e(int i4) {
        switch (i4) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f527a = new T();
                return;
            default:
                this.f527a = new LinkedHashMap();
                return;
        }
    }
}
