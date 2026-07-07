package a2;

import O1.s;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147a extends P1.a {
    public static final Parcelable.Creator<C0147a> CREATOR = new O0.g(24);

    /* renamed from: l, reason: collision with root package name */
    public final long f3598l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3599m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3600n;

    /* renamed from: o, reason: collision with root package name */
    public final Y1.j f3601o;

    public C0147a(long j4, int i4, boolean z4, Y1.j jVar) {
        this.f3598l = j4;
        this.f3599m = i4;
        this.f3600n = z4;
        this.f3601o = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0147a)) {
            return false;
        }
        C0147a c0147a = (C0147a) obj;
        return this.f3598l == c0147a.f3598l && this.f3599m == c0147a.f3599m && this.f3600n == c0147a.f3600n && s.f(this.f3601o, c0147a.f3601o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3598l), Integer.valueOf(this.f3599m), Boolean.valueOf(this.f3600n)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j4 = this.f3598l;
        if (j4 != Long.MAX_VALUE) {
            sb.append("maxAge=");
            Y1.n.a(j4, sb);
        }
        int i4 = this.f3599m;
        if (i4 != 0) {
            sb.append(", ");
            if (i4 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i4 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f3600n) {
            sb.append(", bypass");
        }
        Y1.j jVar = this.f3601o;
        if (jVar != null) {
            sb.append(", impersonation=");
            sb.append(jVar);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 8);
        parcel.writeLong(this.f3598l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f3599m);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f3600n ? 1 : 0);
        AbstractC0462a.S(parcel, 5, this.f3601o, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
