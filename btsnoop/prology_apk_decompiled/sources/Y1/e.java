package Y1;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import d2.C0241d;

/* loaded from: classes.dex */
public final class e extends W1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0241d f3085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i4, C0241d c0241d) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 2);
        this.f3084d = i4;
        switch (i4) {
            case 1:
                this.f3085e = c0241d;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 2);
                return;
            default:
                this.f3085e = c0241d;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, a2.d] */
    @Override // W1.b
    public final boolean n0(Parcel parcel, int i4) {
        switch (this.f3084d) {
            case 0:
                if (i4 != 1) {
                    return false;
                }
                a2.e eVar = (a2.e) c.a(parcel, a2.e.CREATOR);
                c.c(parcel);
                Status status = eVar.f3607l;
                ?? obj = new Object();
                obj.f3606a = eVar;
                U1.a.C(status, obj, this.f3085e);
                return true;
            default:
                if (i4 != 1) {
                    return false;
                }
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                Location location = (Location) c.a(parcel, Location.CREATOR);
                c.c(parcel);
                U1.a.C(status2, location, this.f3085e);
                return true;
        }
    }
}
