package androidx.profileinstaller;

import W.m;
import android.content.Context;
import i1.g;
import java.util.Collections;
import java.util.List;
import m1.InterfaceC0436b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0436b {
    @Override // m1.InterfaceC0436b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // m1.InterfaceC0436b
    public final Object b(Context context) {
        g.a(new m(8, this, context.getApplicationContext()));
        return new L1.g(21, false);
    }
}
