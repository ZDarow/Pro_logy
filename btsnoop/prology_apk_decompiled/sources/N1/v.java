package N1;

import O1.C0064d;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import d2.C0246i;
import d2.InterfaceC0238a;
import java.util.Locale;
import m0.C0428i;
import m0.C0430k;
import y0.F;

/* loaded from: classes.dex */
public final class v implements InterfaceC0238a, n0.i {

    /* renamed from: l, reason: collision with root package name */
    public long f1316l;

    /* renamed from: m, reason: collision with root package name */
    public long f1317m;

    /* renamed from: n, reason: collision with root package name */
    public int f1318n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1319o;

    /* renamed from: p, reason: collision with root package name */
    public Object f1320p;

    public v(C0060d c0060d, int i4, C0058b c0058b, long j4, long j5) {
        this.f1319o = c0060d;
        this.f1318n = i4;
        this.f1320p = c0058b;
        this.f1316l = j4;
        this.f1317m = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O1.C0064d a(N1.o r4, com.google.android.gms.common.internal.a r5, int r6) {
        /*
            O1.y r5 = r5.f4747F
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            O1.d r5 = r5.f1490o
        L9:
            if (r5 == 0) goto L36
            boolean r1 = r5.f1417m
            if (r1 == 0) goto L36
            int[] r1 = r5.f1419o
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f1421q
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L36
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L36
            r3 = r1[r2]
            if (r3 != r6) goto L33
        L2b:
            int r4 = r4.f1300n
            int r6 = r5.f1420p
            if (r4 >= r6) goto L32
            return r5
        L32:
            return r0
        L33:
            int r2 = r2 + 1
            goto L24
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.v.a(N1.o, com.google.android.gms.common.internal.a, int):O1.d");
    }

    @Override // n0.i
    public void b(long j4, long j5) {
        this.f1316l = j4;
        this.f1317m = j5;
    }

    @Override // n0.i
    public void c(W.r rVar, long j4, int i4, boolean z4) {
        int a4;
        ((F) this.f1320p).getClass();
        int i5 = this.f1318n;
        if (i5 != -1 && i4 != (a4 = C0428i.a(i5))) {
            int i6 = W.y.f2709a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", "Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i4 + ".");
        }
        long K3 = U1.a.K(this.f1317m, j4, this.f1316l, ((C0430k) this.f1319o).f7238b);
        int a5 = rVar.a();
        ((F) this.f1320p).a(rVar, a5, 0);
        ((F) this.f1320p).b(K3, 1, a5, 0, null);
        this.f1318n = i4;
    }

    @Override // n0.i
    public void d(y0.q qVar, int i4) {
        F v4 = qVar.v(i4, 1);
        this.f1320p = v4;
        v4.c(((C0430k) this.f1319o).f7239c);
    }

    @Override // n0.i
    public void e(long j4) {
        this.f1316l = j4;
    }

    @Override // d2.InterfaceC0238a
    public void f(C0246i c0246i) {
        int i4;
        int i5;
        int i6;
        Exception exc;
        int i7;
        long j4;
        int i8;
        if (((C0060d) this.f1319o).a()) {
            O1.i iVar = (O1.i) O1.h.b().f1446a;
            if (iVar == null || iVar.f1448m) {
                o oVar = (o) ((C0060d) this.f1319o).f1275u.get((C0058b) this.f1320p);
                if (oVar != null) {
                    M1.c cVar = oVar.f1290d;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        long j5 = 0;
                        int i9 = 0;
                        boolean z4 = this.f1316l > 0;
                        int i10 = aVar.f4742A;
                        if (iVar != null) {
                            z4 &= iVar.f1449n;
                            int i11 = iVar.f1450o;
                            int i12 = iVar.f1451p;
                            i4 = iVar.f1447l;
                            if (aVar.f4747F != null && !aVar.a()) {
                                C0064d a4 = a(oVar, aVar, this.f1318n);
                                if (a4 == null) {
                                    return;
                                }
                                boolean z5 = a4.f1418n && this.f1316l > 0;
                                i12 = a4.f1420p;
                                z4 = z5;
                            }
                            i6 = i11;
                            i5 = i12;
                        } else {
                            i4 = 0;
                            i5 = 100;
                            i6 = 5000;
                        }
                        C0060d c0060d = (C0060d) this.f1319o;
                        if (c0246i.b()) {
                            i7 = 0;
                        } else {
                            if (c0246i.f4984d) {
                                i9 = 100;
                            } else {
                                synchronized (c0246i.f4981a) {
                                    exc = c0246i.f4986f;
                                }
                                if (exc instanceof M1.d) {
                                    Status status = ((M1.d) exc).f1159l;
                                    i9 = status.f4737l;
                                    L1.a aVar2 = status.f4740o;
                                    if (aVar2 != null) {
                                        i7 = aVar2.f1055m;
                                    }
                                } else {
                                    i9 = 101;
                                }
                            }
                            i7 = -1;
                        }
                        if (z4) {
                            j5 = this.f1316l;
                            long j6 = this.f1317m;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j6);
                            j4 = currentTimeMillis;
                        } else {
                            j4 = 0;
                            i8 = -1;
                        }
                        c0060d.getClass();
                        w wVar = new w(new O1.g(this.f1318n, i9, i7, j5, j4, null, null, i10, i8), i4, i6, i5);
                        W1.f fVar = c0060d.f1277x;
                        fVar.sendMessage(fVar.obtainMessage(18, wVar));
                    }
                }
            }
        }
    }

    public v(C0430k c0430k) {
        this.f1319o = c0430k;
        this.f1316l = -9223372036854775807L;
        this.f1317m = 0L;
        this.f1318n = -1;
    }
}
