package O0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new g(0);

    /* renamed from: l, reason: collision with root package name */
    public final List f1392l;

    public j(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new i(parcel));
        }
        this.f1392l = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        List list = this.f1392l;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = (i) list.get(i5);
            parcel.writeLong(iVar.f1381a);
            parcel.writeByte(iVar.f1382b ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.f1383c ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.f1384d ? (byte) 1 : (byte) 0);
            List list2 = iVar.f1386f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i6 = 0; i6 < size2; i6++) {
                h hVar = (h) list2.get(i6);
                parcel.writeInt(hVar.f1379a);
                parcel.writeLong(hVar.f1380b);
            }
            parcel.writeLong(iVar.f1385e);
            parcel.writeByte(iVar.f1387g ? (byte) 1 : (byte) 0);
            parcel.writeLong(iVar.f1388h);
            parcel.writeInt(iVar.f1389i);
            parcel.writeInt(iVar.f1390j);
            parcel.writeInt(iVar.f1391k);
        }
    }

    public j(ArrayList arrayList) {
        this.f1392l = Collections.unmodifiableList(arrayList);
    }
}
