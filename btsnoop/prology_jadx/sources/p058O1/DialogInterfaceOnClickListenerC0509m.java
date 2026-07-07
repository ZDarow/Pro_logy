package p058O1;

/* renamed from: O1.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0509m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1508a;

    /* renamed from: b */
    public final /* synthetic */ android.content.Intent f1509b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f1510c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0509m(android.content.Intent intent, java.lang.Object obj, int i4) {
        this.f1508a = i4;
        this.f1509b = intent;
        this.f1510c = obj;
    }

    /* renamed from: a */
    public final void m1009a() {
        switch (this.f1508a) {
            case 0:
                android.content.Intent intent = this.f1509b;
                if (intent != null) {
                    ((com.google.android.gms.common.api.GoogleApiActivity) this.f1510c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                android.content.Intent intent2 = this.f1509b;
                if (intent2 != null) {
                    ((p054N1.FragmentC0445D) this.f1510c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
        try {
            try {
                m1009a();
            } catch (android.content.ActivityNotFoundException e4) {
                android.util.Log.e("DialogRedirect", true == android.os.Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
