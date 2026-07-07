package p010B3;

/* renamed from: B3.e */
/* loaded from: classes.dex */
public final class C0074e {

    /* renamed from: a */
    public final boolean f240a;

    /* renamed from: b */
    public final boolean f241b;

    /* renamed from: c */
    public final java.lang.Long f242c;

    /* renamed from: d */
    public final java.lang.Long f243d;

    /* renamed from: e */
    public final java.lang.Long f244e;

    /* renamed from: f */
    public final java.lang.Long f245f;

    /* renamed from: g */
    public final java.util.Map f246g;

    public C0074e(boolean z4, boolean z5, java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, java.lang.Long l7) {
        p105a3.C1030m c1030m = p105a3.C1030m.f3756l;
        this.f240a = z4;
        this.f241b = z5;
        this.f242c = l4;
        this.f243d = l5;
        this.f244e = l6;
        this.f245f = l7;
        this.f246g = c1030m;
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f240a) {
            arrayList.add("isRegularFile");
        }
        if (this.f241b) {
            arrayList.add("isDirectory");
        }
        java.lang.Long l4 = this.f242c;
        if (l4 != null) {
            arrayList.add("byteCount=" + l4);
        }
        java.lang.Long l5 = this.f243d;
        if (l5 != null) {
            arrayList.add("createdAt=" + l5);
        }
        java.lang.Long l6 = this.f244e;
        if (l6 != null) {
            arrayList.add("lastModifiedAt=" + l6);
        }
        java.lang.Long l7 = this.f245f;
        if (l7 != null) {
            arrayList.add("lastAccessedAt=" + l7);
        }
        java.util.Map map = this.f246g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return p105a3.AbstractC1021d.m2051f0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
