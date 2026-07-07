package io.flutter.embedding.engine.renderer;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class SurfaceTextureWrapper {
    private boolean attached;
    private boolean newFrameAvailable;
    private java.lang.Runnable onFrameConsumed;
    private boolean released;
    private android.graphics.SurfaceTexture surfaceTexture;

    public SurfaceTextureWrapper(android.graphics.SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    public void attachToGLContext(int i4) {
        synchronized (this) {
            try {
                if (this.released) {
                    return;
                }
                if (this.attached) {
                    this.surfaceTexture.detachFromGLContext();
                }
                this.surfaceTexture.attachToGLContext(i4);
                this.attached = true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void detachFromGLContext() {
        synchronized (this) {
            try {
                if (this.attached && !this.released) {
                    this.surfaceTexture.detachFromGLContext();
                    this.attached = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        this.surfaceTexture.getTransformMatrix(fArr);
    }

    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }

    public void release() {
        synchronized (this) {
            try {
                if (!this.released) {
                    this.surfaceTexture.release();
                    this.released = true;
                    this.attached = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public boolean shouldUpdate() {
        boolean z4;
        synchronized (this) {
            z4 = this.newFrameAvailable;
        }
        return z4;
    }

    public android.graphics.SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        synchronized (this) {
            try {
                this.newFrameAvailable = false;
                if (!this.released) {
                    this.surfaceTexture.updateTexImage();
                    java.lang.Runnable runnable = this.onFrameConsumed;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public SurfaceTextureWrapper(android.graphics.SurfaceTexture surfaceTexture, java.lang.Runnable runnable) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = runnable;
    }
}
