package h0;

import W.y;
import android.net.Uri;
import android.os.SystemClock;
import f1.C0271e;
import java.util.HashMap;
import java.util.List;
import t0.C0560b;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a implements q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f5852l;

    public C0315a(c cVar) {
        this.f5852l = cVar;
    }

    @Override // h0.q
    public final void a() {
        this.f5852l.f5868p.remove(this);
    }

    @Override // h0.q
    public final boolean d(Uri uri, B.c cVar, boolean z4) {
        HashMap hashMap;
        b bVar;
        c cVar2 = this.f5852l;
        if (cVar2.w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar2.f5872u;
            int i4 = y.f2709a;
            List list = lVar.f5925e;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar2.f5867o;
                if (i5 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((k) list.get(i5)).f5917a);
                if (bVar2 != null && elapsedRealtime < bVar2.s) {
                    i6++;
                }
                i5++;
            }
            u0.h hVar = new u0.h(1, 0, cVar2.f5872u.f5925e.size(), i6);
            cVar2.f5866n.getClass();
            C0271e d4 = C0560b.d(hVar, cVar);
            if (d4 != null && d4.f5489a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, d4.f5490b);
            }
        }
        return false;
    }
}
