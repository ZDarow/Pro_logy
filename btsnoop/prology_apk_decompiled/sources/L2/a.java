package L2;

import I.C0044m;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1087c;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.f1085a = i4;
        this.f1087c = obj;
        this.f1086b = obj2;
    }

    @Override // L2.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f1085a) {
            case 0:
                C0044m c0044m = (C0044m) this.f1087c;
                try {
                    ((c) this.f1086b).e(((m) c0044m.f849n).a(byteBuffer));
                    return;
                } catch (RuntimeException e4) {
                    Log.e("BasicMessageChannel#" + ((String) c0044m.f848m), "Failed to handle message reply", e4);
                    return;
                }
            default:
                C0044m c0044m2 = (C0044m) this.f1087c;
                p pVar = (p) this.f1086b;
                try {
                    if (byteBuffer == null) {
                        pVar.c();
                    } else {
                        try {
                            pVar.b(((q) c0044m2.f849n).d(byteBuffer));
                        } catch (j e5) {
                            pVar.a(e5.f1090l, e5.getMessage(), e5.f1091m);
                        }
                    }
                    return;
                } catch (RuntimeException e6) {
                    Log.e("MethodChannel#" + ((String) c0044m2.f848m), "Failed to handle method call result", e6);
                    return;
                }
        }
    }
}
