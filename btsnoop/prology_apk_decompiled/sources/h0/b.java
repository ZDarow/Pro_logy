package h0;

import W.y;
import Y.w;
import android.net.Uri;
import android.os.SystemClock;
import f1.C0271e;
import f2.I;
import f2.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import q0.C0491x;
import t0.C0560b;

/* loaded from: classes.dex */
public final class b implements u0.i {

    /* renamed from: l, reason: collision with root package name */
    public final Uri f5853l;

    /* renamed from: m, reason: collision with root package name */
    public final u0.n f5854m = new u0.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: n, reason: collision with root package name */
    public final Y.h f5855n;

    /* renamed from: o, reason: collision with root package name */
    public i f5856o;

    /* renamed from: p, reason: collision with root package name */
    public long f5857p;

    /* renamed from: q, reason: collision with root package name */
    public long f5858q;

    /* renamed from: r, reason: collision with root package name */
    public long f5859r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5860t;

    /* renamed from: u, reason: collision with root package name */
    public IOException f5861u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5862v;
    public final /* synthetic */ c w;

    public b(c cVar, Uri uri) {
        this.w = cVar;
        this.f5853l = uri;
        this.f5855n = ((Y.g) cVar.f5864l.f5535m).a();
    }

    public static boolean a(b bVar, long j4) {
        bVar.s = SystemClock.elapsedRealtime() + j4;
        c cVar = bVar.w;
        if (!bVar.f5853l.equals(cVar.f5873v)) {
            return false;
        }
        List list = cVar.f5872u.f5925e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar2 = (b) cVar.f5867o.get(((k) list.get(i4)).f5917a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.s) {
                Uri uri = bVar2.f5853l;
                cVar.f5873v = uri;
                bVar2.e(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        i iVar = this.f5856o;
        Uri uri = this.f5853l;
        if (iVar != null) {
            h hVar = iVar.f5913v;
            if (hVar.f5891a != -9223372036854775807L || hVar.f5895e) {
                Uri.Builder buildUpon = uri.buildUpon();
                i iVar2 = this.f5856o;
                if (iVar2.f5913v.f5895e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar2.f5903k + iVar2.f5910r.size()));
                    i iVar3 = this.f5856o;
                    if (iVar3.f5906n != -9223372036854775807L) {
                        I i4 = iVar3.s;
                        int size = i4.size();
                        if (!i4.isEmpty() && ((d) r.l(i4)).f5876x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                h hVar2 = this.f5856o.f5913v;
                if (hVar2.f5891a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", hVar2.f5892b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z4) {
        e(z4 ? b() : this.f5853l);
    }

    public final void d(Uri uri) {
        c cVar = this.w;
        u0.q qVar = new u0.q(this.f5855n, uri, 4, cVar.f5865m.j(cVar.f5872u, this.f5856o));
        C0560b c0560b = cVar.f5866n;
        int i4 = qVar.f8547n;
        cVar.f5869q.k(new C0491x(qVar.f8545l, qVar.f8546m, this.f5854m.f(qVar, this, c0560b.e(i4))), i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.s = 0L;
        if (this.f5860t) {
            return;
        }
        u0.n nVar = this.f5854m;
        if (nVar.d() || nVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.f5859r;
        if (elapsedRealtime >= j4) {
            d(uri);
        } else {
            this.f5860t = true;
            this.w.s.postDelayed(new W.m(7, this, uri), j4 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(h0.i r65, q0.C0491x r66) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f(h0.i, q0.x):void");
    }

    @Override // u0.i
    public final void k(u0.k kVar, long j4, long j5) {
        u0.q qVar = (u0.q) kVar;
        m mVar = (m) qVar.f8550q;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        if (mVar instanceof i) {
            f((i) mVar, c0491x);
            this.w.f5869q.e(c0491x, 4);
        } else {
            T.I b4 = T.I.b("Loaded playlist has unexpected type.", null);
            this.f5861u = b4;
            this.w.f5869q.i(c0491x, 4, b4, true);
        }
        this.w.f5866n.getClass();
    }

    @Override // u0.i
    public final C0271e q(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f8545l;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        boolean z4 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z5 = iOException instanceof n;
        C0271e c0271e = u0.n.f8540p;
        c cVar = this.w;
        int i5 = qVar.f8547n;
        if (z4 || z5) {
            int i6 = iOException instanceof w ? ((w) iOException).f3063o : Integer.MAX_VALUE;
            if (z5 || i6 == 400 || i6 == 503) {
                this.f5859r = SystemClock.elapsedRealtime();
                c(false);
                f0.e eVar = cVar.f5869q;
                int i7 = y.f2709a;
                eVar.i(c0491x, i5, iOException, true);
                return c0271e;
            }
        }
        B.c cVar2 = new B.c(i4, iOException);
        Iterator it = cVar.f5868p.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= !((q) it.next()).d(this.f5853l, cVar2, false);
        }
        C0560b c0560b = cVar.f5866n;
        if (z6) {
            c0560b.getClass();
            long f4 = C0560b.f(cVar2);
            c0271e = f4 != -9223372036854775807L ? new C0271e(0, f4, false) : u0.n.f8541q;
        }
        boolean a4 = c0271e.a();
        cVar.f5869q.i(c0491x, i5, iOException, true ^ a4);
        if (!a4) {
            c0560b.getClass();
        }
        return c0271e;
    }

    @Override // u0.i
    public final void x(u0.k kVar, long j4, long j5, boolean z4) {
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f8545l;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        c cVar = this.w;
        cVar.f5866n.getClass();
        cVar.f5869q.c(c0491x, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
