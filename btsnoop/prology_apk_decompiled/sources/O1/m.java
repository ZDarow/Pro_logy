package O1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f1458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1459c;

    public /* synthetic */ m(Intent intent, Object obj, int i4) {
        this.f1457a = i4;
        this.f1458b = intent;
        this.f1459c = obj;
    }

    public final void a() {
        switch (this.f1457a) {
            case 0:
                Intent intent = this.f1458b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f1459c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f1458b;
                if (intent2 != null) {
                    ((N1.D) this.f1459c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e4) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
