package p195t3;

/* renamed from: t3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2191d {

    /* renamed from: a */
    public static final p195t3.C2197j f8776a = new p195t3.C2197j(-1, null, null, 0);

    /* renamed from: b */
    public static final int f8777b = p209w3.AbstractC2339a.m4548k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c */
    public static final int f8778c = p209w3.AbstractC2339a.m4548k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d */
    public static final p124e2.C1358f f8779d = new p124e2.C1358f("BUFFERED", 1);

    /* renamed from: e */
    public static final p124e2.C1358f f8780e = new p124e2.C1358f("SHOULD_BUFFER", 1);

    /* renamed from: f */
    public static final p124e2.C1358f f8781f = new p124e2.C1358f("S_RESUMING_BY_RCV", 1);

    /* renamed from: g */
    public static final p124e2.C1358f f8782g = new p124e2.C1358f("RESUMING_BY_EB", 1);

    /* renamed from: h */
    public static final p124e2.C1358f f8783h = new p124e2.C1358f("POISONED", 1);

    /* renamed from: i */
    public static final p124e2.C1358f f8784i = new p124e2.C1358f("DONE_RCV", 1);

    /* renamed from: j */
    public static final p124e2.C1358f f8785j = new p124e2.C1358f("INTERRUPTED_SEND", 1);

    /* renamed from: k */
    public static final p124e2.C1358f f8786k = new p124e2.C1358f("INTERRUPTED_RCV", 1);

    /* renamed from: l */
    public static final p124e2.C1358f f8787l = new p124e2.C1358f("CHANNEL_CLOSED", 1);

    /* renamed from: m */
    public static final p124e2.C1358f f8788m = new p124e2.C1358f("SUSPEND", 1);

    /* renamed from: n */
    public static final p124e2.C1358f f8789n = new p124e2.C1358f("SUSPEND_NO_WAITER", 1);

    /* renamed from: o */
    public static final p124e2.C1358f f8790o = new p124e2.C1358f("FAILED", 1);

    /* renamed from: p */
    public static final p124e2.C1358f f8791p = new p124e2.C1358f("NO_RECEIVE_RESULT", 1);

    /* renamed from: q */
    public static final p124e2.C1358f f8792q = new p124e2.C1358f("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r */
    public static final p124e2.C1358f f8793r = new p124e2.C1358f("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s */
    public static final p124e2.C1358f f8794s = new p124e2.C1358f("NO_CLOSE_CAUSE", 1);

    /* renamed from: a */
    public static final boolean m4372a(p187r3.InterfaceC2106e interfaceC2106e, java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        p124e2.C1358f mo4218n = interfaceC2106e.mo4218n(obj, interfaceC1737l);
        if (mo4218n == null) {
            return false;
        }
        interfaceC2106e.mo4219o(mo4218n);
        return true;
    }
}
