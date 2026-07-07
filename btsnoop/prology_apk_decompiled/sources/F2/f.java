package F2;

import B2.AbstractC0007h;
import L1.g;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f643a;

    /* renamed from: b, reason: collision with root package name */
    public g f644b;

    /* renamed from: c, reason: collision with root package name */
    public long f645c;

    /* renamed from: d, reason: collision with root package name */
    public b f646d;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f647e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f648f;

    /* renamed from: g, reason: collision with root package name */
    public Future f649g;

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f646d.f633b);
        return AbstractC0007h.m(sb, File.separator, str);
    }
}
