package K2;

import I.C0044m;
import L2.v;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0044m f949a;

    public a(D2.b bVar, int i4) {
        switch (i4) {
            case 1:
                L1.g gVar = new L1.g(8, false);
                C0044m c0044m = new C0044m(bVar, "flutter/navigation", L2.l.f1093a, null);
                this.f949a = c0044m;
                c0044m.s(gVar);
                return;
            default:
                L1.g gVar2 = new L1.g(7, false);
                C0044m c0044m2 = new C0044m(bVar, "flutter/backgesture", v.f1099a, null);
                this.f949a = c0044m2;
                c0044m2.s(gVar2);
                return;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
