package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.af;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p;
import com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact;
import com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument;
import com.tencent.mm.plugin.appbrand.jsapi.file.ae;
import com.tencent.mm.plugin.appbrand.jsapi.file.ag;
import com.tencent.mm.plugin.appbrand.jsapi.file.ah;
import com.tencent.mm.plugin.appbrand.jsapi.file.ai;
import com.tencent.mm.plugin.appbrand.jsapi.file.aj;
import com.tencent.mm.plugin.appbrand.jsapi.file.ak;
import com.tencent.mm.plugin.appbrand.jsapi.file.r;
import com.tencent.mm.plugin.appbrand.jsapi.k.aa;
import com.tencent.mm.plugin.appbrand.jsapi.k.ab;
import com.tencent.mm.plugin.appbrand.jsapi.k.ac;
import com.tencent.mm.plugin.appbrand.jsapi.k.ad;
import com.tencent.mm.plugin.appbrand.jsapi.k.g;
import com.tencent.mm.plugin.appbrand.jsapi.k.h;
import com.tencent.mm.plugin.appbrand.jsapi.k.j;
import com.tencent.mm.plugin.appbrand.jsapi.k.s;
import com.tencent.mm.plugin.appbrand.jsapi.k.t;
import com.tencent.mm.plugin.appbrand.jsapi.k.u;
import com.tencent.mm.plugin.appbrand.jsapi.k.v;
import com.tencent.mm.plugin.appbrand.jsapi.k.w;
import com.tencent.mm.plugin.appbrand.jsapi.k.x;
import com.tencent.mm.plugin.appbrand.jsapi.k.y;
import com.tencent.mm.plugin.appbrand.jsapi.k.z;
import com.tencent.mm.plugin.appbrand.jsapi.l.c;
import com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo;
import com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN;
import com.tencent.mm.plugin.appbrand.jsapi.media.d;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCETransparentUI;
import com.tencent.mm.plugin.appbrand.jsapi.q.e;
import com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton;
import com.tencent.mm.plugin.appbrand.jsapi.storage.a;
import com.tencent.mm.plugin.appbrand.jsapi.storage.b;
import com.tencent.mm.plugin.appbrand.jsapi.storage.f;
import com.tencent.mm.plugin.appbrand.jsapi.storage.i;
import com.tencent.mm.plugin.appbrand.jsapi.storage.k;
import com.tencent.mm.plugin.appbrand.jsapi.storage.l;
import com.tencent.mm.plugin.appbrand.jsapi.storage.n;
import com.tencent.mm.plugin.appbrand.jsapi.storage.o;
import com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class q {
    private final Map<String, m> hwk = new HashMap();
    private final Map<String, m> hwl = new HashMap();

    static {
        AppMethodBeat.i(130370);
        AppBrandVideoWrapper.aDc();
        AppBrandCameraView.aDc();
        bp.aCp();
        AppMethodBeat.o(130370);
    }

    private q() {
        AppMethodBeat.i(130362);
        AppMethodBeat.o(130362);
    }

    public static Map<String, m> aCh() {
        AppMethodBeat.i(130363);
        q qVar = new q();
        qVar.b(new a());
        qVar.b(new f());
        qVar.b(new n());
        qVar.b(new b());
        qVar.b(new i());
        qVar.b(new o());
        qVar.b(new JsApiLogin());
        qVar.b(new JsApiAuthorize());
        qVar.b(new JsApiOperateWXData());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.q());
        qVar.b(new h());
        qVar.b(new j());
        qVar.b(new g());
        qVar.b(new bf());
        qVar.b(new JsApiChooseImage());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.media.f());
        qVar.b(new d());
        qVar.b(new JsApiChooseVideo());
        qVar.b(new JsApiStartRecordVoice());
        qVar.b(new JsApiStopRecordVoice());
        qVar.b(new JsApiStartPlayVoice());
        qVar.b(new JsApiPausePlayVoice());
        qVar.b(new JsApiStopPlayVoice());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.e.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.e.j());
        qVar.b(new e());
        qVar.b(new JsApiGetMusicPlayerState());
        qVar.b(new JsApiOperateMusicPlayer());
        qVar.b(new JsApiScanCode());
        qVar.b(new ay());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.l.e());
        qVar.b(new at());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.o.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.l.i());
        qVar.b(new c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.f());
        qVar.b(new aa());
        qVar.b(new x());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.d());
        qVar.b(new w());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.b.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.game.e.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.o.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.o.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.o.f());
        qVar.b(new bk());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.d.g());
        qVar.b(new ao());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.d.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.p.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.p.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.p.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.p.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.p.e());
        qVar.b(new k());
        qVar.b(new l());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.b.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.b.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.n.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.n.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.n.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.n.a());
        qVar.b(new ai());
        qVar.b(new as());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.e.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.media.e());
        qVar.b(new JsApiRefreshSession());
        qVar.b(new ab());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.l.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.weishi.f());
        qVar.b(new aa());
        qVar.b(new au());
        qVar.b(new JsApiMakeVoIPCall());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.c());
        qVar.b(new JsApiSetClipboardDataWC());
        qVar.b(new m());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o());
        qVar.b(new p());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k());
        qVar.b(new JsApiLaunchMiniProgram());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.i());
        qVar.b(new JsApiChooseWeChatContact());
        qVar.b(new JsApiChooseMedia());
        qVar.b(new JsApiUploadEncryptedFileToCDN());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d());
        qVar.b(new az());
        qVar.b(new bm());
        qVar.b(new JsApiGetBackgroundAudioState());
        qVar.b(new JsApiSetBackgroundAudioStateWC());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.b());
        qVar.b(new ba());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.l.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.b());
        qVar.b(new JsApiOpenWeRunSetting());
        qVar.b(new JsApiUploadWeRunData());
        qVar.b(new ab());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.k());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.m());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.n());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.j());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.k());
        qVar.b(new JsApiShowUpdatableMessageSubscribeButton());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.c.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.c.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.c.d());
        qVar.b(new JsApiCheckIsSupportFaceDetect());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.video.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.live.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.media.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.media.h());
        qVar.b(new ap());
        qVar.b(new av());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.r.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.j());
        qVar.b(new ad());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.b.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.a());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.op_report.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.p());
        qVar.b(new ad());
        qVar.b(new bj());
        qVar.b(new s());
        qVar.b(new bl());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.o());
        qVar.b(new JsApiCheckIsSupportSoterAuthentication());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c());
        qVar.b(new af());
        qVar.b(new ae());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.j());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.l());
        qVar.b(new bn());
        qVar.b(new JsApiBatchGetContact());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.camera.l());
        qVar.b(new z());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.j());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.l());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.m());
        qVar.b(new JsApiNavigateBackApplication());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.e.e());
        qVar.b(new JsApiCheckBioEnrollment());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.a());
        qVar.b(new JsApiNavigateToDevMiniProgram());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.d(HCEService.class, HCETransparentUI.class));
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.b());
        qVar.b(new t());
        qVar.b(new v());
        qVar.b(new u());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.e());
        qVar.b(new y());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.r.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.r.a());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.r.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.r.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.l());
        qVar.b(new ac());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.f(com.tencent.mm.plugin.appbrand.jsapi.i.f.hRA, af.auy()));
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.k(af.auy()));
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.l.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.n());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.c());
        qVar.b(new ae());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.af());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.o());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.p());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.q());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.z());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.y());
        qVar.b(new ak());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.u());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.w());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ad());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.h());
        qVar.b(new ah());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.s());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.n());
        qVar.b(new JsApiOpenDocument());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.x());
        qVar.b(new aj());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.t());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.v());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ac());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.g());
        qVar.b(new ag());
        qVar.b(new r());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.m());
        qVar.b(new ai());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.k());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.l());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.aa());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ab());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.file.j());
        qVar.b(new JsApiGetLabInfo());
        qVar.b(new JsApiSetLabInfo());
        qVar.b(new JsApiUpdateApp());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.b.a());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.b.b());
        qVar.b(new ax());
        qVar.b(new bb());
        qVar.b(new bc());
        qVar.b(new bd());
        qVar.b(new be());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.q.b());
        qVar.b(new JsApiLaunchApplication());
        qVar.b(new JsApiLaunchApplicationDirectly());
        qVar.b(new JsApiAddNativeDownloadTask());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.l.d());
        qVar.b(new JsApiAddDownloadTask());
        qVar.b(new JsApiAddDownloadTaskStraight());
        qVar.b(new JsApiQueryDownloadTask());
        qVar.b(new JsApiInstallDownloadTask());
        qVar.b(new JsApiPauseDownloadTask());
        qVar.b(new JsApiResumeDownloadTask());
        qVar.b(new JsApiGetInstallState());
        qVar.b(new JsApiCancelDownloadTask());
        qVar.b(new JsApiWriteCommData());
        qVar.b(new ak());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.l());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.m());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.f.a());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.f.b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.h());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.p());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.u());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.l());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.j());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.k());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.m());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.i());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.t());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.g());
        qVar.aI(arrayList);
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.b());
        qVar.b(new JsApiOpenAdCanvas());
        qVar.b(new ag());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.profile.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.profile.a());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.profile.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.h.a());
        qVar.b(new am());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.j.a());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.j.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.j.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.m());
        qVar.b(new JsApiGetABTestConfig());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.i.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.k());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.h());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.d());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.j());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.video.f());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.video.j());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.video.i());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.video.g());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.b());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.e());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.d());
        qVar.b(new bg());
        qVar.b(new JsApiPrivateAddContact());
        qVar.b(new z());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.media.c());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.ae());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.k.r());
        qVar.b(new com.tencent.mm.plugin.appbrand.jsapi.share.e());
        qVar.b(new JsApiChooseMultiMedia());
        Map map = qVar.hwk;
        AppMethodBeat.o(130363);
        return map;
    }

    public static Map<String, m> aCi() {
        AppMethodBeat.i(130364);
        q qVar = new q();
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.profile.c());
        qVar.c(new aw());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.h());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.i());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.j());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.d.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.k.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.o.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.o.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.o.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.o.f());
        qVar.c(new bi());
        qVar.c(new bk());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.m.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.m.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.k.b());
        qVar.c(new ao());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.video.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.video.j());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.video.i());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.video.h());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.video.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.h());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.a());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.live.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.i());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.k());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.contact.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.contact.e());
        qVar.c(new JsApiPrivateAddContact());
        qVar.c(new bh());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.k.a());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.a.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.a.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.a.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.a.f());
        qVar.c(new bm());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.q.n());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.container.a());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.container.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.container.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.a.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.a.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.m.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.m.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.m.h());
        qVar.c(new bl());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.k());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.h());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.i());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.camera.j());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.camera.n());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.camera.m());
        qVar.c(new com.tencent.mm.plugin.appbrand.debugger.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.t.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.t.h());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.t.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.l());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.b.j());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.k.k());
        qVar.c(new bg());
        qVar.c(new z());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.j());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.g());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.o());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.q());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.v());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.b());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.e());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.s());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.d());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.r());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.n());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.c());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.f());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.i());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.g.t());
        qVar.aJ(arrayList);
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.r.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.r.a());
        qVar.c(new w());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.k.c());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.r.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.r.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.l.e());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.k.p());
        qVar.c(new com.tencent.mm.plugin.appbrand.weishi.f());
        qVar.c(new JsApiOperateWXData());
        qVar.c(new JsApiLogin());
        qVar.c(new JsApiAuthorize());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.q.f());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.q.k());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.q.h());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.q.l());
        qVar.c(new ac());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.j());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.m());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.e());
        qVar.c(new at());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.a.a.d());
        qVar.c(new com.tencent.mm.plugin.appbrand.jsapi.u.a.a.c());
        qVar.c(new JsApiShowImageOperateSheet());
        Map map = qVar.hwl;
        AppMethodBeat.o(130364);
        return map;
    }

    private void aI(List<m> list) {
        AppMethodBeat.i(130365);
        if (list.size() <= 0) {
            AppMethodBeat.o(130365);
            return;
        }
        for (m b : list) {
            b(b);
        }
        AppMethodBeat.o(130365);
    }

    private void b(m mVar) {
        AppMethodBeat.i(130366);
        if (mVar == null || bo.isNullOrNil(mVar.getName())) {
            AppMethodBeat.o(130366);
        } else if (((m) this.hwk.put(mVar.getName(), mVar)) != null) {
            IllegalAccessError illegalAccessError = new IllegalAccessError("Duplicated api instance " + d(mVar));
            AppMethodBeat.o(130366);
            throw illegalAccessError;
        } else {
            AppMethodBeat.o(130366);
        }
    }

    private void aJ(List<m> list) {
        AppMethodBeat.i(130367);
        if (list.size() <= 0) {
            AppMethodBeat.o(130367);
            return;
        }
        for (m c : list) {
            c(c);
        }
        AppMethodBeat.o(130367);
    }

    private void c(m mVar) {
        AppMethodBeat.i(130368);
        if (mVar == null || bo.isNullOrNil(mVar.getName())) {
            AppMethodBeat.o(130368);
        } else if (((m) this.hwl.put(mVar.getName(), mVar)) != null) {
            IllegalAccessError illegalAccessError = new IllegalAccessError("Duplicated api instance " + d(mVar));
            AppMethodBeat.o(130368);
            throw illegalAccessError;
        } else {
            AppMethodBeat.o(130368);
        }
    }

    private static String d(m mVar) {
        AppMethodBeat.i(130369);
        String format = String.format(Locale.US, "[%s->%s]", new Object[]{mVar.getName(), mVar.getClass().getSimpleName()});
        AppMethodBeat.o(130369);
        return format;
    }
}
