package io.flutter.plugins.urllauncher;

/* loaded from: classes.dex */
public class WebViewActivity extends android.app.Activity {

    /* renamed from: p */
    public static final /* synthetic */ int f6657p = 0;

    /* renamed from: n */
    public android.webkit.WebView f6660n;

    /* renamed from: l */
    public final p075S2.C0654g f6658l = new p075S2.C0654g(0, this);

    /* renamed from: m */
    public final p075S2.C0655h f6659m = new android.webkit.WebViewClient();

    /* renamed from: o */
    public final android.content.IntentFilter f6661o = new android.content.IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        java.util.Map<java.lang.String, java.lang.String> map;
        super.onCreate(bundle);
        android.webkit.WebView webView = new android.webkit.WebView(this);
        this.f6660n = webView;
        setContentView(webView);
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        android.os.Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = java.util.Collections.emptyMap();
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f6660n.loadUrl(stringExtra, map);
        this.f6660n.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f6660n.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f6660n.setWebViewClient(this.f6659m);
        this.f6660n.getSettings().setSupportMultipleWindows(true);
        this.f6660n.setWebChromeClient(new p075S2.C0657j(this));
        p176p1.AbstractC1949a.m3908K(this, this.f6658l, this.f6661o);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f6658l);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, android.view.KeyEvent keyEvent) {
        if (i4 != 4 || !this.f6660n.canGoBack()) {
            return super.onKeyDown(i4, keyEvent);
        }
        this.f6660n.goBack();
        return true;
    }
}
