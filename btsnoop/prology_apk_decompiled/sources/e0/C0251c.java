package e0;

import T.C0101w;
import T.P;
import W.y;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import l0.InterfaceC0402a;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251c implements InterfaceC0402a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5029a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5030b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5031c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5032d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5033e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5034f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5035g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5036h;

    /* renamed from: i, reason: collision with root package name */
    public final F1.a f5037i;

    /* renamed from: j, reason: collision with root package name */
    public final C0101w f5038j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f5039k;

    /* renamed from: l, reason: collision with root package name */
    public final i f5040l;

    /* renamed from: m, reason: collision with root package name */
    public final List f5041m;

    public C0251c(long j4, long j5, long j6, boolean z4, long j7, long j8, long j9, long j10, i iVar, F1.a aVar, C0101w c0101w, Uri uri, ArrayList arrayList) {
        this.f5029a = j4;
        this.f5030b = j5;
        this.f5031c = j6;
        this.f5032d = z4;
        this.f5033e = j7;
        this.f5034f = j8;
        this.f5035g = j9;
        this.f5036h = j10;
        this.f5040l = iVar;
        this.f5037i = aVar;
        this.f5039k = uri;
        this.f5038j = c0101w;
        this.f5041m = arrayList;
    }

    @Override // l0.InterfaceC0402a
    public final Object a(List list) {
        ArrayList arrayList;
        long j4;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new P());
        ArrayList arrayList3 = new ArrayList();
        long j5 = 0;
        int i4 = 0;
        while (i4 < this.f5041m.size()) {
            if (((P) linkedList.peek()).f2140l != i4) {
                long c4 = c(i4);
                if (c4 != -9223372036854775807L) {
                    j5 += c4;
                }
                arrayList2 = arrayList3;
            } else {
                h b4 = b(i4);
                List list2 = b4.f5063c;
                P p2 = (P) linkedList.poll();
                int i5 = p2.f2140l;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i6 = p2.f2141m;
                    C0249a c0249a = (C0249a) list2.get(i6);
                    List list3 = c0249a.f5021c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(p2.f2142n));
                        p2 = (P) linkedList.poll();
                        if (p2.f2140l != i5) {
                            break;
                        }
                    } while (p2.f2141m == i6);
                    arrayList = arrayList3;
                    j4 = j5;
                    arrayList4.add(new C0249a(c0249a.f5019a, c0249a.f5020b, arrayList5, c0249a.f5022d, c0249a.f5023e, c0249a.f5024f));
                    if (p2.f2140l != i5) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j5 = j4;
                }
                linkedList.addFirst(p2);
                arrayList2 = arrayList;
                arrayList2.add(new h(b4.f5061a, b4.f5062b - j4, arrayList4, b4.f5064d));
                j5 = j4;
            }
            i4++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j6 = j5;
        long j7 = this.f5030b;
        return new C0251c(this.f5029a, j7 != -9223372036854775807L ? j7 - j6 : -9223372036854775807L, this.f5031c, this.f5032d, this.f5033e, this.f5034f, this.f5035g, this.f5036h, this.f5040l, this.f5037i, this.f5038j, this.f5039k, arrayList6);
    }

    public final h b(int i4) {
        return (h) this.f5041m.get(i4);
    }

    public final long c(int i4) {
        long j4;
        long j5;
        List list = this.f5041m;
        if (i4 == list.size() - 1) {
            j4 = this.f5030b;
            if (j4 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j5 = ((h) list.get(i4)).f5062b;
        } else {
            j4 = ((h) list.get(i4 + 1)).f5062b;
            j5 = ((h) list.get(i4)).f5062b;
        }
        return j4 - j5;
    }

    public final long d(int i4) {
        return y.M(c(i4));
    }
}
