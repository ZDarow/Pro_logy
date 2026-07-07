package p009B2;

/* renamed from: B2.a */
/* loaded from: classes.dex */
public final class C0044a {

    /* renamed from: e */
    public static final android.graphics.Matrix f139e = new android.graphics.Matrix();

    /* renamed from: a */
    public final io.flutter.embedding.engine.renderer.C1561j f140a;

    /* renamed from: b */
    public final p008B1.C0026d f141b;

    /* renamed from: c */
    public final boolean f142c;

    /* renamed from: d */
    public final java.util.HashMap f143d = new java.util.HashMap();

    public C0044a(io.flutter.embedding.engine.renderer.C1561j c1561j, boolean z4) {
        this.f140a = c1561j;
        if (p008B1.C0026d.f96o == null) {
            p008B1.C0026d.f96o = new p008B1.C0026d(3);
        }
        this.f141b = p008B1.C0026d.f96o;
        this.f142c = z4;
    }

    /* renamed from: b */
    public static int m124b(int i4) {
        if (i4 == 0) {
            return 4;
        }
        if (i4 == 1) {
            return 6;
        }
        if (i4 == 5) {
            return 4;
        }
        if (i4 == 6) {
            return 6;
        }
        if (i4 == 2) {
            return 5;
        }
        if (i4 == 7) {
            return 3;
        }
        if (i4 == 3) {
            return 0;
        }
        return i4 == 8 ? 3 : -1;
    }

    /* renamed from: a */
    public final void m125a(android.view.MotionEvent motionEvent, int i4, int i5, int i6, android.graphics.Matrix matrix, java.nio.ByteBuffer byteBuffer, android.content.Context context) {
        long j4;
        int i7;
        int i8;
        long j5;
        int i9;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        android.view.InputDevice.MotionRange motionRange;
        if (i5 == -1) {
            return;
        }
        int i10 = 3;
        int pointerId = (motionEvent.getPointerId(i4) << 3) | (motionEvent.getToolType(i4) & 7);
        int toolType = motionEvent.getToolType(i4);
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType == 2) {
            i10 = 2;
        } else if (toolType == 3) {
            i10 = 1;
        } else if (toolType != 4) {
            i10 = 5;
        }
        float[] fArr = {motionEvent.getX(i4), motionEvent.getY(i4)};
        matrix.mapPoints(fArr);
        java.util.HashMap hashMap = this.f143d;
        if (i10 == 1) {
            j4 = motionEvent.getButtonState() & 31;
            if (j4 == 0 && motionEvent.getSource() == 8194 && i5 == 4) {
                hashMap.put(java.lang.Integer.valueOf(pointerId), fArr);
            }
        } else {
            j4 = i10 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(java.lang.Integer.valueOf(pointerId));
        if (containsKey) {
            i7 = i5 == 4 ? 7 : i5 == 5 ? 8 : (i5 == 6 || i5 == 0) ? 9 : -1;
            if (i7 == -1) {
                return;
            }
        } else {
            i7 = -1;
        }
        if (this.f142c) {
            p008B1.C0026d c0026d = this.f141b;
            c0026d.getClass();
            i8 = pointerId;
            j5 = p009B2.C0041L.f131b.incrementAndGet();
            ((android.util.LongSparseArray) c0026d.f99m).put(j5, android.view.MotionEvent.obtain(motionEvent));
            ((java.util.PriorityQueue) c0026d.f100n).add(java.lang.Long.valueOf(j5));
        } else {
            i8 = pointerId;
            j5 = 0;
        }
        int i11 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j5);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i7);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i5);
            byteBuffer.putLong(i10);
        }
        byteBuffer.putLong(i11);
        int i12 = i8;
        byteBuffer.putLong(i12);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(java.lang.Integer.valueOf(i12));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
            i9 = i10;
        } else {
            i9 = i10;
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j4);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i4));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d4 = 1.0d;
            d5 = 0.0d;
        } else {
            d5 = motionRange.getMin();
            d4 = motionRange.getMax();
        }
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(d4);
        int i13 = i9;
        if (i13 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i4));
            d6 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d6 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i4));
        byteBuffer.putDouble(motionEvent.getToolMajor(i4));
        byteBuffer.putDouble(motionEvent.getToolMinor(i4));
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i4));
        if (i13 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i4));
        } else {
            byteBuffer.putDouble(d6);
        }
        byteBuffer.putLong(i6);
        if (i11 == 1) {
            if (context != null) {
                d8 = android.view.ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                d9 = android.view.ViewConfiguration.get(context).getScaledVerticalScrollFactor();
            } else {
                d8 = 48.0d;
                d9 = 48.0d;
            }
            byteBuffer.putDouble(d8 * (-motionEvent.getAxisValue(10, i4)));
            byteBuffer.putDouble(d9 * (-motionEvent.getAxisValue(9, i4)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(java.lang.Integer.valueOf(i12));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d7 = 0.0d;
        } else {
            d7 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d7);
        byteBuffer.putLong(0L);
        if (containsKey && i7 == 9) {
            hashMap.remove(java.lang.Integer.valueOf(i12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r4 != 4) goto L26;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m126c(android.view.MotionEvent r16, android.graphics.Matrix r17) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0044a.m126c(android.view.MotionEvent, android.graphics.Matrix):void");
    }
}
