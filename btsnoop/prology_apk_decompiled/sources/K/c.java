package K;

import B3.l;
import I.InterfaceC0032a;

/* loaded from: classes.dex */
public class c implements InterfaceC0032a {

    /* renamed from: a, reason: collision with root package name */
    public final B3.i f902a;

    /* renamed from: b, reason: collision with root package name */
    public final l f903b;

    /* renamed from: c, reason: collision with root package name */
    public final a f904c;

    public c(B3.i iVar, l lVar) {
        k3.h.e(iVar, "fileSystem");
        k3.h.e(lVar, "path");
        this.f902a = iVar;
        this.f903b = lVar;
        this.f904c = new a();
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
    
        a.AbstractC0110a.c(r9, r8);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(K.c r8, d3.b r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.c.a(K.c, d3.b):java.lang.Object");
    }

    @Override // I.InterfaceC0032a
    public final void close() {
        this.f904c.f897a.set(true);
    }
}
