package e0;

import T.C0095p;
import android.net.Uri;
import f2.I;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: q, reason: collision with root package name */
    public final j f5075q;

    /* renamed from: r, reason: collision with root package name */
    public final K2.o f5076r;

    public l(long j4, C0095p c0095p, I i4, r rVar, ArrayList arrayList) {
        super(c0095p, i4, rVar, arrayList);
        Uri.parse(((C0250b) i4.get(0)).f5025a);
        long j5 = rVar.f5095e;
        j jVar = j5 <= 0 ? null : new j(rVar.f5094d, j5, null);
        this.f5075q = jVar;
        this.f5076r = jVar == null ? new K2.o(25, new j(0L, -1L, null)) : null;
    }

    @Override // e0.m
    public final String b() {
        return null;
    }

    @Override // e0.m
    public final d0.h d() {
        return this.f5076r;
    }

    @Override // e0.m
    public final j e() {
        return this.f5075q;
    }
}
