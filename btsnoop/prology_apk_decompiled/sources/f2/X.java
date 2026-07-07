package f2;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class X implements e2.j, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final int f5533l;

    public X() {
        r.e("expectedValuesPerKey", 2);
        this.f5533l = 2;
    }

    @Override // e2.j
    public final Object get() {
        return new ArrayList(this.f5533l);
    }
}
