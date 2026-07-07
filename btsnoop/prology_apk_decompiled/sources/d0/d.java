package d0;

import T.I;
import W.y;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.C0159k;
import e0.C0251c;
import java.io.IOException;
import q0.C0491x;
import u0.q;
import v0.AbstractC0587a;

/* loaded from: classes.dex */
public final class d implements u0.i, u0.o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4836l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f4837m;

    public /* synthetic */ d(g gVar, int i4) {
        this.f4836l = i4;
        this.f4837m = gVar;
    }

    @Override // u0.o
    public void a() {
        g gVar = this.f4837m;
        gVar.f4859L.a();
        C0159k c0159k = gVar.f4861N;
        if (c0159k != null) {
            throw c0159k;
        }
    }

    public void b() {
        long j4;
        g gVar = this.f4837m;
        synchronized (AbstractC0587a.f8656b) {
            try {
                j4 = AbstractC0587a.f8657c ? AbstractC0587a.f8658d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.f4870W = j4;
        gVar.A(true);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v10, types: [u0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [u0.p, java.lang.Object] */
    @Override // u0.i
    public void k(u0.k kVar, long j4, long j5) {
        switch (this.f4836l) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                q qVar = (q) kVar;
                g gVar = this.f4837m;
                gVar.getClass();
                long j6 = qVar.f8545l;
                Uri uri = qVar.f8548o.f2990n;
                C0491x c0491x = new C0491x(j5);
                gVar.f4878x.getClass();
                gVar.f4850B.e(c0491x, qVar.f8547n);
                C0251c c0251c = (C0251c) qVar.f8550q;
                C0251c c0251c2 = gVar.f4866S;
                int size = c0251c2 == null ? 0 : c0251c2.f5041m.size();
                long j7 = c0251c.b(0).f5062b;
                int i4 = 0;
                while (i4 < size && gVar.f4866S.b(i4).f5062b < j7) {
                    i4++;
                }
                if (c0251c.f5032d) {
                    if (size - i4 > c0251c.f5041m.size()) {
                        W.a.A("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j8 = gVar.f4872Y;
                        if (j8 == -9223372036854775807L || c0251c.f5036h * 1000 > j8) {
                            gVar.f4871X = 0;
                        } else {
                            W.a.A("DashMediaSource", "Loaded stale dynamic manifest: " + c0251c.f5036h + ", " + gVar.f4872Y);
                        }
                    }
                    int i5 = gVar.f4871X;
                    gVar.f4871X = i5 + 1;
                    if (i5 < gVar.f4878x.e(qVar.f8547n)) {
                        gVar.f4862O.postDelayed(gVar.f4855G, Math.min((gVar.f4871X - 1) * 1000, 5000));
                        return;
                    } else {
                        gVar.f4861N = new IOException();
                        return;
                    }
                }
                gVar.f4866S = c0251c;
                gVar.f4867T = c0251c.f5032d & gVar.f4867T;
                gVar.f4868U = j4 - j5;
                gVar.f4869V = j4;
                gVar.f4873Z += i4;
                synchronized (gVar.f4853E) {
                    try {
                        if (qVar.f8546m.f3029a == gVar.f4864Q) {
                            Uri uri2 = gVar.f4866S.f5039k;
                            if (uri2 == null) {
                                uri2 = qVar.f8548o.f2990n;
                            }
                            gVar.f4864Q = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0251c c0251c3 = gVar.f4866S;
                if (!c0251c3.f5032d || gVar.f4870W != -9223372036854775807L) {
                    gVar.A(true);
                    return;
                }
                F1.a aVar = c0251c3.f5037i;
                if (aVar == null) {
                    gVar.w();
                    return;
                }
                String str = aVar.f573b;
                if (y.a(str, "urn:mpeg:dash:utc:direct:2014") || y.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        gVar.f4870W = y.P(aVar.f574c) - gVar.f4869V;
                        gVar.A(true);
                        return;
                    } catch (I e4) {
                        gVar.z(e4);
                        return;
                    }
                }
                if (y.a(str, "urn:mpeg:dash:utc:http-iso:2014") || y.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    q qVar2 = new q(gVar.f4858K, Uri.parse(aVar.f574c), 5, new Object());
                    gVar.f4850B.k(new C0491x(qVar2.f8545l, qVar2.f8546m, gVar.f4859L.f(qVar2, new d(gVar, 4), 1)), qVar2.f8547n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (y.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || y.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    q qVar3 = new q(gVar.f4858K, Uri.parse(aVar.f574c), 5, new Object());
                    gVar.f4850B.k(new C0491x(qVar3.f8545l, qVar3.f8546m, gVar.f4859L.f(qVar3, new d(gVar, 4), 1)), qVar3.f8547n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (y.a(str, "urn:mpeg:dash:utc:ntp:2014") || y.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    gVar.w();
                    return;
                } else {
                    gVar.z(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            default:
                q qVar4 = (q) kVar;
                g gVar2 = this.f4837m;
                gVar2.getClass();
                long j9 = qVar4.f8545l;
                Uri uri3 = qVar4.f8548o.f2990n;
                C0491x c0491x2 = new C0491x(j5);
                gVar2.f4878x.getClass();
                gVar2.f4850B.e(c0491x2, qVar4.f8547n);
                gVar2.f4870W = ((Long) qVar4.f8550q).longValue() - j4;
                gVar2.A(true);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f1.C0271e q(u0.k r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            r7 = 0
            r8 = 1
            d0.g r0 = r5.f4837m
            int r1 = r5.f4836l
            switch(r1) {
                case 2: goto L2b;
                default: goto L9;
            }
        L9:
            u0.q r6 = (u0.q) r6
            r0.getClass()
            q0.x r7 = new q0.x
            long r1 = r6.f8545l
            Y.B r12 = r6.f8548o
            android.net.Uri r12 = r12.f2990n
            r7.<init>(r9)
            int r6 = r6.f8547n
            f0.e r9 = r0.f4850B
            r9.i(r7, r6, r11, r8)
            t0.b r6 = r0.f4878x
            r6.getClass()
            r0.z(r11)
            f1.e r6 = u0.n.f8540p
            return r6
        L2b:
            u0.q r6 = (u0.q) r6
            r0.getClass()
            q0.x r1 = new q0.x
            long r2 = r6.f8545l
            Y.B r2 = r6.f8548o
            android.net.Uri r2 = r2.f2990n
            r1.<init>(r9)
            t0.b r9 = r0.f4878x
            r9.getClass()
            boolean r9 = r11 instanceof T.I
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof java.io.FileNotFoundException
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof Y.t
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof u0.m
            if (r9 != 0) goto L78
            int r9 = Y.i.f3014m
            r9 = r11
        L58:
            if (r9 == 0) goto L6d
            boolean r10 = r9 instanceof Y.i
            if (r10 == 0) goto L68
            r10 = r9
            Y.i r10 = (Y.i) r10
            int r10 = r10.f3015l
            r4 = 2008(0x7d8, float:2.814E-42)
            if (r10 != r4) goto L68
            goto L78
        L68:
            java.lang.Throwable r9 = r9.getCause()
            goto L58
        L6d:
            int r12 = r12 - r8
            int r12 = r12 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r12, r9)
            long r9 = (long) r9
            goto L79
        L78:
            r9 = r2
        L79:
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 != 0) goto L80
            f1.e r7 = u0.n.f8541q
            goto L86
        L80:
            f1.e r12 = new f1.e
            r12.<init>(r7, r9, r7)
            r7 = r12
        L86:
            boolean r9 = r7.a()
            r8 = r8 ^ r9
            f0.e r9 = r0.f4850B
            int r6 = r6.f8547n
            r9.i(r1, r6, r11, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d.q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // u0.i
    public void x(u0.k kVar, long j4, long j5, boolean z4) {
        switch (this.f4836l) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f4837m.y((q) kVar, j4, j5);
                return;
            default:
                this.f4837m.y((q) kVar, j4, j5);
                return;
        }
    }
}
