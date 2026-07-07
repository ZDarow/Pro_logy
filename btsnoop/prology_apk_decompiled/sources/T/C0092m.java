package T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: T.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0092m> CREATOR = new O0.g(12);

    /* renamed from: l, reason: collision with root package name */
    public final C0091l[] f2265l;

    /* renamed from: m, reason: collision with root package name */
    public int f2266m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2267n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2268o;

    public C0092m(String str, ArrayList arrayList) {
        this(str, false, (C0091l[]) arrayList.toArray(new C0091l[0]));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0091l c0091l = (C0091l) obj;
        C0091l c0091l2 = (C0091l) obj2;
        UUID uuid = AbstractC0086g.f2240a;
        return uuid.equals(c0091l.f2261m) ? uuid.equals(c0091l2.f2261m) ? 0 : 1 : c0091l.f2261m.compareTo(c0091l2.f2261m);
    }

    public final C0092m d(String str) {
        return W.y.a(this.f2267n, str) ? this : new C0092m(str, false, this.f2265l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0092m.class != obj.getClass()) {
            return false;
        }
        C0092m c0092m = (C0092m) obj;
        return W.y.a(this.f2267n, c0092m.f2267n) && Arrays.equals(this.f2265l, c0092m.f2265l);
    }

    public final int hashCode() {
        if (this.f2266m == 0) {
            String str = this.f2267n;
            this.f2266m = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f2265l);
        }
        return this.f2266m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f2267n);
        parcel.writeTypedArray(this.f2265l, 0);
    }

    public C0092m(C0091l... c0091lArr) {
        this(null, true, c0091lArr);
    }

    public C0092m(String str, boolean z4, C0091l... c0091lArr) {
        this.f2267n = str;
        c0091lArr = z4 ? (C0091l[]) c0091lArr.clone() : c0091lArr;
        this.f2265l = c0091lArr;
        this.f2268o = c0091lArr.length;
        Arrays.sort(c0091lArr, this);
    }

    public C0092m(Parcel parcel) {
        this.f2267n = parcel.readString();
        C0091l[] c0091lArr = (C0091l[]) parcel.createTypedArray(C0091l.CREATOR);
        int i4 = W.y.f2709a;
        this.f2265l = c0091lArr;
        this.f2268o = c0091lArr.length;
    }
}
