package d0;

import T.I;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u0.p;

/* loaded from: classes.dex */
public final class f implements p {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f4848l = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // u0.p
    public final Object p(Uri uri, Y.j jVar) {
        String readLine = new BufferedReader(new InputStreamReader(jVar, e2.d.f5436c)).readLine();
        try {
            Matcher matcher = f4848l.matcher(readLine);
            if (!matcher.matches()) {
                throw I.b("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j4 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j4;
            }
            return Long.valueOf(time);
        } catch (ParseException e4) {
            throw I.b(null, e4);
        }
    }
}
