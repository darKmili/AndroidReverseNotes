package com.tencent.p177mm.plugin.appbrand.jsapi.profile;

import android.content.Intent;
import com.google.android.gms.common.Scopes;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p842bp.C25985d;
import com.tencent.p177mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.C19247b;
import com.tencent.p177mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p177mm.plugin.appbrand.ipc.C26907a;
import com.tencent.p177mm.plugin.appbrand.jsapi.C10296a;
import com.tencent.p177mm.plugin.appbrand.jsapi.C2241c;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.sdk.platformtools.C5046bo;
import org.json.JSONObject;
import p000a.C0220l;
import p000a.p005f.p007b.C25052j;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, dWq = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JsApiOpenUserProfile;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandAsyncJsApi;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;", "()V", "invoke", "", "env", "data", "Lorg/json/JSONObject;", "callbackId", "", "Companion", "plugin-appbrand-integration_release"})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.b */
public final class C38371b extends C10296a<C2241c> {
    private static final int CTRL_INDEX = CTRL_INDEX;
    private static final String NAME = NAME;
    public static final C38370a hUK = new C38370a();

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, dWq = {"<anonymous>", "", "result", "Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileResult;", "kotlin.jvm.PlatformType", "onReceiveResult"})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.b$b */
    static final class C19471b<R extends ProcessResult> implements C19247b<ProfileResult> {
        final /* synthetic */ int hBE;
        final /* synthetic */ String hBP;
        final /* synthetic */ C2241c hUH;
        final /* synthetic */ String hUI;
        final /* synthetic */ C38371b hUL;

        C19471b(C38371b c38371b, C2241c c2241c, int i, String str, String str2) {
            this.hUL = c38371b;
            this.hUH = c2241c;
            this.hBE = i;
            this.hUI = str;
            this.hBP = str2;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo6053c(ProcessResult processResult) {
            int i = 1;
            AppMethodBeat.m2504i(134690);
            ProfileResult profileResult = (ProfileResult) processResult;
            C4990ab.m7417i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult resultCode:%d", Integer.valueOf(profileResult.bFZ));
            switch (profileResult.bFZ) {
                case 0:
                    this.hUH.mo6107M(this.hBE, this.hUL.mo73392AK("fail"));
                    AppMethodBeat.m2505o(134690);
                    return;
                case 1:
                    Intent intent = new Intent();
                    if (!C5046bo.isNullOrNil(this.hUI)) {
                        intent.putExtra("key_add_contact_report_info", this.hUI);
                    }
                    if ((profileResult.hUO & 1) == 0) {
                        i = 0;
                    }
                    if (i == 0) {
                        intent.putExtra("Contact_User", this.hBP);
                        C25985d.m41467b(this.hUH.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent);
                        this.hUH.mo6107M(this.hBE, this.hUL.mo73392AK("ok"));
                        AppMethodBeat.m2505o(134690);
                        return;
                    }
                    C4990ab.m7416i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult, fail:not user contact");
                    this.hUH.mo6107M(this.hBE, this.hUL.mo73392AK("fail:not user contact"));
                    AppMethodBeat.m2505o(134690);
                    return;
                case 2:
                    this.hUH.mo6107M(this.hBE, this.hUL.mo73392AK("cancel"));
                    AppMethodBeat.m2505o(134690);
                    return;
                default:
                    this.hUH.mo6107M(this.hBE, this.hUL.mo73392AK("fail"));
                    AppMethodBeat.m2505o(134690);
                    return;
            }
        }
    }

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, dWq = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/JsApiOpenUserProfile$Companion;", "", "()V", "CTRL_INDEX", "", "CTRL_INDEX$annotations", "getCTRL_INDEX", "()I", "NAME", "", "NAME$annotations", "getNAME", "()Ljava/lang/String;", "TAG", "plugin-appbrand-integration_release"})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.b$a */
    public static final class C38370a {
        private C38370a() {
        }

        public /* synthetic */ C38370a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo5994a(C2241c c2241c, JSONObject jSONObject, int i) {
        AppMethodBeat.m2504i(134691);
        C25052j.m39376p(c2241c, "env");
        C25052j.m39376p(jSONObject, "data");
        String optString = jSONObject.optString("username");
        int optInt = jSONObject.optInt("scene", 122);
        String optString2 = jSONObject.optString("profileReportInfo");
        if (C5046bo.isNullOrNil(optString)) {
            c2241c.mo6107M(i, mo73392AK("fail:invalid data"));
            AppMethodBeat.m2505o(134691);
            return;
        }
        ProfileRequest profileRequest = new ProfileRequest();
        profileRequest.username = optString;
        profileRequest.scene = optInt;
        C26907a.m42840a(c2241c.getContext(), profileRequest, new C19471b(this, c2241c, i, optString2, optString));
        AppMethodBeat.m2505o(134691);
    }

    static {
        AppMethodBeat.m2504i(134692);
        AppMethodBeat.m2505o(134692);
    }
}
