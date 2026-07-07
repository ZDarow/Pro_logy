package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p1.b;
import p1.c;
import p1.d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f3945a;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        remoteActionCompat.f3945a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f3946b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f7649e);
        }
        remoteActionCompat.f3946b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3947c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f7649e);
        }
        remoteActionCompat.f3947c = charSequence2;
        remoteActionCompat.f3948d = (PendingIntent) bVar.g(remoteActionCompat.f3948d, 4);
        boolean z4 = remoteActionCompat.f3949e;
        if (bVar.e(5)) {
            z4 = ((c) bVar).f7649e.readInt() != 0;
        }
        remoteActionCompat.f3949e = z4;
        boolean z5 = remoteActionCompat.f3950f;
        if (bVar.e(6)) {
            z5 = ((c) bVar).f7649e.readInt() != 0;
        }
        remoteActionCompat.f3950f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f3945a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3946b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f7649e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3947c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f3948d, 4);
        boolean z4 = remoteActionCompat.f3949e;
        bVar.i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f3950f;
        bVar.i(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
