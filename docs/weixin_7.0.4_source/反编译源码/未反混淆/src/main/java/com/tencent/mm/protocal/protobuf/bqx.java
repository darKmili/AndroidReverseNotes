package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bqx extends bsr {
    public int Scene;
    public SKBuiltinBuffer_t vLz;
    public String wTm;
    public String wTn;
    public String wmM;
    public long wmO;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(853);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.ai(2, this.wmO);
            if (this.wTm != null) {
                aVar.e(3, this.wTm);
            }
            if (this.wTn != null) {
                aVar.e(4, this.wTn);
            }
            if (this.wmM != null) {
                aVar.e(5, this.wmM);
            }
            if (this.vLz != null) {
                aVar.iy(6, this.vLz.computeSize());
                this.vLz.writeFields(aVar);
            }
            aVar.iz(7, this.Scene);
            AppMethodBeat.o(853);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.o(2, this.wmO);
            if (this.wTm != null) {
                ix += e.a.a.b.b.a.f(3, this.wTm);
            }
            if (this.wTn != null) {
                ix += e.a.a.b.b.a.f(4, this.wTn);
            }
            if (this.wmM != null) {
                ix += e.a.a.b.b.a.f(5, this.wmM);
            }
            if (this.vLz != null) {
                ix += e.a.a.a.ix(6, this.vLz.computeSize());
            }
            int bs = ix + e.a.a.b.b.a.bs(7, this.Scene);
            AppMethodBeat.o(853);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(853);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bqx bqx = (bqx) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bqx.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(853);
                    return 0;
                case 2:
                    bqx.wmO = aVar3.BTU.ve();
                    AppMethodBeat.o(853);
                    return 0;
                case 3:
                    bqx.wTm = aVar3.BTU.readString();
                    AppMethodBeat.o(853);
                    return 0;
                case 4:
                    bqx.wTn = aVar3.BTU.readString();
                    AppMethodBeat.o(853);
                    return 0;
                case 5:
                    bqx.wmM = aVar3.BTU.readString();
                    AppMethodBeat.o(853);
                    return 0;
                case 6:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bqx.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(853);
                    return 0;
                case 7:
                    bqx.Scene = aVar3.BTU.vd();
                    AppMethodBeat.o(853);
                    return 0;
                default:
                    AppMethodBeat.o(853);
                    return -1;
            }
        } else {
            AppMethodBeat.o(853);
            return -1;
        }
    }
}
