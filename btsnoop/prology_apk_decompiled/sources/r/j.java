package r;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static String f7993c;

    /* renamed from: f, reason: collision with root package name */
    public static i f7996f;

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f7997a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7992b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static HashSet f7994d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7995e = new Object();

    public j(Context context) {
        this.f7997a = (NotificationManager) context.getSystemService("notification");
    }
}
