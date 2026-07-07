package p183r;

/* renamed from: r.f */
/* loaded from: classes.dex */
public final class C2038f {

    /* renamed from: a */
    public final java.lang.String f8287a;

    /* renamed from: b */
    public final int f8288b;

    /* renamed from: c */
    public final android.app.Notification f8289c;

    public C2038f(java.lang.String str, int i4, android.app.Notification notification) {
        this.f8287a = str;
        this.f8288b = i4;
        this.f8289c = notification;
    }

    /* renamed from: a */
    public final void m4097a(p106b.InterfaceC1165c interfaceC1165c) {
        java.lang.String str = this.f8287a;
        int i4 = this.f8288b;
        p106b.C1163a c1163a = (p106b.C1163a) interfaceC1165c;
        c1163a.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(p106b.InterfaceC1165c.f4481a);
            obtain.writeString(str);
            obtain.writeInt(i4);
            obtain.writeString(null);
            android.app.Notification notification = this.f8289c;
            obtain.writeInt(1);
            notification.writeToParcel(obtain, 0);
            c1163a.f4479c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final java.lang.String toString() {
        return "NotifyTask[packageName:" + this.f8287a + ", id:" + this.f8288b + ", tag:null]";
    }
}
