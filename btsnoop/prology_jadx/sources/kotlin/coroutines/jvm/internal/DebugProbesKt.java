package kotlin.coroutines.jvm.internal;

/* compiled from: DebugProbes.kt */
@kotlin.Metadata(mv = {1, p044L.C0353k.BYTES_FIELD_NUMBER, 0}, k = p044L.C0353k.FLOAT_FIELD_NUMBER, xi = 48, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010��\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b��\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H��\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlinx-coroutines-integration-testing_debugAgentTest"})
/* loaded from: PROLOGY-140-5.0.55.apk:DebugProbesKt.bin */
public final class DebugProbesKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "completion");
        return kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(continuation);
    }

    public static final void probeCoroutineResumed(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "frame");
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(continuation);
    }

    public static final void probeCoroutineSuspended(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "frame");
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(continuation);
    }
}
