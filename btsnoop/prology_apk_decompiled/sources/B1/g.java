package B1;

import K2.k;
import a.AbstractC0110a;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f104c;

    public g(k kVar, double d4, double d5) {
        this.f102a = kVar;
        this.f103b = d4;
        this.f104c = d5;
    }

    @Override // B1.a
    public final void onError(String str) {
        if (str == null) {
            str = "Unknown error occurred";
        }
        this.f102a.a("IO_ERROR", str, null);
    }

    @Override // B1.a
    public final void onGeocode(List list) {
        k kVar = this.f102a;
        if (list == null || list.size() <= 0) {
            kVar.a("NOT_FOUND", String.format(Locale.ENGLISH, "No address information found for supplied coordinates (latitude: %f, longitude: %f).", Double.valueOf(this.f103b), Double.valueOf(this.f104c)), null);
        } else {
            kVar.b(AbstractC0110a.W(list));
        }
    }
}
