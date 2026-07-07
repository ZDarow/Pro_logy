package S2;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes.dex */
public final class j extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f2065a;

    public j(WebViewActivity webViewActivity) {
        this.f2065a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
        i iVar = new i(this);
        WebView webView2 = new WebView(this.f2065a.f6421n.getContext());
        webView2.setWebViewClient(iVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
