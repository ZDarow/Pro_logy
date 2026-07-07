package B2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: B2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0009j extends View implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: l, reason: collision with root package name */
    public ImageReader f164l;

    /* renamed from: m, reason: collision with root package name */
    public Image f165m;

    /* renamed from: n, reason: collision with root package name */
    public Bitmap f166n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f167o;

    /* renamed from: p, reason: collision with root package name */
    public final int f168p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f169q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(Context context, int i4, int i5, int i6) {
        super(context, null);
        ImageReader f4 = f(i4, i5);
        this.f169q = false;
        this.f164l = f4;
        this.f168p = i6;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i4, int i5) {
        if (i4 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i4 + ", set width=1");
            i4 = 1;
        }
        if (i5 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i5 + ", set height=1");
            i5 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? AbstractC0008i.e(i4, i5) : ImageReader.newInstance(i4, i5, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b(io.flutter.embedding.engine.renderer.j jVar) {
        if (L.j.b(this.f168p) == 0) {
            Surface surface = this.f164l.getSurface();
            jVar.f6247c = surface;
            jVar.f6245a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f167o = jVar;
        this.f169q = true;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f169q) {
            setAlpha(0.0f);
            e();
            this.f166n = null;
            Image image = this.f165m;
            if (image != null) {
                image.close();
                this.f165m = null;
            }
            invalidate();
            this.f169q = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
    }

    public final boolean e() {
        if (!this.f169q) {
            return false;
        }
        Image acquireLatestImage = this.f164l.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f165m;
            if (image != null) {
                image.close();
                this.f165m = null;
            }
            this.f165m = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i4, int i5) {
        if (this.f167o == null) {
            return;
        }
        if (i4 == this.f164l.getWidth() && i5 == this.f164l.getHeight()) {
            return;
        }
        Image image = this.f165m;
        if (image != null) {
            image.close();
            this.f165m = null;
        }
        this.f164l.close();
        this.f164l = f(i4, i5);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f167o;
    }

    public ImageReader getImageReader() {
        return this.f164l;
    }

    public Surface getSurface() {
        return this.f164l.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f165m;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                this.f166n = AbstractC0008i.a(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f165m.getHeight();
                    Bitmap bitmap = this.f166n;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f166n.getHeight() != height) {
                        this.f166n = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f166n.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f166n;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (!(i4 == this.f164l.getWidth() && i5 == this.f164l.getHeight()) && this.f168p == 1 && this.f169q) {
            g(i4, i5);
            io.flutter.embedding.engine.renderer.j jVar = this.f167o;
            Surface surface = this.f164l.getSurface();
            jVar.f6247c = surface;
            jVar.f6245a.onSurfaceWindowChanged(surface);
        }
    }
}
