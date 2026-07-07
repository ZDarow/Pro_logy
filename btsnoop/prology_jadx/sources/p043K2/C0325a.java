package p043K2;

/* renamed from: K2.a */
/* loaded from: classes.dex */
public final class C0325a {

    /* renamed from: a */
    public final p035I.C0291m f988a;

    public C0325a(p018D2.C0176b c0176b, int i4) {
        switch (i4) {
            case 1:
                p046L1.C0363g c0363g = new p046L1.C0363g(8, false);
                p035I.C0291m c0291m = new p035I.C0291m(c0176b, "flutter/navigation", p047L2.C0382l.f1132a, null);
                this.f988a = c0291m;
                c0291m.m702s(c0363g);
                return;
            default:
                p046L1.C0363g c0363g2 = new p046L1.C0363g(7, false);
                p035I.C0291m c0291m2 = new p035I.C0291m(c0176b, "flutter/backgesture", p047L2.C0392v.f1138a, null);
                this.f988a = c0291m2;
                c0291m2.m702s(c0363g2);
                return;
        }
    }

    /* renamed from: a */
    public static java.util.HashMap m719a(android.window.BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        java.util.HashMap hashMap = new java.util.HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (java.lang.Float.isNaN(touchX) || java.lang.Float.isNaN(touchY)) ? null : java.util.Arrays.asList(java.lang.Float.valueOf(touchX), java.lang.Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", java.lang.Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", java.lang.Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
