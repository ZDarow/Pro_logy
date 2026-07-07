package t3;

import r3.InterfaceC0518e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f8440a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f8441b = w3.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f8442c = w3.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final e2.f f8443d = new e2.f("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final e2.f f8444e = new e2.f("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final e2.f f8445f = new e2.f("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final e2.f f8446g = new e2.f("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final e2.f f8447h = new e2.f("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final e2.f f8448i = new e2.f("DONE_RCV", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final e2.f f8449j = new e2.f("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final e2.f f8450k = new e2.f("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final e2.f f8451l = new e2.f("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final e2.f f8452m = new e2.f("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final e2.f f8453n = new e2.f("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final e2.f f8454o = new e2.f("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final e2.f f8455p = new e2.f("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final e2.f f8456q = new e2.f("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final e2.f f8457r = new e2.f("CLOSE_HANDLER_INVOKED", 1);
    public static final e2.f s = new e2.f("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0518e interfaceC0518e, Object obj, j3.l lVar) {
        e2.f n4 = interfaceC0518e.n(obj, lVar);
        if (n4 == null) {
            return false;
        }
        interfaceC0518e.o(n4);
        return true;
    }
}
