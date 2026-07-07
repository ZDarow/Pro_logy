package O;

import L.k;
import f2.G;
import f2.I;
import f2.c0;
import f2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import s0.InterfaceC0539a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0539a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1349a;

    public g(int i4) {
        switch (i4) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f1349a = new ArrayList();
                return;
            default:
                this.f1349a = new ArrayList();
                new HashMap();
                new HashMap();
                return;
        }
    }

    @Override // s0.InterfaceC0539a
    public I a(long j4) {
        int g4 = g(j4);
        if (g4 == 0) {
            G g5 = I.f5510m;
            return c0.f5550p;
        }
        V0.a aVar = (V0.a) this.f1349a.get(g4 - 1);
        long j5 = aVar.f2599d;
        if (j5 == -9223372036854775807L || j4 < j5) {
            return aVar.f2596a;
        }
        G g6 = I.f5510m;
        return c0.f5550p;
    }

    @Override // s0.InterfaceC0539a
    public long b(long j4) {
        ArrayList arrayList = this.f1349a;
        if (arrayList.isEmpty() || j4 < ((V0.a) arrayList.get(0)).f2597b) {
            return -9223372036854775807L;
        }
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            long j5 = ((V0.a) arrayList.get(i4)).f2597b;
            if (j4 == j5) {
                return j5;
            }
            if (j4 < j5) {
                V0.a aVar = (V0.a) arrayList.get(i4 - 1);
                long j6 = aVar.f2599d;
                return (j6 == -9223372036854775807L || j6 > j4) ? aVar.f2597b : j6;
            }
        }
        V0.a aVar2 = (V0.a) r.l(arrayList);
        long j7 = aVar2.f2599d;
        return (j7 == -9223372036854775807L || j4 < j7) ? aVar2.f2597b : j7;
    }

    @Override // s0.InterfaceC0539a
    public long c(long j4) {
        ArrayList arrayList = this.f1349a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j4 < ((V0.a) arrayList.get(0)).f2597b) {
            return ((V0.a) arrayList.get(0)).f2597b;
        }
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            V0.a aVar = (V0.a) arrayList.get(i4);
            if (j4 < aVar.f2597b) {
                long j5 = ((V0.a) arrayList.get(i4 - 1)).f2599d;
                long j6 = aVar.f2597b;
                return (j5 == -9223372036854775807L || j5 <= j4 || j5 >= j6) ? j6 : j5;
            }
        }
        long j7 = ((V0.a) r.l(arrayList)).f2599d;
        if (j7 == -9223372036854775807L || j4 >= j7) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // s0.InterfaceC0539a
    public void clear() {
        this.f1349a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // s0.InterfaceC0539a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(V0.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f2597b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            W.a.e(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f2599d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f1349a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            V0.a r7 = (V0.a) r7
            long r7 = r7.f2597b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            V0.a r7 = (V0.a) r7
            long r7 = r7.f2597b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.d(V0.a, long):boolean");
    }

    @Override // s0.InterfaceC0539a
    public void e(long j4) {
        int g4 = g(j4);
        if (g4 > 0) {
            this.f1349a.subList(0, g4).clear();
        }
    }

    public List f() {
        ArrayList arrayList;
        if (this.f1349a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1349a) {
            arrayList = new ArrayList(this.f1349a);
        }
        return arrayList;
    }

    public int g(long j4) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f1349a;
            if (i4 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j4 < ((V0.a) arrayList.get(i4)).f2597b) {
                return i4;
            }
            i4++;
        }
    }
}
