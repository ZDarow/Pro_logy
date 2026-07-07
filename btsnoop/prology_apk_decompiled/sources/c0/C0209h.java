package c0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209h extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f4608a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0210i f4610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209h(C0210i c0210i, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f4610c = c0210i;
        this.f4608a = contentResolver;
        this.f4609b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        C0210i c0210i = this.f4610c;
        c0210i.a(C0206e.b(c0210i.f4611a, c0210i.f4619i, c0210i.f4618h));
    }
}
