package p057O0;

/* renamed from: O0.e */
/* loaded from: classes.dex */
public final class C0486e extends p057O0.AbstractC0483b {
    public static final android.os.Parcelable.Creator<p057O0.C0486e> CREATOR = new p024F.C0206i(28);

    /* renamed from: l */
    public final long f1413l;

    /* renamed from: m */
    public final boolean f1414m;

    /* renamed from: n */
    public final boolean f1415n;

    /* renamed from: o */
    public final boolean f1416o;

    /* renamed from: p */
    public final boolean f1417p;

    /* renamed from: q */
    public final long f1418q;

    /* renamed from: r */
    public final long f1419r;

    /* renamed from: s */
    public final java.util.List f1420s;

    /* renamed from: t */
    public final boolean f1421t;

    /* renamed from: u */
    public final long f1422u;

    /* renamed from: v */
    public final int f1423v;

    /* renamed from: w */
    public final int f1424w;

    /* renamed from: x */
    public final int f1425x;

    public C0486e(long j4, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, java.util.List list, boolean z8, long j7, int i4, int i5, int i6) {
        this.f1413l = j4;
        this.f1414m = z4;
        this.f1415n = z5;
        this.f1416o = z6;
        this.f1417p = z7;
        this.f1418q = j5;
        this.f1419r = j6;
        this.f1420s = java.util.Collections.unmodifiableList(list);
        this.f1421t = z8;
        this.f1422u = j7;
        this.f1423v = i4;
        this.f1424w = i5;
        this.f1425x = i6;
    }

    @Override // p057O0.AbstractC0483b
    public final java.lang.String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f1418q + ", programSplicePlaybackPositionUs= " + this.f1419r + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeLong(this.f1413l);
        parcel.writeByte(this.f1414m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1415n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1416o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1417p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1418q);
        parcel.writeLong(this.f1419r);
        java.util.List list = this.f1420s;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            p057O0.C0485d c0485d = (p057O0.C0485d) list.get(i5);
            parcel.writeInt(c0485d.f1410a);
            parcel.writeLong(c0485d.f1411b);
            parcel.writeLong(c0485d.f1412c);
        }
        parcel.writeByte(this.f1421t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1422u);
        parcel.writeInt(this.f1423v);
        parcel.writeInt(this.f1424w);
        parcel.writeInt(this.f1425x);
    }

    public C0486e(android.os.Parcel parcel) {
        this.f1413l = parcel.readLong();
        this.f1414m = parcel.readByte() == 1;
        this.f1415n = parcel.readByte() == 1;
        this.f1416o = parcel.readByte() == 1;
        this.f1417p = parcel.readByte() == 1;
        this.f1418q = parcel.readLong();
        this.f1419r = parcel.readLong();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new p057O0.C0485d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f1420s = java.util.Collections.unmodifiableList(arrayList);
        this.f1421t = parcel.readByte() == 1;
        this.f1422u = parcel.readLong();
        this.f1423v = parcel.readInt();
        this.f1424w = parcel.readInt();
        this.f1425x = parcel.readInt();
    }
}
