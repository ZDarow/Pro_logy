package W;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public Message f2701a;

    public final void a() {
        this.f2701a = null;
        ArrayList arrayList = v.f2702b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f2701a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
