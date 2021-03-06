package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GuideFilterRefine2 extends BaseFilter {
    public static final String FRAGMENT_SHADER = "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float width;\nuniform float height;\nvoid main() {\n   float step_x = 1.0 / width;\n   float step_y = 1.0 / height;\n   vec4 srcValue = vec4(0.0, 0.0, 0.0, 0.0);\n   vec2 fIdx = textureCoordinate;\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x - step_x, textureCoordinate.y - step_y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x, textureCoordinate.y - step_y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x + step_x, textureCoordinate.y - step_y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x - step_x, textureCoordinate.y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x + step_x, textureCoordinate.y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x - step_x, textureCoordinate.y + step_y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x, textureCoordinate.y + step_y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   fIdx = vec2(textureCoordinate.x + step_x, textureCoordinate.y + step_y);\n   srcValue += texture2D(inputImageTexture, fIdx);\n   gl_FragColor = srcValue / 9.0;\n}";

    public GuideFilterRefine2() {
        super(FRAGMENT_SHADER);
        AppMethodBeat.i(82583);
        initParams();
        AppMethodBeat.o(82583);
    }

    private void initParams() {
        AppMethodBeat.i(82584);
        addParam(new f("width", 0.0f));
        addParam(new f("height", 0.0f));
        AppMethodBeat.o(82584);
    }

    public void updateParams(int i, int i2) {
        AppMethodBeat.i(82585);
        addParam(new f("width", (float) i));
        addParam(new f("height", (float) i2));
        AppMethodBeat.o(82585);
    }
}
