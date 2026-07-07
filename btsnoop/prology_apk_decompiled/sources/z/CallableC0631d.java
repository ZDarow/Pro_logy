package z;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0631d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f9198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9200e;

    public /* synthetic */ CallableC0631d(String str, Context context, Object obj, int i4, int i5) {
        this.f9196a = i5;
        this.f9197b = str;
        this.f9198c = context;
        this.f9200e = obj;
        this.f9199d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9196a) {
            case 0:
                Object[] objArr = {(C0630c) this.f9200e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return AbstractC0634g.b(this.f9197b, this.f9198c, Collections.unmodifiableList(arrayList), this.f9199d);
            default:
                try {
                    return AbstractC0634g.b(this.f9197b, this.f9198c, (List) this.f9200e, this.f9199d);
                } catch (Throwable unused) {
                    return new C0633f(-3);
                }
        }
    }
}
