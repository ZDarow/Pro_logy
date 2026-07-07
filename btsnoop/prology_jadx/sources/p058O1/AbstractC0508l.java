package p058O1;

/* renamed from: O1.l */
/* loaded from: classes.dex */
public abstract class AbstractC0508l {

    /* renamed from: a */
    public static final p165n.C1883j f1506a = new p165n.C1883j(0);

    /* renamed from: b */
    public static java.util.Locale f1507b;

    /* renamed from: a */
    public static java.lang.String m1004a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            android.content.Context context2 = p080U1.C0750c.m1395a(context).f2608l;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static java.lang.String m1005b(android.content.Context context, int i4) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String m1004a = m1004a(context);
        if (i4 == 1) {
            return resources.getString(com.prology.R.string.common_google_play_services_install_text, m1004a);
        }
        if (i4 == 2) {
            return p080U1.AbstractC0748a.m1385t(context) ? resources.getString(com.prology.R.string.common_google_play_services_wear_update_text) : resources.getString(com.prology.R.string.common_google_play_services_update_text, m1004a);
        }
        if (i4 == 3) {
            return resources.getString(com.prology.R.string.common_google_play_services_enable_text, m1004a);
        }
        if (i4 == 5) {
            return m1007d(context, "common_google_play_services_invalid_account_text", m1004a);
        }
        if (i4 == 7) {
            return m1007d(context, "common_google_play_services_network_error_text", m1004a);
        }
        if (i4 == 9) {
            return resources.getString(com.prology.R.string.common_google_play_services_unsupported_text, m1004a);
        }
        if (i4 == 20) {
            return m1007d(context, "common_google_play_services_restricted_profile_text", m1004a);
        }
        switch (i4) {
            case 16:
                return m1007d(context, "common_google_play_services_api_unavailable_text", m1004a);
            case 17:
                return m1007d(context, "common_google_play_services_sign_in_failed_text", m1004a);
            case 18:
                return resources.getString(com.prology.R.string.common_google_play_services_updating_text, m1004a);
            default:
                return resources.getString(com.prology.R.string.common_google_play_services_unknown_issue, m1004a);
        }
    }

    /* renamed from: c */
    public static java.lang.String m1006c(android.content.Context context, int i4) {
        android.content.res.Resources resources = context.getResources();
        switch (i4) {
            case 1:
                return resources.getString(com.prology.R.string.common_google_play_services_install_title);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return resources.getString(com.prology.R.string.common_google_play_services_update_title);
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return resources.getString(com.prology.R.string.common_google_play_services_enable_title);
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m1008e(context, "common_google_play_services_invalid_account_title");
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m1008e(context, "common_google_play_services_network_error_title");
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                android.util.Log.e("GoogleApiAvailability", "Unexpected error code " + i4);
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m1008e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m1008e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: d */
    public static java.lang.String m1007d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String m1008e = m1008e(context, str);
        if (m1008e == null) {
            m1008e = resources.getString(com.prology.R.string.common_google_play_services_unknown_issue);
        }
        return java.lang.String.format(resources.getConfiguration().locale, m1008e, str2);
    }

    /* renamed from: e */
    public static java.lang.String m1008e(android.content.Context context, java.lang.String str) {
        android.content.res.Resources resources;
        p165n.C1883j c1883j = f1506a;
        synchronized (c1883j) {
            try {
                java.util.Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f1507b)) {
                    c1883j.clear();
                    f1507b = locale;
                }
                java.lang.String str2 = (java.lang.String) c1883j.get(str);
                if (str2 != null) {
                    return str2;
                }
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = p046L1.AbstractC0362f.f1106a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    android.util.Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                java.lang.String string = resources.getString(identifier);
                if (android.text.TextUtils.isEmpty(string)) {
                    android.util.Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f1506a.put(str, string);
                return string;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
