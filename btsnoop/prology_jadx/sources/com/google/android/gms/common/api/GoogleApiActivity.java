package com.google.android.gms.common.api;

@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: m */
    public static final /* synthetic */ int f4906m = 0;

    /* renamed from: l */
    public int f4907l = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, android.content.Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4907l = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                p054N1.C0449d m953f = p054N1.C0449d.m953f(this);
                if (i5 == -1) {
                    p088W1.HandlerC0820f handlerC0820f = m953f.f1321x;
                    handlerC0820f.sendMessage(handlerC0820f.obtainMessage(3));
                } else if (i5 == 0) {
                    m953f.m958g(new p046L1.C0357a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i4 == 2) {
            this.f4907l = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f4907l = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4907l = bundle.getInt("resolution");
        }
        if (this.f4907l != 1) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
            java.lang.Integer num = (java.lang.Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                p058O1.AbstractC0515s.m1017d(num);
                p046L1.C0360d.f1104c.m807c(this, num.intValue(), this);
                this.f4907l = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f4907l = 1;
            } catch (android.content.ActivityNotFoundException e4) {
                if (extras.getBoolean("notify_manager", true)) {
                    p054N1.C0449d.m953f(this).m958g(new p046L1.C0357a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    java.lang.String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (android.os.Build.FINGERPRINT.contains("generic")) {
                        str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    android.util.Log.e("GoogleApiActivity", str, e4);
                }
                this.f4907l = 1;
                finish();
            } catch (android.content.IntentSender.SendIntentException e5) {
                android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.f4907l);
        super.onSaveInstanceState(bundle);
    }
}
