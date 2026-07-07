package p040K;

/* renamed from: K.c */
/* loaded from: classes.dex */
public class C0313c implements p035I.InterfaceC0274a {

    /* renamed from: a */
    public final p010B3.C0078i f937a;

    /* renamed from: b */
    public final p010B3.C0081l f938b;

    /* renamed from: c */
    public final p040K.C0311a f939c;

    public C0313c(p010B3.C0078i c0078i, p010B3.C0081l c0081l) {
        p154k3.AbstractC1803h.m3779e(c0078i, "fileSystem");
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        this.f937a = c0078i;
        this.f938b = c0081l;
        this.f939c = new p040K.C0311a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:19|20)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:48|(5:52|53|54|55|(1:57)(1:58))(2:50|51))|(2:35|36)|30|(2:32|33)(1:34)))|81|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0032, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c3, code lost:
    
        if (r8 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ca, code lost:
    
        p101a.AbstractC0936a.m1793c(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008f, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: FileNotFoundException -> 0x008f, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:32:0x0095, B:34:0x0099, B:47:0x008b, B:44:0x0086), top: B:7:0x0023, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: FileNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:32:0x0095, B:34:0x0099, B:47:0x008b, B:44:0x0086), top: B:7:0x0023, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [K.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [K.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v4, types: [K.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m712a(p040K.C0313c r8, p120d3.AbstractC1292b r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p040K.C0313c.m712a(K.c, d3.b):java.lang.Object");
    }

    @Override // p035I.InterfaceC0274a
    public final void close() {
        this.f939c.f931a.set(true);
    }
}
