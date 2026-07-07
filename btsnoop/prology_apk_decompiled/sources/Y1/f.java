package Y1;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import d2.C0241d;

/* loaded from: classes.dex */
public final class f extends W1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f3086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0241d f3087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Boolean bool, C0241d c0241d) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.f3086d = bool;
        this.f3087e = c0241d;
    }

    @Override // W1.b
    public final boolean l0(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        Status status = (Status) W1.c.a(parcel, Status.CREATOR);
        W1.c.b(parcel);
        U1.a.C(status, this.f3086d, this.f3087e);
        return true;
    }
}
