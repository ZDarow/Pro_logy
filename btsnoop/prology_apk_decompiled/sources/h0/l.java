package h0;

import T.C0095p;
import T.P;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: l, reason: collision with root package name */
    public static final l f5923l = new l("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List f5924d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5925e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5926f;

    /* renamed from: g, reason: collision with root package name */
    public final List f5927g;

    /* renamed from: h, reason: collision with root package name */
    public final C0095p f5928h;

    /* renamed from: i, reason: collision with root package name */
    public final List f5929i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f5930j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5931k;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, C0095p c0095p, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list2.size(); i4++) {
            Uri uri = ((k) list2.get(i4)).f5917a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f5924d = Collections.unmodifiableList(arrayList);
        this.f5925e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f5926f = Collections.unmodifiableList(list4);
        this.f5927g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f5928h = c0095p;
        this.f5929i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f5930j = Collections.unmodifiableMap(map);
        this.f5931k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            Uri uri = ((j) list.get(i4)).f5914a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i4, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            int i6 = 0;
            while (true) {
                if (i6 < list2.size()) {
                    P p2 = (P) list2.get(i6);
                    if (p2.f2141m == i4 && p2.f2142n == i5) {
                        arrayList.add(obj);
                        break;
                    }
                    i6++;
                }
            }
        }
        return arrayList;
    }

    @Override // l0.InterfaceC0402a
    public final Object a(List list) {
        return new l(this.f5932a, this.f5933b, c(this.f5925e, 0, list), Collections.emptyList(), c(this.f5926f, 1, list), c(this.f5927g, 2, list), Collections.emptyList(), this.f5928h, this.f5929i, this.f5934c, this.f5930j, this.f5931k);
    }
}
