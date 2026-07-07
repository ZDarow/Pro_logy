package O0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new F.i(28);

    /* renamed from: l, reason: collision with root package name */
    public final long f1367l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1368m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1369n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1370o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1371p;

    /* renamed from: q, reason: collision with root package name */
    public final long f1372q;

    /* renamed from: r, reason: collision with root package name */
    public final long f1373r;
    public final List s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1374t;

    /* renamed from: u, reason: collision with root package name */
    public final long f1375u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1376v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1377x;

    public e(long j4, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, List list, boolean z8, long j7, int i4, int i5, int i6) {
        this.f1367l = j4;
        this.f1368m = z4;
        this.f1369n = z5;
        this.f1370o = z6;
        this.f1371p = z7;
        this.f1372q = j5;
        this.f1373r = j6;
        this.s = Collections.unmodifiableList(list);
        this.f1374t = z8;
        this.f1375u = j7;
        this.f1376v = i4;
        this.w = i5;
        this.f1377x = i6;
    }

    @Override // O0.b
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f1372q + ", programSplicePlaybackPositionUs= " + this.f1373r + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f1367l);
        parcel.writeByte(this.f1368m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1369n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1370o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1371p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1372q);
        parcel.writeLong(this.f1373r);
        List list = this.s;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) list.get(i5);
            parcel.writeInt(dVar.f1364a);
            parcel.writeLong(dVar.f1365b);
            parcel.writeLong(dVar.f1366c);
        }
        parcel.writeByte(this.f1374t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1375u);
        parcel.writeInt(this.f1376v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.f1377x);
    }

    public e(Parcel parcel) {
        this.f1367l = parcel.readLong();
        this.f1368m = parcel.readByte() == 1;
        this.f1369n = parcel.readByte() == 1;
        this.f1370o = parcel.readByte() == 1;
        this.f1371p = parcel.readByte() == 1;
        this.f1372q = parcel.readLong();
        this.f1373r = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.s = Collections.unmodifiableList(arrayList);
        this.f1374t = parcel.readByte() == 1;
        this.f1375u = parcel.readLong();
        this.f1376v = parcel.readInt();
        this.w = parcel.readInt();
        this.f1377x = parcel.readInt();
    }
}
