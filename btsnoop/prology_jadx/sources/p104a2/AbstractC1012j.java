package p104a2;

/* renamed from: a2.j */
/* loaded from: classes.dex */
public abstract class AbstractC1012j {

    /* renamed from: a */
    public static final p046L1.C0359c[] f3746a = {new p046L1.C0359c("name_ulr_private", 1), new p046L1.C0359c("name_sleep_segment_request", 1), new p046L1.C0359c("get_last_activity_feature_id", 1), new p046L1.C0359c("support_context_feature_id", 1), new p046L1.C0359c("get_current_location", 2), new p046L1.C0359c("get_last_location_with_request", 1), new p046L1.C0359c("set_mock_mode_with_callback", 1), new p046L1.C0359c("set_mock_location_with_callback", 1), new p046L1.C0359c("inject_location_with_callback", 1), new p046L1.C0359c("location_updates_with_callback", 1), new p046L1.C0359c("use_safe_parcelable_in_intents", 1), new p046L1.C0359c("flp_debug_updates", 1), new p046L1.C0359c("google_location_accuracy_enabled", 1), new p046L1.C0359c("geofences_with_callback", 1), new p046L1.C0359c("location_enabled", 1)};

    /* renamed from: a */
    public static void m2035a(int i4) {
        boolean z4 = true;
        if (i4 != 100 && i4 != 102 && i4 != 104) {
            if (i4 == 105) {
                i4 = 105;
            } else {
                z4 = false;
            }
        }
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i4)};
        if (!z4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("priority %d must be a Priority.PRIORITY_* constant", objArr));
        }
    }

    /* renamed from: b */
    public static java.lang.String m2036b(int i4) {
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
        throw new java.lang.IllegalArgumentException();
    }
}
