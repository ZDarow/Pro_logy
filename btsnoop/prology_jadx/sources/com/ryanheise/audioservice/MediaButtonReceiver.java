package com.ryanheise.audioservice;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f4980a = 0;

    /* renamed from: a */
    public static android.content.ComponentName m2947a(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            android.content.pm.ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new java.lang.IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    /* renamed from: b */
    public final void m2948b(android.content.Context context, android.content.Intent intent) {
        java.lang.String message;
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            android.util.Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        android.content.ComponentName m2947a = m2947a(context, "android.intent.action.MEDIA_BUTTON");
        if (m2947a == null) {
            android.content.ComponentName m2947a2 = m2947a(context, "android.media.browse.MediaBrowserService");
            if (m2947a2 == null) {
                throw new java.lang.IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
            android.content.Context applicationContext = context.getApplicationContext();
            p072S.C0622b c0622b = new p072S.C0622b(applicationContext, intent, goAsync);
            android.support.v4.media.C1037e c1037e = new android.support.v4.media.C1037e(applicationContext, m2947a2, c0622b);
            c0622b.f1951f = c1037e;
            android.util.Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            c1037e.f3793a.f3785b.connect();
            return;
        }
        intent.setComponent(m2947a);
        try {
            context.startForegroundService(intent);
        } catch (java.lang.IllegalStateException e4) {
            if (android.os.Build.VERSION.SDK_INT < 31 || !p072S.AbstractC0621a.m1129b(e4)) {
                throw e4;
            }
            android.app.ForegroundServiceStartNotAllowedException m1128a = p072S.AbstractC0621a.m1128a(e4);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("caught exception when trying to start a foreground service from the background: ");
            message = m1128a.getMessage();
            sb.append(message);
            android.util.Log.e("MediaButtonReceiver", sb.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || com.ryanheise.audioservice.AudioService.f4959J == null) {
            m2948b(context, intent);
            return;
        }
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("onNotificationDeleted", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
    }
}
