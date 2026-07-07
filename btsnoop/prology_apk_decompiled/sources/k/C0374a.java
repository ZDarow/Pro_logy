package k;

import java.util.concurrent.Executors;
import p1.AbstractC0462a;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374a extends AbstractC0462a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0374a f6923b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6924a;

    public C0374a(int i4) {
        switch (i4) {
            case 1:
                this.f6924a = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0375b());
                return;
            default:
                this.f6924a = new C0374a(1);
                return;
        }
    }
}
