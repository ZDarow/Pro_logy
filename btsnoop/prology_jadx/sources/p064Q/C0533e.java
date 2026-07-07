package p064Q;

/* renamed from: Q.e */
/* loaded from: classes.dex */
public final class C0533e extends p064Q.AbstractC0541m {

    /* renamed from: e */
    public final /* synthetic */ int f1566e;

    /* renamed from: f */
    public final /* synthetic */ p111c.C1201d f1567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0533e(java.lang.Object obj, p111c.C1201d c1201d, int i4) {
        super(obj);
        this.f1566e = i4;
        this.f1567f = c1201d;
    }

    @Override // p064Q.AbstractC0541m
    /* renamed from: c */
    public final void mo1037c(java.lang.Object obj) {
        switch (this.f1566e) {
            case 0:
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("media_item", (android.support.v4.media.MediaBrowserCompat$MediaItem) obj);
                this.f1567f.m2838e(0, bundle);
                return;
            default:
                java.util.List list = (java.util.List) obj;
                p111c.C1201d c1201d = this.f1567f;
                if (list == null) {
                    c1201d.m2838e(-1, null);
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelableArray("search_results", (android.os.Parcelable[]) list.toArray(new android.support.v4.media.MediaBrowserCompat$MediaItem[0]));
                c1201d.m2838e(0, bundle2);
                return;
        }
    }
}
