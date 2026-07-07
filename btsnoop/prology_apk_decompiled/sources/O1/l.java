package O1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.prology.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final n.j f1455a = new n.j(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f1456b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = U1.c.a(context).f2520l;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i4) {
        Resources resources = context.getResources();
        String a4 = a(context);
        if (i4 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a4);
        }
        if (i4 == 2) {
            return U1.a.t(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a4);
        }
        if (i4 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a4);
        }
        if (i4 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a4);
        }
        if (i4 == 7) {
            return d(context, "common_google_play_services_network_error_text", a4);
        }
        if (i4 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a4);
        }
        if (i4 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a4);
        }
        switch (i4) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a4);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a4);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a4);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a4);
        }
    }

    public static String c(Context context, int i4) {
        Resources resources = context.getResources();
        switch (i4) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return resources.getString(R.string.common_google_play_services_update_title);
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case L.k.LONG_FIELD_NUMBER /* 4 */:
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i4);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e4 = e(context, str);
        if (e4 == null) {
            e4 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e4, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        n.j jVar = f1455a;
        synchronized (jVar) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f1456b)) {
                    jVar.clear();
                    f1456b = locale;
                }
                String str2 = (String) jVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = L1.f.f1067a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f1455a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
