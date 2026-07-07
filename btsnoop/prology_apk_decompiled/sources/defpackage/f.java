package defpackage;

import L2.t;
import L2.u;
import java.nio.ByteBuffer;
import java.util.List;
import k3.h;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class f extends u {
    @Override // L2.u
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        h.e(byteBuffer, "buffer");
        if (b4 == -127) {
            Object e4 = e(byteBuffer);
            List list = e4 instanceof List ? (List) e4 : null;
            if (list != null) {
                return new b((Boolean) list.get(0));
            }
            return null;
        }
        if (b4 != -126) {
            return super.f(b4, byteBuffer);
        }
        Object e5 = e(byteBuffer);
        List list2 = e5 instanceof List ? (List) e5 : null;
        if (list2 != null) {
            return new a((Boolean) list2.get(0));
        }
        return null;
    }

    @Override // L2.u
    public final void k(t tVar, Object obj) {
        if (obj instanceof b) {
            tVar.write(129);
            k(tVar, AbstractC0462a.E(((b) obj).f4322a));
        } else if (!(obj instanceof a)) {
            super.k(tVar, obj);
        } else {
            tVar.write(130);
            k(tVar, AbstractC0462a.E(((a) obj).f3187a));
        }
    }
}
