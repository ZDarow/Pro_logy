package C;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class G extends F {
    public G(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
    }

    @Override // C.K
    public O a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f282c.consumeDisplayCutout();
        return O.c(null, consumeDisplayCutout);
    }

    @Override // C.K
    public C0019f e() {
        DisplayCutout displayCutout;
        displayCutout = this.f282c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0019f(displayCutout);
    }

    @Override // C.E, C.K
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g4 = (G) obj;
        return Objects.equals(this.f282c, g4.f282c) && Objects.equals(this.f286g, g4.f286g) && E.y(this.f287h, g4.f287h);
    }

    @Override // C.K
    public int hashCode() {
        return this.f282c.hashCode();
    }
}
