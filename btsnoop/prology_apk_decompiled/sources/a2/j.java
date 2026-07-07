package a2;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final L1.c[] f3622a = {new L1.c("name_ulr_private", 1), new L1.c("name_sleep_segment_request", 1), new L1.c("get_last_activity_feature_id", 1), new L1.c("support_context_feature_id", 1), new L1.c("get_current_location", 2), new L1.c("get_last_location_with_request", 1), new L1.c("set_mock_mode_with_callback", 1), new L1.c("set_mock_location_with_callback", 1), new L1.c("inject_location_with_callback", 1), new L1.c("location_updates_with_callback", 1), new L1.c("use_safe_parcelable_in_intents", 1), new L1.c("flp_debug_updates", 1), new L1.c("google_location_accuracy_enabled", 1), new L1.c("geofences_with_callback", 1), new L1.c("location_enabled", 1)};

    public static void a(int i4) {
        boolean z4 = true;
        if (i4 != 100 && i4 != 102 && i4 != 104) {
            if (i4 == 105) {
                i4 = 105;
            } else {
                z4 = false;
            }
        }
        Object[] objArr = {Integer.valueOf(i4)};
        if (!z4) {
            throw new IllegalArgumentException(String.format("priority %d must be a Priority.PRIORITY_* constant", objArr));
        }
    }

    public static String b(int i4) {
        if (i4 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i4 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i4 == 104) {
            return "LOW_POWER";
        }
        if (i4 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
