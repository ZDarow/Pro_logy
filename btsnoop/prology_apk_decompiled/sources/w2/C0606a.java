package w2;

import I.C0044m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u.AbstractC0579g;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606a extends AbstractC0579g {

    /* renamed from: m, reason: collision with root package name */
    public final Map f8902m;

    /* renamed from: n, reason: collision with root package name */
    public final C0044m f8903n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8904o;

    /* JADX WARN: Type inference failed for: r0v1, types: [I.m, java.lang.Object] */
    public C0606a(Map map, boolean z4) {
        super(1);
        this.f8903n = new Object();
        this.f8902m = map;
        this.f8904o = z4;
    }

    @Override // u.AbstractC0579g
    public final Object i(String str) {
        return this.f8902m.get(str);
    }

    @Override // u.AbstractC0579g
    public final String j() {
        return (String) this.f8902m.get("method");
    }

    @Override // u.AbstractC0579g
    public final boolean k() {
        return this.f8904o;
    }

    @Override // u.AbstractC0579g
    public final InterfaceC0608c l() {
        return this.f8903n;
    }

    @Override // u.AbstractC0579g
    public final boolean m() {
        return this.f8902m.containsKey("transactionId");
    }

    public final void p(ArrayList arrayList) {
        if (this.f8904o) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C0044m c0044m = this.f8903n;
        hashMap2.put("code", (String) c0044m.f848m);
        hashMap2.put("message", (String) c0044m.f849n);
        hashMap2.put("data", (HashMap) c0044m.f850o);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void q(ArrayList arrayList) {
        if (this.f8904o) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Serializable) this.f8903n.f847l);
        arrayList.add(hashMap);
    }
}
