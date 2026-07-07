package O1;

import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* renamed from: O1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063c extends P1.a {
    public static final Parcelable.Creator<C0063c> CREATOR = new O0.g(2);

    /* renamed from: l, reason: collision with root package name */
    public final int f1414l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1415m;

    public C0063c(String str, int i4) {
        this.f1414l = i4;
        this.f1415m = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0063c)) {
            return false;
        }
        C0063c c0063c = (C0063c) obj;
        return c0063c.f1414l == this.f1414l && s.f(c0063c.f1415m, this.f1415m);
    }

    public final int hashCode() {
        return this.f1414l;
    }

    public final String toString() {
        return this.f1414l + ":" + this.f1415m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1414l);
        AbstractC0462a.T(parcel, 2, this.f1415m);
        AbstractC0462a.Y(parcel, X3);
    }
}
