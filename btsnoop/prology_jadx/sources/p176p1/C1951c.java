package p176p1;

/* renamed from: p1.c */
/* loaded from: classes.dex */
public final class C1951c extends p176p1.AbstractC1950b {

    /* renamed from: d */
    public final android.util.SparseIntArray f7939d;

    /* renamed from: e */
    public final android.os.Parcel f7940e;

    /* renamed from: f */
    public final int f7941f;

    /* renamed from: g */
    public final int f7942g;

    /* renamed from: h */
    public final java.lang.String f7943h;

    /* renamed from: i */
    public int f7944i;

    /* renamed from: j */
    public int f7945j;

    /* renamed from: k */
    public int f7946k;

    /* JADX WARN: Type inference failed for: r5v0, types: [n.e, n.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n.e, n.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n.e, n.j] */
    public C1951c(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p165n.C1883j(0), new p165n.C1883j(0), new p165n.C1883j(0));
    }

    @Override // p176p1.AbstractC1950b
    /* renamed from: a */
    public final p176p1.C1951c mo3949a() {
        android.os.Parcel parcel = this.f7940e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f7945j;
        if (i4 == this.f7941f) {
            i4 = this.f7942g;
        }
        return new p176p1.C1951c(parcel, dataPosition, i4, p009B2.AbstractC0051h.m154m(new java.lang.StringBuilder(), this.f7943h, "  "), this.f7936a, this.f7937b, this.f7938c);
    }

    @Override // p176p1.AbstractC1950b
    /* renamed from: e */
    public final boolean mo3953e(int i4) {
        while (this.f7945j < this.f7942g) {
            int i5 = this.f7946k;
            if (i5 == i4) {
                return true;
            }
            if (java.lang.String.valueOf(i5).compareTo(java.lang.String.valueOf(i4)) > 0) {
                return false;
            }
            int i6 = this.f7945j;
            android.os.Parcel parcel = this.f7940e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f7946k = parcel.readInt();
            this.f7945j += readInt;
        }
        return this.f7946k == i4;
    }

    @Override // p176p1.AbstractC1950b
    /* renamed from: i */
    public final void mo3957i(int i4) {
        int i5 = this.f7944i;
        android.util.SparseIntArray sparseIntArray = this.f7939d;
        android.os.Parcel parcel = this.f7940e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f7944i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public C1951c(android.os.Parcel parcel, int i4, int i5, java.lang.String str, p165n.C1878e c1878e, p165n.C1878e c1878e2, p165n.C1878e c1878e3) {
        super(c1878e, c1878e2, c1878e3);
        this.f7939d = new android.util.SparseIntArray();
        this.f7944i = -1;
        this.f7946k = -1;
        this.f7940e = parcel;
        this.f7941f = i4;
        this.f7942g = i5;
        this.f7945j = i4;
        this.f7943h = str;
    }
}
