package p057O0;

/* renamed from: O0.i */
/* loaded from: classes.dex */
public final class C0490i {

    /* renamed from: a */
    public final long f1429a;

    /* renamed from: b */
    public final boolean f1430b;

    /* renamed from: c */
    public final boolean f1431c;

    /* renamed from: d */
    public final boolean f1432d;

    /* renamed from: e */
    public final long f1433e;

    /* renamed from: f */
    public final java.util.List f1434f;

    /* renamed from: g */
    public final boolean f1435g;

    /* renamed from: h */
    public final long f1436h;

    /* renamed from: i */
    public final int f1437i;

    /* renamed from: j */
    public final int f1438j;

    /* renamed from: k */
    public final int f1439k;

    public C0490i(long j4, boolean z4, boolean z5, boolean z6, java.util.ArrayList arrayList, long j5, boolean z7, long j6, int i4, int i5, int i6) {
        this.f1429a = j4;
        this.f1430b = z4;
        this.f1431c = z5;
        this.f1432d = z6;
        this.f1434f = java.util.Collections.unmodifiableList(arrayList);
        this.f1433e = j5;
        this.f1435g = z7;
        this.f1436h = j6;
        this.f1437i = i4;
        this.f1438j = i5;
        this.f1439k = i6;
    }

    public C0490i(android.os.Parcel parcel) {
        this.f1429a = parcel.readLong();
        this.f1430b = parcel.readByte() == 1;
        this.f1431c = parcel.readByte() == 1;
        this.f1432d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new p057O0.C0489h(parcel.readLong(), parcel.readInt()));
        }
        this.f1434f = java.util.Collections.unmodifiableList(arrayList);
        this.f1433e = parcel.readLong();
        this.f1435g = parcel.readByte() == 1;
        this.f1436h = parcel.readLong();
        this.f1437i = parcel.readInt();
        this.f1438j = parcel.readInt();
        this.f1439k = parcel.readInt();
    }
}
