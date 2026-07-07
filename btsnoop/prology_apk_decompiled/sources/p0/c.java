package p0;

import T.C0095p;
import T.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.InterfaceC0402a;

/* loaded from: classes.dex */
public final class c implements InterfaceC0402a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7612c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7613d;

    /* renamed from: e, reason: collision with root package name */
    public final C0461a f7614e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f7615f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7616g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7617h;

    public c(int i4, int i5, long j4, long j5, int i6, boolean z4, C0461a c0461a, b[] bVarArr) {
        this.f7610a = i4;
        this.f7611b = i5;
        this.f7616g = j4;
        this.f7617h = j5;
        this.f7612c = i6;
        this.f7613d = z4;
        this.f7614e = c0461a;
        this.f7615f = bVarArr;
    }

    @Override // l0.InterfaceC0402a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            P p2 = (P) arrayList.get(i4);
            b bVar2 = this.f7615f[p2.f2141m];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((C0095p[]) arrayList3.toArray(new C0095p[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f7603j[p2.f2142n]);
            i4++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((C0095p[]) arrayList3.toArray(new C0095p[0])));
        }
        return new c(this.f7610a, this.f7611b, this.f7616g, this.f7617h, this.f7612c, this.f7613d, this.f7614e, (b[]) arrayList2.toArray(new b[0]));
    }
}
