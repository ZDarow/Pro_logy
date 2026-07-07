package O0;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f1381a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1382b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1383c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1384d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1385e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1386f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1387g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1388h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1389i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1390j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1391k;

    public i(long j4, boolean z4, boolean z5, boolean z6, ArrayList arrayList, long j5, boolean z7, long j6, int i4, int i5, int i6) {
        this.f1381a = j4;
        this.f1382b = z4;
        this.f1383c = z5;
        this.f1384d = z6;
        this.f1386f = Collections.unmodifiableList(arrayList);
        this.f1385e = j5;
        this.f1387g = z7;
        this.f1388h = j6;
        this.f1389i = i4;
        this.f1390j = i5;
        this.f1391k = i6;
    }

    public i(Parcel parcel) {
        this.f1381a = parcel.readLong();
        this.f1382b = parcel.readByte() == 1;
        this.f1383c = parcel.readByte() == 1;
        this.f1384d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new h(parcel.readLong(), parcel.readInt()));
        }
        this.f1386f = Collections.unmodifiableList(arrayList);
        this.f1385e = parcel.readLong();
        this.f1387g = parcel.readByte() == 1;
        this.f1388h = parcel.readLong();
        this.f1389i = parcel.readInt();
        this.f1390j = parcel.readInt();
        this.f1391k = parcel.readInt();
    }
}
