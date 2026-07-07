package W0;

import L.k;
import T.C0095p;
import d1.C0234d;
import d1.C0235e;
import e0.C0250b;
import f2.AbstractC0303z;
import f2.C0301x;
import f2.b0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m0.C0429j;
import t0.C0565g;
import t0.C0566h;
import t0.m;
import t0.p;
import t0.q;
import u0.r;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2760l;

    public /* synthetic */ d(int i4) {
        this.f2760l = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2760l) {
            case 0:
                return Integer.compare(((e) obj2).f2763b, ((e) obj).f2763b);
            case 1:
                C0250b c0250b = (C0250b) obj;
                C0250b c0250b2 = (C0250b) obj2;
                int compare = Integer.compare(c0250b.f5027c, c0250b2.f5027c);
                return compare != 0 ? compare : c0250b.f5026b.compareTo(c0250b2.f5026b);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.compare(((C0235e) obj).f4950a.f4953b, ((C0235e) obj2).f4950a.f4953b);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return Long.compare(((C0234d) obj).f4947b, ((C0234d) obj2).f4947b);
            case k.LONG_FIELD_NUMBER /* 4 */:
                return K2.c.b(((C0429j) obj).f7235a.f7231c, ((C0429j) obj2).f7235a.f7231c);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return ((C0095p) obj2).f2321i - ((C0095p) obj).f2321i;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.compare(((C0566h) ((List) obj).get(0)).f8333q, ((C0566h) ((List) obj2).get(0)).f8333q);
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return ((C0565g) Collections.max((List) obj)).compareTo((C0565g) Collections.max((List) obj2));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0301x.f(p.c((p) Collections.max(list, new d(11)), (p) Collections.max(list2, new d(11)))).a(list.size(), list2.size()).b((p) Collections.max(list, new d(12)), (p) Collections.max(list2, new d(12)), new d(12)).e();
            case 10:
                return ((m) ((List) obj).get(0)).compareTo((m) ((List) obj2).get(0));
            case 11:
                return p.c((p) obj, (p) obj2);
            case 12:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                b0 a4 = (pVar.f8367p && pVar.s) ? q.f8376j : q.f8376j.a();
                C0301x c0301x = AbstractC0303z.f5630a;
                pVar.f8368q.getClass();
                return c0301x.b(Integer.valueOf(pVar.f8372v), Integer.valueOf(pVar2.f8372v), a4).b(Integer.valueOf(pVar.f8371u), Integer.valueOf(pVar2.f8371u), a4).e();
            case 13:
                return ((r) obj).f8551a - ((r) obj2).f8551a;
            case 14:
                return Float.compare(((r) obj).f8553c, ((r) obj2).f8553c);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b4 = bArr[i4];
                    byte b5 = bArr2[i4];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
        }
    }
}
