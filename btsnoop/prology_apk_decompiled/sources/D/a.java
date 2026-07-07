package D;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f408a;

    /* renamed from: b, reason: collision with root package name */
    public final f f409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410c;

    public a(int i4, f fVar, int i5) {
        this.f408a = i4;
        this.f409b = fVar;
        this.f410c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f408a);
        this.f409b.f417a.performAction(this.f410c, bundle);
    }
}
