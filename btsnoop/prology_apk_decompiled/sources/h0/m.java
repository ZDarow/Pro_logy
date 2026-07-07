package h0;

import java.util.Collections;
import java.util.List;
import l0.InterfaceC0402a;

/* loaded from: classes.dex */
public abstract class m implements InterfaceC0402a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5932a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5933b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5934c;

    public m(String str, List list, boolean z4) {
        this.f5932a = str;
        this.f5933b = Collections.unmodifiableList(list);
        this.f5934c = z4;
    }
}
