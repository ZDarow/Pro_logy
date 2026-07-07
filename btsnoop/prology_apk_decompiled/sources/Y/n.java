package Y;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements e2.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3047l;

    @Override // e2.g
    public final boolean apply(Object obj) {
        switch (this.f3047l) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
