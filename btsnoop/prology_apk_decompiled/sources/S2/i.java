package S2;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class i extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f2064a;

    public i(j jVar) {
        this.f2064a = jVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f2064a.f2065a.f6421n.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f2064a.f2065a.f6421n.loadUrl(str);
        return true;
    }
}
