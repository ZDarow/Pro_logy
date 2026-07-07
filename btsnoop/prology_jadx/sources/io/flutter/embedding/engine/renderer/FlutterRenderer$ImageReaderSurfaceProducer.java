package io.flutter.embedding.engine.renderer;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public final class FlutterRenderer$ImageReaderSurfaceProducer implements io.flutter.view.TextureRegistry$SurfaceProducer, io.flutter.view.TextureRegistry$ImageConsumer, io.flutter.view.InterfaceC1617n {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final java.lang.String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;

    /* renamed from: id */
    private final long f6438id;
    private boolean released;
    final /* synthetic */ io.flutter.embedding.engine.renderer.C1561j this$0;
    private boolean ignoringFence = VERBOSE_LOGS;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = VERBOSE_LOGS;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.ArrayDeque<io.flutter.embedding.engine.renderer.C1556e> imageReaderQueue = new java.util.ArrayDeque<>();
    private final java.util.HashMap<android.media.ImageReader, io.flutter.embedding.engine.renderer.C1556e> perImageReaders = new java.util.HashMap<>();
    private java.util.ArrayList<io.flutter.embedding.engine.renderer.C1554c> lastDequeuedImage = new java.util.ArrayList<>();
    private io.flutter.embedding.engine.renderer.C1556e lastReaderDequeuedFrom = null;
    io.flutter.view.InterfaceC1618o callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(io.flutter.embedding.engine.renderer.C1561j c1561j, long j4) {
        this.this$0 = c1561j;
        this.f6438id = j4;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (io.flutter.embedding.engine.renderer.C1556e c1556e : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == c1556e) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    c1556e.f6450c = true;
                    c1556e.f6448a.close();
                    c1556e.f6449b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    java.util.Iterator<io.flutter.embedding.engine.renderer.C1554c> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f6445a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                io.flutter.embedding.engine.renderer.C1556e c1556e2 = this.lastReaderDequeuedFrom;
                if (c1556e2 != null) {
                    c1556e2.f6450c = true;
                    c1556e2.f6448a.close();
                    c1556e2.f6449b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private android.media.ImageReader createImageReader29() {
        android.media.ImageReader newInstance;
        newInstance = android.media.ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        return newInstance;
    }

    private android.media.ImageReader createImageReader33() {
        android.media.ImageReader build;
        p008B1.AbstractC0024b.m87p();
        android.media.ImageReader.Builder m79h = p008B1.AbstractC0024b.m79h(this.requestedWidth, this.requestedHeight);
        m79h.setMaxImages(7);
        m79h.setImageFormat(34);
        m79h.setUsage(256L);
        build = m79h.build();
        return build;
    }

    private io.flutter.embedding.engine.renderer.C1556e getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    io.flutter.embedding.engine.renderer.C1556e peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.f6448a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = VERBOSE_LOGS;
                return getOrCreatePerImageReader(createImageReader());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private io.flutter.embedding.engine.renderer.C1556e getOrCreatePerImageReader(android.media.ImageReader imageReader) {
        io.flutter.embedding.engine.renderer.C1556e c1556e = this.perImageReaders.get(imageReader);
        if (c1556e != null) {
            return c1556e;
        }
        io.flutter.embedding.engine.renderer.C1556e createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f6478a.scheduleFrame();
    }

    private void maybeWaitOnFence(android.media.Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.m3449f(this);
        this.this$0.f6484g.remove(this);
    }

    private void waitOnFence(android.media.Image image) {
        android.hardware.SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public android.media.Image acquireLatestImage() {
        io.flutter.embedding.engine.renderer.C1554c dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        android.media.Image image = dequeueImage.f6445a;
        maybeWaitOnFence(image);
        return image;
    }

    public android.media.ImageReader createImageReader() {
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return createImageReader33();
        }
        if (i4 >= 29) {
            return createImageReader29();
        }
        throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public io.flutter.embedding.engine.renderer.C1556e createPerImageReader(android.media.ImageReader imageReader) {
        return new io.flutter.embedding.engine.renderer.C1556e(this, imageReader);
    }

    public double deltaMillis(long j4) {
        return j4 / 1000000.0d;
    }

    public io.flutter.embedding.engine.renderer.C1554c dequeueImage() {
        io.flutter.embedding.engine.renderer.C1554c c1554c;
        boolean z4;
        synchronized (this.lock) {
            try {
                java.util.Iterator<io.flutter.embedding.engine.renderer.C1556e> it = this.imageReaderQueue.iterator();
                c1554c = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z4 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    io.flutter.embedding.engine.renderer.C1556e next = it.next();
                    java.util.ArrayDeque arrayDeque = next.f6449b;
                    io.flutter.embedding.engine.renderer.C1554c c1554c2 = arrayDeque.isEmpty() ? null : (io.flutter.embedding.engine.renderer.C1554c) arrayDeque.removeFirst();
                    if (c1554c2 == null) {
                        c1554c = c1554c2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f6445a.close();
                        }
                        this.lastDequeuedImage.add(c1554c2);
                        this.lastReaderDequeuedFrom = next;
                        c1554c = c1554c2;
                    }
                }
                pruneImageReaderQueue();
                java.util.Iterator<io.flutter.embedding.engine.renderer.C1556e> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f6449b.isEmpty()) {
                        z4 = true;
                        break;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.this$0.f6482e.post(new io.flutter.embedding.engine.renderer.RunnableC1553b(this, 0));
        }
        return c1554c;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            io.flutter.embedding.engine.renderer.C1561j c1561j = this.this$0;
            c1561j.f6482e.post(new io.flutter.embedding.engine.renderer.RunnableC1559h(this.f6438id, c1561j.f6478a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public android.view.Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public android.view.Surface getSurface() {
        return getActiveReader().f6448a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    /* renamed from: id */
    public long mo3441id() {
        return this.f6438id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i4;
        synchronized (this.lock) {
            try {
                java.util.Iterator<io.flutter.embedding.engine.renderer.C1556e> it = this.imageReaderQueue.iterator();
                i4 = 0;
                while (it.hasNext()) {
                    i4 += it.next().f6449b.size();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    public int numTrims() {
        int i4;
        synchronized (this.lock) {
            i4 = this.numTrims;
        }
        return i4;
    }

    public void onImage(android.media.ImageReader imageReader, android.media.Image image) {
        io.flutter.embedding.engine.renderer.C1554c c1554c;
        synchronized (this.lock) {
            io.flutter.embedding.engine.renderer.C1556e orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f6450c) {
                c1554c = null;
            } else {
                io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f6451d;
                java.lang.System.nanoTime();
                io.flutter.embedding.engine.renderer.C1554c c1554c2 = new io.flutter.embedding.engine.renderer.C1554c(flutterRenderer$ImageReaderSurfaceProducer, image);
                java.util.ArrayDeque arrayDeque = orCreatePerImageReader.f6449b;
                arrayDeque.add(c1554c2);
                while (arrayDeque.size() > 2) {
                    ((io.flutter.embedding.engine.renderer.C1554c) arrayDeque.removeFirst()).f6445a.close();
                }
                c1554c = c1554c2;
            }
        }
        if (c1554c == null) {
            return;
        }
        this.this$0.f6478a.scheduleFrame();
    }

    @Override // io.flutter.view.InterfaceC1617n
    public void onTrimMemory(int i4) {
        if (i4 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        io.flutter.view.InterfaceC1618o interfaceC1618o = this.callback;
        if (interfaceC1618o != null) {
            this.notifiedDestroy = true;
            p085V2.C0780b c0780b = (p085V2.C0780b) interfaceC1618o;
            ((p102a0.C0944H) c0780b.f2540c).m1841N(null);
            c0780b.f2731d = true;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        io.flutter.embedding.engine.renderer.C1556e peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            java.util.ArrayDeque arrayDeque = peekFirst.f6449b;
            if (!arrayDeque.isEmpty() || peekFirst.f6451d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            java.util.HashMap<android.media.ImageReader, io.flutter.embedding.engine.renderer.C1556e> hashMap = this.perImageReaders;
            android.media.ImageReader imageReader = peekFirst.f6448a;
            hashMap.remove(imageReader);
            peekFirst.f6450c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.this$0;
        c1561j.f6478a.unregisterTexture(this.f6438id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f6478a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(io.flutter.view.InterfaceC1618o interfaceC1618o) {
        this.callback = interfaceC1618o;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i4, int i5) {
        int max = java.lang.Math.max(1, i4);
        int max2 = java.lang.Math.max(1, i5);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
