package g0;

import B2.AbstractC0007h;
import T.F;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements F {
    public static final Parcelable.Creator<t> CREATOR = new a2.g(10);

    /* renamed from: l, reason: collision with root package name */
    public final String f5801l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5802m;

    /* renamed from: n, reason: collision with root package name */
    public final List f5803n;

    public t(String str, String str2, List list) {
        this.f5801l = str;
        this.f5802m = str2;
        this.f5803n = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return TextUtils.equals(this.f5801l, tVar.f5801l) && TextUtils.equals(this.f5802m, tVar.f5802m) && this.f5803n.equals(tVar.f5803n);
    }

    public final int hashCode() {
        String str = this.f5801l;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5802m;
        return this.f5803n.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f5801l;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(str2);
            sb2.append(", ");
            str = AbstractC0007h.m(sb2, this.f5802m, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f5801l);
        parcel.writeString(this.f5802m);
        List list = this.f5803n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeParcelable((Parcelable) list.get(i5), 0);
        }
    }

    public t(Parcel parcel) {
        this.f5801l = parcel.readString();
        this.f5802m = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add((s) parcel.readParcelable(s.class.getClassLoader()));
        }
        this.f5803n = Collections.unmodifiableList(arrayList);
    }
}
