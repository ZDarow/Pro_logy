package e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5061a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5062b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5063c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5064d;

    public h(String str, long j4, ArrayList arrayList, List list) {
        this.f5061a = str;
        this.f5062b = j4;
        this.f5063c = Collections.unmodifiableList(arrayList);
        this.f5064d = Collections.unmodifiableList(list);
    }
}
