package p009B2;

/* renamed from: B2.j */
/* loaded from: classes.dex */
public class C0053j extends android.view.View implements io.flutter.embedding.engine.renderer.InterfaceC1563l {

    /* renamed from: l */
    public android.media.ImageReader f167l;

    /* renamed from: m */
    public android.media.Image f168m;

    /* renamed from: n */
    public android.graphics.Bitmap f169n;

    /* renamed from: o */
    public io.flutter.embedding.engine.renderer.C1561j f170o;

    /* renamed from: p */
    public final int f171p;

    /* renamed from: q */
    public boolean f172q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053j(android.content.Context context, int i4, int i5, int i6) {
        super(context, null);
        android.media.ImageReader m192f = m192f(i4, i5);
        this.f172q = false;
        this.f167l = m192f;
        this.f171p = i6;
        setAlpha(0.0f);
    }

    /* renamed from: f */
    public static android.media.ImageReader m192f(int i4, int i5) {
        if (i4 <= 0) {
            java.util.Locale locale = java.util.Locale.US;
            android.util.Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i4 + ", set width=1");
            i4 = 1;
        }
        if (i5 <= 0) {
            java.util.Locale locale2 = java.util.Locale.US;
            android.util.Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i5 + ", set height=1");
            i5 = 1;
        }
        return android.os.Build.VERSION.SDK_INT >= 29 ? p009B2.AbstractC0052i.m170e(i4, i5) : android.media.ImageReader.newInstance(i4, i5, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: a */
    public final void mo193a() {
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: b */
    public final void mo194b(io.flutter.embedding.engine.renderer.C1561j c1561j) {
        if (p044L.AbstractC0352j.m781b(this.f171p) == 0) {
            android.view.Surface surface = this.f167l.getSurface();
            c1561j.f6480c = surface;
            c1561j.f6478a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f170o = c1561j;
        this.f172q = true;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: c */
    public final void mo195c() {
        if (this.f172q) {
            setAlpha(0.0f);
            m197e();
            this.f169n = null;
            android.media.Image image = this.f168m;
            if (image != null) {
                image.close();
                this.f168m = null;
            }
            invalidate();
            this.f172q = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    /* renamed from: d */
    public final void mo196d() {
    }

    /* renamed from: e */
    public final boolean m197e() {
        if (!this.f172q) {
            return false;
        }
        android.media.Image acquireLatestImage = this.f167l.acquireLatestImage();
        if (acquireLatestImage != null) {
            android.media.Image image = this.f168m;
            if (image != null) {
                image.close();
                this.f168m = null;
            }
            this.f168m = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    /* renamed from: g */
    public final void m198g(int i4, int i5) {
        if (this.f170o == null) {
            return;
        }
        if (i4 == this.f167l.getWidth() && i5 == this.f167l.getHeight()) {
            return;
        }
        android.media.Image image = this.f168m;
        if (image != null) {
            image.close();
            this.f168m = null;
        }
        this.f167l.close();
        this.f167l = m192f(i4, i5);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC1563l
    public io.flutter.embedding.engine.renderer.C1561j getAttachedRenderer() {
        return this.f170o;
    }

    public android.media.ImageReader getImageReader() {
        return this.f167l;
    }

    public android.view.Surface getSurface() {
        return this.f167l.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.hardware.HardwareBuffer hardwareBuffer;
        super.onDraw(canvas);
        android.media.Image image = this.f168m;
        if (image != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                this.f169n = p009B2.AbstractC0052i.m166a(hardwareBuffer, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                android.media.Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    android.media.Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f168m.getHeight();
                    android.graphics.Bitmap bitmap = this.f169n;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f169n.getHeight() != height) {
                        this.f169n = android.graphics.Bitmap.createBitmap(rowStride, height, android.graphics.Bitmap.Config.ARGB_8888);
                    }
                    java.nio.ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f169n.copyPixelsFromBuffer(buffer);
                }
            }
        }
        android.graphics.Bitmap bitmap2 = this.f169n;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (!(i4 == this.f167l.getWidth() && i5 == this.f167l.getHeight()) && this.f171p == 1 && this.f172q) {
            m198g(i4, i5);
            io.flutter.embedding.engine.renderer.C1561j c1561j = this.f170o;
            android.view.Surface surface = this.f167l.getSurface();
            c1561j.f6480c = surface;
            c1561j.f6478a.onSurfaceWindowChanged(surface);
        }
    }
}
