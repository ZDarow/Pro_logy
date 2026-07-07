package io.flutter.plugins.urllauncher;

import S2.g;
import S2.h;
import S2.j;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f6418p = 0;

    /* renamed from: n, reason: collision with root package name */
    public WebView f6421n;

    /* renamed from: l, reason: collision with root package name */
    public final g f6419l = new g(0, this);

    /* renamed from: m, reason: collision with root package name */
    public final h f6420m = new WebViewClient();

    /* renamed from: o, reason: collision with root package name */
    public final IntentFilter f6422o = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f6421n = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f6421n.loadUrl(stringExtra, map);
        this.f6421n.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f6421n.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f6421n.setWebViewClient(this.f6420m);
        this.f6421n.getSettings().setSupportMultipleWindows(true);
        this.f6421n.setWebChromeClient(new j(this));
        AbstractC0462a.K(this, this.f6419l, this.f6422o);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f6419l);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !this.f6421n.canGoBack()) {
            return super.onKeyDown(i4, keyEvent);
        }
        this.f6421n.goBack();
        return true;
    }
}
