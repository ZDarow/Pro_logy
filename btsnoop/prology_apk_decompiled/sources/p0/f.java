package p0;

import Q.i;
import T.C0091l;
import T.C0092m;
import T.C0094o;
import T.C0095p;
import T.I;
import W.y;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f7622e;

    /* renamed from: f, reason: collision with root package name */
    public int f7623f;

    /* renamed from: g, reason: collision with root package name */
    public int f7624g;

    /* renamed from: h, reason: collision with root package name */
    public long f7625h;

    /* renamed from: i, reason: collision with root package name */
    public long f7626i;

    /* renamed from: j, reason: collision with root package name */
    public long f7627j;

    /* renamed from: k, reason: collision with root package name */
    public int f7628k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7629l;

    /* renamed from: m, reason: collision with root package name */
    public C0461a f7630m;

    public f(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f7628k = -1;
        this.f7630m = null;
        this.f7622e = new LinkedList();
    }

    @Override // Q.i
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f7622e.add((b) obj);
        } else if (obj instanceof C0461a) {
            W.a.j(this.f7630m == null);
            this.f7630m = (C0461a) obj;
        }
    }

    @Override // Q.i
    public final Object b() {
        long j4;
        C0461a c0461a;
        long U3;
        long U4;
        boolean z4;
        LinkedList linkedList = this.f7622e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        C0461a c0461a2 = this.f7630m;
        if (c0461a2 != null) {
            C0092m c0092m = new C0092m(new C0091l(c0461a2.f7591a, null, "video/mp4", c0461a2.f7592b));
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = bVarArr[i4];
                int i5 = bVar.f7594a;
                if (i5 == 2 || i5 == 1) {
                    int i6 = 0;
                    while (true) {
                        C0095p[] c0095pArr = bVar.f7603j;
                        if (i6 < c0095pArr.length) {
                            C0094o a4 = c0095pArr[i6].a();
                            a4.f2294p = c0092m;
                            c0095pArr[i6] = new C0095p(a4);
                            i6++;
                        }
                    }
                }
            }
        }
        int i7 = this.f7623f;
        int i8 = this.f7624g;
        long j5 = this.f7625h;
        long j6 = this.f7626i;
        long j7 = this.f7627j;
        int i9 = this.f7628k;
        boolean z5 = this.f7629l;
        C0461a c0461a3 = this.f7630m;
        if (j6 == 0) {
            j4 = j7;
            c0461a = c0461a3;
            U3 = -9223372036854775807L;
        } else {
            int i10 = y.f2709a;
            j4 = j7;
            c0461a = c0461a3;
            U3 = y.U(j6, 1000000L, j5, RoundingMode.FLOOR);
        }
        if (j4 == 0) {
            z4 = z5;
            U4 = -9223372036854775807L;
        } else {
            int i11 = y.f2709a;
            U4 = y.U(j4, 1000000L, j5, RoundingMode.FLOOR);
            z4 = z5;
        }
        return new c(i7, i8, U3, U4, i9, z4, c0461a, bVarArr);
    }

    @Override // Q.i
    public final void k(XmlPullParser xmlPullParser) {
        this.f7623f = i.j(xmlPullParser, "MajorVersion");
        this.f7624g = i.j(xmlPullParser, "MinorVersion");
        this.f7625h = i.i(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new E0.d("Duration", 1);
        }
        try {
            this.f7626i = Long.parseLong(attributeValue);
            this.f7627j = i.i(xmlPullParser, "DVRWindowLength", 0L);
            this.f7628k = i.h(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f7629l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            m(Long.valueOf(this.f7625h), "TimeScale");
        } catch (NumberFormatException e4) {
            throw I.b(null, e4);
        }
    }
}
