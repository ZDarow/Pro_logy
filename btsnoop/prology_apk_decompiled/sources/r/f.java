package r;

import android.app.Notification;
import android.os.Parcel;
import b.C0174a;
import b.InterfaceC0176c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7979b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f7980c;

    public f(String str, int i4, Notification notification) {
        this.f7978a = str;
        this.f7979b = i4;
        this.f7980c = notification;
    }

    public final void a(InterfaceC0176c interfaceC0176c) {
        String str = this.f7978a;
        int i4 = this.f7979b;
        C0174a c0174a = (C0174a) interfaceC0176c;
        c0174a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0176c.f4325a);
            obtain.writeString(str);
            obtain.writeInt(i4);
            obtain.writeString(null);
            Notification notification = this.f7980c;
            obtain.writeInt(1);
            notification.writeToParcel(obtain, 0);
            c0174a.f4323c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f7978a + ", id:" + this.f7979b + ", tag:null]";
    }
}
