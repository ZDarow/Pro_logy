package p057O0;

/* renamed from: O0.j */
/* loaded from: classes.dex */
public final class C0491j extends p057O0.AbstractC0483b {
    public static final android.os.Parcelable.Creator<p057O0.C0491j> CREATOR = new p057O0.C0488g(0);

    /* renamed from: l */
    public final java.util.List f1440l;

    public C0491j(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(new p057O0.C0490i(parcel));
        }
        this.f1440l = java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        java.util.List list = this.f1440l;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            p057O0.C0490i c0490i = (p057O0.C0490i) list.get(i5);
            parcel.writeLong(c0490i.f1429a);
            parcel.writeByte(c0490i.f1430b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c0490i.f1431c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c0490i.f1432d ? (byte) 1 : (byte) 0);
            java.util.List list2 = c0490i.f1434f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i6 = 0; i6 < size2; i6++) {
                p057O0.C0489h c0489h = (p057O0.C0489h) list2.get(i6);
                parcel.writeInt(c0489h.f1427a);
                parcel.writeLong(c0489h.f1428b);
            }
            parcel.writeLong(c0490i.f1433e);
            parcel.writeByte(c0490i.f1435g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c0490i.f1436h);
            parcel.writeInt(c0490i.f1437i);
            parcel.writeInt(c0490i.f1438j);
            parcel.writeInt(c0490i.f1439k);
        }
    }

    public C0491j(java.util.ArrayList arrayList) {
        this.f1440l = java.util.Collections.unmodifiableList(arrayList);
    }
}
