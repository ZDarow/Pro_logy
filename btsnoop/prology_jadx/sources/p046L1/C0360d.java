package p046L1;

/* renamed from: L1.d */
/* loaded from: classes.dex */
public final class C0360d extends p046L1.AbstractC0361e {

    /* renamed from: b */
    public static final java.lang.Object f1103b = new java.lang.Object();

    /* renamed from: c */
    public static final p046L1.C0360d f1104c = new java.lang.Object();

    /* renamed from: d */
    public static android.app.AlertDialog m805d(android.app.Activity activity, int i4, p058O1.DialogInterfaceOnClickListenerC0509m dialogInterfaceOnClickListenerC0509m, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i4 == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(p058O1.AbstractC0508l.m1005b(activity, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        android.content.res.Resources resources = activity.getResources();
        java.lang.String string = i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.prology.R.string.common_google_play_services_enable_button) : resources.getString(com.prology.R.string.common_google_play_services_update_button) : resources.getString(com.prology.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC0509m);
        }
        java.lang.String m1006c = p058O1.AbstractC0508l.m1006c(activity, i4);
        if (m1006c != null) {
            builder.setTitle(m1006c);
        }
        android.util.Log.w("GoogleApiAvailability", p009B2.AbstractC0051h.m152k("Creating dialog for Google Play services availability issue. ConnectionResult=", i4), new java.lang.IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.b, android.app.DialogFragment] */
    /* renamed from: e */
    public static void m806e(android.app.Activity activity, android.app.AlertDialog alertDialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new android.app.DialogFragment();
        p058O1.AbstractC0515s.m1018e(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f1097l = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f1098m = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    /* renamed from: c */
    public final void m807c(com.google.android.gms.common.api.GoogleApiActivity googleApiActivity, int i4, com.google.android.gms.common.api.GoogleApiActivity googleApiActivity2) {
        android.app.AlertDialog m805d = m805d(googleApiActivity, i4, new p058O1.DialogInterfaceOnClickListenerC0509m(super.m810a(googleApiActivity, i4, "d"), googleApiActivity, 0), googleApiActivity2);
        if (m805d == null) {
            return;
        }
        m806e(googleApiActivity, m805d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [E0.e, r.b, java.lang.Object] */
    /* renamed from: f */
    public final void m808f(android.content.Context context, int i4, android.app.PendingIntent pendingIntent) {
        int i5;
        android.util.Log.w("GoogleApiAvailability", p009B2.AbstractC0051h.m151j(i4, "GMS core API Availability. ConnectionResult=", ", tag=null"), new java.lang.IllegalArgumentException());
        if (i4 == 18) {
            new p046L1.HandlerC0365i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        java.lang.String m1008e = i4 == 6 ? p058O1.AbstractC0508l.m1008e(context, "common_google_play_services_resolution_required_title") : p058O1.AbstractC0508l.m1006c(context, i4);
        if (m1008e == null) {
            m1008e = context.getResources().getString(com.prology.R.string.common_google_play_services_notification_ticker);
        }
        java.lang.String m1007d = (i4 == 6 || i4 == 19) ? p058O1.AbstractC0508l.m1007d(context, "common_google_play_services_resolution_required_text", p058O1.AbstractC0508l.m1004a(context)) : p058O1.AbstractC0508l.m1005b(context, i4);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object systemService = context.getSystemService("notification");
        p058O1.AbstractC0515s.m1017d(systemService);
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        p183r.C2035c c2035c = new p183r.C2035c(context, null);
        c2035c.f8279m = true;
        c2035c.m4086c(16, true);
        c2035c.f8271e = p183r.C2035c.m4084b(m1008e);
        ?? obj = new java.lang.Object();
        obj.f8266b = p183r.C2035c.m4084b(m1007d);
        c2035c.m4088e(obj);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (p080U1.AbstractC0748a.f2604c == null) {
            p080U1.AbstractC0748a.f2604c = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (p080U1.AbstractC0748a.f2604c.booleanValue()) {
            c2035c.f8285s.icon = context.getApplicationInfo().icon;
            c2035c.f8275i = 2;
            if (p080U1.AbstractC0748a.m1385t(context)) {
                c2035c.f8268b.add(new p183r.C2033a(com.prology.R.drawable.common_full_open_on_phone, resources.getString(com.prology.R.string.common_open_on_phone), pendingIntent));
            } else {
                c2035c.f8273g = pendingIntent;
            }
        } else {
            c2035c.f8285s.icon = android.R.drawable.stat_sys_warning;
            c2035c.f8285s.tickerText = p183r.C2035c.m4084b(resources.getString(com.prology.R.string.common_google_play_services_notification_ticker));
            c2035c.f8285s.when = java.lang.System.currentTimeMillis();
            c2035c.f8273g = pendingIntent;
            c2035c.f8272f = p183r.C2035c.m4084b(m1007d);
        }
        synchronized (f1103b) {
        }
        android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        java.lang.String string = context.getResources().getString(com.prology.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c2035c.f8283q = "com.google.android.gms.availability";
        android.app.Notification m4085a = c2035c.m4085a();
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            p046L1.AbstractC0362f.f1106a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, m4085a);
    }

    /* renamed from: g */
    public final void m809g(android.app.Activity activity, p054N1.FragmentC0445D fragmentC0445D, int i4, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.AlertDialog m805d = m805d(activity, i4, new p058O1.DialogInterfaceOnClickListenerC0509m(super.m810a(activity, i4, "d"), fragmentC0445D, 1), onCancelListener);
        if (m805d == null) {
            return;
        }
        m806e(activity, m805d, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
