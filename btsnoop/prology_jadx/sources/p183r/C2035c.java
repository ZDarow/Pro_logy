package p183r;

/* renamed from: r.c */
/* loaded from: classes.dex */
public final class C2035c {

    /* renamed from: a */
    public final android.content.Context f8267a;

    /* renamed from: e */
    public java.lang.CharSequence f8271e;

    /* renamed from: f */
    public java.lang.CharSequence f8272f;

    /* renamed from: g */
    public android.app.PendingIntent f8273g;

    /* renamed from: h */
    public androidx.core.graphics.drawable.IconCompat f8274h;

    /* renamed from: i */
    public int f8275i;

    /* renamed from: k */
    public p021E0.AbstractC0193e f8277k;

    /* renamed from: l */
    public java.lang.CharSequence f8278l;

    /* renamed from: n */
    public android.os.Bundle f8280n;

    /* renamed from: q */
    public java.lang.String f8283q;

    /* renamed from: r */
    public final boolean f8284r;

    /* renamed from: s */
    public final android.app.Notification f8285s;

    /* renamed from: t */
    public final java.util.ArrayList f8286t;

    /* renamed from: b */
    public final java.util.ArrayList f8268b = new java.util.ArrayList();

    /* renamed from: c */
    public final java.util.ArrayList f8269c = new java.util.ArrayList();

    /* renamed from: d */
    public final java.util.ArrayList f8270d = new java.util.ArrayList();

    /* renamed from: j */
    public boolean f8276j = true;

    /* renamed from: m */
    public boolean f8279m = false;

    /* renamed from: o */
    public int f8281o = 0;

    /* renamed from: p */
    public int f8282p = 0;

    public C2035c(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.f8285s = notification;
        this.f8267a = context;
        this.f8283q = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f8275i = 0;
        this.f8286t = new java.util.ArrayList();
        this.f8284r = true;
    }

    /* renamed from: b */
    public static java.lang.CharSequence m4084b(java.lang.CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* renamed from: a */
    public final android.app.Notification m4085a() {
        android.os.Bundle bundle;
        java.lang.String mo550c;
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(this);
        p183r.C2035c c2035c = (p183r.C2035c) c1061t.f3862n;
        p021E0.AbstractC0193e abstractC0193e = c2035c.f8277k;
        if (abstractC0193e != null) {
            abstractC0193e.mo549a(c1061t);
        }
        android.app.Notification build = ((android.app.Notification.Builder) c1061t.f3861m).build();
        if (abstractC0193e != null) {
            c2035c.f8277k.getClass();
        }
        if (abstractC0193e != null && (bundle = build.extras) != null && (mo550c = abstractC0193e.mo550c()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo550c);
        }
        return build;
    }

    /* renamed from: c */
    public final void m4086c(int i4, boolean z4) {
        android.app.Notification notification = this.f8285s;
        if (z4) {
            notification.flags = i4 | notification.flags;
        } else {
            notification.flags = (~i4) & notification.flags;
        }
    }

    /* renamed from: d */
    public final void m4087d(android.graphics.Bitmap bitmap) {
        androidx.core.graphics.drawable.IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (android.os.Build.VERSION.SDK_INT < 27) {
                android.content.res.Resources resources = this.f8267a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(com.prology.R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(com.prology.R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = java.lang.Math.min(dimensionPixelSize / java.lang.Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / java.lang.Math.max(1, bitmap.getHeight()));
                    bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(bitmap.getWidth() * min), (int) java.lang.Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            android.graphics.PorterDuff.Mode mode = androidx.core.graphics.drawable.IconCompat.f4095k;
            bitmap.getClass();
            androidx.core.graphics.drawable.IconCompat iconCompat2 = new androidx.core.graphics.drawable.IconCompat(1);
            iconCompat2.f4097b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f8274h = iconCompat;
    }

    /* renamed from: e */
    public final void m4088e(p021E0.AbstractC0193e abstractC0193e) {
        if (this.f8277k != abstractC0193e) {
            this.f8277k = abstractC0193e;
            if (((p183r.C2035c) abstractC0193e.f537a) != this) {
                abstractC0193e.f537a = this;
                m4088e(abstractC0193e);
            }
        }
    }
}
