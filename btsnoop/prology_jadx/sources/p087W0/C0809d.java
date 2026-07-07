package p087W0;

/* renamed from: W0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0809d implements java.util.Comparator {

    /* renamed from: l */
    public final /* synthetic */ int f2854l;

    public /* synthetic */ C0809d(int i4) {
        this.f2854l = i4;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f2854l) {
            case 0:
                return java.lang.Integer.compare(((p087W0.C0810e) obj2).f2857b, ((p087W0.C0810e) obj).f2857b);
            case 1:
                p122e0.C1301b c1301b = (p122e0.C1301b) obj;
                p122e0.C1301b c1301b2 = (p122e0.C1301b) obj2;
                int compare = java.lang.Integer.compare(c1301b.f5215c, c1301b2.f5215c);
                return compare != 0 ? compare : c1301b.f5214b.compareTo(c1301b2.f5214b);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Integer.compare(((p118d1.C1276e) obj).f5137a.f5140b, ((p118d1.C1276e) obj2).f5137a.f5140b);
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Long.compare(((p118d1.C1275d) obj).f5134b, ((p118d1.C1275d) obj2).f5134b);
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return p043K2.C0327c.m720b(((p161m0.C1853j) obj).f7508a.f7504c, ((p161m0.C1853j) obj2).f7508a.f7504c);
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return ((p076T.C0702p) obj2).f2404i - ((p076T.C0702p) obj).f2404i;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                java.lang.Integer num2 = (java.lang.Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Integer.compare(((p193t0.C2170h) ((java.util.List) obj).get(0)).f8657q, ((p193t0.C2170h) ((java.util.List) obj2).get(0)).f8657q);
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return ((p193t0.C2169g) java.util.Collections.max((java.util.List) obj)).compareTo((p193t0.C2169g) java.util.Collections.max((java.util.List) obj2));
            case 9:
                java.util.List list = (java.util.List) obj;
                java.util.List list2 = (java.util.List) obj2;
                return p129f2.C1451x.m3258f(p193t0.C2178p.m4295c((p193t0.C2178p) java.util.Collections.max(list, new p087W0.C0809d(11)), (p193t0.C2178p) java.util.Collections.max(list2, new p087W0.C0809d(11)))).mo3259a(list.size(), list2.size()).mo3260b((p193t0.C2178p) java.util.Collections.max(list, new p087W0.C0809d(12)), (p193t0.C2178p) java.util.Collections.max(list2, new p087W0.C0809d(12)), new p087W0.C0809d(12)).mo3263e();
            case 10:
                return ((p193t0.C2175m) ((java.util.List) obj).get(0)).compareTo((p193t0.C2175m) ((java.util.List) obj2).get(0));
            case 11:
                return p193t0.C2178p.m4295c((p193t0.C2178p) obj, (p193t0.C2178p) obj2);
            case 12:
                p193t0.C2178p c2178p = (p193t0.C2178p) obj;
                p193t0.C2178p c2178p2 = (p193t0.C2178p) obj2;
                p129f2.AbstractC1413b0 mo3204a = (c2178p.f8697p && c2178p.f8700s) ? p193t0.C2179q.f8708j : p193t0.C2179q.f8708j.mo3204a();
                p129f2.C1451x c1451x = p129f2.AbstractC1453z.f5826a;
                c2178p.f8698q.getClass();
                return c1451x.mo3260b(java.lang.Integer.valueOf(c2178p.f8703v), java.lang.Integer.valueOf(c2178p2.f8703v), mo3204a).mo3260b(java.lang.Integer.valueOf(c2178p.f8702u), java.lang.Integer.valueOf(c2178p2.f8702u), mo3204a).mo3263e();
            case 13:
                return ((p197u0.C2231r) obj).f8893a - ((p197u0.C2231r) obj2).f8893a;
            case 14:
                return java.lang.Float.compare(((p197u0.C2231r) obj).f8895c, ((p197u0.C2231r) obj2).f8895c);
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
