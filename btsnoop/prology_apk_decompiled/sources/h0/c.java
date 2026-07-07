package h0;

import T.C0094o;
import T.C0095p;
import T.H;
import W.y;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import f2.Y;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.C0491x;
import t0.C0560b;

/* loaded from: classes.dex */
public final class c implements u0.i {

    /* renamed from: z, reason: collision with root package name */
    public static final b0.d f5863z = new b0.d(13);

    /* renamed from: l, reason: collision with root package name */
    public final Y f5864l;

    /* renamed from: m, reason: collision with root package name */
    public final p f5865m;

    /* renamed from: n, reason: collision with root package name */
    public final C0560b f5866n;

    /* renamed from: q, reason: collision with root package name */
    public f0.e f5869q;

    /* renamed from: r, reason: collision with root package name */
    public u0.n f5870r;
    public Handler s;

    /* renamed from: t, reason: collision with root package name */
    public g0.m f5871t;

    /* renamed from: u, reason: collision with root package name */
    public l f5872u;

    /* renamed from: v, reason: collision with root package name */
    public Uri f5873v;
    public i w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5874x;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f5868p = new CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f5867o = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public long f5875y = -9223372036854775807L;

    public c(Y y4, C0560b c0560b, p pVar) {
        this.f5864l = y4;
        this.f5865m = pVar;
        this.f5866n = c0560b;
    }

    public final i a(boolean z4, Uri uri) {
        HashMap hashMap = this.f5867o;
        i iVar = ((b) hashMap.get(uri)).f5856o;
        if (iVar != null && z4) {
            if (!uri.equals(this.f5873v)) {
                List list = this.f5872u.f5925e;
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((k) list.get(i4)).f5917a)) {
                        i iVar2 = this.w;
                        if (iVar2 == null || !iVar2.f5907o) {
                            this.f5873v = uri;
                            b bVar = (b) hashMap.get(uri);
                            i iVar3 = bVar.f5856o;
                            if (iVar3 == null || !iVar3.f5907o) {
                                bVar.e(b(uri));
                            } else {
                                this.w = iVar3;
                                this.f5871t.w(iVar3);
                            }
                        }
                    } else {
                        i4++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            i iVar4 = bVar2.f5856o;
            if (!bVar2.f5862v) {
                bVar2.f5862v = true;
                if (iVar4 != null && !iVar4.f5907o) {
                    bVar2.c(true);
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.w;
        if (iVar == null || !iVar.f5913v.f5895e || (eVar = (e) iVar.f5911t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f5878b));
        int i4 = eVar.f5879c;
        if (i4 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i4));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i4;
        b bVar = (b) this.f5867o.get(uri);
        if (bVar.f5856o == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, y.Z(bVar.f5856o.f5912u));
        i iVar = bVar.f5856o;
        return iVar.f5907o || (i4 = iVar.f5896d) == 2 || i4 == 1 || bVar.f5857p + max > elapsedRealtime;
    }

    @Override // u0.i
    public final void k(u0.k kVar, long j4, long j5) {
        l lVar;
        u0.q qVar = (u0.q) kVar;
        m mVar = (m) qVar.f8550q;
        boolean z4 = mVar instanceof i;
        if (z4) {
            String str = mVar.f5932a;
            l lVar2 = l.f5923l;
            Uri parse = Uri.parse(str);
            C0094o c0094o = new C0094o();
            c0094o.f2279a = "0";
            c0094o.f2289k = H.l("application/x-mpegURL");
            lVar = new l("", Collections.emptyList(), Collections.singletonList(new k(parse, new C0095p(c0094o), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar = (l) mVar;
        }
        this.f5872u = lVar;
        this.f5873v = ((k) lVar.f5925e.get(0)).f5917a;
        this.f5868p.add(new C0315a(this));
        List list = lVar.f5924d;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Uri uri = (Uri) list.get(i4);
            this.f5867o.put(uri, new b(this, uri));
        }
        Uri uri2 = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        b bVar = (b) this.f5867o.get(this.f5873v);
        if (z4) {
            bVar.f((i) mVar, c0491x);
        } else {
            bVar.c(false);
        }
        this.f5866n.getClass();
        this.f5869q.e(c0491x, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.C0271e q(u0.k r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            u0.q r5 = (u0.q) r5
            q0.x r7 = new q0.x
            long r0 = r5.f8545l
            Y.B r0 = r5.f8548o
            android.net.Uri r0 = r0.f2990n
            r7.<init>(r8)
            t0.b r8 = r4.f5866n
            r8.getClass()
            boolean r8 = r10 instanceof T.I
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof Y.t
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof u0.m
            if (r8 != 0) goto L4c
            int r8 = Y.i.f3014m
            r8 = r10
        L2c:
            if (r8 == 0) goto L41
            boolean r2 = r8 instanceof Y.i
            if (r2 == 0) goto L3c
            r2 = r8
            Y.i r2 = (Y.i) r2
            int r2 = r2.f3015l
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L3c
            goto L4c
        L3c:
            java.lang.Throwable r8 = r8.getCause()
            goto L2c
        L41:
            int r11 = r11 - r9
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r2 = (long) r8
            goto L4d
        L4c:
            r2 = r0
        L4d:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L53
        L52:
            r9 = r6
        L53:
            f0.e r8 = r4.f5869q
            int r5 = r5.f8547n
            r8.i(r7, r5, r10, r9)
            if (r9 == 0) goto L5f
            f1.e r5 = u0.n.f8541q
            goto L64
        L5f:
            f1.e r5 = new f1.e
            r5.<init>(r6, r2, r6)
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c.q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // u0.i
    public final void x(u0.k kVar, long j4, long j5, boolean z4) {
        u0.q qVar = (u0.q) kVar;
        long j6 = qVar.f8545l;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f5866n.getClass();
        this.f5869q.c(c0491x, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
