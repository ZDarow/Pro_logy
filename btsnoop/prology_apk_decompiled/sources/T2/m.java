package T2;

import B2.AbstractC0007h;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m implements L2.i {

    /* renamed from: l, reason: collision with root package name */
    public final k f2454l;

    @Override // L2.i
    public void E() {
        k kVar = this.f2454l;
        kVar.f2448a = null;
        kVar.a();
    }

    @Override // L2.i
    public void H(Object obj, L2.h hVar) {
        k kVar = this.f2454l;
        kVar.f2448a = hVar;
        kVar.a();
    }

    public void a(long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(j4))));
        this.f2454l.b(hashMap);
    }

    public void b(int i4, int i5, long j4, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "initialized");
        AbstractC0007h.p(i4, hashMap, "width", i5, "height");
        hashMap.put("duration", Long.valueOf(j4));
        if (i6 != 0) {
            hashMap.put("rotationCorrection", Integer.valueOf(i6));
        }
        this.f2454l.b(hashMap);
    }
}
