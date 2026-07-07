package p075S2;

/* renamed from: S2.j */
/* loaded from: classes.dex */
public final class C0657j extends android.webkit.WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.plugins.urllauncher.WebViewActivity f2141a;

    public C0657j(io.flutter.plugins.urllauncher.WebViewActivity webViewActivity) {
        this.f2141a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z4, boolean z5, android.os.Message message) {
        p075S2.C0656i c0656i = new p075S2.C0656i(this);
        android.webkit.WebView webView2 = new android.webkit.WebView(this.f2141a.f6660n.getContext());
        webView2.setWebViewClient(c0656i);
        ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
