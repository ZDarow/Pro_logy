package e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5020b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5021c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5022d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5023e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5024f;

    public C0249a(long j4, int i4, ArrayList arrayList, List list, List list2, List list3) {
        this.f5019a = j4;
        this.f5020b = i4;
        this.f5021c = Collections.unmodifiableList(arrayList);
        this.f5022d = Collections.unmodifiableList(list);
        this.f5023e = Collections.unmodifiableList(list2);
        this.f5024f = Collections.unmodifiableList(list3);
    }
}
