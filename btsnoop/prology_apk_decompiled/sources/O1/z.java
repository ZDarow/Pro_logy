package O1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f1491d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1494c;

    public z(String str, boolean z4) {
        s.c(str);
        this.f1492a = str;
        s.c("com.google.android.gms");
        this.f1493b = "com.google.android.gms";
        this.f1494c = z4;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f1492a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f1494c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f1491d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f1493b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return s.f(this.f1492a, zVar.f1492a) && s.f(this.f1493b, zVar.f1493b) && s.f(null, null) && this.f1494c == zVar.f1494c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1492a, this.f1493b, null, 4225, Boolean.valueOf(this.f1494c)});
    }

    public final String toString() {
        String str = this.f1492a;
        if (str != null) {
            return str;
        }
        s.d(null);
        throw null;
    }
}
