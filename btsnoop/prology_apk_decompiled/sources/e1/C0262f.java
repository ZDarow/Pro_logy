package e1;

import T.C0094o;
import T.C0095p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262f {

    /* renamed from: a, reason: collision with root package name */
    public final int f5198a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5199b;

    public C0262f(int i4, List list) {
        this.f5198a = i4;
        this.f5199b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e1.H a(int r6, W.p r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0262f.a(int, W.p):e1.H");
    }

    public List b(W.p pVar) {
        String str;
        int i4;
        boolean c4 = c(32);
        List list = this.f5199b;
        if (c4) {
            return list;
        }
        W.r rVar = new W.r((byte[]) pVar.f2685d);
        while (rVar.a() > 0) {
            int u4 = rVar.u();
            int u5 = rVar.f2695b + rVar.u();
            if (u4 == 134) {
                ArrayList arrayList = new ArrayList();
                int u6 = rVar.u() & 31;
                for (int i5 = 0; i5 < u6; i5++) {
                    String s = rVar.s(3, e2.d.f5436c);
                    int u7 = rVar.u();
                    boolean z4 = (u7 & 128) != 0;
                    if (z4) {
                        i4 = u7 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i4 = 1;
                    }
                    byte u8 = (byte) rVar.u();
                    rVar.H(1);
                    List singletonList = z4 ? Collections.singletonList((u8 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C0094o c0094o = new C0094o();
                    c0094o.f2290l = T.H.l(str);
                    c0094o.f2282d = s;
                    c0094o.f2274E = i4;
                    c0094o.f2293o = singletonList;
                    arrayList.add(new C0095p(c0094o));
                }
                list = arrayList;
            }
            rVar.G(u5);
        }
        return list;
    }

    public boolean c(int i4) {
        return (i4 & this.f5198a) != 0;
    }

    public C0262f() {
        this.f5198a = 1;
        this.f5199b = Collections.singletonList(null);
    }

    public C0262f(ArrayList arrayList) {
        this.f5198a = 0;
        this.f5199b = arrayList;
    }
}
