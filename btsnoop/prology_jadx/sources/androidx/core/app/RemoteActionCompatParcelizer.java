package androidx.core.app;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(p176p1.AbstractC1950b abstractC1950b) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        p176p1.InterfaceC1952d interfaceC1952d = remoteActionCompat.f4089a;
        if (abstractC1950b.mo3953e(1)) {
            interfaceC1952d = abstractC1950b.m3956h();
        }
        remoteActionCompat.f4089a = (androidx.core.graphics.drawable.IconCompat) interfaceC1952d;
        java.lang.CharSequence charSequence = remoteActionCompat.f4090b;
        if (abstractC1950b.mo3953e(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((p176p1.C1951c) abstractC1950b).f7940e);
        }
        remoteActionCompat.f4090b = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.f4091c;
        if (abstractC1950b.mo3953e(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((p176p1.C1951c) abstractC1950b).f7940e);
        }
        remoteActionCompat.f4091c = charSequence2;
        remoteActionCompat.f4092d = (android.app.PendingIntent) abstractC1950b.m3955g(remoteActionCompat.f4092d, 4);
        boolean z4 = remoteActionCompat.f4093e;
        if (abstractC1950b.mo3953e(5)) {
            z4 = ((p176p1.C1951c) abstractC1950b).f7940e.readInt() != 0;
        }
        remoteActionCompat.f4093e = z4;
        boolean z5 = remoteActionCompat.f4094f;
        if (abstractC1950b.mo3953e(6)) {
            z5 = ((p176p1.C1951c) abstractC1950b).f7940e.readInt() != 0;
        }
        remoteActionCompat.f4094f = z5;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, p176p1.AbstractC1950b abstractC1950b) {
        abstractC1950b.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.f4089a;
        abstractC1950b.mo3957i(1);
        abstractC1950b.m3960l(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.f4090b;
        abstractC1950b.mo3957i(2);
        android.os.Parcel parcel = ((p176p1.C1951c) abstractC1950b).f7940e;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.f4091c;
        abstractC1950b.mo3957i(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC1950b.m3959k(remoteActionCompat.f4092d, 4);
        boolean z4 = remoteActionCompat.f4093e;
        abstractC1950b.mo3957i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f4094f;
        abstractC1950b.mo3957i(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
