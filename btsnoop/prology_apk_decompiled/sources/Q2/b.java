package Q2;

import L2.t;
import L2.u;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends u {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1708d = new Object();

    @Override // L2.u
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        if (b4 != -127) {
            return super.f(b4, byteBuffer);
        }
        Object e4 = e(byteBuffer);
        if (e4 == null) {
            return null;
        }
        return c.values()[((Long) e4).intValue()];
    }

    @Override // L2.u
    public final void k(t tVar, Object obj) {
        if (!(obj instanceof c)) {
            super.k(tVar, obj);
        } else {
            tVar.write(129);
            k(tVar, obj == null ? null : Integer.valueOf(((c) obj).f1710l));
        }
    }
}
