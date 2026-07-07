package p0;

import Q.i;
import T.C0095p;
import T.I;
import W.y;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: e, reason: collision with root package name */
    public final String f7631e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f7632f;

    /* renamed from: g, reason: collision with root package name */
    public int f7633g;

    /* renamed from: h, reason: collision with root package name */
    public String f7634h;

    /* renamed from: i, reason: collision with root package name */
    public long f7635i;

    /* renamed from: j, reason: collision with root package name */
    public String f7636j;

    /* renamed from: k, reason: collision with root package name */
    public String f7637k;

    /* renamed from: l, reason: collision with root package name */
    public int f7638l;

    /* renamed from: m, reason: collision with root package name */
    public int f7639m;

    /* renamed from: n, reason: collision with root package name */
    public int f7640n;

    /* renamed from: o, reason: collision with root package name */
    public int f7641o;

    /* renamed from: p, reason: collision with root package name */
    public String f7642p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f7643q;

    /* renamed from: r, reason: collision with root package name */
    public long f7644r;

    public g(i iVar, String str) {
        super(iVar, str, "StreamIndex");
        this.f7631e = str;
        this.f7632f = new LinkedList();
    }

    @Override // Q.i
    public final void a(Object obj) {
        if (obj instanceof C0095p) {
            this.f7632f.add((C0095p) obj);
        }
    }

    @Override // Q.i
    public final Object b() {
        int i4;
        int i5;
        int i6;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i7;
        long[] jArr;
        int i8;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f7632f;
        C0095p[] c0095pArr = new C0095p[linkedList.size()];
        linkedList.toArray(c0095pArr);
        String str = this.f7637k;
        int i9 = this.f7633g;
        String str2 = this.f7634h;
        long j4 = this.f7635i;
        String str3 = this.f7636j;
        int i10 = this.f7638l;
        int i11 = this.f7639m;
        int i12 = this.f7640n;
        int i13 = this.f7641o;
        String str4 = this.f7642p;
        ArrayList arrayList4 = this.f7643q;
        long j5 = this.f7644r;
        int i14 = y.f2709a;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        if (j4 < 1000000 || j4 % 1000000 != 0) {
            i4 = i11;
            i5 = i12;
            i6 = i10;
            if (j4 >= 1000000 || 1000000 % j4 != 0) {
                int i15 = 0;
                while (i15 < size) {
                    long longValue = ((Long) arrayList4.get(i15)).longValue();
                    if (longValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i7 = size;
                        jArr = jArr3;
                        i8 = i15;
                    } else {
                        if (j4 < longValue || j4 % longValue != 0) {
                            arrayList = arrayList4;
                            if (j4 >= longValue || longValue % j4 != 0) {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i7 = size;
                                jArr = jArr3;
                                i8 = i15;
                                jArr[i8] = y.V(longValue, 1000000L, j4, roundingMode);
                            } else {
                                jArr3[i15] = U1.a.z(1000000L, U1.a.m(longValue, j4, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i15] = U1.a.m(1000000L, U1.a.m(j4, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        }
                        i7 = size;
                        jArr = jArr3;
                        i8 = i15;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i15 = i8 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i7;
                    jArr3 = jArr;
                }
            } else {
                long m4 = U1.a.m(1000000L, j4, RoundingMode.UNNECESSARY);
                for (int i16 = 0; i16 < size; i16++) {
                    jArr3[i16] = U1.a.z(((Long) arrayList4.get(i16)).longValue(), m4);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i4 = i11;
            long m5 = U1.a.m(j4, 1000000L, RoundingMode.UNNECESSARY);
            int i17 = 0;
            while (i17 < size) {
                jArr3[i17] = U1.a.m(((Long) arrayList4.get(i17)).longValue(), m5, roundingMode2);
                i17++;
                i10 = i10;
                i12 = i12;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i5 = i12;
            i6 = i10;
        }
        return new b(this.f7631e, str, i9, str2, j4, str3, i6, i4, i5, i13, str4, c0095pArr, arrayList3, jArr2, y.U(j5, 1000000L, j4, RoundingMode.FLOOR));
    }

    @Override // Q.i
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // Q.i
    public final void k(XmlPullParser xmlPullParser) {
        int i4 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new E0.d("Type", 1);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i4 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw I.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i4 = 3;
                }
            }
            this.f7633g = i4;
            m(Integer.valueOf(i4), "Type");
            if (this.f7633g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new E0.d("Subtype", 1);
                }
                this.f7634h = attributeValue2;
            } else {
                this.f7634h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m(this.f7634h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f7636j = attributeValue3;
            m(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new E0.d("Url", 1);
            }
            this.f7637k = attributeValue4;
            this.f7638l = i.h(xmlPullParser, "MaxWidth");
            this.f7639m = i.h(xmlPullParser, "MaxHeight");
            this.f7640n = i.h(xmlPullParser, "DisplayWidth");
            this.f7641o = i.h(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f7642p = attributeValue5;
            m(attributeValue5, "Language");
            long h4 = i.h(xmlPullParser, "TimeScale");
            this.f7635i = h4;
            if (h4 == -1) {
                this.f7635i = ((Long) c("TimeScale")).longValue();
            }
            this.f7643q = new ArrayList();
            return;
        }
        int size = this.f7643q.size();
        long i5 = i.i(xmlPullParser, "t", -9223372036854775807L);
        if (i5 == -9223372036854775807L) {
            if (size == 0) {
                i5 = 0;
            } else {
                if (this.f7644r == -1) {
                    throw I.b("Unable to infer start time", null);
                }
                i5 = this.f7644r + ((Long) this.f7643q.get(size - 1)).longValue();
            }
        }
        this.f7643q.add(Long.valueOf(i5));
        this.f7644r = i.i(xmlPullParser, "d", -9223372036854775807L);
        long i6 = i.i(xmlPullParser, "r", 1L);
        if (i6 > 1 && this.f7644r == -9223372036854775807L) {
            throw I.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j4 = i4;
            if (j4 >= i6) {
                return;
            }
            this.f7643q.add(Long.valueOf((this.f7644r * j4) + i5));
            i4++;
        }
    }
}
