package L1;

import B2.AbstractC0007h;
import N1.D;
import O1.s;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import r.C0496a;
import r.C0498c;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1064b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final d f1065c = new Object();

    public static AlertDialog d(Activity activity, int i4, O1.m mVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(O1.l.b(activity, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(R.string.ok) : resources.getString(com.prology.R.string.common_google_play_services_enable_button) : resources.getString(com.prology.R.string.common_google_play_services_update_button) : resources.getString(com.prology.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mVar);
        }
        String c4 = O1.l.c(activity, i4);
        if (c4 != null) {
            builder.setTitle(c4);
        }
        Log.w("GoogleApiAvailability", AbstractC0007h.k("Creating dialog for Google Play services availability issue. ConnectionResult=", i4), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.b, android.app.DialogFragment] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        s.e(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f1058l = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f1059m = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i4, GoogleApiActivity googleApiActivity2) {
        AlertDialog d4 = d(googleApiActivity, i4, new O1.m(super.a(googleApiActivity, i4, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d4 == null) {
            return;
        }
        e(googleApiActivity, d4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [E0.e, r.b, java.lang.Object] */
    public final void f(Context context, int i4, PendingIntent pendingIntent) {
        int i5;
        Log.w("GoogleApiAvailability", AbstractC0007h.j(i4, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i4 == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e4 = i4 == 6 ? O1.l.e(context, "common_google_play_services_resolution_required_title") : O1.l.c(context, i4);
        if (e4 == null) {
            e4 = context.getResources().getString(com.prology.R.string.common_google_play_services_notification_ticker);
        }
        String d4 = (i4 == 6 || i4 == 19) ? O1.l.d(context, "common_google_play_services_resolution_required_text", O1.l.a(context)) : O1.l.b(context, i4);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        s.d(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C0498c c0498c = new C0498c(context, null);
        c0498c.f7971m = true;
        c0498c.c(16, true);
        c0498c.f7963e = C0498c.b(e4);
        ?? obj = new Object();
        obj.f7958b = C0498c.b(d4);
        c0498c.e(obj);
        PackageManager packageManager = context.getPackageManager();
        if (U1.a.f2516c == null) {
            U1.a.f2516c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (U1.a.f2516c.booleanValue()) {
            c0498c.s.icon = context.getApplicationInfo().icon;
            c0498c.f7967i = 2;
            if (U1.a.t(context)) {
                c0498c.f7960b.add(new C0496a(com.prology.R.drawable.common_full_open_on_phone, resources.getString(com.prology.R.string.common_open_on_phone), pendingIntent));
            } else {
                c0498c.f7965g = pendingIntent;
            }
        } else {
            c0498c.s.icon = R.drawable.stat_sys_warning;
            c0498c.s.tickerText = C0498c.b(resources.getString(com.prology.R.string.common_google_play_services_notification_ticker));
            c0498c.s.when = System.currentTimeMillis();
            c0498c.f7965g = pendingIntent;
            c0498c.f7964f = C0498c.b(d4);
        }
        synchronized (f1064b) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.prology.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c0498c.f7975q = "com.google.android.gms.availability";
        Notification a4 = c0498c.a();
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            f.f1067a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, a4);
    }

    public final void g(Activity activity, D d4, int i4, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d5 = d(activity, i4, new O1.m(super.a(activity, i4, "d"), d4, 1), onCancelListener);
        if (d5 == null) {
            return;
        }
        e(activity, d5, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
