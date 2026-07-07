package j;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6653a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6654b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f6655c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f6656d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f6657e;

    public g0(View view) {
        this.f6653a = (TextView) view.findViewById(R.id.text1);
        this.f6654b = (TextView) view.findViewById(R.id.text2);
        this.f6655c = (ImageView) view.findViewById(R.id.icon1);
        this.f6656d = (ImageView) view.findViewById(R.id.icon2);
        this.f6657e = (ImageView) view.findViewById(com.prology.R.id.edit_query);
    }
}
