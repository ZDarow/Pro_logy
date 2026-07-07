package s2;

import L2.p;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: s2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q.m f8243b;

    public /* synthetic */ C0551h(Q.m mVar, int i4) {
        this.f8242a = i4;
        this.f8243b = mVar;
    }

    @Override // L2.p
    public final void a(String str, String str2, Object obj) {
        switch (this.f8242a) {
            case 0:
                this.f8243b.d(new Bundle());
                throw null;
            case 1:
                this.f8243b.d(new Bundle());
                throw null;
            default:
                ((Q.e) this.f8243b).d(new Bundle());
                throw null;
        }
    }

    @Override // L2.p
    public final void b(Object obj) {
        switch (this.f8242a) {
            case 0:
                List list = (List) ((Map) obj).get("children");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(k.i((Map) it.next()));
                }
                this.f8243b.e(arrayList);
                return;
            case 1:
                Map map = (Map) ((Map) obj).get("mediaItem");
                Q.m mVar = this.f8243b;
                if (map != null) {
                    mVar.e(k.i(map));
                    return;
                } else {
                    mVar.e(null);
                    return;
                }
            default:
                List list2 = (List) ((Map) obj).get("mediaItems");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(k.i((Map) it2.next()));
                }
                ((Q.e) this.f8243b).e(arrayList2);
                return;
        }
    }

    @Override // L2.p
    public final void c() {
        switch (this.f8242a) {
            case 0:
                this.f8243b.d(new Bundle());
                throw null;
            case 1:
                this.f8243b.d(new Bundle());
                throw null;
            default:
                ((Q.e) this.f8243b).d(new Bundle());
                throw null;
        }
    }
}
