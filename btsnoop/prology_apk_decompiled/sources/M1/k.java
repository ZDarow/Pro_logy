package M1;

/* loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: l, reason: collision with root package name */
    public final L1.c f1170l;

    public k(L1.c cVar) {
        this.f1170l = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1170l));
    }
}
