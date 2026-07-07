package p075S2;

/* renamed from: S2.i */
/* loaded from: classes.dex */
public final class C0656i extends android.webkit.WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ p075S2.C0657j f2140a;

    public C0656i(p075S2.C0657j c0657j) {
        this.f2140a = c0657j;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        this.f2140a.f2141a.f6660n.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        this.f2140a.f2141a.f6660n.loadUrl(str);
        return true;
    }
}
