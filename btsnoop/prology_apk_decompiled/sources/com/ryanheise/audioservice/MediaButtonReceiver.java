package com.ryanheise.audioservice;

import S.a;
import S.b;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.e;
import android.util.Log;
import java.util.List;
import s2.k;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4801a = 0;

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    public final void b(Context context, Intent intent) {
        String message;
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName a4 = a(context, "android.intent.action.MEDIA_BUTTON");
        if (a4 == null) {
            ComponentName a5 = a(context, "android.media.browse.MediaBrowserService");
            if (a5 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            b bVar = new b(applicationContext, intent, goAsync);
            e eVar = new e(applicationContext, a5, bVar);
            bVar.f1880f = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f3668a.f3660b.connect();
            return;
        }
        intent.setComponent(a4);
        try {
            context.startForegroundService(intent);
        } catch (IllegalStateException e4) {
            if (Build.VERSION.SDK_INT < 31 || !a.b(e4)) {
                throw e4;
            }
            ForegroundServiceStartNotAllowedException a6 = a.a(e4);
            StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
            message = a6.getMessage();
            sb.append(message);
            Log.e("MediaButtonReceiver", sb.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || AudioService.J == null) {
            b(context, intent);
            return;
        }
        H2.a aVar = AudioService.f4783L;
        if (aVar == null) {
            return;
        }
        aVar.a("onNotificationDeleted", k.q(new Object[0]), null);
    }
}
