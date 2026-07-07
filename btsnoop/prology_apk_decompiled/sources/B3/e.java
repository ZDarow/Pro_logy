package B3;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f235a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f236b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f237c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f238d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f239e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f240f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f241g;

    public e(boolean z4, boolean z5, Long l4, Long l5, Long l6, Long l7) {
        a3.m mVar = a3.m.f3632l;
        this.f235a = z4;
        this.f236b = z5;
        this.f237c = l4;
        this.f238d = l5;
        this.f239e = l6;
        this.f240f = l7;
        this.f241g = mVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f235a) {
            arrayList.add("isRegularFile");
        }
        if (this.f236b) {
            arrayList.add("isDirectory");
        }
        Long l4 = this.f237c;
        if (l4 != null) {
            arrayList.add("byteCount=" + l4);
        }
        Long l5 = this.f238d;
        if (l5 != null) {
            arrayList.add("createdAt=" + l5);
        }
        Long l6 = this.f239e;
        if (l6 != null) {
            arrayList.add("lastModifiedAt=" + l6);
        }
        Long l7 = this.f240f;
        if (l7 != null) {
            arrayList.add("lastAccessedAt=" + l7);
        }
        Map map = this.f241g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return a3.d.f0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
