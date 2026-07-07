package A;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ void s(int i4, int i5, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i4, i5);
    }
}
